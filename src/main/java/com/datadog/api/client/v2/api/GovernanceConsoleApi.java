package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ControlNotificationSettingsResponse;
import com.datadog.api.client.v2.model.ControlNotificationSettingsUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceConfigResponse;
import com.datadog.api.client.v2.model.GovernanceControlDetectionResponse;
import com.datadog.api.client.v2.model.GovernanceControlDetectionUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceControlDetectionsResponse;
import com.datadog.api.client.v2.model.GovernanceControlResponse;
import com.datadog.api.client.v2.model.GovernanceControlUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceControlsResponse;
import com.datadog.api.client.v2.model.GovernanceInsightsResponse;
import com.datadog.api.client.v2.model.GovernanceMitigationRequest;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsResponse;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceConsoleApi {
  private ApiClient apiClient;

  public GovernanceConsoleApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GovernanceConsoleApi(ApiClient apiClient) {
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
   * Get the Governance Console configuration.
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
   * Get the Governance Console configuration.
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
            "v2.GovernanceConsoleApi.getGovernanceConfig",
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
   * Get the Governance Console configuration.
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
              "v2.GovernanceConsoleApi.getGovernanceConfig",
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
   * Get a control.
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
   * Get a control.
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
            "v2.GovernanceConsoleApi.getGovernanceControl",
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
   * Get a control.
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
              "v2.GovernanceConsoleApi.getGovernanceControl",
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
   * Get control notification settings.
   *
   * <p>See {@link #getGovernanceControlNotificationSettingsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return ControlNotificationSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public ControlNotificationSettingsResponse getGovernanceControlNotificationSettings(
      String detectionType) throws ApiException {
    return getGovernanceControlNotificationSettingsWithHttpInfo(detectionType).getData();
  }

  /**
   * Get control notification settings.
   *
   * <p>See {@link #getGovernanceControlNotificationSettingsWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return CompletableFuture&lt;ControlNotificationSettingsResponse&gt;
   */
  public CompletableFuture<ControlNotificationSettingsResponse>
      getGovernanceControlNotificationSettingsAsync(String detectionType) {
    return getGovernanceControlNotificationSettingsWithHttpInfoAsync(detectionType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the notification settings for the governance control with the given detection type,
   * including, for each supported event type, whether notifications are enabled and which
   * destinations receive them.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return ApiResponse&lt;ControlNotificationSettingsResponse&gt;
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
  public ApiResponse<ControlNotificationSettingsResponse>
      getGovernanceControlNotificationSettingsWithHttpInfo(String detectionType)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceControlNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'detectionType' when calling"
              + " getGovernanceControlNotificationSettings");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/notification_settings"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.getGovernanceControlNotificationSettings",
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
        new GenericType<ControlNotificationSettingsResponse>() {});
  }

  /**
   * Get control notification settings.
   *
   * <p>See {@link #getGovernanceControlNotificationSettingsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ControlNotificationSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>>
      getGovernanceControlNotificationSettingsWithHttpInfoAsync(String detectionType) {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceControlNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionType' when calling"
                  + " getGovernanceControlNotificationSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/notification_settings"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.getGovernanceControlNotificationSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
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
        new GenericType<ControlNotificationSettingsResponse>() {});
  }

  /**
   * Get a detection.
   *
   * <p>See {@link #getGovernanceDetectionWithHttpInfo}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @return GovernanceControlDetectionResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlDetectionResponse getGovernanceDetection(String detectionId)
      throws ApiException {
    return getGovernanceDetectionWithHttpInfo(detectionId).getData();
  }

  /**
   * Get a detection.
   *
   * <p>See {@link #getGovernanceDetectionWithHttpInfoAsync}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @return CompletableFuture&lt;GovernanceControlDetectionResponse&gt;
   */
  public CompletableFuture<GovernanceControlDetectionResponse> getGovernanceDetectionAsync(
      String detectionId) {
    return getGovernanceDetectionWithHttpInfoAsync(detectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single governance detection by its unique identifier.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @return ApiResponse&lt;GovernanceControlDetectionResponse&gt;
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
  public ApiResponse<GovernanceControlDetectionResponse> getGovernanceDetectionWithHttpInfo(
      String detectionId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceDetection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionId' is set
    if (detectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'detectionId' when calling getGovernanceDetection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/detections/{detection_id}"
            .replaceAll(
                "\\{" + "detection_id" + "\\}", apiClient.escapeString(detectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.getGovernanceDetection",
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
        new GenericType<GovernanceControlDetectionResponse>() {});
  }

  /**
   * Get a detection.
   *
   * <p>See {@link #getGovernanceDetectionWithHttpInfo}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlDetectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>>
      getGovernanceDetectionWithHttpInfoAsync(String detectionId) {
    // Check if unstable operation is enabled
    String operationId = "getGovernanceDetection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionId' is set
    if (detectionId == null) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionId' when calling getGovernanceDetection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/detections/{detection_id}"
            .replaceAll(
                "\\{" + "detection_id" + "\\}", apiClient.escapeString(detectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.getGovernanceDetection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
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
        new GenericType<GovernanceControlDetectionResponse>() {});
  }

  /**
   * Get notification settings.
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
   * Get notification settings.
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
            "v2.GovernanceConsoleApi.getGovernanceNotificationSettings",
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
   * Get notification settings.
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
              "v2.GovernanceConsoleApi.getGovernanceNotificationSettings",
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

  /** Manage optional parameters to listGovernanceControlDetections. */
  public static class ListGovernanceControlDetectionsOptionalParameters {
    private String filterState;
    private String filterQuery;
    private String sort;
    private Long pageNumber;
    private Long pageSize;

    /**
     * Set filterState.
     *
     * @param filterState Restrict the results to detections in the given state. (optional)
     * @return ListGovernanceControlDetectionsOptionalParameters
     */
    public ListGovernanceControlDetectionsOptionalParameters filterState(String filterState) {
      this.filterState = filterState;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Restrict the results to detections matching the given free-text query.
     *     (optional)
     * @return ListGovernanceControlDetectionsOptionalParameters
     */
    public ListGovernanceControlDetectionsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort A comma-separated list of attributes to sort detections by. Prefix an attribute
     *     with <code>-</code> for descending order. The attributes available for sorting are <code>
     *     id</code>, <code>created_at</code>, <code>assigned_to</code>, <code>detection_type</code>
     *     , <code>display_name</code>, <code>exception_at</code>, <code>mitigate_after</code>,
     *     <code>mitigated_at</code>, <code>priority</code>, <code>resource_id</code>, and <code>
     *     state</code>. Defaults to <code>created_at,-id</code>. (optional)
     * @return ListGovernanceControlDetectionsOptionalParameters
     */
    public ListGovernanceControlDetectionsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The zero-based index of the page to return; the first page is 0. (optional,
     *     default to 0)
     * @return ListGovernanceControlDetectionsOptionalParameters
     */
    public ListGovernanceControlDetectionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of detections to return per page. (optional)
     * @return ListGovernanceControlDetectionsOptionalParameters
     */
    public ListGovernanceControlDetectionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List control detections.
   *
   * <p>See {@link #listGovernanceControlDetectionsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return GovernanceControlDetectionsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlDetectionsResponse listGovernanceControlDetections(String detectionType)
      throws ApiException {
    return listGovernanceControlDetectionsWithHttpInfo(
            detectionType, new ListGovernanceControlDetectionsOptionalParameters())
        .getData();
  }

  /**
   * List control detections.
   *
   * <p>See {@link #listGovernanceControlDetectionsWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @return CompletableFuture&lt;GovernanceControlDetectionsResponse&gt;
   */
  public CompletableFuture<GovernanceControlDetectionsResponse>
      listGovernanceControlDetectionsAsync(String detectionType) {
    return listGovernanceControlDetectionsWithHttpInfoAsync(
            detectionType, new ListGovernanceControlDetectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List control detections.
   *
   * <p>See {@link #listGovernanceControlDetectionsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return GovernanceControlDetectionsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlDetectionsResponse listGovernanceControlDetections(
      String detectionType, ListGovernanceControlDetectionsOptionalParameters parameters)
      throws ApiException {
    return listGovernanceControlDetectionsWithHttpInfo(detectionType, parameters).getData();
  }

  /**
   * List control detections.
   *
   * <p>See {@link #listGovernanceControlDetectionsWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GovernanceControlDetectionsResponse&gt;
   */
  public CompletableFuture<GovernanceControlDetectionsResponse>
      listGovernanceControlDetectionsAsync(
          String detectionType, ListGovernanceControlDetectionsOptionalParameters parameters) {
    return listGovernanceControlDetectionsWithHttpInfoAsync(detectionType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the detections produced by the governance control with the given detection type.
   * Results can be filtered by state and free-text query, sorted, and paginated.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GovernanceControlDetectionsResponse&gt;
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
  public ApiResponse<GovernanceControlDetectionsResponse>
      listGovernanceControlDetectionsWithHttpInfo(
          String detectionType, ListGovernanceControlDetectionsOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceControlDetections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'detectionType' when calling"
              + " listGovernanceControlDetections");
    }
    String filterState = parameters.filterState;
    String filterQuery = parameters.filterQuery;
    String sort = parameters.sort;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/detections"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.listGovernanceControlDetections",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<GovernanceControlDetectionsResponse>() {});
  }

  /**
   * List control detections.
   *
   * <p>See {@link #listGovernanceControlDetectionsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlDetectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlDetectionsResponse>>
      listGovernanceControlDetectionsWithHttpInfoAsync(
          String detectionType, ListGovernanceControlDetectionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceControlDetections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlDetectionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionType' when calling"
                  + " listGovernanceControlDetections"));
      return result;
    }
    String filterState = parameters.filterState;
    String filterQuery = parameters.filterQuery;
    String sort = parameters.sort;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/detections"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.listGovernanceControlDetections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionsResponse>> result =
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
        new GenericType<GovernanceControlDetectionsResponse>() {});
  }

  /**
   * List controls.
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
   * List controls.
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
            "v2.GovernanceConsoleApi.listGovernanceControls",
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
   * List controls.
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
              "v2.GovernanceConsoleApi.listGovernanceControls",
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

  /** Manage optional parameters to listGovernanceInsights. */
  public static class ListGovernanceInsightsOptionalParameters {
    private List<String> filterProduct;

    /**
     * Set filterProduct.
     *
     * @param filterProduct Restrict the results to insights belonging to the given products. May be
     *     repeated to filter by multiple products. Matching is case-insensitive. (optional)
     * @return ListGovernanceInsightsOptionalParameters
     */
    public ListGovernanceInsightsOptionalParameters filterProduct(List<String> filterProduct) {
      this.filterProduct = filterProduct;
      return this;
    }
  }

  /**
   * List insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @return GovernanceInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceInsightsResponse listGovernanceInsights() throws ApiException {
    return listGovernanceInsightsWithHttpInfo(new ListGovernanceInsightsOptionalParameters())
        .getData();
  }

  /**
   * List insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GovernanceInsightsResponse&gt;
   */
  public CompletableFuture<GovernanceInsightsResponse> listGovernanceInsightsAsync() {
    return listGovernanceInsightsWithHttpInfoAsync(new ListGovernanceInsightsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return GovernanceInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceInsightsResponse listGovernanceInsights(
      ListGovernanceInsightsOptionalParameters parameters) throws ApiException {
    return listGovernanceInsightsWithHttpInfo(parameters).getData();
  }

  /**
   * List insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GovernanceInsightsResponse&gt;
   */
  public CompletableFuture<GovernanceInsightsResponse> listGovernanceInsightsAsync(
      ListGovernanceInsightsOptionalParameters parameters) {
    return listGovernanceInsightsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the list of governance insights available to the organization. Each insight reports
   * the query used to compute it, so that the value can be computed client-side. Insights can be
   * filtered by product.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GovernanceInsightsResponse&gt;
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
  public ApiResponse<GovernanceInsightsResponse> listGovernanceInsightsWithHttpInfo(
      ListGovernanceInsightsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    List<String> filterProduct = parameters.filterProduct;
    // create path and map variables
    String localVarPath = "/api/v2/governance/insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[product]", filterProduct));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.listGovernanceInsights",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<GovernanceInsightsResponse>() {});
  }

  /**
   * List insights.
   *
   * <p>See {@link #listGovernanceInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceInsightsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceInsightsResponse>>
      listGovernanceInsightsWithHttpInfoAsync(ListGovernanceInsightsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listGovernanceInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceInsightsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    List<String> filterProduct = parameters.filterProduct;
    // create path and map variables
    String localVarPath = "/api/v2/governance/insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[product]", filterProduct));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.listGovernanceInsights",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceInsightsResponse>> result = new CompletableFuture<>();
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
        new GenericType<GovernanceInsightsResponse>() {});
  }

  /**
   * Mitigate detections.
   *
   * <p>See {@link #mitigateGovernanceDetectionsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void mitigateGovernanceDetections(GovernanceMitigationRequest body) throws ApiException {
    mitigateGovernanceDetectionsWithHttpInfo(body);
  }

  /**
   * Mitigate detections.
   *
   * <p>See {@link #mitigateGovernanceDetectionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> mitigateGovernanceDetectionsAsync(
      GovernanceMitigationRequest body) {
    return mitigateGovernanceDetectionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Apply a mitigation to a set of governance detections of a given detection type. When the
   * mitigation type is omitted, the control's configured mitigation is used. The request is
   * accepted for asynchronous processing.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> mitigateGovernanceDetectionsWithHttpInfo(
      GovernanceMitigationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "mitigateGovernanceDetections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling mitigateGovernanceDetections");
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/detections/mitigate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.mitigateGovernanceDetections",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Mitigate detections.
   *
   * <p>See {@link #mitigateGovernanceDetectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> mitigateGovernanceDetectionsWithHttpInfoAsync(
      GovernanceMitigationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "mitigateGovernanceDetections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling mitigateGovernanceDetections"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/governance/detections/mitigate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.mitigateGovernanceDetections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Update a control.
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
   * Update a control.
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
            "v2.GovernanceConsoleApi.updateGovernanceControl",
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
   * Update a control.
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
              "v2.GovernanceConsoleApi.updateGovernanceControl",
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

  /**
   * Update control notification settings.
   *
   * <p>See {@link #updateGovernanceControlNotificationSettingsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return ControlNotificationSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public ControlNotificationSettingsResponse updateGovernanceControlNotificationSettings(
      String detectionType, ControlNotificationSettingsUpdateRequest body) throws ApiException {
    return updateGovernanceControlNotificationSettingsWithHttpInfo(detectionType, body).getData();
  }

  /**
   * Update control notification settings.
   *
   * <p>See {@link #updateGovernanceControlNotificationSettingsWithHttpInfoAsync}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ControlNotificationSettingsResponse&gt;
   */
  public CompletableFuture<ControlNotificationSettingsResponse>
      updateGovernanceControlNotificationSettingsAsync(
          String detectionType, ControlNotificationSettingsUpdateRequest body) {
    return updateGovernanceControlNotificationSettingsWithHttpInfoAsync(detectionType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace the notification settings for the governance control with the given detection type,
   * setting, for each supported event type, whether notifications are enabled and which
   * destinations receive them.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return ApiResponse&lt;ControlNotificationSettingsResponse&gt;
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
  public ApiResponse<ControlNotificationSettingsResponse>
      updateGovernanceControlNotificationSettingsWithHttpInfo(
          String detectionType, ControlNotificationSettingsUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceControlNotificationSettings";
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
          "Missing the required parameter 'detectionType' when calling"
              + " updateGovernanceControlNotificationSettings");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateGovernanceControlNotificationSettings");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/notification_settings"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.updateGovernanceControlNotificationSettings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ControlNotificationSettingsResponse>() {});
  }

  /**
   * Update control notification settings.
   *
   * <p>See {@link #updateGovernanceControlNotificationSettingsWithHttpInfo}.
   *
   * @param detectionType The detection type that identifies the control; for example, <code>
   *     unused_api_keys</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ControlNotificationSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>>
      updateGovernanceControlNotificationSettingsWithHttpInfoAsync(
          String detectionType, ControlNotificationSettingsUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceControlNotificationSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'detectionType' is set
    if (detectionType == null) {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionType' when calling"
                  + " updateGovernanceControlNotificationSettings"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateGovernanceControlNotificationSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/control/{detection_type}/notification_settings"
            .replaceAll(
                "\\{" + "detection_type" + "\\}", apiClient.escapeString(detectionType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.updateGovernanceControlNotificationSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ControlNotificationSettingsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ControlNotificationSettingsResponse>() {});
  }

  /**
   * Update a detection.
   *
   * <p>See {@link #updateGovernanceDetectionWithHttpInfo}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @param body (required)
   * @return GovernanceControlDetectionResponse
   * @throws ApiException if fails to make API call
   */
  public GovernanceControlDetectionResponse updateGovernanceDetection(
      String detectionId, GovernanceControlDetectionUpdateRequest body) throws ApiException {
    return updateGovernanceDetectionWithHttpInfo(detectionId, body).getData();
  }

  /**
   * Update a detection.
   *
   * <p>See {@link #updateGovernanceDetectionWithHttpInfoAsync}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;GovernanceControlDetectionResponse&gt;
   */
  public CompletableFuture<GovernanceControlDetectionResponse> updateGovernanceDetectionAsync(
      String detectionId, GovernanceControlDetectionUpdateRequest body) {
    return updateGovernanceDetectionWithHttpInfoAsync(detectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a governance detection by its unique identifier. Only the attributes present in the
   * request are modified, allowing a detection to be acknowledged as an exception, reopened,
   * reassigned, or deferred for mitigation.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @param body (required)
   * @return ApiResponse&lt;GovernanceControlDetectionResponse&gt;
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
  public ApiResponse<GovernanceControlDetectionResponse> updateGovernanceDetectionWithHttpInfo(
      String detectionId, GovernanceControlDetectionUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceDetection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'detectionId' is set
    if (detectionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'detectionId' when calling updateGovernanceDetection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGovernanceDetection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/detections/{detection_id}"
            .replaceAll(
                "\\{" + "detection_id" + "\\}", apiClient.escapeString(detectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GovernanceConsoleApi.updateGovernanceDetection",
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
        new GenericType<GovernanceControlDetectionResponse>() {});
  }

  /**
   * Update a detection.
   *
   * <p>See {@link #updateGovernanceDetectionWithHttpInfo}.
   *
   * @param detectionId The unique identifier of the detection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GovernanceControlDetectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>>
      updateGovernanceDetectionWithHttpInfoAsync(
          String detectionId, GovernanceControlDetectionUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateGovernanceDetection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'detectionId' is set
    if (detectionId == null) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'detectionId' when calling"
                  + " updateGovernanceDetection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGovernanceDetection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/governance/detections/{detection_id}"
            .replaceAll(
                "\\{" + "detection_id" + "\\}", apiClient.escapeString(detectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GovernanceConsoleApi.updateGovernanceDetection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GovernanceControlDetectionResponse>> result =
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
        new GenericType<GovernanceControlDetectionResponse>() {});
  }

  /**
   * Update notification settings.
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
   * Update notification settings.
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
            "v2.GovernanceConsoleApi.updateGovernanceNotificationSettings",
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
   * Update notification settings.
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
              "v2.GovernanceConsoleApi.updateGovernanceNotificationSettings",
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
