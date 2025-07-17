package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DowntimeCreateRequest;
import com.datadog.api.client.v2.model.DowntimeResponse;
import com.datadog.api.client.v2.model.DowntimeResponseData;
import com.datadog.api.client.v2.model.DowntimeUpdateRequest;
import com.datadog.api.client.v2.model.ListDowntimesResponse;
import com.datadog.api.client.v2.model.MonitorDowntimeMatchResponse;
import com.datadog.api.client.v2.model.MonitorDowntimeMatchResponseData;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
   */
  public void cancelDowntime(String downtimeId) throws ApiException {
    cancelDowntimeWithHttpInfo(downtimeId);
  }

  /**
   * Cancel a downtime.
   *
   * <p>See {@link #cancelDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> cancelDowntimeAsync(String downtimeId) {
    return cancelDowntimeWithHttpInfoAsync(downtimeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel a downtime.
   *
   * <p><strong>Note</strong>: Downtimes canceled through the API are no longer active, but are
   * retained for approximately two days before being permanently removed. The downtime may still
   * appear in search results until it is permanently removed.
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
   */
  public ApiResponse<Void> cancelDowntimeWithHttpInfo(String downtimeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'downtimeId' when calling cancelDowntime");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.cancelDowntime",
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
   */
  public CompletableFuture<ApiResponse<Void>> cancelDowntimeWithHttpInfoAsync(String downtimeId) {
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
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.cancelDowntime",
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
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfo}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return DowntimeResponse
   * @throws ApiException if fails to make API call
   */
  public DowntimeResponse createDowntime(DowntimeCreateRequest body) throws ApiException {
    return createDowntimeWithHttpInfo(body).getData();
  }

  /**
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfoAsync}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return CompletableFuture&lt;DowntimeResponse&gt;
   */
  public CompletableFuture<DowntimeResponse> createDowntimeAsync(DowntimeCreateRequest body) {
    return createDowntimeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Schedule a downtime.
   *
   * @param body Schedule a downtime request body. (required)
   * @return ApiResponse&lt;DowntimeResponse&gt;
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
  public ApiResponse<DowntimeResponse> createDowntimeWithHttpInfo(DowntimeCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v2/downtime";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.createDowntime",
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
        new GenericType<DowntimeResponse>() {});
  }

  /**
   * Schedule a downtime.
   *
   * <p>See {@link #createDowntimeWithHttpInfo}.
   *
   * @param body Schedule a downtime request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DowntimeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DowntimeResponse>> createDowntimeWithHttpInfoAsync(
      DowntimeCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/downtime";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.createDowntime",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
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
        new GenericType<DowntimeResponse>() {});
  }

  /** Manage optional parameters to getDowntime. */
  public static class GetDowntimeOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are <code>created_by</code> and <code>monitor</code>.
     *     (optional)
     * @return GetDowntimeOptionalParameters
     */
    public GetDowntimeOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return DowntimeResponse
   * @throws ApiException if fails to make API call
   */
  public DowntimeResponse getDowntime(String downtimeId) throws ApiException {
    return getDowntimeWithHttpInfo(downtimeId, new GetDowntimeOptionalParameters()).getData();
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return CompletableFuture&lt;DowntimeResponse&gt;
   */
  public CompletableFuture<DowntimeResponse> getDowntimeAsync(String downtimeId) {
    return getDowntimeWithHttpInfoAsync(downtimeId, new GetDowntimeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return DowntimeResponse
   * @throws ApiException if fails to make API call
   */
  public DowntimeResponse getDowntime(String downtimeId, GetDowntimeOptionalParameters parameters)
      throws ApiException {
    return getDowntimeWithHttpInfo(downtimeId, parameters).getData();
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DowntimeResponse&gt;
   */
  public CompletableFuture<DowntimeResponse> getDowntimeAsync(
      String downtimeId, GetDowntimeOptionalParameters parameters) {
    return getDowntimeWithHttpInfoAsync(downtimeId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get downtime detail by <code>downtime_id</code>.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DowntimeResponse&gt;
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
  public ApiResponse<DowntimeResponse> getDowntimeWithHttpInfo(
      String downtimeId, GetDowntimeOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'downtimeId' when calling getDowntime");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.getDowntime",
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
        new GenericType<DowntimeResponse>() {});
  }

  /**
   * Get a downtime.
   *
   * <p>See {@link #getDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to fetch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DowntimeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DowntimeResponse>> getDowntimeWithHttpInfoAsync(
      String downtimeId, GetDowntimeOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'downtimeId' when calling getDowntime"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.getDowntime",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
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
        new GenericType<DowntimeResponse>() {});
  }

  /** Manage optional parameters to listDowntimes. */
  public static class ListDowntimesOptionalParameters {
    private Boolean currentOnly;
    private String include;
    private Long pageOffset;
    private Long pageLimit;

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
     * Set include.
     *
     * @param include Comma-separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are <code>created_by</code> and <code>monitor</code>.
     *     (optional)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of downtimes in the response. (optional, default to 30)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @return ListDowntimesResponse
   * @throws ApiException if fails to make API call
   */
  public ListDowntimesResponse listDowntimes() throws ApiException {
    return listDowntimesWithHttpInfo(new ListDowntimesOptionalParameters()).getData();
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListDowntimesResponse&gt;
   */
  public CompletableFuture<ListDowntimesResponse> listDowntimesAsync() {
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
   * @return ListDowntimesResponse
   * @throws ApiException if fails to make API call
   */
  public ListDowntimesResponse listDowntimes(ListDowntimesOptionalParameters parameters)
      throws ApiException {
    return listDowntimesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListDowntimesResponse&gt;
   */
  public CompletableFuture<ListDowntimesResponse> listDowntimesAsync(
      ListDowntimesOptionalParameters parameters) {
    return listDowntimesWithHttpInfoAsync(parameters)
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
   * @return PaginationIterable&lt;DowntimeResponseData&gt;
   */
  public PaginationIterable<DowntimeResponseData> listDowntimesWithPagination() {
    ListDowntimesOptionalParameters parameters = new ListDowntimesOptionalParameters();
    return listDowntimesWithPagination(parameters);
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @return ListDowntimesResponse
   */
  public PaginationIterable<DowntimeResponseData> listDowntimesWithPagination(
      ListDowntimesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 30l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDowntimes",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Get all scheduled downtimes.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListDowntimesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListDowntimesResponse> listDowntimesWithHttpInfo(
      ListDowntimesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean currentOnly = parameters.currentOnly;
    String include = parameters.include;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/downtime";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.listDowntimes",
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
        new GenericType<ListDowntimesResponse>() {});
  }

  /**
   * Get all downtimes.
   *
   * <p>See {@link #listDowntimesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListDowntimesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListDowntimesResponse>> listDowntimesWithHttpInfoAsync(
      ListDowntimesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean currentOnly = parameters.currentOnly;
    String include = parameters.include;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/downtime";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.listDowntimes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListDowntimesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListDowntimesResponse>() {});
  }

  /** Manage optional parameters to listMonitorDowntimes. */
  public static class ListMonitorDowntimesOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListMonitorDowntimesOptionalParameters
     */
    public ListMonitorDowntimesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of downtimes in the response. (optional, default to 30)
     * @return ListMonitorDowntimesOptionalParameters
     */
    public ListMonitorDowntimesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor. (required)
   * @return MonitorDowntimeMatchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorDowntimeMatchResponse listMonitorDowntimes(Long monitorId) throws ApiException {
    return listMonitorDowntimesWithHttpInfo(monitorId, new ListMonitorDowntimesOptionalParameters())
        .getData();
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfoAsync}.
   *
   * @param monitorId The id of the monitor. (required)
   * @return CompletableFuture&lt;MonitorDowntimeMatchResponse&gt;
   */
  public CompletableFuture<MonitorDowntimeMatchResponse> listMonitorDowntimesAsync(Long monitorId) {
    return listMonitorDowntimesWithHttpInfoAsync(
            monitorId, new ListMonitorDowntimesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return MonitorDowntimeMatchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorDowntimeMatchResponse listMonitorDowntimes(
      Long monitorId, ListMonitorDowntimesOptionalParameters parameters) throws ApiException {
    return listMonitorDowntimesWithHttpInfo(monitorId, parameters).getData();
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfoAsync}.
   *
   * @param monitorId The id of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonitorDowntimeMatchResponse&gt;
   */
  public CompletableFuture<MonitorDowntimeMatchResponse> listMonitorDowntimesAsync(
      Long monitorId, ListMonitorDowntimesOptionalParameters parameters) {
    return listMonitorDowntimesWithHttpInfoAsync(monitorId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor. (required)
   * @return PaginationIterable&lt;MonitorDowntimeMatchResponseData&gt;
   */
  public PaginationIterable<MonitorDowntimeMatchResponseData> listMonitorDowntimesWithPagination(
      Long monitorId) {
    ListMonitorDowntimesOptionalParameters parameters =
        new ListMonitorDowntimesOptionalParameters();
    return listMonitorDowntimesWithPagination(monitorId, parameters);
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor. (required)
   * @return MonitorDowntimeMatchResponse
   */
  public PaginationIterable<MonitorDowntimeMatchResponseData> listMonitorDowntimesWithPagination(
      Long monitorId, ListMonitorDowntimesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 30l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("monitorId", monitorId);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listMonitorDowntimes",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Get all active downtimes for the specified monitor.
   *
   * @param monitorId The id of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonitorDowntimeMatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MonitorDowntimeMatchResponse> listMonitorDowntimesWithHttpInfo(
      Long monitorId, ListMonitorDowntimesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling listMonitorDowntimes");
    }
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/{monitor_id}/downtime_matches"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.listMonitorDowntimes",
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
        new GenericType<MonitorDowntimeMatchResponse>() {});
  }

  /**
   * Get active downtimes for a monitor.
   *
   * <p>See {@link #listMonitorDowntimesWithHttpInfo}.
   *
   * @param monitorId The id of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorDowntimeMatchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorDowntimeMatchResponse>>
      listMonitorDowntimesWithHttpInfoAsync(
          Long monitorId, ListMonitorDowntimesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<MonitorDowntimeMatchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'monitorId' when calling listMonitorDowntimes"));
      return result;
    }
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath =
        "/api/v2/monitor/{monitor_id}/downtime_matches"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.listMonitorDowntimes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorDowntimeMatchResponse>> result =
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
        new GenericType<MonitorDowntimeMatchResponse>() {});
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return DowntimeResponse
   * @throws ApiException if fails to make API call
   */
  public DowntimeResponse updateDowntime(String downtimeId, DowntimeUpdateRequest body)
      throws ApiException {
    return updateDowntimeWithHttpInfo(downtimeId, body).getData();
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfoAsync}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return CompletableFuture&lt;DowntimeResponse&gt;
   */
  public CompletableFuture<DowntimeResponse> updateDowntimeAsync(
      String downtimeId, DowntimeUpdateRequest body) {
    return updateDowntimeWithHttpInfoAsync(downtimeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a downtime by <code>downtime_id</code>.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return ApiResponse&lt;DowntimeResponse&gt;
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
   */
  public ApiResponse<DowntimeResponse> updateDowntimeWithHttpInfo(
      String downtimeId, DowntimeUpdateRequest body) throws ApiException {
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
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DowntimesApi.updateDowntime",
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
        new GenericType<DowntimeResponse>() {});
  }

  /**
   * Update a downtime.
   *
   * <p>See {@link #updateDowntimeWithHttpInfo}.
   *
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DowntimeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DowntimeResponse>> updateDowntimeWithHttpInfoAsync(
      String downtimeId, DowntimeUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'downtimeId' when calling updateDowntime"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDowntime"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/downtime/{downtime_id}"
            .replaceAll(
                "\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DowntimesApi.updateDowntime",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DowntimeResponse>> result = new CompletableFuture<>();
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
        new GenericType<DowntimeResponse>() {});
  }
}
