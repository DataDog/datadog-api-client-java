package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateConnectionRequest;
import com.datadog.api.client.v2.model.FacetInfoRequest;
import com.datadog.api.client.v2.model.FacetInfoResponse;
import com.datadog.api.client.v2.model.GetMappingResponse;
import com.datadog.api.client.v2.model.ListConnectionsResponse;
import com.datadog.api.client.v2.model.QueryAccountRequest;
import com.datadog.api.client.v2.model.QueryEventFilteredUsersRequest;
import com.datadog.api.client.v2.model.QueryResponse;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.QueryUsersRequest;
import com.datadog.api.client.v2.model.SegmentCreateRequest;
import com.datadog.api.client.v2.model.SegmentDeleteResponse;
import com.datadog.api.client.v2.model.SegmentEntity;
import com.datadog.api.client.v2.model.SegmentPreviewRequest;
import com.datadog.api.client.v2.model.SegmentPreviewResponse;
import com.datadog.api.client.v2.model.SegmentResponse;
import com.datadog.api.client.v2.model.SegmentSortColumn;
import com.datadog.api.client.v2.model.SegmentUpdateRequest;
import com.datadog.api.client.v2.model.SegmentsResponse;
import com.datadog.api.client.v2.model.UpdateConnectionRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * <p>See {@link #createConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to create the connection (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createConnection(String entity, CreateConnectionRequest body) throws ApiException {
    createConnectionWithHttpInfo(entity, body);
  }

  /**
   * Create connection.
   *
   * <p>See {@link #createConnectionWithHttpInfoAsync}.
   *
   * @param entity The entity for which to create the connection (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createConnectionAsync(
      String entity, CreateConnectionRequest body) {
    return createConnectionWithHttpInfoAsync(entity, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new data connection and its fields for an entity
   *
   * @param entity The entity for which to create the connection (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Connection created successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createConnectionWithHttpInfo(String entity, CreateConnectionRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'entity' when calling createConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.createConnection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create connection.
   *
   * <p>See {@link #createConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to create the connection (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createConnectionWithHttpInfoAsync(
      String entity, CreateConnectionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entity' when calling createConnection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.createConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create a segment.
   *
   * <p>See {@link #createProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return SegmentResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentResponse createProductAnalyticsSegment(SegmentCreateRequest body)
      throws ApiException {
    return createProductAnalyticsSegmentWithHttpInfo(body).getData();
  }

  /**
   * Create a segment.
   *
   * <p>See {@link #createProductAnalyticsSegmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SegmentResponse&gt;
   */
  public CompletableFuture<SegmentResponse> createProductAnalyticsSegmentAsync(
      SegmentCreateRequest body) {
    return createProductAnalyticsSegmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a user or account segment. The <code>data_query</code> defines who belongs to the
   * segment. Segment names must be unique in the organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;SegmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SegmentResponse> createProductAnalyticsSegmentWithHttpInfo(
      SegmentCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProductAnalyticsSegment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.createProductAnalyticsSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentResponse>() {});
  }

  /**
   * Create a segment.
   *
   * <p>See {@link #createProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SegmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SegmentResponse>>
      createProductAnalyticsSegmentWithHttpInfoAsync(SegmentCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createProductAnalyticsSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.createProductAnalyticsSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentResponse>() {});
  }

  /**
   * Delete connection.
   *
   * <p>See {@link #deleteConnectionWithHttpInfo}.
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConnection(String id, String entity) throws ApiException {
    deleteConnectionWithHttpInfo(id, entity);
  }

  /**
   * Delete connection.
   *
   * <p>See {@link #deleteConnectionWithHttpInfoAsync}.
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteConnectionAsync(String id, String entity) {
    return deleteConnectionWithHttpInfoAsync(id, entity)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing data connection for an entity
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Connection deleted successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteConnectionWithHttpInfo(String id, String entity)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteConnection");
    }

    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(
          400, "Missing the required parameter 'entity' when calling deleteConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.deleteConnection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete connection.
   *
   * <p>See {@link #deleteConnectionWithHttpInfo}.
   *
   * @param id The connection ID to delete (required)
   * @param entity The entity for which to delete the connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteConnectionWithHttpInfoAsync(
      String id, String entity) {
    // Check if unstable operation is enabled
    String operationId = "deleteConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteConnection"));
      return result;
    }

    // verify the required parameter 'entity' is set
    if (entity == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entity' when calling deleteConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.deleteConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a segment.
   *
   * <p>See {@link #deleteProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @return SegmentDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentDeleteResponse deleteProductAnalyticsSegment(String id) throws ApiException {
    return deleteProductAnalyticsSegmentWithHttpInfo(id).getData();
  }

  /**
   * Delete a segment.
   *
   * <p>See {@link #deleteProductAnalyticsSegmentWithHttpInfoAsync}.
   *
   * @param id ID of the segment. (required)
   * @return CompletableFuture&lt;SegmentDeleteResponse&gt;
   */
  public CompletableFuture<SegmentDeleteResponse> deleteProductAnalyticsSegmentAsync(String id) {
    return deleteProductAnalyticsSegmentWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a segment. Segments created by users are deleted permanently. Segments created by
   * Datadog, and segments based on an uploaded list, are disabled instead.
   *
   * @param id ID of the segment. (required)
   * @return ApiResponse&lt;SegmentDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SegmentDeleteResponse> deleteProductAnalyticsSegmentWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteProductAnalyticsSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.deleteProductAnalyticsSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentDeleteResponse>() {});
  }

  /**
   * Delete a segment.
   *
   * <p>See {@link #deleteProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SegmentDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SegmentDeleteResponse>>
      deleteProductAnalyticsSegmentWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SegmentDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<SegmentDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteProductAnalyticsSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.deleteProductAnalyticsSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SegmentDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentDeleteResponse>() {});
  }

  /**
   * Delete a user profile.
   *
   * <p>See {@link #deleteUserProfileWithHttpInfo}.
   *
   * @param userId The ID of the user to delete, as sent in the <code>usr.id</code> attribute.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserProfile(String userId) throws ApiException {
    deleteUserProfileWithHttpInfo(userId);
  }

  /**
   * Delete a user profile.
   *
   * <p>See {@link #deleteUserProfileWithHttpInfoAsync}.
   *
   * @param userId The ID of the user to delete, as sent in the <code>usr.id</code> attribute.
   *     (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteUserProfileAsync(String userId) {
    return deleteUserProfileWithHttpInfoAsync(userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Product Analytics user profile. Deletion is asynchronous: the request is accepted and
   * the profile is removed shortly after, usually within a few minutes. This only deletes the user
   * profile. To delete the RUM events of the user, use the RUM data deletion API.
   *
   * @param userId The ID of the user to delete, as sent in the <code>usr.id</code> attribute.
   *     (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Deletion accepted; the profile will be removed asynchronously </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteUserProfileWithHttpInfo(String userId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteUserProfile";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling deleteUserProfile");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.deleteUserProfile",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a user profile.
   *
   * <p>See {@link #deleteUserProfileWithHttpInfo}.
   *
   * @param userId The ID of the user to delete, as sent in the <code>usr.id</code> attribute.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteUserProfileWithHttpInfoAsync(String userId) {
    // Check if unstable operation is enabled
    String operationId = "deleteUserProfile";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling deleteUserProfile"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/users/{user_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.deleteUserProfile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get account facet info.
   *
   * <p>See {@link #getAccountFacetInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return FacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public FacetInfoResponse getAccountFacetInfo(FacetInfoRequest body) throws ApiException {
    return getAccountFacetInfoWithHttpInfo(body).getData();
  }

  /**
   * Get account facet info.
   *
   * <p>See {@link #getAccountFacetInfoWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FacetInfoResponse&gt;
   */
  public CompletableFuture<FacetInfoResponse> getAccountFacetInfoAsync(FacetInfoRequest body) {
    return getAccountFacetInfoWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get facet information for account attributes including possible values and counts
   *
   * @param body (required)
   * @return ApiResponse&lt;FacetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with facet information </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FacetInfoResponse> getAccountFacetInfoWithHttpInfo(FacetInfoRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getAccountFacetInfo");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/facet_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.getAccountFacetInfo",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FacetInfoResponse>() {});
  }

  /**
   * Get account facet info.
   *
   * <p>See {@link #getAccountFacetInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FacetInfoResponse>> getAccountFacetInfoWithHttpInfoAsync(
      FacetInfoRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getAccountFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling getAccountFacetInfo"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/facet_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.getAccountFacetInfo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FacetInfoResponse>() {});
  }

  /**
   * Get mapping.
   *
   * <p>See {@link #getMappingWithHttpInfo}.
   *
   * @param entity The entity for which to get the mapping (required)
   * @return GetMappingResponse
   * @throws ApiException if fails to make API call
   */
  public GetMappingResponse getMapping(String entity) throws ApiException {
    return getMappingWithHttpInfo(entity).getData();
  }

  /**
   * Get mapping.
   *
   * <p>See {@link #getMappingWithHttpInfoAsync}.
   *
   * @param entity The entity for which to get the mapping (required)
   * @return CompletableFuture&lt;GetMappingResponse&gt;
   */
  public CompletableFuture<GetMappingResponse> getMappingAsync(String entity) {
    return getMappingWithHttpInfoAsync(entity)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get entity mapping configuration including all available attributes and their properties
   *
   * @param entity The entity for which to get the mapping (required)
   * @return ApiResponse&lt;GetMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
      throw new ApiException(
          400, "Missing the required parameter 'entity' when calling getMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.getMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GetMappingResponse>() {});
  }

  /**
   * Get mapping.
   *
   * <p>See {@link #getMappingWithHttpInfo}.
   *
   * @param entity The entity for which to get the mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetMappingResponse>> getMappingWithHttpInfoAsync(
      String entity) {
    // Check if unstable operation is enabled
    String operationId = "getMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'entity' when calling getMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.getMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GetMappingResponse>() {});
  }

  /**
   * Get a segment.
   *
   * <p>See {@link #getProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @return SegmentResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentResponse getProductAnalyticsSegment(String id) throws ApiException {
    return getProductAnalyticsSegmentWithHttpInfo(id).getData();
  }

  /**
   * Get a segment.
   *
   * <p>See {@link #getProductAnalyticsSegmentWithHttpInfoAsync}.
   *
   * @param id ID of the segment. (required)
   * @return CompletableFuture&lt;SegmentResponse&gt;
   */
  public CompletableFuture<SegmentResponse> getProductAnalyticsSegmentAsync(String id) {
    return getProductAnalyticsSegmentWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a segment by ID, including its definition.
   *
   * @param id ID of the segment. (required)
   * @return ApiResponse&lt;SegmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SegmentResponse> getProductAnalyticsSegmentWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getProductAnalyticsSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.getProductAnalyticsSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentResponse>() {});
  }

  /**
   * Get a segment.
   *
   * <p>See {@link #getProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SegmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SegmentResponse>>
      getProductAnalyticsSegmentWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getProductAnalyticsSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.getProductAnalyticsSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentResponse>() {});
  }

  /**
   * Get user facet info.
   *
   * <p>See {@link #getUserFacetInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return FacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public FacetInfoResponse getUserFacetInfo(FacetInfoRequest body) throws ApiException {
    return getUserFacetInfoWithHttpInfo(body).getData();
  }

  /**
   * Get user facet info.
   *
   * <p>See {@link #getUserFacetInfoWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FacetInfoResponse&gt;
   */
  public CompletableFuture<FacetInfoResponse> getUserFacetInfoAsync(FacetInfoRequest body) {
    return getUserFacetInfoWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get facet information for user attributes including possible values and counts
   *
   * @param body (required)
   * @return ApiResponse&lt;FacetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with facet information </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FacetInfoResponse> getUserFacetInfoWithHttpInfo(FacetInfoRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getUserFacetInfo");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/facet_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.getUserFacetInfo",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FacetInfoResponse>() {});
  }

  /**
   * Get user facet info.
   *
   * <p>See {@link #getUserFacetInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FacetInfoResponse>> getUserFacetInfoWithHttpInfoAsync(
      FacetInfoRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getUserFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling getUserFacetInfo"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/facet_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.getUserFacetInfo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FacetInfoResponse>() {});
  }

  /**
   * List connections.
   *
   * <p>See {@link #listConnectionsWithHttpInfo}.
   *
   * @param entity The entity for which to list connections (required)
   * @return ListConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListConnectionsResponse listConnections(String entity) throws ApiException {
    return listConnectionsWithHttpInfo(entity).getData();
  }

  /**
   * List connections.
   *
   * <p>See {@link #listConnectionsWithHttpInfoAsync}.
   *
   * @param entity The entity for which to list connections (required)
   * @return CompletableFuture&lt;ListConnectionsResponse&gt;
   */
  public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(String entity) {
    return listConnectionsWithHttpInfoAsync(entity)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all data connections for an entity
   *
   * @param entity The entity for which to list connections (required)
   * @return ApiResponse&lt;ListConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with list of connections </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListConnectionsResponse> listConnectionsWithHttpInfo(String entity)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'entity' when calling listConnections");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connections"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.listConnections",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ListConnectionsResponse>() {});
  }

  /**
   * List connections.
   *
   * <p>See {@link #listConnectionsWithHttpInfo}.
   *
   * @param entity The entity for which to list connections (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListConnectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListConnectionsResponse>> listConnectionsWithHttpInfoAsync(
      String entity) {
    // Check if unstable operation is enabled
    String operationId = "listConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entity' when calling listConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connections"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.listConnections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ListConnectionsResponse>() {});
  }

  /** Manage optional parameters to listProductAnalyticsSegments. */
  public static class ListProductAnalyticsSegmentsOptionalParameters {
    private SegmentEntity filterEntity;
    private String filterType;
    private String filterIds;
    private Boolean filterDisabled;
    private SegmentSortColumn sortColumn;
    private QuerySortOrder sortOrder;
    private Long limit;

    /**
     * Set filterEntity.
     *
     * @param filterEntity Return only segments of this entity kind. Other values are ignored.
     *     (optional)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters filterEntity(SegmentEntity filterEntity) {
      this.filterEntity = filterEntity;
      return this;
    }

    /**
     * Set filterType.
     *
     * @param filterType Comma-separated segment kinds to return: <code>event_platform</code>,
     *     <code>user_store</code>, <code>account_store</code>, <code>reference_table</code>, <code>
     *     static</code>, <code>template</code>, <code>combination</code>, <code>journey</code>, or
     *     <code>retention</code>. (optional)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters filterType(String filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterIds.
     *
     * @param filterIds Comma-separated segment IDs to return, up to 1000. (optional)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters filterIds(String filterIds) {
      this.filterIds = filterIds;
      return this;
    }

    /**
     * Set filterDisabled.
     *
     * @param filterDisabled Set to <code>false</code> to include disabled segments. (optional,
     *     default to true)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters filterDisabled(Boolean filterDisabled) {
      this.filterDisabled = filterDisabled;
      return this;
    }

    /**
     * Set sortColumn.
     *
     * @param sortColumn Column to sort by. Other values are ignored. (optional)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters sortColumn(SegmentSortColumn sortColumn) {
      this.sortColumn = sortColumn;
      return this;
    }

    /**
     * Set sortOrder.
     *
     * @param sortOrder Sort order. Only used with <code>sort[column]</code>. (optional, default to
     *     "desc")
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters sortOrder(QuerySortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of segments to return. Returns all segments when not set.
     *     (optional)
     * @return ListProductAnalyticsSegmentsOptionalParameters
     */
    public ListProductAnalyticsSegmentsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * List segments.
   *
   * <p>See {@link #listProductAnalyticsSegmentsWithHttpInfo}.
   *
   * @return SegmentsResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentsResponse listProductAnalyticsSegments() throws ApiException {
    return listProductAnalyticsSegmentsWithHttpInfo(
            new ListProductAnalyticsSegmentsOptionalParameters())
        .getData();
  }

  /**
   * List segments.
   *
   * <p>See {@link #listProductAnalyticsSegmentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SegmentsResponse&gt;
   */
  public CompletableFuture<SegmentsResponse> listProductAnalyticsSegmentsAsync() {
    return listProductAnalyticsSegmentsWithHttpInfoAsync(
            new ListProductAnalyticsSegmentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List segments.
   *
   * <p>See {@link #listProductAnalyticsSegmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SegmentsResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentsResponse listProductAnalyticsSegments(
      ListProductAnalyticsSegmentsOptionalParameters parameters) throws ApiException {
    return listProductAnalyticsSegmentsWithHttpInfo(parameters).getData();
  }

  /**
   * List segments.
   *
   * <p>See {@link #listProductAnalyticsSegmentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SegmentsResponse&gt;
   */
  public CompletableFuture<SegmentsResponse> listProductAnalyticsSegmentsAsync(
      ListProductAnalyticsSegmentsOptionalParameters parameters) {
    return listProductAnalyticsSegmentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the user and account segments of your organization. Disabled segments are left out unless
   * <code>filter[disabled]</code> is <code>false</code>. The list does not include segment
   * definitions; get a segment by ID to see its <code>data_query</code>.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SegmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SegmentsResponse> listProductAnalyticsSegmentsWithHttpInfo(
      ListProductAnalyticsSegmentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    SegmentEntity filterEntity = parameters.filterEntity;
    String filterType = parameters.filterType;
    String filterIds = parameters.filterIds;
    Boolean filterDisabled = parameters.filterDisabled;
    SegmentSortColumn sortColumn = parameters.sortColumn;
    QuerySortOrder sortOrder = parameters.sortOrder;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segment";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ids]", filterIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[column]", sortColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[order]", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.listProductAnalyticsSegments",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentsResponse>() {});
  }

  /**
   * List segments.
   *
   * <p>See {@link #listProductAnalyticsSegmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SegmentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SegmentsResponse>>
      listProductAnalyticsSegmentsWithHttpInfoAsync(
          ListProductAnalyticsSegmentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SegmentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    SegmentEntity filterEntity = parameters.filterEntity;
    String filterType = parameters.filterType;
    String filterIds = parameters.filterIds;
    Boolean filterDisabled = parameters.filterDisabled;
    SegmentSortColumn sortColumn = parameters.sortColumn;
    QuerySortOrder sortOrder = parameters.sortOrder;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segment";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ids]", filterIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[column]", sortColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[order]", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.listProductAnalyticsSegments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SegmentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentsResponse>() {});
  }

  /**
   * Preview a segment.
   *
   * <p>See {@link #previewProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return SegmentPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public SegmentPreviewResponse previewProductAnalyticsSegment(SegmentPreviewRequest body)
      throws ApiException {
    return previewProductAnalyticsSegmentWithHttpInfo(body).getData();
  }

  /**
   * Preview a segment.
   *
   * <p>See {@link #previewProductAnalyticsSegmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SegmentPreviewResponse&gt;
   */
  public CompletableFuture<SegmentPreviewResponse> previewProductAnalyticsSegmentAsync(
      SegmentPreviewRequest body) {
    return previewProductAnalyticsSegmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Preview the users or accounts that match a segment definition, without saving it. Returns up to
   * 1000 rows and the total number of matching entities.
   *
   * @param body (required)
   * @return ApiResponse&lt;SegmentPreviewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SegmentPreviewResponse> previewProductAnalyticsSegmentWithHttpInfo(
      SegmentPreviewRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "previewProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling previewProductAnalyticsSegment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segments/preview";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.previewProductAnalyticsSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentPreviewResponse>() {});
  }

  /**
   * Preview a segment.
   *
   * <p>See {@link #previewProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SegmentPreviewResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SegmentPreviewResponse>>
      previewProductAnalyticsSegmentWithHttpInfoAsync(SegmentPreviewRequest body) {
    // Check if unstable operation is enabled
    String operationId = "previewProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SegmentPreviewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SegmentPreviewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling previewProductAnalyticsSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/segments/preview";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.previewProductAnalyticsSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SegmentPreviewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SegmentPreviewResponse>() {});
  }

  /**
   * Query accounts.
   *
   * <p>See {@link #queryAccountsWithHttpInfo}.
   *
   * @param body (required)
   * @return QueryResponse
   * @throws ApiException if fails to make API call
   */
  public QueryResponse queryAccounts(QueryAccountRequest body) throws ApiException {
    return queryAccountsWithHttpInfo(body).getData();
  }

  /**
   * Query accounts.
   *
   * <p>See {@link #queryAccountsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;QueryResponse&gt;
   */
  public CompletableFuture<QueryResponse> queryAccountsAsync(QueryAccountRequest body) {
    return queryAccountsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query accounts with flexible filtering by account properties
   *
   * @param body (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with account data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryAccountsWithHttpInfo(QueryAccountRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryAccounts");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.queryAccounts",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Query accounts.
   *
   * <p>See {@link #queryAccountsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryAccountsWithHttpInfoAsync(
      QueryAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/accounts/query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.queryAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Query event filtered users.
   *
   * <p>See {@link #queryEventFilteredUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return QueryResponse
   * @throws ApiException if fails to make API call
   */
  public QueryResponse queryEventFilteredUsers(QueryEventFilteredUsersRequest body)
      throws ApiException {
    return queryEventFilteredUsersWithHttpInfo(body).getData();
  }

  /**
   * Query event filtered users.
   *
   * <p>See {@link #queryEventFilteredUsersWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;QueryResponse&gt;
   */
  public CompletableFuture<QueryResponse> queryEventFilteredUsersAsync(
      QueryEventFilteredUsersRequest body) {
    return queryEventFilteredUsersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query users filtered by both user properties and event platform data
   *
   * @param body (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with filtered user data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryEventFilteredUsersWithHttpInfo(
      QueryEventFilteredUsersRequest body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryEventFilteredUsers");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/event_filtered_query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.queryEventFilteredUsers",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Query event filtered users.
   *
   * <p>See {@link #queryEventFilteredUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryEventFilteredUsersWithHttpInfoAsync(
      QueryEventFilteredUsersRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryEventFilteredUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryEventFilteredUsers"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/event_filtered_query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.queryEventFilteredUsers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Query users.
   *
   * <p>See {@link #queryUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return QueryResponse
   * @throws ApiException if fails to make API call
   */
  public QueryResponse queryUsers(QueryUsersRequest body) throws ApiException {
    return queryUsersWithHttpInfo(body).getData();
  }

  /**
   * Query users.
   *
   * <p>See {@link #queryUsersWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;QueryResponse&gt;
   */
  public CompletableFuture<QueryResponse> queryUsersAsync(QueryUsersRequest body) {
    return queryUsersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Query users with flexible filtering by user properties, with optional wildcard search
   *
   * @param body (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with user data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<QueryResponse> queryUsersWithHttpInfo(QueryUsersRequest body)
      throws ApiException {
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

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.queryUsers",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Query users.
   *
   * <p>See {@link #queryUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;QueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<QueryResponse>> queryUsersWithHttpInfoAsync(
      QueryUsersRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling queryUsers"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/users/query";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.queryUsers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<QueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<QueryResponse>() {});
  }

  /**
   * Update connection.
   *
   * <p>See {@link #updateConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to update the connection (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateConnection(String entity, UpdateConnectionRequest body) throws ApiException {
    updateConnectionWithHttpInfo(entity, body);
  }

  /**
   * Update connection.
   *
   * <p>See {@link #updateConnectionWithHttpInfoAsync}.
   *
   * @param entity The entity for which to update the connection (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateConnectionAsync(
      String entity, UpdateConnectionRequest body) {
    return updateConnectionWithHttpInfoAsync(entity, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing data connection by adding, updating, or deleting fields
   *
   * @param entity The entity for which to update the connection (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Connection updated successfully </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateConnectionWithHttpInfo(String entity, UpdateConnectionRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'entity' when calling updateConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.updateConnection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update connection.
   *
   * <p>See {@link #updateConnectionWithHttpInfo}.
   *
   * @param entity The entity for which to update the connection (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateConnectionWithHttpInfoAsync(
      String entity, UpdateConnectionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entity' when calling updateConnection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/{entity}/mapping/connection"
            .replaceAll("\\{" + "entity" + "\\}", apiClient.escapeString(entity.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.updateConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a segment.
   *
   * <p>See {@link #updateProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProductAnalyticsSegment(String id, SegmentUpdateRequest body)
      throws ApiException {
    updateProductAnalyticsSegmentWithHttpInfo(id, body);
  }

  /**
   * Update a segment.
   *
   * <p>See {@link #updateProductAnalyticsSegmentWithHttpInfoAsync}.
   *
   * @param id ID of the segment. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateProductAnalyticsSegmentAsync(
      String id, SegmentUpdateRequest body) {
    return updateProductAnalyticsSegmentWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a segment. Fields that are not set are left unchanged. The <code>id</code> in the body
   * must match the one in the path. The response has no body; get the segment to see the result.
   *
   * @param id ID of the segment. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateProductAnalyticsSegmentWithHttpInfo(
      String id, SegmentUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateProductAnalyticsSegment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProductAnalyticsSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumAudienceManagementApi.updateProductAnalyticsSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a segment.
   *
   * <p>See {@link #updateProductAnalyticsSegmentWithHttpInfo}.
   *
   * @param id ID of the segment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateProductAnalyticsSegmentWithHttpInfoAsync(
      String id, SegmentUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling updateProductAnalyticsSegment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateProductAnalyticsSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/segment/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumAudienceManagementApi.updateProductAnalyticsSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
