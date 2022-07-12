/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.client.v1.api;

import static org.junit.Assert.*;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.APIErrorResponse;
import com.datadog.api.client.v1.model.LogsAPIErrorResponse;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsPipelinesOrder;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.*;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for LogsPipelinesApi */
public class LogsPipelinesApiTest extends V1ApiTest {

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final LogsPipelinesApi api = new LogsPipelinesApi(generalApiClient);
  private final LogsPipelinesApi fakeAuthApi = new LogsPipelinesApi(generalFakeAuthApiClient);

  @Override
  public String getTracingEndpoint() {
    return "logs-pipelines";
  }

  /**
   * Create a Pipeline
   *
   * <p>## Overview Create a Pipeline in your organization. ## Arguments - **&#x60;name&#x60;**
   * [*required*]: Your pipeline name. - **&#x60;is_enabled&#x60;** [*optional*,
   * default&#x3D;&#x60;False&#x60;]: Boolean value to enable your pipeline. -
   * **&#x60;filter.query&#x60;** [*optional*]: Defines your pipeline filter. Only logs that match
   * the filter criteria are processed by this pipeline. - **&#x60;processors&#x60;** [*optional*]:
   * Ordered array of processors or nested pipelines.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void createLogsPipelineTest() throws ApiException {
    LogsPipeline body = null;
    LogsPipeline response = api.createLogsPipeline(body);
    // TODO: test validations
  }

  /**
   * Delete a Pipeline
   *
   * <p>## Overview Delete a given pipeline from your organization. ## Arguments This endpoint takes
   * no JSON arguments.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void deleteLogsPipelineTest() throws ApiException {
    String pipelineId = null;
    api.deleteLogsPipeline(pipelineId);
    // TODO: test validations
  }

  /**
   * Get all Pipeline
   *
   * <p>## Overview Get all pipelines from your organization. ## Arguments This endpoint takes no
   * JSON arguments.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void listLogsPipelinesTest() throws ApiException {
    List<LogsPipeline> response = api.listLogsPipelines();
    // TODO: test validations
  }

  /**
   * Get a Pipeline
   *
   * <p>## Overview Get a specific pipeline from your organization. ## Arguments This endpoint takes
   * no JSON arguments.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void getLogsPipelineTest() throws ApiException {
    String pipelineId = null;
    LogsPipeline response = api.getLogsPipeline(pipelineId);
    // TODO: test validations
  }

  /**
   * Get Pipeline Order
   *
   * <p>Get the current order of your pipelines. ## Arguments This endpoint takes no JSON arguments.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void getLogsPipelineOrderTest() throws ApiException {
    LogsPipelinesOrder response = api.getLogsPipelineOrder();
    // TODO: test validations
  }

  /**
   * Update a Pipeline
   *
   * <p>## Overview Update a given pipeline configuration to change it’s processors or their order.
   * ## Arguments **Note**: Using this method updates your pipeline configuration by **replacing**
   * your current configuration with the new one sent to your Datadog organization. -
   * **&#x60;name&#x60;** [*required*]: Your pipeline name. - **&#x60;is_enabled&#x60;**
   * [*optional*, default&#x3D;&#x60;False&#x60;]: Boolean value to enable your pipeline. -
   * **&#x60;filter.query&#x60;** [*optional*]: Defines your pipeline filter. Only logs that match
   * the filter criteria are processed by this pipeline. - **&#x60;processors&#x60;** [*optional*]:
   * Ordered array of processors or nested pipelines.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void updateLogsPipelineTest() throws ApiException {
    String pipelineId = null;
    LogsPipeline body = null;
    LogsPipeline response = api.updateLogsPipeline(pipelineId, body);
    // TODO: test validations
  }

  /**
   * Update Pipeline Order
   *
   * <p>## Overview Update the order of your pipelines. Since logs are processed sequentially,
   * reordering a pipeline may change the structure and content of the data processed by other
   * pipelines and their processors. **Note**: Using the PUT method updates your pipeline order by
   * replacing your current order with the new one sent to your Datadog organization. ## Arguments -
   * **&#x60;pipeline_ids&#x60;** [*required*]: Ordered Array of &lt;PIPELINE_ID&gt; strings, the
   * order of pipeline IDs in the array define the overall Pipelines order for Datadog.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  @Ignore
  public void updateLogsPipelineOrderTest() throws ApiException {
    LogsPipelinesOrder body = null;
    LogsPipelinesOrder response = api.updateLogsPipelineOrder(body);
    // TODO: test validations
  }

  @Test
  public void orderGetLogsPipelineErrorsTest() throws IOException {
    try {
      fakeAuthApi.getLogsPipelineOrder();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void orderUpdateLogsPipelineErrorsTest() throws IOException {
    try {
      fakeAuthApi.updateLogsPipelineOrder(new LogsPipelinesOrder());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateLogsPipelineOrder(new LogsPipelinesOrder().pipelineIds(Arrays.asList("ids")));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(422, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }
  }

  @Test
  public void listLogsPipelineErrorsTest() throws IOException {
    try {
      fakeAuthApi.listLogsPipelines();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void createLogsPipelineErrorsTest() throws IOException {
    try {
      api.createLogsPipeline(new LogsPipeline());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.createLogsPipeline(new LogsPipeline());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getLogsPipelineErrorsTest() throws IOException {
    try {
      api.getLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.getLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void deleteLogsPipelineErrorsTest() throws IOException {
    try {
      api.deleteLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.deleteLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updateLogsPipelineErrorsTest() throws IOException {
    try {
      api.deleteLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.deleteLogsPipeline("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}