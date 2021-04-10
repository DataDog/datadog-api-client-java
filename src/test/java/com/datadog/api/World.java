package com.datadog.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Scenario;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ws.rs.client.Client;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;

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

  public void setupClient(String apiVersion)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
    // import com.datadog.api.{{ apiVersion }}.client.ApiClient
    clientClass = Class.forName("com.datadog.api." + apiVersion + ".client.ApiClient");
    // client = new ApiClient()
    client = clientClass.getConstructor().newInstance();

    // client.setServerIndex(0);
    clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 0);

    // Set debugging based on env
    // client.setDebugging("true".equals(System.getenv("DEBUG")))
    clientClass
        .getMethod("setDebugging", boolean.class)
        .invoke(client, "true".equals(System.getenv("DEBUG")));

    TestUtils.APITest.trustProxyCertsStatic();

    String site = System.getenv("DD_TEST_SITE");
    if (site != null) {
      HashMap<String, String> serverVariables = new HashMap<String, String>();
      serverVariables.put("site", site);

      clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 2);
      clientClass.getMethod("setServerVariables", Map.class).invoke(client, serverVariables);
    } else {
      clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 0);
    }

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
      // Set proxy to the "mockServer" for recording
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
      ClientConfig config =
          (ClientConfig)
              ((Client) clientClass.getMethod("getHttpClient").invoke(client)).getConfiguration();
      config.connectorProvider(
          new HttpUrlConnectorProvider()
              .connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
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
    clientClass
        .getMethod("addDefaultHeader", String.class, String.class)
        .invoke(client, "JAVA-TEST-NAME", getName());
  }

  public void setupAPI(String apiVersion, String apiName)
      throws java.lang.ClassNotFoundException, java.lang.InstantiationException,
          java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    // import com.datadog.api.{{ apiVersion }}.client.api.{{ apiName }}Api
    apiClass = Class.forName("com.datadog.api." + apiVersion + ".client.api." + apiName + "Api");
    // api = new {{ apiName }}Api(client)
    api = apiClass.getConstructor(clientClass).newInstance(client);
  }

  public void setUnstableOperationEnabled(String operationId)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException {
    // client.setUnstableOperationEnabled(operationId, true)
    clientClass
        .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
        .invoke(client, operationId, true);
  }

  public void configureApiKeys(Map<String, String> secrets)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
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

  public void given(String apiVersion, Given step) throws Exception {
    // find API service based on step tag value
    Class<?> givenAPIClass =
        Class.forName("com.datadog.api." + apiVersion + ".client.api." + step.getAPIName() + "Api");
    Object givenAPI = givenAPIClass.getConstructor(clientClass).newInstance(client);

    String givenOperationName = step.getOperationName();
    Method givenOperation = null;
    for (Method method : givenAPIClass.getMethods()) {
      if (method.getName().equals(givenOperationName)) {
        givenOperation = method;
        break;
      }
    }

    // Enable unstable operation automatically
    if ((boolean)
        clientClass
            .getMethod("isUnstableOperation", String.class)
            .invoke(client, givenOperationName)) {
      clientClass
          .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
          .invoke(client, givenOperationName, true);
    }

    Object request;
    if (givenOperation.getParameterCount() > 0) {
      request = givenOperation.invoke(givenAPI, new Object[givenOperation.getParameterCount()]);
    } else {
      request = givenOperation.invoke(givenAPI);
    }

    Class<?> givenClass = givenOperation.getReturnType();

    // Build request from undo parameters and response data
    Map<String, Given.Parameter> givenParams = step.getRequestParameters();
    for (Field f : givenClass.getDeclaredFields()) {
      if (givenParams.containsKey(f.getName())) {
        f.setAccessible(true);
        f.set(
            request, givenParams.get(f.getName()).resolve(f.getType(), context, getObjectMapper()));
      }
    }

    Undo undoSettings = UndoAction.UndoAction().getUndo(apiVersion, step.getOperationName());

    // Execute request
    Method givenExecute = givenClass.getMethod("executeWithHttpInfo");
    Class<?> givenResponseClass = givenExecute.getReturnType();
    Object givenResponse = givenExecute.invoke(request);
    Method dataMethod = givenResponseClass.getMethod("getData");
    Object data = dataMethod.invoke(givenResponse);

    if (undoSettings != null) {
      undo.add(getRequestUndo(apiVersion, undoSettings, data));
    }

    if (step.source != null) {
      data = World.lookup(data, step.source);
    }

    context.put(step.key, data);
  }

  public Callable<?> getRequestUndo(String apiVersion, Undo undoSettings, Object data)
      throws Exception {
    // find API service based on undo tag value
    Class<?> undoAPIClass =
        Class.forName(
            "com.datadog.api." + apiVersion + ".client.api." + undoSettings.getAPIName() + "Api");
    Object undoAPI = undoAPIClass.getConstructor(clientClass).newInstance(client);

    String undoOperationName = undoSettings.getOperationName();
    Method undoOperation = null;
    for (Method method : undoAPIClass.getMethods()) {
      if (method.getName().equals(undoOperationName)) {
        undoOperation = method;
        break;
      }
    }

    // Enable unstable undo operation automatically
    if ((boolean)
        clientClass
            .getMethod("isUnstableOperation", String.class)
            .invoke(client, undoOperationName)) {
      clientClass
          .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
          .invoke(client, undoOperationName, true);
    }

    Object undoRequest;
    if (undoOperation.getParameterCount() > 0) {
      try {
        undoRequest = undoOperation.invoke(undoAPI, new Object[undoOperation.getParameterCount()]);
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
    } else {
      try {
        undoRequest = undoOperation.invoke(undoAPI);
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
    }

    Class<?> undoClass = undoOperation.getReturnType();

    return () -> {
      // Build request from undo parameters and response data
      Map<String, Object> undoRequestParams = undoSettings.undo.getRequestParameters(data);
      for (Field f : undoClass.getDeclaredFields()) {
        if (undoRequestParams.containsKey(f.getName())) {
          f.setAccessible(true);
          f.set(undoRequest, undoRequestParams.get(f.getName()));
        }
      }

      // Execute request
      try {
        undoClass.getMethod("executeWithHttpInfo").invoke(undoRequest);
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
      return null;
    };
  }

  public void sendRequest() throws Exception {
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

    String apiVersion = getVersion();
    Class<?> exceptionClass =
        Class.forName("com.datadog.api." + apiVersion + ".client.ApiException");

    Undo undoSettings = UndoAction.UndoAction().getUndo(apiVersion, requestBuilder.getName());

    try {
      response = responseMethod.invoke(request);
    } catch (Exception e) {
      // Return a new response object with the response code set
      // so we can make assertions on it
      int responseCode = (int) exceptionClass.getMethod("getCode").invoke(e.getCause());
      for (Constructor<?> c : responseClass.getConstructors()) {
        if (c.getParameterCount() == 2) {
          response = c.newInstance(responseCode, new HashMap<String, String>());
        }
      }
    }

    if (undoSettings != null) {
      Method dataMethod = responseClass.getMethod("getData");
      Object data;
      try {
        data = dataMethod.invoke(response);
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
      undo.add(getRequestUndo(apiVersion, undoSettings, data));
    }
  }

  public ObjectMapper getObjectMapper()
      throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    Method getJSON = clientClass.getMethod("getJSON");
    Object json = getJSON.invoke(client);
    Class<?> jsonClass = getJSON.getReturnType();
    return (ObjectMapper) jsonClass.getMethod("getMapper").invoke(json);
  }

  public static <T> T fromJSON(ObjectMapper mapper, Class<T> clazz, String data)
      throws com.fasterxml.jackson.core.JsonProcessingException {
    return mapper.readValue(data, clazz);
  }

  public String getName() {
    return Pattern.compile("[^A-Za-z0-9]+").matcher(scenario.getName()).replaceAll("_");
  }

  public String getUniqueEntityName() {
    String prefix = TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE) ? "Test-Java" : "Test";
    String result = String.format("%s-%s-%d", prefix, getName(), now.toEpochSecond());
    return result;
  }

  /*
   * Lookup value from generic data object based on given path.
   *
   * Path contains attributes names or map keys separated by dots or list indices
   * in square brackets.
   *
   * Example: "foo.bar[1].baz" can be read as data.getFoo().getBar()[1]["baz"]
   */
  public static Object lookup(Object data, String path)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    Object result = data;
    for (String dotPart : Arrays.asList(path.split("\\."))) {
      for (String part : Arrays.asList(dotPart.split("\\["))) {
        if (part.indexOf("]") != -1) {
          Integer index = Integer.parseInt(part.replaceAll("]", ""));
          result = List.class.cast(result).get(index);
        } else {
          try {
            result = HashMap.class.cast(result).get(part);
          } catch (Exception e) {
            try {
              result = getPropertyValue(result, toPropertyName(part));
            } catch (java.lang.NoSuchFieldException ee) {
              // try to handle oneOf models
              try {
                result = result.getClass().getMethod("getActualInstance").invoke(result);
              } catch (java.lang.reflect.InvocationTargetException eee) {
                throw ee;
              } catch (java.lang.NoSuchMethodException eee) {
                throw ee;
              }
              result = getPropertyValue(result, toPropertyName(part));
            }
          }
        }
      }
    }
    return result;
  }

  /*
   * Replaces content in double curly brackets by lookuped values in context
   * object.
   *
   * Example: "Hello {{ foo.bar[1].baz }}" can be read as
   * String.format("Hello %s", lookup(context, "foo.bar[1].baz").toString())
   */
  public static String templated(String source, Object context)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    return replace(
        source,
        Pattern.compile("\\{\\{ ?([^ }]+) ?\\}\\}"),
        m -> {
          try {
            return lookup(context, m.group(1)).toString();
          } catch (Exception e) {
            return null;
          }
        });
  }

  /*
   * Convert an identifier to property name.
   */
  public static String toPropertyName(String identifier) {
    identifier =
        replace(
            identifier,
            Pattern.compile("_(.)"),
            m -> {
              return m.group(1).toUpperCase();
            });
    return replace(
        identifier,
        Pattern.compile("\\[(.)([^]]*)\\]"),
        m -> {
          return m.group(1).toUpperCase() + m.group(2);
        });
  }

  /*
   * Replace all occurrences of pattern with a result of replacer function.
   */
  public static String replace(String input, Pattern regex, Function<Matcher, String> replacer) {
    // return regex.matcher(input).replaceAll(replacer) in Java 9+
    StringBuffer result = new StringBuffer();
    Matcher m = regex.matcher(input);
    while (m.find()) {
      m.appendReplacement(result, replacer.apply(m));
    }
    m.appendTail(result);

    return result.toString();
  }

  /*
   * Convert an identifier to class name.
   */
  public static String toClassName(String identifier) {
    return replace(
        identifier,
        Pattern.compile("([A-Z])([A-Z]+)([A-Z][a-z])"),
        m -> {
          return m.group(1) + m.group(2).toLowerCase() + m.group(3);
        });
  }

  /*
   * Convert an identifier to method name.
   */
  public static String toMethodName(String identifier) {
    return replace(
        identifier,
        Pattern.compile("^([A-Z])"),
        m -> {
          return m.group(1).toLowerCase();
        });
  }

  @SuppressWarnings("unchecked")
  private static <T> T getPropertyValue(Object obj, String field)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    Class<?> clazz = obj.getClass();
    Field f = clazz.getDeclaredField(field);
    f.setAccessible(true);
    Object ret = f.get(obj);
    return (T) ret;
  }
}
