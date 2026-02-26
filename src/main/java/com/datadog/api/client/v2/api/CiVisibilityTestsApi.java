
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.CIAppTestsAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.CIAppTestsAggregateRequest;
import com.datadog.api.client.v2.model.CIAppTestEventsResponse;
import com.datadog.api.client.v2.model.CIAppSort;
import com.datadog.api.client.v2.model.CIAppTestEventsRequest;
import com.datadog.api.client.v2.model.CIAppTestEvent;
import com.datadog.api.client.v2.model.CIAppTestEvent;
import com.datadog.api.client.v2.model.CIAppTestEventsRequest;
import com.datadog.api.client.v2.model.CIAppQueryPageOptions;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CiVisibilityTestsApi {
  private ApiClient apiClient;
  public CiVisibilityTestsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CiVisibilityTestsApi(ApiClient apiClient) {
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
 * Aggregate tests events.
 *
 * See {@link #aggregateCIAppTestEventsWithHttpInfo}.
 *
 * @param body  (required)
 * @return CIAppTestsAnalyticsAggregateResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppTestsAnalyticsAggregateResponse  aggregateCIAppTestEvents(CIAppTestsAggregateRequest body) throws ApiException {
    return aggregateCIAppTestEventsWithHttpInfo(body).getData();
  }

  /**
 * Aggregate tests events.
 *
 * See {@link #aggregateCIAppTestEventsWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CIAppTestsAnalyticsAggregateResponse&gt;
 */
  public CompletableFuture<CIAppTestsAnalyticsAggregateResponse>aggregateCIAppTestEventsAsync(CIAppTestsAggregateRequest body) {
    return aggregateCIAppTestEventsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>The API endpoint to aggregate CI Visibility test events into buckets of computed metrics and timeseries.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CIAppTestsAnalyticsAggregateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CIAppTestsAnalyticsAggregateResponse> aggregateCIAppTestEventsWithHttpInfo(CIAppTestsAggregateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aggregateCIAppTestEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/analytics/aggregate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.aggregateCIAppTestEvents", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestsAnalyticsAggregateResponse>() {});
  }

  /**
   * Aggregate tests events.
   *
   * See {@link #aggregateCIAppTestEventsWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppTestsAnalyticsAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppTestsAnalyticsAggregateResponse>> aggregateCIAppTestEventsWithHttpInfoAsync(CIAppTestsAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CIAppTestsAnalyticsAggregateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling aggregateCIAppTestEvents"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/analytics/aggregate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.aggregateCIAppTestEvents", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppTestsAnalyticsAggregateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestsAnalyticsAggregateResponse>() {});
  }

  /**
   * Manage optional parameters to listCIAppTestEvents.
   */
  public static class ListCIAppTestEventsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private CIAppSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     * @param filterQuery Search query following log syntax. (optional)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     * @param sort Order of events in results. (optional)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters sort(CIAppSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     * @param pageCursor List following results with a cursor provided in the previous query. (optional)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListCIAppTestEventsOptionalParameters
     */
    public ListCIAppTestEventsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfo}.
 *
 * @return CIAppTestEventsResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppTestEventsResponse listCIAppTestEvents () throws ApiException {
    return listCIAppTestEventsWithHttpInfo(new ListCIAppTestEventsOptionalParameters()).getData();
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CIAppTestEventsResponse&gt;
 */
  public CompletableFuture<CIAppTestEventsResponse>listCIAppTestEventsAsync() {
    return listCIAppTestEventsWithHttpInfoAsync(new ListCIAppTestEventsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CIAppTestEventsResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppTestEventsResponse listCIAppTestEvents(ListCIAppTestEventsOptionalParameters parameters) throws ApiException {
    return listCIAppTestEventsWithHttpInfo(parameters).getData();
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CIAppTestEventsResponse&gt;
 */
  public CompletableFuture<CIAppTestEventsResponse>listCIAppTestEventsAsync(ListCIAppTestEventsOptionalParameters parameters) {
    return listCIAppTestEventsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfo}.
 *
 * @return PaginationIterable&lt;CIAppTestEvent&gt;
 */
  public PaginationIterable<CIAppTestEvent> listCIAppTestEventsWithPagination() {
    ListCIAppTestEventsOptionalParameters parameters = new ListCIAppTestEventsOptionalParameters();
    return listCIAppTestEventsWithPagination(parameters);
  }

  /**
 * Get a list of tests events.
 *
 * See {@link #listCIAppTestEventsWithHttpInfo}.
 *
 * @return CIAppTestEventsResponse
 */
  public PaginationIterable<CIAppTestEvent> listCIAppTestEventsWithPagination(ListCIAppTestEventsOptionalParameters parameters) {
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

  PaginationIterable iterator = new PaginationIterable(this, "listCIAppTestEvents", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>List endpoint returns CI Visibility test events that match a <a href="https://docs.datadoghq.com/continuous_integration/explorer/search_syntax/">search query</a>.
   * <a href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are paginated similarly to logs</a>.</p>
   * <p>Use this endpoint to see your latest test events.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CIAppTestEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CIAppTestEventsResponse> listCIAppTestEventsWithHttpInfo(ListCIAppTestEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    CIAppSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/events";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.listCIAppTestEvents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestEventsResponse>() {});
  }

  /**
   * Get a list of tests events.
   *
   * See {@link #listCIAppTestEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppTestEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppTestEventsResponse>> listCIAppTestEventsWithHttpInfoAsync(ListCIAppTestEventsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    CIAppSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/events";

    
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
      builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.listCIAppTestEvents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppTestEventsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestEventsResponse>() {});
  }

  /**
   * Manage optional parameters to searchCIAppTestEvents.
   */
  public static class SearchCIAppTestEventsOptionalParameters {
    private CIAppTestEventsRequest body;

    /**
     * Set body.
     * @param body  (optional)
     * @return SearchCIAppTestEventsOptionalParameters
     */
    public SearchCIAppTestEventsOptionalParameters body(CIAppTestEventsRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfo}.
 *
 * @return CIAppTestEventsResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppTestEventsResponse searchCIAppTestEvents () throws ApiException {
    return searchCIAppTestEventsWithHttpInfo(new SearchCIAppTestEventsOptionalParameters()).getData();
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CIAppTestEventsResponse&gt;
 */
  public CompletableFuture<CIAppTestEventsResponse>searchCIAppTestEventsAsync() {
    return searchCIAppTestEventsWithHttpInfoAsync(new SearchCIAppTestEventsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CIAppTestEventsResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppTestEventsResponse searchCIAppTestEvents(SearchCIAppTestEventsOptionalParameters parameters) throws ApiException {
    return searchCIAppTestEventsWithHttpInfo(parameters).getData();
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CIAppTestEventsResponse&gt;
 */
  public CompletableFuture<CIAppTestEventsResponse>searchCIAppTestEventsAsync(SearchCIAppTestEventsOptionalParameters parameters) {
    return searchCIAppTestEventsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfo}.
 *
 * @return PaginationIterable&lt;CIAppTestEvent&gt;
 */
  public PaginationIterable<CIAppTestEvent> searchCIAppTestEventsWithPagination() {
    SearchCIAppTestEventsOptionalParameters parameters = new SearchCIAppTestEventsOptionalParameters();
    return searchCIAppTestEventsWithPagination(parameters);
  }

  /**
 * Search tests events.
 *
 * See {@link #searchCIAppTestEventsWithHttpInfo}.
 *
 * @return CIAppTestEventsResponse
 */
  public PaginationIterable<CIAppTestEvent> searchCIAppTestEventsWithPagination(SearchCIAppTestEventsOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "getMeta.getPage.getAfter";
  String valueSetterPath = "body.getPage.setCursor";
  Boolean valueSetterParamOptional = true;
  Integer limit;

  
  if (parameters.body ==  null) {
      parameters.body(new CIAppTestEventsRequest());
  }

  if(parameters.body.getPage() == null) {
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

  PaginationIterable iterator = new PaginationIterable(this, "searchCIAppTestEvents", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>List endpoint returns CI Visibility test events that match a <a href="https://docs.datadoghq.com/continuous_integration/explorer/search_syntax/">search query</a>.
   * <a href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are paginated similarly to logs</a>.</p>
   * <p>Use this endpoint to build complex events filtering and search.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CIAppTestEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CIAppTestEventsResponse> searchCIAppTestEventsWithHttpInfo(SearchCIAppTestEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/events/search";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.searchCIAppTestEvents", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestEventsResponse>() {});
  }

  /**
   * Search tests events.
   *
   * See {@link #searchCIAppTestEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppTestEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppTestEventsResponse>> searchCIAppTestEventsWithHttpInfoAsync(SearchCIAppTestEventsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/ci/tests/events/search";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CiVisibilityTestsApi.searchCIAppTestEvents", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppTestEventsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppTestEventsResponse>() {});
  }
}