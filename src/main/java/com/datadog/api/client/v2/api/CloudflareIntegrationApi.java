
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
import com.datadog.api.client.v2.model.CloudflareAccountsResponse;
import com.datadog.api.client.v2.model.CloudflareAccountResponse;
import com.datadog.api.client.v2.model.CloudflareAccountCreateRequest;
import com.datadog.api.client.v2.model.CloudflareAccountUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareIntegrationApi {
  private ApiClient apiClient;
  public CloudflareIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudflareIntegrationApi(ApiClient apiClient) {
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
 * Add Cloudflare account.
 *
 * See {@link #createCloudflareAccountWithHttpInfo}.
 *
 * @param body  (required)
 * @return CloudflareAccountResponse
 * @throws ApiException if fails to make API call
 */
  public CloudflareAccountResponse  createCloudflareAccount(CloudflareAccountCreateRequest body) throws ApiException {
    return createCloudflareAccountWithHttpInfo(body).getData();
  }

  /**
 * Add Cloudflare account.
 *
 * See {@link #createCloudflareAccountWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CloudflareAccountResponse&gt;
 */
  public CompletableFuture<CloudflareAccountResponse>createCloudflareAccountAsync(CloudflareAccountCreateRequest body) {
    return createCloudflareAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Cloudflare account.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CloudflareAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudflareAccountResponse> createCloudflareAccountWithHttpInfo(CloudflareAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCloudflareAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.createCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }

  /**
   * Add Cloudflare account.
   *
   * See {@link #createCloudflareAccountWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudflareAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudflareAccountResponse>> createCloudflareAccountWithHttpInfoAsync(CloudflareAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCloudflareAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.createCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }

  /**
 * Delete Cloudflare account.
 *
 * See {@link #deleteCloudflareAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCloudflareAccount(String accountId) throws ApiException {
    deleteCloudflareAccountWithHttpInfo(accountId);
  }

  /**
 * Delete Cloudflare account.
 *
 * See {@link #deleteCloudflareAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCloudflareAccountAsync(String accountId) {
    return deleteCloudflareAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Cloudflare account.</p>
   *
   * @param accountId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCloudflareAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCloudflareAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.deleteCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Cloudflare account.
   *
   * See {@link #deleteCloudflareAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCloudflareAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCloudflareAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.deleteCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Cloudflare account.
 *
 * See {@link #getCloudflareAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @return CloudflareAccountResponse
 * @throws ApiException if fails to make API call
 */
  public CloudflareAccountResponse  getCloudflareAccount(String accountId) throws ApiException {
    return getCloudflareAccountWithHttpInfo(accountId).getData();
  }

  /**
 * Get Cloudflare account.
 *
 * See {@link #getCloudflareAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @return CompletableFuture&lt;CloudflareAccountResponse&gt;
 */
  public CompletableFuture<CloudflareAccountResponse>getCloudflareAccountAsync(String accountId) {
    return getCloudflareAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Cloudflare account.</p>
   *
   * @param accountId None (required)
   * @return ApiResponse&lt;CloudflareAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudflareAccountResponse> getCloudflareAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCloudflareAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.getCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }

  /**
   * Get Cloudflare account.
   *
   * See {@link #getCloudflareAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudflareAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudflareAccountResponse>> getCloudflareAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getCloudflareAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.getCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }

  /**
 * List Cloudflare accounts.
 *
 * See {@link #listCloudflareAccountsWithHttpInfo}.
 *
 * @return CloudflareAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public CloudflareAccountsResponse  listCloudflareAccounts() throws ApiException {
    return listCloudflareAccountsWithHttpInfo().getData();
  }

  /**
 * List Cloudflare accounts.
 *
 * See {@link #listCloudflareAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CloudflareAccountsResponse&gt;
 */
  public CompletableFuture<CloudflareAccountsResponse>listCloudflareAccountsAsync() {
    return listCloudflareAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Cloudflare accounts.</p>
   *
   * @return ApiResponse&lt;CloudflareAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudflareAccountsResponse> listCloudflareAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.listCloudflareAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountsResponse>() {});
  }

  /**
   * List Cloudflare accounts.
   *
   * See {@link #listCloudflareAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CloudflareAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudflareAccountsResponse>> listCloudflareAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.listCloudflareAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudflareAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountsResponse>() {});
  }

  /**
 * Update Cloudflare account.
 *
 * See {@link #updateCloudflareAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @param body  (required)
 * @return CloudflareAccountResponse
 * @throws ApiException if fails to make API call
 */
  public CloudflareAccountResponse  updateCloudflareAccount(String accountId, CloudflareAccountUpdateRequest body) throws ApiException {
    return updateCloudflareAccountWithHttpInfo(accountId, body).getData();
  }

  /**
 * Update Cloudflare account.
 *
 * See {@link #updateCloudflareAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @param body  (required)
 * @return CompletableFuture&lt;CloudflareAccountResponse&gt;
 */
  public CompletableFuture<CloudflareAccountResponse>updateCloudflareAccountAsync(String accountId, CloudflareAccountUpdateRequest body) {
    return updateCloudflareAccountWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Cloudflare account.</p>
   *
   * @param accountId None (required)
   * @param body  (required)
   * @return ApiResponse&lt;CloudflareAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudflareAccountResponse> updateCloudflareAccountWithHttpInfo(String accountId, CloudflareAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCloudflareAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCloudflareAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.updateCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }

  /**
   * Update Cloudflare account.
   *
   * See {@link #updateCloudflareAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CloudflareAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudflareAccountResponse>> updateCloudflareAccountWithHttpInfoAsync(String accountId, CloudflareAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateCloudflareAccount"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateCloudflareAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/cloudflare/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CloudflareIntegrationApi.updateCloudflareAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudflareAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CloudflareAccountResponse>() {});
  }
}