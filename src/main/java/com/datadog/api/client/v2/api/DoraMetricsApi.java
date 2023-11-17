package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DORADeploymentRequest;
import com.datadog.api.client.v2.model.DORADeploymentResponse;
import com.datadog.api.client.v2.model.DORAIncidentRequest;
import com.datadog.api.client.v2.model.DORAIncidentResponse;
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
   * Use this API endpoint to provide data about incidents for DORA metrics.
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
}
