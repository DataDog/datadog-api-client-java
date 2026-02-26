
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
import com.datadog.api.client.v2.model.CsmAgentsResponse;
import com.datadog.api.client.v2.model.OrderDirection;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmAgentsApi {
  private ApiClient apiClient;
  public CsmAgentsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CsmAgentsApi(ApiClient apiClient) {
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
   * Manage optional parameters to listAllCSMAgents.
   */
  public static class ListAllCSMAgentsOptionalParameters {
    private Integer page;
    private Integer size;
    private String query;
    private OrderDirection orderDirection;

    /**
     * Set page.
     * @param page The page index for pagination (zero-based). (optional)
     * @return ListAllCSMAgentsOptionalParameters
     */
    public ListAllCSMAgentsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set size.
     * @param size The number of items to include in a single page. (optional)
     * @return ListAllCSMAgentsOptionalParameters
     */
    public ListAllCSMAgentsOptionalParameters size(Integer size) {
      this.size = size;
      return this;
    }

    /**
     * Set query.
     * @param query A search query string to filter results (for example, <code>hostname:COMP-T2H4J27423</code>). (optional)
     * @return ListAllCSMAgentsOptionalParameters
     */
    public ListAllCSMAgentsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set orderDirection.
     * @param orderDirection The sort direction for results. Use <code>asc</code> for ascending or <code>desc</code> for descending. (optional)
     * @return ListAllCSMAgentsOptionalParameters
     */
    public ListAllCSMAgentsOptionalParameters orderDirection(OrderDirection orderDirection) {
      this.orderDirection = orderDirection;
      return this;
    }
  }

  /**
 * Get all CSM Agents.
 *
 * See {@link #listAllCSMAgentsWithHttpInfo}.
 *
 * @return CsmAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public CsmAgentsResponse listAllCSMAgents () throws ApiException {
    return listAllCSMAgentsWithHttpInfo(new ListAllCSMAgentsOptionalParameters()).getData();
  }

  /**
 * Get all CSM Agents.
 *
 * See {@link #listAllCSMAgentsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CsmAgentsResponse&gt;
 */
  public CompletableFuture<CsmAgentsResponse>listAllCSMAgentsAsync() {
    return listAllCSMAgentsWithHttpInfoAsync(new ListAllCSMAgentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all CSM Agents.
 *
 * See {@link #listAllCSMAgentsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CsmAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public CsmAgentsResponse listAllCSMAgents(ListAllCSMAgentsOptionalParameters parameters) throws ApiException {
    return listAllCSMAgentsWithHttpInfo(parameters).getData();
  }

  /**
 * Get all CSM Agents.
 *
 * See {@link #listAllCSMAgentsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CsmAgentsResponse&gt;
 */
  public CompletableFuture<CsmAgentsResponse>listAllCSMAgentsAsync(ListAllCSMAgentsOptionalParameters parameters) {
    return listAllCSMAgentsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of all CSM Agents running on your hosts and containers.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmAgentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmAgentsResponse> listAllCSMAgentsWithHttpInfo(ListAllCSMAgentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    OrderDirection orderDirection = parameters.orderDirection;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_direction", orderDirection));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmAgentsApi.listAllCSMAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CsmAgentsResponse>() {});
  }

  /**
   * Get all CSM Agents.
   *
   * See {@link #listAllCSMAgentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmAgentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmAgentsResponse>> listAllCSMAgentsWithHttpInfoAsync(ListAllCSMAgentsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    OrderDirection orderDirection = parameters.orderDirection;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_direction", orderDirection));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmAgentsApi.listAllCSMAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmAgentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CsmAgentsResponse>() {});
  }

  /**
   * Manage optional parameters to listAllCSMServerlessAgents.
   */
  public static class ListAllCSMServerlessAgentsOptionalParameters {
    private Integer page;
    private Integer size;
    private String query;
    private OrderDirection orderDirection;

    /**
     * Set page.
     * @param page The page index for pagination (zero-based). (optional)
     * @return ListAllCSMServerlessAgentsOptionalParameters
     */
    public ListAllCSMServerlessAgentsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set size.
     * @param size The number of items to include in a single page. (optional)
     * @return ListAllCSMServerlessAgentsOptionalParameters
     */
    public ListAllCSMServerlessAgentsOptionalParameters size(Integer size) {
      this.size = size;
      return this;
    }

    /**
     * Set query.
     * @param query A search query string to filter results (for example, <code>hostname:COMP-T2H4J27423</code>). (optional)
     * @return ListAllCSMServerlessAgentsOptionalParameters
     */
    public ListAllCSMServerlessAgentsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set orderDirection.
     * @param orderDirection The sort direction for results. Use <code>asc</code> for ascending or <code>desc</code> for descending. (optional)
     * @return ListAllCSMServerlessAgentsOptionalParameters
     */
    public ListAllCSMServerlessAgentsOptionalParameters orderDirection(OrderDirection orderDirection) {
      this.orderDirection = orderDirection;
      return this;
    }
  }

  /**
 * Get all CSM Serverless Agents.
 *
 * See {@link #listAllCSMServerlessAgentsWithHttpInfo}.
 *
 * @return CsmAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public CsmAgentsResponse listAllCSMServerlessAgents () throws ApiException {
    return listAllCSMServerlessAgentsWithHttpInfo(new ListAllCSMServerlessAgentsOptionalParameters()).getData();
  }

  /**
 * Get all CSM Serverless Agents.
 *
 * See {@link #listAllCSMServerlessAgentsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CsmAgentsResponse&gt;
 */
  public CompletableFuture<CsmAgentsResponse>listAllCSMServerlessAgentsAsync() {
    return listAllCSMServerlessAgentsWithHttpInfoAsync(new ListAllCSMServerlessAgentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all CSM Serverless Agents.
 *
 * See {@link #listAllCSMServerlessAgentsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return CsmAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public CsmAgentsResponse listAllCSMServerlessAgents(ListAllCSMServerlessAgentsOptionalParameters parameters) throws ApiException {
    return listAllCSMServerlessAgentsWithHttpInfo(parameters).getData();
  }

  /**
 * Get all CSM Serverless Agents.
 *
 * See {@link #listAllCSMServerlessAgentsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;CsmAgentsResponse&gt;
 */
  public CompletableFuture<CsmAgentsResponse>listAllCSMServerlessAgentsAsync(ListAllCSMServerlessAgentsOptionalParameters parameters) {
    return listAllCSMServerlessAgentsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of all CSM Serverless Agents running on your hosts and containers.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmAgentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmAgentsResponse> listAllCSMServerlessAgentsWithHttpInfo(ListAllCSMServerlessAgentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    OrderDirection orderDirection = parameters.orderDirection;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/serverless/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_direction", orderDirection));

    Invocation.Builder builder = apiClient.createBuilder("v2.CsmAgentsApi.listAllCSMServerlessAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CsmAgentsResponse>() {});
  }

  /**
   * Get all CSM Serverless Agents.
   *
   * See {@link #listAllCSMServerlessAgentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmAgentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmAgentsResponse>> listAllCSMServerlessAgentsWithHttpInfoAsync(ListAllCSMServerlessAgentsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    OrderDirection orderDirection = parameters.orderDirection;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/serverless/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_direction", orderDirection));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CsmAgentsApi.listAllCSMServerlessAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmAgentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CsmAgentsResponse>() {});
  }
}