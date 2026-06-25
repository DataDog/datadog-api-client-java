package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GovernanceControlResponse;
import com.datadog.api.client.v2.model.GovernanceControlUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceControlsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlsApi {
  private ApiClient apiClient;

  public GovernanceControlsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GovernanceControlsApi(ApiClient apiClient) {
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
   * Get a governance control.
   *
   * <p>See {@link #getGovernanceControlWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @return GovernanceControlResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlResponse getGovernanceControl(String detectionType) throws ApiException {
    return getGovernanceControlWithHttpInfo(detectionType).getData();
  }

  /**
   * Get a governance control.
   *
   * <p>See {@link #getGovernanceControlWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @return CompletableFuture&lt;GovernanceControlResponse&gt;
   */
  public CompletableFuture<GovernanceControlResponse> getGovernanceControlAsync(
      String detectionType) {
    return getGovernanceControlWithHttpInfoAsync(detectionType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single governance control by its detection type, including the organization's
   * current detection, notification, and mitigation configuration and detection counts.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @return ApiResponse&lt;GovernanceControlResponse&gt;
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
  public ApiResponse<GovernanceControlResponse> getGovernanceControlWithHttpInfo(
      String detectionType) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceControl";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'detectionType' when calling getGovernanceControl");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceControlsApi.getGovernanceControl",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GovernanceControlResponse>() {});
  }

  /**
   * Get a governance control.
   *
   * <p>See {@link #getGovernanceControlWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlResponse>>
      getGovernanceControlWithHttpInfoAsync(String detectionType) {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceControl";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionType' when calling getGovernanceControl"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceControlsApi.getGovernanceControl",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceControlResponse>() {});
  }

  /**
   * List governance controls.
   *
   * <p>See {@link #listGovernanceControlsWithHttpInfo}.
   *
   * @return GovernanceControlsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlsResponse listGovernanceControls() throws ApiException {
    return listGovernanceControlsWithHttpInfo().getData();
  }

  /**
   * List governance controls.
   *
   * <p>See {@link #listGovernanceControlsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceControlsResponse&gt;
   */
  public CompletableFuture<GovernanceControlsResponse> listGovernanceControlsAsync() {
    return listGovernanceControlsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of governance controls configured for the organization. Each control pairs a
   * detection definition with the organization's current detection, notification, and mitigation
   * configuration, along with counts of active and mitigated detections.
   *
   * @return ApiResponse&lt;GovernanceControlsResponse&gt;
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
  public ApiResponse<GovernanceControlsResponse> listGovernanceControlsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceControls";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/control";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceControlsApi.listGovernanceControls",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GovernanceControlsResponse>() {});
  }

  /**
   * List governance controls.
   *
   * <p>See {@link #listGovernanceControlsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlsResponse>>
      listGovernanceControlsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceControls";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/control";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceControlsApi.listGovernanceControls",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlsResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceControlsResponse>() {});
  }

  /**
   * Update a governance control.
   *
   * <p>See {@link #updateGovernanceControlWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return GovernanceControlResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlResponse updateGovernanceControl(
      String detectionType, GovernanceControlUpdateRequest body) throws ApiException {
    return updateGovernanceControlWithHttpInfo(detectionType, body).getData();
  }

  /**
   * Update a governance control.
   *
   * <p>See {@link #updateGovernanceControlWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;GovernanceControlResponse&gt;
   */
  public CompletableFuture<GovernanceControlResponse> updateGovernanceControlAsync(
      String detectionType, GovernanceControlUpdateRequest body) {
    return updateGovernanceControlWithHttpInfoAsync(detectionType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the detection, notification, and mitigation configuration of a governance control. Only
   * the attributes present in the request are modified. Changing the mitigation type or its
   * parameters may require additional permissions.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return ApiResponse&lt;GovernanceControlResponse&gt;
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
  public ApiResponse<GovernanceControlResponse> updateGovernanceControlWithHttpInfo(
      String detectionType, GovernanceControlUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceControl";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'detectionType' when calling updateGovernanceControl");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGovernanceControl");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceControlsApi.updateGovernanceControl",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GovernanceControlResponse>() {});
  }

  /**
   * Update a governance control.
   *
   * <p>See {@link #updateGovernanceControlWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control, for example <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlResponse>>
      updateGovernanceControlWithHttpInfoAsync(
          String detectionType, GovernanceControlUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceControl";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionType' when calling"
                  + " updateGovernanceControl"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGovernanceControl"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceControlsApi.updateGovernanceControl",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GovernanceControlResponse>() {});
  }
}
