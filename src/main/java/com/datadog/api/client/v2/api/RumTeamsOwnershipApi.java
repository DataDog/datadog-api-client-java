
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
import com.datadog.api.client.v2.model.TeamsOwnershipMappingsResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateRequest;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingBatchRequest;
import com.datadog.api.client.v2.model.TeamsOwnershipRulesResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumTeamsOwnershipApi {
  private ApiClient apiClient;
  public RumTeamsOwnershipApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumTeamsOwnershipApi(ApiClient apiClient) {
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
 * Create a teams ownership mapping.
 *
 * See {@link #createTeamsOwnershipMappingWithHttpInfo}.
 *
 * @param body The definition of the teams ownership mapping to create. (required)
 * @return TeamsOwnershipMappingResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipMappingResponse  createTeamsOwnershipMapping(TeamsOwnershipMappingCreateRequest body) throws ApiException {
    return createTeamsOwnershipMappingWithHttpInfo(body).getData();
  }

  /**
 * Create a teams ownership mapping.
 *
 * See {@link #createTeamsOwnershipMappingWithHttpInfoAsync}.
 *
 * @param body The definition of the teams ownership mapping to create. (required)
 * @return CompletableFuture&lt;TeamsOwnershipMappingResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipMappingResponse>createTeamsOwnershipMappingAsync(TeamsOwnershipMappingCreateRequest body) {
    return createTeamsOwnershipMappingWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a teams ownership mapping for your organization.
   * Returns the teams ownership mapping object from the request body when the request is successful.</p>
   *
   * @param body The definition of the teams ownership mapping to create. (required)
   * @return ApiResponse&lt;TeamsOwnershipMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsOwnershipMappingResponse> createTeamsOwnershipMappingWithHttpInfo(TeamsOwnershipMappingCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTeamsOwnershipMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.createTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingResponse>() {});
  }

  /**
   * Create a teams ownership mapping.
   *
   * See {@link #createTeamsOwnershipMappingWithHttpInfo}.
   *
   * @param body The definition of the teams ownership mapping to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsOwnershipMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> createTeamsOwnershipMappingWithHttpInfoAsync(TeamsOwnershipMappingCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createTeamsOwnershipMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.createTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingResponse>() {});
  }

  /**
 * Bulk create and remove teams ownership mappings.
 *
 * See {@link #createTeamsOwnershipMappingsBatchWithHttpInfo}.
 *
 * @param body The list of add and remove operations to apply atomically. (required)
 * @return TeamsOwnershipMappingBatchResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipMappingBatchResponse  createTeamsOwnershipMappingsBatch(TeamsOwnershipMappingBatchRequest body) throws ApiException {
    return createTeamsOwnershipMappingsBatchWithHttpInfo(body).getData();
  }

  /**
 * Bulk create and remove teams ownership mappings.
 *
 * See {@link #createTeamsOwnershipMappingsBatchWithHttpInfoAsync}.
 *
 * @param body The list of add and remove operations to apply atomically. (required)
 * @return CompletableFuture&lt;TeamsOwnershipMappingBatchResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipMappingBatchResponse>createTeamsOwnershipMappingsBatchAsync(TeamsOwnershipMappingBatchRequest body) {
    return createTeamsOwnershipMappingsBatchWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Add and remove teams ownership mappings for your organization in a single atomic request, following
   * the JSON:API <a href="https://jsonapi.org/ext/atomic/">atomic operations extension</a>.
   * Operations are applied together: if any operation is invalid, none of the operations are applied.
   * Add operations are processed before remove operations, so results may not appear in the same
   * order as the request.</p>
   *
   * @param body The list of add and remove operations to apply atomically. (required)
   * @return ApiResponse&lt;TeamsOwnershipMappingBatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request. One or more operations failed validation, so none of the operations were applied. Errors are returned in the JSON:API atomic operations error format rather than the standard error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found. One or more mappings requested for removal do not exist. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict. One or more mappings requested for creation already exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsOwnershipMappingBatchResponse> createTeamsOwnershipMappingsBatchWithHttpInfo(TeamsOwnershipMappingBatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTeamsOwnershipMappingsBatch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTeamsOwnershipMappingsBatch");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/operations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.createTeamsOwnershipMappingsBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingBatchResponse>() {});
  }

  /**
   * Bulk create and remove teams ownership mappings.
   *
   * See {@link #createTeamsOwnershipMappingsBatchWithHttpInfo}.
   *
   * @param body The list of add and remove operations to apply atomically. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsOwnershipMappingBatchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsOwnershipMappingBatchResponse>> createTeamsOwnershipMappingsBatchWithHttpInfoAsync(TeamsOwnershipMappingBatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTeamsOwnershipMappingsBatch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<TeamsOwnershipMappingBatchResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createTeamsOwnershipMappingsBatch"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/operations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.createTeamsOwnershipMappingsBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingBatchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingBatchResponse>() {});
  }

  /**
 * Delete a teams ownership mapping.
 *
 * See {@link #deleteTeamsOwnershipMappingWithHttpInfo}.
 *
 * @param id The ID of the teams ownership mapping. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteTeamsOwnershipMapping(String id) throws ApiException {
    deleteTeamsOwnershipMappingWithHttpInfo(id);
  }

  /**
 * Delete a teams ownership mapping.
 *
 * See {@link #deleteTeamsOwnershipMappingWithHttpInfoAsync}.
 *
 * @param id The ID of the teams ownership mapping. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteTeamsOwnershipMappingAsync(String id) {
    return deleteTeamsOwnershipMappingWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific teams ownership mapping from your organization.</p>
   *
   * @param id The ID of the teams ownership mapping. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamsOwnershipMappingWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTeamsOwnershipMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.deleteTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a teams ownership mapping.
   *
   * See {@link #deleteTeamsOwnershipMappingWithHttpInfo}.
   *
   * @param id The ID of the teams ownership mapping. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamsOwnershipMappingWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling deleteTeamsOwnershipMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.deleteTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a teams ownership mapping.
 *
 * See {@link #getTeamsOwnershipMappingWithHttpInfo}.
 *
 * @param id The ID of the teams ownership mapping. (required)
 * @return TeamsOwnershipMappingResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipMappingResponse  getTeamsOwnershipMapping(String id) throws ApiException {
    return getTeamsOwnershipMappingWithHttpInfo(id).getData();
  }

  /**
 * Get a teams ownership mapping.
 *
 * See {@link #getTeamsOwnershipMappingWithHttpInfoAsync}.
 *
 * @param id The ID of the teams ownership mapping. (required)
 * @return CompletableFuture&lt;TeamsOwnershipMappingResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipMappingResponse>getTeamsOwnershipMappingAsync(String id) {
    return getTeamsOwnershipMappingWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific teams ownership mapping from your organization.</p>
   *
   * @param id The ID of the teams ownership mapping. (required)
   * @return ApiResponse&lt;TeamsOwnershipMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsOwnershipMappingResponse> getTeamsOwnershipMappingWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTeamsOwnershipMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.getTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingResponse>() {});
  }

  /**
   * Get a teams ownership mapping.
   *
   * See {@link #getTeamsOwnershipMappingWithHttpInfo}.
   *
   * @param id The ID of the teams ownership mapping. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsOwnershipMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> getTeamsOwnershipMappingWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getTeamsOwnershipMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getTeamsOwnershipMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.getTeamsOwnershipMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingResponse>() {});
  }

  /**
   * Manage optional parameters to listTeamsOwnershipMappings.
   */
  public static class ListTeamsOwnershipMappingsOptionalParameters {
    private List<String> filterViewName;
    private List<String> filterTeamHandle;
    private List<UUID> filterApplicationId;
    private List<String> filterService;

    /**
     * Set filterViewName.
     * @param filterViewName Filter mappings by RUM view name. (optional)
     * @return ListTeamsOwnershipMappingsOptionalParameters
     */
    public ListTeamsOwnershipMappingsOptionalParameters filterViewName(List<String> filterViewName) {
      this.filterViewName = filterViewName;
      return this;
    }

    /**
     * Set filterTeamHandle.
     * @param filterTeamHandle Filter mappings by owning team handle. (optional)
     * @return ListTeamsOwnershipMappingsOptionalParameters
     */
    public ListTeamsOwnershipMappingsOptionalParameters filterTeamHandle(List<String> filterTeamHandle) {
      this.filterTeamHandle = filterTeamHandle;
      return this;
    }

    /**
     * Set filterApplicationId.
     * @param filterApplicationId Filter mappings by RUM application ID. Each value must be a valid UUID. (optional)
     * @return ListTeamsOwnershipMappingsOptionalParameters
     */
    public ListTeamsOwnershipMappingsOptionalParameters filterApplicationId(List<UUID> filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }

    /**
     * Set filterService.
     * @param filterService Filter mappings by RUM application service name. (optional)
     * @return ListTeamsOwnershipMappingsOptionalParameters
     */
    public ListTeamsOwnershipMappingsOptionalParameters filterService(List<String> filterService) {
      this.filterService = filterService;
      return this;
    }
  }

  /**
 * List teams ownership mappings.
 *
 * See {@link #listTeamsOwnershipMappingsWithHttpInfo}.
 *
 * @return TeamsOwnershipMappingsResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipMappingsResponse listTeamsOwnershipMappings () throws ApiException {
    return listTeamsOwnershipMappingsWithHttpInfo(new ListTeamsOwnershipMappingsOptionalParameters()).getData();
  }

  /**
 * List teams ownership mappings.
 *
 * See {@link #listTeamsOwnershipMappingsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;TeamsOwnershipMappingsResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipMappingsResponse>listTeamsOwnershipMappingsAsync() {
    return listTeamsOwnershipMappingsWithHttpInfoAsync(new ListTeamsOwnershipMappingsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List teams ownership mappings.
 *
 * See {@link #listTeamsOwnershipMappingsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return TeamsOwnershipMappingsResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipMappingsResponse listTeamsOwnershipMappings(ListTeamsOwnershipMappingsOptionalParameters parameters) throws ApiException {
    return listTeamsOwnershipMappingsWithHttpInfo(parameters).getData();
  }

  /**
 * List teams ownership mappings.
 *
 * See {@link #listTeamsOwnershipMappingsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;TeamsOwnershipMappingsResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipMappingsResponse>listTeamsOwnershipMappingsAsync(ListTeamsOwnershipMappingsOptionalParameters parameters) {
    return listTeamsOwnershipMappingsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of teams ownership mappings for your organization, optionally filtered.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamsOwnershipMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsOwnershipMappingsResponse> listTeamsOwnershipMappingsWithHttpInfo(ListTeamsOwnershipMappingsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTeamsOwnershipMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    List<String> filterViewName = parameters.filterViewName;
    List<String> filterTeamHandle = parameters.filterTeamHandle;
    List<UUID> filterApplicationId = parameters.filterApplicationId;
    List<String> filterService = parameters.filterService;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[team_handle]", filterTeamHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[service]", filterService));

    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.listTeamsOwnershipMappings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingsResponse>() {});
  }

  /**
   * List teams ownership mappings.
   *
   * See {@link #listTeamsOwnershipMappingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsOwnershipMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsOwnershipMappingsResponse>> listTeamsOwnershipMappingsWithHttpInfoAsync(ListTeamsOwnershipMappingsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTeamsOwnershipMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    List<String> filterViewName = parameters.filterViewName;
    List<String> filterTeamHandle = parameters.filterTeamHandle;
    List<UUID> filterApplicationId = parameters.filterApplicationId;
    List<String> filterService = parameters.filterService;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/mappings";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[team_handle]", filterTeamHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[service]", filterService));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.listTeamsOwnershipMappings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsOwnershipMappingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipMappingsResponse>() {});
  }

  /**
   * Manage optional parameters to listTeamsOwnershipRules.
   */
  public static class ListTeamsOwnershipRulesOptionalParameters {
    private List<String> filterViewName;
    private List<String> filterTeamHandle;
    private List<UUID> filterApplicationId;
    private List<String> filterService;

    /**
     * Set filterViewName.
     * @param filterViewName Filter mappings by RUM view name. (optional)
     * @return ListTeamsOwnershipRulesOptionalParameters
     */
    public ListTeamsOwnershipRulesOptionalParameters filterViewName(List<String> filterViewName) {
      this.filterViewName = filterViewName;
      return this;
    }

    /**
     * Set filterTeamHandle.
     * @param filterTeamHandle Filter mappings by owning team handle. (optional)
     * @return ListTeamsOwnershipRulesOptionalParameters
     */
    public ListTeamsOwnershipRulesOptionalParameters filterTeamHandle(List<String> filterTeamHandle) {
      this.filterTeamHandle = filterTeamHandle;
      return this;
    }

    /**
     * Set filterApplicationId.
     * @param filterApplicationId Filter mappings by RUM application ID. Each value must be a valid UUID. (optional)
     * @return ListTeamsOwnershipRulesOptionalParameters
     */
    public ListTeamsOwnershipRulesOptionalParameters filterApplicationId(List<UUID> filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }

    /**
     * Set filterService.
     * @param filterService Filter mappings by RUM application service name. (optional)
     * @return ListTeamsOwnershipRulesOptionalParameters
     */
    public ListTeamsOwnershipRulesOptionalParameters filterService(List<String> filterService) {
      this.filterService = filterService;
      return this;
    }
  }

  /**
 * List teams ownership rules.
 *
 * See {@link #listTeamsOwnershipRulesWithHttpInfo}.
 *
 * @return TeamsOwnershipRulesResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipRulesResponse listTeamsOwnershipRules () throws ApiException {
    return listTeamsOwnershipRulesWithHttpInfo(new ListTeamsOwnershipRulesOptionalParameters()).getData();
  }

  /**
 * List teams ownership rules.
 *
 * See {@link #listTeamsOwnershipRulesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;TeamsOwnershipRulesResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipRulesResponse>listTeamsOwnershipRulesAsync() {
    return listTeamsOwnershipRulesWithHttpInfoAsync(new ListTeamsOwnershipRulesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List teams ownership rules.
 *
 * See {@link #listTeamsOwnershipRulesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return TeamsOwnershipRulesResponse
 * @throws ApiException if fails to make API call
 */
  public TeamsOwnershipRulesResponse listTeamsOwnershipRules(ListTeamsOwnershipRulesOptionalParameters parameters) throws ApiException {
    return listTeamsOwnershipRulesWithHttpInfo(parameters).getData();
  }

  /**
 * List teams ownership rules.
 *
 * See {@link #listTeamsOwnershipRulesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;TeamsOwnershipRulesResponse&gt;
 */
  public CompletableFuture<TeamsOwnershipRulesResponse>listTeamsOwnershipRulesAsync(ListTeamsOwnershipRulesOptionalParameters parameters) {
    return listTeamsOwnershipRulesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of teams ownership rules for your organization, optionally filtered.
   * Rules group the underlying mappings by <code>view_name</code>, <code>application_id</code>, <code>service</code>, and <code>match_type</code>,
   * collapsing every team that owns the same view into a single entry.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamsOwnershipRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsOwnershipRulesResponse> listTeamsOwnershipRulesWithHttpInfo(ListTeamsOwnershipRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTeamsOwnershipRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    List<String> filterViewName = parameters.filterViewName;
    List<String> filterTeamHandle = parameters.filterTeamHandle;
    List<UUID> filterApplicationId = parameters.filterApplicationId;
    List<String> filterService = parameters.filterService;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[team_handle]", filterTeamHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[service]", filterService));

    Invocation.Builder builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.listTeamsOwnershipRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipRulesResponse>() {});
  }

  /**
   * List teams ownership rules.
   *
   * See {@link #listTeamsOwnershipRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsOwnershipRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsOwnershipRulesResponse>> listTeamsOwnershipRulesWithHttpInfoAsync(ListTeamsOwnershipRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTeamsOwnershipRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsOwnershipRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    List<String> filterViewName = parameters.filterViewName;
    List<String> filterTeamHandle = parameters.filterTeamHandle;
    List<UUID> filterApplicationId = parameters.filterApplicationId;
    List<String> filterService = parameters.filterService;
    // create path and map variables
    String localVarPath = "/api/v2/rum/config/teams-ownership/rules";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[team_handle]", filterTeamHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[service]", filterService));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumTeamsOwnershipApi.listTeamsOwnershipRules", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsOwnershipRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<TeamsOwnershipRulesResponse>() {});
  }
}