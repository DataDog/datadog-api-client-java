package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AppsSortField;
import com.datadog.api.client.v2.model.CreateAppRequest;
import com.datadog.api.client.v2.model.CreateAppResponse;
import com.datadog.api.client.v2.model.DeleteAppResponse;
import com.datadog.api.client.v2.model.DeleteAppsRequest;
import com.datadog.api.client.v2.model.DeleteAppsResponse;
import com.datadog.api.client.v2.model.GetAppResponse;
import com.datadog.api.client.v2.model.ListAppsResponse;
import com.datadog.api.client.v2.model.PublishAppResponse;
import com.datadog.api.client.v2.model.UnpublishAppResponse;
import com.datadog.api.client.v2.model.UpdateAppRequest;
import com.datadog.api.client.v2.model.UpdateAppResponse;
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
}
