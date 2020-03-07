/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.GraphSnapshot;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.Instant;

/**
 * API tests for SnapshotsApi
 */
public class SnapshotsApiTest extends V1ApiTest {

    private static SnapshotsApi api;

    @BeforeClass
    public static void initAPI() {
        api = new SnapshotsApi(generalApiClient);
    }
    
    /**
     * Take graph snapshots
     *
     * ### Overview Take graph snapshots ### Arguments * **&#x60;metric_query&#x60;** [*required*]: The metric query. * **&#x60;start&#x60;** [*required*]: The POSIX timestamp of the start of the query. * **&#x60;end&#x60;** [*required*]: The POSIX timestamp of the end of the query. * **&#x60;event_query&#x60;** [*optional*, *default* &#x3D; **None**]: A query that adds event bands to the graph. * **&#x60;graph_def&#x60;** [*optional*, *default* &#x3D; **None**]: A JSON document defining the graph.   graph_def can be used instead of metric_query. The JSON document uses the   [grammar defined here](https://docs.datadoghq.com/graphing/graphing_json/#grammar)   and should be formatted to a single line then URLEncoded.  * **&#x60;title&#x60;** [*optional*, *default* &#x3D; **None**]: A title for the graph.   If no title is specified, the graph doesn’t have a title.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGraphSnapshotTest() throws ApiException {
        String metricQuery = "system.load.1{*}";
        String graphDef = "{\"requests\": [{\"q\": \"system.load.1{*}\"}]}";
        String title = "Example Snapshot";
        String eventQuery = "successful builds";

        Long start = Instant.now().getEpochSecond();;
        Long end = start + (24*60*60);

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
        Long start = Long.valueOf(1);
        Long end = Long.valueOf(2);
        String metricQuery = "query";

        try {
            GraphSnapshot response = api.getGraphSnapshot().end(end).metricQuery(metricQuery).execute();
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Missing the required parameter 'start"));
        }
    }

    @Test
    public void testGetGraphSnapshotEndRequiredParam() {
        Long start = Long.valueOf(1);
        String metricQuery = "query";

        try {
            GraphSnapshot response = api.getGraphSnapshot().start(start).metricQuery(metricQuery).execute();
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Missing the required parameter 'end"));
        }
    }
}
