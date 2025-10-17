package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ContainerImageItem;
import com.datadog.api.client.v2.model.ContainerImagesResponse;
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
public class ContainerImagesApi {
  private ApiClient apiClient;

  public ContainerImagesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ContainerImagesApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listContainerImages. */
  public static class ListContainerImagesOptionalParameters {
    private String filterTags;
    private String groupBy;
    private String sort;
    private Integer pageSize;
    private String pageCursor;

    /**
     * Set filterTags.
     *
     * @param filterTags Comma-separated list of tags to filter Container Images by. (optional)
     * @return ListContainerImagesOptionalParameters
     */
    public ListContainerImagesOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set groupBy.
     *
     * @param groupBy Comma-separated list of tags to group Container Images by. (optional)
     * @return ListContainerImagesOptionalParameters
     */
    public ListContainerImagesOptionalParameters groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Attribute to sort Container Images by. (optional)
     * @return ListContainerImagesOptionalParameters
     */
    public ListContainerImagesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of results returned. (optional, default to 1000)
     * @return ListContainerImagesOptionalParameters
     */
    public ListContainerImagesOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor String to query the next page of results. This key is provided with each
     *     valid response from the API in <code>meta.pagination.next_cursor</code>. (optional)
     * @return ListContainerImagesOptionalParameters
     */
    public ListContainerImagesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfo}.
   *
   * @return ContainerImagesResponse
   * @throws ApiException if fails to make API call
   */
  public ContainerImagesResponse listContainerImages() throws ApiException {
    return listContainerImagesWithHttpInfo(new ListContainerImagesOptionalParameters()).getData();
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ContainerImagesResponse&gt;
   */
  public CompletableFuture<ContainerImagesResponse> listContainerImagesAsync() {
    return listContainerImagesWithHttpInfoAsync(new ListContainerImagesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ContainerImagesResponse
   * @throws ApiException if fails to make API call
   */
  public ContainerImagesResponse listContainerImages(
      ListContainerImagesOptionalParameters parameters) throws ApiException {
    return listContainerImagesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ContainerImagesResponse&gt;
   */
  public CompletableFuture<ContainerImagesResponse> listContainerImagesAsync(
      ListContainerImagesOptionalParameters parameters) {
    return listContainerImagesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;ContainerImageItem&gt;
   */
  public PaginationIterable<ContainerImageItem> listContainerImagesWithPagination() {
    ListContainerImagesOptionalParameters parameters = new ListContainerImagesOptionalParameters();
    return listContainerImagesWithPagination(parameters);
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfo}.
   *
   * @return ContainerImagesResponse
   */
  public PaginationIterable<ContainerImageItem> listContainerImagesWithPagination(
      ListContainerImagesOptionalParameters parameters) {
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
            "listContainerImages",
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
   * Get all Container Images for your organization. <strong>Note</strong>: To enrich the data
   * returned by this endpoint with security scans, see the new <a
   * href="https://docs.datadoghq.com/api/latest/security-monitoring/#list-scanned-assets-metadata">api/v2/security/scanned-assets-metadata</a>
   * endpoint.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ContainerImagesResponse&gt;
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
  public ApiResponse<ContainerImagesResponse> listContainerImagesWithHttpInfo(
      ListContainerImagesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterTags = parameters.filterTags;
    String groupBy = parameters.groupBy;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/container_images";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ContainerImagesApi.listContainerImages",
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
        new GenericType<ContainerImagesResponse>() {});
  }

  /**
   * Get all Container Images.
   *
   * <p>See {@link #listContainerImagesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ContainerImagesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ContainerImagesResponse>>
      listContainerImagesWithHttpInfoAsync(ListContainerImagesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterTags = parameters.filterTags;
    String groupBy = parameters.groupBy;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/container_images";

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
              "v2.ContainerImagesApi.listContainerImages",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ContainerImagesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ContainerImagesResponse>() {});
  }
}
