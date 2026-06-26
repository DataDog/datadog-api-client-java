package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GovernanceConfigResponse;
import com.datadog.api.client.v2.model.GovernanceLimitsResponse;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsResponse;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceResourceLimitsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceSettingsApi {
  private ApiClient apiClient;

  public GovernanceSettingsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GovernanceSettingsApi(ApiClient apiClient) {
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
   * Get the governance console configuration.
   *
   * <p>See {@link #getGovernanceConfigWithHttpInfo}.
   *
   * @return GovernanceConfigResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceConfigResponse getGovernanceConfig() throws ApiException {
    return getGovernanceConfigWithHttpInfo().getData();
  }

  /**
   * Get the governance console configuration.
   *
   * <p>See {@link #getGovernanceConfigWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceConfigResponse&gt;
   */
  public CompletableFuture<GovernanceConfigResponse> getGovernanceConfigAsync() {
    return getGovernanceConfigWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the Governance Console configuration for the organization, including whether the
   * Console is enabled, whether assignment notifications are enabled, and whether usage attribution
   * is configured.
   *
   * @return ApiResponse&lt;GovernanceConfigResponse&gt;
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
  public ApiResponse<GovernanceConfigResponse> getGovernanceConfigWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceSettingsApi.getGovernanceConfig",
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
        new GenericType<GovernanceConfigResponse>() {});
  }

  /**
   * Get the governance console configuration.
   *
   * <p>See {@link #getGovernanceConfigWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceConfigResponse>>
      getGovernanceConfigWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceSettingsApi.getGovernanceConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceConfigResponse>() {});
  }

  /**
   * Get governance notification settings.
   *
   * <p>See {@link #getGovernanceNotificationSettingsWithHttpInfo}.
   *
   * @return GovernanceNotificationSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceNotificationSettingsResponse getGovernanceNotificationSettings()
      throws ApiException {
    return getGovernanceNotificationSettingsWithHttpInfo().getData();
  }

  /**
   * Get governance notification settings.
   *
   * <p>See {@link #getGovernanceNotificationSettingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceNotificationSettingsResponse&gt;
   */
  public CompletableFuture<GovernanceNotificationSettingsResponse>
      getGovernanceNotificationSettingsAsync() {
    return getGovernanceNotificationSettingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the organization-wide governance notification settings, including whether users are
   * notified when detections are assigned to them.
   *
   * @return ApiResponse&lt;GovernanceNotificationSettingsResponse&gt;
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
  public ApiResponse<GovernanceNotificationSettingsResponse>
      getGovernanceNotificationSettingsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/notification_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceSettingsApi.getGovernanceNotificationSettings",
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
        new GenericType<GovernanceNotificationSettingsResponse>() {});
  }

  /**
   * Get governance notification settings.
   *
   * <p>See {@link #getGovernanceNotificationSettingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceNotificationSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>>
      getGovernanceNotificationSettingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/notification_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceSettingsApi.getGovernanceNotificationSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<GovernanceNotificationSettingsResponse>() {});
  }

  /**
   * List governance limits.
   *
   * <p>See {@link #listGovernanceLimitsWithHttpInfo}.
   *
   * @return GovernanceLimitsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceLimitsResponse listGovernanceLimits() throws ApiException {
    return listGovernanceLimitsWithHttpInfo().getData();
  }

  /**
   * List governance limits.
   *
   * <p>See {@link #listGovernanceLimitsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceLimitsResponse&gt;
   */
  public CompletableFuture<GovernanceLimitsResponse> listGovernanceLimitsAsync() {
    return listGovernanceLimitsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of usage limits tracked for the organization in the Governance Console. Each
   * limit reports the query used to compute current usage, the unit and time range it is measured
   * over, and its current usage status.
   *
   * @return ApiResponse&lt;GovernanceLimitsResponse&gt;
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
  public ApiResponse<GovernanceLimitsResponse> listGovernanceLimitsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceSettingsApi.listGovernanceLimits",
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
        new GenericType<GovernanceLimitsResponse>() {});
  }

  /**
   * List governance limits.
   *
   * <p>See {@link #listGovernanceLimitsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceLimitsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceLimitsResponse>>
      listGovernanceLimitsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceLimitsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceSettingsApi.listGovernanceLimits",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceLimitsResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceLimitsResponse>() {});
  }

  /**
   * List governance resource limits.
   *
   * <p>See {@link #listGovernanceResourceLimitsWithHttpInfo}.
   *
   * @return GovernanceResourceLimitsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceResourceLimitsResponse listGovernanceResourceLimits() throws ApiException {
    return listGovernanceResourceLimitsWithHttpInfo().getData();
  }

  /**
   * List governance resource limits.
   *
   * <p>See {@link #listGovernanceResourceLimitsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceResourceLimitsResponse&gt;
   */
  public CompletableFuture<GovernanceResourceLimitsResponse> listGovernanceResourceLimitsAsync() {
    return listGovernanceResourceLimitsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of resource limits tracked for the organization in the Governance Console.
   * Each resource limit reports its current value and configured limit, the queries used to compute
   * them, and its current usage status.
   *
   * @return ApiResponse&lt;GovernanceResourceLimitsResponse&gt;
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
  public ApiResponse<GovernanceResourceLimitsResponse> listGovernanceResourceLimitsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceResourceLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/resource-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceSettingsApi.listGovernanceResourceLimits",
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
        new GenericType<GovernanceResourceLimitsResponse>() {});
  }

  /**
   * List governance resource limits.
   *
   * <p>See {@link #listGovernanceResourceLimitsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceResourceLimitsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceResourceLimitsResponse>>
      listGovernanceResourceLimitsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceResourceLimits";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceResourceLimitsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/governance/resource-limits";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceSettingsApi.listGovernanceResourceLimits",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceResourceLimitsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<GovernanceResourceLimitsResponse>() {});
  }

  /**
   * Update governance notification settings.
   *
   * <p>See {@link #updateGovernanceNotificationSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return GovernanceNotificationSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceNotificationSettingsResponse updateGovernanceNotificationSettings(
      GovernanceNotificationSettingsUpdateRequest body) throws ApiException {
    return updateGovernanceNotificationSettingsWithHttpInfo(body).getData();
  }

  /**
   * Update governance notification settings.
   *
   * <p>See {@link #updateGovernanceNotificationSettingsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GovernanceNotificationSettingsResponse&gt;
   */
  public CompletableFuture<GovernanceNotificationSettingsResponse>
      updateGovernanceNotificationSettingsAsync(GovernanceNotificationSettingsUpdateRequest body) {
    return updateGovernanceNotificationSettingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the organization-wide governance notification settings. Only the attributes present in
   * the request are modified.
   *
   * @param body (required)
   * @return ApiResponse&lt;GovernanceNotificationSettingsResponse&gt;
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
  public ApiResponse<GovernanceNotificationSettingsResponse>
      updateGovernanceNotificationSettingsWithHttpInfo(
          GovernanceNotificationSettingsUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateGovernanceNotificationSettings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/notification_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceSettingsApi.updateGovernanceNotificationSettings",
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
        new GenericType<GovernanceNotificationSettingsResponse>() {});
  }

  /**
   * Update governance notification settings.
   *
   * <p>See {@link #updateGovernanceNotificationSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceNotificationSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>>
      updateGovernanceNotificationSettingsWithHttpInfoAsync(
          GovernanceNotificationSettingsUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateGovernanceNotificationSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/notification_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceSettingsApi.updateGovernanceNotificationSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceNotificationSettingsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<GovernanceNotificationSettingsResponse>() {});
  }
}
