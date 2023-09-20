/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.*;

import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for MetricsApi */
public class MetricsApiTest extends V1ApiTest {

  private static MetricsApi api;
  private static MetricsApi fakeAuthApi;
  private static MetricsApi unitApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String fixturePrefix = "client/v1/api/metrics_fixtures";
  private final String apiUri = "/api/v1/metrics";

  @Override
  public String getTracingEndpoint() {
    return "metrics";
  }

  @BeforeClass
  public static void initApi() {
    api = new MetricsApi(generalApiClient);
    fakeAuthApi = new MetricsApi(generalFakeAuthApiClient);
    unitApi = new MetricsApi(generalApiUnitTestClient);
  }

  @Test
  public void metricsTests() throws ApiException, TestUtils.RetryException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    long nowSeconds = now.toEpochSecond();

    // dashes in metric names get converted to underscores, so do it here to be able
    // to correctly search in the `retry` loop below
    String testMetric = getUniqueEntityName().replace('-', '_');
    String testHost = "java-client-test-host";
    String testQuery = String.format("avg:%s{bar:baz}by{host}", testMetric);
    // use TreeMap, as it's sorted and will always serialize in the same way
    Map<String, Object> payload =
        new TreeMap<String, Object>() {
          {
            put(
                "series",
                Arrays.asList(
                    new TreeMap<String, Object>() {
                      {
                        put("host", testHost);
                        put("metric", testMetric);
                        put("type", "rate");
                        put(
                            "points",
                            Arrays.asList(
                                Arrays.asList((double) nowSeconds - 60, 10.5),
                                Arrays.asList((double) nowSeconds, 11.0)));
                        put("tags", Arrays.asList("tag:foo", "bar:baz"));
                      }
                    }));
          }
        };
    ApiResponse<String> response =
        sendRequest("POST", "/api/v1/series", payload, new GenericType<String>(String.class));
    assertEquals("{\"status\": \"ok\"}", response.getData());

    // Check that the metric was submitted successfully
    TestUtils.retry(
        10,
        10,
        () -> {
          MetricsListResponse metrics;
          try {
            metrics = api.listActiveMetrics(nowSeconds);
          } catch (ApiException e) {
            System.out.println(String.format("Error getting list of active metrics: %s", e));
            return false;
          }
          boolean found = false;
          for (String metric : metrics.getMetrics()) {
            if (metric.equals(testMetric)) {
              found = true;
              break;
            }
          }
          return found;
        });

    // Test query
    MetricsQueryResponse queryResult =
        api.queryMetrics(nowSeconds - 100, nowSeconds + 100, testQuery);
    assertEquals(1, queryResult.getGroupBy().size());
    assertEquals("host", queryResult.getGroupBy().get(0));
    assertEquals(testQuery, queryResult.getQuery());
    assertEquals(Long.valueOf((nowSeconds - 100) * 1000), queryResult.getFromDate());
    assertEquals(Long.valueOf((nowSeconds + 100) * 1000), queryResult.getToDate());
    assertEquals("ok", queryResult.getStatus());
    assertEquals("time_series", queryResult.getResType());
    assertEquals(1, queryResult.getSeries().size());
    MetricsQueryMetadata series = queryResult.getSeries().get(0);
    assertEquals(Long.valueOf(2), series.getLength());
    assertEquals("avg", series.getAggr());
    assertEquals(testMetric, series.getDisplayName());
    assertEquals(testMetric, series.getMetric());
    assertEquals(series.getPointlist().get(0).get(0), Double.valueOf(series.getStart()));
    assertEquals(series.getPointlist().get(1).get(0), Double.valueOf(series.getEnd()));
    assertEquals(Double.valueOf(10.5), series.getPointlist().get(0).get(1));
    assertEquals(Double.valueOf(11.), series.getPointlist().get(1).get(1));

    // Test search
    String searchQuery = String.format("metrics:%s", testMetric);
    MetricSearchResponse searchResult = api.listMetrics(searchQuery);
    List<String> metrics = searchResult.getResults().getMetrics();
    assertEquals(1, metrics.size());
    assertEquals(testMetric, metrics.get(0));

    // Test metric metadata
    MetricMetadata metadata = api.getMetricMetadata(testMetric);
    assertNull(metadata.getDescription());
    assertNull(metadata.getIntegration());
    assertNull(metadata.getPerUnit());
    assertNull(metadata.getUnit());
    assertNull(metadata.getShortName());
    assertNull(metadata.getStatsdInterval());
    assertEquals("rate", metadata.getType());

    MetricMetadata newMetadata =
        new MetricMetadata()
            .description("description")
            .perUnit("second")
            .unit("byte")
            .shortName("short_name")
            .statsdInterval(20L)
            .type("count");
    metadata = api.updateMetricMetadata(testMetric, newMetadata);
    assertEquals("description", metadata.getDescription());
    assertNull(metadata.getIntegration());
    assertEquals("second", metadata.getPerUnit());
    assertEquals("byte", metadata.getUnit());
    assertEquals("short_name", metadata.getShortName());
    assertEquals(Long.valueOf(20), metadata.getStatsdInterval());
    assertEquals("count", metadata.getType());
  }

  @Test
  public void metricListActiveTestMock() throws ApiException, IOException {
    String expectedJSON =
        TestUtils.getFixture("client/v1/api/metrics_fixtures/active_metrics.json");
    ObjectMapper objectMapper = new ObjectMapper();
    MetricsListResponse expected = objectMapper.readValue(expectedJSON, MetricsListResponse.class);

    stubFor(
        get(urlPathEqualTo("/api/v1/metrics"))
            .withQueryParam("from", equalTo("1"))
            .withQueryParam("host", equalTo("host"))
            .willReturn(okJson(expectedJSON)));
    MetricsListResponse r =
        unitApi.listActiveMetrics(
            1L, new MetricsApi.ListActiveMetricsOptionalParameters().host("host"));

    assertEquals(expected, r);
  }

  @Test
  public void metricsListActive400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo(apiUri)).willReturn(okJson(fixtureData).withStatus(400)));
    // Error 400 cannot be triggered from the client due to client side validation, so mock it
    try {
      unitApi.listActiveMetrics(Long.valueOf(-1));
      throw new AssertionError();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsListActiveErrorsTest() throws IOException {
    try {
      fakeAuthApi.listActiveMetrics(Long.valueOf(-1));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsMetadataGetErrorsTest() throws IOException {
    try {
      fakeAuthApi.getMetricMetadata("ametric");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getMetricMetadata("ametric");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsMetadataUpdate400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(
        put(urlPathEqualTo(apiUri + "/ametric")).willReturn(okJson(fixtureData).withStatus(400)));
    //         Error 400 cannot be triggered from the client due to client side validation, so mock
    // it
    try {
      unitApi.updateMetricMetadata("ametric", new MetricMetadata());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsMetadataUpdateErrorsTest() throws IOException {
    try {
      fakeAuthApi.updateMetricMetadata("ametric", new MetricMetadata());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateMetricMetadata("ametric", new MetricMetadata());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsList400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo("/api/v1/search")).willReturn(okJson(fixtureData).withStatus(400)));
    // Error 400 cannot be triggered from the client due to client side validation, so mock it
    try {
      unitApi.listMetrics("");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listMetrics("somequery");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsQuery400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(get(urlPathEqualTo("/api/v1/query")).willReturn(okJson(fixtureData).withStatus(400)));
    // Error 400 cannot be triggered from the client due to client side validation, so mock it
    try {
      unitApi.queryMetrics(Long.valueOf(9), Long.valueOf(9), "");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void metricsQueryErrorsTest() throws IOException {
    try {
      fakeAuthApi.queryMetrics(Long.valueOf(9), Long.valueOf(9), "");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
