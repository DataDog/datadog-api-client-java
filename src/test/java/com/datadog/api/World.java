package com.datadog.api;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;

import io.cucumber.java.Scenario;

public class World {
    // Client information
    Class<?> clientClass;
    public Object client; // ApiClient

    // Specific API information
    Class<?> apiClass;
    public Object api;

    // Templating context
    public Map<String, Object> context;

    // Request information
    Class<?> requestClass;
    Method requestBuilder;
    Map<String, Object> requestParams;

    // Response information
    Class<?> responseClass;
    Object response; // ApiResponse<?>

    // Name control
    Scenario scenario;
    Clock clock;
    OffsetDateTime now;

    // Undo
    public List<Callable<?>> undo;

    public World() {
        context = new HashMap<>();
        undo = new ArrayList<>();
    }

    public String getVersion() {
        String[] parts = scenario.getUri().toString().split("/");
        // get version
        // src/test/resources/com/datadog/api/>>>v2<<</client/api/teams.feature
        return parts[parts.length - 4];
    }

    public void setupClient(String apiVersion) throws java.lang.reflect.InvocationTargetException,
            java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException,
            java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
        // import com.datadog.api.{{ apiVersion }}.client.ApiClient
        clientClass = Class.forName("com.datadog.api." + apiVersion + ".client.ApiClient");
        // client = new ApiClient()
        client = clientClass.getConstructor().newInstance();

        // client.setServerIndex(0);
        clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 0);

        // Set debugging based on env
        // client.setDebugging("true".equals(System.getenv("DEBUG")))
        clientClass.getMethod("setDebugging", boolean.class).invoke(client, "true".equals(System.getenv("DEBUG")));

        if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
            // Set proxy to the "mockServer" for recording
            if (!TestUtils.isIbmJdk()) {
                // ClientConfig config = (ClientConfig)
                // client.getHttpClient().getConfiguration()
                /*
                 * Client httpClient = (Client)
                 * clientClass.getMethod("getHttpClient").invoke(client); ClientConfig config =
                 * (ClientConfig) httpClient.getConfiguration();
                 *
                 * config.connectorProvider(new HttpUrlConnectorProvider()
                 * .connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
                 */
                clientClass.getMethod("setBasePath", String.class).invoke(client, RecorderSteps.getUrl());
                // client.setServerIndex(null)
                // clientClass.getMethod("setServerIndex", Integer.class).invoke(client, null);
                Field f = clientClass.getDeclaredField("serverIndex");
                f.setAccessible(true);
                f.set(client, null);
            }
        } else if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
            // Set base path to the mock server for replaying
            // client.setBasePath(...)
            clientClass.getMethod("setBasePath", String.class).invoke(client, RecorderSteps.getUrl());
            // client.setServerIndex(null)
            Field f = clientClass.getDeclaredField("serverIndex");
            f.setAccessible(true);
            f.set(client, null);
        }

        // client.addDefaultHeader("JAVA-TEST-NAME", name.getMethodName());
    }

    public void setupAPI(String apiVersion, String apiName)
            throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException,
            java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        // import com.datadog.api.{{ apiVersion }}.client.api.{{ apiName }}Api
        apiClass = Class.forName("com.datadog.api." + apiVersion + ".client.api." + apiName + "Api");
        // api = new {{ apiName }}Api(client)
        api = apiClass.getConstructor(clientClass).newInstance(client);
    }

    public void setUnstableOperationEnabled(String operationId) throws java.lang.reflect.InvocationTargetException,
            java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        // client.setUnstableOperationEnabled(operationId, true)
        clientClass.getMethod("setUnstableOperationEnabled", String.class, boolean.class).invoke(client, operationId,
                true);
    }

    public void configureApiKeys(Map<String, String> secrets)
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        // client.configureApiKeys(secrets)
        clientClass.getMethod("configureApiKeys", Map.class).invoke(client, secrets);
    }

    public void newRequest(String methodName) {
        requestParams = new HashMap<String, Object>();
        for (Method method : apiClass.getMethods()) {
            if (method.getName().equals(methodName)) {
                requestBuilder = method;
                requestClass = method.getReturnType();
                break;
            }
        }
    }

    public Callable<?> getRequestUndo() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException,
            java.net.URISyntaxException, java.io.IOException, java.lang.IllegalAccessException,
            java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
        String actionName = requestBuilder.getName();

        String apiVersion = getVersion();

        Undo undo = UndoAction.UndoAction().getUndo(apiVersion, actionName);

        if (!undo.undo.type.equals("unsafe")) {
            return null;
        }

        // find API service based on undo tag value
        Class<?> undoAPIClass = Class
                .forName("com.datadog.api." + apiVersion + ".client.api." + undo.getAPIName() + "Api");
        Object undoAPI = undoAPIClass.getConstructor(clientClass).newInstance(client);

        String undoOperationName = undo.getOperationName();
        Method undoOperation = null;
        for (Method method : undoAPIClass.getMethods()) {
            if (method.getName().equals(undoOperationName)) {
                undoOperation = method;
                break;
            }
        }

        // Enable unstable undo operation automatically
        if ((boolean) clientClass.getMethod("isUnstableOperation", String.class).invoke(client, undoOperationName)) {
            clientClass.getMethod("setUnstableOperationEnabled", String.class, boolean.class).invoke(client,
            undoOperationName, true);
        }

        Object request;
        if (undoOperation.getParameterCount() > 0) {
            request = undoOperation.invoke(undoAPI, new Object[undoOperation.getParameterCount()]);
        } else {
            request = undoOperation.invoke(undoAPI);
        }

        Class<?> undoClass = undoOperation.getReturnType();

        return () -> {
            Method dataMethod = responseClass.getMethod("getData");
            Object data = dataMethod.invoke(response);

            // Build request from undo parameters and response data
            Map<String, Object> requestParams = undo.undo.getRequestParameters(data);
            for (Field f : undoClass.getDeclaredFields()) {
                if (requestParams.containsKey(f.getName())) {
                    f.setAccessible(true);
                    f.set(request, requestParams.get(f.getName()));
                }
            }

            // Execute request
            undoClass.getMethod("executeWithHttpInfo").invoke(request);
            return null;
        };
    }

    public void sendRequest()
            throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
            java.lang.reflect.InvocationTargetException, com.fasterxml.jackson.core.JsonProcessingException,
            java.net.URISyntaxException, java.io.IOException, java.lang.InstantiationException {
        Object request;
        if (requestBuilder.getParameterCount() > 0) {
            Object[] parameters = new Object[requestBuilder.getParameterCount()];
            request = requestBuilder.invoke(api, parameters);
        } else {
            request = requestBuilder.invoke(api);
        }

        for (Field f : requestClass.getDeclaredFields()) {
            if (requestParams.containsKey(f.getName())) {
                f.setAccessible(true);
                f.set(request, requestParams.get(f.getName()));
            }
        }

        Method responseMethod = requestClass.getMethod("executeWithHttpInfo");
        responseClass = responseMethod.getReturnType();

        Callable<?> undoMethod = getRequestUndo();

        response = responseMethod.invoke(request);

        if (undoMethod != null) {
            undo.add(undoMethod);
        }
    }

    public <T> T fromJSON(Class<T> clazz, String data)
            throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
            java.lang.reflect.InvocationTargetException, com.fasterxml.jackson.core.JsonProcessingException {
        Method getJSON = clientClass.getMethod("getJSON");
        Object json = getJSON.invoke(client);
        Class<?> jsonClass = getJSON.getReturnType();
        ObjectMapper mapper = (ObjectMapper) jsonClass.getMethod("getMapper").invoke(json);
        return mapper.readValue(data, clazz);
    }

    public String getName() {
        return Pattern.compile("[^A-Za-z0-9]+").matcher(scenario.getName()).replaceAll("_");
    }

    public String getUniqueEntityName() {
        // NOTE: some endpoints have limits on certain fields (e.g. Roles V2 names can
        // only be 55 chars long),
        // so we need to keep this short

        String result = String.format("java-%s-%d", getName().substring(0, 20), now.toEpochSecond());
        // In case this is used in URL, make sure we replace potential slash
        return result;
    }

    public String getUniqueEntityName(int maxLen) {
        String result = getUniqueEntityName();
        if (result.length() > maxLen) {
            result = result.substring(0, maxLen);
        }
        return result;
    }
}
