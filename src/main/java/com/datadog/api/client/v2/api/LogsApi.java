package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ContentEncoding;
import com.datadog.api.client.v2.model.HTTPLogItem;
import com.datadog.api.client.v2.model.Log;
import com.datadog.api.client.v2.model.LogsAggregateRequest;
import com.datadog.api.client.v2.model.LogsAggregateResponse;
import com.datadog.api.client.v2.model.LogsListRequest;
import com.datadog.api.client.v2.model.LogsListRequestPage;
import com.datadog.api.client.v2.model.LogsListResponse;
import com.datadog.api.client.v2.model.LogsSort;
import com.datadog.api.client.v2.model.LogsStorageTier;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsApi {
  private ApiClient apiClient;

  public LogsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsApi(ApiClient apiClient) {
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
   * Aggregate events.
   *
   * <p>See {@link #aggregateLogsWithHttpInfo}.
   *
   * @param body (required)
   * @return LogsAggregateResponse
   * @throws ApiException if fails to make API call
   */
  public LogsAggregateResponse aggregateLogs(LogsAggregateRequest body) throws ApiException {
    return aggregateLogsWithHttpInfo(body).getData();
  }

  /**
   * Aggregate events.
   *
   * <p>See {@link #aggregateLogsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;LogsAggregateResponse&gt;
   */
  public CompletableFuture<LogsAggregateResponse> aggregateLogsAsync(LogsAggregateRequest body) {
    return aggregateLogsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The API endpoint to aggregate events into buckets and compute metrics and timeseries.
   *
   * @param body (required)
   * @return ApiResponse&lt;LogsAggregateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsAggregateResponse> aggregateLogsWithHttpInfo(LogsAggregateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateLogs");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsApi.aggregateLogs",
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
        new GenericType<LogsAggregateResponse>() {});
  }

  /**
   * Aggregate events.
   *
   * <p>See {@link #aggregateLogsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsAggregateResponse>> aggregateLogsWithHttpInfoAsync(
      LogsAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsAggregateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling aggregateLogs"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsApi.aggregateLogs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsAggregateResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsAggregateResponse>() {});
  }

  /** Manage optional parameters to listLogs. */
  public static class ListLogsOptionalParameters {
    private LogsListRequest body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return ListLogsOptionalParameters
     */
    public ListLogsOptionalParameters body(LogsListRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @return LogsListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsListResponse listLogs() throws ApiException {
    return listLogsWithHttpInfo(new ListLogsOptionalParameters()).getData();
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsListResponse&gt;
   */
  public CompletableFuture<LogsListResponse> listLogsAsync() {
    return listLogsWithHttpInfoAsync(new ListLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LogsListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsListResponse listLogs(ListLogsOptionalParameters parameters) throws ApiException {
    return listLogsWithHttpInfo(parameters).getData();
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LogsListResponse&gt;
   */
  public CompletableFuture<LogsListResponse> listLogsAsync(ListLogsOptionalParameters parameters) {
    return listLogsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Log&gt;
   */
  public PaginationIterable<Log> listLogsWithPagination() {
    ListLogsOptionalParameters parameters = new ListLogsOptionalParameters();
    return listLogsWithPagination(parameters);
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @return LogsListResponse
   */
  public PaginationIterable<Log> listLogsWithPagination(ListLogsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.body == null) {
      parameters.body(new LogsListRequest());
    }

    if (parameters.body.getPage() == null) {
      parameters.body.setPage(new LogsListRequestPage());
    }

    if (parameters.body.getPage().getLimit() == null) {
      limit = 10;
      parameters.body.getPage().setLimit(limit);
    } else {
      limit = parameters.body.getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listLogs",
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
   * List endpoint returns logs that match a log search query. <a
   * href="/logs/guide/collect-multiple-logs-with-pagination">Results are paginated</a>.
   *
   * <p>Use this endpoint to search and filter your logs.
   *
   * <p><strong>If you are considering archiving logs for your organization, consider use of the
   * Datadog archive capabilities instead of the log list API. See <a
   * href="https://docs.datadoghq.com/logs/archives">Datadog Logs Archive
   * documentation</a>.</strong>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LogsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsListResponse> listLogsWithHttpInfo(ListLogsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/logs/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsApi.listLogs",
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
        new GenericType<LogsListResponse>() {});
  }

  /**
   * Search logs (POST).
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LogsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsListResponse>> listLogsWithHttpInfoAsync(
      ListLogsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/logs/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsApi.listLogs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsListResponse>() {});
  }

  /** Manage optional parameters to listLogsGet. */
  public static class ListLogsGetOptionalParameters {
    private String filterQuery;
    private List<String> filterIndexes;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private LogsStorageTier filterStorageTier;
    private LogsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query following logs syntax. (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterIndexes.
     *
     * @param filterIndexes For customers with multiple indexes, the indexes to search. Defaults to
     *     '*' which means all indexes (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters filterIndexes(List<String> filterIndexes) {
      this.filterIndexes = filterIndexes;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Minimum timestamp for requested logs. (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Maximum timestamp for requested logs. (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterStorageTier.
     *
     * @param filterStorageTier Specifies the storage type to be used (optional, default to
     *     "indexes")
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters filterStorageTier(LogsStorageTier filterStorageTier) {
      this.filterStorageTier = filterStorageTier;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Order of logs in results. (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters sort(LogsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of logs in the response. (optional, default to 10)
     * @return ListLogsGetOptionalParameters
     */
    public ListLogsGetOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfo}.
   *
   * @return LogsListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsListResponse listLogsGet() throws ApiException {
    return listLogsGetWithHttpInfo(new ListLogsGetOptionalParameters()).getData();
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsListResponse&gt;
   */
  public CompletableFuture<LogsListResponse> listLogsGetAsync() {
    return listLogsGetWithHttpInfoAsync(new ListLogsGetOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return LogsListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsListResponse listLogsGet(ListLogsGetOptionalParameters parameters)
      throws ApiException {
    return listLogsGetWithHttpInfo(parameters).getData();
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;LogsListResponse&gt;
   */
  public CompletableFuture<LogsListResponse> listLogsGetAsync(
      ListLogsGetOptionalParameters parameters) {
    return listLogsGetWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Log&gt;
   */
  public PaginationIterable<Log> listLogsGetWithPagination() {
    ListLogsGetOptionalParameters parameters = new ListLogsGetOptionalParameters();
    return listLogsGetWithPagination(parameters);
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfo}.
   *
   * @return LogsListResponse
   */
  public PaginationIterable<Log> listLogsGetWithPagination(
      ListLogsGetOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageLimit == null) {
      limit = 10;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listLogsGet",
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
   * List endpoint returns logs that match a log search query. <a
   * href="/logs/guide/collect-multiple-logs-with-pagination">Results are paginated</a>.
   *
   * <p>Use this endpoint to search and filter your logs.
   *
   * <p><strong>If you are considering archiving logs for your organization, consider use of the
   * Datadog archive capabilities instead of the log list API. See <a
   * href="https://docs.datadoghq.com/logs/archives">Datadog Logs Archive
   * documentation</a>.</strong>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;LogsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsListResponse> listLogsGetWithHttpInfo(
      ListLogsGetOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    List<String> filterIndexes = parameters.filterIndexes;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    LogsStorageTier filterStorageTier = parameters.filterStorageTier;
    LogsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/logs/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[indexes]", filterIndexes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[storage_tier]", filterStorageTier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsApi.listLogsGet",
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
        new GenericType<LogsListResponse>() {});
  }

  /**
   * Search logs (GET).
   *
   * <p>See {@link #listLogsGetWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;LogsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsListResponse>> listLogsGetWithHttpInfoAsync(
      ListLogsGetOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    List<String> filterIndexes = parameters.filterIndexes;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    LogsStorageTier filterStorageTier = parameters.filterStorageTier;
    LogsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/logs/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[indexes]", filterIndexes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[storage_tier]", filterStorageTier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsApi.listLogsGet",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsListResponse>() {});
  }

  /** Manage optional parameters to submitLog. */
  public static class SubmitLogOptionalParameters {
    private ContentEncoding contentEncoding;
    private String ddtags;

    /**
     * Set contentEncoding.
     *
     * @param contentEncoding HTTP header used to compress the media-type. (optional)
     * @return SubmitLogOptionalParameters
     */
    public SubmitLogOptionalParameters contentEncoding(ContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }

    /**
     * Set ddtags.
     *
     * @param ddtags Log tags can be passed as query parameters with <code>text/plain</code> content
     *     type. (optional)
     * @return SubmitLogOptionalParameters
     */
    public SubmitLogOptionalParameters ddtags(String ddtags) {
      this.ddtags = ddtags;
      return this;
    }
  }

  /**
   * Send logs.
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitLog(List<HTTPLogItem> body) throws ApiException {
    return submitLogWithHttpInfo(body, new SubmitLogOptionalParameters()).getData();
  }

  /**
   * Send logs.
   *
   * <p>See {@link #submitLogWithHttpInfoAsync}.
   *
   * @param body Log to send (JSON format). (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitLogAsync(List<HTTPLogItem> body) {
    return submitLogWithHttpInfoAsync(body, new SubmitLogOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send logs.
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitLog(List<HTTPLogItem> body, SubmitLogOptionalParameters parameters)
      throws ApiException {
    return submitLogWithHttpInfo(body, parameters).getData();
  }

  /**
   * Send logs.
   *
   * <p>See {@link #submitLogWithHttpInfoAsync}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitLogAsync(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) {
    return submitLogWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send your logs to your Datadog platform over HTTP. Limits per HTTP request are:
   *
   * <ul>
   *   <li>Maximum content size per payload (uncompressed): 5MB
   *   <li>Maximum size for a single log: 1MB
   *   <li>Maximum array size if sending multiple logs in an array: 1000 entries
   * </ul>
   *
   * <p>Any log exceeding 1MB is accepted and truncated by Datadog: - For a single log request, the
   * API truncates the log at 1MB and returns a 2xx. - For a multi-logs request, the API processes
   * all logs, truncates only logs larger than 1MB, and returns a 2xx.
   *
   * <p>Datadog recommends sending your logs compressed. Add the <code>Content-Encoding: gzip</code>
   * header to the request when sending compressed logs. Log events can be submitted with a
   * timestamp that is up to 18 hours in the past.
   *
   * <p>The status codes answered by the HTTP API are: - 202: Accepted: the request has been
   * accepted for processing - 400: Bad request (likely an issue in the payload formatting) - 401:
   * Unauthorized (likely a missing API Key) - 403: Permission issue (likely using an invalid API
   * Key) - 408: Request Timeout, request should be retried after some time - 413: Payload too large
   * (batch is above 5MB uncompressed) - 429: Too Many Requests, request should be retried after
   * some time - 500: Internal Server Error, the server encountered an unexpected condition that
   * prevented it from fulfilling the request, request should be retried after some time - 503:
   * Service Unavailable, the server is not ready to handle the request probably because it is
   * overloaded, request should be retried after some time
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Request accepted for processing (always 202 empty JSON). </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> submitLogWithHttpInfo(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitLog");
    }
    ContentEncoding contentEncoding = parameters.contentEncoding;
    String ddtags = parameters.ddtags;
    // create path and map variables
    String localVarPath = "/api/v2/logs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ddtags", ddtags));
    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsApi.submitLog",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json", "application/logplex-1", "text/plain"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Send logs.
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> submitLogWithHttpInfoAsync(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling submitLog"));
      return result;
    }
    ContentEncoding contentEncoding = parameters.contentEncoding;
    String ddtags = parameters.ddtags;
    // create path and map variables
    String localVarPath = "/api/v2/logs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ddtags", ddtags));
    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsApi.submitLog",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json", "application/logplex-1", "text/plain"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }
}
