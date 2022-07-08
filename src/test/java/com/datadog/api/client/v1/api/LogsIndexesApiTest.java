/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for LogsIndexesApi */
public class LogsIndexesApiTest extends V1ApiTest {

  private static LogsIndexesApi api;
  private static LogsIndexesApi fakeAuthApi;
  private static LogsIndexesApi unitApi;
  private final String INDEXNAME = "main";

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/logs/config/indexes";
  private final String fixturePrefix = "client/v1/api/logs_indexes_fixtures";

  @Override
  public String getTracingEndpoint() {
    return "logs-indexes";
  }

  @BeforeClass
  public static void initApi() {
    api = new LogsIndexesApi(generalApiClient);
    fakeAuthApi = new LogsIndexesApi(generalFakeAuthApiClient);
    unitApi = new LogsIndexesApi(generalApiUnitTestClient);
  }

  /**
   * This endpoint returns an array of the LogIndex objects of your organization.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listLogIndexesTest() throws ApiException {
    LogsIndexListResponse response = api.listLogIndexes();
    assertTrue(0 < response.getIndexes().size());
  }

  /**
   * This endpoint returns an Index identified by its name.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLogsIndexTest() throws ApiException {
    LogsIndex response = api.getLogsIndex(INDEXNAME);
    assertEquals(INDEXNAME, response.getName());
    assertEquals("", response.getFilter().getQuery());
    assertNotNull(response.getExclusionFilters().size());
    // assertNotNull(response.getDailyLimit());
    assertNotNull(response.getIsRateLimited());
    assertNotNull(response.getNumRetentionDays());
  }

  /**
   * Get the current order of your log indexes.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLogsIndexOrderTest() throws ApiException {
    LogsIndexesOrder response = api.getLogsIndexOrder();
    assertTrue(0 < response.getIndexNames().size());
    assertTrue(response.getIndexNames().contains(INDEXNAME));
  }

  /**
   * Unit Test This endpoint creates an Index.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createLogsIndexTest() throws ApiException, IOException {
    LogsFilter filter = new LogsFilter().query("chicken-query");

    List<LogsExclusion> exclusionFilters = new ArrayList<LogsExclusion>();
    LogsExclusion exclusion =
        new LogsExclusion()
            .name(String.format("chicken-exclusion"))
            .isEnabled(false)
            .filter(new LogsExclusionFilter().query("chicken-filter").sampleRate(0.55));
    exclusionFilters.add(exclusion);

    LogsIndex body =
        new LogsIndex()
            .name("chicken-index")
            .filter(filter)
            .numRetentionDays(Long.valueOf(55))
            .dailyLimit(Long.valueOf(550000000))
            .exclusionFilters(exclusionFilters);

    stubFor(
        post(urlPathEqualTo("/api/v1/logs/config/indexes"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "client/v1/api/logs_indexes_fixtures/create_index.json"))));
    LogsIndex response = unitApi.createLogsIndex(body);
    resetWiremock();
    assertEquals(body.getName(), response.getName());
    assertEquals(body.getFilter(), response.getFilter());
    assertEquals(body.getNumRetentionDays(), response.getNumRetentionDays());
    assertEquals(body.getDailyLimit(), response.getDailyLimit());
    assertEquals(body.getExclusionFilters(), response.getExclusionFilters());
  }

  /**
   * Unit Test This endpoint updates an Index identified by its name.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateLogsIndexTest() throws ApiException, IOException {
    stubFor(
        get(urlPathEqualTo(String.format("/api/v1/logs/config/indexes/%s", INDEXNAME)))
            .willReturn(
                okJson(
                    TestUtils.getFixture("client/v1/api/logs_indexes_fixtures/get_index.json"))));
    LogsIndex orig = unitApi.getLogsIndex(INDEXNAME);
    resetWiremock();

    List<LogsExclusion> exclusionFilters = new ArrayList<LogsExclusion>();
    LogsExclusion exclusion =
        new LogsExclusion()
            .name(String.format("datadog-api-client-java"))
            .isEnabled(false)
            .filter(new LogsExclusionFilter().query("*").sampleRate(1.0));
    exclusionFilters.add(exclusion);

    LogsIndexUpdateRequest body =
        new LogsIndexUpdateRequest().filter(orig.getFilter()).exclusionFilters(exclusionFilters);

    stubFor(
        put(urlPathEqualTo(String.format("/api/v1/logs/config/indexes/%s", INDEXNAME)))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "client/v1/api/logs_indexes_fixtures/update_index.json"))));
    LogsIndex response = unitApi.updateLogsIndex(INDEXNAME, body);
    resetWiremock();
    assertEquals(body.getExclusionFilters(), response.getExclusionFilters());
  }

  /**
   * Unit Test Update the order of your log indexes.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateLogsIndexOrderTest() throws ApiException, IOException {
    // Get current index order
    stubFor(
        get(urlPathEqualTo("/api/v1/logs/config/index-order"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "client/v1/api/logs_indexes_fixtures/get_index_order.json"))));

    LogsIndexesOrder body = unitApi.getLogsIndexOrder();
    resetWiremock();
    List<String> names = body.getIndexNames();

    // Slightly change order
    List<String> newOrder = new ArrayList<>(names);
    newOrder.add(newOrder.get(0));
    newOrder.remove(0);
    body.setIndexNames(newOrder);
    stubFor(
        put(urlPathEqualTo("/api/v1/logs/config/index-order"))
            .willReturn(
                okJson(
                    TestUtils.getFixture(
                        "client/v1/api/logs_indexes_fixtures/updated_index_order.json"))));
    LogsIndexesOrder response = unitApi.updateLogsIndexOrder(body);
    resetWiremock();
    assertEquals(body.getIndexNames(), response.getIndexNames());
  }

  @Test
  public void logsIndexesListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listLogIndexes();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsIndexesGetErrorsTest() throws IOException {
    try {
      fakeAuthApi.getLogsIndex("shrugs");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getLogsIndex("shrugs");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }
  }

  @Test
  public void logsIndexesUpdateErrorsTest() throws IOException {
    try {
      api.updateLogsIndex("shrugs", new LogsIndexUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.updateLogsIndex("shrugs", new LogsIndexUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsIndexesOrderUpdate429ErrorTest() throws IOException {
    // mock 429 - Too many requests response
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_429.json");
    stubFor(
        put(urlPathEqualTo(apiUri + "/shrugs")).willReturn(okJson(fixtureData).withStatus(429)));
    // Mock the 429 response
    try {
      unitApi.updateLogsIndex("shrugs", new LogsIndexUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(429, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }
  }

  @Test
  public void logsIndexesOrderGetErrorsTest() throws IOException {
    try {
      fakeAuthApi.getLogsIndexOrder();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void logsIndexesOrderUpdateErrorsTest() throws IOException {
    try {
      api.updateLogsIndexOrder(new LogsIndexesOrder().indexNames(null));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.updateLogsIndexOrder(new LogsIndexesOrder().indexNames(null));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
