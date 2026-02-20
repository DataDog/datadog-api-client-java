package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DeletedSuitesRequestDeleteRequest;
import com.datadog.api.client.v2.model.DeletedSuitesResponse;
import com.datadog.api.client.v2.model.DeletedTestsRequestDeleteRequest;
import com.datadog.api.client.v2.model.DeletedTestsResponse;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchRequest;
import com.datadog.api.client.v2.model.GlobalVariableResponse;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapAttributes;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapResponse;
import com.datadog.api.client.v2.model.SuiteCreateEditRequest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestEditRequest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestResponse;
import com.datadog.api.client.v2.model.SyntheticsSuiteResponse;
import com.datadog.api.client.v2.model.SyntheticsSuiteSearchResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsApi {
  private ApiClient apiClient;

  public SyntheticsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SyntheticsApi(ApiClient apiClient) {
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
   * Create a Network Path test.
   *
   * <p>See {@link #createSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param body (required)
   * @return SyntheticsNetworkTestResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsNetworkTestResponse createSyntheticsNetworkTest(
      SyntheticsNetworkTestEditRequest body) throws ApiException {
    return createSyntheticsNetworkTestWithHttpInfo(body).getData();
  }

  /**
   * Create a Network Path test.
   *
   * <p>See {@link #createSyntheticsNetworkTestWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SyntheticsNetworkTestResponse&gt;
   */
  public CompletableFuture<SyntheticsNetworkTestResponse> createSyntheticsNetworkTestAsync(
      SyntheticsNetworkTestEditRequest body) {
    return createSyntheticsNetworkTestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;SyntheticsNetworkTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsNetworkTestResponse> createSyntheticsNetworkTestWithHttpInfo(
      SyntheticsNetworkTestEditRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSyntheticsNetworkTest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/network";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.createSyntheticsNetworkTest",
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
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }

  /**
   * Create a Network Path test.
   *
   * <p>See {@link #createSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsNetworkTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>>
      createSyntheticsNetworkTestWithHttpInfoAsync(SyntheticsNetworkTestEditRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createSyntheticsNetworkTest"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/network";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.createSyntheticsNetworkTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
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
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }

  /**
   * Create a test suite.
   *
   * <p>See {@link #createSyntheticsSuiteWithHttpInfo}.
   *
   * @param body (required)
   * @return SyntheticsSuiteResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteResponse createSyntheticsSuite(SuiteCreateEditRequest body)
      throws ApiException {
    return createSyntheticsSuiteWithHttpInfo(body).getData();
  }

  /**
   * Create a test suite.
   *
   * <p>See {@link #createSyntheticsSuiteWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SyntheticsSuiteResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteResponse> createSyntheticsSuiteAsync(
      SuiteCreateEditRequest body) {
    return createSyntheticsSuiteWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;SyntheticsSuiteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsSuiteResponse> createSyntheticsSuiteWithHttpInfo(
      SuiteCreateEditRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSyntheticsSuite");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.createSyntheticsSuite",
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
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Create a test suite.
   *
   * <p>See {@link #createSyntheticsSuiteWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsSuiteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsSuiteResponse>>
      createSyntheticsSuiteWithHttpInfoAsync(SuiteCreateEditRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSyntheticsSuite"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.createSyntheticsSuite",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Bulk delete suites.
   *
   * <p>See {@link #deleteSyntheticsSuitesWithHttpInfo}.
   *
   * @param body (required)
   * @return DeletedSuitesResponse
   * @throws ApiException if fails to make API call
   */
  public DeletedSuitesResponse deleteSyntheticsSuites(DeletedSuitesRequestDeleteRequest body)
      throws ApiException {
    return deleteSyntheticsSuitesWithHttpInfo(body).getData();
  }

  /**
   * Bulk delete suites.
   *
   * <p>See {@link #deleteSyntheticsSuitesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DeletedSuitesResponse&gt;
   */
  public CompletableFuture<DeletedSuitesResponse> deleteSyntheticsSuitesAsync(
      DeletedSuitesRequestDeleteRequest body) {
    return deleteSyntheticsSuitesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;DeletedSuitesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeletedSuitesResponse> deleteSyntheticsSuitesWithHttpInfo(
      DeletedSuitesRequestDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteSyntheticsSuites");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites/bulk-delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.deleteSyntheticsSuites",
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
        new GenericType<DeletedSuitesResponse>() {});
  }

  /**
   * Bulk delete suites.
   *
   * <p>See {@link #deleteSyntheticsSuitesWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeletedSuitesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeletedSuitesResponse>>
      deleteSyntheticsSuitesWithHttpInfoAsync(DeletedSuitesRequestDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeletedSuitesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteSyntheticsSuites"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites/bulk-delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.deleteSyntheticsSuites",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeletedSuitesResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeletedSuitesResponse>() {});
  }

  /**
   * Bulk delete tests.
   *
   * <p>See {@link #deleteSyntheticsTestsWithHttpInfo}.
   *
   * @param body (required)
   * @return DeletedTestsResponse
   * @throws ApiException if fails to make API call
   */
  public DeletedTestsResponse deleteSyntheticsTests(DeletedTestsRequestDeleteRequest body)
      throws ApiException {
    return deleteSyntheticsTestsWithHttpInfo(body).getData();
  }

  /**
   * Bulk delete tests.
   *
   * <p>See {@link #deleteSyntheticsTestsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DeletedTestsResponse&gt;
   */
  public CompletableFuture<DeletedTestsResponse> deleteSyntheticsTestsAsync(
      DeletedTestsRequestDeleteRequest body) {
    return deleteSyntheticsTestsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;DeletedTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeletedTestsResponse> deleteSyntheticsTestsWithHttpInfo(
      DeletedTestsRequestDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteSyntheticsTests");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/bulk-delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.deleteSyntheticsTests",
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
        new GenericType<DeletedTestsResponse>() {});
  }

  /**
   * Bulk delete tests.
   *
   * <p>See {@link #deleteSyntheticsTestsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeletedTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeletedTestsResponse>>
      deleteSyntheticsTestsWithHttpInfoAsync(DeletedTestsRequestDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeletedTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteSyntheticsTests"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/bulk-delete";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.deleteSyntheticsTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeletedTestsResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeletedTestsResponse>() {});
  }

  /**
   * Edit a test suite.
   *
   * <p>See {@link #editSyntheticsSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the suite to edit. (required)
   * @param body New suite details to be saved. (required)
   * @return SyntheticsSuiteResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteResponse editSyntheticsSuite(String publicId, SuiteCreateEditRequest body)
      throws ApiException {
    return editSyntheticsSuiteWithHttpInfo(publicId, body).getData();
  }

  /**
   * Edit a test suite.
   *
   * <p>See {@link #editSyntheticsSuiteWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the suite to edit. (required)
   * @param body New suite details to be saved. (required)
   * @return CompletableFuture&lt;SyntheticsSuiteResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteResponse> editSyntheticsSuiteAsync(
      String publicId, SuiteCreateEditRequest body) {
    return editSyntheticsSuiteWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param publicId The public ID of the suite to edit. (required)
   * @param body New suite details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsSuiteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsSuiteResponse> editSyntheticsSuiteWithHttpInfo(
      String publicId, SuiteCreateEditRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling editSyntheticsSuite");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling editSyntheticsSuite");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.editSyntheticsSuite",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Edit a test suite.
   *
   * <p>See {@link #editSyntheticsSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the suite to edit. (required)
   * @param body New suite details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsSuiteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsSuiteResponse>>
      editSyntheticsSuiteWithHttpInfoAsync(String publicId, SuiteCreateEditRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling editSyntheticsSuite"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling editSyntheticsSuite"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.editSyntheticsSuite",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @return OnDemandConcurrencyCapResponse
   * @throws ApiException if fails to make API call
   */
  public OnDemandConcurrencyCapResponse getOnDemandConcurrencyCap() throws ApiException {
    return getOnDemandConcurrencyCapWithHttpInfo().getData();
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OnDemandConcurrencyCapResponse&gt;
   */
  public CompletableFuture<OnDemandConcurrencyCapResponse> getOnDemandConcurrencyCapAsync() {
    return getOnDemandConcurrencyCapWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * @return ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnDemandConcurrencyCapResponse> getOnDemandConcurrencyCapWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getOnDemandConcurrencyCap",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>>
      getOnDemandConcurrencyCapWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getOnDemandConcurrencyCap",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Get a Network Path test.
   *
   * <p>See {@link #getSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param publicId The public ID of the Network Path test to get details from. (required)
   * @return SyntheticsNetworkTestResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsNetworkTestResponse getSyntheticsNetworkTest(String publicId)
      throws ApiException {
    return getSyntheticsNetworkTestWithHttpInfo(publicId).getData();
  }

  /**
   * Get a Network Path test.
   *
   * <p>See {@link #getSyntheticsNetworkTestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Network Path test to get details from. (required)
   * @return CompletableFuture&lt;SyntheticsNetworkTestResponse&gt;
   */
  public CompletableFuture<SyntheticsNetworkTestResponse> getSyntheticsNetworkTestAsync(
      String publicId) {
    return getSyntheticsNetworkTestWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param publicId The public ID of the Network Path test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsNetworkTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsNetworkTestResponse> getSyntheticsNetworkTestWithHttpInfo(
      String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getSyntheticsNetworkTest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/network/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsNetworkTest",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }

  /**
   * Get a Network Path test.
   *
   * <p>See {@link #getSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param publicId The public ID of the Network Path test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsNetworkTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>>
      getSyntheticsNetworkTestWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getSyntheticsNetworkTest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/network/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsNetworkTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }

  /**
   * Get a suite.
   *
   * <p>See {@link #getSyntheticsSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the suite to get details from. (required)
   * @return SyntheticsSuiteResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteResponse getSyntheticsSuite(String publicId) throws ApiException {
    return getSyntheticsSuiteWithHttpInfo(publicId).getData();
  }

  /**
   * Get a suite.
   *
   * <p>See {@link #getSyntheticsSuiteWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the suite to get details from. (required)
   * @return CompletableFuture&lt;SyntheticsSuiteResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteResponse> getSyntheticsSuiteAsync(String publicId) {
    return getSyntheticsSuiteWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param publicId The public ID of the suite to get details from. (required)
   * @return ApiResponse&lt;SyntheticsSuiteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsSuiteResponse> getSyntheticsSuiteWithHttpInfo(String publicId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getSyntheticsSuite");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsSuite",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Get a suite.
   *
   * <p>See {@link #getSyntheticsSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the suite to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsSuiteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsSuiteResponse>>
      getSyntheticsSuiteWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getSyntheticsSuite"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsSuite",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return GlobalVariableResponse
   * @throws ApiException if fails to make API call
   */
  public GlobalVariableResponse patchGlobalVariable(
      String variableId, GlobalVariableJsonPatchRequest body) throws ApiException {
    return patchGlobalVariableWithHttpInfo(variableId, body).getData();
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfoAsync}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;GlobalVariableResponse&gt;
   */
  public CompletableFuture<GlobalVariableResponse> patchGlobalVariableAsync(
      String variableId, GlobalVariableJsonPatchRequest body) {
    return patchGlobalVariableWithHttpInfoAsync(variableId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Patch a global variable using JSON Patch (RFC 6902). This endpoint allows partial updates to a
   * global variable by specifying only the fields to modify.
   *
   * <p>Common operations include: - Replace field values: <code>
   * {"op": "replace", "path": "/name", "value": "new_name"}</code> - Update nested values: <code>
   * {"op": "replace", "path": "/value/value", "value": "new_value"}</code> - Add/update tags:
   * <code>{"op": "add", "path": "/tags/-", "value": "new_tag"}</code> - Remove fields: <code>
   * {"op": "remove", "path": "/description"}</code>
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return ApiResponse&lt;GlobalVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GlobalVariableResponse> patchGlobalVariableWithHttpInfo(
      String variableId, GlobalVariableJsonPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variableId' when calling patchGlobalVariable");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchGlobalVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/variables/{variable_id}/jsonpatch"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.patchGlobalVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GlobalVariableResponse>() {});
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GlobalVariableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GlobalVariableResponse>>
      patchGlobalVariableWithHttpInfoAsync(String variableId, GlobalVariableJsonPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variableId' when calling patchGlobalVariable"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchGlobalVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/variables/{variable_id}/jsonpatch"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.patchGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
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
        new GenericType<GlobalVariableResponse>() {});
  }

  /** Manage optional parameters to searchSuites. */
  public static class SearchSuitesOptionalParameters {
    private String query;
    private String sort;
    private Boolean facetsOnly;
    private Long start;
    private Long count;

    /**
     * Set query.
     *
     * @param query The search query. (optional)
     * @return SearchSuitesOptionalParameters
     */
    public SearchSuitesOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The sort order for the results (e.g., <code>name,asc</code> or <code>name,desc
     *     </code>). (optional, default to "name,asc")
     * @return SearchSuitesOptionalParameters
     */
    public SearchSuitesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set facetsOnly.
     *
     * @param facetsOnly If true, return only facets instead of full test details. (optional,
     *     default to false)
     * @return SearchSuitesOptionalParameters
     */
    public SearchSuitesOptionalParameters facetsOnly(Boolean facetsOnly) {
      this.facetsOnly = facetsOnly;
      return this;
    }

    /**
     * Set start.
     *
     * @param start The offset from which to start returning results. (optional, default to 0)
     * @return SearchSuitesOptionalParameters
     */
    public SearchSuitesOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count.
     *
     * @param count The maximum number of results to return. (optional, default to 50)
     * @return SearchSuitesOptionalParameters
     */
    public SearchSuitesOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }
  }

  /**
   * Search test suites.
   *
   * <p>See {@link #searchSuitesWithHttpInfo}.
   *
   * @return SyntheticsSuiteSearchResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteSearchResponse searchSuites() throws ApiException {
    return searchSuitesWithHttpInfo(new SearchSuitesOptionalParameters()).getData();
  }

  /**
   * Search test suites.
   *
   * <p>See {@link #searchSuitesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SyntheticsSuiteSearchResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteSearchResponse> searchSuitesAsync() {
    return searchSuitesWithHttpInfoAsync(new SearchSuitesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search test suites.
   *
   * <p>See {@link #searchSuitesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SyntheticsSuiteSearchResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteSearchResponse searchSuites(SearchSuitesOptionalParameters parameters)
      throws ApiException {
    return searchSuitesWithHttpInfo(parameters).getData();
  }

  /**
   * Search test suites.
   *
   * <p>See {@link #searchSuitesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsSuiteSearchResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteSearchResponse> searchSuitesAsync(
      SearchSuitesOptionalParameters parameters) {
    return searchSuitesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for test suites.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsSuiteSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsSuiteSearchResponse> searchSuitesWithHttpInfo(
      SearchSuitesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String query = parameters.query;
    String sort = parameters.sort;
    Boolean facetsOnly = parameters.facetsOnly;
    Long start = parameters.start;
    Long count = parameters.count;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facets_only", facetsOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.searchSuites",
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
        new GenericType<SyntheticsSuiteSearchResponse>() {});
  }

  /**
   * Search test suites.
   *
   * <p>See {@link #searchSuitesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsSuiteSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsSuiteSearchResponse>>
      searchSuitesWithHttpInfoAsync(SearchSuitesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String query = parameters.query;
    String sort = parameters.sort;
    Boolean facetsOnly = parameters.facetsOnly;
    Long start = parameters.start;
    Long count = parameters.count;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/suites/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facets_only", facetsOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.searchSuites",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsSuiteSearchResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SyntheticsSuiteSearchResponse>() {});
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @param body . (required)
   * @return OnDemandConcurrencyCapResponse
   * @throws ApiException if fails to make API call
   */
  public OnDemandConcurrencyCapResponse setOnDemandConcurrencyCap(
      OnDemandConcurrencyCapAttributes body) throws ApiException {
    return setOnDemandConcurrencyCapWithHttpInfo(body).getData();
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfoAsync}.
   *
   * @param body . (required)
   * @return CompletableFuture&lt;OnDemandConcurrencyCapResponse&gt;
   */
  public CompletableFuture<OnDemandConcurrencyCapResponse> setOnDemandConcurrencyCapAsync(
      OnDemandConcurrencyCapAttributes body) {
    return setOnDemandConcurrencyCapWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * @param body . (required)
   * @return ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnDemandConcurrencyCapResponse> setOnDemandConcurrencyCapWithHttpInfo(
      OnDemandConcurrencyCapAttributes body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling setOnDemandConcurrencyCap");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.setOnDemandConcurrencyCap",
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @param body . (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>>
      setOnDemandConcurrencyCapWithHttpInfoAsync(OnDemandConcurrencyCapAttributes body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling setOnDemandConcurrencyCap"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.setOnDemandConcurrencyCap",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Edit a Network Path test.
   *
   * <p>See {@link #updateSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param publicId The public ID of the Network Path test to edit. (required)
   * @param body New Network Path test details to be saved. (required)
   * @return SyntheticsNetworkTestResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsNetworkTestResponse updateSyntheticsNetworkTest(
      String publicId, SyntheticsNetworkTestEditRequest body) throws ApiException {
    return updateSyntheticsNetworkTestWithHttpInfo(publicId, body).getData();
  }

  /**
   * Edit a Network Path test.
   *
   * <p>See {@link #updateSyntheticsNetworkTestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Network Path test to edit. (required)
   * @param body New Network Path test details to be saved. (required)
   * @return CompletableFuture&lt;SyntheticsNetworkTestResponse&gt;
   */
  public CompletableFuture<SyntheticsNetworkTestResponse> updateSyntheticsNetworkTestAsync(
      String publicId, SyntheticsNetworkTestEditRequest body) {
    return updateSyntheticsNetworkTestWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param publicId The public ID of the Network Path test to edit. (required)
   * @param body New Network Path test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsNetworkTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsNetworkTestResponse> updateSyntheticsNetworkTestWithHttpInfo(
      String publicId, SyntheticsNetworkTestEditRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling updateSyntheticsNetworkTest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSyntheticsNetworkTest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/network/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.updateSyntheticsNetworkTest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }

  /**
   * Edit a Network Path test.
   *
   * <p>See {@link #updateSyntheticsNetworkTestWithHttpInfo}.
   *
   * @param publicId The public ID of the Network Path test to edit. (required)
   * @param body New Network Path test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsNetworkTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>>
      updateSyntheticsNetworkTestWithHttpInfoAsync(
          String publicId, SyntheticsNetworkTestEditRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " updateSyntheticsNetworkTest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateSyntheticsNetworkTest"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/network/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.updateSyntheticsNetworkTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsNetworkTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsNetworkTestResponse>() {});
  }
}
