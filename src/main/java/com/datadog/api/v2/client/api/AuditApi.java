package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.AuditLogsEventsResponse;
import com.datadog.api.v2.client.model.AuditLogsSearchEventsRequest;
import com.datadog.api.v2.client.model.AuditLogsSort;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditApi {
  private ApiClient apiClient;

  public AuditApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listAuditLogs. */
  public static class ListAuditLogsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private AuditLogsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery
     *
     * @param filterQuery Search query following Audit Logs syntax. (optional)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom
     *
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     *
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Order of events in results. (optional)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters sort(AuditLogsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit
     *
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListAuditLogsOptionalParameters
     */
    public ListAuditLogsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>See {@link #listAuditLogsWithHttpInfo}.
   *
   * @return AuditLogsEventsResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogsEventsResponse listAuditLogs() throws ApiException {
    return listAuditLogsWithHttpInfo(new ListAuditLogsOptionalParameters()).getData();
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>See {@link #listAuditLogsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AuditLogsEventsResponse&gt;
   */
  public CompletableFuture<AuditLogsEventsResponse> listAuditLogsAsync() {
    return listAuditLogsWithHttpInfoAsync(new ListAuditLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>See {@link #listAuditLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AuditLogsEventsResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogsEventsResponse listAuditLogs(ListAuditLogsOptionalParameters parameters)
      throws ApiException {
    return listAuditLogsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>See {@link #listAuditLogsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AuditLogsEventsResponse&gt;
   */
  public CompletableFuture<AuditLogsEventsResponse> listAuditLogsAsync(
      ListAuditLogsOptionalParameters parameters) {
    return listAuditLogsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>List endpoint returns events that match a Audit Logs search query. [Results are
   * paginated][1]. Use this endpoint to see your latest Audit Logs events. [1]:
   * https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AuditLogsEventsResponse&gt;
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
  public ApiResponse<AuditLogsEventsResponse> listAuditLogsWithHttpInfo(
      ListAuditLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    AuditLogsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/audit/events";

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
            "AuditApi.listAuditLogs",
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
        new GenericType<AuditLogsEventsResponse>() {});
  }

  /**
   * Get a list of Audit Logs events
   *
   * <p>See {@link #listAuditLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AuditLogsEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuditLogsEventsResponse>> listAuditLogsWithHttpInfoAsync(
      ListAuditLogsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    AuditLogsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/audit/events";

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
              "AuditApi.listAuditLogs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuditLogsEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AuditLogsEventsResponse>() {});
  }

  /** Manage optional parameters to searchAuditLogs. */
  public static class SearchAuditLogsOptionalParameters {
    private AuditLogsSearchEventsRequest body;

    /**
     * Set body
     *
     * @param body (optional)
     * @return SearchAuditLogsOptionalParameters
     */
    public SearchAuditLogsOptionalParameters body(AuditLogsSearchEventsRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search Audit Logs events
   *
   * <p>See {@link #searchAuditLogsWithHttpInfo}.
   *
   * @return AuditLogsEventsResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogsEventsResponse searchAuditLogs() throws ApiException {
    return searchAuditLogsWithHttpInfo(new SearchAuditLogsOptionalParameters()).getData();
  }

  /**
   * Search Audit Logs events
   *
   * <p>See {@link #searchAuditLogsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AuditLogsEventsResponse&gt;
   */
  public CompletableFuture<AuditLogsEventsResponse> searchAuditLogsAsync() {
    return searchAuditLogsWithHttpInfoAsync(new SearchAuditLogsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search Audit Logs events
   *
   * <p>See {@link #searchAuditLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AuditLogsEventsResponse
   * @throws ApiException if fails to make API call
   */
  public AuditLogsEventsResponse searchAuditLogs(SearchAuditLogsOptionalParameters parameters)
      throws ApiException {
    return searchAuditLogsWithHttpInfo(parameters).getData();
  }

  /**
   * Search Audit Logs events
   *
   * <p>See {@link #searchAuditLogsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AuditLogsEventsResponse&gt;
   */
  public CompletableFuture<AuditLogsEventsResponse> searchAuditLogsAsync(
      SearchAuditLogsOptionalParameters parameters) {
    return searchAuditLogsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search Audit Logs events
   *
   * <p>List endpoint returns Audit Logs events that match an Audit search query. [Results are
   * paginated][1]. Use this endpoint to build complex Audit Logs events filtering and search. [1]:
   * https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AuditLogsEventsResponse&gt;
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
  public ApiResponse<AuditLogsEventsResponse> searchAuditLogsWithHttpInfo(
      SearchAuditLogsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/audit/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AuditApi.searchAuditLogs",
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
        new GenericType<AuditLogsEventsResponse>() {});
  }

  /**
   * Search Audit Logs events
   *
   * <p>See {@link #searchAuditLogsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AuditLogsEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuditLogsEventsResponse>> searchAuditLogsWithHttpInfoAsync(
      SearchAuditLogsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/audit/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AuditApi.searchAuditLogs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuditLogsEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AuditLogsEventsResponse>() {});
  }
}
