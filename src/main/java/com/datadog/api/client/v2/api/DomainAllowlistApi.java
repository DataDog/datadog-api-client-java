
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
import com.datadog.api.client.v2.model.DomainAllowlistResponse;
import com.datadog.api.client.v2.model.DomainAllowlistRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DomainAllowlistApi {
  private ApiClient apiClient;
  public DomainAllowlistApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DomainAllowlistApi(ApiClient apiClient) {
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
 * Get Domain Allowlist.
 *
 * See {@link #getDomainAllowlistWithHttpInfo}.
 *
 * @return DomainAllowlistResponse
 * @throws ApiException if fails to make API call
 */
  public DomainAllowlistResponse  getDomainAllowlist() throws ApiException {
    return getDomainAllowlistWithHttpInfo().getData();
  }

  /**
 * Get Domain Allowlist.
 *
 * See {@link #getDomainAllowlistWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;DomainAllowlistResponse&gt;
 */
  public CompletableFuture<DomainAllowlistResponse>getDomainAllowlistAsync() {
    return getDomainAllowlistWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the domain allowlist for an organization.</p>
   *
   * @return ApiResponse&lt;DomainAllowlistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DomainAllowlistResponse> getDomainAllowlistWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/domain_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DomainAllowlistApi.getDomainAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DomainAllowlistResponse>() {});
  }

  /**
   * Get Domain Allowlist.
   *
   * See {@link #getDomainAllowlistWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DomainAllowlistResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DomainAllowlistResponse>> getDomainAllowlistWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/domain_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DomainAllowlistApi.getDomainAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DomainAllowlistResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DomainAllowlistResponse>() {});
  }

  /**
 * Sets Domain Allowlist.
 *
 * See {@link #patchDomainAllowlistWithHttpInfo}.
 *
 * @param body  (required)
 * @return DomainAllowlistResponse
 * @throws ApiException if fails to make API call
 */
  public DomainAllowlistResponse  patchDomainAllowlist(DomainAllowlistRequest body) throws ApiException {
    return patchDomainAllowlistWithHttpInfo(body).getData();
  }

  /**
 * Sets Domain Allowlist.
 *
 * See {@link #patchDomainAllowlistWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;DomainAllowlistResponse&gt;
 */
  public CompletableFuture<DomainAllowlistResponse>patchDomainAllowlistAsync(DomainAllowlistRequest body) {
    return patchDomainAllowlistWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update the domain allowlist for an organization.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;DomainAllowlistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DomainAllowlistResponse> patchDomainAllowlistWithHttpInfo(DomainAllowlistRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchDomainAllowlist");
    }
    // create path and map variables
    String localVarPath = "/api/v2/domain_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DomainAllowlistApi.patchDomainAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DomainAllowlistResponse>() {});
  }

  /**
   * Sets Domain Allowlist.
   *
   * See {@link #patchDomainAllowlistWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DomainAllowlistResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DomainAllowlistResponse>> patchDomainAllowlistWithHttpInfoAsync(DomainAllowlistRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DomainAllowlistResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling patchDomainAllowlist"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/domain_allowlist";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DomainAllowlistApi.patchDomainAllowlist", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DomainAllowlistResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DomainAllowlistResponse>() {});
  }
}