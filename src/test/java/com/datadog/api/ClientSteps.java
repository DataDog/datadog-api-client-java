package com.datadog.api;

import static org.junit.Assert.*;

import java.util.concurrent.Callable;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ClientSteps {
    protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
    protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";

    private static String apiVersion;

    private World world;

    public ClientSteps(World world) {
        this.world = world;
    }

    @Before(order = 0)
    public void setupVersion(Scenario scenario) throws java.io.IOException {
        world.scenario = scenario;
        apiVersion = world.getVersion();
        // TODO scenario.getSourceTagNames();
    }

    @Before(order = 10)
    public void setupClient() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException,
            java.lang.NoSuchFieldException {
        world.setupClient(apiVersion);
    }

    @Before(order = 20)
    public void setupContext() {
        String unique = world.getUniqueEntityName();
        world.context.put("unique", unique);
        world.context.put("unique_lower", unique.toLowerCase());
    }

    @After
    public void undo() {
        for (Callable u : world.undo) {
            try {
                u.call();
            } catch (Exception e) {
                System.out.printf("failed undo: %s\n", e);
            }
        }

    }

    @Given("an instance of {string} API")
    public void anInstanceOfAPI(String apiName) throws java.lang.ClassNotFoundException, java.lang.NoSuchFieldException,
            java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
            java.lang.reflect.InvocationTargetException {
        world.setupAPI(apiVersion, toClassName(apiName));
    }

    @Given("operation {string} enabled")
    public void operationEnabled(String operationId)
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        world.setUnstableOperationEnabled(toMethodName(operationId));
    }

    @Given("a valid \"apiKeyAuth\" key in the system")
    public void aValidApiKeyInTheSystem()
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv(TEST_API_KEY_NAME));
        world.configureApiKeys(secrets);
    }

    @Given("a valid \"appKeyAuth\" key in the system")
    public void aValidAppKeyInTheSystem()
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("appKeyAuth", System.getenv(TEST_APP_KEY_NAME));
        world.configureApiKeys(secrets);
    }

    @Given("new {string} request")
    public void newRequest(String methodName) throws java.lang.IllegalAccessException, java.lang.IllegalAccessException,
            java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        world.newRequest(toMethodName(methodName));
    }

    @Given("request contains {string} parameter from {string}")
    public void requestContainsParameterFrom(String parameterName, String fixturePath)
            throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        world.requestParams.put(toPropertyName(parameterName), lookup(world.context, fixturePath));
    }

    @Given("request contains {string} parameter with value {}")
    public void requestContainsParameterWithValue(String parameterName, String value)
            throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.ClassNotFoundException,
            java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException,
            com.fasterxml.jackson.core.JsonProcessingException {
        String propertyName = toPropertyName(parameterName);
        Field field = world.requestClass.getDeclaredField(propertyName);
        world.requestParams.put(propertyName, world.fromJSON(field.getType(), value));
    }

    @Given("body {}")
    public void setBody(String data) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException,
            java.lang.ClassNotFoundException, java.lang.NoSuchMethodException,
            java.lang.reflect.InvocationTargetException, com.fasterxml.jackson.core.JsonProcessingException {
        Field field = world.requestClass.getDeclaredField("body");
        world.requestParams.put("body", world.fromJSON(field.getType(), templated(data, world.context)));
    }

    @Then("the response status is {int} {}")
    public void theResponseStatusIsOK(Integer statusCode, String _)
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        Integer responseStatusCode = (Integer) world.responseClass.getMethod("getStatusCode").invoke(world.response);
        assertEquals(statusCode, responseStatusCode);
    }

    @Then("the response {string} is equal to {}")
    public void theResponseIsEqualTo(String responsePath, String value) throws java.lang.IllegalAccessException,
            java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException,
            java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException,
            java.lang.ClassNotFoundException, com.fasterxml.jackson.core.JsonProcessingException {
        Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
        Object responseValue = lookup(responseData, responsePath);
        assertEquals(world.fromJSON(responseValue.getClass(), templated(value, world.context)), responseValue);
    }

    @Then("the response {string} is false")
    public void theResponseIsFalse(String responsePath) throws java.lang.reflect.InvocationTargetException,
            java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException,
            java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
        Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
        assertFalse((Boolean) lookup(responseData, responsePath));
    }

    @Then("the response {string} has the same value as {string}")
    public void theResponseHasTheSameValueAs(String responsePath, String fixturePath)
            throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
            java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException,
            java.lang.NoSuchFieldException {
        Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
        assertEquals(lookup(world.context, fixturePath), lookup(responseData, responsePath));
    }

    @Then("the response {string} has length {long}")
    public void theResponseHasLength(String responsePath, Long size) throws java.lang.reflect.InvocationTargetException,
            java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException,
            java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
        Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
        List value = (List) lookup(responseData, responsePath);
        assertEquals(size, Long.valueOf(value.size()));
    }

    /*
     * Convert an identifier to class name.
     */
    public static String toClassName(String identifier) {
        return replace(identifier, Pattern.compile("([A-Z])([A-Z]+)([A-Z][a-z])"), m -> {
            return m.group(1) + m.group(2).toLowerCase() + m.group(3);
        });
    }

    /*
     * Convert an identifier to method name.
     */
    public static String toMethodName(String identifier) {
        return replace(identifier, Pattern.compile("^([A-Z])"), m -> {
            return m.group(1).toLowerCase();
        });
    }

    /*
     * Convert an identifier to property name.
     */
    public static String toPropertyName(String identifier) {
        identifier = replace(identifier, Pattern.compile("_(.)"), m -> {
            return m.group(1).toUpperCase();
        });
        return replace(identifier, Pattern.compile("\\[(.)([^]]*)\\]"), m -> {
            return m.group(1).toUpperCase() + m.group(2);
        });
    }

    public String getTracingEndpoint() {
        return "features";
    }

    @SuppressWarnings("unchecked")
    public static <T> T getPropertyValue(Object obj, String field)
            throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        Class<?> clazz = obj.getClass();
        Field f = clazz.getDeclaredField(field);
        f.setAccessible(true);
        Object ret = f.get(obj);
        return (T) ret;
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
        for (String dotPart : Arrays.asList(path.split("(?<=\\.)"))) {
            dotPart = dotPart.replaceAll("\\.", "");
            for (String part : Arrays.asList(dotPart.split("(?<=\\[)"))) {
                if (part.indexOf("]") != -1) {
                    Integer index = Integer.parseInt(part.replaceAll("]", ""));
                    result = List.class.cast(result).get(index);
                } else {
                    part = part.replaceAll("\\[", "");
                    try {
                        result = HashMap.class.cast(result).get(part);
                    } catch (Exception e) {
                        result = getPropertyValue(result, toPropertyName(part));
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
        return replace(source, Pattern.compile("\\{\\{ ?([^ }]+) ?\\}\\}"), m -> {
            try {
                return lookup(context, m.group(1)).toString();
            } catch (Exception e) {
                return null;
            }

        });
    }

    /*
     * Replace all ocurrences of pattern with a result of replacer function.
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
}
