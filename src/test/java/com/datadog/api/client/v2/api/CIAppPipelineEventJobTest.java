/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.api;

import static com.datadog.api.World.fromJSON;
import static org.junit.Assert.assertEquals;

import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestAttributesResource;
import com.datadog.api.client.v2.model.CIAppPipelineEventFinishedJob;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;

public class CIAppPipelineEventJobTest extends V2APITest {

  private static ObjectMapper objectMapper;

  @Override
  public String getTracingEndpoint() {
    return "ci-app";
  }

  @BeforeClass
  public static void initApi() {
    objectMapper = generalApiUnitTestClient.getJSON().getMapper();
  }

  @Test
  public void testDeserializeNestedOneOfJob() throws JsonProcessingException {
    String body =
        "{\"end\":\"2023-01-01T12:00:01+00:00\",\"id\":\"job-id\",\"level\":\"job\",\"name\":\"job-name\",\"pipeline_name\":\"my-pipeline\",\"pipeline_unique_id\":\"pipeline-unique-id\",\"start\":\"2023-01-01T12:00:00+00:00\",\"status\":\"success\",\"url\":\"https://example.com/job\"}";
    CIAppCreatePipelineEventRequestAttributesResource res =
        fromJSON(objectMapper, CIAppCreatePipelineEventRequestAttributesResource.class, body);

    CIAppPipelineEventFinishedJob finishedJob =
        res.getCIAppPipelineEventJob().getCIAppPipelineEventFinishedJob();
    assertEquals("job-id", finishedJob.getId());
  }
}
