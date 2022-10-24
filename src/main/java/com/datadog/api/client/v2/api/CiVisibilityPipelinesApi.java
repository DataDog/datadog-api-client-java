package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CIAppPipelineEvent;
import com.datadog.api.client.v2.model.CIAppPipelineEventsRequest;
import com.datadog.api.client.v2.model.CIAppPipelineEventsResponse;
import com.datadog.api.client.v2.model.CIAppPipelinesAggregateRequest;
import com.datadog.api.client.v2.model.CIAppPipelinesAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.CIAppQueryPageOptions;
import com.datadog.api.client.v2.model.CIAppSort;
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
public class CiVisibilityPipelinesApi {
  private ApiClient apiClient;

  public CiVisibilityPipelinesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CiVisibilityPipelinesApi(ApiClient apiClient) {
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
   * Aggregate pipelines events.
   *
   * <p>See {@link #aggregateCIAppPipelineEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CIAppPipelinesAnalyticsAggregateResponse
   * @throws ApiException if fails to make API call
   */
  public CIAppPipelinesAnalyticsAggregateResponse aggregateCIAppPipelineEvents(
      CIAppPipelinesAggregateRequest body) throws ApiException {
    return aggregateCIAppPipelineEventsWithHttpInfo(body).getData();
  }

  /**
   * Aggregate pipelines events.
   *
   * <p>See {@link #aggregateCIAppPipelineEventsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CIAppPipelinesAnalyticsAggregateResponse&gt;
   */
  public CompletableFuture<CIAppPipelinesAnalyticsAggregateResponse>
      aggregateCIAppPipelineEventsAsync(CIAppPipelinesAggregateRequest body) {
    return aggregateCIAppPipelineEventsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The API endpoint to aggregate CI Visibility pipeline events into buckets of computed metrics
   * and timeseries.
   *
   * @param body (required)
   * @return ApiResponse&lt;CIAppPipelinesAnalyticsAggregateResponse&gt;
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
  public ApiResponse<CIAppPipelinesAnalyticsAggregateResponse>
      aggregateCIAppPipelineEventsWithHttpInfo(CIAppPipelinesAggregateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateCIAppPipelineEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CiVisibilityPipelinesApi.aggregateCIAppPipelineEvents",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CIAppPipelinesAnalyticsAggregateResponse>() {});
  }

  /**
   * Aggregate pipelines events.
   *
   * <p>See {@link #aggregateCIAppPipelineEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppPipelinesAnalyticsAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppPipelinesAnalyticsAggregateResponse>>
      aggregateCIAppPipelineEventsWithHttpInfoAsync(CIAppPipelinesAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CIAppPipelinesAnalyticsAggregateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling aggregateCIAppPipelineEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CiVisibilityPipelinesApi.aggregateCIAppPipelineEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppPipelinesAnalyticsAggregateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<CIAppPipelinesAnalyticsAggregateResponse>() {});
  }

  /** Manage optional parameters to listCIAppPipelineEvents. */
  public static class ListCIAppPipelineEventsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private CIAppSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query following log syntax. (optional)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Order of events in results. (optional)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters sort(CIAppSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListCIAppPipelineEventsOptionalParameters
     */
    public ListCIAppPipelineEventsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfo}.
   *
   * @return CIAppPipelineEventsResponse
   * @throws ApiException if fails to make API call
   */
  public CIAppPipelineEventsResponse listCIAppPipelineEvents() throws ApiException {
    return listCIAppPipelineEventsWithHttpInfo(new ListCIAppPipelineEventsOptionalParameters())
        .getData();
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CIAppPipelineEventsResponse&gt;
   */
  public CompletableFuture<CIAppPipelineEventsResponse> listCIAppPipelineEventsAsync() {
    return listCIAppPipelineEventsWithHttpInfoAsync(new ListCIAppPipelineEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CIAppPipelineEventsResponse
   * @throws ApiException if fails to make API call
   */
  public CIAppPipelineEventsResponse listCIAppPipelineEvents(
      ListCIAppPipelineEventsOptionalParameters parameters) throws ApiException {
    return listCIAppPipelineEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CIAppPipelineEventsResponse&gt;
   */
  public CompletableFuture<CIAppPipelineEventsResponse> listCIAppPipelineEventsAsync(
      ListCIAppPipelineEventsOptionalParameters parameters) {
    return listCIAppPipelineEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;CIAppPipelineEvent&gt;
   */
  public PaginationIterable<CIAppPipelineEvent> listCIAppPipelineEventsWithPagination() {
    ListCIAppPipelineEventsOptionalParameters parameters =
        new ListCIAppPipelineEventsOptionalParameters();
    return listCIAppPipelineEventsWithPagination(parameters);
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfo}.
   *
   * @return CIAppPipelineEventsResponse
   */
  public PaginationIterable<CIAppPipelineEvent> listCIAppPipelineEventsWithPagination(
      ListCIAppPipelineEventsOptionalParameters parameters) {
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
            "listCIAppPipelineEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns CI Visibility pipeline events that match a log search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated similarly to logs</a>.
   *
   * <p>Use this endpoint to see your latest pipeline events.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CIAppPipelineEventsResponse&gt;
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
  public ApiResponse<CIAppPipelineEventsResponse> listCIAppPipelineEventsWithHttpInfo(
      ListCIAppPipelineEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    CIAppSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CiVisibilityPipelinesApi.listCIAppPipelineEvents",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CIAppPipelineEventsResponse>() {});
  }

  /**
   * Get a list of pipelines events.
   *
   * <p>See {@link #listCIAppPipelineEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppPipelineEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppPipelineEventsResponse>>
      listCIAppPipelineEventsWithHttpInfoAsync(
          ListCIAppPipelineEventsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    CIAppSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CiVisibilityPipelinesApi.listCIAppPipelineEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppPipelineEventsResponse>> result =
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
        new GenericType<CIAppPipelineEventsResponse>() {});
  }

  /** Manage optional parameters to searchCIAppPipelineEvents. */
  public static class SearchCIAppPipelineEventsOptionalParameters {
    private CIAppPipelineEventsRequest body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return SearchCIAppPipelineEventsOptionalParameters
     */
    public SearchCIAppPipelineEventsOptionalParameters body(CIAppPipelineEventsRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfo}.
   *
   * @return CIAppPipelineEventsResponse
   * @throws ApiException if fails to make API call
   */
  public CIAppPipelineEventsResponse searchCIAppPipelineEvents() throws ApiException {
    return searchCIAppPipelineEventsWithHttpInfo(new SearchCIAppPipelineEventsOptionalParameters())
        .getData();
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CIAppPipelineEventsResponse&gt;
   */
  public CompletableFuture<CIAppPipelineEventsResponse> searchCIAppPipelineEventsAsync() {
    return searchCIAppPipelineEventsWithHttpInfoAsync(
            new SearchCIAppPipelineEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CIAppPipelineEventsResponse
   * @throws ApiException if fails to make API call
   */
  public CIAppPipelineEventsResponse searchCIAppPipelineEvents(
      SearchCIAppPipelineEventsOptionalParameters parameters) throws ApiException {
    return searchCIAppPipelineEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CIAppPipelineEventsResponse&gt;
   */
  public CompletableFuture<CIAppPipelineEventsResponse> searchCIAppPipelineEventsAsync(
      SearchCIAppPipelineEventsOptionalParameters parameters) {
    return searchCIAppPipelineEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;CIAppPipelineEvent&gt;
   */
  public PaginationIterable<CIAppPipelineEvent> searchCIAppPipelineEventsWithPagination() {
    SearchCIAppPipelineEventsOptionalParameters parameters =
        new SearchCIAppPipelineEventsOptionalParameters();
    return searchCIAppPipelineEventsWithPagination(parameters);
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfo}.
   *
   * @return CIAppPipelineEventsResponse
   */
  public PaginationIterable<CIAppPipelineEvent> searchCIAppPipelineEventsWithPagination(
      SearchCIAppPipelineEventsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.body == null) {
      parameters.body(new CIAppPipelineEventsRequest());
    }

    if (parameters.body.getPage() == null) {
      parameters.body.setPage(new CIAppQueryPageOptions());
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
            "searchCIAppPipelineEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns CI Visibility pipeline events that match a log search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated similarly to logs</a>.
   *
   * <p>Use this endpoint to build complex events filtering and search.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CIAppPipelineEventsResponse&gt;
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
  public ApiResponse<CIAppPipelineEventsResponse> searchCIAppPipelineEventsWithHttpInfo(
      SearchCIAppPipelineEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CiVisibilityPipelinesApi.searchCIAppPipelineEvents",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CIAppPipelineEventsResponse>() {});
  }

  /**
   * Search pipelines events.
   *
   * <p>See {@link #searchCIAppPipelineEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppPipelineEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppPipelineEventsResponse>>
      searchCIAppPipelineEventsWithHttpInfoAsync(
          SearchCIAppPipelineEventsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/ci/pipelines/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "CiVisibilityPipelinesApi.searchCIAppPipelineEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppPipelineEventsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<CIAppPipelineEventsResponse>() {});
  }
}
