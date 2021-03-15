/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static org.junit.Assert.assertEquals;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogsPipelinesOrderTest extends V1ApiTest {
  private static LogsPipelinesApi api;

  @Override
  public String getTracingEndpoint() {
    return "logs-pipelines";
  }

  @BeforeClass
  public static void initApi() {
    api = new LogsPipelinesApi(generalApiClient);
  }

  @Test
  public void pipelineOrderTest() throws ApiException {

    // Get current pipelines order
    LogsPipelinesOrder pipelinesOrder = api.getLogsPipelineOrder().execute();
    List<String> pipelineIDs = pipelinesOrder.getPipelineIds();

    // Slightly change order
    List<String> newOrder = new ArrayList<>(pipelineIDs);
    newOrder.add(newOrder.get(0));
    newOrder.remove(0);
    pipelinesOrder.setPipelineIds(newOrder);

    LogsPipelinesOrder updatedPipelinesOrder =
        api.updateLogsPipelineOrder().body(pipelinesOrder).execute();
    assertEquals(newOrder, updatedPipelinesOrder.getPipelineIds());
  }
}
