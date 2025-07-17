package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.CancelDowntimesByScopeRequest;
import com.datadog.api.client.v1.model.CanceledDowntimesIds;
import com.datadog.api.client.v1.model.Downtime;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimesApi {
  private ApiClient apiClient;

  public DowntimesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DowntimesApi(ApiClient apiClient) {
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
   * Cancel a downtime.
   *
   * <p>See {@link #cancelDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to cancel. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void cancelDowntime(Long downtimeId) throws ApiException {
    cancelDowntimeWithHttpInfo(downtimeId);
  }

  /**
   * Cancel a downtime.
   *
   * <p>See {@link #cancelDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> cancelDowntimeAsync(Long downtimeId) {
    return cancelDowntimeWithHttpInfoAsync(downtimeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel a downtime. <strong>Note:</strong> This endpoint has been deprecated. Please use v2
   * endpoints.
   *
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> cancelDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'downtimeId' when calling cancelDowntime");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.cancelDowntime",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Cancel a downtime.
   *
   * <p>See {@link #cancelDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> cancelDowntimeWithHttpInfoAsync(Long downtimeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'downtimeId' when calling cancelDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.cancelDowntime",
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
   * Cancel downtimes by scope.
   *
   * <p>See {@link #cancelDowntimesByScopeWithHttpInfo}.
   *
   * @param body Scope to cancel downtimes for. (required)
   * @return CanceledDowntimesIds
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CanceledDowntimesIds cancelDowntimesByScope(CancelDowntimesByScopeRequest body)
      throws ApiException {
    return cancelDowntimesByScopeWithHttpInfo(body).getData();
  }

  /**
   * Cancel downtimes by scope.
   *
   * <p>See {@link #cancelDowntimesByScopeWithHttpInfoAsync}.
   *
   * @param body Scope to cancel downtimes for. (required)
   * @return CompletableFuture&lt;CanceledDowntimesIds&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<CanceledDowntimesIds> cancelDowntimesByScopeAsync(
      CancelDowntimesByScopeRequest body) {
    return cancelDowntimesByScopeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete all downtimes that match the scope of <code>X</code>. <strong>Note:</strong> This only
   * interacts with Downtimes created using v1 endpoints. This endpoint has been deprecated and will
   * not be replaced. Please use v2 endpoints to find and cancel downtimes.
   *
   * @param body Scope to cancel downtimes for. (required)
   * @return ApiResponse&lt;CanceledDowntimesIds&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtimes not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CanceledDowntimesIds> cancelDowntimesByScopeWithHttpInfo(
      CancelDowntimesByScopeRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling cancelDowntimesByScope");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/cancel/by_scope";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.cancelDowntimesByScope",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CanceledDowntimesIds>() {});
  }

  /**
   * Cancel downtimes by scope.
   *
   * <p>See {@link #cancelDowntimesByScopeWithHttpInfo}.
   *
   * @param body Scope to cancel downtimes for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CanceledDowntimesIds&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<CanceledDowntimesIds>>
      cancelDowntimesByScopeWithHttpInfoAsync(CancelDowntimesByScopeRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CanceledDowntimesIds>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling cancelDowntimesByScope"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/cancel/by_scope";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.cancelDowntimesByScope",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CanceledDowntimesIds>> result = new CompletableFuture<>();
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
        new GenericType<CanceledDowntimesIds>() {});
  }

  /**
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfo}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Downtime createDowntime(Downtime body) throws ApiException {
    return createDowntimeWithHttpInfo(body).getData();
  }

  /**
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfoAsync}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return CompletableFuture&lt;Downtime&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Downtime> createDowntimeAsync(Downtime body) {
    return createDowntimeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Schedule a downtime. <strong>Note:</strong> This endpoint has been deprecated. Please use v2
   * endpoints.
   *
   * @param body Schedule a downtime request body. (required)
   * @return ApiResponse&lt;Downtime&gt;
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
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Downtime> createDowntimeWithHttpInfo(Downtime body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.createDowntime",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Downtime>() {});
  }

  /**
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfo}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Downtime>> createDowntimeWithHttpInfoAsync(Downtime body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.createDowntime",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
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
        new GenericType<Downtime>() {});
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Downtime getDowntime(Long downtimeId) throws ApiException {
    return getDowntimeWithHttpInfo(downtimeId).getData();
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return CompletableFuture&lt;Downtime&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Downtime> getDowntimeAsync(Long downtimeId) {
    return getDowntimeWithHttpInfoAsync(downtimeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get downtime detail by <code>downtime_id</code>. <strong>Note:</strong> This endpoint has been
   * deprecated. Please use v2 endpoints.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Downtime> getDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'downtimeId' when calling getDowntime");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.getDowntime",
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
        new GenericType<Downtime>() {});
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Downtime>> getDowntimeWithHttpInfoAsync(Long downtimeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'downtimeId' when calling getDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.getDowntime",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
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
        new GenericType<Downtime>() {});
  }

  /** Manage optional parameters to listDowntimes. */
  public static class ListDowntimesOptionalParameters {
    private Boolean currentOnly;
    private Boolean withCreator;

    /**
     * Set currentOnly.
     *
     * @param currentOnly Only return downtimes that are active when the request is made. (optional)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters currentOnly(Boolean currentOnly) {
      this.currentOnly = currentOnly;
      return this;
    }

    /**
     * Set withCreator.
     *
     * @param withCreator Return creator information. (optional)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters withCreator(Boolean withCreator) {
      this.withCreator = withCreator;
      return this;
    }
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Downtime> listDowntimes() throws ApiException {
    return listDowntimesWithHttpInfo(new ListDowntimesOptionalParameters()).getData();
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<List<Downtime>> listDowntimesAsync() {
    return listDowntimesWithHttpInfoAsync(new ListDowntimesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Downtime> listDowntimes(ListDowntimesOptionalParameters parameters)
      throws ApiException {
    return listDowntimesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;List&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<List<Downtime>> listDowntimesAsync(
      ListDowntimesOptionalParameters parameters) {
    return listDowntimesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all scheduled downtimes. <strong>Note:</strong> This endpoint has been deprecated. Please
   * use v2 endpoints.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<Downtime>> listDowntimesWithHttpInfo(
      ListDowntimesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean currentOnly = parameters.currentOnly;
    Boolean withCreator = parameters.withCreator;
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_creator", withCreator));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.listDowntimes",
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
        new GenericType<List<Downtime>>() {});
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;Downtime&gt;&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<List<Downtime>>> listDowntimesWithHttpInfoAsync(
      ListDowntimesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean currentOnly = parameters.currentOnly;
    Boolean withCreator = parameters.withCreator;
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_creator", withCreator));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.listDowntimes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<Downtime>>> result = new CompletableFuture<>();
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
        new GenericType<List<Downtime>>() {});
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor (required)
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Downtime> listMonitorDowntimes(Long monitorId) throws ApiException {
    return listMonitorDowntimesWithHttpInfo(monitorId).getData();
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfoAsync}.
   *
   * @param monitorId The id of the monitor (required)
   * @return CompletableFuture&lt;List&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<List<Downtime>> listMonitorDowntimesAsync(Long monitorId) {
    return listMonitorDowntimesWithHttpInfoAsync(monitorId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all active v1 downtimes for the specified monitor. <strong>Note:</strong> This endpoint has
   * been deprecated. Please use v2 endpoints.
   *
   * @param monitorId The id of the monitor (required)
   * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<Downtime>> listMonitorDowntimesWithHttpInfo(Long monitorId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling listMonitorDowntimes");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}/downtimes"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.listMonitorDowntimes",
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
        new GenericType<List<Downtime>>() {});
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;Downtime&gt;&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<List<Downtime>>> listMonitorDowntimesWithHttpInfoAsync(
      Long monitorId) {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<List<Downtime>>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'monitorId' when calling listMonitorDowntimes"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}/downtimes"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.listMonitorDowntimes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<Downtime>>> result = new CompletableFuture<>();
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
        new GenericType<List<Downtime>>() {});
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Downtime updateDowntime(Long downtimeId, Downtime body) throws ApiException {
    return updateDowntimeWithHttpInfo(downtimeId, body).getData();
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return CompletableFuture&lt;Downtime&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Downtime> updateDowntimeAsync(Long downtimeId, Downtime body) {
    return updateDowntimeWithHttpInfoAsync(downtimeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a single downtime by <code>downtime_id</code>. <strong>Note:</strong> This endpoint has
   * been deprecated. Please use v2 endpoints.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Downtime> updateDowntimeWithHttpInfo(Long downtimeId, Downtime body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'downtimeId' when calling updateDowntime");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDowntime");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DowntimesApi.updateDowntime",
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
        new GenericType<Downtime>() {});
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Downtime&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Downtime>> updateDowntimeWithHttpInfoAsync(
      Long downtimeId, Downtime body) {
    Object localVarPostBody = body;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'downtimeId' when calling updateDowntime"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DowntimesApi.updateDowntime",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Downtime>> result = new CompletableFuture<>();
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
        new GenericType<Downtime>() {});
  }
}
