package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMAggregateRequest;
import com.datadog.api.client.v2.model.RUMAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.RUMEvent;
import com.datadog.api.client.v2.model.RUMEventsResponse;
import com.datadog.api.client.v2.model.RUMQueryPageOptions;
import com.datadog.api.client.v2.model.RUMSearchEventsRequest;
import com.datadog.api.client.v2.model.RUMSort;
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
public class RumApi {
  private ApiClient apiClient;

  public RumApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumApi(ApiClient apiClient) {
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
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMAnalyticsAggregateResponse
   * @throws ApiException if fails to make API call
   */
  public RUMAnalyticsAggregateResponse aggregateRUMEvents(RUMAggregateRequest body)
      throws ApiException {
    return aggregateRUMEventsWithHttpInfo(body).getData();
  }

  /**
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMAnalyticsAggregateResponse&gt;
   */
  public CompletableFuture<RUMAnalyticsAggregateResponse> aggregateRUMEventsAsync(
      RUMAggregateRequest body) {
    return aggregateRUMEventsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The API endpoint to aggregate RUM events into buckets of computed metrics and timeseries.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMAnalyticsAggregateResponse&gt;
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
  public ApiResponse<RUMAnalyticsAggregateResponse> aggregateRUMEventsWithHttpInfo(
      RUMAggregateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateRUMEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.aggregateRUMEvents",
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
        new GenericType<RUMAnalyticsAggregateResponse>() {});
  }

  /**
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMAnalyticsAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>>
      aggregateRUMEventsWithHttpInfoAsync(RUMAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling aggregateRUMEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "RumApi.aggregateRUMEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>> result =
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
        new GenericType<RUMAnalyticsAggregateResponse>() {});
  }

  /** Manage optional parameters to listRUMEvents. */
  public static class ListRUMEventsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private RUMSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query following RUM syntax. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Order of events in results. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters sort(RUMSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse listRUMEvents() throws ApiException {
    return listRUMEventsWithHttpInfo(new ListRUMEventsOptionalParameters()).getData();
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> listRUMEventsAsync() {
    return listRUMEventsWithHttpInfoAsync(new ListRUMEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse listRUMEvents(ListRUMEventsOptionalParameters parameters)
      throws ApiException {
    return listRUMEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> listRUMEventsAsync(
      ListRUMEventsOptionalParameters parameters) {
    return listRUMEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;RUMEvent&gt;
   */
  public PaginationIterable<RUMEvent> listRUMEventsWithPagination() throws ApiException {
    ListRUMEventsOptionalParameters parameters = new ListRUMEventsOptionalParameters();
    return listRUMEventsWithPagination(parameters);
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return RUMEventsResponse
   */
  public PaginationIterable<RUMEvent> listRUMEventsWithPagination(
      ListRUMEventsOptionalParameters parameters) throws ApiException {
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
            "listRUMEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns events that match a RUM search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated</a>.
   *
   * <p>Use this endpoint to see your latest RUM events.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RUMEventsResponse&gt;
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
  public ApiResponse<RUMEventsResponse> listRUMEventsWithHttpInfo(
      ListRUMEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    RUMSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events";

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
            "v2.RumApi.listRUMEvents",
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RUMEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMEventsResponse>> listRUMEventsWithHttpInfoAsync(
      ListRUMEventsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    RUMSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events";

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
              "RumApi.listRUMEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse searchRUMEvents(RUMSearchEventsRequest body) throws ApiException {
    return searchRUMEventsWithHttpInfo(body).getData();
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> searchRUMEventsAsync(RUMSearchEventsRequest body) {
    return searchRUMEventsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return PaginationIterable&lt;RUMEvent&gt;
   */
  public PaginationIterable<RUMEvent> searchRUMEventsWithPagination(RUMSearchEventsRequest body)
      throws ApiException {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = false;
    Integer limit;

    if (body.getPage() == null) {
      body.setPage(new RUMQueryPageOptions());
    }

    if (body.getPage().getLimit() == null) {
      limit = 10;
      body.getPage().setLimit(limit);
    } else {
      limit = body.getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("body", body);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchRUMEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns RUM events that match a RUM search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated</a>.
   *
   * <p>Use this endpoint to build complex RUM events filtering and search.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMEventsResponse&gt;
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
  public ApiResponse<RUMEventsResponse> searchRUMEventsWithHttpInfo(RUMSearchEventsRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchRUMEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.searchRUMEvents",
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMEventsResponse>> searchRUMEventsWithHttpInfoAsync(
      RUMSearchEventsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling searchRUMEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "RumApi.searchRUMEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMEventsResponse>() {});
  }
}
