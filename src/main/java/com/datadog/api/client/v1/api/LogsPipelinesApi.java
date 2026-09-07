package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsPipelinesOrder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsPipelinesApi {
  private ApiClient apiClient;

  public LogsPipelinesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsPipelinesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a pipeline.
   *
   * <p>See {@link #createLogsPipelineWithHttpInfo}.
   *
   * @param body Definition of the new pipeline. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   */
  public LogsPipeline createLogsPipeline(LogsPipeline body) throws ApiException {
    return createLogsPipelineWithHttpInfo(body).getData();
  }

  /**
   * Create a pipeline.
   *
   * <p>See {@link #createLogsPipelineWithHttpInfoAsync}.
   *
   * @param body Definition of the new pipeline. (required)
   * @return CompletableFuture&lt;LogsPipeline&gt;
   */
  public CompletableFuture<LogsPipeline> createLogsPipelineAsync(LogsPipeline body) {
    return createLogsPipelineWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a pipeline in your organization.
   *
   * @param body Definition of the new pipeline. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> createLogsPipelineWithHttpInfo(LogsPipeline body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLogsPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.createLogsPipeline",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Create a pipeline.
   *
   * <p>See {@link #createLogsPipelineWithHttpInfo}.
   *
   * @param body Definition of the new pipeline. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsPipeline>> createLogsPipelineWithHttpInfoAsync(
      LogsPipeline body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLogsPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.createLogsPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Delete a pipeline.
   *
   * <p>See {@link #deleteLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLogsPipeline(String pipelineId) throws ApiException {
    deleteLogsPipelineWithHttpInfo(pipelineId);
  }

  /**
   * Delete a pipeline.
   *
   * <p>See {@link #deleteLogsPipelineWithHttpInfoAsync}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteLogsPipelineAsync(String pipelineId) {
    return deleteLogsPipelineWithHttpInfoAsync(pipelineId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a given pipeline from your organization. This endpoint takes no JSON arguments.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLogsPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling deleteLogsPipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.deleteLogsPipeline",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a pipeline.
   *
   * <p>See {@link #deleteLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLogsPipelineWithHttpInfoAsync(
      String pipelineId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling deleteLogsPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.deleteLogsPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a pipeline.
   *
   * <p>See {@link #getLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to get. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   */
  public LogsPipeline getLogsPipeline(String pipelineId) throws ApiException {
    return getLogsPipelineWithHttpInfo(pipelineId).getData();
  }

  /**
   * Get a pipeline.
   *
   * <p>See {@link #getLogsPipelineWithHttpInfoAsync}.
   *
   * @param pipelineId ID of the pipeline to get. (required)
   * @return CompletableFuture&lt;LogsPipeline&gt;
   */
  public CompletableFuture<LogsPipeline> getLogsPipelineAsync(String pipelineId) {
    return getLogsPipelineWithHttpInfoAsync(pipelineId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific pipeline from your organization. This endpoint takes no JSON arguments.
   *
   * @param pipelineId ID of the pipeline to get. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> getLogsPipelineWithHttpInfo(String pipelineId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling getLogsPipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.getLogsPipeline",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Get a pipeline.
   *
   * <p>See {@link #getLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsPipeline>> getLogsPipelineWithHttpInfoAsync(
      String pipelineId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling getLogsPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.getLogsPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Get pipeline order.
   *
   * <p>See {@link #getLogsPipelineOrderWithHttpInfo}.
   *
   * @return LogsPipelinesOrder
   * @throws ApiException if fails to make API call
   */
  public LogsPipelinesOrder getLogsPipelineOrder() throws ApiException {
    return getLogsPipelineOrderWithHttpInfo().getData();
  }

  /**
   * Get pipeline order.
   *
   * <p>See {@link #getLogsPipelineOrderWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsPipelinesOrder&gt;
   */
  public CompletableFuture<LogsPipelinesOrder> getLogsPipelineOrderAsync() {
    return getLogsPipelineOrderWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the current order of your pipelines. This endpoint takes no JSON arguments.
   *
   * @return ApiResponse&lt;LogsPipelinesOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipelinesOrder> getLogsPipelineOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.getLogsPipelineOrder",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipelinesOrder>() {});
  }

  /**
   * Get pipeline order.
   *
   * <p>See {@link #getLogsPipelineOrderWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsPipelinesOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsPipelinesOrder>>
      getLogsPipelineOrderWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.getLogsPipelineOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsPipelinesOrder>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipelinesOrder>() {});
  }

  /**
   * Get all pipelines.
   *
   * <p>See {@link #listLogsPipelinesWithHttpInfo}.
   *
   * @return List&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LogsPipeline> listLogsPipelines() throws ApiException {
    return listLogsPipelinesWithHttpInfo().getData();
  }

  /**
   * Get all pipelines.
   *
   * <p>See {@link #listLogsPipelinesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;LogsPipeline&gt;&gt;
   */
  public CompletableFuture<List<LogsPipeline>> listLogsPipelinesAsync() {
    return listLogsPipelinesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all pipelines from your organization. This endpoint takes no JSON arguments.
   *
   * @return ApiResponse&lt;List&lt;LogsPipeline&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<LogsPipeline>> listLogsPipelinesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.listLogsPipelines",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<List<LogsPipeline>>() {});
  }

  /**
   * Get all pipelines.
   *
   * <p>See {@link #listLogsPipelinesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;LogsPipeline&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<LogsPipeline>>> listLogsPipelinesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.listLogsPipelines",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<LogsPipeline>>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<List<LogsPipeline>>() {});
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updateLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   */
  public LogsPipeline updateLogsPipeline(String pipelineId, LogsPipeline body) throws ApiException {
    return updateLogsPipelineWithHttpInfo(pipelineId, body).getData();
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updateLogsPipelineWithHttpInfoAsync}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return CompletableFuture&lt;LogsPipeline&gt;
   */
  public CompletableFuture<LogsPipeline> updateLogsPipelineAsync(
      String pipelineId, LogsPipeline body) {
    return updateLogsPipelineWithHttpInfoAsync(pipelineId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a given pipeline configuration to change it’s processors or their order.
   *
   * <p><strong>Note</strong>: Using this method updates your pipeline configuration by
   * <strong>replacing</strong> your current configuration with the new one sent to your Datadog
   * organization.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> updateLogsPipelineWithHttpInfo(
      String pipelineId, LogsPipeline body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling updateLogsPipeline");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsPipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.updateLogsPipeline",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updateLogsPipelineWithHttpInfo}.
   *
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsPipeline>> updateLogsPipelineWithHttpInfoAsync(
      String pipelineId, LogsPipeline body) {
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling updateLogsPipeline"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.updateLogsPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipeline>() {});
  }

  /**
   * Update pipeline order.
   *
   * <p>See {@link #updateLogsPipelineOrderWithHttpInfo}.
   *
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return LogsPipelinesOrder
   * @throws ApiException if fails to make API call
   */
  public LogsPipelinesOrder updateLogsPipelineOrder(LogsPipelinesOrder body) throws ApiException {
    return updateLogsPipelineOrderWithHttpInfo(body).getData();
  }

  /**
   * Update pipeline order.
   *
   * <p>See {@link #updateLogsPipelineOrderWithHttpInfoAsync}.
   *
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return CompletableFuture&lt;LogsPipelinesOrder&gt;
   */
  public CompletableFuture<LogsPipelinesOrder> updateLogsPipelineOrderAsync(
      LogsPipelinesOrder body) {
    return updateLogsPipelineOrderWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the order of your pipelines. Since logs are processed sequentially, reordering a
   * pipeline may change the structure and content of the data processed by other pipelines and
   * their processors.
   *
   * <p><strong>Note</strong>: Using the <code>PUT</code> method updates your pipeline order by
   * replacing your current order with the new one sent to your Datadog organization.
   *
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return ApiResponse&lt;LogsPipelinesOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipelinesOrder> updateLogsPipelineOrderWithHttpInfo(
      LogsPipelinesOrder body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsPipelineOrder");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.LogsPipelinesApi.updateLogsPipelineOrder",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipelinesOrder>() {});
  }

  /**
   * Update pipeline order.
   *
   * <p>See {@link #updateLogsPipelineOrderWithHttpInfo}.
   *
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsPipelinesOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsPipelinesOrder>>
      updateLogsPipelineOrderWithHttpInfoAsync(LogsPipelinesOrder body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsPipelinesOrder>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsPipelineOrder"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.LogsPipelinesApi.updateLogsPipelineOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsPipelinesOrder>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsPipelinesOrder>() {});
  }
}
