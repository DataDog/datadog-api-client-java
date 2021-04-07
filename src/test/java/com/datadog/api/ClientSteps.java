package com.datadog.api;

import static org.junit.Assert.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

public class ClientSteps {
  protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
  protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";

  private static String apiVersion;

  private World world;

  public ClientSteps(World world) {
    this.world = world;
  }

  @Before(order = 0)
  public void setupVersion(Scenario scenario) {
    world.scenario = scenario;
    apiVersion = world.getVersion();
    // TODO scenario.getSourceTagNames();
  }

  @Before(order = 10)
  public void setupClient()
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
    world.setupClient(apiVersion);
  }

  @Before(order = 20)
  public void setupContext() {
    String unique = world.getUniqueEntityName();
    world.context.put("unique", unique);
    world.context.put("unique_lower", unique.toLowerCase());
    world.context.put(
        "unique_alnum",
        World.replace(
            unique,
            Pattern.compile("[^A-Za-z0-9]+"),
            m -> {
              return "";
            }));
    world.context.put("now_ts", world.now.toEpochSecond());
    world.context.put("now_iso", world.now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    world.context.put("hour_later_ts", world.now.plusHours(1).toEpochSecond());
    world.context.put(
        "hour_later_iso", world.now.plusHours(1).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    world.context.put("hour_ago_ts", world.now.minusHours(1).toEpochSecond());
    world.context.put(
        "hour_ago_iso", world.now.minusHours(1).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
  }

  @After
  public void undo() {
    Collections.reverse(world.undo);
    for (Callable u : world.undo) {
      try {
        u.call();
      } catch (Exception e) {
        System.err.printf("failed undo: %s\n", e);
      }
    }
  }

  @Given("an instance of {string} API")
  public void anInstanceOfAPI(String apiName)
      throws java.lang.ClassNotFoundException, java.lang.NoSuchFieldException,
          java.lang.InstantiationException, java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    world.setupAPI(apiVersion, World.toClassName(apiName));
  }

  @Given("operation {string} enabled")
  public void operationEnabled(String operationId)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    world.setUnstableOperationEnabled(World.toMethodName(operationId));
  }

  @Given("a valid \"apiKeyAuth\" key in the system")
  public void aValidApiKeyInTheSystem()
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    HashMap<String, String> secrets = new HashMap<String, String>();
    secrets.put("apiKeyAuth", System.getenv(TEST_API_KEY_NAME));
    world.configureApiKeys(secrets);
  }

  @Given("a valid \"appKeyAuth\" key in the system")
  public void aValidAppKeyInTheSystem()
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    HashMap<String, String> secrets = new HashMap<String, String>();
    secrets.put("appKeyAuth", System.getenv(TEST_APP_KEY_NAME));
    world.configureApiKeys(secrets);
  }

  @Given("new {string} request")
  public void newRequest(String methodName)
      throws java.lang.IllegalAccessException, java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    world.newRequest(methodName);
  }

  @Given("request contains {string} parameter from {string}")
  public void requestContainsParameterFrom(String parameterName, String fixturePath)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException, java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    world.addRequestParameterFixture(parameterName, fixturePath);
  }

  @Given("request contains {string} parameter with value {}")
  public void requestContainsParameterWithValue(String parameterName, String value)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException, java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          com.fasterxml.jackson.core.JsonProcessingException {
    world.addRequestParameter(parameterName, value);
  }

  @Given("body {}")
  public void setBody(String data)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException, java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          com.fasterxml.jackson.core.JsonProcessingException {
    world.addRequestParameter("body", data);
  }

  @Then("the response status is {int} {}")
  public void theResponseStatusIs(Integer statusCode, String unused)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    Integer responseStatusCode = (Integer) 0;
    if (world.response != null) {
      responseStatusCode =
          (Integer) world.responseClass.getMethod("getStatusCode").invoke(world.response);
    }
    assertEquals(statusCode, responseStatusCode);
  }

  @Then("the response {string} is equal to {}")
  public void theResponseIsEqualTo(String responsePath, String value)
      throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException,
          java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, com.fasterxml.jackson.core.JsonProcessingException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    Object responseValue = World.lookup(responseData, responsePath);
    assertEquals(
        World.fromJSON(
            world.getObjectMapper(),
            responseValue.getClass(),
            World.templated(value, world.context)),
        responseValue);
  }

  @Then("the response {string} is false")
  public void theResponseIsFalse(String responsePath)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    assertFalse((Boolean) World.lookup(responseData, responsePath));
  }

  @Then("the response {string} has the same value as {string}")
  public void theResponseHasTheSameValueAs(String responsePath, String fixturePath)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    assertEquals(
        World.lookup(world.context, fixturePath), World.lookup(responseData, responsePath));
  }

  @Then("the response {string} has length {long}")
  public void theResponseHasLength(String responsePath, Long size)
      throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException,
          java.lang.InstantiationException, java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException, java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    List value = (List) World.lookup(responseData, responsePath);
    assertEquals(size, Long.valueOf(value.size()));
  }

  public String getTracingEndpoint() {
    return "features";
  }
}
