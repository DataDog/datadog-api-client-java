
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
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountsResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationAccountsApi {
  private ApiClient apiClient;
  public ElasticCloudIntegrationAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ElasticCloudIntegrationAccountsApi(ApiClient apiClient) {
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
 * Create an Elastic Cloud integration account.
 *
 * See {@link #createElasticCloudIntegrationAccountWithHttpInfo}.
 *
 * @param body  (required)
 * @return ElasticCloudIntegrationAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ElasticCloudIntegrationAccountResponse  createElasticCloudIntegrationAccount(ElasticCloudIntegrationAccountCreateRequest body) throws ApiException {
    return createElasticCloudIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
 * Create an Elastic Cloud integration account.
 *
 * See {@link #createElasticCloudIntegrationAccountWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
 */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>createElasticCloudIntegrationAccountAsync(ElasticCloudIntegrationAccountCreateRequest body) {
    return createElasticCloudIntegrationAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create an Elastic Cloud integration account.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ElasticCloudIntegrationAccountResponse> createElasticCloudIntegrationAccountWithHttpInfo(ElasticCloudIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.createElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Create an Elastic Cloud integration account.
   *
   * See {@link #createElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> createElasticCloudIntegrationAccountWithHttpInfoAsync(ElasticCloudIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createElasticCloudIntegrationAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.createElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
 * Delete an Elastic Cloud integration account.
 *
 * See {@link #deleteElasticCloudIntegrationAccountWithHttpInfo}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteElasticCloudIntegrationAccount(String accountId) throws ApiException {
    deleteElasticCloudIntegrationAccountWithHttpInfo(accountId);
  }

  /**
 * Delete an Elastic Cloud integration account.
 *
 * See {@link #deleteElasticCloudIntegrationAccountWithHttpInfoAsync}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteElasticCloudIntegrationAccountAsync(String accountId) {
    return deleteElasticCloudIntegrationAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an Elastic Cloud integration account.</p>
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> deleteElasticCloudIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.deleteElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an Elastic Cloud integration account.
   *
   * See {@link #deleteElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteElasticCloudIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteElasticCloudIntegrationAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.deleteElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an Elastic Cloud integration account.
 *
 * See {@link #getElasticCloudIntegrationAccountWithHttpInfo}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @return ElasticCloudIntegrationAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ElasticCloudIntegrationAccountResponse  getElasticCloudIntegrationAccount(String accountId) throws ApiException {
    return getElasticCloudIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
 * Get an Elastic Cloud integration account.
 *
 * See {@link #getElasticCloudIntegrationAccountWithHttpInfoAsync}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
 */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>getElasticCloudIntegrationAccountAsync(String accountId) {
    return getElasticCloudIntegrationAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an Elastic Cloud integration account.</p>
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountResponse> getElasticCloudIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.getElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Get an Elastic Cloud integration account.
   *
   * See {@link #getElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> getElasticCloudIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getElasticCloudIntegrationAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.getElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
 * List Elastic Cloud integration accounts.
 *
 * See {@link #listElasticCloudIntegrationAccountsWithHttpInfo}.
 *
 * @return ElasticCloudIntegrationAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public ElasticCloudIntegrationAccountsResponse  listElasticCloudIntegrationAccounts() throws ApiException {
    return listElasticCloudIntegrationAccountsWithHttpInfo().getData();
  }

  /**
 * List Elastic Cloud integration accounts.
 *
 * See {@link #listElasticCloudIntegrationAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ElasticCloudIntegrationAccountsResponse&gt;
 */
  public CompletableFuture<ElasticCloudIntegrationAccountsResponse>listElasticCloudIntegrationAccountsAsync() {
    return listElasticCloudIntegrationAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Elastic Cloud integration accounts.</p>
   *
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountsResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountsResponse> listElasticCloudIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.listElasticCloudIntegrationAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountsResponse>() {});
  }

  /**
   * List Elastic Cloud integration accounts.
   *
   * See {@link #listElasticCloudIntegrationAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> listElasticCloudIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.listElasticCloudIntegrationAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountsResponse>() {});
  }

  /**
 * Update an Elastic Cloud integration account.
 *
 * See {@link #updateElasticCloudIntegrationAccountWithHttpInfo}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @param body  (required)
 * @return ElasticCloudIntegrationAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ElasticCloudIntegrationAccountResponse  updateElasticCloudIntegrationAccount(String accountId, ElasticCloudIntegrationAccountUpdateRequest body) throws ApiException {
    return updateElasticCloudIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
 * Update an Elastic Cloud integration account.
 *
 * See {@link #updateElasticCloudIntegrationAccountWithHttpInfoAsync}.
 *
 * @param accountId Unique identifier of the integration account. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
 */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>updateElasticCloudIntegrationAccountAsync(String accountId, ElasticCloudIntegrationAccountUpdateRequest body) {
    return updateElasticCloudIntegrationAccountWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an Elastic Cloud integration account. Only the fields provided are changed.</p>
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body  (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ElasticCloudIntegrationAccountResponse> updateElasticCloudIntegrationAccountWithHttpInfo(String accountId, ElasticCloudIntegrationAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.updateElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Update an Elastic Cloud integration account.
   *
   * See {@link #updateElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> updateElasticCloudIntegrationAccountWithHttpInfoAsync(String accountId, ElasticCloudIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateElasticCloudIntegrationAccount"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateElasticCloudIntegrationAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/elastic-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ElasticCloudIntegrationAccountsApi.updateElasticCloudIntegrationAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }
}