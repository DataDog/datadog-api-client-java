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
import com.datadog.api.client.v2.model.TestOptimizationDeleteServiceSettingsRequest;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesGetRequest;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesResponse;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesUpdateRequest;
import com.datadog.api.client.v2.model.TestOptimizationGetServiceSettingsRequest;
import com.datadog.api.client.v2.model.TestOptimizationServiceSettingsResponse;
import com.datadog.api.client.v2.model.TestOptimizationUpdateServiceSettingsRequest;
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

  /**
   * Delete Test Optimization service settings.
   *
   * <p>See {@link #deleteTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTestOptimizationServiceSettings(
      TestOptimizationDeleteServiceSettingsRequest body) throws ApiException {
    deleteTestOptimizationServiceSettingsWithHttpInfo(body);
  }

  /**
   * Delete Test Optimization service settings.
   *
   * <p>See {@link #deleteTestOptimizationServiceSettingsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTestOptimizationServiceSettingsAsync(
      TestOptimizationDeleteServiceSettingsRequest body) {
    return deleteTestOptimizationServiceSettingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete Test Optimization settings for a specific service identified by repository, service
   * name, and environment.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTestOptimizationServiceSettingsWithHttpInfo(
      TestOptimizationDeleteServiceSettingsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " deleteTestOptimizationServiceSettings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.deleteTestOptimizationServiceSettings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Test Optimization service settings.
   *
   * <p>See {@link #deleteTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteTestOptimizationServiceSettingsWithHttpInfoAsync(
          TestOptimizationDeleteServiceSettingsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " deleteTestOptimizationServiceSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.deleteTestOptimizationServiceSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get Flaky Tests Management policies.
   *
   * <p>See {@link #getFlakyTestsManagementPoliciesWithHttpInfo}.
   *
   * @param body (required)
   * @return TestOptimizationFlakyTestsManagementPoliciesResponse
   * @throws ApiException if fails to make API call
   */
  public TestOptimizationFlakyTestsManagementPoliciesResponse getFlakyTestsManagementPolicies(
      TestOptimizationFlakyTestsManagementPoliciesGetRequest body) throws ApiException {
    return getFlakyTestsManagementPoliciesWithHttpInfo(body).getData();
  }

  /**
   * Get Flaky Tests Management policies.
   *
   * <p>See {@link #getFlakyTestsManagementPoliciesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;
   */
  public CompletableFuture<TestOptimizationFlakyTestsManagementPoliciesResponse>
      getFlakyTestsManagementPoliciesAsync(
          TestOptimizationFlakyTestsManagementPoliciesGetRequest body) {
    return getFlakyTestsManagementPoliciesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve Flaky Tests Management repository-level policies for the given repository.
   *
   * @param body (required)
   * @return ApiResponse&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>
      getFlakyTestsManagementPoliciesWithHttpInfo(
          TestOptimizationFlakyTestsManagementPoliciesGetRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling getFlakyTestsManagementPolicies");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.getFlakyTestsManagementPolicies",
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
        new GenericType<TestOptimizationFlakyTestsManagementPoliciesResponse>() {});
  }

  /**
   * Get Flaky Tests Management policies.
   *
   * <p>See {@link #getFlakyTestsManagementPoliciesWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>>
      getFlakyTestsManagementPoliciesWithHttpInfoAsync(
          TestOptimizationFlakyTestsManagementPoliciesGetRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " getFlakyTestsManagementPolicies"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.getFlakyTestsManagementPolicies",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>> result =
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
        new GenericType<TestOptimizationFlakyTestsManagementPoliciesResponse>() {});
  }

  /**
   * Get Test Optimization service settings.
   *
   * <p>See {@link #getTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return TestOptimizationServiceSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public TestOptimizationServiceSettingsResponse getTestOptimizationServiceSettings(
      TestOptimizationGetServiceSettingsRequest body) throws ApiException {
    return getTestOptimizationServiceSettingsWithHttpInfo(body).getData();
  }

  /**
   * Get Test Optimization service settings.
   *
   * <p>See {@link #getTestOptimizationServiceSettingsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TestOptimizationServiceSettingsResponse&gt;
   */
  public CompletableFuture<TestOptimizationServiceSettingsResponse>
      getTestOptimizationServiceSettingsAsync(TestOptimizationGetServiceSettingsRequest body) {
    return getTestOptimizationServiceSettingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve Test Optimization settings for a specific service identified by repository, service
   * name, and environment.
   *
   * @param body (required)
   * @return ApiResponse&lt;TestOptimizationServiceSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TestOptimizationServiceSettingsResponse>
      getTestOptimizationServiceSettingsWithHttpInfo(TestOptimizationGetServiceSettingsRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling getTestOptimizationServiceSettings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.getTestOptimizationServiceSettings",
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
        new GenericType<TestOptimizationServiceSettingsResponse>() {});
  }

  /**
   * Get Test Optimization service settings.
   *
   * <p>See {@link #getTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TestOptimizationServiceSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>>
      getTestOptimizationServiceSettingsWithHttpInfoAsync(
          TestOptimizationGetServiceSettingsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " getTestOptimizationServiceSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.getTestOptimizationServiceSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>> result =
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
        new GenericType<TestOptimizationServiceSettingsResponse>() {});
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
            args,
            0);

    return iterator;
  }

  /**
   * List endpoint returning flaky tests from Flaky Test Management. Results are paginated.
   *
   * <p>The response includes comprehensive test information including: - Test identification and
   * metadata (module, suite, name) - Flaky state and categorization - First and last flake
   * occurrences (timestamp, branch, commit SHA) - Test execution statistics from the last 7 days
   * (failure rate) - Pipeline impact metrics (failed pipelines count, total lost time) - Complete
   * status change history (optional, ordered from most recent to oldest)
   *
   * <p>Set <code>include_history</code> to <code>true</code> in the request to receive the status
   * change history for each test. History is disabled by default for better performance.
   *
   * <p>Results support filtering by various facets including service, environment, repository,
   * branch, and test state.
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

  /**
   * Update Flaky Tests Management policies.
   *
   * <p>See {@link #updateFlakyTestsManagementPoliciesWithHttpInfo}.
   *
   * @param body (required)
   * @return TestOptimizationFlakyTestsManagementPoliciesResponse
   * @throws ApiException if fails to make API call
   */
  public TestOptimizationFlakyTestsManagementPoliciesResponse updateFlakyTestsManagementPolicies(
      TestOptimizationFlakyTestsManagementPoliciesUpdateRequest body) throws ApiException {
    return updateFlakyTestsManagementPoliciesWithHttpInfo(body).getData();
  }

  /**
   * Update Flaky Tests Management policies.
   *
   * <p>See {@link #updateFlakyTestsManagementPoliciesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;
   */
  public CompletableFuture<TestOptimizationFlakyTestsManagementPoliciesResponse>
      updateFlakyTestsManagementPoliciesAsync(
          TestOptimizationFlakyTestsManagementPoliciesUpdateRequest body) {
    return updateFlakyTestsManagementPoliciesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update Flaky Tests Management repository-level policies for the given repository.
   * Only provided policy blocks are updated; omitted blocks are left unchanged.
   *
   * @param body (required)
   * @return ApiResponse&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>
      updateFlakyTestsManagementPoliciesWithHttpInfo(
          TestOptimizationFlakyTestsManagementPoliciesUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateFlakyTestsManagementPolicies");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.updateFlakyTestsManagementPolicies",
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
        new GenericType<TestOptimizationFlakyTestsManagementPoliciesResponse>() {});
  }

  /**
   * Update Flaky Tests Management policies.
   *
   * <p>See {@link #updateFlakyTestsManagementPoliciesWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TestOptimizationFlakyTestsManagementPoliciesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>>
      updateFlakyTestsManagementPoliciesWithHttpInfoAsync(
          TestOptimizationFlakyTestsManagementPoliciesUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateFlakyTestsManagementPolicies"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/policies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.updateFlakyTestsManagementPolicies",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TestOptimizationFlakyTestsManagementPoliciesResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TestOptimizationFlakyTestsManagementPoliciesResponse>() {});
  }

  /**
   * Update Test Optimization service settings.
   *
   * <p>See {@link #updateTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return TestOptimizationServiceSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public TestOptimizationServiceSettingsResponse updateTestOptimizationServiceSettings(
      TestOptimizationUpdateServiceSettingsRequest body) throws ApiException {
    return updateTestOptimizationServiceSettingsWithHttpInfo(body).getData();
  }

  /**
   * Update Test Optimization service settings.
   *
   * <p>See {@link #updateTestOptimizationServiceSettingsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TestOptimizationServiceSettingsResponse&gt;
   */
  public CompletableFuture<TestOptimizationServiceSettingsResponse>
      updateTestOptimizationServiceSettingsAsync(
          TestOptimizationUpdateServiceSettingsRequest body) {
    return updateTestOptimizationServiceSettingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update Test Optimization settings for a specific service identified by repository,
   * service name, and environment. Only provided fields are updated; null or omitted fields are
   * left unchanged.
   *
   * @param body (required)
   * @return ApiResponse&lt;TestOptimizationServiceSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TestOptimizationServiceSettingsResponse>
      updateTestOptimizationServiceSettingsWithHttpInfo(
          TestOptimizationUpdateServiceSettingsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateTestOptimizationServiceSettings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TestOptimizationApi.updateTestOptimizationServiceSettings",
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
        new GenericType<TestOptimizationServiceSettingsResponse>() {});
  }

  /**
   * Update Test Optimization service settings.
   *
   * <p>See {@link #updateTestOptimizationServiceSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TestOptimizationServiceSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>>
      updateTestOptimizationServiceSettingsWithHttpInfoAsync(
          TestOptimizationUpdateServiceSettingsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateTestOptimizationServiceSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/test-optimization/settings/service";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TestOptimizationApi.updateTestOptimizationServiceSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TestOptimizationServiceSettingsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TestOptimizationServiceSettingsResponse>() {});
  }
}
