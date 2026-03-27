
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.ListPipelinesResponse;
import com.datadog.api.client.v2.model.ObservabilityPipeline;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ValidationResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
 * See {@link #createPipelineWithHttpInfo}.
 *
 * @param body  (required)
 * @return ObservabilityPipeline
 * @throws ApiException if fails to make API call
 */
  public ObservabilityPipeline  createPipeline(ObservabilityPipelineSpec body) throws ApiException {
    return createPipelineWithHttpInfo(body).getData();
  }

  /**
 * Create a new pipeline.
 *
 * See {@link #createPipelineWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;ObservabilityPipeline&gt;
 */
  public CompletableFuture<ObservabilityPipeline>createPipelineAsync(ObservabilityPipelineSpec body) {
    return createPipelineWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new pipeline.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;ObservabilityPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ObservabilityPipeline> createPipelineWithHttpInfo(ObservabilityPipelineSpec body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.createPipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
   * Create a new pipeline.
   *
   * See {@link #createPipelineWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ObservabilityPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ObservabilityPipeline>> createPipelineWithHttpInfoAsync(ObservabilityPipelineSpec body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createPipeline"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.createPipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
 * Delete a pipeline.
 *
 * See {@link #deletePipelineWithHttpInfo}.
 *
 * @param pipelineId The ID of the pipeline to delete. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deletePipeline(String pipelineId) throws ApiException {
    deletePipelineWithHttpInfo(pipelineId);
  }

  /**
 * Delete a pipeline.
 *
 * See {@link #deletePipelineWithHttpInfoAsync}.
 *
 * @param pipelineId The ID of the pipeline to delete. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deletePipelineAsync(String pipelineId) {
    return deletePipelineWithHttpInfoAsync(pipelineId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a pipeline.</p>
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling deletePipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.deletePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a pipeline.
   *
   * See {@link #deletePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePipelineWithHttpInfoAsync(String pipelineId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'pipelineId' when calling deletePipeline"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.deletePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a specific pipeline.
 *
 * See {@link #getPipelineWithHttpInfo}.
 *
 * @param pipelineId The ID of the pipeline to retrieve. (required)
 * @return ObservabilityPipeline
 * @throws ApiException if fails to make API call
 */
  public ObservabilityPipeline  getPipeline(String pipelineId) throws ApiException {
    return getPipelineWithHttpInfo(pipelineId).getData();
  }

  /**
 * Get a specific pipeline.
 *
 * See {@link #getPipelineWithHttpInfoAsync}.
 *
 * @param pipelineId The ID of the pipeline to retrieve. (required)
 * @return CompletableFuture&lt;ObservabilityPipeline&gt;
 */
  public CompletableFuture<ObservabilityPipeline>getPipelineAsync(String pipelineId) {
    return getPipelineWithHttpInfoAsync(pipelineId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific pipeline by its ID.</p>
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return ApiResponse&lt;ObservabilityPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ObservabilityPipeline> getPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling getPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.getPipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
   * Get a specific pipeline.
   *
   * See {@link #getPipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ObservabilityPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ObservabilityPipeline>> getPipelineWithHttpInfoAsync(String pipelineId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
        CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'pipelineId' when calling getPipeline"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.getPipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
   * Manage optional parameters to listPipelines.
   */
  public static class ListPipelinesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListPipelinesOptionalParameters
     */
    public ListPipelinesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListPipelinesOptionalParameters
     */
    public ListPipelinesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * List pipelines.
 *
 * See {@link #listPipelinesWithHttpInfo}.
 *
 * @return ListPipelinesResponse
 * @throws ApiException if fails to make API call
 */
  public ListPipelinesResponse listPipelines () throws ApiException {
    return listPipelinesWithHttpInfo(new ListPipelinesOptionalParameters()).getData();
  }

  /**
 * List pipelines.
 *
 * See {@link #listPipelinesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListPipelinesResponse&gt;
 */
  public CompletableFuture<ListPipelinesResponse>listPipelinesAsync() {
    return listPipelinesWithHttpInfoAsync(new ListPipelinesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List pipelines.
 *
 * See {@link #listPipelinesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListPipelinesResponse
 * @throws ApiException if fails to make API call
 */
  public ListPipelinesResponse listPipelines(ListPipelinesOptionalParameters parameters) throws ApiException {
    return listPipelinesWithHttpInfo(parameters).getData();
  }

  /**
 * List pipelines.
 *
 * See {@link #listPipelinesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListPipelinesResponse&gt;
 */
  public CompletableFuture<ListPipelinesResponse>listPipelinesAsync(ListPipelinesOptionalParameters parameters) {
    return listPipelinesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a list of pipelines.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListPipelinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListPipelinesResponse> listPipelinesWithHttpInfo(ListPipelinesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.listPipelines", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListPipelinesResponse>() {});
  }

  /**
   * List pipelines.
   *
   * See {@link #listPipelinesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListPipelinesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListPipelinesResponse>> listPipelinesWithHttpInfoAsync(ListPipelinesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.listPipelines", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListPipelinesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListPipelinesResponse>() {});
  }

  /**
 * Update a pipeline.
 *
 * See {@link #updatePipelineWithHttpInfo}.
 *
 * @param pipelineId The ID of the pipeline to update. (required)
 * @param body  (required)
 * @return ObservabilityPipeline
 * @throws ApiException if fails to make API call
 */
  public ObservabilityPipeline  updatePipeline(String pipelineId, ObservabilityPipeline body) throws ApiException {
    return updatePipelineWithHttpInfo(pipelineId, body).getData();
  }

  /**
 * Update a pipeline.
 *
 * See {@link #updatePipelineWithHttpInfoAsync}.
 *
 * @param pipelineId The ID of the pipeline to update. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;ObservabilityPipeline&gt;
 */
  public CompletableFuture<ObservabilityPipeline>updatePipelineAsync(String pipelineId, ObservabilityPipeline body) {
    return updatePipelineWithHttpInfoAsync(pipelineId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a pipeline.</p>
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body  (required)
   * @return ApiResponse&lt;ObservabilityPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ObservabilityPipeline> updatePipelineWithHttpInfo(String pipelineId, ObservabilityPipeline body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling updatePipeline");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.updatePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
   * Update a pipeline.
   *
   * See {@link #updatePipelineWithHttpInfo}.
   *
   * @param pipelineId The ID of the pipeline to update. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ObservabilityPipeline&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ObservabilityPipeline>> updatePipelineWithHttpInfoAsync(String pipelineId, ObservabilityPipeline body) {
    Object localVarPostBody = body;

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
        CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'pipelineId' when calling updatePipeline"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updatePipeline"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.updatePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ObservabilityPipeline>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ObservabilityPipeline>() {});
  }

  /**
 * Validate an observability pipeline.
 *
 * See {@link #validatePipelineWithHttpInfo}.
 *
 * @param body  (required)
 * @return ValidationResponse
 * @throws ApiException if fails to make API call
 */
  public ValidationResponse  validatePipeline(ObservabilityPipelineSpec body) throws ApiException {
    return validatePipelineWithHttpInfo(body).getData();
  }

  /**
 * Validate an observability pipeline.
 *
 * See {@link #validatePipelineWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;ValidationResponse&gt;
 */
  public CompletableFuture<ValidationResponse>validatePipelineAsync(ObservabilityPipelineSpec body) {
    return validatePipelineWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Validates a pipeline configuration without creating or updating any resources.
   * Returns a list of validation errors, if any.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;ValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ValidationResponse> validatePipelineWithHttpInfo(ObservabilityPipelineSpec body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling validatePipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/validate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.validatePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ValidationResponse>() {});
  }

  /**
   * Validate an observability pipeline.
   *
   * See {@link #validatePipelineWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ValidationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ValidationResponse>> validatePipelineWithHttpInfoAsync(ObservabilityPipelineSpec body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ValidationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling validatePipeline"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/obs-pipelines/pipelines/validate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ObservabilityPipelinesApi.validatePipeline", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ValidationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ValidationResponse>() {});
  }
}