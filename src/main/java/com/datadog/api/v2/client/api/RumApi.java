package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.RUMEventsResponse;
import com.datadog.api.v2.client.model.RUMSearchEventsRequest;
import com.datadog.api.v2.client.model.RUMSort;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RumApi {
  private ApiClient apiClient;

  public RumApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RumApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
     * Set filterQuery
     *
     * @param filterQuery Search query following RUM syntax. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom
     *
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     *
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Order of events in results. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters sort(RUMSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor
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
     * Set pageLimit
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
   * Get a list of RUM events
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
   * Get a list of RUM events
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
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
   * Get a list of RUM events
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
   * Get a list of RUM events
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
   * Get a list of RUM events
   *
   * <p>List endpoint returns events that match a RUM search query. [Results are paginated][1]. Use
   * this endpoint to see your latest RUM events. [1]:
   * https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination
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
            "RumApi.listRUMEvents",
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
   * Get a list of RUM events
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listRUMEvents");

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

  /** Manage optional parameters to searchRUMEvents. */
  public static class SearchRUMEventsOptionalParameters {
    private RUMSearchEventsRequest body;

    /**
     * Set body
     *
     * @param body (optional)
     * @return SearchRUMEventsOptionalParameters
     */
    public SearchRUMEventsOptionalParameters body(RUMSearchEventsRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search RUM events
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse searchRUMEvents() throws ApiException {
    return searchRUMEventsWithHttpInfo(new SearchRUMEventsOptionalParameters()).getData();
  }

  /**
   * Search RUM events
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> searchRUMEventsAsync() {
    return searchRUMEventsWithHttpInfoAsync(new SearchRUMEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM events
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse searchRUMEvents(SearchRUMEventsOptionalParameters parameters)
      throws ApiException {
    return searchRUMEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Search RUM events
   *
   * <p>See {@link #searchRUMEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> searchRUMEventsAsync(
      SearchRUMEventsOptionalParameters parameters) {
    return searchRUMEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM events
   *
   * <p>List endpoint returns RUM events that match a RUM search query. [Results are paginated][1].
   * Use this endpoint to build complex RUM events filtering and search. [1]:
   * https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination
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
  public ApiResponse<RUMEventsResponse> searchRUMEventsWithHttpInfo(
      SearchRUMEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "RumApi.searchRUMEvents",
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
   * Search RUM events
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RUMEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMEventsResponse>> searchRUMEventsWithHttpInfoAsync(
      SearchRUMEventsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "searchRUMEvents");

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
