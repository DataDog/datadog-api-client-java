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
   * Create rum replay session watch.
   *
   * <p>See {@link #createRumReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return Watch
   * @throws ApiException if fails to make API call
   */
  public Watch createRumReplaySessionWatch(String sessionId, Watch body) throws ApiException {
    return createRumReplaySessionWatchWithHttpInfo(sessionId, body).getData();
  }

  /**
   * Create rum replay session watch.
   *
   * <p>See {@link #createRumReplaySessionWatchWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Watch&gt;
   */
  public CompletableFuture<Watch> createRumReplaySessionWatchAsync(String sessionId, Watch body) {
    return createRumReplaySessionWatchWithHttpInfoAsync(sessionId, body)
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
  public ApiResponse<Watch> createRumReplaySessionWatchWithHttpInfo(String sessionId, Watch body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling createRumReplaySessionWatch");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumReplaySessionWatch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.createRumReplaySessionWatch",
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
   * Create rum replay session watch.
   *
   * <p>See {@link #createRumReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Watch&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Watch>> createRumReplaySessionWatchWithHttpInfoAsync(
      String sessionId, Watch body) {
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Watch>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " createRumReplaySessionWatch"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Watch>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createRumReplaySessionWatch"));
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
              "v2.RumReplayViewershipApi.createRumReplaySessionWatch",
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
   * Delete rum replay session watch.
   *
   * <p>See {@link #deleteRumReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRumReplaySessionWatch(String sessionId) throws ApiException {
    deleteRumReplaySessionWatchWithHttpInfo(sessionId);
  }

  /**
   * Delete rum replay session watch.
   *
   * <p>See {@link #deleteRumReplaySessionWatchWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRumReplaySessionWatchAsync(String sessionId) {
    return deleteRumReplaySessionWatchWithHttpInfoAsync(sessionId)
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
  public ApiResponse<Void> deleteRumReplaySessionWatchWithHttpInfo(String sessionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling deleteRumReplaySessionWatch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/sessions/{session_id}/watches"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayViewershipApi.deleteRumReplaySessionWatch",
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
   * Delete rum replay session watch.
   *
   * <p>See {@link #deleteRumReplaySessionWatchWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRumReplaySessionWatchWithHttpInfoAsync(
      String sessionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " deleteRumReplaySessionWatch"));
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
              "v2.RumReplayViewershipApi.deleteRumReplaySessionWatch",
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

  /** Manage optional parameters to listRumReplaySessionWatchers. */
  public static class ListRumReplaySessionWatchersOptionalParameters {
    private Integer pageSize;
    private Integer pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRumReplaySessionWatchersOptionalParameters
     */
    public ListRumReplaySessionWatchersOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRumReplaySessionWatchersOptionalParameters
     */
    public ListRumReplaySessionWatchersOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List rum replay session watchers.
   *
   * <p>See {@link #listRumReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return WatcherArray
   * @throws ApiException if fails to make API call
   */
  public WatcherArray listRumReplaySessionWatchers(String sessionId) throws ApiException {
    return listRumReplaySessionWatchersWithHttpInfo(
            sessionId, new ListRumReplaySessionWatchersOptionalParameters())
        .getData();
  }

  /**
   * List rum replay session watchers.
   *
   * <p>See {@link #listRumReplaySessionWatchersWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;WatcherArray&gt;
   */
  public CompletableFuture<WatcherArray> listRumReplaySessionWatchersAsync(String sessionId) {
    return listRumReplaySessionWatchersWithHttpInfoAsync(
            sessionId, new ListRumReplaySessionWatchersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rum replay session watchers.
   *
   * <p>See {@link #listRumReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return WatcherArray
   * @throws ApiException if fails to make API call
   */
  public WatcherArray listRumReplaySessionWatchers(
      String sessionId, ListRumReplaySessionWatchersOptionalParameters parameters)
      throws ApiException {
    return listRumReplaySessionWatchersWithHttpInfo(sessionId, parameters).getData();
  }

  /**
   * List rum replay session watchers.
   *
   * <p>See {@link #listRumReplaySessionWatchersWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;WatcherArray&gt;
   */
  public CompletableFuture<WatcherArray> listRumReplaySessionWatchersAsync(
      String sessionId, ListRumReplaySessionWatchersOptionalParameters parameters) {
    return listRumReplaySessionWatchersWithHttpInfoAsync(sessionId, parameters)
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
  public ApiResponse<WatcherArray> listRumReplaySessionWatchersWithHttpInfo(
      String sessionId, ListRumReplaySessionWatchersOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling listRumReplaySessionWatchers");
    }
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
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
            "v2.RumReplayViewershipApi.listRumReplaySessionWatchers",
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
   * List rum replay session watchers.
   *
   * <p>See {@link #listRumReplaySessionWatchersWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;WatcherArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WatcherArray>> listRumReplaySessionWatchersWithHttpInfoAsync(
      String sessionId, ListRumReplaySessionWatchersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<WatcherArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " listRumReplaySessionWatchers"));
      return result;
    }
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
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
              "v2.RumReplayViewershipApi.listRumReplaySessionWatchers",
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

  /** Manage optional parameters to listRumReplayViewershipHistorySessions. */
  public static class ListRumReplayViewershipHistorySessionsOptionalParameters {
    private Long filterWatchedAtStart;
    private Integer pageNumber;
    private String filterCreatedBy;
    private Long filterWatchedAtEnd;
    private String filterSessionIds;
    private Integer pageSize;
    private String filterApplicationId;

    /**
     * Set filterWatchedAtStart.
     *
     * @param filterWatchedAtStart Start timestamp in milliseconds for watched_at filter. (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters filterWatchedAtStart(
        Long filterWatchedAtStart) {
      this.filterWatchedAtStart = filterWatchedAtStart;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterCreatedBy.
     *
     * @param filterCreatedBy Filter by user UUID. Defaults to current user if not specified.
     *     (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters filterCreatedBy(
        String filterCreatedBy) {
      this.filterCreatedBy = filterCreatedBy;
      return this;
    }

    /**
     * Set filterWatchedAtEnd.
     *
     * @param filterWatchedAtEnd End timestamp in milliseconds for watched_at filter. (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters filterWatchedAtEnd(
        Long filterWatchedAtEnd) {
      this.filterWatchedAtEnd = filterWatchedAtEnd;
      return this;
    }

    /**
     * Set filterSessionIds.
     *
     * @param filterSessionIds Comma-separated list of session IDs to filter by. (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters filterSessionIds(
        String filterSessionIds) {
      this.filterSessionIds = filterSessionIds;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterApplicationId.
     *
     * @param filterApplicationId Filter by application ID. (optional)
     * @return ListRumReplayViewershipHistorySessionsOptionalParameters
     */
    public ListRumReplayViewershipHistorySessionsOptionalParameters filterApplicationId(
        String filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }
  }

  /**
   * List rum replay viewership history sessions.
   *
   * <p>See {@link #listRumReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @return ViewershipHistorySessionArray
   * @throws ApiException if fails to make API call
   */
  public ViewershipHistorySessionArray listRumReplayViewershipHistorySessions()
      throws ApiException {
    return listRumReplayViewershipHistorySessionsWithHttpInfo(
            new ListRumReplayViewershipHistorySessionsOptionalParameters())
        .getData();
  }

  /**
   * List rum replay viewership history sessions.
   *
   * <p>See {@link #listRumReplayViewershipHistorySessionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ViewershipHistorySessionArray&gt;
   */
  public CompletableFuture<ViewershipHistorySessionArray>
      listRumReplayViewershipHistorySessionsAsync() {
    return listRumReplayViewershipHistorySessionsWithHttpInfoAsync(
            new ListRumReplayViewershipHistorySessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rum replay viewership history sessions.
   *
   * <p>See {@link #listRumReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ViewershipHistorySessionArray
   * @throws ApiException if fails to make API call
   */
  public ViewershipHistorySessionArray listRumReplayViewershipHistorySessions(
      ListRumReplayViewershipHistorySessionsOptionalParameters parameters) throws ApiException {
    return listRumReplayViewershipHistorySessionsWithHttpInfo(parameters).getData();
  }

  /**
   * List rum replay viewership history sessions.
   *
   * <p>See {@link #listRumReplayViewershipHistorySessionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ViewershipHistorySessionArray&gt;
   */
  public CompletableFuture<ViewershipHistorySessionArray>
      listRumReplayViewershipHistorySessionsAsync(
          ListRumReplayViewershipHistorySessionsOptionalParameters parameters) {
    return listRumReplayViewershipHistorySessionsWithHttpInfoAsync(parameters)
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
      listRumReplayViewershipHistorySessionsWithHttpInfo(
          ListRumReplayViewershipHistorySessionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long filterWatchedAtStart = parameters.filterWatchedAtStart;
    Integer pageNumber = parameters.pageNumber;
    String filterCreatedBy = parameters.filterCreatedBy;
    Long filterWatchedAtEnd = parameters.filterWatchedAtEnd;
    String filterSessionIds = parameters.filterSessionIds;
    Integer pageSize = parameters.pageSize;
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
            "v2.RumReplayViewershipApi.listRumReplayViewershipHistorySessions",
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
   * List rum replay viewership history sessions.
   *
   * <p>See {@link #listRumReplayViewershipHistorySessionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ViewershipHistorySessionArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ViewershipHistorySessionArray>>
      listRumReplayViewershipHistorySessionsWithHttpInfoAsync(
          ListRumReplayViewershipHistorySessionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long filterWatchedAtStart = parameters.filterWatchedAtStart;
    Integer pageNumber = parameters.pageNumber;
    String filterCreatedBy = parameters.filterCreatedBy;
    Long filterWatchedAtEnd = parameters.filterWatchedAtEnd;
    String filterSessionIds = parameters.filterSessionIds;
    Integer pageSize = parameters.pageSize;
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
              "v2.RumReplayViewershipApi.listRumReplayViewershipHistorySessions",
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
