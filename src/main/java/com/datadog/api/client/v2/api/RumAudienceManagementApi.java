
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
import com.datadog.api.client.v2.model.FacetInfoResponse;
import com.datadog.api.client.v2.model.FacetInfoRequest;
import com.datadog.api.client.v2.model.QueryResponse;
import com.datadog.api.client.v2.model.QueryAccountRequest;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequest;
import com.datadog.api.client.v2.model.QueryUsersRequest;
import com.datadog.api.client.v2.model.GetMappingResponse;
import com.datadog.api.client.v2.model.CreateConnectionRequest;
import com.datadog.api.client.v2.model.UpdateConnectionRequest;
import com.datadog.api.client.v2.model.ListConnectionsResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumAudienceManagementApi {
  private ApiClient apiClient;
  public RumAudienceManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumAudienceManagementApi(ApiClient apiClient) {
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
 * Create connection.
 *
 * See {@link #createConnectionWithHttpInfo}.
 *
 * @param entity The entity for which to create the connection (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  createConnection(String entity, CreateConnectionRequest body) throws ApiException {
    createConnectionWithHttpInfo(entity, body);
  }

  /**
 * Create connection.
 *
 * See {@link #createConnectionWithHttpInfoAsync}.
 *
 * @param entity The entity for which to create the connection (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>createConnectionAsync(String entity, CreateConnectionRequest body) {
    return createConnectionWithHttpInfoAsync(entity, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new data connection and its fields for an entity</p>
   *
   * @param entity The entity for which to create the connection (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Connection created successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createConnectionWithHttpInfo(String entity, CreateConnectionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling createConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.createConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Create connection.
   *
   * See {@link #createConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to create the connection (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createConnectionWithHttpInfoAsync(String entity, CreateConnectionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entity' when calling createConnection"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.createConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete connection.
 *
 * See {@link #deleteConnectionWithHttpInfo}.
 *
 * @param id The connection ID to delete (required)
 * @param entity The entity for which to delete the connection (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteConnection(String id, String entity) throws ApiException {
    deleteConnectionWithHttpInfo(id, entity);
  }

  /**
 * Delete connection.
 *
 * See {@link #deleteConnectionWithHttpInfoAsync}.
 *
 * @param id The connection ID to delete (required)
 * @param entity The entity for which to delete the connection (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteConnectionAsync(String id, String entity) {
    return deleteConnectionWithHttpInfoAsync(id, entity).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an existing data connection for an entity</p>
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Connection deleted successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteConnectionWithHttpInfo(String id, String entity) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteConnection");
    }

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling deleteConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.deleteConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete connection.
   *
   * See {@link #deleteConnectionWithHttpInfo}.
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteConnectionWithHttpInfoAsync(String id, String entity) {
    // Check if unstable operation is enabled
    String operationId = "deleteConnection";
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
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling deleteConnection"));
        return result;
    }

    // verify the required parameter 'entity' is set
    if (entity == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entity' when calling deleteConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.deleteConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get account facet info.
 *
 * See {@link #getAccountFacetInfoWithHttpInfo}.
 *
 * @param body  (required)
 * @return FacetInfoResponse
 * @throws ApiException if fails to make API call
 */
  public FacetInfoResponse  getAccountFacetInfo(FacetInfoRequest body) throws ApiException {
    return getAccountFacetInfoWithHttpInfo(body).getData();
  }

  /**
 * Get account facet info.
 *
 * See {@link #getAccountFacetInfoWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FacetInfoResponse&gt;
 */
  public CompletableFuture<FacetInfoResponse>getAccountFacetInfoAsync(FacetInfoRequest body) {
    return getAccountFacetInfoWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get facet information for account attributes including possible values and counts</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FacetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with facet information </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FacetInfoResponse> getAccountFacetInfoWithHttpInfo(FacetInfoRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAccountFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getAccountFacetInfo");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/facet_info";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getAccountFacetInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FacetInfoResponse>() {});
  }

  /**
   * Get account facet info.
   *
   * See {@link #getAccountFacetInfoWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FacetInfoResponse>> getAccountFacetInfoWithHttpInfoAsync(FacetInfoRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getAccountFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling getAccountFacetInfo"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/facet_info";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getAccountFacetInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FacetInfoResponse>() {});
  }

  /**
 * Get mapping.
 *
 * See {@link #getMappingWithHttpInfo}.
 *
 * @param entity The entity for which to get the mapping (required)
 * @return GetMappingResponse
 * @throws ApiException if fails to make API call
 */
  public GetMappingResponse  getMapping(String entity) throws ApiException {
    return getMappingWithHttpInfo(entity).getData();
  }

  /**
 * Get mapping.
 *
 * See {@link #getMappingWithHttpInfoAsync}.
 *
 * @param entity The entity for which to get the mapping (required)
 * @return CompletableFuture&lt;GetMappingResponse&gt;
 */
  public CompletableFuture<GetMappingResponse>getMappingAsync(String entity) {
    return getMappingWithHttpInfoAsync(entity).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get entity mapping configuration including all available attributes and their properties</p>
   *
   * @param entity The entity for which to get the mapping (required)
   * @return ApiResponse&lt;GetMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with entity mapping configuration </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetMappingResponse> getMappingWithHttpInfo(String entity) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling getMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetMappingResponse>() {});
  }

  /**
   * Get mapping.
   *
   * See {@link #getMappingWithHttpInfo}.
   *
   * @param entity The entity for which to get the mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetMappingResponse>> getMappingWithHttpInfoAsync(String entity) {
    // Check if unstable operation is enabled
    String operationId = "getMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
        CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entity' when calling getMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetMappingResponse>() {});
  }

  /**
 * Get user facet info.
 *
 * See {@link #getUserFacetInfoWithHttpInfo}.
 *
 * @param body  (required)
 * @return FacetInfoResponse
 * @throws ApiException if fails to make API call
 */
  public FacetInfoResponse  getUserFacetInfo(FacetInfoRequest body) throws ApiException {
    return getUserFacetInfoWithHttpInfo(body).getData();
  }

  /**
 * Get user facet info.
 *
 * See {@link #getUserFacetInfoWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FacetInfoResponse&gt;
 */
  public CompletableFuture<FacetInfoResponse>getUserFacetInfoAsync(FacetInfoRequest body) {
    return getUserFacetInfoWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get facet information for user attributes including possible values and counts</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FacetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with facet information </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FacetInfoResponse> getUserFacetInfoWithHttpInfo(FacetInfoRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getUserFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getUserFacetInfo");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/facet_info";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getUserFacetInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FacetInfoResponse>() {});
  }

  /**
   * Get user facet info.
   *
   * See {@link #getUserFacetInfoWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FacetInfoResponse>> getUserFacetInfoWithHttpInfoAsync(FacetInfoRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getUserFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling getUserFacetInfo"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/facet_info";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.getUserFacetInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FacetInfoResponse>() {});
  }

  /**
 * List connections.
 *
 * See {@link #listConnectionsWithHttpInfo}.
 *
 * @param entity The entity for which to list connections (required)
 * @return ListConnectionsResponse
 * @throws ApiException if fails to make API call
 */
  public ListConnectionsResponse  listConnections(String entity) throws ApiException {
    return listConnectionsWithHttpInfo(entity).getData();
  }

  /**
 * List connections.
 *
 * See {@link #listConnectionsWithHttpInfoAsync}.
 *
 * @param entity The entity for which to list connections (required)
 * @return CompletableFuture&lt;ListConnectionsResponse&gt;
 */
  public CompletableFuture<ListConnectionsResponse>listConnectionsAsync(String entity) {
    return listConnectionsWithHttpInfoAsync(entity).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List all data connections for an entity</p>
   *
   * @param entity The entity for which to list connections (required)
   * @return ApiResponse&lt;ListConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with list of connections </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListConnectionsResponse> listConnectionsWithHttpInfo(String entity) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling listConnections");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connections"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.listConnections", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListConnectionsResponse>() {});
  }

  /**
   * List connections.
   *
   * See {@link #listConnectionsWithHttpInfo}.
   *
   * @param entity The entity for which to list connections (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListConnectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListConnectionsResponse>> listConnectionsWithHttpInfoAsync(String entity) {
    // Check if unstable operation is enabled
    String operationId = "listConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
        CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entity' when calling listConnections"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connections"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.listConnections", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListConnectionsResponse>() {});
  }

  /**
 * Query accounts.
 *
 * See {@link #queryAccountsWithHttpInfo}.
 *
 * @param body  (required)
 * @return QueryResponse
 * @throws ApiException if fails to make API call
 */
  public QueryResponse  queryAccounts(QueryAccountRequest body) throws ApiException {
    return queryAccountsWithHttpInfo(body).getData();
  }

  /**
 * Query accounts.
 *
 * See {@link #queryAccountsWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;QueryResponse&gt;
 */
  public CompletableFuture<QueryResponse>queryAccountsAsync(QueryAccountRequest body) {
    return queryAccountsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Query accounts with flexible filtering by account properties</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with account data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryAccountsWithHttpInfo(QueryAccountRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling queryAccounts");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
   * Query accounts.
   *
   * See {@link #queryAccountsWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryAccountsWithHttpInfoAsync(QueryAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling queryAccounts"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
 * Query event filtered users.
 *
 * See {@link #queryEventFilteredUsersWithHttpInfo}.
 *
 * @param body  (required)
 * @return QueryResponse
 * @throws ApiException if fails to make API call
 */
  public QueryResponse  queryEventFilteredUsers(QueryEventFilteredUsersRequest body) throws ApiException {
    return queryEventFilteredUsersWithHttpInfo(body).getData();
  }

  /**
 * Query event filtered users.
 *
 * See {@link #queryEventFilteredUsersWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;QueryResponse&gt;
 */
  public CompletableFuture<QueryResponse>queryEventFilteredUsersAsync(QueryEventFilteredUsersRequest body) {
    return queryEventFilteredUsersWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Query users filtered by both user properties and event platform data</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with filtered user data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryEventFilteredUsersWithHttpInfo(QueryEventFilteredUsersRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryEventFilteredUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling queryEventFilteredUsers");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/event_filtered_query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryEventFilteredUsers", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
   * Query event filtered users.
   *
   * See {@link #queryEventFilteredUsersWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryEventFilteredUsersWithHttpInfoAsync(QueryEventFilteredUsersRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryEventFilteredUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling queryEventFilteredUsers"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/event_filtered_query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryEventFilteredUsers", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
 * Query users.
 *
 * See {@link #queryUsersWithHttpInfo}.
 *
 * @param body  (required)
 * @return QueryResponse
 * @throws ApiException if fails to make API call
 */
  public QueryResponse  queryUsers(QueryUsersRequest body) throws ApiException {
    return queryUsersWithHttpInfo(body).getData();
  }

  /**
 * Query users.
 *
 * See {@link #queryUsersWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;QueryResponse&gt;
 */
  public CompletableFuture<QueryResponse>queryUsersAsync(QueryUsersRequest body) {
    return queryUsersWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Query users with flexible filtering by user properties, with optional wildcard search</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with user data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryUsersWithHttpInfo(QueryUsersRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling queryUsers");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryUsers", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
   * Query users.
   *
   * See {@link #queryUsersWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryUsersWithHttpInfoAsync(QueryUsersRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling queryUsers"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/query";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.queryUsers", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<QueryResponse>() {});
  }

  /**
 * Update connection.
 *
 * See {@link #updateConnectionWithHttpInfo}.
 *
 * @param entity The entity for which to update the connection (required)
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  updateConnection(String entity, UpdateConnectionRequest body) throws ApiException {
    updateConnectionWithHttpInfo(entity, body);
  }

  /**
 * Update connection.
 *
 * See {@link #updateConnectionWithHttpInfoAsync}.
 *
 * @param entity The entity for which to update the connection (required)
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>updateConnectionAsync(String entity, UpdateConnectionRequest body) {
    return updateConnectionWithHttpInfoAsync(entity, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an existing data connection by adding, updating, or deleting fields</p>
   *
   * @param entity The entity for which to update the connection (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Connection updated successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateConnectionWithHttpInfo(String entity, UpdateConnectionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling updateConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.RumAudienceManagementApi.updateConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Update connection.
   *
   * See {@link #updateConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to update the connection (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateConnectionWithHttpInfoAsync(String entity, UpdateConnectionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entity' when calling updateConnection"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/{entity}/mapping/connection"
      .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumAudienceManagementApi.updateConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }
}