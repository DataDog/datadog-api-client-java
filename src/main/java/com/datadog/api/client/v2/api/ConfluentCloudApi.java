
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
import com.datadog.api.client.v2.model.ConfluentAccountsResponse;
import com.datadog.api.client.v2.model.ConfluentAccountResponse;
import com.datadog.api.client.v2.model.ConfluentAccountCreateRequest;
import com.datadog.api.client.v2.model.ConfluentAccountUpdateRequest;
import com.datadog.api.client.v2.model.ConfluentResourcesResponse;
import com.datadog.api.client.v2.model.ConfluentResourceResponse;
import com.datadog.api.client.v2.model.ConfluentResourceRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentCloudApi {
  private ApiClient apiClient;
  public ConfluentCloudApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ConfluentCloudApi(ApiClient apiClient) {
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
 * Add Confluent account.
 *
 * See {@link #createConfluentAccountWithHttpInfo}.
 *
 * @param body Confluent payload (required)
 * @return ConfluentAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentAccountResponse  createConfluentAccount(ConfluentAccountCreateRequest body) throws ApiException {
    return createConfluentAccountWithHttpInfo(body).getData();
  }

  /**
 * Add Confluent account.
 *
 * See {@link #createConfluentAccountWithHttpInfoAsync}.
 *
 * @param body Confluent payload (required)
 * @return CompletableFuture&lt;ConfluentAccountResponse&gt;
 */
  public CompletableFuture<ConfluentAccountResponse>createConfluentAccountAsync(ConfluentAccountCreateRequest body) {
    return createConfluentAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Confluent account.</p>
   *
   * @param body Confluent payload (required)
   * @return ApiResponse&lt;ConfluentAccountResponse&gt;
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
  public ApiResponse<ConfluentAccountResponse> createConfluentAccountWithHttpInfo(ConfluentAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createConfluentAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.createConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
   * Add Confluent account.
   *
   * See {@link #createConfluentAccountWithHttpInfo}.
   *
   * @param body Confluent payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentAccountResponse>> createConfluentAccountWithHttpInfoAsync(ConfluentAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createConfluentAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.createConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
 * Add resource to Confluent account.
 *
 * See {@link #createConfluentResourceWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param body Confluent payload (required)
 * @return ConfluentResourceResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentResourceResponse  createConfluentResource(String accountId, ConfluentResourceRequest body) throws ApiException {
    return createConfluentResourceWithHttpInfo(accountId, body).getData();
  }

  /**
 * Add resource to Confluent account.
 *
 * See {@link #createConfluentResourceWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param body Confluent payload (required)
 * @return CompletableFuture&lt;ConfluentResourceResponse&gt;
 */
  public CompletableFuture<ConfluentResourceResponse>createConfluentResourceAsync(String accountId, ConfluentResourceRequest body) {
    return createConfluentResourceWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Confluent resource for the account associated with the provided ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @param body Confluent payload (required)
   * @return ApiResponse&lt;ConfluentResourceResponse&gt;
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
  public ApiResponse<ConfluentResourceResponse> createConfluentResourceWithHttpInfo(String accountId, ConfluentResourceRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConfluentResource");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createConfluentResource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.createConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }

  /**
   * Add resource to Confluent account.
   *
   * See {@link #createConfluentResourceWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @param body Confluent payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentResourceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentResourceResponse>> createConfluentResourceWithHttpInfoAsync(String accountId, ConfluentResourceRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling createConfluentResource"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createConfluentResource"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.createConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }

  /**
 * Delete Confluent account.
 *
 * See {@link #deleteConfluentAccountWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteConfluentAccount(String accountId) throws ApiException {
    deleteConfluentAccountWithHttpInfo(accountId);
  }

  /**
 * Delete Confluent account.
 *
 * See {@link #deleteConfluentAccountWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteConfluentAccountAsync(String accountId) {
    return deleteConfluentAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Confluent account with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
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
  public ApiResponse<Void> deleteConfluentAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteConfluentAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.deleteConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Confluent account.
   *
   * See {@link #deleteConfluentAccountWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteConfluentAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteConfluentAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.deleteConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete resource from Confluent account.
 *
 * See {@link #deleteConfluentResourceWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteConfluentResource(String accountId, String resourceId) throws ApiException {
    deleteConfluentResourceWithHttpInfo(accountId, resourceId);
  }

  /**
 * Delete resource from Confluent account.
 *
 * See {@link #deleteConfluentResourceWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteConfluentResourceAsync(String accountId, String resourceId) {
    return deleteConfluentResourceWithHttpInfoAsync(accountId, resourceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Confluent resource with the provided resource id for the account associated with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
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
  public ApiResponse<Void> deleteConfluentResourceWithHttpInfo(String accountId, String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteConfluentResource");
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling deleteConfluentResource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.deleteConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete resource from Confluent account.
   *
   * See {@link #deleteConfluentResourceWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteConfluentResourceWithHttpInfoAsync(String accountId, String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteConfluentResource"));
        return result;
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling deleteConfluentResource"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.deleteConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Confluent account.
 *
 * See {@link #getConfluentAccountWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @return ConfluentAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentAccountResponse  getConfluentAccount(String accountId) throws ApiException {
    return getConfluentAccountWithHttpInfo(accountId).getData();
  }

  /**
 * Get Confluent account.
 *
 * See {@link #getConfluentAccountWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @return CompletableFuture&lt;ConfluentAccountResponse&gt;
 */
  public CompletableFuture<ConfluentAccountResponse>getConfluentAccountAsync(String accountId) {
    return getConfluentAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the Confluent account with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @return ApiResponse&lt;ConfluentAccountResponse&gt;
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
  public ApiResponse<ConfluentAccountResponse> getConfluentAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConfluentAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.getConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
   * Get Confluent account.
   *
   * See {@link #getConfluentAccountWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentAccountResponse>> getConfluentAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getConfluentAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.getConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
 * Get resource from Confluent account.
 *
 * See {@link #getConfluentResourceWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @return ConfluentResourceResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentResourceResponse  getConfluentResource(String accountId, String resourceId) throws ApiException {
    return getConfluentResourceWithHttpInfo(accountId, resourceId).getData();
  }

  /**
 * Get resource from Confluent account.
 *
 * See {@link #getConfluentResourceWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @return CompletableFuture&lt;ConfluentResourceResponse&gt;
 */
  public CompletableFuture<ConfluentResourceResponse>getConfluentResourceAsync(String accountId, String resourceId) {
    return getConfluentResourceWithHttpInfoAsync(accountId, resourceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Confluent resource with the provided resource id for the account associated with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
   * @return ApiResponse&lt;ConfluentResourceResponse&gt;
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
  public ApiResponse<ConfluentResourceResponse> getConfluentResourceWithHttpInfo(String accountId, String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConfluentResource");
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling getConfluentResource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.getConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }

  /**
   * Get resource from Confluent account.
   *
   * See {@link #getConfluentResourceWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentResourceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentResourceResponse>> getConfluentResourceWithHttpInfoAsync(String accountId, String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getConfluentResource"));
        return result;
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling getConfluentResource"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.getConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }

  /**
 * List Confluent accounts.
 *
 * See {@link #listConfluentAccountWithHttpInfo}.
 *
 * @return ConfluentAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentAccountsResponse  listConfluentAccount() throws ApiException {
    return listConfluentAccountWithHttpInfo().getData();
  }

  /**
 * List Confluent accounts.
 *
 * See {@link #listConfluentAccountWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ConfluentAccountsResponse&gt;
 */
  public CompletableFuture<ConfluentAccountsResponse>listConfluentAccountAsync() {
    return listConfluentAccountWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Confluent accounts.</p>
   *
   * @return ApiResponse&lt;ConfluentAccountsResponse&gt;
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
  public ApiResponse<ConfluentAccountsResponse> listConfluentAccountWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.listConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountsResponse>() {});
  }

  /**
   * List Confluent accounts.
   *
   * See {@link #listConfluentAccountWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentAccountsResponse>> listConfluentAccountWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.listConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountsResponse>() {});
  }

  /**
 * List Confluent Account resources.
 *
 * See {@link #listConfluentResourceWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @return ConfluentResourcesResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentResourcesResponse  listConfluentResource(String accountId) throws ApiException {
    return listConfluentResourceWithHttpInfo(accountId).getData();
  }

  /**
 * List Confluent Account resources.
 *
 * See {@link #listConfluentResourceWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @return CompletableFuture&lt;ConfluentResourcesResponse&gt;
 */
  public CompletableFuture<ConfluentResourcesResponse>listConfluentResourceAsync(String accountId) {
    return listConfluentResourceWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Confluent resource for the account associated with the provided ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @return ApiResponse&lt;ConfluentResourcesResponse&gt;
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
  public ApiResponse<ConfluentResourcesResponse> listConfluentResourceWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listConfluentResource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.listConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourcesResponse>() {});
  }

  /**
   * List Confluent Account resources.
   *
   * See {@link #listConfluentResourceWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentResourcesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentResourcesResponse>> listConfluentResourceWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentResourcesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling listConfluentResource"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.listConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentResourcesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourcesResponse>() {});
  }

  /**
 * Update Confluent account.
 *
 * See {@link #updateConfluentAccountWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param body Confluent payload (required)
 * @return ConfluentAccountResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentAccountResponse  updateConfluentAccount(String accountId, ConfluentAccountUpdateRequest body) throws ApiException {
    return updateConfluentAccountWithHttpInfo(accountId, body).getData();
  }

  /**
 * Update Confluent account.
 *
 * See {@link #updateConfluentAccountWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param body Confluent payload (required)
 * @return CompletableFuture&lt;ConfluentAccountResponse&gt;
 */
  public CompletableFuture<ConfluentAccountResponse>updateConfluentAccountAsync(String accountId, ConfluentAccountUpdateRequest body) {
    return updateConfluentAccountWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update the Confluent account with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @param body Confluent payload (required)
   * @return ApiResponse&lt;ConfluentAccountResponse&gt;
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
  public ApiResponse<ConfluentAccountResponse> updateConfluentAccountWithHttpInfo(String accountId, ConfluentAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateConfluentAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateConfluentAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.updateConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
   * Update Confluent account.
   *
   * See {@link #updateConfluentAccountWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @param body Confluent payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentAccountResponse>> updateConfluentAccountWithHttpInfoAsync(String accountId, ConfluentAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateConfluentAccount"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateConfluentAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.updateConfluentAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentAccountResponse>() {});
  }

  /**
 * Update resource in Confluent account.
 *
 * See {@link #updateConfluentResourceWithHttpInfo}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @param body Confluent payload (required)
 * @return ConfluentResourceResponse
 * @throws ApiException if fails to make API call
 */
  public ConfluentResourceResponse  updateConfluentResource(String accountId, String resourceId, ConfluentResourceRequest body) throws ApiException {
    return updateConfluentResourceWithHttpInfo(accountId, resourceId, body).getData();
  }

  /**
 * Update resource in Confluent account.
 *
 * See {@link #updateConfluentResourceWithHttpInfoAsync}.
 *
 * @param accountId Confluent Account ID. (required)
 * @param resourceId Confluent Account Resource ID. (required)
 * @param body Confluent payload (required)
 * @return CompletableFuture&lt;ConfluentResourceResponse&gt;
 */
  public CompletableFuture<ConfluentResourceResponse>updateConfluentResourceAsync(String accountId, String resourceId, ConfluentResourceRequest body) {
    return updateConfluentResourceWithHttpInfoAsync(accountId, resourceId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Confluent resource with the provided resource id for the account associated with the provided account ID.</p>
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
   * @param body Confluent payload (required)
   * @return ApiResponse&lt;ConfluentResourceResponse&gt;
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
  public ApiResponse<ConfluentResourceResponse> updateConfluentResourceWithHttpInfo(String accountId, String resourceId, ConfluentResourceRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateConfluentResource");
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceId' when calling updateConfluentResource");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateConfluentResource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ConfluentCloudApi.updateConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }

  /**
   * Update resource in Confluent account.
   *
   * See {@link #updateConfluentResourceWithHttpInfo}.
   *
   * @param accountId Confluent Account ID. (required)
   * @param resourceId Confluent Account Resource ID. (required)
   * @param body Confluent payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ConfluentResourceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ConfluentResourceResponse>> updateConfluentResourceWithHttpInfoAsync(String accountId, String resourceId, ConfluentResourceRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateConfluentResource"));
        return result;
    }

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resourceId' when calling updateConfluentResource"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateConfluentResource"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/confluent-cloud/accounts/{account_id}/resources/{resource_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ConfluentCloudApi.updateConfluentResource", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ConfluentResourceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ConfluentResourceResponse>() {});
  }
}