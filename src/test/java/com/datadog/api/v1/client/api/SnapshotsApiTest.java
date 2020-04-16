/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.GraphSnapshot;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * API tests for SnapshotsApi
 */
public class SnapshotsApiTest extends V1ApiTest {

    private static SnapshotsApi api;
    private static SnapshotsApi fakeAuthApi;

    @BeforeClass
    public static void initAPI() {
        api = new SnapshotsApi(generalApiClient);
        fakeAuthApi = new SnapshotsApi(generalFakeAuthApiClient);
    }

    @Test
    public void getGraphSnapshotTest() throws ApiException {
        String metricQuery = "system.load.1{*}";
        String graphDef = "{\"requests\": [{\"q\": \"system.load.1{*}\"}]}";
        String title = "Example Snapshot";
        String eventQuery = "successful builds";

        long start = now.toEpochSecond();
        long end = start + (24 * 60 * 60);

        // Try to create a snapshot with a metric_query (and an optional event_query)
        GraphSnapshot response = api.getGraphSnapshot().metricQuery(metricQuery).start(start).end(end).title(title).eventQuery(eventQuery).execute();
        assertEquals(metricQuery, response.getMetricQuery());
        assertEquals(graphDef, response.getGraphDef());
        assertNotEquals("", response.getSnapshotUrl());

        // Try to create a snapshot with a graph_def
        response = api.getGraphSnapshot().graphDef(graphDef).start(start).end(end).title(title).execute();
        assertEquals(graphDef, response.getGraphDef());
        assertNotEquals("", response.getSnapshotUrl());
    }

    @Test
    public void testGetGraphSnapshotStartRequiredParam() {
        long end = 2L;
        String metricQuery = "query";

        try {
            api.getGraphSnapshot().end(end).metricQuery(metricQuery).execute();
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Missing the required parameter 'start"));
        }
    }

    @Test
    public void testGetGraphSnapshotEndRequiredParam() {
        long start = 1L;
        String metricQuery = "query";

        try {
            api.getGraphSnapshot().start(start).metricQuery(metricQuery).execute();
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Missing the required parameter 'end"));
        }
    }

    @Test
    public void getGraphErrors() {
        try {
            api.getGraphSnapshot().start(new Long(345)).end(new Long(123)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getGraphSnapshot().start(new Long(345)).end(new Long(123)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }
}
