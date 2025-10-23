package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureCreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;
import com.datadog.api.client.v2.model.FleetDeploymentsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAutomationApi {
  private ApiClient apiClient;

  public FleetAutomationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FleetAutomationApi(ApiClient apiClient) {
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
   * Cancel a deployment.
   *
   * <p>See {@link #cancelFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelFleetDeployment(String deploymentId) throws ApiException {
    cancelFleetDeploymentWithHttpInfo(deploymentId);
  }

  /**
   * Cancel a deployment.
   *
   * <p>See {@link #cancelFleetDeploymentWithHttpInfoAsync}.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> cancelFleetDeploymentAsync(String deploymentId) {
    return cancelFleetDeploymentWithHttpInfoAsync(deploymentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel this deployment and stop all associated operations. If a workflow is currently running
   * for this deployment, it is canceled immediately. Changes already applied to hosts are not
   * rolled back.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Deployment successfully canceled. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> cancelFleetDeploymentWithHttpInfo(String deploymentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cancelFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deploymentId' when calling cancelFleetDeployment");
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/fleet/deployments/{deployment_id}/cancel"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FleetAutomationApi.cancelFleetDeployment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Cancel a deployment.
   *
   * <p>See {@link #cancelFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> cancelFleetDeploymentWithHttpInfoAsync(
      String deploymentId) {
    // Check if unstable operation is enabled
    String operationId = "cancelFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'deploymentId' when calling cancelFleetDeployment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/fleet/deployments/{deployment_id}/cancel"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FleetAutomationApi.cancelFleetDeployment",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create a deployment.
   *
   * <p>See {@link #createFleetDeploymentConfigureWithHttpInfo}.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return FleetDeploymentResponse
   * @throws ApiException if fails to make API call
   */
  public FleetDeploymentResponse createFleetDeploymentConfigure(
      FleetDeploymentConfigureCreateRequest body) throws ApiException {
    return createFleetDeploymentConfigureWithHttpInfo(body).getData();
  }

  /**
   * Create a deployment.
   *
   * <p>See {@link #createFleetDeploymentConfigureWithHttpInfoAsync}.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
   */
  public CompletableFuture<FleetDeploymentResponse> createFleetDeploymentConfigureAsync(
      FleetDeploymentConfigureCreateRequest body) {
    return createFleetDeploymentConfigureWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new deployment to apply configuration changes to a fleet of hosts matching the
   * specified filter query.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentResponse> createFleetDeploymentConfigureWithHttpInfo(
      FleetDeploymentConfigureCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentConfigure";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createFleetDeploymentConfigure");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/configure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FleetAutomationApi.createFleetDeploymentConfigure",
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
        new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Create a deployment.
   *
   * <p>See {@link #createFleetDeploymentConfigureWithHttpInfo}.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>>
      createFleetDeploymentConfigureWithHttpInfoAsync(FleetDeploymentConfigureCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentConfigure";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createFleetDeploymentConfigure"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/configure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FleetAutomationApi.createFleetDeploymentConfigure",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
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
        new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Get a deployment by ID.
   *
   * <p>See {@link #getFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return FleetDeploymentResponse
   * @throws ApiException if fails to make API call
   */
  public FleetDeploymentResponse getFleetDeployment(String deploymentId) throws ApiException {
    return getFleetDeploymentWithHttpInfo(deploymentId).getData();
  }

  /**
   * Get a deployment by ID.
   *
   * <p>See {@link #getFleetDeploymentWithHttpInfoAsync}.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
   */
  public CompletableFuture<FleetDeploymentResponse> getFleetDeploymentAsync(String deploymentId) {
    return getFleetDeploymentWithHttpInfoAsync(deploymentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the details of a specific deployment using its unique identifier.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentResponse> getFleetDeploymentWithHttpInfo(String deploymentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deploymentId' when calling getFleetDeployment");
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/fleet/deployments/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FleetAutomationApi.getFleetDeployment",
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
        new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Get a deployment by ID.
   *
   * <p>See {@link #getFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>>
      getFleetDeploymentWithHttpInfoAsync(String deploymentId) {
    // Check if unstable operation is enabled
    String operationId = "getFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'deploymentId' when calling getFleetDeployment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/unstable/fleet/deployments/{deployment_id}"
            .replaceAll(
                "\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FleetAutomationApi.getFleetDeployment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
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
        new GenericType<FleetDeploymentResponse>() {});
  }

  /** Manage optional parameters to listFleetDeployments. */
  public static class ListFleetDeploymentsOptionalParameters {
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set pageSize.
     *
     * @param pageSize Number of deployments to return per page. Maximum value is 100. (optional,
     *     default to 10)
     * @return ListFleetDeploymentsOptionalParameters
     */
    public ListFleetDeploymentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Index of the first deployment to return. Use this with <code>page_size
     *     </code> to paginate through results. (optional, default to 0)
     * @return ListFleetDeploymentsOptionalParameters
     */
    public ListFleetDeploymentsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * List all deployments.
   *
   * <p>See {@link #listFleetDeploymentsWithHttpInfo}.
   *
   * @return FleetDeploymentsResponse
   * @throws ApiException if fails to make API call
   */
  public FleetDeploymentsResponse listFleetDeployments() throws ApiException {
    return listFleetDeploymentsWithHttpInfo(new ListFleetDeploymentsOptionalParameters()).getData();
  }

  /**
   * List all deployments.
   *
   * <p>See {@link #listFleetDeploymentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;FleetDeploymentsResponse&gt;
   */
  public CompletableFuture<FleetDeploymentsResponse> listFleetDeploymentsAsync() {
    return listFleetDeploymentsWithHttpInfoAsync(new ListFleetDeploymentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all deployments.
   *
   * <p>See {@link #listFleetDeploymentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return FleetDeploymentsResponse
   * @throws ApiException if fails to make API call
   */
  public FleetDeploymentsResponse listFleetDeployments(
      ListFleetDeploymentsOptionalParameters parameters) throws ApiException {
    return listFleetDeploymentsWithHttpInfo(parameters).getData();
  }

  /**
   * List all deployments.
   *
   * <p>See {@link #listFleetDeploymentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;FleetDeploymentsResponse&gt;
   */
  public CompletableFuture<FleetDeploymentsResponse> listFleetDeploymentsAsync(
      ListFleetDeploymentsOptionalParameters parameters) {
    return listFleetDeploymentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of all deployments for fleet automation. Use the <code>page_size</code> and
   * <code>page_offset</code> parameters to paginate results.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetDeploymentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentsResponse> listFleetDeploymentsWithHttpInfo(
      ListFleetDeploymentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetDeployments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_offset", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FleetAutomationApi.listFleetDeployments",
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
        new GenericType<FleetDeploymentsResponse>() {});
  }

  /**
   * List all deployments.
   *
   * <p>See {@link #listFleetDeploymentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentsResponse>>
      listFleetDeploymentsWithHttpInfoAsync(ListFleetDeploymentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFleetDeployments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_offset", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FleetAutomationApi.listFleetDeployments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentsResponse>> result = new CompletableFuture<>();
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
        new GenericType<FleetDeploymentsResponse>() {});
  }
}
