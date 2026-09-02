
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
import com.datadog.api.client.v2.model.IPAllowlistResponse;
import com.datadog.api.client.v2.model.IPAllowlistUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IpAllowlistApi {
  private ApiClient apiClient;
  public IpAllowlistApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IpAllowlistApi(ApiClient apiClient) {
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
 * Get IP Allowlist.
 *
 * See {@link #getIPAllowlistWithHttpInfo}.
 *
 * @return IPAllowlistResponse
 * @throws ApiException if fails to make API call
 */
  public IPAllowlistResponse  getIPAllowlist() throws ApiException {
    return getIPAllowlistWithHttpInfo().getData();
  }

  /**
 * Get IP Allowlist.
 *
 * See {@link #getIPAllowlistWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;IPAllowlistResponse&gt;
 */
  public CompletableFuture<IPAllowlistResponse>getIPAllowlistAsync() {
    return getIPAllowlistWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns the IP allowlist and its enabled or disabled state.</p>
   *
   * @return ApiResponse&lt;IPAllowlistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IPAllowlistResponse> getIPAllowlistWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/ip_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.IpAllowlistApi.getIPAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPAllowlistResponse>() {});
  }

  /**
   * Get IP Allowlist.
   *
   * See {@link #getIPAllowlistWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IPAllowlistResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IPAllowlistResponse>> getIPAllowlistWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/ip_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.IpAllowlistApi.getIPAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IPAllowlistResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPAllowlistResponse>() {});
  }

  /**
 * Update IP Allowlist.
 *
 * See {@link #updateIPAllowlistWithHttpInfo}.
 *
 * @param body  (required)
 * @return IPAllowlistResponse
 * @throws ApiException if fails to make API call
 */
  public IPAllowlistResponse  updateIPAllowlist(IPAllowlistUpdateRequest body) throws ApiException {
    return updateIPAllowlistWithHttpInfo(body).getData();
  }

  /**
 * Update IP Allowlist.
 *
 * See {@link #updateIPAllowlistWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;IPAllowlistResponse&gt;
 */
  public CompletableFuture<IPAllowlistResponse>updateIPAllowlistAsync(IPAllowlistUpdateRequest body) {
    return updateIPAllowlistWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit the entries in the IP allowlist, and enable or disable it.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;IPAllowlistResponse&gt;
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
  public ApiResponse<IPAllowlistResponse> updateIPAllowlistWithHttpInfo(IPAllowlistUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIPAllowlist");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ip_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.IpAllowlistApi.updateIPAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPAllowlistResponse>() {});
  }

  /**
   * Update IP Allowlist.
   *
   * See {@link #updateIPAllowlistWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IPAllowlistResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IPAllowlistResponse>> updateIPAllowlistWithHttpInfoAsync(IPAllowlistUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<IPAllowlistResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateIPAllowlist"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ip_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.IpAllowlistApi.updateIPAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IPAllowlistResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPAllowlistResponse>() {});
  }
}