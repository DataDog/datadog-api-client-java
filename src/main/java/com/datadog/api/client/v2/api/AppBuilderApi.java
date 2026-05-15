package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AppsSortField;
import com.datadog.api.client.v2.model.CreateAppRequest;
import com.datadog.api.client.v2.model.CreateAppResponse;
import com.datadog.api.client.v2.model.CreatePublishRequestRequest;
import com.datadog.api.client.v2.model.DeleteAppResponse;
import com.datadog.api.client.v2.model.DeleteAppsRequest;
import com.datadog.api.client.v2.model.DeleteAppsResponse;
import com.datadog.api.client.v2.model.GetAppResponse;
import com.datadog.api.client.v2.model.ListAppVersionsResponse;
import com.datadog.api.client.v2.model.ListAppsResponse;
import com.datadog.api.client.v2.model.PublishAppResponse;
import com.datadog.api.client.v2.model.UnpublishAppResponse;
import com.datadog.api.client.v2.model.UpdateAppFavoriteRequest;
import com.datadog.api.client.v2.model.UpdateAppProtectionLevelRequest;
import com.datadog.api.client.v2.model.UpdateAppRequest;
import com.datadog.api.client.v2.model.UpdateAppResponse;
import com.datadog.api.client.v2.model.UpdateAppSelfServiceRequest;
import com.datadog.api.client.v2.model.UpdateAppTagsRequest;
import com.datadog.api.client.v2.model.UpdateAppVersionNameRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppBuilderApi {
  private ApiClient apiClient;

  public AppBuilderApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AppBuilderApi(ApiClient apiClient) {
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
   * Create App.
   *
   * <p>See {@link #createAppWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateAppResponse
   * @throws ApiException if fails to make API call
   */
  public CreateAppResponse createApp(CreateAppRequest body) throws ApiException {
    return createAppWithHttpInfo(body).getData();
  }

  /**
   * Create App.
   *
   * <p>See {@link #createAppWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateAppResponse&gt;
   */
  public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest body) {
    return createAppWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new app, returning the app ID. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateAppResponse> createAppWithHttpInfo(CreateAppRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createApp");
    }
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.createApp",
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
        new GenericType<CreateAppResponse>() {});
  }

  /**
   * Create App.
   *
   * <p>See {@link #createAppWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateAppResponse>> createAppWithHttpInfoAsync(
      CreateAppRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createApp"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.createApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<CreateAppResponse>() {});
  }

  /**
   * Create Publish Request.
   *
   * <p>See {@link #createPublishRequestWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return PublishAppResponse
   * @throws ApiException if fails to make API call
   */
  public PublishAppResponse createPublishRequest(UUID appId, CreatePublishRequestRequest body)
      throws ApiException {
    return createPublishRequestWithHttpInfo(appId, body).getData();
  }

  /**
   * Create Publish Request.
   *
   * <p>See {@link #createPublishRequestWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PublishAppResponse&gt;
   */
  public CompletableFuture<PublishAppResponse> createPublishRequestAsync(
      UUID appId, CreatePublishRequestRequest body) {
    return createPublishRequestWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a publish request to ask for approval to publish an app whose protection level is <code>
   * approval_required</code>. Publishing happens automatically once the request is approved by a
   * user with the appropriate permissions.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return ApiResponse&lt;PublishAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PublishAppResponse> createPublishRequestWithHttpInfo(
      UUID appId, CreatePublishRequestRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling createPublishRequest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPublishRequest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/publish-request"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.createPublishRequest",
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
        new GenericType<PublishAppResponse>() {});
  }

  /**
   * Create Publish Request.
   *
   * <p>See {@link #createPublishRequestWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PublishAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PublishAppResponse>> createPublishRequestWithHttpInfoAsync(
      UUID appId, CreatePublishRequestRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<PublishAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling createPublishRequest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PublishAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPublishRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/publish-request"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.createPublishRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PublishAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<PublishAppResponse>() {});
  }

  /**
   * Delete App.
   *
   * <p>See {@link #deleteAppWithHttpInfo}.
   *
   * @param appId The ID of the app to delete. (required)
   * @return DeleteAppResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteAppResponse deleteApp(UUID appId) throws ApiException {
    return deleteAppWithHttpInfo(appId).getData();
  }

  /**
   * Delete App.
   *
   * <p>See {@link #deleteAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to delete. (required)
   * @return CompletableFuture&lt;DeleteAppResponse&gt;
   */
  public CompletableFuture<DeleteAppResponse> deleteAppAsync(UUID appId) {
    return deleteAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single app. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param appId The ID of the app to delete. (required)
   * @return ApiResponse&lt;DeleteAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 410 </td><td> Gone </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteAppResponse> deleteAppWithHttpInfo(UUID appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.deleteApp",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<DeleteAppResponse>() {});
  }

  /**
   * Delete App.
   *
   * <p>See {@link #deleteAppWithHttpInfo}.
   *
   * @param appId The ID of the app to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteAppResponse>> deleteAppWithHttpInfoAsync(UUID appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<DeleteAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling deleteApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.deleteApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeleteAppResponse>() {});
  }

  /**
   * Delete Multiple Apps.
   *
   * <p>See {@link #deleteAppsWithHttpInfo}.
   *
   * @param body (required)
   * @return DeleteAppsResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteAppsResponse deleteApps(DeleteAppsRequest body) throws ApiException {
    return deleteAppsWithHttpInfo(body).getData();
  }

  /**
   * Delete Multiple Apps.
   *
   * <p>See {@link #deleteAppsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DeleteAppsResponse&gt;
   */
  public CompletableFuture<DeleteAppsResponse> deleteAppsAsync(DeleteAppsRequest body) {
    return deleteAppsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete multiple apps in a single request from a list of app IDs. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param body (required)
   * @return ApiResponse&lt;DeleteAppsResponse&gt;
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
  public ApiResponse<DeleteAppsResponse> deleteAppsWithHttpInfo(DeleteAppsRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteApps");
    }
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.deleteApps",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsResponse>() {});
  }

  /**
   * Delete Multiple Apps.
   *
   * <p>See {@link #deleteAppsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteAppsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteAppsResponse>> deleteAppsWithHttpInfoAsync(
      DeleteAppsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeleteAppsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling deleteApps"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.deleteApps",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteAppsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsResponse>() {});
  }

  /** Manage optional parameters to getApp. */
  public static class GetAppOptionalParameters {
    private String version;

    /**
     * Set version.
     *
     * @param version The version number of the app to retrieve. If not specified, the latest
     *     version is returned. Version numbers start at 1 and increment with each update. The
     *     special values <code>latest</code> and <code>deployed</code> can be used to retrieve the
     *     latest version or the published version, respectively. (optional)
     * @return GetAppOptionalParameters
     */
    public GetAppOptionalParameters version(String version) {
      this.version = version;
      return this;
    }
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfo}.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @return GetAppResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppResponse getApp(UUID appId) throws ApiException {
    return getAppWithHttpInfo(appId, new GetAppOptionalParameters()).getData();
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @return CompletableFuture&lt;GetAppResponse&gt;
   */
  public CompletableFuture<GetAppResponse> getAppAsync(UUID appId) {
    return getAppWithHttpInfoAsync(appId, new GetAppOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfo}.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return GetAppResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppResponse getApp(UUID appId, GetAppOptionalParameters parameters)
      throws ApiException {
    return getAppWithHttpInfo(appId, parameters).getData();
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetAppResponse&gt;
   */
  public CompletableFuture<GetAppResponse> getAppAsync(
      UUID appId, GetAppOptionalParameters parameters) {
    return getAppWithHttpInfoAsync(appId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the full definition of an app. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 410 </td><td> Gone </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetAppResponse> getAppWithHttpInfo(
      UUID appId, GetAppOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getApp");
    }
    String version = parameters.version;
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.getApp",
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
        new GenericType<GetAppResponse>() {});
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfo}.
   *
   * @param appId The ID of the app to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetAppResponse>> getAppWithHttpInfoAsync(
      UUID appId, GetAppOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<GetAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling getApp"));
      return result;
    }
    String version = parameters.version;
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.getApp",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetAppResponse>() {});
  }

  /** Manage optional parameters to listApps. */
  public static class ListAppsOptionalParameters {
    private Long limit;
    private Long page;
    private String filterUserName;
    private UUID filterUserUuid;
    private String filterName;
    private String filterQuery;
    private Boolean filterDeployed;
    private String filterTags;
    private Boolean filterFavorite;
    private Boolean filterSelfService;
    private List<AppsSortField> sort;

    /**
     * Set limit.
     *
     * @param limit The number of apps to return per page. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set page.
     *
     * @param page The page number to return. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set filterUserName.
     *
     * @param filterUserName Filter apps by the app creator. Usually the user's email. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterUserName(String filterUserName) {
      this.filterUserName = filterUserName;
      return this;
    }

    /**
     * Set filterUserUuid.
     *
     * @param filterUserUuid Filter apps by the app creator's UUID. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterUserUuid(UUID filterUserUuid) {
      this.filterUserUuid = filterUserUuid;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName Filter by app name. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Filter apps by the app name or the app creator. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterDeployed.
     *
     * @param filterDeployed Filter apps by whether they are published. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterDeployed(Boolean filterDeployed) {
      this.filterDeployed = filterDeployed;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter apps by tags. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterFavorite.
     *
     * @param filterFavorite Filter apps by whether you have added them to your favorites.
     *     (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterFavorite(Boolean filterFavorite) {
      this.filterFavorite = filterFavorite;
      return this;
    }

    /**
     * Set filterSelfService.
     *
     * @param filterSelfService Filter apps by whether they are enabled for self-service. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterSelfService(Boolean filterSelfService) {
      this.filterSelfService = filterSelfService;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The fields and direction to sort apps by. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters sort(List<AppsSortField> sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List Apps.
   *
   * <p>See {@link #listAppsWithHttpInfo}.
   *
   * @return ListAppsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppsResponse listApps() throws ApiException {
    return listAppsWithHttpInfo(new ListAppsOptionalParameters()).getData();
  }

  /**
   * List Apps.
   *
   * <p>See {@link #listAppsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListAppsResponse&gt;
   */
  public CompletableFuture<ListAppsResponse> listAppsAsync() {
    return listAppsWithHttpInfoAsync(new ListAppsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Apps.
   *
   * <p>See {@link #listAppsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListAppsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppsResponse listApps(ListAppsOptionalParameters parameters) throws ApiException {
    return listAppsWithHttpInfo(parameters).getData();
  }

  /**
   * List Apps.
   *
   * <p>See {@link #listAppsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAppsResponse&gt;
   */
  public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsOptionalParameters parameters) {
    return listAppsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all apps, with optional filters and sorting. This endpoint is paginated. Only basic app
   * information such as the app ID, name, and description is returned by this endpoint. This API
   * requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAppsResponse&gt;
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
  public ApiResponse<ListAppsResponse> listAppsWithHttpInfo(ListAppsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long page = parameters.page;
    String filterUserName = parameters.filterUserName;
    UUID filterUserUuid = parameters.filterUserUuid;
    String filterName = parameters.filterName;
    String filterQuery = parameters.filterQuery;
    Boolean filterDeployed = parameters.filterDeployed;
    String filterTags = parameters.filterTags;
    Boolean filterFavorite = parameters.filterFavorite;
    Boolean filterSelfService = parameters.filterSelfService;
    List<AppsSortField> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_name]", filterUserName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_uuid]", filterUserUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deployed]", filterDeployed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[favorite]", filterFavorite));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[self_service]", filterSelfService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.listApps",
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
        new GenericType<ListAppsResponse>() {});
  }

  /**
   * List Apps.
   *
   * <p>See {@link #listAppsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAppsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAppsResponse>> listAppsWithHttpInfoAsync(
      ListAppsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long page = parameters.page;
    String filterUserName = parameters.filterUserName;
    UUID filterUserUuid = parameters.filterUserUuid;
    String filterName = parameters.filterName;
    String filterQuery = parameters.filterQuery;
    Boolean filterDeployed = parameters.filterDeployed;
    String filterTags = parameters.filterTags;
    Boolean filterFavorite = parameters.filterFavorite;
    Boolean filterSelfService = parameters.filterSelfService;
    List<AppsSortField> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/app-builder/apps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_name]", filterUserName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_uuid]", filterUserUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deployed]", filterDeployed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[favorite]", filterFavorite));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[self_service]", filterSelfService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.listApps",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAppsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListAppsResponse>() {});
  }

  /** Manage optional parameters to listAppVersions. */
  public static class ListAppVersionsOptionalParameters {
    private Long limit;
    private Long page;

    /**
     * Set limit.
     *
     * @param limit The number of versions to return per page. (optional)
     * @return ListAppVersionsOptionalParameters
     */
    public ListAppVersionsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set page.
     *
     * @param page The page number to return. (optional)
     * @return ListAppVersionsOptionalParameters
     */
    public ListAppVersionsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }
  }

  /**
   * List App Versions.
   *
   * <p>See {@link #listAppVersionsWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @return ListAppVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppVersionsResponse listAppVersions(UUID appId) throws ApiException {
    return listAppVersionsWithHttpInfo(appId, new ListAppVersionsOptionalParameters()).getData();
  }

  /**
   * List App Versions.
   *
   * <p>See {@link #listAppVersionsWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @return CompletableFuture&lt;ListAppVersionsResponse&gt;
   */
  public CompletableFuture<ListAppVersionsResponse> listAppVersionsAsync(UUID appId) {
    return listAppVersionsWithHttpInfoAsync(appId, new ListAppVersionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List App Versions.
   *
   * <p>See {@link #listAppVersionsWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param parameters Optional parameters for the request.
   * @return ListAppVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppVersionsResponse listAppVersions(
      UUID appId, ListAppVersionsOptionalParameters parameters) throws ApiException {
    return listAppVersionsWithHttpInfo(appId, parameters).getData();
  }

  /**
   * List App Versions.
   *
   * <p>See {@link #listAppVersionsWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAppVersionsResponse&gt;
   */
  public CompletableFuture<ListAppVersionsResponse> listAppVersionsAsync(
      UUID appId, ListAppVersionsOptionalParameters parameters) {
    return listAppVersionsWithHttpInfoAsync(appId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the versions of an app. This endpoint is paginated.
   *
   * @param appId The ID of the app. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAppVersionsResponse&gt;
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
  public ApiResponse<ListAppVersionsResponse> listAppVersionsWithHttpInfo(
      UUID appId, ListAppVersionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listAppVersions");
    }
    Long limit = parameters.limit;
    Long page = parameters.page;
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/versions"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.listAppVersions",
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
        new GenericType<ListAppVersionsResponse>() {});
  }

  /**
   * List App Versions.
   *
   * <p>See {@link #listAppVersionsWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAppVersionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAppVersionsResponse>> listAppVersionsWithHttpInfoAsync(
      UUID appId, ListAppVersionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<ListAppVersionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling listAppVersions"));
      return result;
    }
    Long limit = parameters.limit;
    Long page = parameters.page;
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/versions"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.listAppVersions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAppVersionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListAppVersionsResponse>() {});
  }

  /**
   * Publish App.
   *
   * <p>See {@link #publishAppWithHttpInfo}.
   *
   * @param appId The ID of the app to publish. (required)
   * @return PublishAppResponse
   * @throws ApiException if fails to make API call
   */
  public PublishAppResponse publishApp(UUID appId) throws ApiException {
    return publishAppWithHttpInfo(appId).getData();
  }

  /**
   * Publish App.
   *
   * <p>See {@link #publishAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to publish. (required)
   * @return CompletableFuture&lt;PublishAppResponse&gt;
   */
  public CompletableFuture<PublishAppResponse> publishAppAsync(UUID appId) {
    return publishAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Publish an app for use by other users. To ensure the app is accessible to the correct users,
   * you also need to set a <a
   * href="https://docs.datadoghq.com/api/latest/restriction-policies/">Restriction Policy</a> on
   * the app if a policy does not yet exist. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param appId The ID of the app to publish. (required)
   * @return ApiResponse&lt;PublishAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PublishAppResponse> publishAppWithHttpInfo(UUID appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling publishApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.publishApp",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PublishAppResponse>() {});
  }

  /**
   * Publish App.
   *
   * <p>See {@link #publishAppWithHttpInfo}.
   *
   * @param appId The ID of the app to publish. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PublishAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PublishAppResponse>> publishAppWithHttpInfoAsync(
      UUID appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<PublishAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling publishApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.publishApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PublishAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<PublishAppResponse>() {});
  }

  /**
   * Revert App.
   *
   * <p>See {@link #revertAppWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to revert to. Cannot be <code>latest</code>. The
   *     special value <code>deployed</code> can be used to revert to the currently published
   *     version. (required)
   * @return UpdateAppResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateAppResponse revertApp(UUID appId, String version) throws ApiException {
    return revertAppWithHttpInfo(appId, version).getData();
  }

  /**
   * Revert App.
   *
   * <p>See {@link #revertAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to revert to. Cannot be <code>latest</code>. The
   *     special value <code>deployed</code> can be used to revert to the currently published
   *     version. (required)
   * @return CompletableFuture&lt;UpdateAppResponse&gt;
   */
  public CompletableFuture<UpdateAppResponse> revertAppAsync(UUID appId, String version) {
    return revertAppWithHttpInfoAsync(appId, version)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revert an app to a previous version. The version to revert to is selected through the <code>
   * version</code> query parameter. The reverted version becomes the new latest version of the app.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to revert to. Cannot be <code>latest</code>. The
   *     special value <code>deployed</code> can be used to revert to the currently published
   *     version. (required)
   * @return ApiResponse&lt;UpdateAppResponse&gt;
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
  public ApiResponse<UpdateAppResponse> revertAppWithHttpInfo(UUID appId, String version)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling revertApp");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling revertApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/revert"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.revertApp",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateAppResponse>() {});
  }

  /**
   * Revert App.
   *
   * <p>See {@link #revertAppWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to revert to. Cannot be <code>latest</code>. The
   *     special value <code>deployed</code> can be used to revert to the currently published
   *     version. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateAppResponse>> revertAppWithHttpInfoAsync(
      UUID appId, String version) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling revertApp"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'version' when calling revertApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/revert"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.revertApp",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<UpdateAppResponse>() {});
  }

  /**
   * Unpublish App.
   *
   * <p>See {@link #unpublishAppWithHttpInfo}.
   *
   * @param appId The ID of the app to unpublish. (required)
   * @return UnpublishAppResponse
   * @throws ApiException if fails to make API call
   */
  public UnpublishAppResponse unpublishApp(UUID appId) throws ApiException {
    return unpublishAppWithHttpInfo(appId).getData();
  }

  /**
   * Unpublish App.
   *
   * <p>See {@link #unpublishAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to unpublish. (required)
   * @return CompletableFuture&lt;UnpublishAppResponse&gt;
   */
  public CompletableFuture<UnpublishAppResponse> unpublishAppAsync(UUID appId) {
    return unpublishAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unpublish an app, removing the live version of the app. Unpublishing creates a new instance of
   * a <code>deployment</code> object on the app, with a nil <code>app_version_id</code> (<code>
   * 00000000-0000-0000-0000-000000000000</code>). The app can still be updated and published again
   * in the future. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param appId The ID of the app to unpublish. (required)
   * @return ApiResponse&lt;UnpublishAppResponse&gt;
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
  public ApiResponse<UnpublishAppResponse> unpublishAppWithHttpInfo(UUID appId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling unpublishApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.unpublishApp",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<UnpublishAppResponse>() {});
  }

  /**
   * Unpublish App.
   *
   * <p>See {@link #unpublishAppWithHttpInfo}.
   *
   * @param appId The ID of the app to unpublish. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UnpublishAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UnpublishAppResponse>> unpublishAppWithHttpInfoAsync(
      UUID appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<UnpublishAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling unpublishApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.unpublishApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UnpublishAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<UnpublishAppResponse>() {});
  }

  /**
   * Update App.
   *
   * <p>See {@link #updateAppWithHttpInfo}.
   *
   * @param appId The ID of the app to update. (required)
   * @param body (required)
   * @return UpdateAppResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateAppResponse updateApp(UUID appId, UpdateAppRequest body) throws ApiException {
    return updateAppWithHttpInfo(appId, body).getData();
  }

  /**
   * Update App.
   *
   * <p>See {@link #updateAppWithHttpInfoAsync}.
   *
   * @param appId The ID of the app to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UpdateAppResponse&gt;
   */
  public CompletableFuture<UpdateAppResponse> updateAppAsync(UUID appId, UpdateAppRequest body) {
    return updateAppWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing app. This creates a new version of the app. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param appId The ID of the app to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;UpdateAppResponse&gt;
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
  public ApiResponse<UpdateAppResponse> updateAppWithHttpInfo(UUID appId, UpdateAppRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateApp");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateApp",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateAppResponse>() {});
  }

  /**
   * Update App.
   *
   * <p>See {@link #updateAppWithHttpInfo}.
   *
   * @param appId The ID of the app to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateAppResponse>> updateAppWithHttpInfoAsync(
      UUID appId, UpdateAppRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling updateApp"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<UpdateAppResponse>() {});
  }

  /**
   * Update App Favorite Status.
   *
   * <p>See {@link #updateAppFavoriteWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAppFavorite(UUID appId, UpdateAppFavoriteRequest body) throws ApiException {
    updateAppFavoriteWithHttpInfo(appId, body);
  }

  /**
   * Update App Favorite Status.
   *
   * <p>See {@link #updateAppFavoriteWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAppFavoriteAsync(UUID appId, UpdateAppFavoriteRequest body) {
    return updateAppFavoriteWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add or remove an app from the current user's favorites. Favorited apps can be filtered for
   * using the <code>filter[favorite]</code> query parameter on the <a
   * href="https://docs.datadoghq.com/api/latest/app-builder/#list-apps">List Apps</a> endpoint.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateAppFavoriteWithHttpInfo(UUID appId, UpdateAppFavoriteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateAppFavorite");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAppFavorite");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/favorite"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateAppFavorite",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Favorite Status.
   *
   * <p>See {@link #updateAppFavoriteWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAppFavoriteWithHttpInfoAsync(
      UUID appId, UpdateAppFavoriteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateAppFavorite"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAppFavorite"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/favorite"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateAppFavorite",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Self-Service Status.
   *
   * <p>See {@link #updateAppSelfServiceWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAppSelfService(UUID appId, UpdateAppSelfServiceRequest body)
      throws ApiException {
    updateAppSelfServiceWithHttpInfo(appId, body);
  }

  /**
   * Update App Self-Service Status.
   *
   * <p>See {@link #updateAppSelfServiceWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAppSelfServiceAsync(
      UUID appId, UpdateAppSelfServiceRequest body) {
    return updateAppSelfServiceWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enable or disable self-service for an app. Self-service apps can be discovered and run by users
   * in your organization without explicit access being granted.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateAppSelfServiceWithHttpInfo(
      UUID appId, UpdateAppSelfServiceRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateAppSelfService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAppSelfService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/self-service"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateAppSelfService",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Self-Service Status.
   *
   * <p>See {@link #updateAppSelfServiceWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAppSelfServiceWithHttpInfoAsync(
      UUID appId, UpdateAppSelfServiceRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateAppSelfService"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAppSelfService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/self-service"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateAppSelfService",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Tags.
   *
   * <p>See {@link #updateAppTagsWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAppTags(UUID appId, UpdateAppTagsRequest body) throws ApiException {
    updateAppTagsWithHttpInfo(appId, body);
  }

  /**
   * Update App Tags.
   *
   * <p>See {@link #updateAppTagsWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAppTagsAsync(UUID appId, UpdateAppTagsRequest body) {
    return updateAppTagsWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace the tags on an app. The provided list overwrites the existing tags entirely; tags not
   * present in the request body are removed.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateAppTagsWithHttpInfo(UUID appId, UpdateAppTagsRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateAppTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAppTags");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/tags"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateAppTags",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Tags.
   *
   * <p>See {@link #updateAppTagsWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAppTagsWithHttpInfoAsync(
      UUID appId, UpdateAppTagsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateAppTags"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAppTags"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/tags"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateAppTags",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Name App Version.
   *
   * <p>See {@link #updateAppVersionNameWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to name. The special values <code>latest</code>
   *     and <code>deployed</code> can also be used to target the latest or currently published
   *     version. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAppVersionName(UUID appId, String version, UpdateAppVersionNameRequest body)
      throws ApiException {
    updateAppVersionNameWithHttpInfo(appId, version, body);
  }

  /**
   * Name App Version.
   *
   * <p>See {@link #updateAppVersionNameWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to name. The special values <code>latest</code>
   *     and <code>deployed</code> can also be used to target the latest or currently published
   *     version. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAppVersionNameAsync(
      UUID appId, String version, UpdateAppVersionNameRequest body) {
    return updateAppVersionNameWithHttpInfoAsync(appId, version, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Assign a human-readable name to a specific version of an app. The version is selected through
   * the <code>version</code> query parameter.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to name. The special values <code>latest</code>
   *     and <code>deployed</code> can also be used to target the latest or currently published
   *     version. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateAppVersionNameWithHttpInfo(
      UUID appId, String version, UpdateAppVersionNameRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateAppVersionName");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling updateAppVersionName");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAppVersionName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/version-name"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateAppVersionName",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Name App Version.
   *
   * <p>See {@link #updateAppVersionNameWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param version The version number of the app to name. The special values <code>latest</code>
   *     and <code>deployed</code> can also be used to target the latest or currently published
   *     version. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAppVersionNameWithHttpInfoAsync(
      UUID appId, String version, UpdateAppVersionNameRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateAppVersionName"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling updateAppVersionName"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAppVersionName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/version-name"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateAppVersionName",
              localVarPath,
              localVarQueryParams,
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update App Protection Level.
   *
   * <p>See {@link #updateProtectionLevelWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return UpdateAppResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateAppResponse updateProtectionLevel(UUID appId, UpdateAppProtectionLevelRequest body)
      throws ApiException {
    return updateProtectionLevelWithHttpInfo(appId, body).getData();
  }

  /**
   * Update App Protection Level.
   *
   * <p>See {@link #updateProtectionLevelWithHttpInfoAsync}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UpdateAppResponse&gt;
   */
  public CompletableFuture<UpdateAppResponse> updateProtectionLevelAsync(
      UUID appId, UpdateAppProtectionLevelRequest body) {
    return updateProtectionLevelWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the publication protection level of an app. When set to <code>approval_required</code>,
   * future publishes must go through an approval workflow before going live.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return ApiResponse&lt;UpdateAppResponse&gt;
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
  public ApiResponse<UpdateAppResponse> updateProtectionLevelWithHttpInfo(
      UUID appId, UpdateAppProtectionLevelRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateProtectionLevel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProtectionLevel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/protection-level"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppBuilderApi.updateProtectionLevel",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateAppResponse>() {});
  }

  /**
   * Update App Protection Level.
   *
   * <p>See {@link #updateProtectionLevelWithHttpInfo}.
   *
   * @param appId The ID of the app. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateAppResponse>> updateProtectionLevelWithHttpInfoAsync(
      UUID appId, UpdateAppProtectionLevelRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateProtectionLevel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateProtectionLevel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/protection-level"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppBuilderApi.updateProtectionLevel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<UpdateAppResponse>() {});
  }
}
