package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OrgConnectionCreateRequest;
import com.datadog.api.client.v2.model.OrgConnectionListResponse;
import com.datadog.api.client.v2.model.OrgConnectionResponse;
import com.datadog.api.client.v2.model.OrgConnectionUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgConnectionsApi {
  private ApiClient apiClient;

  public OrgConnectionsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OrgConnectionsApi(ApiClient apiClient) {
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
   * Create Org Connection.
   *
   * <p>See {@link #createOrgConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return OrgConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConnectionResponse createOrgConnections(OrgConnectionCreateRequest body)
      throws ApiException {
    return createOrgConnectionsWithHttpInfo(body).getData();
  }

  /**
   * Create Org Connection.
   *
   * <p>See {@link #createOrgConnectionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OrgConnectionResponse&gt;
   */
  public CompletableFuture<OrgConnectionResponse> createOrgConnectionsAsync(
      OrgConnectionCreateRequest body) {
    return createOrgConnectionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new org connection between the current org and a target org.
   *
   * @param body (required)
   * @return ApiResponse&lt;OrgConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConnectionResponse> createOrgConnectionsWithHttpInfo(
      OrgConnectionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOrgConnections");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgConnectionsApi.createOrgConnections",
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
        new GenericType<OrgConnectionResponse>() {});
  }

  /**
   * Create Org Connection.
   *
   * <p>See {@link #createOrgConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConnectionResponse>>
      createOrgConnectionsWithHttpInfoAsync(OrgConnectionCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOrgConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org_connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgConnectionsApi.createOrgConnections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConnectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgConnectionResponse>() {});
  }

  /**
   * Delete Org Connection.
   *
   * <p>See {@link #deleteOrgConnectionsWithHttpInfo}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrgConnections(UUID connectionId) throws ApiException {
    deleteOrgConnectionsWithHttpInfo(connectionId);
  }

  /**
   * Delete Org Connection.
   *
   * <p>See {@link #deleteOrgConnectionsWithHttpInfoAsync}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrgConnectionsAsync(UUID connectionId) {
    return deleteOrgConnectionsWithHttpInfoAsync(connectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing org connection.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOrgConnectionsWithHttpInfo(UUID connectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling deleteOrgConnections");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgConnectionsApi.deleteOrgConnections",
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
   * Delete Org Connection.
   *
   * <p>See {@link #deleteOrgConnectionsWithHttpInfo}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrgConnectionsWithHttpInfoAsync(
      UUID connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling deleteOrgConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgConnectionsApi.deleteOrgConnections",
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

  /** Manage optional parameters to listOrgConnections. */
  public static class ListOrgConnectionsOptionalParameters {
    private String sinkOrgId;
    private String sourceOrgId;
    private Long limit;
    private Long offset;

    /**
     * Set sinkOrgId.
     *
     * @param sinkOrgId The Org ID of the sink org. (optional)
     * @return ListOrgConnectionsOptionalParameters
     */
    public ListOrgConnectionsOptionalParameters sinkOrgId(String sinkOrgId) {
      this.sinkOrgId = sinkOrgId;
      return this;
    }

    /**
     * Set sourceOrgId.
     *
     * @param sourceOrgId The Org ID of the source org. (optional)
     * @return ListOrgConnectionsOptionalParameters
     */
    public ListOrgConnectionsOptionalParameters sourceOrgId(String sourceOrgId) {
      this.sourceOrgId = sourceOrgId;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit The limit of number of entries you want to return. Default is 1000. (optional)
     * @return ListOrgConnectionsOptionalParameters
     */
    public ListOrgConnectionsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset The pagination offset which you want to query from. Default is 0. (optional)
     * @return ListOrgConnectionsOptionalParameters
     */
    public ListOrgConnectionsOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * List Org Connections.
   *
   * <p>See {@link #listOrgConnectionsWithHttpInfo}.
   *
   * @return OrgConnectionListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConnectionListResponse listOrgConnections() throws ApiException {
    return listOrgConnectionsWithHttpInfo(new ListOrgConnectionsOptionalParameters()).getData();
  }

  /**
   * List Org Connections.
   *
   * <p>See {@link #listOrgConnectionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgConnectionListResponse&gt;
   */
  public CompletableFuture<OrgConnectionListResponse> listOrgConnectionsAsync() {
    return listOrgConnectionsWithHttpInfoAsync(new ListOrgConnectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Org Connections.
   *
   * <p>See {@link #listOrgConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return OrgConnectionListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConnectionListResponse listOrgConnections(
      ListOrgConnectionsOptionalParameters parameters) throws ApiException {
    return listOrgConnectionsWithHttpInfo(parameters).getData();
  }

  /**
   * List Org Connections.
   *
   * <p>See {@link #listOrgConnectionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;OrgConnectionListResponse&gt;
   */
  public CompletableFuture<OrgConnectionListResponse> listOrgConnectionsAsync(
      ListOrgConnectionsOptionalParameters parameters) {
    return listOrgConnectionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a list of org connections.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;OrgConnectionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConnectionListResponse> listOrgConnectionsWithHttpInfo(
      ListOrgConnectionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String sinkOrgId = parameters.sinkOrgId;
    String sourceOrgId = parameters.sourceOrgId;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/org_connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sink_org_id", sinkOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source_org_id", sourceOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgConnectionsApi.listOrgConnections",
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
        new GenericType<OrgConnectionListResponse>() {});
  }

  /**
   * List Org Connections.
   *
   * <p>See {@link #listOrgConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConnectionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConnectionListResponse>>
      listOrgConnectionsWithHttpInfoAsync(ListOrgConnectionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String sinkOrgId = parameters.sinkOrgId;
    String sourceOrgId = parameters.sourceOrgId;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/org_connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sink_org_id", sinkOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source_org_id", sourceOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgConnectionsApi.listOrgConnections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConnectionListResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgConnectionListResponse>() {});
  }

  /**
   * Update Org Connection.
   *
   * <p>See {@link #updateOrgConnectionsWithHttpInfo}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @param body (required)
   * @return OrgConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConnectionResponse updateOrgConnections(
      UUID connectionId, OrgConnectionUpdateRequest body) throws ApiException {
    return updateOrgConnectionsWithHttpInfo(connectionId, body).getData();
  }

  /**
   * Update Org Connection.
   *
   * <p>See {@link #updateOrgConnectionsWithHttpInfoAsync}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgConnectionResponse&gt;
   */
  public CompletableFuture<OrgConnectionResponse> updateOrgConnectionsAsync(
      UUID connectionId, OrgConnectionUpdateRequest body) {
    return updateOrgConnectionsWithHttpInfoAsync(connectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing org connection.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConnectionResponse> updateOrgConnectionsWithHttpInfo(
      UUID connectionId, OrgConnectionUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling updateOrgConnections");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgConnections");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrgConnectionsApi.updateOrgConnections",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrgConnectionResponse>() {});
  }

  /**
   * Update Org Connection.
   *
   * <p>See {@link #updateOrgConnectionsWithHttpInfo}.
   *
   * @param connectionId The unique identifier of the org connection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConnectionResponse>>
      updateOrgConnectionsWithHttpInfoAsync(UUID connectionId, OrgConnectionUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<OrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling updateOrgConnections"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrgConnectionsApi.updateOrgConnections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrgConnectionResponse>() {});
  }
}
