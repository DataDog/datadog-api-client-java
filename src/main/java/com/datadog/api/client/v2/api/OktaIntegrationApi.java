
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
import com.datadog.api.client.v2.model.OktaAccountsResponse;
import com.datadog.api.client.v2.model.OktaAccountResponse;
import com.datadog.api.client.v2.model.OktaAccountRequest;
import com.datadog.api.client.v2.model.OktaAccountUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OktaIntegrationApi {
  private ApiClient apiClient;
  public OktaIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OktaIntegrationApi(ApiClient apiClient) {
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
 * Add Okta account.
 *
 * See {@link #createOktaAccountWithHttpInfo}.
 *
 * @param body  (required)
 * @return OktaAccountResponse
 * @throws ApiException if fails to make API call
 */
  public OktaAccountResponse  createOktaAccount(OktaAccountRequest body) throws ApiException {
    return createOktaAccountWithHttpInfo(body).getData();
  }

  /**
 * Add Okta account.
 *
 * See {@link #createOktaAccountWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;OktaAccountResponse&gt;
 */
  public CompletableFuture<OktaAccountResponse>createOktaAccountAsync(OktaAccountRequest body) {
    return createOktaAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create an Okta account.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;OktaAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OktaAccountResponse> createOktaAccountWithHttpInfo(OktaAccountRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOktaAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OktaIntegrationApi.createOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }

  /**
   * Add Okta account.
   *
   * See {@link #createOktaAccountWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OktaAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OktaAccountResponse>> createOktaAccountWithHttpInfoAsync(OktaAccountRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createOktaAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OktaIntegrationApi.createOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }

  /**
 * Delete Okta account.
 *
 * See {@link #deleteOktaAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteOktaAccount(String accountId) throws ApiException {
    deleteOktaAccountWithHttpInfo(accountId);
  }

  /**
 * Delete Okta account.
 *
 * See {@link #deleteOktaAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteOktaAccountAsync(String accountId) {
    return deleteOktaAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an Okta account.</p>
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
  public ApiResponse<Void> deleteOktaAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteOktaAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OktaIntegrationApi.deleteOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Okta account.
   *
   * See {@link #deleteOktaAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOktaAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteOktaAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OktaIntegrationApi.deleteOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Okta account.
 *
 * See {@link #getOktaAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @return OktaAccountResponse
 * @throws ApiException if fails to make API call
 */
  public OktaAccountResponse  getOktaAccount(String accountId) throws ApiException {
    return getOktaAccountWithHttpInfo(accountId).getData();
  }

  /**
 * Get Okta account.
 *
 * See {@link #getOktaAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @return CompletableFuture&lt;OktaAccountResponse&gt;
 */
  public CompletableFuture<OktaAccountResponse>getOktaAccountAsync(String accountId) {
    return getOktaAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an Okta account.</p>
   *
   * @param accountId None (required)
   * @return ApiResponse&lt;OktaAccountResponse&gt;
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
  public ApiResponse<OktaAccountResponse> getOktaAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getOktaAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OktaIntegrationApi.getOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }

  /**
   * Get Okta account.
   *
   * See {@link #getOktaAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OktaAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OktaAccountResponse>> getOktaAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getOktaAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OktaIntegrationApi.getOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }

  /**
 * List Okta accounts.
 *
 * See {@link #listOktaAccountsWithHttpInfo}.
 *
 * @return OktaAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public OktaAccountsResponse  listOktaAccounts() throws ApiException {
    return listOktaAccountsWithHttpInfo().getData();
  }

  /**
 * List Okta accounts.
 *
 * See {@link #listOktaAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;OktaAccountsResponse&gt;
 */
  public CompletableFuture<OktaAccountsResponse>listOktaAccountsAsync() {
    return listOktaAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Okta accounts.</p>
   *
   * @return ApiResponse&lt;OktaAccountsResponse&gt;
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
  public ApiResponse<OktaAccountsResponse> listOktaAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OktaIntegrationApi.listOktaAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountsResponse>() {});
  }

  /**
   * List Okta accounts.
   *
   * See {@link #listOktaAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OktaAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OktaAccountsResponse>> listOktaAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OktaIntegrationApi.listOktaAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OktaAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountsResponse>() {});
  }

  /**
 * Update Okta account.
 *
 * See {@link #updateOktaAccountWithHttpInfo}.
 *
 * @param accountId None (required)
 * @param body  (required)
 * @return OktaAccountResponse
 * @throws ApiException if fails to make API call
 */
  public OktaAccountResponse  updateOktaAccount(String accountId, OktaAccountUpdateRequest body) throws ApiException {
    return updateOktaAccountWithHttpInfo(accountId, body).getData();
  }

  /**
 * Update Okta account.
 *
 * See {@link #updateOktaAccountWithHttpInfoAsync}.
 *
 * @param accountId None (required)
 * @param body  (required)
 * @return CompletableFuture&lt;OktaAccountResponse&gt;
 */
  public CompletableFuture<OktaAccountResponse>updateOktaAccountAsync(String accountId, OktaAccountUpdateRequest body) {
    return updateOktaAccountWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an Okta account.</p>
   *
   * @param accountId None (required)
   * @param body  (required)
   * @return ApiResponse&lt;OktaAccountResponse&gt;
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
  public ApiResponse<OktaAccountResponse> updateOktaAccountWithHttpInfo(String accountId, OktaAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateOktaAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOktaAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.OktaIntegrationApi.updateOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }

  /**
   * Update Okta account.
   *
   * See {@link #updateOktaAccountWithHttpInfo}.
   *
   * @param accountId None (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OktaAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OktaAccountResponse>> updateOktaAccountWithHttpInfoAsync(String accountId, OktaAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateOktaAccount"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateOktaAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/okta/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.OktaIntegrationApi.updateOktaAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OktaAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<OktaAccountResponse>() {});
  }
}