package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ViewershipHistorySessionArray;
import com.datadog.api.client.v2.model.Watch;
import com.datadog.api.client.v2.model.WatcherArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplayViewershipApi {
  private ApiClient apiClient;

  public RumReplayViewershipApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplayViewershipApi(ApiClient apiClient) {
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
   * Create RUM replay session watch.
   *
   * <p>See {@link #createRUMReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return Watch
   * @throws ApiException if fails to make API call
   */
  public Watch createRUMReplaySessionWatch(String sessionId, Watch body) throws ApiException {
    return createRUMReplaySessionWatchWithHttpInfo(sessionId, body).getData();
  }

  /**
   * Create RUM replay session watch.
   *
   * <p>See {@link #createRUMReplaySessionWatchWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Watch&gt;
   */
  public CompletableFuture<Watch> createRUMReplaySessionWatchAsync(String sessionId, Watch body) {
    return createRUMReplaySessionWatchWithHttpInfoAsync(sessionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Record a session watch.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return ApiResponse&lt;Watch&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Watch> createRUMReplaySessionWatchWithHttpInfo(String sessionId, Watch body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling createRUMReplaySessionWatch");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMReplaySessionWatch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.createRUMReplaySessionWatch",
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
        new GenericType<Watch>() {});
  }

  /**
   * Create RUM replay session watch.
   *
   * <p>See {@link #createRUMReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Watch&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Watch>> createRUMReplaySessionWatchWithHttpInfoAsync(
      String sessionId, Watch body) {
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Watch>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " createRUMReplaySessionWatch"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Watch>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createRUMReplaySessionWatch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayViewershipApi.createRUMReplaySessionWatch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Watch>> result = new CompletableFuture<>();
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
        new GenericType<Watch>() {});
  }

  /**
   * Delete RUM replay session watch.
   *
   * <p>See {@link #deleteRUMReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMReplaySessionWatch(String sessionId) throws ApiException {
    deleteRUMReplaySessionWatchWithHttpInfo(sessionId);
  }

  /**
   * Delete RUM replay session watch.
   *
   * <p>See {@link #deleteRUMReplaySessionWatchWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMReplaySessionWatchAsync(String sessionId) {
    return deleteRUMReplaySessionWatchWithHttpInfoAsync(sessionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete session watch history.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMReplaySessionWatchWithHttpInfo(String sessionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling deleteRUMReplaySessionWatch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.deleteRUMReplaySessionWatch",
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
   * Delete RUM replay session watch.
   *
   * <p>See {@link #deleteRUMReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMReplaySessionWatchWithHttpInfoAsync(
      String sessionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " deleteRUMReplaySessionWatch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayViewershipApi.deleteRUMReplaySessionWatch",
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

  /** Manage optional parameters to listRUMReplaySessionWatchers. */
  public static class ListRUMReplaySessionWatchersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRUMReplaySessionWatchersOptionalParameters
     */
    public ListRUMReplaySessionWatchersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRUMReplaySessionWatchersOptionalParameters
     */
    public ListRUMReplaySessionWatchersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List RUM replay session watchers.
   *
   * <p>See {@link #listRUMReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return WatcherArray
   * @throws ApiException if fails to make API call
   */
  public WatcherArray listRUMReplaySessionWatchers(String sessionId) throws ApiException {
    return listRUMReplaySessionWatchersWithHttpInfo(
            sessionId, new ListRUMReplaySessionWatchersOptionalParameters())
        .getData();
  }

  /**
   * List RUM replay session watchers.
   *
   * <p>See {@link #listRUMReplaySessionWatchersWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;WatcherArray&gt;
   */
  public CompletableFuture<WatcherArray> listRUMReplaySessionWatchersAsync(String sessionId) {
    return listRUMReplaySessionWatchersWithHttpInfoAsync(
            sessionId, new ListRUMReplaySessionWatchersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List RUM replay session watchers.
   *
   * <p>See {@link #listRUMReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return WatcherArray
   * @throws ApiException if fails to make API call
   */
  public WatcherArray listRUMReplaySessionWatchers(
      String sessionId, ListRUMReplaySessionWatchersOptionalParameters parameters)
      throws ApiException {
    return listRUMReplaySessionWatchersWithHttpInfo(sessionId, parameters).getData();
  }

  /**
   * List RUM replay session watchers.
   *
   * <p>See {@link #listRUMReplaySessionWatchersWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;WatcherArray&gt;
   */
  public CompletableFuture<WatcherArray> listRUMReplaySessionWatchersAsync(
      String sessionId, ListRUMReplaySessionWatchersOptionalParameters parameters) {
    return listRUMReplaySessionWatchersWithHttpInfoAsync(sessionId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List session watchers.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;WatcherArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WatcherArray> listRUMReplaySessionWatchersWithHttpInfo(
      String sessionId, ListRUMReplaySessionWatchersOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling listRUMReplaySessionWatchers");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watchers"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.listRUMReplaySessionWatchers",
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
        new GenericType<WatcherArray>() {});
  }

  /**
   * List RUM replay session watchers.
   *
   * <p>See {@link #listRUMReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;WatcherArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WatcherArray>> listRUMReplaySessionWatchersWithHttpInfoAsync(
      String sessionId, ListRUMReplaySessionWatchersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<WatcherArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " listRUMReplaySessionWatchers"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watchers"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayViewershipApi.listRUMReplaySessionWatchers",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WatcherArray>> result = new CompletableFuture<>();
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
        new GenericType<WatcherArray>() {});
  }

  /** Manage optional parameters to listRUMReplayViewershipHistorySessions. */
  public static class ListRUMReplayViewershipHistorySessionsOptionalParameters {
    private Long filterWatchedAtStart;
    private Long pageNumber;
    private String filterCreatedBy;
    private Long filterWatchedAtEnd;
    private String filterSessionIds;
    private Long pageSize;
    private String filterApplicationId;

    /**
     * Set filterWatchedAtStart.
     *
     * @param filterWatchedAtStart Start timestamp in milliseconds for watched_at filter. (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters filterWatchedAtStart(
        Long filterWatchedAtStart) {
      this.filterWatchedAtStart = filterWatchedAtStart;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterCreatedBy.
     *
     * @param filterCreatedBy Filter by user UUID. Defaults to current user if not specified.
     *     (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters filterCreatedBy(
        String filterCreatedBy) {
      this.filterCreatedBy = filterCreatedBy;
      return this;
    }

    /**
     * Set filterWatchedAtEnd.
     *
     * @param filterWatchedAtEnd End timestamp in milliseconds for watched_at filter. (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters filterWatchedAtEnd(
        Long filterWatchedAtEnd) {
      this.filterWatchedAtEnd = filterWatchedAtEnd;
      return this;
    }

    /**
     * Set filterSessionIds.
     *
     * @param filterSessionIds Comma-separated list of session IDs to filter by. (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters filterSessionIds(
        String filterSessionIds) {
      this.filterSessionIds = filterSessionIds;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterApplicationId.
     *
     * @param filterApplicationId Filter by application ID. (optional)
     * @return ListRUMReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRUMReplayViewershipHistorySessionsOptionalParameters filterApplicationId(
        String filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }
  }

  /**
   * List RUM replay viewership history sessions.
   *
   * <p>See {@link #listRUMReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @return ViewershipHistorySessionArray
   * @throws ApiException if fails to make API call
   */
  public ViewershipHistorySessionArray listRUMReplayViewershipHistorySessions()
      throws ApiException {
    return listRUMReplayViewershipHistorySessionsWithHttpInfo(
            new ListRUMReplayViewershipHistorySessionsOptionalParameters())
        .getData();
  }

  /**
   * List RUM replay viewership history sessions.
   *
   * <p>See {@link #listRUMReplayViewershipHistorySessionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ViewershipHistorySessionArray&gt;
   */
  public CompletableFuture<ViewershipHistorySessionArray>
      listRUMReplayViewershipHistorySessionsAsync() {
    return listRUMReplayViewershipHistorySessionsWithHttpInfoAsync(
            new ListRUMReplayViewershipHistorySessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List RUM replay viewership history sessions.
   *
   * <p>See {@link #listRUMReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ViewershipHistorySessionArray
   * @throws ApiException if fails to make API call
   */
  public ViewershipHistorySessionArray listRUMReplayViewershipHistorySessions(
      ListRUMReplayViewershipHistorySessionsOptionalParameters parameters) throws ApiException {
    return listRUMReplayViewershipHistorySessionsWithHttpInfo(parameters).getData();
  }

  /**
   * List RUM replay viewership history sessions.
   *
   * <p>See {@link #listRUMReplayViewershipHistorySessionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ViewershipHistorySessionArray&gt;
   */
  public CompletableFuture<ViewershipHistorySessionArray>
      listRUMReplayViewershipHistorySessionsAsync(
          ListRUMReplayViewershipHistorySessionsOptionalParameters parameters) {
    return listRUMReplayViewershipHistorySessionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List watched sessions.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ViewershipHistorySessionArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ViewershipHistorySessionArray>
      listRUMReplayViewershipHistorySessionsWithHttpInfo(
          ListRUMReplayViewershipHistorySessionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long filterWatchedAtStart = parameters.filterWatchedAtStart;
    Long pageNumber = parameters.pageNumber;
    String filterCreatedBy = parameters.filterCreatedBy;
    Long filterWatchedAtEnd = parameters.filterWatchedAtEnd;
    String filterSessionIds = parameters.filterSessionIds;
    Long pageSize = parameters.pageSize;
    String filterApplicationId = parameters.filterApplicationId;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/viewership-history/sessions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[watched_at][start]", filterWatchedAtStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_by]", filterCreatedBy));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[watched_at][end]", filterWatchedAtEnd));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[session_ids]", filterSessionIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.listRUMReplayViewershipHistorySessions",
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
        new GenericType<ViewershipHistorySessionArray>() {});
  }

  /**
   * List RUM replay viewership history sessions.
   *
   * <p>See {@link #listRUMReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ViewershipHistorySessionArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ViewershipHistorySessionArray>>
      listRUMReplayViewershipHistorySessionsWithHttpInfoAsync(
          ListRUMReplayViewershipHistorySessionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long filterWatchedAtStart = parameters.filterWatchedAtStart;
    Long pageNumber = parameters.pageNumber;
    String filterCreatedBy = parameters.filterCreatedBy;
    Long filterWatchedAtEnd = parameters.filterWatchedAtEnd;
    String filterSessionIds = parameters.filterSessionIds;
    Long pageSize = parameters.pageSize;
    String filterApplicationId = parameters.filterApplicationId;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/viewership-history/sessions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[watched_at][start]", filterWatchedAtStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_by]", filterCreatedBy));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[watched_at][end]", filterWatchedAtEnd));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[session_ids]", filterSessionIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayViewershipApi.listRUMReplayViewershipHistorySessions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ViewershipHistorySessionArray>> result =
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
        new GenericType<ViewershipHistorySessionArray>() {});
  }
}
