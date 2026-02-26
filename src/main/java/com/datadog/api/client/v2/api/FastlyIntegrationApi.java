
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
import com.datadog.api.client.v2.model.FastlyAccountsResponse;
import com.datadog.api.client.v2.model.FastlyAccountResponse;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequest;
import com.datadog.api.client.v2.model.FastlyAccountUpdateRequest;
import com.datadog.api.client.v2.model.FastlyServicesResponse;
import com.datadog.api.client.v2.model.FastlyServiceResponse;
import com.datadog.api.client.v2.model.FastlyServiceRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyIntegrationApi {
  private ApiClient apiClient;
  public FastlyIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FastlyIntegrationApi(ApiClient apiClient) {
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
 * Add Fastly account.
 *
 * See {@link #createFastlyAccountWithHttpInfo}.
 *
 * @param body  (required)
 * @return FastlyAccountResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyAccountResponse  createFastlyAccount(FastlyAccountCreateRequest body) throws ApiException {
    return createFastlyAccountWithHttpInfo(body).getData();
  }

  /**
 * Add Fastly account.
 *
 * See {@link #createFastlyAccountWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FastlyAccountResponse&gt;
 */
  public CompletableFuture<FastlyAccountResponse>createFastlyAccountAsync(FastlyAccountCreateRequest body) {
    return createFastlyAccountWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Fastly account.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FastlyAccountResponse&gt;
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
  public ApiResponse<FastlyAccountResponse> createFastlyAccountWithHttpInfo(FastlyAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFastlyAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.createFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
   * Add Fastly account.
   *
   * See {@link #createFastlyAccountWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyAccountResponse>> createFastlyAccountWithHttpInfoAsync(FastlyAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFastlyAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.createFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
 * Add Fastly service.
 *
 * See {@link #createFastlyServiceWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @param body  (required)
 * @return FastlyServiceResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyServiceResponse  createFastlyService(String accountId, FastlyServiceRequest body) throws ApiException {
    return createFastlyServiceWithHttpInfo(accountId, body).getData();
  }

  /**
 * Add Fastly service.
 *
 * See {@link #createFastlyServiceWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FastlyServiceResponse&gt;
 */
  public CompletableFuture<FastlyServiceResponse>createFastlyServiceAsync(String accountId, FastlyServiceRequest body) {
    return createFastlyServiceWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Fastly service for an account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FastlyServiceResponse&gt;
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
  public ApiResponse<FastlyServiceResponse> createFastlyServiceWithHttpInfo(String accountId, FastlyServiceRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createFastlyService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFastlyService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.createFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }

  /**
   * Add Fastly service.
   *
   * See {@link #createFastlyServiceWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyServiceResponse>> createFastlyServiceWithHttpInfoAsync(String accountId, FastlyServiceRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling createFastlyService"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFastlyService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.createFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }

  /**
 * Delete Fastly account.
 *
 * See {@link #deleteFastlyAccountWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteFastlyAccount(String accountId) throws ApiException {
    deleteFastlyAccountWithHttpInfo(accountId);
  }

  /**
 * Delete Fastly account.
 *
 * See {@link #deleteFastlyAccountWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteFastlyAccountAsync(String accountId) {
    return deleteFastlyAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Fastly account.</p>
   *
   * @param accountId Fastly Account id. (required)
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
  public ApiResponse<Void> deleteFastlyAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteFastlyAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.deleteFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Fastly account.
   *
   * See {@link #deleteFastlyAccountWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFastlyAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteFastlyAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.deleteFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete Fastly service.
 *
 * See {@link #deleteFastlyServiceWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteFastlyService(String accountId, String serviceId) throws ApiException {
    deleteFastlyServiceWithHttpInfo(accountId, serviceId);
  }

  /**
 * Delete Fastly service.
 *
 * See {@link #deleteFastlyServiceWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteFastlyServiceAsync(String accountId, String serviceId) {
    return deleteFastlyServiceWithHttpInfoAsync(accountId, serviceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Fastly service for an account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
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
  public ApiResponse<Void> deleteFastlyServiceWithHttpInfo(String accountId, String serviceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteFastlyService");
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteFastlyService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.deleteFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Fastly service.
   *
   * See {@link #deleteFastlyServiceWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFastlyServiceWithHttpInfoAsync(String accountId, String serviceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteFastlyService"));
        return result;
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteFastlyService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.deleteFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Fastly account.
 *
 * See {@link #getFastlyAccountWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @return FastlyAccountResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyAccountResponse  getFastlyAccount(String accountId) throws ApiException {
    return getFastlyAccountWithHttpInfo(accountId).getData();
  }

  /**
 * Get Fastly account.
 *
 * See {@link #getFastlyAccountWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @return CompletableFuture&lt;FastlyAccountResponse&gt;
 */
  public CompletableFuture<FastlyAccountResponse>getFastlyAccountAsync(String accountId) {
    return getFastlyAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Fastly account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @return ApiResponse&lt;FastlyAccountResponse&gt;
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
  public ApiResponse<FastlyAccountResponse> getFastlyAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFastlyAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.getFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
   * Get Fastly account.
   *
   * See {@link #getFastlyAccountWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyAccountResponse>> getFastlyAccountWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getFastlyAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.getFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
 * Get Fastly service.
 *
 * See {@link #getFastlyServiceWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @return FastlyServiceResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyServiceResponse  getFastlyService(String accountId, String serviceId) throws ApiException {
    return getFastlyServiceWithHttpInfo(accountId, serviceId).getData();
  }

  /**
 * Get Fastly service.
 *
 * See {@link #getFastlyServiceWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @return CompletableFuture&lt;FastlyServiceResponse&gt;
 */
  public CompletableFuture<FastlyServiceResponse>getFastlyServiceAsync(String accountId, String serviceId) {
    return getFastlyServiceWithHttpInfoAsync(accountId, serviceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Fastly service for an account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
   * @return ApiResponse&lt;FastlyServiceResponse&gt;
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
  public ApiResponse<FastlyServiceResponse> getFastlyServiceWithHttpInfo(String accountId, String serviceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFastlyService");
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling getFastlyService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.getFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }

  /**
   * Get Fastly service.
   *
   * See {@link #getFastlyServiceWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyServiceResponse>> getFastlyServiceWithHttpInfoAsync(String accountId, String serviceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling getFastlyService"));
        return result;
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceId' when calling getFastlyService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.getFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }

  /**
 * List Fastly accounts.
 *
 * See {@link #listFastlyAccountsWithHttpInfo}.
 *
 * @return FastlyAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyAccountsResponse  listFastlyAccounts() throws ApiException {
    return listFastlyAccountsWithHttpInfo().getData();
  }

  /**
 * List Fastly accounts.
 *
 * See {@link #listFastlyAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FastlyAccountsResponse&gt;
 */
  public CompletableFuture<FastlyAccountsResponse>listFastlyAccountsAsync() {
    return listFastlyAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Fastly accounts.</p>
   *
   * @return ApiResponse&lt;FastlyAccountsResponse&gt;
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
  public ApiResponse<FastlyAccountsResponse> listFastlyAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.listFastlyAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountsResponse>() {});
  }

  /**
   * List Fastly accounts.
   *
   * See {@link #listFastlyAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyAccountsResponse>> listFastlyAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.listFastlyAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountsResponse>() {});
  }

  /**
 * List Fastly services.
 *
 * See {@link #listFastlyServicesWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @return FastlyServicesResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyServicesResponse  listFastlyServices(String accountId) throws ApiException {
    return listFastlyServicesWithHttpInfo(accountId).getData();
  }

  /**
 * List Fastly services.
 *
 * See {@link #listFastlyServicesWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @return CompletableFuture&lt;FastlyServicesResponse&gt;
 */
  public CompletableFuture<FastlyServicesResponse>listFastlyServicesAsync(String accountId) {
    return listFastlyServicesWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List Fastly services for an account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @return ApiResponse&lt;FastlyServicesResponse&gt;
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
  public ApiResponse<FastlyServicesResponse> listFastlyServicesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listFastlyServices");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.listFastlyServices", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServicesResponse>() {});
  }

  /**
   * List Fastly services.
   *
   * See {@link #listFastlyServicesWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyServicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyServicesResponse>> listFastlyServicesWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyServicesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling listFastlyServices"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.listFastlyServices", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyServicesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServicesResponse>() {});
  }

  /**
 * Update Fastly account.
 *
 * See {@link #updateFastlyAccountWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @param body  (required)
 * @return FastlyAccountResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyAccountResponse  updateFastlyAccount(String accountId, FastlyAccountUpdateRequest body) throws ApiException {
    return updateFastlyAccountWithHttpInfo(accountId, body).getData();
  }

  /**
 * Update Fastly account.
 *
 * See {@link #updateFastlyAccountWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FastlyAccountResponse&gt;
 */
  public CompletableFuture<FastlyAccountResponse>updateFastlyAccountAsync(String accountId, FastlyAccountUpdateRequest body) {
    return updateFastlyAccountWithHttpInfoAsync(accountId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Fastly account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FastlyAccountResponse&gt;
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
  public ApiResponse<FastlyAccountResponse> updateFastlyAccountWithHttpInfo(String accountId, FastlyAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateFastlyAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFastlyAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.updateFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
   * Update Fastly account.
   *
   * See {@link #updateFastlyAccountWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyAccountResponse>> updateFastlyAccountWithHttpInfoAsync(String accountId, FastlyAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateFastlyAccount"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateFastlyAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.updateFastlyAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyAccountResponse>() {});
  }

  /**
 * Update Fastly service.
 *
 * See {@link #updateFastlyServiceWithHttpInfo}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @param body  (required)
 * @return FastlyServiceResponse
 * @throws ApiException if fails to make API call
 */
  public FastlyServiceResponse  updateFastlyService(String accountId, String serviceId, FastlyServiceRequest body) throws ApiException {
    return updateFastlyServiceWithHttpInfo(accountId, serviceId, body).getData();
  }

  /**
 * Update Fastly service.
 *
 * See {@link #updateFastlyServiceWithHttpInfoAsync}.
 *
 * @param accountId Fastly Account id. (required)
 * @param serviceId Fastly Service ID. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FastlyServiceResponse&gt;
 */
  public CompletableFuture<FastlyServiceResponse>updateFastlyServiceAsync(String accountId, String serviceId, FastlyServiceRequest body) {
    return updateFastlyServiceWithHttpInfoAsync(accountId, serviceId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Fastly service for an account.</p>
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FastlyServiceResponse&gt;
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
  public ApiResponse<FastlyServiceResponse> updateFastlyServiceWithHttpInfo(String accountId, String serviceId, FastlyServiceRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateFastlyService");
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling updateFastlyService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFastlyService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FastlyIntegrationApi.updateFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }

  /**
   * Update Fastly service.
   *
   * See {@link #updateFastlyServiceWithHttpInfo}.
   *
   * @param accountId Fastly Account id. (required)
   * @param serviceId Fastly Service ID. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FastlyServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FastlyServiceResponse>> updateFastlyServiceWithHttpInfoAsync(String accountId, String serviceId, FastlyServiceRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling updateFastlyService"));
        return result;
    }

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceId' when calling updateFastlyService"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateFastlyService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/fastly/accounts/{account_id}/services/{service_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FastlyIntegrationApi.updateFastlyService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FastlyServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FastlyServiceResponse>() {});
  }
}