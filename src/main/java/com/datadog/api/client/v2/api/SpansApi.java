
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
import com.datadog.api.client.v2.model.SpansAggregateResponse;
import com.datadog.api.client.v2.model.SpansAggregateRequest;
import com.datadog.api.client.v2.model.SpansListResponse;
import com.datadog.api.client.v2.model.SpansSort;
import com.datadog.api.client.v2.model.SpansListRequest;
import com.datadog.api.client.v2.model.Span;
import com.datadog.api.client.v2.model.SpansListRequest;
import com.datadog.api.client.v2.model.SpansListRequestData;
import com.datadog.api.client.v2.model.SpansListRequestAttributes;
import com.datadog.api.client.v2.model.SpansListRequestPage;
import com.datadog.api.client.v2.model.Span;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansApi {
  private ApiClient apiClient;
  public SpansApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SpansApi(ApiClient apiClient) {
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
 * Aggregate spans.
 *
 * See {@link #aggregateSpansWithHttpInfo}.
 *
 * @param body  (required)
 * @return SpansAggregateResponse
 * @throws ApiException if fails to make API call
 */
  public SpansAggregateResponse  aggregateSpans(SpansAggregateRequest body) throws ApiException {
    return aggregateSpansWithHttpInfo(body).getData();
  }

  /**
 * Aggregate spans.
 *
 * See {@link #aggregateSpansWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;SpansAggregateResponse&gt;
 */
  public CompletableFuture<SpansAggregateResponse>aggregateSpansAsync(SpansAggregateRequest body) {
    return aggregateSpansWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>The API endpoint to aggregate spans into buckets and compute metrics and timeseries.
   * This endpoint is rate limited to <code>300</code> requests per hour.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;SpansAggregateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansAggregateResponse> aggregateSpansWithHttpInfo(SpansAggregateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aggregateSpans");
    }
    // create path and map variables
    String localVarPath = "/api/v2/spans/analytics/aggregate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansApi.aggregateSpans", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansAggregateResponse>() {});
  }

  /**
   * Aggregate spans.
   *
   * See {@link #aggregateSpansWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SpansAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansAggregateResponse>> aggregateSpansWithHttpInfoAsync(SpansAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SpansAggregateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling aggregateSpans"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/spans/analytics/aggregate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansApi.aggregateSpans", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansAggregateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansAggregateResponse>() {});
  }

  /**
 * Search spans.
 *
 * See {@link #listSpansWithHttpInfo}.
 *
 * @param body  (required)
 * @return SpansListResponse
 * @throws ApiException if fails to make API call
 */
  public SpansListResponse  listSpans(SpansListRequest body) throws ApiException {
    return listSpansWithHttpInfo(body).getData();
  }

  /**
 * Search spans.
 *
 * See {@link #listSpansWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;SpansListResponse&gt;
 */
  public CompletableFuture<SpansListResponse>listSpansAsync(SpansListRequest body) {
    return listSpansWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Search spans.
 *
 * See {@link #listSpansWithHttpInfo}.
 *
 * @param body  (required)
 * @return PaginationIterable&lt;Span&gt;
 */
  public PaginationIterable<Span> listSpansWithPagination(SpansListRequest body) {
  String resultsPath = "getData";
  String valueGetterPath = "getMeta.getPage.getAfter";
  String valueSetterPath = "body.getData.getAttributes.getPage.setCursor";
  Boolean valueSetterParamOptional = false;
  Integer limit;

  

  if(body.getData() == null) {
      body.setData(new SpansListRequestData());
  }

  

  if(body.getData().getAttributes() == null) {
      body.getData().setAttributes(new SpansListRequestAttributes());
  }

  

  if(body.getData().getAttributes().getPage() == null) {
      body.getData().getAttributes().setPage(new SpansListRequestPage());
  }

  

  
  if (body.getData().getAttributes().getPage().getLimit() == null) {
      limit = 10;
      body.getData().getAttributes().getPage().setLimit(limit);
  } else {
      limit = body.getData().getAttributes().getPage().getLimit();
  }

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("body", body);

  PaginationIterable iterator = new PaginationIterable(this, "listSpans", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>List endpoint returns spans that match a span search query.
   * <a href="/logs/guide/collect-multiple-logs-with-pagination?tab=v2api">Results are paginated</a>.</p>
   * <p>Use this endpoint to build complex spans filtering and search.
   * This endpoint is rate limited to <code>300</code> requests per hour.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;SpansListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests: The rate limit set by the API has been exceeded. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansListResponse> listSpansWithHttpInfo(SpansListRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listSpans");
    }
    // create path and map variables
    String localVarPath = "/api/v2/spans/events/search";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SpansApi.listSpans", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansListResponse>() {});
  }

  /**
   * Search spans.
   *
   * See {@link #listSpansWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SpansListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansListResponse>> listSpansWithHttpInfoAsync(SpansListRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SpansListResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling listSpans"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/spans/events/search";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SpansApi.listSpans", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansListResponse>() {});
  }

  /**
   * Manage optional parameters to listSpansGet.
   */
  public static class ListSpansGetOptionalParameters {
    private String filterQuery;
    private String filterFrom;
    private String filterTo;
    private SpansSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     * @param filterQuery Search query following spans syntax. (optional)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     * @param filterFrom Minimum timestamp for requested spans. Supports date-time ISO8601, date math, and regular timestamps (milliseconds). (optional)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     * @param filterTo Maximum timestamp for requested spans. Supports date-time ISO8601, date math, and regular timestamps (milliseconds). (optional)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     * @param sort Order of spans in results. (optional)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters sort(SpansSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     * @param pageCursor List following results with a cursor provided in the previous query. (optional)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of spans in the response. (optional, default to 10)
     * @return ListSpansGetOptionalParameters
     */
    public ListSpansGetOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfo}.
 *
 * @return SpansListResponse
 * @throws ApiException if fails to make API call
 */
  public SpansListResponse listSpansGet () throws ApiException {
    return listSpansGetWithHttpInfo(new ListSpansGetOptionalParameters()).getData();
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SpansListResponse&gt;
 */
  public CompletableFuture<SpansListResponse>listSpansGetAsync() {
    return listSpansGetWithHttpInfoAsync(new ListSpansGetOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return SpansListResponse
 * @throws ApiException if fails to make API call
 */
  public SpansListResponse listSpansGet(ListSpansGetOptionalParameters parameters) throws ApiException {
    return listSpansGetWithHttpInfo(parameters).getData();
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SpansListResponse&gt;
 */
  public CompletableFuture<SpansListResponse>listSpansGetAsync(ListSpansGetOptionalParameters parameters) {
    return listSpansGetWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfo}.
 *
 * @return PaginationIterable&lt;Span&gt;
 */
  public PaginationIterable<Span> listSpansGetWithPagination() {
    ListSpansGetOptionalParameters parameters = new ListSpansGetOptionalParameters();
    return listSpansGetWithPagination(parameters);
  }

  /**
 * Get a list of spans.
 *
 * See {@link #listSpansGetWithHttpInfo}.
 *
 * @return SpansListResponse
 */
  public PaginationIterable<Span> listSpansGetWithPagination(ListSpansGetOptionalParameters parameters) {
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

  PaginationIterable iterator = new PaginationIterable(this, "listSpansGet", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>List endpoint returns spans that match a span search query.
   * <a href="/logs/guide/collect-multiple-logs-with-pagination?tab=v2api">Results are paginated</a>.</p>
   * <p>Use this endpoint to see your latest spans.
   * This endpoint is rate limited to <code>300</code> requests per hour.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SpansListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests: The rate limit set by the API has been exceeded. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SpansListResponse> listSpansGetWithHttpInfo(ListSpansGetOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    SpansSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/spans/events";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder = apiClient.createBuilder("v2.SpansApi.listSpansGet", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansListResponse>() {});
  }

  /**
   * Get a list of spans.
   *
   * See {@link #listSpansGetWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SpansListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SpansListResponse>> listSpansGetWithHttpInfoAsync(ListSpansGetOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    SpansSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/spans/events";

    
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
      builder = apiClient.createBuilder("v2.SpansApi.listSpansGet", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SpansListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SpansListResponse>() {});
  }
}