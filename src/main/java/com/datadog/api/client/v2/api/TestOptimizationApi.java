package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.FlakyTest;
import com.datadog.api.client.v2.model.FlakyTestsSearchPageOptions;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequest;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestAttributes;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestData;
import com.datadog.api.client.v2.model.FlakyTestsSearchResponse;
import com.datadog.api.client.v2.model.UpdateFlakyTestsRequest;
import com.datadog.api.client.v2.model.UpdateFlakyTestsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationApi {
  private ApiClient apiClient;

  public TestOptimizationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TestOptimizationApi(ApiClient apiClient) {
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

  /** Manage optional parameters to searchFlakyTests. */
  public static class SearchFlakyTestsOptionalParameters {
    private FlakyTestsSearchRequest body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return SearchFlakyTestsOptionalParameters
     */
    public SearchFlakyTestsOptionalParameters body(FlakyTestsSearchRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfo}.
   *
   * @return FlakyTestsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public FlakyTestsSearchResponse searchFlakyTests() throws ApiException {
    return searchFlakyTestsWithHttpInfo(new SearchFlakyTestsOptionalParameters()).getData();
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;FlakyTestsSearchResponse&gt;
   */
  public CompletableFuture<FlakyTestsSearchResponse> searchFlakyTestsAsync() {
    return searchFlakyTestsWithHttpInfoAsync(new SearchFlakyTestsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return FlakyTestsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public FlakyTestsSearchResponse searchFlakyTests(SearchFlakyTestsOptionalParameters parameters)
      throws ApiException {
    return searchFlakyTestsWithHttpInfo(parameters).getData();
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;FlakyTestsSearchResponse&gt;
   */
  public CompletableFuture<FlakyTestsSearchResponse> searchFlakyTestsAsync(
      SearchFlakyTestsOptionalParameters parameters) {
    return searchFlakyTestsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;FlakyTest&gt;
   */
  public PaginationIterable<FlakyTest> searchFlakyTestsWithPagination() {
    SearchFlakyTestsOptionalParameters parameters = new SearchFlakyTestsOptionalParameters();
    return searchFlakyTestsWithPagination(parameters);
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfo}.
   *
   * @return FlakyTestsSearchResponse
   */
  public PaginationIterable<FlakyTest> searchFlakyTestsWithPagination(
      SearchFlakyTestsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPagination.getNextPage";
    String valueSetterPath = "body.getData.getAttributes.getPage.setCursor";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.body == null) {
      parameters.body(new FlakyTestsSearchRequest());
    }

    if (parameters.body.getData() == null) {
      parameters.body.setData(new FlakyTestsSearchRequestData());
    }

    if (parameters.body.getData().getAttributes() == null) {
      parameters.body.getData().setAttributes(new FlakyTestsSearchRequestAttributes());
    }

    if (parameters.body.getData().getAttributes().getPage() == null) {
      parameters.body.getData().getAttributes().setPage(new FlakyTestsSearchPageOptions());
    }

    if (parameters.body.getData().getAttributes().getPage().getLimit() == null) {
      limit = 10l;
      parameters.body.getData().getAttributes().getPage().setLimit(limit);
    } else {
      limit = parameters.body.getData().getAttributes().getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchFlakyTests",
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
   * List endpoint returning flaky tests from Flaky Test Management. Results are paginated.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FlakyTestsSearchResponse&gt;
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
  public ApiResponse<FlakyTestsSearchResponse> searchFlakyTestsWithHttpInfo(
      SearchFlakyTestsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchFlakyTests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/test/flaky-test-management/tests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.searchFlakyTests",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FlakyTestsSearchResponse>() {});
  }

  /**
   * Search flaky tests.
   *
   * <p>See {@link #searchFlakyTestsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FlakyTestsSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FlakyTestsSearchResponse>> searchFlakyTestsWithHttpInfoAsync(
      SearchFlakyTestsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "searchFlakyTests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FlakyTestsSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/test/flaky-test-management/tests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.searchFlakyTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FlakyTestsSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<FlakyTestsSearchResponse>() {});
  }

  /**
   * Update flaky test states.
   *
   * <p>See {@link #updateFlakyTestsWithHttpInfo}.
   *
   * @param body (required)
   * @return UpdateFlakyTestsResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateFlakyTestsResponse updateFlakyTests(UpdateFlakyTestsRequest body)
      throws ApiException {
    return updateFlakyTestsWithHttpInfo(body).getData();
  }

  /**
   * Update flaky test states.
   *
   * <p>See {@link #updateFlakyTestsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;UpdateFlakyTestsResponse&gt;
   */
  public CompletableFuture<UpdateFlakyTestsResponse> updateFlakyTestsAsync(
      UpdateFlakyTestsRequest body) {
    return updateFlakyTestsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the state of multiple flaky tests in Flaky Test Management.
   *
   * @param body (required)
   * @return ApiResponse&lt;UpdateFlakyTestsResponse&gt;
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
  public ApiResponse<UpdateFlakyTestsResponse> updateFlakyTestsWithHttpInfo(
      UpdateFlakyTestsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateFlakyTests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateFlakyTests");
    }
    // create path and map variables
    String localVarPath = "/api/v2/test/flaky-test-management/tests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.updateFlakyTests",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateFlakyTestsResponse>() {});
  }

  /**
   * Update flaky test states.
   *
   * <p>See {@link #updateFlakyTestsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateFlakyTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateFlakyTestsResponse>> updateFlakyTestsWithHttpInfoAsync(
      UpdateFlakyTestsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateFlakyTests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateFlakyTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateFlakyTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateFlakyTests"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/test/flaky-test-management/tests";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.updateFlakyTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateFlakyTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateFlakyTestsResponse>() {});
  }
}
