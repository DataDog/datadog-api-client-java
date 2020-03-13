/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * API tests for MetricsApi
 */
public class MetricsApiTest extends V1ApiTest {

    private static MetricsApi api;

    @Test
    public void metricsTests() throws ApiException, TestUtils.RetryException {
        api = new MetricsApi(generalApiClient);
        long nowSeconds = now.toEpochSecond();

        String testMetric = String.format("java.client.test.%d", nowSeconds);
        List<Double> p1 = new ArrayList<>();
        p1.add((double) (nowSeconds - 60));
        p1.add(10.5);
        List<Double> p2 = new ArrayList<>();
        p2.add((double) nowSeconds);
        p2.add(11.);

        List<List<Double>> testPoints = new ArrayList<>();
        testPoints.add(p1);
        testPoints.add(p2);

        List<String> testTags = new ArrayList<>();
        testTags.add("tag:foo");
        testTags.add("bar:baz");

        String testHost = "java-client-test-host";
        String testQuery = String.format("avg:%s{bar:baz}by{host}", testMetric);

        List<Series> testSeries = new ArrayList<>();
        testSeries.add(new Series().host(testHost).metric(testMetric).points(testPoints).tags(testTags).type("rate"));

        MetricsPayload metricsPayload = new MetricsPayload().series(testSeries);

        IntakePayloadAccepted r = api.submitMetrics().body(metricsPayload).execute();
        assertEquals("ok", r.getStatus());

        // Check that the metric was submitted successfully
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                metrics = api.getAllActiveMetrics().from(nowSeconds).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of active metrics: %s", e));
                return false;
            }
            boolean found = false;
            for(String metric: metrics.getMetrics()) {
                if(metric.equals(testMetric)) {
                    found = true;
                    break;
                }
            }
            return found;
        });

        // Test query
        MetricsQueryResponse queryResult = api.queryMetrics().from(nowSeconds - 100).to(nowSeconds + 100).query(testQuery).execute();
        assertEquals(1, queryResult.getGroupBy().size());
        assertEquals("host", queryResult.getGroupBy().get(0));
        assertEquals(testQuery, queryResult.getQuery());
        assertEquals(new Long((nowSeconds-100)*1000), queryResult.getFromDate());
        assertEquals(new Long((nowSeconds+100)*1000), queryResult.getToDate());
        assertEquals("ok", queryResult.getStatus());
        assertEquals("time_series", queryResult.getResType());
        assertEquals(1, queryResult.getSeries().size());
        MetricsQueryResponseSeries series = queryResult.getSeries().get(0);
        assertEquals(new Long(2), series.getLength());
        assertEquals("avg", series.getAggr());
        assertEquals(testMetric, series.getDisplayName());
        assertEquals(testMetric, series.getMetric());
        assertEquals(series.getPointlist().get(0).get(0), Double.valueOf(series.getStart()));
        assertEquals(series.getPointlist().get(1).get(0), Double.valueOf(series.getEnd()));
        assertEquals(new Double(10.5), series.getPointlist().get(0).get(1));
        assertEquals(new Double(11.), series.getPointlist().get(1).get(1));

        // Test search
        String searchQuery = String.format("metrics:%s", testMetric);
        MetricSearchResponse searchResult = api.searchMetrics().q(searchQuery).execute();
        List<String> metrics = searchResult.getResults().getMetrics();
        assertEquals(1, metrics.size());
        assertEquals(testMetric, metrics.get(0));

        // Test metric metadata
        MetricMetadata metadata = api.getMetricMetadata(testMetric).execute();
        assertNull(metadata.getDescription());
        assertNull(metadata.getIntegration());
        assertNull(metadata.getPerUnit());
        assertNull(metadata.getUnit());
        assertNull(metadata.getShortName());
        assertNull(metadata.getStatsdInterval());
        assertEquals("rate", metadata.getType());

        MetricMetadata newMetadata = new MetricMetadata().description("description").perUnit("second").unit("byte").shortName("short_name").statsdInterval(20L).type("count");
        metadata = api.editMetricMetadata(testMetric).body(newMetadata).execute();
        assertEquals("description", metadata.getDescription());
        assertNull(metadata.getIntegration());
        assertEquals("second", metadata.getPerUnit());
        assertEquals("byte", metadata.getUnit());
        assertEquals("short_name", metadata.getShortName());
        assertEquals(new Long(20), metadata.getStatsdInterval());
        assertEquals("count", metadata.getType());
    }

    @Test
    public void metricSubmissionMockTest() throws ApiException, IOException {
        api = new MetricsApi(generalApiUnitTestClient);

        String testMetric = "java.client.test";
        List<Double> p1 = new ArrayList<>();
        p1.add(1.);
        p1.add(10.5);
        List<Double> p2 = new ArrayList<>();
        p2.add(2.);
        p2.add(11.);

        List<List<Double>> testPoints = new ArrayList<>();
        testPoints.add(p1);
        testPoints.add(p2);

        List<String> testTags = new ArrayList<>();
        testTags.add("tag:foo");
        testTags.add("bar:baz");

        String testHost = "java-client-test-host";
        long testInterval = 20L;
        String testType = "count";

        List<Series> testSeries = new ArrayList<>();
        testSeries.add(new Series().host(testHost).metric(testMetric).points(testPoints).tags(testTags).type(testType).interval(testInterval));
        MetricsPayload testPayload = new MetricsPayload().series(testSeries);

        // Test that a normal submission works
        stubFor(post(urlPathEqualTo("/api/v1/series"))
            .withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
            .withRequestBody(equalToJson(TestUtils.getFixture("v1/client/api/metrics_fixtures/normal_submission.json"), true, false))
            .willReturn(okJson("{\"status\": \"ok\"}"))
        );
        IntakePayloadAccepted r = api.submitMetrics().body(testPayload).execute();
        assertEquals("ok", r.getStatus());

        // Test default values
        testSeries = new ArrayList<>();
        testSeries.add(new Series().metric(testMetric).points(testPoints));
        testPayload = new MetricsPayload().series(testSeries);

        stubFor(post(urlPathEqualTo("/api/v1/series"))
            .withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
            .withRequestBody(equalToJson(TestUtils.getFixture("v1/client/api/metrics_fixtures/default_submission.json"), true, false))
            .willReturn(okJson("{\"status\": \"ok\"}"))
        );
        r = api.submitMetrics().body(testPayload).execute();
        assertEquals("ok", r.getStatus());
    }

    @Test
    public void metricListActiveTestMock() throws ApiException, IOException {
        api = new MetricsApi(generalApiUnitTestClient);

        String expectedJSON = TestUtils.getFixture("v1/client/api/metrics_fixtures/active_metrics.json");
        ObjectMapper objectMapper = new ObjectMapper();
        MetricsListResponse expected = objectMapper.readValue(expectedJSON, MetricsListResponse.class);

        stubFor(get(urlPathEqualTo("/api/v1/metrics"))
            .withQueryParam("from", equalTo("1"))
            .withQueryParam("host", equalTo("host"))
            .willReturn(okJson(expectedJSON))
        );
        MetricsListResponse r = api.getAllActiveMetrics().from(1L).host("host").execute();

        assertEquals(expected, r);
    }
}
