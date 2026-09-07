
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
import com.datadog.api.client.v2.model.CIAppGitHubAccountsResponse;
import com.datadog.api.client.v2.model.CIAppGitHubAccountResponse;
import com.datadog.api.client.v2.model.CIAppGitHubAccountUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CiVisibilityGitHubAccountsApi {
  private ApiClient apiClient;
  public CiVisibilityGitHubAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CiVisibilityGitHubAccountsApi(ApiClient apiClient) {
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
 * List GitHub CI Visibility status.
 *
 * See {@link #listCIAppGitHubAccountsWithHttpInfo}.
 *
 * @return CIAppGitHubAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppGitHubAccountsResponse  listCIAppGitHubAccounts() throws ApiException {
    return listCIAppGitHubAccountsWithHttpInfo().getData();
  }

  /**
 * List GitHub CI Visibility status.
 *
 * See {@link #listCIAppGitHubAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CIAppGitHubAccountsResponse&gt;
 */
  public CompletableFuture<CIAppGitHubAccountsResponse>listCIAppGitHubAccountsAsync() {
    return listCIAppGitHubAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve the list of GitHub accounts (organizations or users) available to this Datadog organization
   * through its GitHub App installation, along with each account's and repository's CI Visibility opt-in status.</p>
   *
   * @return ApiResponse&lt;CIAppGitHubAccountsResponse&gt;
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
   *     </table>
   */
  public ApiResponse<CIAppGitHubAccountsResponse> listCIAppGitHubAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/ci/github/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CiVisibilityGitHubAccountsApi.listCIAppGitHubAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppGitHubAccountsResponse>() {});
  }

  /**
   * List GitHub CI Visibility status.
   *
   * See {@link #listCIAppGitHubAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppGitHubAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppGitHubAccountsResponse>> listCIAppGitHubAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/ci/github/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CiVisibilityGitHubAccountsApi.listCIAppGitHubAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppGitHubAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppGitHubAccountsResponse>() {});
  }

  /**
 * Update GitHub CI Visibility status.
 *
 * See {@link #updateCIAppGitHubAccountWithHttpInfo}.
 *
 * @param body  (required)
 * @return CIAppGitHubAccountResponse
 * @throws ApiException if fails to make API call
 */
  public CIAppGitHubAccountResponse  updateCIAppGitHubAccount(CIAppGitHubAccountUpdateRequest body) throws ApiException {
    return updateCIAppGitHubAccountWithHttpInfo(body).getData();
  }

  /**
 * Update GitHub CI Visibility status.
 *
 * See {@link #updateCIAppGitHubAccountWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CIAppGitHubAccountResponse&gt;
 */
  public CompletableFuture<CIAppGitHubAccountResponse>updateCIAppGitHubAccountAsync(CIAppGitHubAccountUpdateRequest body) {
    return updateCIAppGitHubAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Enable or disable CI Visibility for a GitHub account, one of its repositories, or both in the same request.
   * The account (and, optionally, repository) are identified by name. Account-level and repository-level
   * changes are independent and may both be supplied in the same request. At least one of <code>enabled</code> or
   * <code>repository.enabled</code> must be provided. If the account name matches installations on more than one host,
   * <code>host</code> must be supplied to disambiguate, otherwise a 409 is returned. Returns a 404 if the CI Visibility
   * GitHub integration is not enabled for this organization, or if the given account or repository cannot be
   * found by name.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CIAppGitHubAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CIAppGitHubAccountResponse> updateCIAppGitHubAccountWithHttpInfo(CIAppGitHubAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCIAppGitHubAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/github/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CiVisibilityGitHubAccountsApi.updateCIAppGitHubAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppGitHubAccountResponse>() {});
  }

  /**
   * Update GitHub CI Visibility status.
   *
   * See {@link #updateCIAppGitHubAccountWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CIAppGitHubAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CIAppGitHubAccountResponse>> updateCIAppGitHubAccountWithHttpInfoAsync(CIAppGitHubAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CIAppGitHubAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCIAppGitHubAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ci/github/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CiVisibilityGitHubAccountsApi.updateCIAppGitHubAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CIAppGitHubAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CIAppGitHubAccountResponse>() {});
  }
}