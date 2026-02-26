
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
import com.datadog.api.client.v2.model.RestrictionQueryListResponse;
import com.datadog.api.client.v2.model.RestrictionQueryWithoutRelationshipsResponse;
import com.datadog.api.client.v2.model.RestrictionQueryCreatePayload;
import com.datadog.api.client.v2.model.RestrictionQueryWithRelationshipsResponse;
import com.datadog.api.client.v2.model.RestrictionQueryUpdatePayload;
import com.datadog.api.client.v2.model.RelationshipToRole;
import com.datadog.api.client.v2.model.RestrictionQueryRolesResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsRestrictionQueriesApi {
  private ApiClient apiClient;
  public LogsRestrictionQueriesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsRestrictionQueriesApi(ApiClient apiClient) {
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
 * Grant role to a restriction query.
 *
 * See {@link #addRoleToRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  addRoleToRestrictionQuery(String restrictionQueryId, RelationshipToRole body) throws ApiException {
    addRoleToRestrictionQueryWithHttpInfo(restrictionQueryId, body);
  }

  /**
 * Grant role to a restriction query.
 *
 * See {@link #addRoleToRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>addRoleToRestrictionQueryAsync(String restrictionQueryId, RelationshipToRole body) {
    return addRoleToRestrictionQueryWithHttpInfoAsync(restrictionQueryId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Adds a role to a restriction query.</p>
   * <p><strong>Note</strong>: This operation automatically grants the <code>logs_read_data</code> permission to the role if it doesn't already have it.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> addRoleToRestrictionQueryWithHttpInfo(String restrictionQueryId, RelationshipToRole body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "addRoleToRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling addRoleToRestrictionQuery");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addRoleToRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.addRoleToRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Grant role to a restriction query.
   *
   * See {@link #addRoleToRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> addRoleToRestrictionQueryWithHttpInfoAsync(String restrictionQueryId, RelationshipToRole body) {
    // Check if unstable operation is enabled
    String operationId = "addRoleToRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling addRoleToRestrictionQuery"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling addRoleToRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.addRoleToRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Create a restriction query.
 *
 * See {@link #createRestrictionQueryWithHttpInfo}.
 *
 * @param body  (required)
 * @return RestrictionQueryWithoutRelationshipsResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryWithoutRelationshipsResponse  createRestrictionQuery(RestrictionQueryCreatePayload body) throws ApiException {
    return createRestrictionQueryWithHttpInfo(body).getData();
  }

  /**
 * Create a restriction query.
 *
 * See {@link #createRestrictionQueryWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
 */
  public CompletableFuture<RestrictionQueryWithoutRelationshipsResponse>createRestrictionQueryAsync(RestrictionQueryCreatePayload body) {
    return createRestrictionQueryWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new restriction query for your organization.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
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
   */
  public ApiResponse<RestrictionQueryWithoutRelationshipsResponse> createRestrictionQueryWithHttpInfo(RestrictionQueryCreatePayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.createRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }

  /**
   * Create a restriction query.
   *
   * See {@link #createRestrictionQueryWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> createRestrictionQueryWithHttpInfoAsync(RestrictionQueryCreatePayload body) {
    // Check if unstable operation is enabled
    String operationId = "createRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.createRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }

  /**
 * Delete a restriction query.
 *
 * See {@link #deleteRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteRestrictionQuery(String restrictionQueryId) throws ApiException {
    deleteRestrictionQueryWithHttpInfo(restrictionQueryId);
  }

  /**
 * Delete a restriction query.
 *
 * See {@link #deleteRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteRestrictionQueryAsync(String restrictionQueryId) {
    return deleteRestrictionQueryWithHttpInfoAsync(restrictionQueryId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Deletes a restriction query.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRestrictionQueryWithHttpInfo(String restrictionQueryId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling deleteRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.deleteRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a restriction query.
   *
   * See {@link #deleteRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRestrictionQueryWithHttpInfoAsync(String restrictionQueryId) {
    // Check if unstable operation is enabled
    String operationId = "deleteRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling deleteRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.deleteRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a restriction query.
 *
 * See {@link #getRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @return RestrictionQueryWithRelationshipsResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryWithRelationshipsResponse  getRestrictionQuery(String restrictionQueryId) throws ApiException {
    return getRestrictionQueryWithHttpInfo(restrictionQueryId).getData();
  }

  /**
 * Get a restriction query.
 *
 * See {@link #getRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @return CompletableFuture&lt;RestrictionQueryWithRelationshipsResponse&gt;
 */
  public CompletableFuture<RestrictionQueryWithRelationshipsResponse>getRestrictionQueryAsync(String restrictionQueryId) {
    return getRestrictionQueryWithHttpInfoAsync(restrictionQueryId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a restriction query in the organization specified by the restriction query's <code>restriction_query_id</code>.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @return ApiResponse&lt;RestrictionQueryWithRelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryWithRelationshipsResponse> getRestrictionQueryWithHttpInfo(String restrictionQueryId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling getRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.getRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithRelationshipsResponse>() {});
  }

  /**
   * Get a restriction query.
   *
   * See {@link #getRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryWithRelationshipsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryWithRelationshipsResponse>> getRestrictionQueryWithHttpInfoAsync(String restrictionQueryId) {
    // Check if unstable operation is enabled
    String operationId = "getRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryWithRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling getRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.getRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryWithRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithRelationshipsResponse>() {});
  }

  /**
 * Get restriction query for a given role.
 *
 * See {@link #getRoleRestrictionQueryWithHttpInfo}.
 *
 * @param roleId The ID of the role. (required)
 * @return RestrictionQueryListResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryListResponse  getRoleRestrictionQuery(String roleId) throws ApiException {
    return getRoleRestrictionQueryWithHttpInfo(roleId).getData();
  }

  /**
 * Get restriction query for a given role.
 *
 * See {@link #getRoleRestrictionQueryWithHttpInfoAsync}.
 *
 * @param roleId The ID of the role. (required)
 * @return CompletableFuture&lt;RestrictionQueryListResponse&gt;
 */
  public CompletableFuture<RestrictionQueryListResponse>getRoleRestrictionQueryAsync(String roleId) {
    return getRoleRestrictionQueryWithHttpInfoAsync(roleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get restriction query for a given role.</p>
   *
   * @param roleId The ID of the role. (required)
   * @return ApiResponse&lt;RestrictionQueryListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryListResponse> getRoleRestrictionQueryWithHttpInfo(String roleId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRoleRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRoleRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/role/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.getRoleRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
   * Get restriction query for a given role.
   *
   * See {@link #getRoleRestrictionQueryWithHttpInfo}.
   *
   * @param roleId The ID of the role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryListResponse>> getRoleRestrictionQueryWithHttpInfoAsync(String roleId) {
    // Check if unstable operation is enabled
    String operationId = "getRoleRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'roleId' when calling getRoleRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/role/{role_id}"
      .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.getRoleRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
   * Manage optional parameters to listRestrictionQueries.
   */
  public static class ListRestrictionQueriesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListRestrictionQueriesOptionalParameters
     */
    public ListRestrictionQueriesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRestrictionQueriesOptionalParameters
     */
    public ListRestrictionQueriesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * List restriction queries.
 *
 * See {@link #listRestrictionQueriesWithHttpInfo}.
 *
 * @return RestrictionQueryListResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryListResponse listRestrictionQueries () throws ApiException {
    return listRestrictionQueriesWithHttpInfo(new ListRestrictionQueriesOptionalParameters()).getData();
  }

  /**
 * List restriction queries.
 *
 * See {@link #listRestrictionQueriesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;RestrictionQueryListResponse&gt;
 */
  public CompletableFuture<RestrictionQueryListResponse>listRestrictionQueriesAsync() {
    return listRestrictionQueriesWithHttpInfoAsync(new ListRestrictionQueriesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List restriction queries.
 *
 * See {@link #listRestrictionQueriesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return RestrictionQueryListResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryListResponse listRestrictionQueries(ListRestrictionQueriesOptionalParameters parameters) throws ApiException {
    return listRestrictionQueriesWithHttpInfo(parameters).getData();
  }

  /**
 * List restriction queries.
 *
 * See {@link #listRestrictionQueriesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;RestrictionQueryListResponse&gt;
 */
  public CompletableFuture<RestrictionQueryListResponse>listRestrictionQueriesAsync(ListRestrictionQueriesOptionalParameters parameters) {
    return listRestrictionQueriesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns all restriction queries, including their names and IDs.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RestrictionQueryListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryListResponse> listRestrictionQueriesWithHttpInfo(ListRestrictionQueriesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRestrictionQueries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listRestrictionQueries", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
   * List restriction queries.
   *
   * See {@link #listRestrictionQueriesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryListResponse>> listRestrictionQueriesWithHttpInfoAsync(ListRestrictionQueriesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listRestrictionQueries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listRestrictionQueries", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
   * Manage optional parameters to listRestrictionQueryRoles.
   */
  public static class ListRestrictionQueryRolesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListRestrictionQueryRolesOptionalParameters
     */
    public ListRestrictionQueryRolesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListRestrictionQueryRolesOptionalParameters
     */
    public ListRestrictionQueryRolesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * List roles for a restriction query.
 *
 * See {@link #listRestrictionQueryRolesWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @return RestrictionQueryRolesResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryRolesResponse listRestrictionQueryRoles (String restrictionQueryId) throws ApiException {
    return listRestrictionQueryRolesWithHttpInfo( restrictionQueryId, new ListRestrictionQueryRolesOptionalParameters()).getData();
  }

  /**
 * List roles for a restriction query.
 *
 * See {@link #listRestrictionQueryRolesWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @return CompletableFuture&lt;RestrictionQueryRolesResponse&gt;
 */
  public CompletableFuture<RestrictionQueryRolesResponse>listRestrictionQueryRolesAsync(String restrictionQueryId) {
    return listRestrictionQueryRolesWithHttpInfoAsync(restrictionQueryId, new ListRestrictionQueryRolesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List roles for a restriction query.
 *
 * See {@link #listRestrictionQueryRolesWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param parameters Optional parameters for the request.
 * @return RestrictionQueryRolesResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryRolesResponse listRestrictionQueryRoles(String restrictionQueryId, ListRestrictionQueryRolesOptionalParameters parameters) throws ApiException {
    return listRestrictionQueryRolesWithHttpInfo(restrictionQueryId, parameters).getData();
  }

  /**
 * List roles for a restriction query.
 *
 * See {@link #listRestrictionQueryRolesWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;RestrictionQueryRolesResponse&gt;
 */
  public CompletableFuture<RestrictionQueryRolesResponse>listRestrictionQueryRolesAsync( String restrictionQueryId, ListRestrictionQueryRolesOptionalParameters parameters) {
    return listRestrictionQueryRolesWithHttpInfoAsync(restrictionQueryId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns all roles that have a given restriction query.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RestrictionQueryRolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryRolesResponse> listRestrictionQueryRolesWithHttpInfo(String restrictionQueryId, ListRestrictionQueryRolesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRestrictionQueryRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling listRestrictionQueryRoles");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listRestrictionQueryRoles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryRolesResponse>() {});
  }

  /**
   * List roles for a restriction query.
   *
   * See {@link #listRestrictionQueryRolesWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryRolesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryRolesResponse>> listRestrictionQueryRolesWithHttpInfoAsync(String restrictionQueryId, ListRestrictionQueryRolesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listRestrictionQueryRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryRolesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryRolesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling listRestrictionQueryRoles"));
        return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listRestrictionQueryRoles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryRolesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryRolesResponse>() {});
  }

  /**
 * Get all restriction queries for a given user.
 *
 * See {@link #listUserRestrictionQueriesWithHttpInfo}.
 *
 * @param userId The ID of the user. (required)
 * @return RestrictionQueryListResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryListResponse  listUserRestrictionQueries(String userId) throws ApiException {
    return listUserRestrictionQueriesWithHttpInfo(userId).getData();
  }

  /**
 * Get all restriction queries for a given user.
 *
 * See {@link #listUserRestrictionQueriesWithHttpInfoAsync}.
 *
 * @param userId The ID of the user. (required)
 * @return CompletableFuture&lt;RestrictionQueryListResponse&gt;
 */
  public CompletableFuture<RestrictionQueryListResponse>listUserRestrictionQueriesAsync(String userId) {
    return listUserRestrictionQueriesWithHttpInfoAsync(userId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all restriction queries for a given user.</p>
   *
   * @param userId The ID of the user. (required)
   * @return ApiResponse&lt;RestrictionQueryListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryListResponse> listUserRestrictionQueriesWithHttpInfo(String userId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listUserRestrictionQueries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listUserRestrictionQueries");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/user/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listUserRestrictionQueries", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
   * Get all restriction queries for a given user.
   *
   * See {@link #listUserRestrictionQueriesWithHttpInfo}.
   *
   * @param userId The ID of the user. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryListResponse>> listUserRestrictionQueriesWithHttpInfoAsync(String userId) {
    // Check if unstable operation is enabled
    String operationId = "listUserRestrictionQueries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'userId' when calling listUserRestrictionQueries"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/user/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.listUserRestrictionQueries", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryListResponse>() {});
  }

  /**
 * Revoke role from a restriction query.
 *
 * See {@link #removeRoleFromRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  removeRoleFromRestrictionQuery(String restrictionQueryId, RelationshipToRole body) throws ApiException {
    removeRoleFromRestrictionQueryWithHttpInfo(restrictionQueryId, body);
  }

  /**
 * Revoke role from a restriction query.
 *
 * See {@link #removeRoleFromRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>removeRoleFromRestrictionQueryAsync(String restrictionQueryId, RelationshipToRole body) {
    return removeRoleFromRestrictionQueryWithHttpInfoAsync(restrictionQueryId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Removes a role from a restriction query.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeRoleFromRestrictionQueryWithHttpInfo(String restrictionQueryId, RelationshipToRole body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "removeRoleFromRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling removeRoleFromRestrictionQuery");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeRoleFromRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.removeRoleFromRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Revoke role from a restriction query.
   *
   * See {@link #removeRoleFromRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeRoleFromRestrictionQueryWithHttpInfoAsync(String restrictionQueryId, RelationshipToRole body) {
    // Check if unstable operation is enabled
    String operationId = "removeRoleFromRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling removeRoleFromRestrictionQuery"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling removeRoleFromRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}/roles"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.removeRoleFromRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Replace a restriction query.
 *
 * See {@link #replaceRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return RestrictionQueryWithoutRelationshipsResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryWithoutRelationshipsResponse  replaceRestrictionQuery(String restrictionQueryId, RestrictionQueryUpdatePayload body) throws ApiException {
    return replaceRestrictionQueryWithHttpInfo(restrictionQueryId, body).getData();
  }

  /**
 * Replace a restriction query.
 *
 * See {@link #replaceRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
 */
  public CompletableFuture<RestrictionQueryWithoutRelationshipsResponse>replaceRestrictionQueryAsync(String restrictionQueryId, RestrictionQueryUpdatePayload body) {
    return replaceRestrictionQueryWithHttpInfoAsync(restrictionQueryId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Replace a restriction query.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryWithoutRelationshipsResponse> replaceRestrictionQueryWithHttpInfo(String restrictionQueryId, RestrictionQueryUpdatePayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "replaceRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling replaceRestrictionQuery");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.replaceRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }

  /**
   * Replace a restriction query.
   *
   * See {@link #replaceRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> replaceRestrictionQueryWithHttpInfoAsync(String restrictionQueryId, RestrictionQueryUpdatePayload body) {
    // Check if unstable operation is enabled
    String operationId = "replaceRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling replaceRestrictionQuery"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling replaceRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.replaceRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }

  /**
 * Update a restriction query.
 *
 * See {@link #updateRestrictionQueryWithHttpInfo}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return RestrictionQueryWithoutRelationshipsResponse
 * @throws ApiException if fails to make API call
 */
  public RestrictionQueryWithoutRelationshipsResponse  updateRestrictionQuery(String restrictionQueryId, RestrictionQueryUpdatePayload body) throws ApiException {
    return updateRestrictionQueryWithHttpInfo(restrictionQueryId, body).getData();
  }

  /**
 * Update a restriction query.
 *
 * See {@link #updateRestrictionQueryWithHttpInfoAsync}.
 *
 * @param restrictionQueryId The ID of the restriction query. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
 */
  public CompletableFuture<RestrictionQueryWithoutRelationshipsResponse>updateRestrictionQueryAsync(String restrictionQueryId, RestrictionQueryUpdatePayload body) {
    return updateRestrictionQueryWithHttpInfoAsync(restrictionQueryId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit a restriction query.</p>
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RestrictionQueryWithoutRelationshipsResponse> updateRestrictionQueryWithHttpInfo(String restrictionQueryId, RestrictionQueryUpdatePayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
      throw new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling updateRestrictionQuery");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRestrictionQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.updateRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }

  /**
   * Update a restriction query.
   *
   * See {@link #updateRestrictionQueryWithHttpInfo}.
   *
   * @param restrictionQueryId The ID of the restriction query. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RestrictionQueryWithoutRelationshipsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> updateRestrictionQueryWithHttpInfoAsync(String restrictionQueryId, RestrictionQueryUpdatePayload body) {
    // Check if unstable operation is enabled
    String operationId = "updateRestrictionQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'restrictionQueryId' is set
    if (restrictionQueryId == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'restrictionQueryId' when calling updateRestrictionQuery"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateRestrictionQuery"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/restriction_queries/{restriction_query_id}"
      .replaceAll("\\{" + "restriction_query_id" + "\\}", apiClient.escapeString(restrictionQueryId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsRestrictionQueriesApi.updateRestrictionQuery", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RestrictionQueryWithoutRelationshipsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RestrictionQueryWithoutRelationshipsResponse>() {});
  }
}