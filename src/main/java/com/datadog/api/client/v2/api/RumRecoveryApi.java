package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumArchiveSessionsResponse;
import com.datadog.api.client.v2.model.RumArchiveSessionsSearchRequest;
import com.datadog.api.client.v2.model.RumRecoveryBatchListResponse;
import com.datadog.api.client.v2.model.RumRecoveryBatchRequestType;
import com.datadog.api.client.v2.model.RumRecoveryCancelRequest;
import com.datadog.api.client.v2.model.RumRecoveryCancelResponse;
import com.datadog.api.client.v2.model.RumRecoveryCountRequest;
import com.datadog.api.client.v2.model.RumRecoveryCountResponse;
import com.datadog.api.client.v2.model.RumRecoveryCreateRequest;
import com.datadog.api.client.v2.model.RumRecoveryCreateResponse;
import com.datadog.api.client.v2.model.RumRecoveryRequestResponse;
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
public class RumRecoveryApi {
  private ApiClient apiClient;

  public RumRecoveryApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRecoveryApi(ApiClient apiClient) {
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
   * Create a recovery request.
   *
   * <p>See {@link #createRUMRecoveryRequestWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return RumRecoveryCreateResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryCreateResponse createRUMRecoveryRequest(RumRecoveryCreateRequest body)
      throws ApiException {
    return createRUMRecoveryRequestWithHttpInfo(body).getData();
  }

  /**
   * Create a recovery request.
   *
   * <p>See {@link #createRUMRecoveryRequestWithHttpInfoAsync}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;RumRecoveryCreateResponse&gt;
   */
  public CompletableFuture<RumRecoveryCreateResponse> createRUMRecoveryRequestAsync(
      RumRecoveryCreateRequest body) {
    return createRUMRecoveryRequestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Start targeted or query-based batch recovery. Use the returned <code>data.id</code> to poll the
   * recovery request for progress. Batch creation checks a fresh recoverable-session estimate
   * against the configured maximum (100,000 by default), accepting estimates equal to the maximum.
   * Use the count operation to check the current maximum; creation can still reject a changed
   * estimate. Narrow the query or time range if the maximum is exceeded.
   *
   * <p>Creation is not idempotent. After an uncertain response, check session search or batch
   * listing before retrying.
   *
   * @param body JSON:API request body. (required)
   * @return ApiResponse&lt;RumRecoveryCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict. Targeted sessions are already retained, in flight, or previously failed, or a concurrent batch was created. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests, or the batch recovery queue is full. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumRecoveryCreateResponse> createRUMRecoveryRequestWithHttpInfo(
      RumRecoveryCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMRecoveryRequest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/requests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.createRUMRecoveryRequest",
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
        new GenericType<RumRecoveryCreateResponse>() {});
  }

  /**
   * Create a recovery request.
   *
   * <p>See {@link #createRUMRecoveryRequestWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRecoveryCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRecoveryCreateResponse>>
      createRUMRecoveryRequestWithHttpInfoAsync(RumRecoveryCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRecoveryCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMRecoveryRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/requests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.createRUMRecoveryRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRecoveryCreateResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRecoveryCreateResponse>() {});
  }

  /**
   * Get recovery request progress.
   *
   * <p>See {@link #getRUMRecoveryRequestWithHttpInfo}.
   *
   * @param requestId Recovery request UUID. (required)
   * @return RumRecoveryRequestResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryRequestResponse getRUMRecoveryRequest(UUID requestId) throws ApiException {
    return getRUMRecoveryRequestWithHttpInfo(requestId).getData();
  }

  /**
   * Get recovery request progress.
   *
   * <p>See {@link #getRUMRecoveryRequestWithHttpInfoAsync}.
   *
   * @param requestId Recovery request UUID. (required)
   * @return CompletableFuture&lt;RumRecoveryRequestResponse&gt;
   */
  public CompletableFuture<RumRecoveryRequestResponse> getRUMRecoveryRequestAsync(UUID requestId) {
    return getRUMRecoveryRequestWithHttpInfoAsync(requestId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get progress for a targeted or batch recovery request. A <code>COMPLETED</code> request can
   * include failed sessions; check individual session statuses for targeted recovery.
   *
   * @param requestId Recovery request UUID. (required)
   * @return ApiResponse&lt;RumRecoveryRequestResponse&gt;
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
  public ApiResponse<RumRecoveryRequestResponse> getRUMRecoveryRequestWithHttpInfo(UUID requestId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'requestId' when calling getRUMRecoveryRequest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/recover/requests/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.getRUMRecoveryRequest",
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
        new GenericType<RumRecoveryRequestResponse>() {});
  }

  /**
   * Get recovery request progress.
   *
   * <p>See {@link #getRUMRecoveryRequestWithHttpInfo}.
   *
   * @param requestId Recovery request UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRecoveryRequestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRecoveryRequestResponse>>
      getRUMRecoveryRequestWithHttpInfoAsync(UUID requestId) {
    Object localVarPostBody = null;

    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      CompletableFuture<ApiResponse<RumRecoveryRequestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'requestId' when calling getRUMRecoveryRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/recover/requests/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.getRUMRecoveryRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRecoveryRequestResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRecoveryRequestResponse>() {});
  }

  /**
   * Estimate recoverable sessions.
   *
   * <p>See {@link #getRUMRecoverySessionCountWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return RumRecoveryCountResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryCountResponse getRUMRecoverySessionCount(RumRecoveryCountRequest body)
      throws ApiException {
    return getRUMRecoverySessionCountWithHttpInfo(body).getData();
  }

  /**
   * Estimate recoverable sessions.
   *
   * <p>See {@link #getRUMRecoverySessionCountWithHttpInfoAsync}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;RumRecoveryCountResponse&gt;
   */
  public CompletableFuture<RumRecoveryCountResponse> getRUMRecoverySessionCountAsync(
      RumRecoveryCountRequest body) {
    return getRUMRecoverySessionCountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return the full estimated number of recoverable sessions and the configured maximum per batch.
   * The estimate is not capped at that maximum. This endpoint does not create a recovery request.
   * Narrow the query or time range if the estimate exceeds max_recoverable_sessions. Creation
   * checks a fresh estimate and returns 400 if it exceeds the configured maximum.
   *
   * @param body JSON:API request body. (required)
   * @return ApiResponse&lt;RumRecoveryCountResponse&gt;
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
  public ApiResponse<RumRecoveryCountResponse> getRUMRecoverySessionCountWithHttpInfo(
      RumRecoveryCountRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRUMRecoverySessionCount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/count";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.getRUMRecoverySessionCount",
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
        new GenericType<RumRecoveryCountResponse>() {});
  }

  /**
   * Estimate recoverable sessions.
   *
   * <p>See {@link #getRUMRecoverySessionCountWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRecoveryCountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRecoveryCountResponse>>
      getRUMRecoverySessionCountWithHttpInfoAsync(RumRecoveryCountRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRecoveryCountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling getRUMRecoverySessionCount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/count";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.getRUMRecoverySessionCount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRecoveryCountResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRecoveryCountResponse>() {});
  }

  /** Manage optional parameters to listRUMRecoveryBatchRequests. */
  public static class ListRUMRecoveryBatchRequestsOptionalParameters {
    private Integer limit;
    private String cursor;
    private Long from;
    private Long to;
    private String query;

    /**
     * Set limit.
     *
     * @param limit Number of results returned per page, at most 100 (default 50). Omitted, zero, or
     *     negative values use 50. Invalid integers return 400. (optional, default to 50)
     * @return ListRUMRecoveryBatchRequestsOptionalParameters
     */
    public ListRUMRecoveryBatchRequestsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set cursor.
     *
     * @param cursor Opaque next-page cursor. Keep type, from, to, and query unchanged between
     *     pages. (optional)
     * @return ListRUMRecoveryBatchRequestsOptionalParameters
     */
    public ListRUMRecoveryBatchRequestsOptionalParameters cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * Set from.
     *
     * @param from Start of the request creation-time range in Unix milliseconds, inclusive. This
     *     filters created_at, not the time range of the sessions being recovered. Must be earlier
     *     than to when both are provided. (optional)
     * @return ListRUMRecoveryBatchRequestsOptionalParameters
     */
    public ListRUMRecoveryBatchRequestsOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     *
     * @param to End of the request creation-time range in Unix milliseconds, exclusive. This
     *     filters created_at, not the time range of the sessions being recovered. Must be later
     *     than from when both are provided. (optional)
     * @return ListRUMRecoveryBatchRequestsOptionalParameters
     */
    public ListRUMRecoveryBatchRequestsOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set query.
     *
     * @param query Filter recovery requests whose stored query selects matching facet values.
     *     Supports facet:value and facet:(A OR B) terms combined with AND, including * and ?
     *     wildcards in filter values. Attribute facets keep their leading @. At most 4096 bytes.
     *     Exclusions, repeated facets, free text, ranges, and OR between terms return 400. Stored
     *     queries that cannot be matched unambiguously are excluded. Blank values apply no query
     *     filter. (optional)
     * @return ListRUMRecoveryBatchRequestsOptionalParameters
     */
    public ListRUMRecoveryBatchRequestsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * List batch recovery requests.
   *
   * <p>See {@link #listRUMRecoveryBatchRequestsWithHttpInfo}.
   *
   * @param type Must equal batch. (required)
   * @return RumRecoveryBatchListResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryBatchListResponse listRUMRecoveryBatchRequests(RumRecoveryBatchRequestType type)
      throws ApiException {
    return listRUMRecoveryBatchRequestsWithHttpInfo(
            type, new ListRUMRecoveryBatchRequestsOptionalParameters())
        .getData();
  }

  /**
   * List batch recovery requests.
   *
   * <p>See {@link #listRUMRecoveryBatchRequestsWithHttpInfoAsync}.
   *
   * @param type Must equal batch. (required)
   * @return CompletableFuture&lt;RumRecoveryBatchListResponse&gt;
   */
  public CompletableFuture<RumRecoveryBatchListResponse> listRUMRecoveryBatchRequestsAsync(
      RumRecoveryBatchRequestType type) {
    return listRUMRecoveryBatchRequestsWithHttpInfoAsync(
            type, new ListRUMRecoveryBatchRequestsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List batch recovery requests.
   *
   * <p>See {@link #listRUMRecoveryBatchRequestsWithHttpInfo}.
   *
   * @param type Must equal batch. (required)
   * @param parameters Optional parameters for the request.
   * @return RumRecoveryBatchListResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryBatchListResponse listRUMRecoveryBatchRequests(
      RumRecoveryBatchRequestType type, ListRUMRecoveryBatchRequestsOptionalParameters parameters)
      throws ApiException {
    return listRUMRecoveryBatchRequestsWithHttpInfo(type, parameters).getData();
  }

  /**
   * List batch recovery requests.
   *
   * <p>See {@link #listRUMRecoveryBatchRequestsWithHttpInfoAsync}.
   *
   * @param type Must equal batch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RumRecoveryBatchListResponse&gt;
   */
  public CompletableFuture<RumRecoveryBatchListResponse> listRUMRecoveryBatchRequestsAsync(
      RumRecoveryBatchRequestType type, ListRUMRecoveryBatchRequestsOptionalParameters parameters) {
    return listRUMRecoveryBatchRequestsWithHttpInfoAsync(type, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List batch recovery requests for your organization. Set <code>type=batch</code>. Optional
   * <code>from</code> and <code>to</code> bounds filter request creation time; <code>query</code>
   * filters the queries stored on recovery requests. A filtered page can be empty or contain fewer
   * than <code>limit</code> results and still include <code>meta.next_cursor</code>. Continue until
   * the cursor is absent, keeping the filters unchanged between pages.
   *
   * @param type Must equal batch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RumRecoveryBatchListResponse&gt;
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
  public ApiResponse<RumRecoveryBatchListResponse> listRUMRecoveryBatchRequestsWithHttpInfo(
      RumRecoveryBatchRequestType type, ListRUMRecoveryBatchRequestsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(
          400, "Missing the required parameter 'type' when calling listRUMRecoveryBatchRequests");
    }
    Integer limit = parameters.limit;
    String cursor = parameters.cursor;
    Long from = parameters.from;
    Long to = parameters.to;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/requests";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.listRUMRecoveryBatchRequests",
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
        new GenericType<RumRecoveryBatchListResponse>() {});
  }

  /**
   * List batch recovery requests.
   *
   * <p>See {@link #listRUMRecoveryBatchRequestsWithHttpInfo}.
   *
   * @param type Must equal batch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RumRecoveryBatchListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRecoveryBatchListResponse>>
      listRUMRecoveryBatchRequestsWithHttpInfoAsync(
          RumRecoveryBatchRequestType type,
          ListRUMRecoveryBatchRequestsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'type' is set
    if (type == null) {
      CompletableFuture<ApiResponse<RumRecoveryBatchListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'type' when calling listRUMRecoveryBatchRequests"));
      return result;
    }
    Integer limit = parameters.limit;
    String cursor = parameters.cursor;
    Long from = parameters.from;
    Long to = parameters.to;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/requests";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.listRUMRecoveryBatchRequests",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRecoveryBatchListResponse>> result =
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
        new GenericType<RumRecoveryBatchListResponse>() {});
  }

  /**
   * Search archived sessions.
   *
   * <p>See {@link #searchRUMArchiveSessionsWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return RumArchiveSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public RumArchiveSessionsResponse searchRUMArchiveSessions(RumArchiveSessionsSearchRequest body)
      throws ApiException {
    return searchRUMArchiveSessionsWithHttpInfo(body).getData();
  }

  /**
   * Search archived sessions.
   *
   * <p>See {@link #searchRUMArchiveSessionsWithHttpInfoAsync}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;RumArchiveSessionsResponse&gt;
   */
  public CompletableFuture<RumArchiveSessionsResponse> searchRUMArchiveSessionsAsync(
      RumArchiveSessionsSearchRequest body) {
    return searchRUMArchiveSessionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search archived RUM sessions. Use <code>meta.page.next_cursor</code> to retrieve the next page.
   *
   * @param body JSON:API request body. (required)
   * @return ApiResponse&lt;RumArchiveSessionsResponse&gt;
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
  public ApiResponse<RumArchiveSessionsResponse> searchRUMArchiveSessionsWithHttpInfo(
      RumArchiveSessionsSearchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchRUMArchiveSessions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/sessions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.searchRUMArchiveSessions",
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
        new GenericType<RumArchiveSessionsResponse>() {});
  }

  /**
   * Search archived sessions.
   *
   * <p>See {@link #searchRUMArchiveSessionsWithHttpInfo}.
   *
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumArchiveSessionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumArchiveSessionsResponse>>
      searchRUMArchiveSessionsWithHttpInfoAsync(RumArchiveSessionsSearchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumArchiveSessionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling searchRUMArchiveSessions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/recover/sessions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.searchRUMArchiveSessions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumArchiveSessionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumArchiveSessionsResponse>() {});
  }

  /**
   * Cancel a batch recovery request.
   *
   * <p>See {@link #updateRUMRecoveryBatchRequestWithHttpInfo}.
   *
   * @param requestId Recovery request UUID. (required)
   * @param body JSON:API request body. (required)
   * @return RumRecoveryCancelResponse
   * @throws ApiException if fails to make API call
   */
  public RumRecoveryCancelResponse updateRUMRecoveryBatchRequest(
      UUID requestId, RumRecoveryCancelRequest body) throws ApiException {
    return updateRUMRecoveryBatchRequestWithHttpInfo(requestId, body).getData();
  }

  /**
   * Cancel a batch recovery request.
   *
   * <p>See {@link #updateRUMRecoveryBatchRequestWithHttpInfoAsync}.
   *
   * @param requestId Recovery request UUID. (required)
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;RumRecoveryCancelResponse&gt;
   */
  public CompletableFuture<RumRecoveryCancelResponse> updateRUMRecoveryBatchRequestAsync(
      UUID requestId, RumRecoveryCancelRequest body) {
    return updateRUMRecoveryBatchRequestWithHttpInfoAsync(requestId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel pending work for a batch recovery request. Work already in progress can finish, and
   * recovered data is not removed. Requests in a terminal state return <code>409</code>.
   *
   * @param requestId Recovery request UUID. (required)
   * @param body JSON:API request body. (required)
   * @return ApiResponse&lt;RumRecoveryCancelResponse&gt;
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
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumRecoveryCancelResponse> updateRUMRecoveryBatchRequestWithHttpInfo(
      UUID requestId, RumRecoveryCancelRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'requestId' when calling updateRUMRecoveryBatchRequest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMRecoveryBatchRequest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/recover/requests/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRecoveryApi.updateRUMRecoveryBatchRequest",
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
        new GenericType<RumRecoveryCancelResponse>() {});
  }

  /**
   * Cancel a batch recovery request.
   *
   * <p>See {@link #updateRUMRecoveryBatchRequestWithHttpInfo}.
   *
   * @param requestId Recovery request UUID. (required)
   * @param body JSON:API request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRecoveryCancelResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRecoveryCancelResponse>>
      updateRUMRecoveryBatchRequestWithHttpInfoAsync(
          UUID requestId, RumRecoveryCancelRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      CompletableFuture<ApiResponse<RumRecoveryCancelResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'requestId' when calling"
                  + " updateRUMRecoveryBatchRequest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRecoveryCancelResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateRUMRecoveryBatchRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/recover/requests/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRecoveryApi.updateRUMRecoveryBatchRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRecoveryCancelResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRecoveryCancelResponse>() {});
  }
}
