package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.NotebookSearchResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebooksApi {
  private ApiClient apiClient;

  public NotebooksApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public NotebooksApi(ApiClient apiClient) {
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

  /** Manage optional parameters to searchNotebooks. */
  public static class SearchNotebooksOptionalParameters {
    private String query;
    private String sort;
    private String include;
    private Integer page;
    private Integer limit;

    /**
     * Set query.
     *
     * @param query Search query string. (optional)
     * @return SearchNotebooksOptionalParameters
     */
    public SearchNotebooksOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field for results. (optional)
     * @return SearchNotebooksOptionalParameters
     */
    public SearchNotebooksOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Additional data to include in the response. (optional)
     * @return SearchNotebooksOptionalParameters
     */
    public SearchNotebooksOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set page.
     *
     * @param page Page number for pagination. (optional)
     * @return SearchNotebooksOptionalParameters
     */
    public SearchNotebooksOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of results to return. (optional)
     * @return SearchNotebooksOptionalParameters
     */
    public SearchNotebooksOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Search notebooks.
   *
   * <p>See {@link #searchNotebooksWithHttpInfo}.
   *
   * @return NotebookSearchResponse
   * @throws ApiException if fails to make API call
   */
  public NotebookSearchResponse searchNotebooks() throws ApiException {
    return searchNotebooksWithHttpInfo(new SearchNotebooksOptionalParameters()).getData();
  }

  /**
   * Search notebooks.
   *
   * <p>See {@link #searchNotebooksWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;NotebookSearchResponse&gt;
   */
  public CompletableFuture<NotebookSearchResponse> searchNotebooksAsync() {
    return searchNotebooksWithHttpInfoAsync(new SearchNotebooksOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search notebooks.
   *
   * <p>See {@link #searchNotebooksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return NotebookSearchResponse
   * @throws ApiException if fails to make API call
   */
  public NotebookSearchResponse searchNotebooks(SearchNotebooksOptionalParameters parameters)
      throws ApiException {
    return searchNotebooksWithHttpInfo(parameters).getData();
  }

  /**
   * Search notebooks.
   *
   * <p>See {@link #searchNotebooksWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;NotebookSearchResponse&gt;
   */
  public CompletableFuture<NotebookSearchResponse> searchNotebooksAsync(
      SearchNotebooksOptionalParameters parameters) {
    return searchNotebooksWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for notebooks using a query string.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;NotebookSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookSearchResponse> searchNotebooksWithHttpInfo(
      SearchNotebooksOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchNotebooks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    String sort = parameters.sort;
    String include = parameters.include;
    Integer page = parameters.page;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/notebooks/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NotebooksApi.searchNotebooks",
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
        new GenericType<NotebookSearchResponse>() {});
  }

  /**
   * Search notebooks.
   *
   * <p>See {@link #searchNotebooksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;NotebookSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotebookSearchResponse>> searchNotebooksWithHttpInfoAsync(
      SearchNotebooksOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "searchNotebooks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<NotebookSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    String sort = parameters.sort;
    String include = parameters.include;
    Integer page = parameters.page;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/notebooks/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NotebooksApi.searchNotebooks",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotebookSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotebookSearchResponse>() {});
  }
}
