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
import com.datadog.api.client.v2.model.SuiteJsonPatchRequest;
import com.datadog.api.client.v2.model.SyntheticsApiMultistepParentTestsResponse;
import com.datadog.api.client.v2.model.SyntheticsApiMultistepSubtestsResponse;
import com.datadog.api.client.v2.model.SyntheticsFastTestResult;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestEditRequest;
import com.datadog.api.client.v2.model.SyntheticsNetworkTestResponse;
import com.datadog.api.client.v2.model.SyntheticsPollTestResultsResponse;
import com.datadog.api.client.v2.model.SyntheticsSuiteResponse;
import com.datadog.api.client.v2.model.SyntheticsSuiteSearchResponse;
import com.datadog.api.client.v2.model.SyntheticsTestFileAbortMultipartUploadRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileCompleteMultipartUploadRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileDownloadRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileDownloadResponse;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsResponse;
import com.datadog.api.client.v2.model.SyntheticsTestLatestResultsResponse;
import com.datadog.api.client.v2.model.SyntheticsTestParentSuitesResponse;
import com.datadog.api.client.v2.model.SyntheticsTestResultResponse;
import com.datadog.api.client.v2.model.SyntheticsTestResultRunType;
import com.datadog.api.client.v2.model.SyntheticsTestResultStatus;
import com.datadog.api.client.v2.model.SyntheticsTestVersionHistoryResponse;
import com.datadog.api.client.v2.model.SyntheticsTestVersionResponse;
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
   * Abort a multipart upload of a test file.
   *
   * <p>See {@link #abortTestFileMultipartUploadWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void abortTestFileMultipartUpload(
      String publicId, SyntheticsTestFileAbortMultipartUploadRequest body) throws ApiException {
    abortTestFileMultipartUploadWithHttpInfo(publicId, body);
  }

  /**
   * Abort a multipart upload of a test file.
   *
   * <p>See {@link #abortTestFileMultipartUploadWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> abortTestFileMultipartUploadAsync(
      String publicId, SyntheticsTestFileAbortMultipartUploadRequest body) {
    return abortTestFileMultipartUploadWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Abort an in-progress multipart file upload for a Synthetic test. This cancels the upload and
   * releases any storage used by already-uploaded parts.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> abortTestFileMultipartUploadWithHttpInfo(
      String publicId, SyntheticsTestFileAbortMultipartUploadRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling abortTestFileMultipartUpload");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling abortTestFileMultipartUpload");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-upload-abort"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.abortTestFileMultipartUpload",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Abort a multipart upload of a test file.
   *
   * <p>See {@link #abortTestFileMultipartUploadWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> abortTestFileMultipartUploadWithHttpInfoAsync(
      String publicId, SyntheticsTestFileAbortMultipartUploadRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " abortTestFileMultipartUpload"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling abortTestFileMultipartUpload"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-upload-abort"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.abortTestFileMultipartUpload",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Complete a multipart upload of a test file.
   *
   * <p>See {@link #completeTestFileMultipartUploadWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void completeTestFileMultipartUpload(
      String publicId, SyntheticsTestFileCompleteMultipartUploadRequest body) throws ApiException {
    completeTestFileMultipartUploadWithHttpInfo(publicId, body);
  }

  /**
   * Complete a multipart upload of a test file.
   *
   * <p>See {@link #completeTestFileMultipartUploadWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> completeTestFileMultipartUploadAsync(
      String publicId, SyntheticsTestFileCompleteMultipartUploadRequest body) {
    return completeTestFileMultipartUploadWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Complete a multipart file upload for a Synthetic test. Call this endpoint after all parts have
   * been uploaded using the presigned URLs obtained from the multipart presigned URLs endpoint.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> completeTestFileMultipartUploadWithHttpInfo(
      String publicId, SyntheticsTestFileCompleteMultipartUploadRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling completeTestFileMultipartUpload");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling completeTestFileMultipartUpload");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-upload-complete"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.completeTestFileMultipartUpload",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Complete a multipart upload of a test file.
   *
   * <p>See {@link #completeTestFileMultipartUploadWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> completeTestFileMultipartUploadWithHttpInfoAsync(
      String publicId, SyntheticsTestFileCompleteMultipartUploadRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " completeTestFileMultipartUpload"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " completeTestFileMultipartUpload"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-upload-complete"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.completeTestFileMultipartUpload",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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
   * Get parent tests for a subtest.
   *
   * <p>See {@link #getApiMultistepSubtestParentsWithHttpInfo}.
   *
   * @param publicId The public ID of the subtest. (required)
   * @return SyntheticsApiMultistepParentTestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsApiMultistepParentTestsResponse getApiMultistepSubtestParents(String publicId)
      throws ApiException {
    return getApiMultistepSubtestParentsWithHttpInfo(publicId).getData();
  }

  /**
   * Get parent tests for a subtest.
   *
   * <p>See {@link #getApiMultistepSubtestParentsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the subtest. (required)
   * @return CompletableFuture&lt;SyntheticsApiMultistepParentTestsResponse&gt;
   */
  public CompletableFuture<SyntheticsApiMultistepParentTestsResponse>
      getApiMultistepSubtestParentsAsync(String publicId) {
    return getApiMultistepSubtestParentsWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of API multistep tests that include a given subtest, along with their monitor
   * status.
   *
   * @param publicId The public ID of the subtest. (required)
   * @return ApiResponse&lt;SyntheticsApiMultistepParentTestsResponse&gt;
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
  public ApiResponse<SyntheticsApiMultistepParentTestsResponse>
      getApiMultistepSubtestParentsWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling getApiMultistepSubtestParents");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/api-multistep/subtests/{public_id}/parents"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getApiMultistepSubtestParents",
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
        new GenericType<SyntheticsApiMultistepParentTestsResponse>() {});
  }

  /**
   * Get parent tests for a subtest.
   *
   * <p>See {@link #getApiMultistepSubtestParentsWithHttpInfo}.
   *
   * @param publicId The public ID of the subtest. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsApiMultistepParentTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsApiMultistepParentTestsResponse>>
      getApiMultistepSubtestParentsWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsApiMultistepParentTestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " getApiMultistepSubtestParents"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/api-multistep/subtests/{public_id}/parents"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getApiMultistepSubtestParents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsApiMultistepParentTestsResponse>> result =
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
        new GenericType<SyntheticsApiMultistepParentTestsResponse>() {});
  }

  /**
   * Get available subtests for a multistep test.
   *
   * <p>See {@link #getApiMultistepSubtestsWithHttpInfo}.
   *
   * @param publicId The public ID of the API multistep test. (required)
   * @return SyntheticsApiMultistepSubtestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsApiMultistepSubtestsResponse getApiMultistepSubtests(String publicId)
      throws ApiException {
    return getApiMultistepSubtestsWithHttpInfo(publicId).getData();
  }

  /**
   * Get available subtests for a multistep test.
   *
   * <p>See {@link #getApiMultistepSubtestsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the API multistep test. (required)
   * @return CompletableFuture&lt;SyntheticsApiMultistepSubtestsResponse&gt;
   */
  public CompletableFuture<SyntheticsApiMultistepSubtestsResponse> getApiMultistepSubtestsAsync(
      String publicId) {
    return getApiMultistepSubtestsWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of API tests that can be added as subtests to a given API multistep test. The
   * current test is excluded from the list since a test cannot be a subtest of itself.
   *
   * @param publicId The public ID of the API multistep test. (required)
   * @return ApiResponse&lt;SyntheticsApiMultistepSubtestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsApiMultistepSubtestsResponse> getApiMultistepSubtestsWithHttpInfo(
      String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getApiMultistepSubtests");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/api-multistep/subtests/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getApiMultistepSubtests",
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
        new GenericType<SyntheticsApiMultistepSubtestsResponse>() {});
  }

  /**
   * Get available subtests for a multistep test.
   *
   * <p>See {@link #getApiMultistepSubtestsWithHttpInfo}.
   *
   * @param publicId The public ID of the API multistep test. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsApiMultistepSubtestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsApiMultistepSubtestsResponse>>
      getApiMultistepSubtestsWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsApiMultistepSubtestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getApiMultistepSubtests"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/api-multistep/subtests/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getApiMultistepSubtests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsApiMultistepSubtestsResponse>> result =
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
        new GenericType<SyntheticsApiMultistepSubtestsResponse>() {});
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

  /** Manage optional parameters to getSyntheticsBrowserTestResult. */
  public static class GetSyntheticsBrowserTestResultOptionalParameters {
    private String eventId;
    private Long timestamp;

    /**
     * Set eventId.
     *
     * @param eventId The event ID used to look up the result in the event store. (optional)
     * @return GetSyntheticsBrowserTestResultOptionalParameters
     */
    public GetSyntheticsBrowserTestResultOptionalParameters eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    /**
     * Set timestamp.
     *
     * @param timestamp Timestamp in seconds to look up the result. (optional)
     * @return GetSyntheticsBrowserTestResultOptionalParameters
     */
    public GetSyntheticsBrowserTestResultOptionalParameters timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }

  /**
   * Get a browser test result.
   *
   * <p>See {@link #getSyntheticsBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsTestResultResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestResultResponse getSyntheticsBrowserTestResult(
      String publicId, String resultId) throws ApiException {
    return getSyntheticsBrowserTestResultWithHttpInfo(
            publicId, resultId, new GetSyntheticsBrowserTestResultOptionalParameters())
        .getData();
  }

  /**
   * Get a browser test result.
   *
   * <p>See {@link #getSyntheticsBrowserTestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;SyntheticsTestResultResponse&gt;
   */
  public CompletableFuture<SyntheticsTestResultResponse> getSyntheticsBrowserTestResultAsync(
      String publicId, String resultId) {
    return getSyntheticsBrowserTestResultWithHttpInfoAsync(
            publicId, resultId, new GetSyntheticsBrowserTestResultOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test result.
   *
   * <p>See {@link #getSyntheticsBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestResultResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestResultResponse getSyntheticsBrowserTestResult(
      String publicId, String resultId, GetSyntheticsBrowserTestResultOptionalParameters parameters)
      throws ApiException {
    return getSyntheticsBrowserTestResultWithHttpInfo(publicId, resultId, parameters).getData();
  }

  /**
   * Get a browser test result.
   *
   * <p>See {@link #getSyntheticsBrowserTestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestResultResponse&gt;
   */
  public CompletableFuture<SyntheticsTestResultResponse> getSyntheticsBrowserTestResultAsync(
      String publicId,
      String resultId,
      GetSyntheticsBrowserTestResultOptionalParameters parameters) {
    return getSyntheticsBrowserTestResultWithHttpInfoAsync(publicId, resultId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific full result from a given Synthetic browser test.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestResultResponse&gt;
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
  public ApiResponse<SyntheticsTestResultResponse> getSyntheticsBrowserTestResultWithHttpInfo(
      String publicId, String resultId, GetSyntheticsBrowserTestResultOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling getSyntheticsBrowserTestResult");
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'resultId' when calling getSyntheticsBrowserTestResult");
    }
    String eventId = parameters.eventId;
    Long timestamp = parameters.timestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/browser/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_id", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsBrowserTestResult",
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
        new GenericType<SyntheticsTestResultResponse>() {});
  }

  /**
   * Get a browser test result.
   *
   * <p>See {@link #getSyntheticsBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestResultResponse>>
      getSyntheticsBrowserTestResultWithHttpInfoAsync(
          String publicId,
          String resultId,
          GetSyntheticsBrowserTestResultOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " getSyntheticsBrowserTestResult"));
      return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resultId' when calling"
                  + " getSyntheticsBrowserTestResult"));
      return result;
    }
    String eventId = parameters.eventId;
    Long timestamp = parameters.timestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/browser/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_id", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsBrowserTestResult",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
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
        new GenericType<SyntheticsTestResultResponse>() {});
  }

  /**
   * Get a fast test result.
   *
   * <p>See {@link #getSyntheticsFastTestResultWithHttpInfo}.
   *
   * @param id The UUID of the fast test to retrieve the result for. (required)
   * @return SyntheticsFastTestResult
   * @throws ApiException if fails to make API call
   */
  public SyntheticsFastTestResult getSyntheticsFastTestResult(String id) throws ApiException {
    return getSyntheticsFastTestResultWithHttpInfo(id).getData();
  }

  /**
   * Get a fast test result.
   *
   * <p>See {@link #getSyntheticsFastTestResultWithHttpInfoAsync}.
   *
   * @param id The UUID of the fast test to retrieve the result for. (required)
   * @return CompletableFuture&lt;SyntheticsFastTestResult&gt;
   */
  public CompletableFuture<SyntheticsFastTestResult> getSyntheticsFastTestResultAsync(String id) {
    return getSyntheticsFastTestResultWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param id The UUID of the fast test to retrieve the result for. (required)
   * @return ApiResponse&lt;SyntheticsFastTestResult&gt;
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
  public ApiResponse<SyntheticsFastTestResult> getSyntheticsFastTestResultWithHttpInfo(String id)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getSyntheticsFastTestResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/fast/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsFastTestResult",
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
        new GenericType<SyntheticsFastTestResult>() {});
  }

  /**
   * Get a fast test result.
   *
   * <p>See {@link #getSyntheticsFastTestResultWithHttpInfo}.
   *
   * @param id The UUID of the fast test to retrieve the result for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsFastTestResult&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsFastTestResult>>
      getSyntheticsFastTestResultWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<SyntheticsFastTestResult>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getSyntheticsFastTestResult"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/fast/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsFastTestResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsFastTestResult>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsFastTestResult>() {});
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

  /** Manage optional parameters to getSyntheticsTestResult. */
  public static class GetSyntheticsTestResultOptionalParameters {
    private String eventId;
    private Long timestamp;

    /**
     * Set eventId.
     *
     * @param eventId The event ID used to look up the result in the event store. (optional)
     * @return GetSyntheticsTestResultOptionalParameters
     */
    public GetSyntheticsTestResultOptionalParameters eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    /**
     * Set timestamp.
     *
     * @param timestamp Timestamp in seconds to look up the result. (optional)
     * @return GetSyntheticsTestResultOptionalParameters
     */
    public GetSyntheticsTestResultOptionalParameters timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }

  /**
   * Get a test result.
   *
   * <p>See {@link #getSyntheticsTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsTestResultResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestResultResponse getSyntheticsTestResult(String publicId, String resultId)
      throws ApiException {
    return getSyntheticsTestResultWithHttpInfo(
            publicId, resultId, new GetSyntheticsTestResultOptionalParameters())
        .getData();
  }

  /**
   * Get a test result.
   *
   * <p>See {@link #getSyntheticsTestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;SyntheticsTestResultResponse&gt;
   */
  public CompletableFuture<SyntheticsTestResultResponse> getSyntheticsTestResultAsync(
      String publicId, String resultId) {
    return getSyntheticsTestResultWithHttpInfoAsync(
            publicId, resultId, new GetSyntheticsTestResultOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a test result.
   *
   * <p>See {@link #getSyntheticsTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestResultResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestResultResponse getSyntheticsTestResult(
      String publicId, String resultId, GetSyntheticsTestResultOptionalParameters parameters)
      throws ApiException {
    return getSyntheticsTestResultWithHttpInfo(publicId, resultId, parameters).getData();
  }

  /**
   * Get a test result.
   *
   * <p>See {@link #getSyntheticsTestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestResultResponse&gt;
   */
  public CompletableFuture<SyntheticsTestResultResponse> getSyntheticsTestResultAsync(
      String publicId, String resultId, GetSyntheticsTestResultOptionalParameters parameters) {
    return getSyntheticsTestResultWithHttpInfoAsync(publicId, resultId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific full result from a given Synthetic test.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestResultResponse&gt;
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
  public ApiResponse<SyntheticsTestResultResponse> getSyntheticsTestResultWithHttpInfo(
      String publicId, String resultId, GetSyntheticsTestResultOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getSyntheticsTestResult");
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resultId' when calling getSyntheticsTestResult");
    }
    String eventId = parameters.eventId;
    Long timestamp = parameters.timestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_id", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsTestResult",
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
        new GenericType<SyntheticsTestResultResponse>() {});
  }

  /**
   * Get a test result.
   *
   * <p>See {@link #getSyntheticsTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestResultResponse>>
      getSyntheticsTestResultWithHttpInfoAsync(
          String publicId, String resultId, GetSyntheticsTestResultOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getSyntheticsTestResult"));
      return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resultId' when calling getSyntheticsTestResult"));
      return result;
    }
    String eventId = parameters.eventId;
    Long timestamp = parameters.timestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_id", eventId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsTestResult",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestResultResponse>> result =
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
        new GenericType<SyntheticsTestResultResponse>() {});
  }

  /** Manage optional parameters to getSyntheticsTestVersion. */
  public static class GetSyntheticsTestVersionOptionalParameters {
    private Boolean includeChangeMetadata;
    private Boolean onlyCheckExistence;

    /**
     * Set includeChangeMetadata.
     *
     * @param includeChangeMetadata If <code>true</code>, include change metadata in the response.
     *     (optional)
     * @return GetSyntheticsTestVersionOptionalParameters
     */
    public GetSyntheticsTestVersionOptionalParameters includeChangeMetadata(
        Boolean includeChangeMetadata) {
      this.includeChangeMetadata = includeChangeMetadata;
      return this;
    }

    /**
     * Set onlyCheckExistence.
     *
     * @param onlyCheckExistence If <code>true</code>, only check whether the version exists without
     *     returning its full payload. Returns an empty object if the version exists, or 404 if not.
     *     (optional)
     * @return GetSyntheticsTestVersionOptionalParameters
     */
    public GetSyntheticsTestVersionOptionalParameters onlyCheckExistence(
        Boolean onlyCheckExistence) {
      this.onlyCheckExistence = onlyCheckExistence;
      return this;
    }
  }

  /**
   * Get a specific version of a test.
   *
   * <p>See {@link #getSyntheticsTestVersionWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @return SyntheticsTestVersionResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestVersionResponse getSyntheticsTestVersion(String publicId, Long versionNumber)
      throws ApiException {
    return getSyntheticsTestVersionWithHttpInfo(
            publicId, versionNumber, new GetSyntheticsTestVersionOptionalParameters())
        .getData();
  }

  /**
   * Get a specific version of a test.
   *
   * <p>See {@link #getSyntheticsTestVersionWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @return CompletableFuture&lt;SyntheticsTestVersionResponse&gt;
   */
  public CompletableFuture<SyntheticsTestVersionResponse> getSyntheticsTestVersionAsync(
      String publicId, Long versionNumber) {
    return getSyntheticsTestVersionWithHttpInfoAsync(
            publicId, versionNumber, new GetSyntheticsTestVersionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific version of a test.
   *
   * <p>See {@link #getSyntheticsTestVersionWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestVersionResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestVersionResponse getSyntheticsTestVersion(
      String publicId, Long versionNumber, GetSyntheticsTestVersionOptionalParameters parameters)
      throws ApiException {
    return getSyntheticsTestVersionWithHttpInfo(publicId, versionNumber, parameters).getData();
  }

  /**
   * Get a specific version of a test.
   *
   * <p>See {@link #getSyntheticsTestVersionWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestVersionResponse&gt;
   */
  public CompletableFuture<SyntheticsTestVersionResponse> getSyntheticsTestVersionAsync(
      String publicId, Long versionNumber, GetSyntheticsTestVersionOptionalParameters parameters) {
    return getSyntheticsTestVersionWithHttpInfoAsync(publicId, versionNumber, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific version of a Synthetic test by its version number.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestVersionResponse&gt;
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
  public ApiResponse<SyntheticsTestVersionResponse> getSyntheticsTestVersionWithHttpInfo(
      String publicId, Long versionNumber, GetSyntheticsTestVersionOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getSyntheticsTestVersion");
    }

    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'versionNumber' when calling getSyntheticsTestVersion");
    }
    Boolean includeChangeMetadata = parameters.includeChangeMetadata;
    Boolean onlyCheckExistence = parameters.onlyCheckExistence;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/version_history/{version_number}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll(
                "\\{" + "version_number" + "\\}", apiClient.escapeString(versionNumber.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_change_metadata", includeChangeMetadata));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "only_check_existence", onlyCheckExistence));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getSyntheticsTestVersion",
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
        new GenericType<SyntheticsTestVersionResponse>() {});
  }

  /**
   * Get a specific version of a test.
   *
   * <p>See {@link #getSyntheticsTestVersionWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param versionNumber The version number to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestVersionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestVersionResponse>>
      getSyntheticsTestVersionWithHttpInfoAsync(
          String publicId,
          Long versionNumber,
          GetSyntheticsTestVersionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestVersionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getSyntheticsTestVersion"));
      return result;
    }

    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      CompletableFuture<ApiResponse<SyntheticsTestVersionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'versionNumber' when calling"
                  + " getSyntheticsTestVersion"));
      return result;
    }
    Boolean includeChangeMetadata = parameters.includeChangeMetadata;
    Boolean onlyCheckExistence = parameters.onlyCheckExistence;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/version_history/{version_number}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll(
                "\\{" + "version_number" + "\\}", apiClient.escapeString(versionNumber.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_change_metadata", includeChangeMetadata));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "only_check_existence", onlyCheckExistence));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getSyntheticsTestVersion",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestVersionResponse>> result =
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
        new GenericType<SyntheticsTestVersionResponse>() {});
  }

  /**
   * Get a presigned URL for downloading a test file.
   *
   * <p>See {@link #getTestFileDownloadUrlWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return SyntheticsTestFileDownloadResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestFileDownloadResponse getTestFileDownloadUrl(
      String publicId, SyntheticsTestFileDownloadRequest body) throws ApiException {
    return getTestFileDownloadUrlWithHttpInfo(publicId, body).getData();
  }

  /**
   * Get a presigned URL for downloading a test file.
   *
   * <p>See {@link #getTestFileDownloadUrlWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SyntheticsTestFileDownloadResponse&gt;
   */
  public CompletableFuture<SyntheticsTestFileDownloadResponse> getTestFileDownloadUrlAsync(
      String publicId, SyntheticsTestFileDownloadRequest body) {
    return getTestFileDownloadUrlWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a presigned URL to download a file attached to a Synthetic test. The returned URL is
   * temporary and expires after a short period.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return ApiResponse&lt;SyntheticsTestFileDownloadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestFileDownloadResponse> getTestFileDownloadUrlWithHttpInfo(
      String publicId, SyntheticsTestFileDownloadRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getTestFileDownloadUrl");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getTestFileDownloadUrl");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/download"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getTestFileDownloadUrl",
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
        new GenericType<SyntheticsTestFileDownloadResponse>() {});
  }

  /**
   * Get a presigned URL for downloading a test file.
   *
   * <p>See {@link #getTestFileDownloadUrlWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestFileDownloadResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestFileDownloadResponse>>
      getTestFileDownloadUrlWithHttpInfoAsync(
          String publicId, SyntheticsTestFileDownloadRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestFileDownloadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getTestFileDownloadUrl"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsTestFileDownloadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling getTestFileDownloadUrl"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/download"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getTestFileDownloadUrl",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestFileDownloadResponse>> result =
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
        new GenericType<SyntheticsTestFileDownloadResponse>() {});
  }

  /**
   * Get presigned URLs for uploading a test file.
   *
   * <p>See {@link #getTestFileMultipartPresignedUrlsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return SyntheticsTestFileMultipartPresignedUrlsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestFileMultipartPresignedUrlsResponse getTestFileMultipartPresignedUrls(
      String publicId, SyntheticsTestFileMultipartPresignedUrlsRequest body) throws ApiException {
    return getTestFileMultipartPresignedUrlsWithHttpInfo(publicId, body).getData();
  }

  /**
   * Get presigned URLs for uploading a test file.
   *
   * <p>See {@link #getTestFileMultipartPresignedUrlsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SyntheticsTestFileMultipartPresignedUrlsResponse&gt;
   */
  public CompletableFuture<SyntheticsTestFileMultipartPresignedUrlsResponse>
      getTestFileMultipartPresignedUrlsAsync(
          String publicId, SyntheticsTestFileMultipartPresignedUrlsRequest body) {
    return getTestFileMultipartPresignedUrlsWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get presigned URLs for uploading a file to a Synthetic test using multipart upload. Returns the
   * presigned URLs for each part along with the bucket key that references the file.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return ApiResponse&lt;SyntheticsTestFileMultipartPresignedUrlsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestFileMultipartPresignedUrlsResponse>
      getTestFileMultipartPresignedUrlsWithHttpInfo(
          String publicId, SyntheticsTestFileMultipartPresignedUrlsRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling"
              + " getTestFileMultipartPresignedUrls");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling getTestFileMultipartPresignedUrls");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-presigned-urls"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getTestFileMultipartPresignedUrls",
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
        new GenericType<SyntheticsTestFileMultipartPresignedUrlsResponse>() {});
  }

  /**
   * Get presigned URLs for uploading a test file.
   *
   * <p>See {@link #getTestFileMultipartPresignedUrlsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;SyntheticsTestFileMultipartPresignedUrlsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestFileMultipartPresignedUrlsResponse>>
      getTestFileMultipartPresignedUrlsWithHttpInfoAsync(
          String publicId, SyntheticsTestFileMultipartPresignedUrlsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestFileMultipartPresignedUrlsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " getTestFileMultipartPresignedUrls"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsTestFileMultipartPresignedUrlsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " getTestFileMultipartPresignedUrls"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/files/multipart-presigned-urls"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getTestFileMultipartPresignedUrls",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestFileMultipartPresignedUrlsResponse>> result =
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
        new GenericType<SyntheticsTestFileMultipartPresignedUrlsResponse>() {});
  }

  /**
   * Get parent suites for a test.
   *
   * <p>See {@link #getTestParentSuitesWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return SyntheticsTestParentSuitesResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestParentSuitesResponse getTestParentSuites(String publicId)
      throws ApiException {
    return getTestParentSuitesWithHttpInfo(publicId).getData();
  }

  /**
   * Get parent suites for a test.
   *
   * <p>See {@link #getTestParentSuitesWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return CompletableFuture&lt;SyntheticsTestParentSuitesResponse&gt;
   */
  public CompletableFuture<SyntheticsTestParentSuitesResponse> getTestParentSuitesAsync(
      String publicId) {
    return getTestParentSuitesWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of parent suites and their status for a given Synthetic test.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return ApiResponse&lt;SyntheticsTestParentSuitesResponse&gt;
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
  public ApiResponse<SyntheticsTestParentSuitesResponse> getTestParentSuitesWithHttpInfo(
      String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getTestParentSuites");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/parent-suites"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getTestParentSuites",
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
        new GenericType<SyntheticsTestParentSuitesResponse>() {});
  }

  /**
   * Get parent suites for a test.
   *
   * <p>See {@link #getTestParentSuitesWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestParentSuitesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestParentSuitesResponse>>
      getTestParentSuitesWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestParentSuitesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getTestParentSuites"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/parent-suites"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getTestParentSuites",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestParentSuitesResponse>> result =
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
        new GenericType<SyntheticsTestParentSuitesResponse>() {});
  }

  /** Manage optional parameters to listSyntheticsBrowserTestLatestResults. */
  public static class ListSyntheticsBrowserTestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private SyntheticsTestResultStatus status;
    private SyntheticsTestResultRunType runType;
    private List<String> probeDc;
    private List<String> deviceId;

    /**
     * Set fromTs.
     *
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs.
     *
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set status.
     *
     * @param status Filter results by status. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters status(
        SyntheticsTestResultStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Set runType.
     *
     * @param runType Filter results by run type. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters runType(
        SyntheticsTestResultRunType runType) {
      this.runType = runType;
      return this;
    }

    /**
     * Set probeDc.
     *
     * @param probeDc Locations for which to query results. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }

    /**
     * Set deviceId.
     *
     * @param deviceId Device IDs for which to query results. (optional)
     * @return ListSyntheticsBrowserTestLatestResultsOptionalParameters
     */
    public ListSyntheticsBrowserTestLatestResultsOptionalParameters deviceId(
        List<String> deviceId) {
      this.deviceId = deviceId;
      return this;
    }
  }

  /**
   * Get a browser test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @return SyntheticsTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestLatestResultsResponse listSyntheticsBrowserTestLatestResults(String publicId)
      throws ApiException {
    return listSyntheticsBrowserTestLatestResultsWithHttpInfo(
            publicId, new ListSyntheticsBrowserTestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get a browser test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsBrowserTestLatestResultsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @return CompletableFuture&lt;SyntheticsTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsTestLatestResultsResponse>
      listSyntheticsBrowserTestLatestResultsAsync(String publicId) {
    return listSyntheticsBrowserTestLatestResultsWithHttpInfoAsync(
            publicId, new ListSyntheticsBrowserTestLatestResultsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestLatestResultsResponse listSyntheticsBrowserTestLatestResults(
      String publicId, ListSyntheticsBrowserTestLatestResultsOptionalParameters parameters)
      throws ApiException {
    return listSyntheticsBrowserTestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get a browser test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsBrowserTestLatestResultsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsTestLatestResultsResponse>
      listSyntheticsBrowserTestLatestResultsAsync(
          String publicId, ListSyntheticsBrowserTestLatestResultsOptionalParameters parameters) {
    return listSyntheticsBrowserTestLatestResultsWithHttpInfoAsync(publicId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the latest result summaries for a given Synthetic browser test.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestLatestResultsResponse&gt;
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
  public ApiResponse<SyntheticsTestLatestResultsResponse>
      listSyntheticsBrowserTestLatestResultsWithHttpInfo(
          String publicId, ListSyntheticsBrowserTestLatestResultsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling"
              + " listSyntheticsBrowserTestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    SyntheticsTestResultStatus status = parameters.status;
    SyntheticsTestResultRunType runType = parameters.runType;
    List<String> probeDc = parameters.probeDc;
    List<String> deviceId = parameters.deviceId;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/browser/{public_id}/results"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runType", runType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "device_id", deviceId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.listSyntheticsBrowserTestLatestResults",
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
        new GenericType<SyntheticsTestLatestResultsResponse>() {});
  }

  /**
   * Get a browser test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic browser test for which to search results.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>>
      listSyntheticsBrowserTestLatestResultsWithHttpInfoAsync(
          String publicId, ListSyntheticsBrowserTestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " listSyntheticsBrowserTestLatestResults"));
      return result;
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    SyntheticsTestResultStatus status = parameters.status;
    SyntheticsTestResultRunType runType = parameters.runType;
    List<String> probeDc = parameters.probeDc;
    List<String> deviceId = parameters.deviceId;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/browser/{public_id}/results"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runType", runType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "device_id", deviceId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.listSyntheticsBrowserTestLatestResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>> result =
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
        new GenericType<SyntheticsTestLatestResultsResponse>() {});
  }

  /** Manage optional parameters to listSyntheticsTestLatestResults. */
  public static class ListSyntheticsTestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private SyntheticsTestResultStatus status;
    private SyntheticsTestResultRunType runType;
    private List<String> probeDc;
    private List<String> deviceId;

    /**
     * Set fromTs.
     *
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs.
     *
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set status.
     *
     * @param status Filter results by status. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters status(
        SyntheticsTestResultStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Set runType.
     *
     * @param runType Filter results by run type. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters runType(
        SyntheticsTestResultRunType runType) {
      this.runType = runType;
      return this;
    }

    /**
     * Set probeDc.
     *
     * @param probeDc Locations for which to query results. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }

    /**
     * Set deviceId.
     *
     * @param deviceId Device IDs for which to query results. (optional)
     * @return ListSyntheticsTestLatestResultsOptionalParameters
     */
    public ListSyntheticsTestLatestResultsOptionalParameters deviceId(List<String> deviceId) {
      this.deviceId = deviceId;
      return this;
    }
  }

  /**
   * Get a test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @return SyntheticsTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestLatestResultsResponse listSyntheticsTestLatestResults(String publicId)
      throws ApiException {
    return listSyntheticsTestLatestResultsWithHttpInfo(
            publicId, new ListSyntheticsTestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get a test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsTestLatestResultsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @return CompletableFuture&lt;SyntheticsTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsTestLatestResultsResponse>
      listSyntheticsTestLatestResultsAsync(String publicId) {
    return listSyntheticsTestLatestResultsWithHttpInfoAsync(
            publicId, new ListSyntheticsTestLatestResultsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestLatestResultsResponse listSyntheticsTestLatestResults(
      String publicId, ListSyntheticsTestLatestResultsOptionalParameters parameters)
      throws ApiException {
    return listSyntheticsTestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get a test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsTestLatestResultsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsTestLatestResultsResponse>
      listSyntheticsTestLatestResultsAsync(
          String publicId, ListSyntheticsTestLatestResultsOptionalParameters parameters) {
    return listSyntheticsTestLatestResultsWithHttpInfoAsync(publicId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the latest result summaries for a given Synthetic test.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestLatestResultsResponse&gt;
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
  public ApiResponse<SyntheticsTestLatestResultsResponse>
      listSyntheticsTestLatestResultsWithHttpInfo(
          String publicId, ListSyntheticsTestLatestResultsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling listSyntheticsTestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    SyntheticsTestResultStatus status = parameters.status;
    SyntheticsTestResultRunType runType = parameters.runType;
    List<String> probeDc = parameters.probeDc;
    List<String> deviceId = parameters.deviceId;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/results"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runType", runType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "device_id", deviceId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.listSyntheticsTestLatestResults",
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
        new GenericType<SyntheticsTestLatestResultsResponse>() {});
  }

  /**
   * Get a test&#39;s latest results.
   *
   * <p>See {@link #listSyntheticsTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test for which to search results. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>>
      listSyntheticsTestLatestResultsWithHttpInfoAsync(
          String publicId, ListSyntheticsTestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " listSyntheticsTestLatestResults"));
      return result;
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    SyntheticsTestResultStatus status = parameters.status;
    SyntheticsTestResultRunType runType = parameters.runType;
    List<String> probeDc = parameters.probeDc;
    List<String> deviceId = parameters.deviceId;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/results"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runType", runType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "device_id", deviceId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.listSyntheticsTestLatestResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestLatestResultsResponse>> result =
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
        new GenericType<SyntheticsTestLatestResultsResponse>() {});
  }

  /** Manage optional parameters to listSyntheticsTestVersions. */
  public static class ListSyntheticsTestVersionsOptionalParameters {
    private Long lastVersionNumber;
    private Long limit;

    /**
     * Set lastVersionNumber.
     *
     * @param lastVersionNumber The version number of the last item from the previous page. Omit to
     *     get the first page. (optional)
     * @return ListSyntheticsTestVersionsOptionalParameters
     */
    public ListSyntheticsTestVersionsOptionalParameters lastVersionNumber(Long lastVersionNumber) {
      this.lastVersionNumber = lastVersionNumber;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of version records to return per page. (optional)
     * @return ListSyntheticsTestVersionsOptionalParameters
     */
    public ListSyntheticsTestVersionsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Get version history of a test.
   *
   * <p>See {@link #listSyntheticsTestVersionsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return SyntheticsTestVersionHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestVersionHistoryResponse listSyntheticsTestVersions(String publicId)
      throws ApiException {
    return listSyntheticsTestVersionsWithHttpInfo(
            publicId, new ListSyntheticsTestVersionsOptionalParameters())
        .getData();
  }

  /**
   * Get version history of a test.
   *
   * <p>See {@link #listSyntheticsTestVersionsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @return CompletableFuture&lt;SyntheticsTestVersionHistoryResponse&gt;
   */
  public CompletableFuture<SyntheticsTestVersionHistoryResponse> listSyntheticsTestVersionsAsync(
      String publicId) {
    return listSyntheticsTestVersionsWithHttpInfoAsync(
            publicId, new ListSyntheticsTestVersionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get version history of a test.
   *
   * <p>See {@link #listSyntheticsTestVersionsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsTestVersionHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestVersionHistoryResponse listSyntheticsTestVersions(
      String publicId, ListSyntheticsTestVersionsOptionalParameters parameters)
      throws ApiException {
    return listSyntheticsTestVersionsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get version history of a test.
   *
   * <p>See {@link #listSyntheticsTestVersionsWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsTestVersionHistoryResponse&gt;
   */
  public CompletableFuture<SyntheticsTestVersionHistoryResponse> listSyntheticsTestVersionsAsync(
      String publicId, ListSyntheticsTestVersionsOptionalParameters parameters) {
    return listSyntheticsTestVersionsWithHttpInfoAsync(publicId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the paginated version history for a Synthetic test.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsTestVersionHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestVersionHistoryResponse> listSyntheticsTestVersionsWithHttpInfo(
      String publicId, ListSyntheticsTestVersionsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling listSyntheticsTestVersions");
    }
    Long lastVersionNumber = parameters.lastVersionNumber;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/version_history"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "last_version_number", lastVersionNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.listSyntheticsTestVersions",
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
        new GenericType<SyntheticsTestVersionHistoryResponse>() {});
  }

  /**
   * Get version history of a test.
   *
   * <p>See {@link #listSyntheticsTestVersionsWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestVersionHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestVersionHistoryResponse>>
      listSyntheticsTestVersionsWithHttpInfoAsync(
          String publicId, ListSyntheticsTestVersionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestVersionHistoryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling listSyntheticsTestVersions"));
      return result;
    }
    Long lastVersionNumber = parameters.lastVersionNumber;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/tests/{public_id}/version_history"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "last_version_number", lastVersionNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.listSyntheticsTestVersions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestVersionHistoryResponse>> result =
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
        new GenericType<SyntheticsTestVersionHistoryResponse>() {});
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

  /**
   * Patch a test suite.
   *
   * <p>See {@link #patchTestSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test suite to patch. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return SyntheticsSuiteResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsSuiteResponse patchTestSuite(String publicId, SuiteJsonPatchRequest body)
      throws ApiException {
    return patchTestSuiteWithHttpInfo(publicId, body).getData();
  }

  /**
   * Patch a test suite.
   *
   * <p>See {@link #patchTestSuiteWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test suite to patch. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;SyntheticsSuiteResponse&gt;
   */
  public CompletableFuture<SyntheticsSuiteResponse> patchTestSuiteAsync(
      String publicId, SuiteJsonPatchRequest body) {
    return patchTestSuiteWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Patch a Synthetic test suite using JSON Patch (RFC 6902). Use partial updates to modify only
   * specific fields of a test suite.
   *
   * <p>Common operations include: - Replace field values: <code>
   * {"op": "replace", "path": "/name", "value": "new_name"}</code> - Add/update tags: <code>
   * {"op": "add", "path": "/tags/-", "value": "new_tag"}</code> - Remove fields: <code>
   * {"op": "remove", "path": "/message"}</code>
   *
   * @param publicId The public ID of the Synthetic test suite to patch. (required)
   * @param body JSON Patch document with operations to apply. (required)
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
  public ApiResponse<SyntheticsSuiteResponse> patchTestSuiteWithHttpInfo(
      String publicId, SuiteJsonPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling patchTestSuite");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchTestSuite");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}/jsonpatch"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.patchTestSuite",
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
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Patch a test suite.
   *
   * <p>See {@link #patchTestSuiteWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test suite to patch. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsSuiteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> patchTestSuiteWithHttpInfoAsync(
      String publicId, SuiteJsonPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling patchTestSuite"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsSuiteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchTestSuite"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/suites/{public_id}/jsonpatch"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.patchTestSuite",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsSuiteResponse>() {});
  }

  /**
   * Poll for test results.
   *
   * <p>See {@link #pollSyntheticsTestResultsWithHttpInfo}.
   *
   * @param resultIds A JSON-encoded array of result IDs to poll for. (required)
   * @return SyntheticsPollTestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsPollTestResultsResponse pollSyntheticsTestResults(String resultIds)
      throws ApiException {
    return pollSyntheticsTestResultsWithHttpInfo(resultIds).getData();
  }

  /**
   * Poll for test results.
   *
   * <p>See {@link #pollSyntheticsTestResultsWithHttpInfoAsync}.
   *
   * @param resultIds A JSON-encoded array of result IDs to poll for. (required)
   * @return CompletableFuture&lt;SyntheticsPollTestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsPollTestResultsResponse> pollSyntheticsTestResultsAsync(
      String resultIds) {
    return pollSyntheticsTestResultsWithHttpInfoAsync(resultIds)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Poll for test results given a list of result IDs. This is typically used after triggering tests
   * with CI/CD to retrieve results once they are available.
   *
   * @param resultIds A JSON-encoded array of result IDs to poll for. (required)
   * @return ApiResponse&lt;SyntheticsPollTestResultsResponse&gt;
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
  public ApiResponse<SyntheticsPollTestResultsResponse> pollSyntheticsTestResultsWithHttpInfo(
      String resultIds) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resultIds' is set
    if (resultIds == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resultIds' when calling pollSyntheticsTestResults");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/poll_results";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "result_ids", resultIds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.pollSyntheticsTestResults",
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
        new GenericType<SyntheticsPollTestResultsResponse>() {});
  }

  /**
   * Poll for test results.
   *
   * <p>See {@link #pollSyntheticsTestResultsWithHttpInfo}.
   *
   * @param resultIds A JSON-encoded array of result IDs to poll for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPollTestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPollTestResultsResponse>>
      pollSyntheticsTestResultsWithHttpInfoAsync(String resultIds) {
    Object localVarPostBody = null;

    // verify the required parameter 'resultIds' is set
    if (resultIds == null) {
      CompletableFuture<ApiResponse<SyntheticsPollTestResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resultIds' when calling pollSyntheticsTestResults"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/tests/poll_results";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "result_ids", resultIds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.pollSyntheticsTestResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPollTestResultsResponse>> result =
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
        new GenericType<SyntheticsPollTestResultsResponse>() {});
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
