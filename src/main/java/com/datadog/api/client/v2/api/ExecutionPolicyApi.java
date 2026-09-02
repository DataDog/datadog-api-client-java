
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
import com.datadog.api.client.v2.model.ExecutionPolicyListResponse;
import com.datadog.api.client.v2.model.ExecutionPolicyIntegration;
import com.datadog.api.client.v2.model.ExecutionPolicyEffect;
import com.datadog.api.client.v2.model.ExecutionPolicyResponse;
import com.datadog.api.client.v2.model.ExecutionPolicyCreateRequest;
import com.datadog.api.client.v2.model.ExecutionPolicyUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExecutionPolicyApi {
  private ApiClient apiClient;
  public ExecutionPolicyApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ExecutionPolicyApi(ApiClient apiClient) {
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
 * Create an execution policy.
 *
 * See {@link #createExecutionPolicyWithHttpInfo}.
 *
 * @param body The execution policy to create. (required)
 * @return ExecutionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public ExecutionPolicyResponse  createExecutionPolicy(ExecutionPolicyCreateRequest body) throws ApiException {
    return createExecutionPolicyWithHttpInfo(body).getData();
  }

  /**
 * Create an execution policy.
 *
 * See {@link #createExecutionPolicyWithHttpInfoAsync}.
 *
 * @param body The execution policy to create. (required)
 * @return CompletableFuture&lt;ExecutionPolicyResponse&gt;
 */
  public CompletableFuture<ExecutionPolicyResponse>createExecutionPolicyAsync(ExecutionPolicyCreateRequest body) {
    return createExecutionPolicyWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new execution policy.</p>
   *
   * @param body The execution policy to create. (required)
   * @return ApiResponse&lt;ExecutionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExecutionPolicyResponse> createExecutionPolicyWithHttpInfo(ExecutionPolicyCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createExecutionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ExecutionPolicyApi.createExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }

  /**
   * Create an execution policy.
   *
   * See {@link #createExecutionPolicyWithHttpInfo}.
   *
   * @param body The execution policy to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExecutionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExecutionPolicyResponse>> createExecutionPolicyWithHttpInfoAsync(ExecutionPolicyCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createExecutionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ExecutionPolicyApi.createExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }

  /**
 * Delete an execution policy.
 *
 * See {@link #deleteExecutionPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteExecutionPolicy(String policyId) throws ApiException {
    deleteExecutionPolicyWithHttpInfo(policyId);
  }

  /**
 * Delete an execution policy.
 *
 * See {@link #deleteExecutionPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteExecutionPolicyAsync(String policyId) {
    return deleteExecutionPolicyWithHttpInfoAsync(policyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific execution policy.</p>
   *
   * @param policyId The ID of the execution policy. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteExecutionPolicyWithHttpInfo(String policyId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling deleteExecutionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ExecutionPolicyApi.deleteExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an execution policy.
   *
   * See {@link #deleteExecutionPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the execution policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteExecutionPolicyWithHttpInfoAsync(String policyId) {
    // Check if unstable operation is enabled
    String operationId = "deleteExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling deleteExecutionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ExecutionPolicyApi.deleteExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an execution policy.
 *
 * See {@link #getExecutionPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @return ExecutionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public ExecutionPolicyResponse  getExecutionPolicy(String policyId) throws ApiException {
    return getExecutionPolicyWithHttpInfo(policyId).getData();
  }

  /**
 * Get an execution policy.
 *
 * See {@link #getExecutionPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @return CompletableFuture&lt;ExecutionPolicyResponse&gt;
 */
  public CompletableFuture<ExecutionPolicyResponse>getExecutionPolicyAsync(String policyId) {
    return getExecutionPolicyWithHttpInfoAsync(policyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve an existing execution policy by ID.</p>
   *
   * @param policyId The ID of the execution policy. (required)
   * @return ApiResponse&lt;ExecutionPolicyResponse&gt;
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
  public ApiResponse<ExecutionPolicyResponse> getExecutionPolicyWithHttpInfo(String policyId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling getExecutionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ExecutionPolicyApi.getExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }

  /**
   * Get an execution policy.
   *
   * See {@link #getExecutionPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the execution policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExecutionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExecutionPolicyResponse>> getExecutionPolicyWithHttpInfoAsync(String policyId) {
    // Check if unstable operation is enabled
    String operationId = "getExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling getExecutionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ExecutionPolicyApi.getExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }

  /**
   * Manage optional parameters to listExecutionPolicies.
   */
  public static class ListExecutionPoliciesOptionalParameters {
    private Integer pageSize;
    private Integer pageNumber;
    private String filterName;
    private List<String> filterIds;
    private List<ExecutionPolicyIntegration> filterIntegration;
    private List<ExecutionPolicyEffect> filterEffects;
    private List<String> filterCreatorIds;
    private List<String> sort;

    /**
     * Set pageSize.
     * @param pageSize The number of execution policies to return per page. (optional, default to 100)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterName.
     * @param filterName Filter execution policies by name. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterIds.
     * @param filterIds Filter execution policies by a list of IDs. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters filterIds(List<String> filterIds) {
      this.filterIds = filterIds;
      return this;
    }

    /**
     * Set filterIntegration.
     * @param filterIntegration Filter execution policies by a list of integrations. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters filterIntegration(List<ExecutionPolicyIntegration> filterIntegration) {
      this.filterIntegration = filterIntegration;
      return this;
    }

    /**
     * Set filterEffects.
     * @param filterEffects Filter execution policies by a list of effects. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters filterEffects(List<ExecutionPolicyEffect> filterEffects) {
      this.filterEffects = filterEffects;
      return this;
    }

    /**
     * Set filterCreatorIds.
     * @param filterCreatorIds Filter execution policies by a list of creator IDs. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters filterCreatorIds(List<String> filterCreatorIds) {
      this.filterCreatorIds = filterCreatorIds;
      return this;
    }

    /**
     * Set sort.
     * @param sort The sort order for the results. Prefix a field with <code>-</code> to sort in descending order. Valid fields are <code>name</code>, <code>effect</code>, <code>integration</code>, <code>created_at</code>, and <code>updated_at</code>. (optional)
     * @return ListExecutionPoliciesOptionalParameters
     */
    public ListExecutionPoliciesOptionalParameters sort(List<String> sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
 * List execution policies.
 *
 * See {@link #listExecutionPoliciesWithHttpInfo}.
 *
 * @return ExecutionPolicyListResponse
 * @throws ApiException if fails to make API call
 */
  public ExecutionPolicyListResponse listExecutionPolicies () throws ApiException {
    return listExecutionPoliciesWithHttpInfo(new ListExecutionPoliciesOptionalParameters()).getData();
  }

  /**
 * List execution policies.
 *
 * See {@link #listExecutionPoliciesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ExecutionPolicyListResponse&gt;
 */
  public CompletableFuture<ExecutionPolicyListResponse>listExecutionPoliciesAsync() {
    return listExecutionPoliciesWithHttpInfoAsync(new ListExecutionPoliciesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List execution policies.
 *
 * See {@link #listExecutionPoliciesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ExecutionPolicyListResponse
 * @throws ApiException if fails to make API call
 */
  public ExecutionPolicyListResponse listExecutionPolicies(ListExecutionPoliciesOptionalParameters parameters) throws ApiException {
    return listExecutionPoliciesWithHttpInfo(parameters).getData();
  }

  /**
 * List execution policies.
 *
 * See {@link #listExecutionPoliciesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ExecutionPolicyListResponse&gt;
 */
  public CompletableFuture<ExecutionPolicyListResponse>listExecutionPoliciesAsync(ListExecutionPoliciesOptionalParameters parameters) {
    return listExecutionPoliciesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a list of execution policies for the current organization.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExecutionPolicyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExecutionPolicyListResponse> listExecutionPoliciesWithHttpInfo(ListExecutionPoliciesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listExecutionPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    String filterName = parameters.filterName;
    List<String> filterIds = parameters.filterIds;
    List<ExecutionPolicyIntegration> filterIntegration = parameters.filterIntegration;
    List<ExecutionPolicyEffect> filterEffects = parameters.filterEffects;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[ids]", filterIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[effects]", filterEffects));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder = apiClient.createBuilder("v2.ExecutionPolicyApi.listExecutionPolicies", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyListResponse>() {});
  }

  /**
   * List execution policies.
   *
   * See {@link #listExecutionPoliciesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExecutionPolicyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExecutionPolicyListResponse>> listExecutionPoliciesWithHttpInfoAsync(ListExecutionPoliciesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listExecutionPolicies";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ExecutionPolicyListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    String filterName = parameters.filterName;
    List<String> filterIds = parameters.filterIds;
    List<ExecutionPolicyIntegration> filterIntegration = parameters.filterIntegration;
    List<ExecutionPolicyEffect> filterEffects = parameters.filterEffects;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[ids]", filterIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[effects]", filterEffects));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ExecutionPolicyApi.listExecutionPolicies", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExecutionPolicyListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyListResponse>() {});
  }

  /**
 * Update an execution policy.
 *
 * See {@link #updateExecutionPolicyWithHttpInfo}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @param body The new execution policy. (required)
 * @return ExecutionPolicyResponse
 * @throws ApiException if fails to make API call
 */
  public ExecutionPolicyResponse  updateExecutionPolicy(String policyId, ExecutionPolicyUpdateRequest body) throws ApiException {
    return updateExecutionPolicyWithHttpInfo(policyId, body).getData();
  }

  /**
 * Update an execution policy.
 *
 * See {@link #updateExecutionPolicyWithHttpInfoAsync}.
 *
 * @param policyId The ID of the execution policy. (required)
 * @param body The new execution policy. (required)
 * @return CompletableFuture&lt;ExecutionPolicyResponse&gt;
 */
  public CompletableFuture<ExecutionPolicyResponse>updateExecutionPolicyAsync(String policyId, ExecutionPolicyUpdateRequest body) {
    return updateExecutionPolicyWithHttpInfoAsync(policyId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an existing execution policy.
   * Returns the execution policy object when the request is successful.</p>
   *
   * @param policyId The ID of the execution policy. (required)
   * @param body The new execution policy. (required)
   * @return ApiResponse&lt;ExecutionPolicyResponse&gt;
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
  public ApiResponse<ExecutionPolicyResponse> updateExecutionPolicyWithHttpInfo(String policyId, ExecutionPolicyUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new ApiException(400, "Missing the required parameter 'policyId' when calling updateExecutionPolicy");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateExecutionPolicy");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ExecutionPolicyApi.updateExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }

  /**
   * Update an execution policy.
   *
   * See {@link #updateExecutionPolicyWithHttpInfo}.
   *
   * @param policyId The ID of the execution policy. (required)
   * @param body The new execution policy. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExecutionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExecutionPolicyResponse>> updateExecutionPolicyWithHttpInfoAsync(String policyId, ExecutionPolicyUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateExecutionPolicy";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'policyId' is set
    if (policyId == null) {
        CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'policyId' when calling updateExecutionPolicy"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateExecutionPolicy"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/execution-policies/{policy_id}"
      .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ExecutionPolicyApi.updateExecutionPolicy", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExecutionPolicyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ExecutionPolicyResponse>() {});
  }
}