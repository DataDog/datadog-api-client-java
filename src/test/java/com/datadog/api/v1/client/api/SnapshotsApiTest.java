/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static org.junit.Assert.*;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.GraphSnapshot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for SnapshotsApi */
public class SnapshotsApiTest extends V1ApiTest {

  private static SnapshotsApi api;
  private static SnapshotsApi fakeAuthApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "snapshots";
  }

  @BeforeClass
  public static void initAPI() {
    api = new SnapshotsApi(generalApiClient);
    fakeAuthApi = new SnapshotsApi(generalFakeAuthApiClient);
  }

  @Test
  public void getGraphSnapshotTest() throws ApiException {
    String metricQuery = "system.load.1{*}";
    String graphDef = "{\"requests\": [{\"q\": \"system.load.1{*}\"}]}";
    String title = getUniqueEntityName();
    String eventQuery = "successful builds";

    long start = now.toEpochSecond();
    long end = start + (24 * 60 * 60);

    // Try to create a snapshot with a metric_query (and an optional event_query)
    GraphSnapshot response =
        api.getGraphSnapshot()
            .metricQuery(metricQuery)
            .start(start)
            .end(end)
            .title(title)
            .eventQuery(eventQuery)
            .execute();
    assertEquals(metricQuery, response.getMetricQuery());
    assertEquals(graphDef, response.getGraphDef());
    assertNotEquals("", response.getSnapshotUrl());

    // Try to create a snapshot with a graph_def
    response =
        api.getGraphSnapshot().graphDef(graphDef).start(start).end(end).title(title).execute();
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
  public void getGraphErrors() throws IOException {
    try {
      api.getGraphSnapshot().start(new Long(345)).end(new Long(123)).execute();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getGraphSnapshot().start(new Long(345)).end(new Long(123)).execute();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
