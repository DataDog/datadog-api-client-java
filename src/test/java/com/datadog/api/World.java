package com.datadog.api;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Scenario;
import jakarta.ws.rs.client.Client;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.openapitools.jackson.nullable.JsonNullable;

public class World {
  // Client information
  Class<?> clientClass;
  public Object client; // ApiClient
  Client httpClient = null;

  // Specific API information
  Class<?> apiClass;
  public Object api;

  // Templating context
  public Map<String, Object> context;

  // Path parameters for undo operations
  public Map<String, Object> pathParameters;

  // Request information
  Class<?> requestParametersClass;
  Object requestParameters;
  Method requestBuilder;
  String methodName;
  List<Object> parametersArray;

  // Response information
  Class<?> responseClass;
  Object response; // ApiResponse<?>
  ArrayList<Object> paginatedItems;

  // Name control
  Scenario scenario;
  Clock clock;
  OffsetDateTime now;

  // Undo
  public List<Callable<?>> undo;

  int sleepAfterRequestInterval;
  String recordMode;

  public static Map<String, BiFunction<Object, String, String>> templateFunctions =
      new HashMap<String, BiFunction<Object, String, String>>() {
        {
          put("timeISO", relativeTime(true));
          put("timestamp", relativeTime(false));
        }
      };

  public static BiFunction<Object, String, String> relativeTime(boolean iso) {
    final Pattern timeRE = Pattern.compile("now( *([+-]) *(\\d+)([smhdMy]))?");
    return (context, arg) -> {
      OffsetDateTime ret = (OffsetDateTime) ((Map<String, Object>) context).get("now");
      Matcher m = timeRE.matcher(arg);
      if (m.find()) {
        if (m.group(1) != null) {
          int num = Integer.parseInt(m.group(2) + m.group(3));
          String unit = m.group(4);
          switch (unit) {
            case "s":
              ret = ret.plusSeconds(num);
              break;
            case "m":
              ret = ret.plusMinutes(num);
              break;
            case "h":
              ret = ret.plusHours(num);
              break;
            case "d":
              ret = ret.plusDays(num);
              break;
            case "M":
              ret = ret.plusMonths(num);
              break;
            case "y":
              ret = ret.plusYears(num);
              break;
          }
        }
        if (iso) return ret.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        return String.valueOf(ret.toEpochSecond());
      }
      return null;
    };
  }

  public World() {
    context = new HashMap<>();
    pathParameters = new HashMap<>();
    undo = new ArrayList<>();
    sleepAfterRequestInterval =
        System.getenv("SLEEP_AFTER_REQUEST") != null
            ? Integer.parseInt(System.getenv("SLEEP_AFTER_REQUEST"))
            : 0;
    recordMode = System.getenv("RECORD") != null ? System.getenv("RECORD") : "false";
  }

  public void sleepAfterRequest() {
    if (recordMode == "false" || sleepAfterRequestInterval <= 0) return;
    try {
      Thread.sleep(sleepAfterRequestInterval * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public String getVersion() {
    String[] parts = scenario.getUri().toString().split("/");
    // get version
    // src/test/resources/com/datadog/api/>>>v2<<</client/api/teams.feature
    return parts[parts.length - 3];
  }

  private void configureClient(Class<?> clientClass, Object client)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    // client.setServerIndex(0);
    clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 0);

    // Enable retry
    clientClass.getMethod("enableRetry", boolean.class).invoke(client, true);

    // Set debugging based on env
    // client.setDebugging("true".equals(System.getenv("DEBUG")))
    clientClass
        .getMethod("setDebugging", boolean.class)
        .invoke(client, "true".equals(System.getenv("DEBUG")));

    String site = System.getenv("DD_TEST_SITE");
    if (site != null) {
      HashMap<String, String> serverVariables = new HashMap<>();
      serverVariables.put("site", site);

      clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 2);
      clientClass.getMethod("setServerVariables", Map.class).invoke(client, serverVariables);
    } else {
      clientClass.getMethod("setServerIndex", Integer.class).invoke(client, 0);
    }

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
      TestUtils.APITest.trustProxyCertsStatic();
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
      if (httpClient == null) {
        httpClient = new TestClient(getName(), "/features/" + getVersion(), getObjectMapper());
      }
      clientClass.getMethod("setHttpClient", Client.class).invoke(client, httpClient);
    } else if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      ClientConfig config =
          (ClientConfig)
              ((Client) clientClass.getMethod("getHttpClient").invoke(client)).getConfiguration();
      config.connectorProvider(new ApacheConnectorProvider());
    }
  }

  public void setupClient(String apiVersion)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    // import com.datadog.api.client.ApiClient
    clientClass = Class.forName("com.datadog.api.client.ApiClient");
    // client = new ApiClient()
    client = clientClass.getConstructor().newInstance();
    configureClient(clientClass, client);
  }

  public void setupAPI(String apiVersion, String apiName)
      throws java.lang.ClassNotFoundException,
          java.lang.InstantiationException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    // import com.datadog.api.{{ apiVersion }}.client.api.{{ apiName }}Api
    apiClass = Class.forName("com.datadog.api.client." + apiVersion + ".api." + apiName + "Api");
    // api = new {{ apiName }}Api(client)
    api = apiClass.getConstructor(clientClass).newInstance(client);
  }

  public void setUnstableOperationEnabled(String operationId)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException {
    // client.setUnstableOperationEnabled(operationId, true)
    clientClass
        .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
        .invoke(client, operationId, true);
  }

  public void configureApiKeys(Map<String, String> secrets)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException {
    // client.configureApiKeys(secrets)
    clientClass.getMethod("configureApiKeys", Map.class).invoke(client, secrets);
  }

  public void authenticateClient(Class<?> clientClass, Object client)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException {

    HashMap<String, String> secrets = new HashMap<String, String>();
    secrets.put("apiKeyAuth", System.getenv("DD_TEST_CLIENT_API_KEY"));
    secrets.put("appKeyAuth", System.getenv("DD_TEST_CLIENT_APP_KEY"));
    clientClass.getMethod("configureApiKeys", Map.class).invoke(client, secrets);
  }

  public void newRequest(String name) {
    methodName = toMethodName(name);
    for (Method method : apiClass.getMethods()) {
      if (method.getName().equals(methodName + "WithHttpInfo")) {
        requestBuilder = method;
        break;
      }
    }
    for (Class c : apiClass.getClasses()) {
      if (c.getName().endsWith(name + "OptionalParameters")) {
        requestParametersClass = c;
        try {
          requestParameters = c.getConstructor().newInstance();
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
        break;
      }
    }
    parametersArray = new ArrayList<>();
    pathParameters = new HashMap<>(); // Clear path parameters for new request
  }

  public void addRequestParameter(String parameterName, String value)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          com.fasterxml.jackson.core.JsonProcessingException {
    String propertyName = toPropertyName(parameterName);
    Class fieldType = null;
    boolean isOptional = false;
    if (requestParametersClass != null) {
      try {
        Field field = requestParametersClass.getDeclaredField(propertyName);
        fieldType = field.getType();
        isOptional = true;
      } catch (NoSuchFieldException ignored) {
      }
    }
    if (fieldType == null) {
      Class<?>[] types = requestBuilder.getParameterTypes();
      fieldType = types[parametersArray.size()];
    }
    if (fieldType == null) {
      throw new RuntimeException(
          propertyName
              + " "
              + requestParametersClass
              + " "
              + requestBuilder.getParameterTypes().length);
    }

    Object data = fromJSON(getObjectMapper(), fieldType, templated(value, context));

    // Store path parameter for undo operations
    pathParameters.put(parameterName, data);
    pathParameters.put(propertyName, data);

    if (isOptional) {
      if (fieldType == File.class) {
        String apiVersion = getVersion();
        String filePath =
            "src/test/resources/com/datadog/api/client/" + apiVersion + "/api/" + data.toString();
        requestParametersClass
            .getMethod(propertyName, fieldType)
            .invoke(requestParameters, new File(filePath));
      } else {
        requestParametersClass.getMethod(propertyName, fieldType).invoke(requestParameters, data);
      }
    } else {
      parametersArray.add(data);
    }
  }

  public void addRequestParameterFixture(String parameterName, String fixturePath)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    String propertyName = toPropertyName(parameterName);
    Class fieldType = null;
    boolean isOptional = false;
    if (requestParametersClass != null) {
      try {
        Field field = requestParametersClass.getDeclaredField(propertyName);
        fieldType = field.getType();
        isOptional = true;
      } catch (NoSuchFieldException ignored) {
      }
    }
    if (fieldType == null) {
      Class<?>[] types = requestBuilder.getParameterTypes();
      fieldType = types[parametersArray.size()];
    }
    if (fieldType == null) {
      throw new RuntimeException(
          propertyName
              + " "
              + requestParametersClass
              + " "
              + requestBuilder.getParameterTypes().length);
    }

    Object data = lookup(context, fixturePath);

    // Store path parameter for undo operations
    pathParameters.put(parameterName, data);
    pathParameters.put(propertyName, data);

    if (isOptional) {
      requestParametersClass.getMethod(propertyName, fieldType).invoke(requestParameters, data);
    } else {
      parametersArray.add(data);
    }
  }

  public void given(String apiVersion, Given step) throws Exception {
    // find API service based on step tag value
    Class<?> givenAPIClass =
        Class.forName(
            "com.datadog.api.client."
                + apiVersion
                + ".api."
                + toClassName(step.getAPIName() + "Api"));
    // import com.datadog.api.{{ apiVersion }}.client.ApiClient
    Class<?> apiClientClass = Class.forName("com.datadog.api.client.ApiClient");
    Object clientAPI = apiClientClass.getConstructor().newInstance();
    configureClient(apiClientClass, clientAPI);
    authenticateClient(apiClientClass, clientAPI);

    Object givenAPI = givenAPIClass.getConstructor(apiClientClass).newInstance(clientAPI);

    String givenOperationName = step.getOperationName();
    Method givenOperation = null;
    for (Method method : givenAPIClass.getMethods()) {
      if (method.getName().equals(givenOperationName + "WithHttpInfo")) {
        givenOperation = method;
        break;
      }
    }

    // Enable unstable operation automatically
    if ((boolean)
        apiClientClass
            .getMethod("isUnstableOperation", String.class)
            .invoke(clientAPI, apiVersion + "." + givenOperationName)) {
      apiClientClass
          .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
          .invoke(clientAPI, apiVersion + "." + givenOperationName, true);
    }

    Class<?> givenParametersClass = null;
    Object parameters = null;
    for (Class c : givenAPIClass.getClasses()) {
      if (c.getName().endsWith(step.operationId + "OptionalParameters")) {
        givenParametersClass = c;
        parameters = givenParametersClass.getConstructor().newInstance();
        break;
      }
    }
    Class<?> givenResponseClass = givenOperation.getReturnType();
    List<Object> givenParametersArray = new ArrayList<>();

    // Build request from undo parameters and response data
    Map<String, Given.Parameter> givenParams = step.getRequestParameters();

    for (Map.Entry<String, Given.Parameter> entry : givenParams.entrySet()) {
      if (givenParametersClass != null) {
        try {
          Field f = givenParametersClass.getDeclaredField(entry.getKey());
          f.setAccessible(true);
          f.set(
              parameters,
              entry.getValue().resolve(f.getType(), context, getObjectMapper(), getVersion()));
        } catch (NoSuchFieldException e) {
          Class<?>[] types = givenOperation.getParameterTypes();
          Class fieldType = types[givenParametersArray.size()];
          givenParametersArray.add(
              entry.getValue().resolve(fieldType, context, getObjectMapper(), getVersion()));
        }
      } else {
        Class<?>[] types = givenOperation.getParameterTypes();
        Class fieldType = types[givenParametersArray.size()];
        givenParametersArray.add(
            entry.getValue().resolve(fieldType, context, getObjectMapper(), getVersion()));
      }
    }
    if (givenParametersClass != null) {
      givenParametersArray.add(parameters);
    }

    // Execute request
    Object givenResponse;
    try {
      givenResponse = givenOperation.invoke(givenAPI, givenParametersArray.toArray());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    Method dataMethod = givenResponseClass.getMethod("getData");
    Object responseData = dataMethod.invoke(givenResponse);

    Undo undoSettings = UndoAction.UndoAction().getUndo(apiVersion, step.getOperationName());
    if (undoSettings != null) {
      undo.add(
          getRequestUndo(
              apiVersion, undoSettings, responseData, givenParametersArray.get(0), pathParameters));
    }

    if (step.source != null) {
      responseData = World.lookup(responseData, step.source);
    }

    context.put(step.key, responseData);

    sleepAfterRequest();
  }

  public Callable<?> getRequestUndo(
      String apiVersion,
      Undo undoSettings,
      Object responseData,
      Object requestData,
      Map<String, Object> pathParameters)
      throws Exception {
    // find API service based on undo tag value
    Class<?> undoAPIClass =
        Class.forName(
            "com.datadog.api.client."
                + apiVersion
                + ".api."
                + toClassName(undoSettings.getAPIName() + "Api"));
    Class<?> apiClientClass = Class.forName("com.datadog.api.client.ApiClient");
    Object clientAPI = apiClientClass.getConstructor().newInstance();
    configureClient(apiClientClass, clientAPI);
    authenticateClient(apiClientClass, clientAPI);

    Object undoAPI = undoAPIClass.getConstructor(apiClientClass).newInstance(clientAPI);

    String undoOperationName = undoSettings.getOperationName();

    // Enable unstable undo operation automatically
    if ((boolean)
        apiClientClass
            .getMethod("isUnstableOperation", String.class)
            .invoke(clientAPI, apiVersion + "." + undoOperationName)) {
      apiClientClass
          .getMethod("setUnstableOperationEnabled", String.class, boolean.class)
          .invoke(clientAPI, apiVersion + "." + undoOperationName, true);
    }

    return () -> {
      Method undoOperation = null;
      for (Method method : undoAPIClass.getMethods()) {
        if (method.getName().equals(undoOperationName + "WithHttpInfo")) {
          undoOperation = method;
          break;
        }
      }
      // Build request from undo parameters and response data
      Map<String, Object> undoRequestParams =
          undoSettings.undo.getRequestParameters(
              responseData, requestData, undoOperation, getObjectMapper(), pathParameters);
      for (Class c : undoAPIClass.getClasses()) {
        if (c.getName().endsWith(undoSettings.undo.operationId + "OptionalParameters")) {
          undoRequestParams.put("parameters", c.getConstructor().newInstance());
          break;
        }
      }

      // Execute request
      try {
        undoOperation.invoke(undoAPI, undoRequestParams.values().toArray());
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
      return null;
    };
  }

  public void sendRequest() throws Exception {
    if (requestParametersClass != null) {
      parametersArray.add(requestParameters);
    }

    responseClass = requestBuilder.getReturnType();

    String apiVersion = getVersion();
    Class<?> exceptionClass = Class.forName("com.datadog.api.client.ApiException");

    Undo undoSettings =
        UndoAction.UndoAction()
            .getUndo(
                apiVersion,
                requestBuilder.getName().substring(0, requestBuilder.getName().length() - 12));

    try {
      response = requestBuilder.invoke(api, parametersArray.toArray());
    } catch (Exception e) {
      if (!exceptionClass.isInstance(e.getCause())) {
        throw e;
      }
      // Return a new response object with the response code set
      // so we can make assertions on it
      int responseCode = (int) exceptionClass.getMethod("getCode").invoke(e.getCause());
      for (Constructor<?> c : responseClass.getConstructors()) {
        if (c.getParameterCount() == 3) {
          String body = (String) exceptionClass.getMethod("getResponseBody").invoke(e.getCause());
          Object data;
          try {
            data = fromJSON(getObjectMapper(), HashMap.class, body);
          } catch (JsonParseException v) {
            data = body;
          }
          response =
              c.newInstance(
                  responseCode,
                  exceptionClass.getMethod("getResponseHeaders").invoke(e.getCause()),
                  data);
        }
      }
    }

    if (undoSettings != null) {
      Method dataMethod = responseClass.getMethod("getData");
      Object responseData;
      try {
        responseData = dataMethod.invoke(response);
      } catch (Exception e) {
        throw new Exception(e.getCause());
      }
      undo.add(
          getRequestUndo(
              apiVersion, undoSettings, responseData, parametersArray.get(0), pathParameters));
    }
  }

  public void sendPaginatedRequest() throws Exception {
    if (requestParametersClass != null) {
      parametersArray.add(requestParameters);
    }

    Method paginatedMethod = null;
    // Get the paginated method.
    for (Method method : apiClass.getMethods()) {
      if (method.getName().equals(this.methodName + "WithPagination")) {
        if (parametersArray.size() == method.getParameterCount()) {
          paginatedMethod = method;
          break;
        }
      }
    }

    responseClass = paginatedMethod.getReturnType();

    String apiVersion = getVersion();
    Class<?> exceptionClass = Class.forName("com.datadog.api.client.ApiException");

    try {
      response = paginatedMethod.invoke(api, parametersArray.toArray());
    } catch (Exception e) {
      throw e;
    }

    paginatedItems = new ArrayList<>();
    Object iterator = response.getClass().getMethod("iterator").invoke(response);

    while (((boolean) iterator.getClass().getMethod("hasNext").invoke(iterator))) {
      Object item = iterator.getClass().getMethod("next").invoke(iterator);
      paginatedItems.add(item);
    }
  }

  public ObjectMapper getObjectMapper()
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    Method getJSON = clientClass.getMethod("getJSON");
    Object json = getJSON.invoke(client);
    Class<?> jsonClass = getJSON.getReturnType();
    return (ObjectMapper) jsonClass.getMethod("getMapper").invoke(json);
  }

  public static <T> T fromJSON(ObjectMapper mapper, Class<T> clazz, String data)
      throws com.fasterxml.jackson.core.JsonProcessingException {
    if (clazz == OffsetDateTime.class) {
      return (T)
          OffsetDateTime.parse(
              data.substring(1, data.length() - 1), // "2020-01-01T00:00:00+00:00" strip quotes
              DateTimeFormatter.ISO_DATE_TIME);
    }
    return mapper.readValue(data, clazz);
  }

  public String getName() {
    return Pattern.compile("[^A-Za-z0-9]+").matcher(scenario.getName()).replaceAll("_");
  }

  public String getUniqueEntityName() {
    String name = getName();
    if (name.length() > 100) {
      name = name.substring(0, 100);
    }

    String prefix =
        TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE) ? "Test-Java" : "Test";
    return String.format("%s-%s-%d", prefix, name, now.toEpochSecond());
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
    for (String dotPart : path.split("\\.")) {
      for (String part : dotPart.split("\\[")) {
        if (part.length() == 0) {
          continue;
        }
        if (part.contains("]")) {
          int index = Integer.parseInt(part.replaceAll("]", ""));
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
              } catch (InvocationTargetException | NoSuchMethodException eee) {
                throw ee;
              }

              // try to access data if it's an UnparsedObject
              try {
                result = getPropertyValue(result, "data");
              } catch (Exception ex) {
                // ignore
              }

              // try to access UnparsedObject's raw data
              if (result instanceof Map) {
                ObjectMapper mapper = new ObjectMapper();
                Map<String, Object> mp = mapper.convertValue(result, Map.class);

                if (null != mp.get(part)) {
                  result = mp.get(part);
                  continue;
                } else {
                  if (null != mp.get(toPropertyName(part))) {
                    result = mp.get(toPropertyName(part));
                    continue;
                  }
                }
              }

              result = getPropertyValue(result, toPropertyName(part));
            }
          }
        }
        if (result instanceof JsonNullable) {
          result = ((JsonNullable<?>) result).get();
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
        Pattern.compile("\\{\\{ *([^{}]+|'[^']+'|\"[^\"]+\") *}}"),
        m -> {
          String path = m.group(1).trim();
          Pattern functionRE = Pattern.compile("^(.+)\\((.*)\\)$");
          Matcher funcM = functionRE.matcher(path);
          if (funcM.find()) {
            String funcName = funcM.group(1);
            String arg = funcM.group(2);
            return templateFunctions.get(funcName).apply(context, arg);
          }
          if (path.charAt(0) == '\'' || path.charAt(0) == '"') {
            return path.substring(1, path.length() - 1);
          }
          try {
            return lookup(context, path).toString();
          } catch (Exception e) {
            return null;
          }
        });
  }

  /*
   * Convert an identifier to property name.
   */
  public static String toPropertyName(String identifier) {
    identifier = replace(identifier, Pattern.compile("[._-](.)"), m -> m.group(1).toUpperCase());
    identifier =
        replace(
            identifier,
            Pattern.compile("\\[(.)([^]]*)]"),
            m -> m.group(1).toUpperCase() + m.group(2));
    return identifier.substring(0, 1).toLowerCase() + identifier.substring(1);
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
        Pattern.compile("([A-Z])([A-Z]+)($|[A-Z][a-z])"),
        m -> m.group(1) + m.group(2).toLowerCase() + m.group(3));
  }

  /*
   * Convert an identifier to method name.
   */
  public static String toMethodName(String identifier) {
    return replace(identifier, Pattern.compile("^([A-Z])"), m -> m.group(1).toLowerCase());
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
