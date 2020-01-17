/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.TestUtils;
import com.datadog.api.v1.client.model.*;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

/**
 * API tests for MetricsApi
 */
public class MetricsApiTest extends V1ApiTest {

    private static MetricsApi api;

    @BeforeClass
    public static void initApi() {
        api = new MetricsApi(generalApiClient);
    }

    @Test
    public void metricsTests() throws ApiException, TestUtils.RetryException {
        long now = System.currentTimeMillis()/1000;

        String testMetric = String.format("go.client.test.%d", now);
        List<Double> p1 = new ArrayList<>();
        p1.add(new Double(now-60));
        p1.add(10.5);
        List<Double> p2 = new ArrayList<>();
        p2.add(new Double(now));
        p2.add(11.);

        List<List<Double>> testPoints = new ArrayList<>();
        testPoints.add(p1);
        testPoints.add(p2);


        List<String> testTags = new ArrayList<>();
        testTags.add("tag:foo");
        testTags.add("bar:baz");

        String testHost = "go-client-test-host";
        String testQuery = "avg:"+testMetric+"{bar:baz}by{host}";

        List<Series> testSeries = new ArrayList<>();
        testSeries.add(new Series().host(testHost).metric(testMetric).points(testPoints).tags(testTags));

        MetricsPayload metricsPayload = new MetricsPayload().series(testSeries);

        IntakePayloadAccepted r = api.submitMetrics().body(metricsPayload).execute();
        assertEquals("ok", r.getStatus());

        // Check that the metric was submitted successfully
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                metrics = api.getAllActiveMetrics().from(now).execute();
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
        try {
            MetricsQueryResponse queryResult = api.queryMetrics().from(now - 100).to(now + 100).query(testQuery).execute();
       	assertEquals(1, queryResult.getGroupBy().size());
       	assertEquals("host", queryResult.getGroupBy());
       	assertEquals(testQuery, queryResult.getQuery());
       	assertEquals(new Long((now-100)*1000), queryResult.getFromDate());
       	assertEquals(new Long((now+100)*1000), queryResult.getToDate());
       	assertEquals("ok", queryResult.getStatus());
       	assertEquals("time_series", queryResult.getResType());
       	assertEquals(1, queryResult.getSeries().size());
       	MetricsQueryResponseSeries series = queryResult.getSeries().get(0);
       	assertEquals(new Long(2), series.getLength());
       	assertEquals("avg", series.getAggr());
       	assertEquals(testMetric, series.getDisplayName());
       	assertEquals(testMetric, series.getMetric());
       	assertEquals(series.getPointlist().get(0).get(0), series.getStart());
       	assertEquals(series.getPointlist().get(1).get(0), series.getEnd());
       	assertEquals(new Double(10.5), series.getPointlist().get(0).get(1));
       	assertEquals(new Double(11.), series.getPointlist().get(1).get(1));
        }catch(Exception e){
            e.printStackTrace();
        }

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
       	assertEquals("", metadata.getType());


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
}
