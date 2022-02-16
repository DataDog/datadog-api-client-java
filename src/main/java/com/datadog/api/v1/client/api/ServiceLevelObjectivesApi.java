package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.CheckCanDeleteSLOResponse;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponse;
import com.datadog.api.v1.client.model.SLOCorrectionListResponse;
import com.datadog.api.v1.client.model.SLODeleteResponse;
import com.datadog.api.v1.client.model.SLOHistoryResponse;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectivesApi {
  private ApiClient apiClient;

  public ServiceLevelObjectivesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectivesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check if SLOs can be safely deleted
   *
   * <p>See {@link #checkCanDeleteSLOWithHttpInfo}.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return CheckCanDeleteSLOResponse
   * @throws ApiException if fails to make API call
   */
  public CheckCanDeleteSLOResponse checkCanDeleteSLO(String ids) throws ApiException {
    return checkCanDeleteSLOWithHttpInfo(ids).getData();
  }

  /**
   * Check if SLOs can be safely deleted
   *
   * <p>See {@link #checkCanDeleteSLOWithHttpInfoAsync}.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return CompletableFuture&lt;CheckCanDeleteSLOResponse&gt;
   */
  public CompletableFuture<CheckCanDeleteSLOResponse> checkCanDeleteSLOAsync(String ids) {
    return checkCanDeleteSLOWithHttpInfoAsync(ids)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Check if SLOs can be safely deleted
   *
   * <p>Check if an SLO can be safely deleted. For example, assure an SLO can be deleted without
   * disrupting a dashboard.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return ApiResponse&lt;CheckCanDeleteSLOResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CheckCanDeleteSLOResponse> checkCanDeleteSLOWithHttpInfo(String ids)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ids' when calling checkCanDeleteSLO");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/can_delete";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteSLO");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.checkCanDeleteSLO",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<CheckCanDeleteSLOResponse>() {});
  }

  /**
   * Check if SLOs can be safely deleted
   *
   * <p>See {@link #checkCanDeleteSLOWithHttpInfo}.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CheckCanDeleteSLOResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CheckCanDeleteSLOResponse>>
      checkCanDeleteSLOWithHttpInfoAsync(String ids) {
    Object localVarPostBody = null;

    // verify the required parameter 'ids' is set
    if (ids == null) {
      CompletableFuture<ApiResponse<CheckCanDeleteSLOResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ids' when calling checkCanDeleteSLO"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/can_delete";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteSLO");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.checkCanDeleteSLO",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CheckCanDeleteSLOResponse>> result = new CompletableFuture<>();
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
        new GenericType<CheckCanDeleteSLOResponse>() {});
  }

  /**
   * Create an SLO object
   *
   * <p>See {@link #createSLOWithHttpInfo}.
   *
   * @param body Service level objective request object. (required)
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOListResponse createSLO(ServiceLevelObjectiveRequest body) throws ApiException {
    return createSLOWithHttpInfo(body).getData();
  }

  /**
   * Create an SLO object
   *
   * <p>See {@link #createSLOWithHttpInfoAsync}.
   *
   * @param body Service level objective request object. (required)
   * @return CompletableFuture&lt;SLOListResponse&gt;
   */
  public CompletableFuture<SLOListResponse> createSLOAsync(ServiceLevelObjectiveRequest body) {
    return createSLOWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an SLO object
   *
   * <p>Create a service level objective object.
   *
   * @param body Service level objective request object. (required)
   * @return ApiResponse&lt;SLOListResponse&gt;
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
  public ApiResponse<SLOListResponse> createSLOWithHttpInfo(ServiceLevelObjectiveRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLO");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLO");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.createSLO",
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
        new GenericType<SLOListResponse>() {});
  }

  /**
   * Create an SLO object
   *
   * <p>See {@link #createSLOWithHttpInfo}.
   *
   * @param body Service level objective request object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOListResponse>> createSLOWithHttpInfoAsync(
      ServiceLevelObjectiveRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createSLO"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLO");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.createSLO",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOListResponse>() {});
  }

  /** Manage optional parameters to deleteSLO. */
  public static class DeleteSLOOptionalParameters {
    private String force;

    /**
     * Set force
     *
     * @param force Delete the monitor even if it&#39;s referenced by other resources (for example
     *     SLO, composite monitor). (optional)
     * @return DeleteSLOOptionalParameters
     */
    public DeleteSLOOptionalParameters force(String force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete an SLO
   *
   * <p>See {@link #deleteSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective. (required)
   * @return SLODeleteResponse
   * @throws ApiException if fails to make API call
   */
  public SLODeleteResponse deleteSLO(String sloId) throws ApiException {
    return deleteSLOWithHttpInfo(sloId, new DeleteSLOOptionalParameters()).getData();
  }

  /**
   * Delete an SLO
   *
   * <p>See {@link #deleteSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective. (required)
   * @return CompletableFuture&lt;SLODeleteResponse&gt;
   */
  public CompletableFuture<SLODeleteResponse> deleteSLOAsync(String sloId) {
    return deleteSLOWithHttpInfoAsync(sloId, new DeleteSLOOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an SLO
   *
   * <p>See {@link #deleteSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return SLODeleteResponse
   * @throws ApiException if fails to make API call
   */
  public SLODeleteResponse deleteSLO(String sloId, DeleteSLOOptionalParameters parameters)
      throws ApiException {
    return deleteSLOWithHttpInfo(sloId, parameters).getData();
  }

  /**
   * Delete an SLO
   *
   * <p>See {@link #deleteSLOWithHttpInfoAsync}.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SLODeleteResponse&gt;
   */
  public CompletableFuture<SLODeleteResponse> deleteSLOAsync(
      String sloId, DeleteSLOOptionalParameters parameters) {
    return deleteSLOWithHttpInfoAsync(sloId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an SLO
   *
   * <p>Permanently delete the specified service level objective object. If an SLO is used in a
   * dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error because the
   * SLO is referenced in a dashboard.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLODeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLODeleteResponse> deleteSLOWithHttpInfo(
      String sloId, DeleteSLOOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling deleteSLO");
    }
    String force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLO");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.deleteSLO",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLODeleteResponse>() {});
  }

  /**
   * Delete an SLO
   *
   * <p>See {@link #deleteSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SLODeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLODeleteResponse>> deleteSLOWithHttpInfoAsync(
      String sloId, DeleteSLOOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      CompletableFuture<ApiResponse<SLODeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'sloId' when calling deleteSLO"));
      return result;
    }
    String force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLO");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.deleteSLO",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLODeleteResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLODeleteResponse>() {});
  }

  /**
   * Bulk Delete SLO Timeframes
   *
   * <p>See {@link #deleteSLOTimeframeInBulkWithHttpInfo}.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return SLOBulkDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public SLOBulkDeleteResponse deleteSLOTimeframeInBulk(Map<String, List<SLOTimeframe>> body)
      throws ApiException {
    return deleteSLOTimeframeInBulkWithHttpInfo(body).getData();
  }

  /**
   * Bulk Delete SLO Timeframes
   *
   * <p>See {@link #deleteSLOTimeframeInBulkWithHttpInfoAsync}.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return CompletableFuture&lt;SLOBulkDeleteResponse&gt;
   */
  public CompletableFuture<SLOBulkDeleteResponse> deleteSLOTimeframeInBulkAsync(
      Map<String, List<SLOTimeframe>> body) {
    return deleteSLOTimeframeInBulkWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Bulk Delete SLO Timeframes
   *
   * <p>Delete (or partially delete) multiple service level objective objects. This endpoint
   * facilitates deletion of one or more thresholds for one or more service level objective objects.
   * If all thresholds are deleted, the service level objective object is deleted as well.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return ApiResponse&lt;SLOBulkDeleteResponse&gt;
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
  public ApiResponse<SLOBulkDeleteResponse> deleteSLOTimeframeInBulkWithHttpInfo(
      Map<String, List<SLOTimeframe>> body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteSLOTimeframeInBulk");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOTimeframeInBulk");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.deleteSLOTimeframeInBulk",
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
        new GenericType<SLOBulkDeleteResponse>() {});
  }

  /**
   * Bulk Delete SLO Timeframes
   *
   * <p>See {@link #deleteSLOTimeframeInBulkWithHttpInfo}.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOBulkDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOBulkDeleteResponse>>
      deleteSLOTimeframeInBulkWithHttpInfoAsync(Map<String, List<SLOTimeframe>> body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOBulkDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteSLOTimeframeInBulk"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOTimeframeInBulk");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.deleteSLOTimeframeInBulk",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOBulkDeleteResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOBulkDeleteResponse>() {});
  }

  /** Manage optional parameters to getSLO. */
  public static class GetSLOOptionalParameters {
    private Boolean withConfiguredAlertIds;

    /**
     * Set withConfiguredAlertIds
     *
     * @param withConfiguredAlertIds Get the IDs of SLO monitors that reference this SLO. (optional)
     * @return GetSLOOptionalParameters
     */
    public GetSLOOptionalParameters withConfiguredAlertIds(Boolean withConfiguredAlertIds) {
      this.withConfiguredAlertIds = withConfiguredAlertIds;
      return this;
    }
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>See {@link #getSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return SLOResponse
   * @throws ApiException if fails to make API call
   */
  public SLOResponse getSLO(String sloId) throws ApiException {
    return getSLOWithHttpInfo(sloId, new GetSLOOptionalParameters()).getData();
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>See {@link #getSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return CompletableFuture&lt;SLOResponse&gt;
   */
  public CompletableFuture<SLOResponse> getSLOAsync(String sloId) {
    return getSLOWithHttpInfoAsync(sloId, new GetSLOOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>See {@link #getSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return SLOResponse
   * @throws ApiException if fails to make API call
   */
  public SLOResponse getSLO(String sloId, GetSLOOptionalParameters parameters) throws ApiException {
    return getSLOWithHttpInfo(sloId, parameters).getData();
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>See {@link #getSLOWithHttpInfoAsync}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SLOResponse&gt;
   */
  public CompletableFuture<SLOResponse> getSLOAsync(
      String sloId, GetSLOOptionalParameters parameters) {
    return getSLOWithHttpInfoAsync(sloId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>Get a service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOResponse> getSLOWithHttpInfo(
      String sloId, GetSLOOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSLO");
    }
    Boolean withConfiguredAlertIds = parameters.withConfiguredAlertIds;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "with_configured_alert_ids", withConfiguredAlertIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLO");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.getSLO",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOResponse>() {});
  }

  /**
   * Get an SLO&#39;s details
   *
   * <p>See {@link #getSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SLOResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOResponse>> getSLOWithHttpInfoAsync(
      String sloId, GetSLOOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      CompletableFuture<ApiResponse<SLOResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'sloId' when calling getSLO"));
      return result;
    }
    Boolean withConfiguredAlertIds = parameters.withConfiguredAlertIds;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "with_configured_alert_ids", withConfiguredAlertIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLO");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.getSLO",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOResponse>() {});
  }

  /**
   * Get Corrections For an SLO
   *
   * <p>See {@link #getSLOCorrectionsWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return SLOCorrectionListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOCorrectionListResponse getSLOCorrections(String sloId) throws ApiException {
    return getSLOCorrectionsWithHttpInfo(sloId).getData();
  }

  /**
   * Get Corrections For an SLO
   *
   * <p>See {@link #getSLOCorrectionsWithHttpInfoAsync}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return CompletableFuture&lt;SLOCorrectionListResponse&gt;
   */
  public CompletableFuture<SLOCorrectionListResponse> getSLOCorrectionsAsync(String sloId) {
    return getSLOCorrectionsWithHttpInfoAsync(sloId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Corrections For an SLO
   *
   * <p>Get corrections applied to an SLO
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return ApiResponse&lt;SLOCorrectionListResponse&gt;
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
  public ApiResponse<SLOCorrectionListResponse> getSLOCorrectionsWithHttpInfo(String sloId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloId' when calling getSLOCorrections");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}/corrections"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOCorrections");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.getSLOCorrections",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOCorrectionListResponse>() {});
  }

  /**
   * Get Corrections For an SLO
   *
   * <p>See {@link #getSLOCorrectionsWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionListResponse>>
      getSLOCorrectionsWithHttpInfoAsync(String sloId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      CompletableFuture<ApiResponse<SLOCorrectionListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'sloId' when calling getSLOCorrections"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}/corrections"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOCorrections");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.getSLOCorrections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionListResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOCorrectionListResponse>() {});
  }

  /** Manage optional parameters to getSLOHistory. */
  public static class GetSLOHistoryOptionalParameters {
    private Double target;
    private Boolean applyCorrection;

    /**
     * Set target
     *
     * @param target The SLO target. If &#x60;target&#x60; is passed in, the response will include
     *     the remaining error budget and a timeframe value of &#x60;custom&#x60;. (optional)
     * @return GetSLOHistoryOptionalParameters
     */
    public GetSLOHistoryOptionalParameters target(Double target) {
      this.target = target;
      return this;
    }

    /**
     * Set applyCorrection
     *
     * @param applyCorrection Defaults to &#x60;true&#x60;. If any SLO corrections are applied and
     *     this parameter is set to &#x60;false&#x60;, then the corrections will not be applied and
     *     the SLI values will not be affected. (optional)
     * @return GetSLOHistoryOptionalParameters
     */
    public GetSLOHistoryOptionalParameters applyCorrection(Boolean applyCorrection) {
      this.applyCorrection = applyCorrection;
      return this;
    }
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>See {@link #getSLOHistoryWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @return SLOHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public SLOHistoryResponse getSLOHistory(String sloId, Long fromTs, Long toTs)
      throws ApiException {
    return getSLOHistoryWithHttpInfo(sloId, fromTs, toTs, new GetSLOHistoryOptionalParameters())
        .getData();
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>See {@link #getSLOHistoryWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @return CompletableFuture&lt;SLOHistoryResponse&gt;
   */
  public CompletableFuture<SLOHistoryResponse> getSLOHistoryAsync(
      String sloId, Long fromTs, Long toTs) {
    return getSLOHistoryWithHttpInfoAsync(
            sloId, fromTs, toTs, new GetSLOHistoryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>See {@link #getSLOHistoryWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return SLOHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public SLOHistoryResponse getSLOHistory(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters)
      throws ApiException {
    return getSLOHistoryWithHttpInfo(sloId, fromTs, toTs, parameters).getData();
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>See {@link #getSLOHistoryWithHttpInfoAsync}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SLOHistoryResponse&gt;
   */
  public CompletableFuture<SLOHistoryResponse> getSLOHistoryAsync(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters) {
    return getSLOHistoryWithHttpInfoAsync(sloId, fromTs, toTs, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>Get a specific SLO’s history, regardless of its SLO type. The detailed history data is
   * structured according to the source data type. For example, metric data is included for event
   * SLOs that use the metric source, and monitor SLO types include the monitor transition history.
   * **Note:** There are different response formats for event based and time based SLOs. Examples of
   * both are shown.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOHistoryResponse&gt;
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
  public ApiResponse<SLOHistoryResponse> getSLOHistoryWithHttpInfo(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloId' when calling getSLOHistory");
    }

    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fromTs' when calling getSLOHistory");
    }

    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      throw new ApiException(
          400, "Missing the required parameter 'toTs' when calling getSLOHistory");
    }
    Double target = parameters.target;
    Boolean applyCorrection = parameters.applyCorrection;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}/history"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apply_correction", applyCorrection));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOHistory");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.getSLOHistory",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOHistoryResponse>() {});
  }

  /**
   * Get an SLO&#39;s history
   *
   * <p>See {@link #getSLOHistoryWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SLOHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOHistoryResponse>> getSLOHistoryWithHttpInfoAsync(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      CompletableFuture<ApiResponse<SLOHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'sloId' when calling getSLOHistory"));
      return result;
    }

    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      CompletableFuture<ApiResponse<SLOHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fromTs' when calling getSLOHistory"));
      return result;
    }

    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      CompletableFuture<ApiResponse<SLOHistoryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'toTs' when calling getSLOHistory"));
      return result;
    }
    Double target = parameters.target;
    Boolean applyCorrection = parameters.applyCorrection;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}/history"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apply_correction", applyCorrection));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOHistory");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.getSLOHistory",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOHistoryResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOHistoryResponse>() {});
  }

  /** Manage optional parameters to listSLOs. */
  public static class ListSLOsOptionalParameters {
    private String ids;
    private String query;
    private String tagsQuery;
    private String metricsQuery;
    private Long limit;
    private Long offset;

    /**
     * Set ids
     *
     * @param ids A comma separated list of the IDs of the service level objectives objects.
     *     (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters ids(String ids) {
      this.ids = ids;
      return this;
    }

    /**
     * Set query
     *
     * @param query The query string to filter results based on SLO names. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set tagsQuery
     *
     * @param tagsQuery The query string to filter results based on a single SLO tag. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters tagsQuery(String tagsQuery) {
      this.tagsQuery = tagsQuery;
      return this;
    }

    /**
     * Set metricsQuery
     *
     * @param metricsQuery The query string to filter results based on SLO numerator and
     *     denominator. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters metricsQuery(String metricsQuery) {
      this.metricsQuery = metricsQuery;
      return this;
    }

    /**
     * Set limit
     *
     * @param limit The number of SLOs to return in the response. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset
     *
     * @param offset The specific offset to use as the beginning of the returned response.
     *     (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * Get all SLOs
   *
   * <p>See {@link #listSLOsWithHttpInfo}.
   *
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOListResponse listSLOs() throws ApiException {
    return listSLOsWithHttpInfo(new ListSLOsOptionalParameters()).getData();
  }

  /**
   * Get all SLOs
   *
   * <p>See {@link #listSLOsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;SLOListResponse&gt;
   */
  public CompletableFuture<SLOListResponse> listSLOsAsync() {
    return listSLOsWithHttpInfoAsync(new ListSLOsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all SLOs
   *
   * <p>See {@link #listSLOsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOListResponse listSLOs(ListSLOsOptionalParameters parameters) throws ApiException {
    return listSLOsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all SLOs
   *
   * <p>See {@link #listSLOsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SLOListResponse&gt;
   */
  public CompletableFuture<SLOListResponse> listSLOsAsync(ListSLOsOptionalParameters parameters) {
    return listSLOsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all SLOs
   *
   * <p>Get a list of service level objective objects for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOListResponse&gt;
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
  public ApiResponse<SLOListResponse> listSLOsWithHttpInfo(ListSLOsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    String ids = parameters.ids;
    String query = parameters.query;
    String tagsQuery = parameters.tagsQuery;
    String metricsQuery = parameters.metricsQuery;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags_query", tagsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metrics_query", metricsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOs");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.listSLOs",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOListResponse>() {});
  }

  /**
   * Get all SLOs
   *
   * <p>See {@link #listSLOsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SLOListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOListResponse>> listSLOsWithHttpInfoAsync(
      ListSLOsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String ids = parameters.ids;
    String query = parameters.query;
    String tagsQuery = parameters.tagsQuery;
    String metricsQuery = parameters.metricsQuery;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags_query", tagsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metrics_query", metricsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOs");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.listSLOs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOListResponse>() {});
  }

  /**
   * Update an SLO
   *
   * <p>See {@link #updateSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOListResponse updateSLO(String sloId, ServiceLevelObjective body) throws ApiException {
    return updateSLOWithHttpInfo(sloId, body).getData();
  }

  /**
   * Update an SLO
   *
   * <p>See {@link #updateSLOWithHttpInfoAsync}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return CompletableFuture&lt;SLOListResponse&gt;
   */
  public CompletableFuture<SLOListResponse> updateSLOAsync(
      String sloId, ServiceLevelObjective body) {
    return updateSLOWithHttpInfoAsync(sloId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an SLO
   *
   * <p>Update the specified service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return ApiResponse&lt;SLOListResponse&gt;
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
  public ApiResponse<SLOListResponse> updateSLOWithHttpInfo(
      String sloId, ServiceLevelObjective body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling updateSLO");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSLO");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLO");

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectivesApi.updateSLO",
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
        new GenericType<SLOListResponse>() {});
  }

  /**
   * Update an SLO
   *
   * <p>See {@link #updateSLOWithHttpInfo}.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOListResponse>> updateSLOWithHttpInfoAsync(
      String sloId, ServiceLevelObjective body) {
    Object localVarPostBody = body;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'sloId' when calling updateSLO"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateSLO"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLO");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectivesApi.updateSLO",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOListResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOListResponse>() {});
  }
}
