package com.datadog.api;

import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.junit.Assert.*;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.google.gson.Gson;
import datadog.trace.api.interceptor.MutableSpan;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.opentracing.Span;
import io.opentracing.util.GlobalTracer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

public class ClientSteps {
  protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
  protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";
  protected static final String TEST_CODEOWNERS_TAG = "test.codeowners";

  private static String apiVersion;

  private World world;

  public ClientSteps(World world) {
    this.world = world;
  }

  @Before(order = 0)
  public void setupVersion(Scenario scenario) {
    world.scenario = scenario;
    apiVersion = world.getVersion();
    final Span span = GlobalTracer.get().activeSpan();
    if (span != null) {
      ArrayList<String> codeowners = new ArrayList<String>();
      for (String tag : scenario.getSourceTagNames()) {
        if (tag.startsWith("@team:")) {
          codeowners.add("@" + tag.substring(6));
        }
      }
      // if the agent container is not running, span is null
      MutableSpan localRootSpan = ((MutableSpan) span).getLocalRootSpan();
      localRootSpan.setTag(TEST_CODEOWNERS_TAG, new Gson().toJson(codeowners));
    }
  }

  @Before(order = 10)
  public void setupClient()
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    world.setupClient(apiVersion);
  }

  @Before(order = 20)
  public void setupContext() {
    String unique = world.getUniqueEntityName();
    world.context.put("unique", unique);
    world.context.put("unique_lower", unique.toLowerCase());
    world.context.put("unique_upper", unique.toUpperCase());
    world.context.put(
        "unique_alnum",
        World.replace(
            unique,
            Pattern.compile("[^A-Za-z0-9]+"),
            m -> {
              return "";
            }));
    world.context.put(
        "unique_lower_alnum", world.context.get("unique_alnum").toString().toLowerCase());
    world.context.put(
        "unique_upper_alnum", world.context.get("unique_alnum").toString().toUpperCase());
    world.context.put(
        "unique_hash", sha256Hex(world.context.get("unique").toString()).substring(0, 16));
    world.context.put("now", world.now);
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
      throws java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException,
          java.lang.InstantiationException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    world.setupAPI(apiVersion, World.toClassName(apiName));
  }

  @Given("operation {string} enabled")
  public void operationEnabled(String operationId)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    world.setUnstableOperationEnabled(apiVersion + "." + World.toMethodName(operationId));
  }

  @Given("a valid \"apiKeyAuth\" key in the system")
  public void aValidApiKeyInTheSystem()
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    HashMap<String, String> secrets = new HashMap<String, String>();
    secrets.put("apiKeyAuth", System.getenv(TEST_API_KEY_NAME));
    world.configureApiKeys(secrets);
  }

  @Given("a valid \"appKeyAuth\" key in the system")
  public void aValidAppKeyInTheSystem()
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    HashMap<String, String> secrets = new HashMap<String, String>();
    secrets.put("appKeyAuth", System.getenv(TEST_APP_KEY_NAME));
    world.configureApiKeys(secrets);
  }

  @Given("new {string} request")
  public void newRequest(String methodName)
      throws java.lang.IllegalAccessException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    world.newRequest(methodName);
  }

  @Given("request contains {string} parameter from {string}")
  public void requestContainsParameterFrom(String parameterName, String fixturePath)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException {
    world.addRequestParameterFixture(parameterName, fixturePath);
  }

  @Given("request contains {string} parameter with value {}")
  public void requestContainsParameterWithValue(String parameterName, String value)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          com.fasterxml.jackson.core.JsonProcessingException {
    world.addRequestParameter(parameterName, value);
  }

  @Given("body with value {}")
  public void setBody(String data)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          com.fasterxml.jackson.core.JsonProcessingException {
    world.addRequestParameter("body", data);
  }

  @Given("body from file {string}")
  public void setBodyFromFile(String filename)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchMethodException,
          java.lang.reflect.InvocationTargetException,
          IOException {
    Path bodyPath =
        Paths.get("src/test/resources/com/datadog/api/client/" + apiVersion + "/api/" + filename);
    String data = new String(Files.readAllBytes(bodyPath));
    world.addRequestParameter("body", data);
  }

  @Then("the response status is {int} {}")
  public void theResponseStatusIs(Integer statusCode, String unused)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException {
    Integer responseStatusCode = (Integer) 0;

    if (world.response != null) {
      if (world.response.getClass().getSimpleName().equals("PaginationIterable")) {
        responseStatusCode = 200;
      } else {
        responseStatusCode =
            (Integer) world.responseClass.getMethod("getStatusCode").invoke(world.response);
      }
    }
    assertEquals(statusCode, responseStatusCode);
  }

  @Then("the response {string} is equal to {}")
  public void theResponseIsEqualTo(String responsePath, String value)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          com.fasterxml.jackson.core.JsonProcessingException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    Object responseValue = World.lookup(responseData, responsePath);
    if (responseValue != null) {
      assertEquals(
          World.fromJSON(
              world.getObjectMapper(),
              responseValue.getClass(),
              World.templated(value, world.context)),
          responseValue);
    } else {
      assertEquals("null", World.templated(value, world.context));
    }
  }

  @Then("the response {string} is false")
  public void theResponseIsFalse(String responsePath)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    assertFalse((Boolean) World.lookup(responseData, responsePath));
  }

@Then("the response {string} has field {string}")
  public void theResponseHasField(String responsePath, String field)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    Object lookupRes = World.lookup(responseData, responsePath);
    Map<String, Object> mapObj = world.getObjectMapper().convertValue(lookupRes, Map.class);
    assertTrue(mapObj.containsKey(field));
  }

  @Then("the response {string} has the same value as {string}")
  public void theResponseHasTheSameValueAs(String responsePath, String fixturePath)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    assertEquals(
        World.lookup(world.context, fixturePath), World.lookup(responseData, responsePath));
  }

  @Then("the response {string} has length {long}")
  public void theResponseHasLength(String responsePath, Long size)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    List responseList;
    try {
      responseList = (List) World.lookup(responseData, responsePath);
    } catch (java.lang.ClassCastException e) {
      AbstractOpenApiSchema responseObject =
          (AbstractOpenApiSchema) World.lookup(responseData, responsePath);
      responseList = (List) responseObject.getActualInstance();
    }
    assertEquals(size, Long.valueOf(responseList.size()));
  }

  @Then("the response has {int} items")
  public void theResponseHasItems(Integer size)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.NoSuchMethodException {
    if (world.response.getClass().getSimpleName().equals("PaginationIterable")) {
      assertEquals(size, ((Object) world.paginatedItems.size()));
    } else {
      Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
      assertEquals(size, responseData.getClass().getMethod("size").invoke(responseData));
    }
  }

  @Then("the response {string} has item with field {string} with value {}")
  public void theResponseHasItemWithField(String responsePath, String keyPath, String value)
      throws java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          java.lang.NoSuchFieldException,
          com.fasterxml.jackson.core.JsonProcessingException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    List responseList;
    try {
      responseList = (List) World.lookup(responseData, responsePath);
    } catch (java.lang.ClassCastException e) {
      AbstractOpenApiSchema responseObject =
          (AbstractOpenApiSchema) World.lookup(responseData, responsePath);
      responseList = (List) responseObject.getActualInstance();
    }
    for (Object responseItem : responseList) {
      Object itemValue = World.lookup(responseItem, keyPath);
      try {
        assertEquals(
            World.fromJSON(
                world.getObjectMapper(),
                itemValue.getClass(),
                World.templated(value, world.context)),
            itemValue);
        return;
      } catch (AssertionError e) {
        continue;
      }
    }
    fail(
        String.format(
            "could not find key value pair in object array: \"%s\": \"%s\"", keyPath, value));
  }

  @Then("the response {string} array contains value {}")
  public void theResponseContainsValue(String responsePath, String value)
      throws java.lang.IllegalAccessException,
          java.lang.NoSuchFieldException,
          java.lang.reflect.InvocationTargetException,
          java.lang.IllegalAccessException,
          java.lang.InstantiationException,
          java.lang.NoSuchMethodException,
          java.lang.ClassNotFoundException,
          com.fasterxml.jackson.core.JsonProcessingException {
    Object responseData = world.responseClass.getMethod("getData").invoke(world.response);
    List responseList;
    try {
      responseList = (List) World.lookup(responseData, responsePath);
    } catch (java.lang.ClassCastException e) {
      AbstractOpenApiSchema responseObject =
          (AbstractOpenApiSchema) World.lookup(responseData, responsePath);
      responseList = (List) responseObject.getActualInstance();
    }
    for (Object responseItem : responseList) {
      try {
        if (responseItem != null) {
          assertEquals(
              World.fromJSON(
                  world.getObjectMapper(),
                  responseItem.getClass(),
                  World.templated(value, world.context)),
              responseItem);
        } else {
          assertEquals("null", World.templated(value, world.context));
        }
        return;
      } catch (AssertionError e) {
        continue;
      }
    }
    fail(String.format("could not find value in array: %s", value));
  }

  public String getTracingEndpoint() {
    return "features";
  }
}
