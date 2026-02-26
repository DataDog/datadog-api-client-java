
package com.datadog.api.client.v1.api;

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
import com.datadog.api.client.v1.model.GCPAccount;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GcpIntegrationApi {
  private ApiClient apiClient;
  public GcpIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GcpIntegrationApi(ApiClient apiClient) {
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
 * Create a GCP integration.
 *
 * See {@link #createGCPIntegrationWithHttpInfo}.
 *
 * @param body Create a Datadog-GCP integration. (required)
 * @return Object
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public Object  createGCPIntegration(GCPAccount body) throws ApiException {
    return createGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
 * Create a GCP integration.
 *
 * See {@link #createGCPIntegrationWithHttpInfoAsync}.
 *
 * @param body Create a Datadog-GCP integration. (required)
 * @return CompletableFuture&lt;Object&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<Object>createGCPIntegrationAsync(GCPAccount body) {
    return createGCPIntegrationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated – use the V2 endpoints instead. Create a Datadog-GCP integration.</p>
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> createGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.GcpIntegrationApi.createGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
   * Create a GCP integration.
   *
   * See {@link #createGCPIntegrationWithHttpInfo}.
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> createGCPIntegrationWithHttpInfoAsync(GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createGCPIntegration"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.GcpIntegrationApi.createGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
 * Delete a GCP integration.
 *
 * See {@link #deleteGCPIntegrationWithHttpInfo}.
 *
 * @param body Delete a given Datadog-GCP integration. (required)
 * @return Object
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public Object  deleteGCPIntegration(GCPAccount body) throws ApiException {
    return deleteGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
 * Delete a GCP integration.
 *
 * See {@link #deleteGCPIntegrationWithHttpInfoAsync}.
 *
 * @param body Delete a given Datadog-GCP integration. (required)
 * @return CompletableFuture&lt;Object&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<Object>deleteGCPIntegrationAsync(GCPAccount body) {
    return deleteGCPIntegrationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated – use the V2 endpoints instead. Delete a given Datadog-GCP integration.</p>
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> deleteGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.GcpIntegrationApi.deleteGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
   * Delete a GCP integration.
   *
   * See {@link #deleteGCPIntegrationWithHttpInfo}.
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> deleteGCPIntegrationWithHttpInfoAsync(GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling deleteGCPIntegration"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.GcpIntegrationApi.deleteGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
 * List all GCP integrations.
 *
 * See {@link #listGCPIntegrationWithHttpInfo}.
 *
 * @return List&lt;GCPAccount&gt;
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public List<GCPAccount>  listGCPIntegration() throws ApiException {
    return listGCPIntegrationWithHttpInfo().getData();
  }

  /**
 * List all GCP integrations.
 *
 * See {@link #listGCPIntegrationWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;List&lt;GCPAccount&gt;&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<List<GCPAccount>>listGCPIntegrationAsync() {
    return listGCPIntegrationWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated – use the V2 endpoints instead. List all Datadog-GCP integrations configured in your Datadog account.</p>
   *
   * @return ApiResponse&lt;List&lt;GCPAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<GCPAccount>> listGCPIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.GcpIntegrationApi.listGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<GCPAccount>>() {});
  }

  /**
   * List all GCP integrations.
   *
   * See {@link #listGCPIntegrationWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;GCPAccount&gt;&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<List<GCPAccount>>> listGCPIntegrationWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.GcpIntegrationApi.listGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<GCPAccount>>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<GCPAccount>>() {});
  }

  /**
 * Update a GCP integration.
 *
 * See {@link #updateGCPIntegrationWithHttpInfo}.
 *
 * @param body Update a Datadog-GCP integration. (required)
 * @return Object
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public Object  updateGCPIntegration(GCPAccount body) throws ApiException {
    return updateGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
 * Update a GCP integration.
 *
 * See {@link #updateGCPIntegrationWithHttpInfoAsync}.
 *
 * @param body Update a Datadog-GCP integration. (required)
 * @return CompletableFuture&lt;Object&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<Object>updateGCPIntegrationAsync(GCPAccount body) {
    return updateGCPIntegrationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated – use the V2 endpoints instead. Update a Datadog-GCP integrations host_filters and/or auto-mute.
   * Requires a <code>project_id</code> and <code>client_email</code>, however these fields cannot be updated.
   * If you need to update these fields, delete and use the create (<code>POST</code>) endpoint.
   * The unspecified fields will keep their original values.</p>
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> updateGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.GcpIntegrationApi.updateGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
   * Update a GCP integration.
   *
   * See {@link #updateGCPIntegrationWithHttpInfo}.
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> updateGCPIntegrationWithHttpInfoAsync(GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateGCPIntegration"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.GcpIntegrationApi.updateGCPIntegration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }
}