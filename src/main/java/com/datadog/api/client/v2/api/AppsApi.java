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
import com.datadog.api.client.v2.model.UpdateAppRequest;
import com.datadog.api.client.v2.model.UpdateAppResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppsApi {
  private ApiClient apiClient;

  public AppsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AppsApi(ApiClient apiClient) {
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
   * Create a new app, returning the app ID
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> App Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden, e.g. missing required permissions to a connection or workflow used in the app </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateAppResponse> createAppWithHttpInfo(CreateAppRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
            "v2.AppsApi.createApp",
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
    // Check if unstable operation is enabled
    String operationId = "createApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
              "v2.AppsApi.createApp",
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
   * @param appId (required)
   * @return DeleteAppResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteAppResponse deleteApp(String appId) throws ApiException {
    return deleteAppWithHttpInfo(appId).getData();
  }

  /**
   * Delete App.
   *
   * <p>See {@link #deleteAppWithHttpInfoAsync}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;DeleteAppResponse&gt;
   */
  public CompletableFuture<DeleteAppResponse> deleteAppAsync(String appId) {
    return deleteAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an app by ID
   *
   * @param appId (required)
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
  public ApiResponse<DeleteAppResponse> deleteAppWithHttpInfo(String appId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
            "v2.AppsApi.deleteApp",
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
   * @param appId (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteAppResponse>> deleteAppWithHttpInfoAsync(
      String appId) {
    // Check if unstable operation is enabled
    String operationId = "deleteApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeleteAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
              "v2.AppsApi.deleteApp",
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
   * Delete multiple apps by ID
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
   *       <tr><td> 403 </td><td> Forbidden, e.g. missing permissions to delete one or more apps </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteAppsResponse> deleteAppsWithHttpInfo(DeleteAppsRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteApps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
            "v2.AppsApi.deleteApps",
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
    // Check if unstable operation is enabled
    String operationId = "deleteApps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeleteAppsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
              "v2.AppsApi.deleteApps",
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

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return GetAppResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppResponse getApp(String appId) throws ApiException {
    return getAppWithHttpInfo(appId).getData();
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfoAsync}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;GetAppResponse&gt;
   */
  public CompletableFuture<GetAppResponse> getAppAsync(String appId) {
    return getAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the full definition of an app by ID
   *
   * @param appId (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetAppResponse> getAppWithHttpInfo(String appId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppsApi.getApp",
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
        new GenericType<GetAppResponse>() {});
  }

  /**
   * Get App.
   *
   * <p>See {@link #getAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetAppResponse>> getAppWithHttpInfoAsync(String appId) {
    // Check if unstable operation is enabled
    String operationId = "getApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<GetAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling getApp"));
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
              "v2.AppsApi.getApp",
              localVarPath,
              new ArrayList<Pair>(),
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
    private String filterUserUuid;
    private String filterName;
    private String filterQuery;
    private Boolean filterDeployed;
    private String filterTags;
    private Boolean filterFavorite;
    private List<AppsSortField> sort;

    /**
     * Set limit.
     *
     * @param limit The number of apps to return per page (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set page.
     *
     * @param page The page number to return (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set filterUserName.
     *
     * @param filterUserName The <code>AppsFilter</code> <code>user_name</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterUserName(String filterUserName) {
      this.filterUserName = filterUserName;
      return this;
    }

    /**
     * Set filterUserUuid.
     *
     * @param filterUserUuid The <code>AppsFilter</code> <code>user_uuid</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterUserUuid(String filterUserUuid) {
      this.filterUserUuid = filterUserUuid;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName The <code>AppsFilter</code> <code>name</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery The <code>AppsFilter</code> <code>query</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterDeployed.
     *
     * @param filterDeployed The <code>AppsFilter</code> <code>deployed</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterDeployed(Boolean filterDeployed) {
      this.filterDeployed = filterDeployed;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags The <code>AppsFilter</code> <code>tags</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterFavorite.
     *
     * @param filterFavorite The <code>AppsFilter</code> <code>favorite</code>. (optional)
     * @return ListAppsOptionalParameters
     */
    public ListAppsOptionalParameters filterFavorite(Boolean filterFavorite) {
      this.filterFavorite = filterFavorite;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort (optional)
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
   * List all apps, with optional filters and sorting
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAppsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request, e.g. invalid sort parameter </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListAppsResponse> listAppsWithHttpInfo(ListAppsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listApps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long page = parameters.page;
    String filterUserName = parameters.filterUserName;
    String filterUserUuid = parameters.filterUserUuid;
    String filterName = parameters.filterName;
    String filterQuery = parameters.filterQuery;
    Boolean filterDeployed = parameters.filterDeployed;
    String filterTags = parameters.filterTags;
    Boolean filterFavorite = parameters.filterFavorite;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppsApi.listApps",
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
    // Check if unstable operation is enabled
    String operationId = "listApps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListAppsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long page = parameters.page;
    String filterUserName = parameters.filterUserName;
    String filterUserUuid = parameters.filterUserUuid;
    String filterName = parameters.filterName;
    String filterQuery = parameters.filterQuery;
    Boolean filterDeployed = parameters.filterDeployed;
    String filterTags = parameters.filterTags;
    Boolean filterFavorite = parameters.filterFavorite;
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppsApi.listApps",
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
   * Update App.
   *
   * <p>See {@link #updateAppWithHttpInfo}.
   *
   * @param appId (required)
   * @param body (required)
   * @return UpdateAppResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateAppResponse updateApp(String appId, UpdateAppRequest body) throws ApiException {
    return updateAppWithHttpInfo(appId, body).getData();
  }

  /**
   * Update App.
   *
   * <p>See {@link #updateAppWithHttpInfoAsync}.
   *
   * @param appId (required)
   * @param body (required)
   * @return CompletableFuture&lt;UpdateAppResponse&gt;
   */
  public CompletableFuture<UpdateAppResponse> updateAppAsync(String appId, UpdateAppRequest body) {
    return updateAppWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing app by ID. Creates a new version of the app
   *
   * @param appId (required)
   * @param body (required)
   * @return ApiResponse&lt;UpdateAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden, e.g. missing required permissions to a connection or workflow used in the app </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateAppResponse> updateAppWithHttpInfo(String appId, UpdateAppRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
            "v2.AppsApi.updateApp",
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
   * @param appId (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateAppResponse>> updateAppWithHttpInfoAsync(
      String appId, UpdateAppRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
              "v2.AppsApi.updateApp",
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
