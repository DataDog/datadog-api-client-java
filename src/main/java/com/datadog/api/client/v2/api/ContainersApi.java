package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ContainerItem;
import com.datadog.api.client.v2.model.ContainersResponse;
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
public class ContainersApi {
  private ApiClient apiClient;

  public ContainersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ContainersApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listContainers. */
  public static class ListContainersOptionalParameters {
    private String filterTags;
    private String groupBy;
    private String sort;
    private Integer pageSize;
    private String pageCursor;

    /**
     * Set filterTags.
     *
     * @param filterTags Comma-separated <code>key:value</code> tags. A container must match every
     *     tag. Wildcards, negation (<code>-key:value</code>), spaces, and <code>IN (...)</code> are
     *     not supported. To cover several hosts, make one request per host. (optional)
     * @return ListContainersOptionalParameters
     */
    public ListContainersOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set groupBy.
     *
     * @param groupBy Comma-separated list of up to three tag keys to group containers by. Returns
     *     <code>container_group</code> objects with counts and tags. Grouped results ignore <code>
     *     sort</code> and do not support pagination. Containers with multiple values for a grouping
     *     tag can appear in multiple groups. Summing group counts can overcount distinct
     *     containers. (optional)
     * @return ListContainersOptionalParameters
     */
    public ListContainersOptionalParameters groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Attribute to sort individual containers by: <code>name</code>, <code>created_at
     *     </code>, <code>started_at</code>, <code>state</code>, <code>container_id</code>, <code>
     *     host</code>, <code>image_name</code>, or <code>image_digest</code>. Defaults to <code>
     *     started_at</code> in ascending order. Prefix the attribute with <code>-</code> for
     *     descending order, such as <code>-started_at</code>. Ignored when <code>group_by</code> is
     *     specified. (optional)
     * @return ListContainersOptionalParameters
     */
    public ListContainersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of results returned. For grouped results, defaults to <code>
     *     100</code> with a maximum of <code>1000</code> groups. (optional, default to 1000)
     * @return ListContainersOptionalParameters
     */
    public ListContainersOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor String to query the next page of results. This key is provided with each
     *     valid response from the API in <code>meta.pagination.next_cursor</code>. (optional)
     * @return ListContainersOptionalParameters
     */
    public ListContainersOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfo}.
   *
   * @return ContainersResponse
   * @throws ApiException if fails to make API call
   */
  public ContainersResponse listContainers() throws ApiException {
    return listContainersWithHttpInfo(new ListContainersOptionalParameters()).getData();
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ContainersResponse&gt;
   */
  public CompletableFuture<ContainersResponse> listContainersAsync() {
    return listContainersWithHttpInfoAsync(new ListContainersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ContainersResponse
   * @throws ApiException if fails to make API call
   */
  public ContainersResponse listContainers(ListContainersOptionalParameters parameters)
      throws ApiException {
    return listContainersWithHttpInfo(parameters).getData();
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ContainersResponse&gt;
   */
  public CompletableFuture<ContainersResponse> listContainersAsync(
      ListContainersOptionalParameters parameters) {
    return listContainersWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfo}.
   *
   * @return PaginationIterable&lt;ContainerItem&gt;
   */
  public PaginationIterable<ContainerItem> listContainersWithPagination() {
    ListContainersOptionalParameters parameters = new ListContainersOptionalParameters();
    return listContainersWithPagination(parameters);
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfo}.
   *
   * @return ContainersResponse
   */
  public PaginationIterable<ContainerItem> listContainersWithPagination(
      ListContainersOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPagination.getNextCursor";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageSize == null) {
      limit = 1000;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listContainers",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get all containers for your organization. Use <code>group_by</code> to return container groups
   * with counts. Grouped results are limited by <code>page[size]</code> and do not support
   * pagination.
   *
   * <p>To get CPU or memory metrics, use a <code>container</code> data source query with <code>
   * /api/v2/query/scalar</code> or <code>/api/v2/query/timeseries</code>.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ContainersResponse&gt;
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
  public ApiResponse<ContainersResponse> listContainersWithHttpInfo(
      ListContainersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterTags = parameters.filterTags;
    String groupBy = parameters.groupBy;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/containers";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ContainersApi.listContainers",
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
        new GenericType<ContainersResponse>() {});
  }

  /**
   * Get All Containers.
   *
   * <p>See {@link #listContainersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ContainersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ContainersResponse>> listContainersWithHttpInfoAsync(
      ListContainersOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterTags = parameters.filterTags;
    String groupBy = parameters.groupBy;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/containers";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ContainersApi.listContainers",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ContainersResponse>> result = new CompletableFuture<>();
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
        new GenericType<ContainersResponse>() {});
  }
}
