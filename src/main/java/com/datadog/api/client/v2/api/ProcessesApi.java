package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ProcessSummariesResponse;
import com.datadog.api.client.v2.model.ProcessSummary;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProcessesApi {
  private ApiClient apiClient;

  public ProcessesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ProcessesApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listProcesses. */
  public static class ListProcessesOptionalParameters {
    private String search;
    private String tags;
    private Long from;
    private Long to;
    private Integer pageLimit;
    private String pageCursor;

    /**
     * Set search.
     *
     * @param search String to search processes by. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Comma-separated list of tags to filter processes by. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set from.
     *
     * @param from Unix timestamp (number of seconds since epoch) of the start of the query window.
     *     If not provided, the start of the query window will be 15 minutes before the <code>to
     *     </code> timestamp. If neither <code>from</code> nor <code>to</code> are provided, the
     *     query window will be <code>[now - 15m, now]</code>. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     *
     * @param to Unix timestamp (number of seconds since epoch) of the end of the query window. If
     *     not provided, the end of the query window will be 15 minutes after the <code>from</code>
     *     timestamp. If neither <code>from</code> nor <code>to</code> are provided, the query
     *     window will be <code>[now - 15m, now]</code>. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results returned. (optional, default to 1000)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor String to query the next page of results. This key is provided with each
     *     valid response from the API in <code>meta.page.after</code>. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfo}.
   *
   * @return ProcessSummariesResponse
   * @throws ApiException if fails to make API call
   */
  public ProcessSummariesResponse listProcesses() throws ApiException {
    return listProcessesWithHttpInfo(new ListProcessesOptionalParameters()).getData();
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProcessSummariesResponse&gt;
   */
  public CompletableFuture<ProcessSummariesResponse> listProcessesAsync() {
    return listProcessesWithHttpInfoAsync(new ListProcessesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ProcessSummariesResponse
   * @throws ApiException if fails to make API call
   */
  public ProcessSummariesResponse listProcesses(ListProcessesOptionalParameters parameters)
      throws ApiException {
    return listProcessesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ProcessSummariesResponse&gt;
   */
  public CompletableFuture<ProcessSummariesResponse> listProcessesAsync(
      ListProcessesOptionalParameters parameters) {
    return listProcessesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;ProcessSummary&gt;
   */
  public PaginationIterable<ProcessSummary> listProcessesWithPagination() {
    ListProcessesOptionalParameters parameters = new ListProcessesOptionalParameters();
    return listProcessesWithPagination(parameters);
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfo}.
   *
   * @return ProcessSummariesResponse
   */
  public PaginationIterable<ProcessSummary> listProcessesWithPagination(
      ListProcessesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageLimit == null) {
      limit = 1000;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listProcesses",
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
   * Get all processes for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProcessSummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProcessSummariesResponse> listProcessesWithHttpInfo(
      ListProcessesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String search = parameters.search;
    String tags = parameters.tags;
    Long from = parameters.from;
    Long to = parameters.to;
    Integer pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/processes";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProcessesApi.listProcesses",
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
        new GenericType<ProcessSummariesResponse>() {});
  }

  /**
   * Get all processes.
   *
   * <p>See {@link #listProcessesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ProcessSummariesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProcessSummariesResponse>> listProcessesWithHttpInfoAsync(
      ListProcessesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String search = parameters.search;
    String tags = parameters.tags;
    Long from = parameters.from;
    Long to = parameters.to;
    Integer pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/processes";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProcessesApi.listProcesses",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProcessSummariesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProcessSummariesResponse>() {});
  }
}
