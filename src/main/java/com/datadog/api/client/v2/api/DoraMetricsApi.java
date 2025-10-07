package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DORADeploymentRequest;
import com.datadog.api.client.v2.model.DORADeploymentResponse;
import com.datadog.api.client.v2.model.DORAFailureRequest;
import com.datadog.api.client.v2.model.DORAFailureResponse;
import com.datadog.api.client.v2.model.DORAFetchResponse;
import com.datadog.api.client.v2.model.DORAListDeploymentsRequest;
import com.datadog.api.client.v2.model.DORAListFailuresRequest;
import com.datadog.api.client.v2.model.DORAListResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DoraMetricsApi {
  private ApiClient apiClient;

  public DoraMetricsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DoraMetricsApi(ApiClient apiClient) {
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
   * Send a deployment event.
   *
   * <p>See {@link #createDORADeploymentWithHttpInfo}.
   *
   * @param body (required)
   * @return DORADeploymentResponse
   * @throws ApiException if fails to make API call
   */
  public DORADeploymentResponse createDORADeployment(DORADeploymentRequest body)
      throws ApiException {
    return createDORADeploymentWithHttpInfo(body).getData();
  }

  /**
   * Send a deployment event.
   *
   * <p>See {@link #createDORADeploymentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORADeploymentResponse&gt;
   */
  public CompletableFuture<DORADeploymentResponse> createDORADeploymentAsync(
      DORADeploymentRequest body) {
    return createDORADeploymentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to provide deployment data.
   *
   * <p>This is necessary for: - Deployment Frequency - Change Lead Time - Change Failure Rate
   *
   * @param body (required)
   * @return ApiResponse&lt;DORADeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> OK - but delayed due to incident </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORADeploymentResponse> createDORADeploymentWithHttpInfo(
      DORADeploymentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDORADeployment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/deployment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.createDORADeployment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DORADeploymentResponse>() {});
  }

  /**
   * Send a deployment event.
   *
   * <p>See {@link #createDORADeploymentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORADeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORADeploymentResponse>>
      createDORADeploymentWithHttpInfoAsync(DORADeploymentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORADeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDORADeployment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/deployment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.createDORADeployment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORADeploymentResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORADeploymentResponse>() {});
  }

  /**
   * Send a failure event.
   *
   * <p>See {@link #createDORAFailureWithHttpInfo}.
   *
   * @param body (required)
   * @return DORAFailureResponse
   * @throws ApiException if fails to make API call
   */
  public DORAFailureResponse createDORAFailure(DORAFailureRequest body) throws ApiException {
    return createDORAFailureWithHttpInfo(body).getData();
  }

  /**
   * Send a failure event.
   *
   * <p>See {@link #createDORAFailureWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORAFailureResponse&gt;
   */
  public CompletableFuture<DORAFailureResponse> createDORAFailureAsync(DORAFailureRequest body) {
    return createDORAFailureWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to provide failure data.
   *
   * <p>This is necessary for: - Change Failure Rate - Time to Restore
   *
   * @param body (required)
   * @return ApiResponse&lt;DORAFailureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> OK - but delayed due to incident </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORAFailureResponse> createDORAFailureWithHttpInfo(DORAFailureRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDORAFailure");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/failure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.createDORAFailure",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DORAFailureResponse>() {});
  }

  /**
   * Send a failure event.
   *
   * <p>See {@link #createDORAFailureWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAFailureResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAFailureResponse>> createDORAFailureWithHttpInfoAsync(
      DORAFailureRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORAFailureResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDORAFailure"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/failure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.createDORAFailure",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAFailureResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAFailureResponse>() {});
  }

  /**
   * Send an incident event.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfo}.
   *
   * @param body (required)
   * @return DORAFailureResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public DORAFailureResponse createDORAIncident(DORAFailureRequest body) throws ApiException {
    return createDORAIncidentWithHttpInfo(body).getData();
  }

  /**
   * Send an incident event.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORAFailureResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<DORAFailureResponse> createDORAIncidentAsync(DORAFailureRequest body) {
    return createDORAIncidentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>Note</strong>: This endpoint is deprecated. Please use <code>/api/v2/dora/failure
   * </code> instead.
   *
   * <p>Use this API endpoint to provide failure data.
   *
   * <p>This is necessary for: - Change Failure Rate - Time to Restore
   *
   * @param body (required)
   * @return ApiResponse&lt;DORAFailureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> OK - but delayed due to incident </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<DORAFailureResponse> createDORAIncidentWithHttpInfo(DORAFailureRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDORAIncident");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/incident";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.createDORAIncident",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DORAFailureResponse>() {});
  }

  /**
   * Send an incident event.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAFailureResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<DORAFailureResponse>> createDORAIncidentWithHttpInfoAsync(
      DORAFailureRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORAFailureResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDORAIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/incident";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.createDORAIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAFailureResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAFailureResponse>() {});
  }

  /**
   * Delete a deployment event.
   *
   * <p>See {@link #deleteDORADeploymentWithHttpInfo}.
   *
   * @param deploymentId The ID of the deployment event to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDORADeployment(String deploymentId) throws ApiException {
    deleteDORADeploymentWithHttpInfo(deploymentId);
  }

  /**
   * Delete a deployment event.
   *
   * <p>See {@link #deleteDORADeploymentWithHttpInfoAsync}.
   *
   * @param deploymentId The ID of the deployment event to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDORADeploymentAsync(String deploymentId) {
    return deleteDORADeploymentWithHttpInfoAsync(deploymentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to delete a deployment event.
   *
   * @param deploymentId The ID of the deployment event to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDORADeploymentWithHttpInfo(String deploymentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deploymentId' when calling deleteDORADeployment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/deployment/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.deleteDORADeployment",
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
   * Delete a deployment event.
   *
   * <p>See {@link #deleteDORADeploymentWithHttpInfo}.
   *
   * @param deploymentId The ID of the deployment event to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDORADeploymentWithHttpInfoAsync(
      String deploymentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'deploymentId' when calling deleteDORADeployment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/deployment/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.deleteDORADeployment",
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
   * Delete a failure event.
   *
   * <p>See {@link #deleteDORAFailureWithHttpInfo}.
   *
   * @param failureId The ID of the failure event to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDORAFailure(String failureId) throws ApiException {
    deleteDORAFailureWithHttpInfo(failureId);
  }

  /**
   * Delete a failure event.
   *
   * <p>See {@link #deleteDORAFailureWithHttpInfoAsync}.
   *
   * @param failureId The ID of the failure event to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDORAFailureAsync(String failureId) {
    return deleteDORAFailureWithHttpInfoAsync(failureId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to delete a failure event.
   *
   * @param failureId The ID of the failure event to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDORAFailureWithHttpInfo(String failureId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'failureId' is set
    if (failureId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'failureId' when calling deleteDORAFailure");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/failure/{failure_id}"
            .replaceAll("\\{" + "failure_id" + "\\}", apiClient.escapeString(failureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.deleteDORAFailure",
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
   * Delete a failure event.
   *
   * <p>See {@link #deleteDORAFailureWithHttpInfo}.
   *
   * @param failureId The ID of the failure event to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDORAFailureWithHttpInfoAsync(String failureId) {
    Object localVarPostBody = null;

    // verify the required parameter 'failureId' is set
    if (failureId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'failureId' when calling deleteDORAFailure"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/failure/{failure_id}"
            .replaceAll("\\{" + "failure_id" + "\\}", apiClient.escapeString(failureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.deleteDORAFailure",
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
   * Get a deployment event.
   *
   * <p>See {@link #getDORADeploymentWithHttpInfo}.
   *
   * @param deploymentId The ID of the deployment event. (required)
   * @return DORAFetchResponse
   * @throws ApiException if fails to make API call
   */
  public DORAFetchResponse getDORADeployment(String deploymentId) throws ApiException {
    return getDORADeploymentWithHttpInfo(deploymentId).getData();
  }

  /**
   * Get a deployment event.
   *
   * <p>See {@link #getDORADeploymentWithHttpInfoAsync}.
   *
   * @param deploymentId The ID of the deployment event. (required)
   * @return CompletableFuture&lt;DORAFetchResponse&gt;
   */
  public CompletableFuture<DORAFetchResponse> getDORADeploymentAsync(String deploymentId) {
    return getDORADeploymentWithHttpInfoAsync(deploymentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to get a deployment event.
   *
   * @param deploymentId The ID of the deployment event. (required)
   * @return ApiResponse&lt;DORAFetchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORAFetchResponse> getDORADeploymentWithHttpInfo(String deploymentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deploymentId' when calling getDORADeployment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/deployments/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.getDORADeployment",
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
        new GenericType<DORAFetchResponse>() {});
  }

  /**
   * Get a deployment event.
   *
   * <p>See {@link #getDORADeploymentWithHttpInfo}.
   *
   * @param deploymentId The ID of the deployment event. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAFetchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAFetchResponse>> getDORADeploymentWithHttpInfoAsync(
      String deploymentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      CompletableFuture<ApiResponse<DORAFetchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deploymentId' when calling getDORADeployment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/deployments/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.getDORADeployment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAFetchResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAFetchResponse>() {});
  }

  /**
   * Get a failure event.
   *
   * <p>See {@link #getDORAFailureWithHttpInfo}.
   *
   * @param failureId The ID of the failure event. (required)
   * @return DORAFetchResponse
   * @throws ApiException if fails to make API call
   */
  public DORAFetchResponse getDORAFailure(String failureId) throws ApiException {
    return getDORAFailureWithHttpInfo(failureId).getData();
  }

  /**
   * Get a failure event.
   *
   * <p>See {@link #getDORAFailureWithHttpInfoAsync}.
   *
   * @param failureId The ID of the failure event. (required)
   * @return CompletableFuture&lt;DORAFetchResponse&gt;
   */
  public CompletableFuture<DORAFetchResponse> getDORAFailureAsync(String failureId) {
    return getDORAFailureWithHttpInfoAsync(failureId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to get a failure event.
   *
   * @param failureId The ID of the failure event. (required)
   * @return ApiResponse&lt;DORAFetchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORAFetchResponse> getDORAFailureWithHttpInfo(String failureId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'failureId' is set
    if (failureId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'failureId' when calling getDORAFailure");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/failures/{failure_id}"
            .replaceAll("\\{" + "failure_id" + "\\}", apiClient.escapeString(failureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.getDORAFailure",
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
        new GenericType<DORAFetchResponse>() {});
  }

  /**
   * Get a failure event.
   *
   * <p>See {@link #getDORAFailureWithHttpInfo}.
   *
   * @param failureId The ID of the failure event. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAFetchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAFetchResponse>> getDORAFailureWithHttpInfoAsync(
      String failureId) {
    Object localVarPostBody = null;

    // verify the required parameter 'failureId' is set
    if (failureId == null) {
      CompletableFuture<ApiResponse<DORAFetchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'failureId' when calling getDORAFailure"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dora/failures/{failure_id}"
            .replaceAll("\\{" + "failure_id" + "\\}", apiClient.escapeString(failureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.getDORAFailure",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAFetchResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAFetchResponse>() {});
  }

  /**
   * Get a list of deployment events.
   *
   * <p>See {@link #listDORADeploymentsWithHttpInfo}.
   *
   * @param body (required)
   * @return DORAListResponse
   * @throws ApiException if fails to make API call
   */
  public DORAListResponse listDORADeployments(DORAListDeploymentsRequest body) throws ApiException {
    return listDORADeploymentsWithHttpInfo(body).getData();
  }

  /**
   * Get a list of deployment events.
   *
   * <p>See {@link #listDORADeploymentsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORAListResponse&gt;
   */
  public CompletableFuture<DORAListResponse> listDORADeploymentsAsync(
      DORAListDeploymentsRequest body) {
    return listDORADeploymentsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to get a list of deployment events.
   *
   * @param body (required)
   * @return ApiResponse&lt;DORAListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORAListResponse> listDORADeploymentsWithHttpInfo(
      DORAListDeploymentsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling listDORADeployments");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/deployments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.listDORADeployments",
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
        new GenericType<DORAListResponse>() {});
  }

  /**
   * Get a list of deployment events.
   *
   * <p>See {@link #listDORADeploymentsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAListResponse>> listDORADeploymentsWithHttpInfoAsync(
      DORAListDeploymentsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORAListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling listDORADeployments"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/deployments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.listDORADeployments",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAListResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAListResponse>() {});
  }

  /**
   * Get a list of failure events.
   *
   * <p>See {@link #listDORAFailuresWithHttpInfo}.
   *
   * @param body (required)
   * @return DORAListResponse
   * @throws ApiException if fails to make API call
   */
  public DORAListResponse listDORAFailures(DORAListFailuresRequest body) throws ApiException {
    return listDORAFailuresWithHttpInfo(body).getData();
  }

  /**
   * Get a list of failure events.
   *
   * <p>See {@link #listDORAFailuresWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORAListResponse&gt;
   */
  public CompletableFuture<DORAListResponse> listDORAFailuresAsync(DORAListFailuresRequest body) {
    return listDORAFailuresWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to get a list of failure events.
   *
   * @param body (required)
   * @return ApiResponse&lt;DORAListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DORAListResponse> listDORAFailuresWithHttpInfo(DORAListFailuresRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling listDORAFailures");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/failures";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DoraMetricsApi.listDORAFailures",
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
        new GenericType<DORAListResponse>() {});
  }

  /**
   * Get a list of failure events.
   *
   * <p>See {@link #listDORAFailuresWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAListResponse>> listDORAFailuresWithHttpInfoAsync(
      DORAListFailuresRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORAListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling listDORAFailures"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dora/failures";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DoraMetricsApi.listDORAFailures",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DORAListResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAListResponse>() {});
  }
}
