package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DORADeploymentRequest;
import com.datadog.api.client.v2.model.DORADeploymentResponse;
import com.datadog.api.client.v2.model.DORAFetchResponse;
import com.datadog.api.client.v2.model.DORAIncidentRequest;
import com.datadog.api.client.v2.model.DORAIncidentResponse;
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
   * Send a deployment event for DORA Metrics.
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
   * Send a deployment event for DORA Metrics.
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
   * Use this API endpoint to provide data about deployments for DORA metrics.
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
    // Check if unstable operation is enabled
    String operationId = "createDORADeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
   * Send a deployment event for DORA Metrics.
   *
   * <p>See {@link #createDORADeploymentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORADeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORADeploymentResponse>>
      createDORADeploymentWithHttpInfoAsync(DORADeploymentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createDORADeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DORADeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
   * Send an incident event for DORA Metrics.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfo}.
   *
   * @param body (required)
   * @return DORAIncidentResponse
   * @throws ApiException if fails to make API call
   */
  public DORAIncidentResponse createDORAIncident(DORAIncidentRequest body) throws ApiException {
    return createDORAIncidentWithHttpInfo(body).getData();
  }

  /**
   * Send an incident event for DORA Metrics.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DORAIncidentResponse&gt;
   */
  public CompletableFuture<DORAIncidentResponse> createDORAIncidentAsync(DORAIncidentRequest body) {
    return createDORAIncidentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Use this API endpoint to provide failure data for DORA metrics.
   *
   * <p>This is necessary for: - Change Failure Rate - Time to Restore
   *
   * @param body (required)
   * @return ApiResponse&lt;DORAIncidentResponse&gt;
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
  public ApiResponse<DORAIncidentResponse> createDORAIncidentWithHttpInfo(DORAIncidentRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createDORAIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
        new GenericType<DORAIncidentResponse>() {});
  }

  /**
   * Send an incident event for DORA Metrics.
   *
   * <p>See {@link #createDORAIncidentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DORAIncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DORAIncidentResponse>> createDORAIncidentWithHttpInfoAsync(
      DORAIncidentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createDORAIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DORAIncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DORAIncidentResponse>> result = new CompletableFuture<>();
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
      CompletableFuture<ApiResponse<DORAIncidentResponse>> result = new CompletableFuture<>();
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
        new GenericType<DORAIncidentResponse>() {});
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
            new String[] {"appKeyAuth", "apiKeyAuth"});
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
              new String[] {"appKeyAuth", "apiKeyAuth"});
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
            new String[] {"appKeyAuth", "apiKeyAuth"});
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
              new String[] {"appKeyAuth", "apiKeyAuth"});
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
