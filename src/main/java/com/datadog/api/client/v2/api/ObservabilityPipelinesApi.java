package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Pipeline;
import com.datadog.api.client.v2.model.PipelineCreateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelinesApi {
  private ApiClient apiClient;

  public ObservabilityPipelinesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ObservabilityPipelinesApi(ApiClient apiClient) {
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
   * Create a new pipeline.
   *
   * <p>See {@link #createPipelineWithHttpInfo}.
   *
   * @param body (required)
   * @return Pipeline
   * @throws ApiException if fails to make API call
   */
  public Pipeline createPipeline(PipelineCreateRequest body) throws ApiException {
    return createPipelineWithHttpInfo(body).getData();
  }

  /**
   * Create a new pipeline.
   *
   * <p>See {@link #createPipelineWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;Pipeline&gt;
   */
  public CompletableFuture<Pipeline> createPipelineAsync(PipelineCreateRequest body) {
    return createPipelineWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new pipeline.
   *
   * @param body (required)
   * @return ApiResponse&lt;Pipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Pipeline> createPipelineWithHttpInfo(PipelineCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createPipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/obs_pipelines/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ObservabilityPipelinesApi.createPipeline",
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
        new GenericType<Pipeline>() {});
  }

  /**
   * Create a new pipeline.
   *
   * <p>See {@link #createPipelineWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Pipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Pipeline>> createPipelineWithHttpInfoAsync(
      PipelineCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createPipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/obs_pipelines/pipelines";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ObservabilityPipelinesApi.createPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
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
        new GenericType<Pipeline>() {});
  }

  /**
   * Delete a pipeline.
   *
   * <p>See {@link #deletePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePipeline(String pipelineId) throws ApiException {
    deletePipelineWithHttpInfo(pipelineId);
  }

  /**
   * Delete a pipeline.
   *
   * <p>See {@link #deletePipelineWithHttpInfoAsync}.
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deletePipelineAsync(String pipelineId) {
    return deletePipelineWithHttpInfoAsync(pipelineId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a pipeline.
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePipelineWithHttpInfo(String pipelineId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deletePipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling deletePipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ObservabilityPipelinesApi.deletePipeline",
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
   * <p>See {@link #deletePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePipelineWithHttpInfoAsync(String pipelineId) {
    // Check if unstable operation is enabled
    String operationId = "deletePipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling deletePipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ObservabilityPipelinesApi.deletePipeline",
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
   * Get a specific pipeline.
   *
   * <p>See {@link #getPipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return Pipeline
   * @throws ApiException if fails to make API call
   */
  public Pipeline getPipeline(String pipelineId) throws ApiException {
    return getPipelineWithHttpInfo(pipelineId).getData();
  }

  /**
   * Get a specific pipeline.
   *
   * <p>See {@link #getPipelineWithHttpInfoAsync}.
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return CompletableFuture&lt;Pipeline&gt;
   */
  public CompletableFuture<Pipeline> getPipelineAsync(String pipelineId) {
    return getPipelineWithHttpInfoAsync(pipelineId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific pipeline by its ID.
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return ApiResponse&lt;Pipeline&gt;
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
  public ApiResponse<Pipeline> getPipelineWithHttpInfo(String pipelineId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getPipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling getPipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ObservabilityPipelinesApi.getPipeline",
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
        new GenericType<Pipeline>() {});
  }

  /**
   * Get a specific pipeline.
   *
   * <p>See {@link #getPipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Pipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Pipeline>> getPipelineWithHttpInfoAsync(String pipelineId) {
    // Check if unstable operation is enabled
    String operationId = "getPipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling getPipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ObservabilityPipelinesApi.getPipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
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
        new GenericType<Pipeline>() {});
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updatePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body (required)
   * @return Pipeline
   * @throws ApiException if fails to make API call
   */
  public Pipeline updatePipeline(String pipelineId, Pipeline body) throws ApiException {
    return updatePipelineWithHttpInfo(pipelineId, body).getData();
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updatePipelineWithHttpInfoAsync}.
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Pipeline&gt;
   */
  public CompletableFuture<Pipeline> updatePipelineAsync(String pipelineId, Pipeline body) {
    return updatePipelineWithHttpInfoAsync(pipelineId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a pipeline.
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;Pipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Pipeline> updatePipelineWithHttpInfo(String pipelineId, Pipeline body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updatePipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pipelineId' when calling updatePipeline");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePipeline");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ObservabilityPipelinesApi.updatePipeline",
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
        new GenericType<Pipeline>() {});
  }

  /**
   * Update a pipeline.
   *
   * <p>See {@link #updatePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Pipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Pipeline>> updatePipelineWithHttpInfoAsync(
      String pipelineId, Pipeline body) {
    // Check if unstable operation is enabled
    String operationId = "updatePipeline";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pipelineId' when calling updatePipeline"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePipeline"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/obs_pipelines/pipelines/{pipeline_id}"
            .replaceAll(
                "\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ObservabilityPipelinesApi.updatePipeline",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Pipeline>> result = new CompletableFuture<>();
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
        new GenericType<Pipeline>() {});
  }
}
