package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumArchiveConfigListResponse;
import com.datadog.api.client.v2.model.RumArchiveConfigResponse;
import com.datadog.api.client.v2.model.RumArchiveConfigUpsertRequest;
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
public class RumManagedArchivesApi {
  private ApiClient apiClient;

  public RumManagedArchivesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumManagedArchivesApi(ApiClient apiClient) {
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
   * Delete an archive configuration.
   *
   * <p>See {@link #deleteRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMArchiveConfig(UUID appId) throws ApiException {
    deleteRUMArchiveConfigWithHttpInfo(appId);
  }

  /**
   * Delete an archive configuration.
   *
   * <p>See {@link #deleteRUMArchiveConfigWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMArchiveConfigAsync(UUID appId) {
    return deleteRUMArchiveConfigWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the archive configuration for a RUM application. Archived and recovered session data is
   * not deleted.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMArchiveConfigWithHttpInfo(UUID appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling deleteRUMArchiveConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumManagedArchivesApi.deleteRUMArchiveConfig",
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
   * Delete an archive configuration.
   *
   * <p>See {@link #deleteRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMArchiveConfigWithHttpInfoAsync(UUID appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling deleteRUMArchiveConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumManagedArchivesApi.deleteRUMArchiveConfig",
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
   * Get an archive configuration.
   *
   * <p>See {@link #getRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RumArchiveConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumArchiveConfigResponse getRUMArchiveConfig(UUID appId) throws ApiException {
    return getRUMArchiveConfigWithHttpInfo(appId).getData();
  }

  /**
   * Get an archive configuration.
   *
   * <p>See {@link #getRUMArchiveConfigWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RumArchiveConfigResponse&gt;
   */
  public CompletableFuture<RumArchiveConfigResponse> getRUMArchiveConfigAsync(UUID appId) {
    return getRUMArchiveConfigWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the archive configuration for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RumArchiveConfigResponse&gt;
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
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumArchiveConfigResponse> getRUMArchiveConfigWithHttpInfo(UUID appId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getRUMArchiveConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumManagedArchivesApi.getRUMArchiveConfig",
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
        new GenericType<RumArchiveConfigResponse>() {});
  }

  /**
   * Get an archive configuration.
   *
   * <p>See {@link #getRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumArchiveConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumArchiveConfigResponse>>
      getRUMArchiveConfigWithHttpInfoAsync(UUID appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumArchiveConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling getRUMArchiveConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumManagedArchivesApi.getRUMArchiveConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumArchiveConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumArchiveConfigResponse>() {});
  }

  /** Manage optional parameters to listRUMArchiveConfigs. */
  public static class ListRUMArchiveConfigsOptionalParameters {
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number. (optional, default to 0)
     * @return ListRUMArchiveConfigsOptionalParameters
     */
    public ListRUMArchiveConfigsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Configurations per page. (optional, default to 20)
     * @return ListRUMArchiveConfigsOptionalParameters
     */
    public ListRUMArchiveConfigsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List archive configurations.
   *
   * <p>See {@link #listRUMArchiveConfigsWithHttpInfo}.
   *
   * @return RumArchiveConfigListResponse
   * @throws ApiException if fails to make API call
   */
  public RumArchiveConfigListResponse listRUMArchiveConfigs() throws ApiException {
    return listRUMArchiveConfigsWithHttpInfo(new ListRUMArchiveConfigsOptionalParameters())
        .getData();
  }

  /**
   * List archive configurations.
   *
   * <p>See {@link #listRUMArchiveConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RumArchiveConfigListResponse&gt;
   */
  public CompletableFuture<RumArchiveConfigListResponse> listRUMArchiveConfigsAsync() {
    return listRUMArchiveConfigsWithHttpInfoAsync(new ListRUMArchiveConfigsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List archive configurations.
   *
   * <p>See {@link #listRUMArchiveConfigsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RumArchiveConfigListResponse
   * @throws ApiException if fails to make API call
   */
  public RumArchiveConfigListResponse listRUMArchiveConfigs(
      ListRUMArchiveConfigsOptionalParameters parameters) throws ApiException {
    return listRUMArchiveConfigsWithHttpInfo(parameters).getData();
  }

  /**
   * List archive configurations.
   *
   * <p>See {@link #listRUMArchiveConfigsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RumArchiveConfigListResponse&gt;
   */
  public CompletableFuture<RumArchiveConfigListResponse> listRUMArchiveConfigsAsync(
      ListRUMArchiveConfigsOptionalParameters parameters) {
    return listRUMArchiveConfigsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of archive configurations for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RumArchiveConfigListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumArchiveConfigListResponse> listRUMArchiveConfigsWithHttpInfo(
      ListRUMArchiveConfigsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/archive";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumManagedArchivesApi.listRUMArchiveConfigs",
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
        new GenericType<RumArchiveConfigListResponse>() {});
  }

  /**
   * List archive configurations.
   *
   * <p>See {@link #listRUMArchiveConfigsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RumArchiveConfigListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumArchiveConfigListResponse>>
      listRUMArchiveConfigsWithHttpInfoAsync(ListRUMArchiveConfigsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/archive";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumManagedArchivesApi.listRUMArchiveConfigs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumArchiveConfigListResponse>> result =
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
        new GenericType<RumArchiveConfigListResponse>() {});
  }

  /**
   * Create or update an archive configuration.
   *
   * <p>See {@link #updateRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. Must match data.id for PUT. (required)
   * @param body JSON:API request body. (required)
   * @return RumArchiveConfigResponse
   * @throws ApiException if fails to make API call
   */
  public RumArchiveConfigResponse updateRUMArchiveConfig(
      UUID appId, RumArchiveConfigUpsertRequest body) throws ApiException {
    return updateRUMArchiveConfigWithHttpInfo(appId, body).getData();
  }

  /**
   * Create or update an archive configuration.
   *
   * <p>See {@link #updateRUMArchiveConfigWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. Must match data.id for PUT. (required)
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;RumArchiveConfigResponse&gt;
   */
  public CompletableFuture<RumArchiveConfigResponse> updateRUMArchiveConfigAsync(
      UUID appId, RumArchiveConfigUpsertRequest body) {
    return updateRUMArchiveConfigWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update the archive configuration for a RUM application. The application ID in the
   * path must match <code>data.id</code>. Disabling archiving does not delete archived sessions.
   *
   * @param appId RUM application ID. Must match data.id for PUT. (required)
   * @param body JSON:API request body. (required)
   * @return ApiResponse&lt;RumArchiveConfigResponse&gt;
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
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumArchiveConfigResponse> updateRUMArchiveConfigWithHttpInfo(
      UUID appId, RumArchiveConfigUpsertRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateRUMArchiveConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMArchiveConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumManagedArchivesApi.updateRUMArchiveConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumArchiveConfigResponse>() {});
  }

  /**
   * Create or update an archive configuration.
   *
   * <p>See {@link #updateRUMArchiveConfigWithHttpInfo}.
   *
   * @param appId RUM application ID. Must match data.id for PUT. (required)
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumArchiveConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumArchiveConfigResponse>>
      updateRUMArchiveConfigWithHttpInfoAsync(UUID appId, RumArchiveConfigUpsertRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumArchiveConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateRUMArchiveConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumArchiveConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMArchiveConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/config/archive/{app_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumManagedArchivesApi.updateRUMArchiveConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumArchiveConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumArchiveConfigResponse>() {});
  }
}
