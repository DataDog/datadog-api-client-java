
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.CoverageSummaryResponse;
import com.datadog.api.client.v2.model.BranchCoverageSummaryRequest;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CodeCoverageApi {
  private ApiClient apiClient;
  public CodeCoverageApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CodeCoverageApi(ApiClient apiClient) {
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
 * Get code coverage summary for a branch.
 *
 * See {@link #getCodeCoverageBranchSummaryWithHttpInfo}.
 *
 * @param body  (required)
 * @return CoverageSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public CoverageSummaryResponse  getCodeCoverageBranchSummary(BranchCoverageSummaryRequest body) throws ApiException {
    return getCodeCoverageBranchSummaryWithHttpInfo(body).getData();
  }

  /**
 * Get code coverage summary for a branch.
 *
 * See {@link #getCodeCoverageBranchSummaryWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CoverageSummaryResponse&gt;
 */
  public CompletableFuture<CoverageSummaryResponse>getCodeCoverageBranchSummaryAsync(BranchCoverageSummaryRequest body) {
    return getCodeCoverageBranchSummaryWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve aggregated code coverage statistics for a specific branch in a repository.
   * This endpoint provides overall coverage metrics as well as breakdowns by service
   * and code owner.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CoverageSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CoverageSummaryResponse> getCodeCoverageBranchSummaryWithHttpInfo(BranchCoverageSummaryRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCodeCoverageBranchSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getCodeCoverageBranchSummary");
    }
    // create path and map variables
    String localVarPath = "/api/v2/code-coverage/branch/summary";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CodeCoverageApi.getCodeCoverageBranchSummary", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CoverageSummaryResponse>() {});
  }

  /**
   * Get code coverage summary for a branch.
   *
   * See {@link #getCodeCoverageBranchSummaryWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CoverageSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CoverageSummaryResponse>> getCodeCoverageBranchSummaryWithHttpInfoAsync(BranchCoverageSummaryRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getCodeCoverageBranchSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling getCodeCoverageBranchSummary"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/code-coverage/branch/summary";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CodeCoverageApi.getCodeCoverageBranchSummary", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CoverageSummaryResponse>() {});
  }

  /**
 * Get code coverage summary for a commit.
 *
 * See {@link #getCodeCoverageCommitSummaryWithHttpInfo}.
 *
 * @param body  (required)
 * @return CoverageSummaryResponse
 * @throws ApiException if fails to make API call
 */
  public CoverageSummaryResponse  getCodeCoverageCommitSummary(CommitCoverageSummaryRequest body) throws ApiException {
    return getCodeCoverageCommitSummaryWithHttpInfo(body).getData();
  }

  /**
 * Get code coverage summary for a commit.
 *
 * See {@link #getCodeCoverageCommitSummaryWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CoverageSummaryResponse&gt;
 */
  public CompletableFuture<CoverageSummaryResponse>getCodeCoverageCommitSummaryAsync(CommitCoverageSummaryRequest body) {
    return getCodeCoverageCommitSummaryWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve aggregated code coverage statistics for a specific commit in a repository.
   * This endpoint provides overall coverage metrics as well as breakdowns by service
   * and code owner.</p>
   * <p>The commit SHA must be a 40-character hexadecimal string (SHA-1 hash).</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CoverageSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CoverageSummaryResponse> getCodeCoverageCommitSummaryWithHttpInfo(CommitCoverageSummaryRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCodeCoverageCommitSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getCodeCoverageCommitSummary");
    }
    // create path and map variables
    String localVarPath = "/api/v2/code-coverage/commit/summary";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CodeCoverageApi.getCodeCoverageCommitSummary", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CoverageSummaryResponse>() {});
  }

  /**
   * Get code coverage summary for a commit.
   *
   * See {@link #getCodeCoverageCommitSummaryWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CoverageSummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CoverageSummaryResponse>> getCodeCoverageCommitSummaryWithHttpInfoAsync(CommitCoverageSummaryRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getCodeCoverageCommitSummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling getCodeCoverageCommitSummary"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/code-coverage/commit/summary";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CodeCoverageApi.getCodeCoverageCommitSummary", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CoverageSummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CoverageSummaryResponse>() {});
  }
}