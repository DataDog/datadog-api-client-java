package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TeamConnection;
import com.datadog.api.client.v2.model.TeamConnectionCreateRequest;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequest;
import com.datadog.api.client.v2.model.TeamConnectionsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamConnectionsApi {
  private ApiClient apiClient;

  public TeamConnectionsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TeamConnectionsApi(ApiClient apiClient) {
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
   * Create team connections.
   *
   * <p>See {@link #createTeamConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return TeamConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamConnectionsResponse createTeamConnections(TeamConnectionCreateRequest body)
      throws ApiException {
    return createTeamConnectionsWithHttpInfo(body).getData();
  }

  /**
   * Create team connections.
   *
   * <p>See {@link #createTeamConnectionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TeamConnectionsResponse&gt;
   */
  public CompletableFuture<TeamConnectionsResponse> createTeamConnectionsAsync(
      TeamConnectionCreateRequest body) {
    return createTeamConnectionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create multiple team connections.
   *
   * @param body (required)
   * @return ApiResponse&lt;TeamConnectionsResponse&gt;
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
  public ApiResponse<TeamConnectionsResponse> createTeamConnectionsWithHttpInfo(
      TeamConnectionCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTeamConnections");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamConnectionsApi.createTeamConnections",
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
        new GenericType<TeamConnectionsResponse>() {});
  }

  /**
   * Create team connections.
   *
   * <p>See {@link #createTeamConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamConnectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamConnectionsResponse>>
      createTeamConnectionsWithHttpInfoAsync(TeamConnectionCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTeamConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamConnectionsApi.createTeamConnections",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamConnectionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamConnectionsResponse>() {});
  }

  /**
   * Delete team connections.
   *
   * <p>See {@link #deleteTeamConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTeamConnections(TeamConnectionDeleteRequest body) throws ApiException {
    deleteTeamConnectionsWithHttpInfo(body);
  }

  /**
   * Delete team connections.
   *
   * <p>See {@link #deleteTeamConnectionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTeamConnectionsAsync(TeamConnectionDeleteRequest body) {
    return deleteTeamConnectionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete multiple team connections.
   *
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamConnectionsWithHttpInfo(TeamConnectionDeleteRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteTeamConnections");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamConnectionsApi.deleteTeamConnections",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete team connections.
   *
   * <p>See {@link #deleteTeamConnectionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamConnectionsWithHttpInfoAsync(
      TeamConnectionDeleteRequest body) {
    // Check if unstable operation is enabled
    String operationId = "deleteTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteTeamConnections"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamConnectionsApi.deleteTeamConnections",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /** Manage optional parameters to listTeamConnections. */
  public static class ListTeamConnectionsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private List<String> filterSources;
    private List<String> filterTeamIds;
    private List<String> filterConnectedTeamIds;
    private List<String> filterConnectionIds;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterSources.
     *
     * @param filterSources Filter team connections by external source systems. (optional)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters filterSources(List<String> filterSources) {
      this.filterSources = filterSources;
      return this;
    }

    /**
     * Set filterTeamIds.
     *
     * @param filterTeamIds Filter team connections by Datadog team IDs. (optional)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters filterTeamIds(List<String> filterTeamIds) {
      this.filterTeamIds = filterTeamIds;
      return this;
    }

    /**
     * Set filterConnectedTeamIds.
     *
     * @param filterConnectedTeamIds Filter team connections by connected team IDs from external
     *     systems. (optional)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters filterConnectedTeamIds(
        List<String> filterConnectedTeamIds) {
      this.filterConnectedTeamIds = filterConnectedTeamIds;
      return this;
    }

    /**
     * Set filterConnectionIds.
     *
     * @param filterConnectionIds Filter team connections by connection IDs. (optional)
     * @return ListTeamConnectionsOptionalParameters
     */
    public ListTeamConnectionsOptionalParameters filterConnectionIds(
        List<String> filterConnectionIds) {
      this.filterConnectionIds = filterConnectionIds;
      return this;
    }
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfo}.
   *
   * @return TeamConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamConnectionsResponse listTeamConnections() throws ApiException {
    return listTeamConnectionsWithHttpInfo(new ListTeamConnectionsOptionalParameters()).getData();
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TeamConnectionsResponse&gt;
   */
  public CompletableFuture<TeamConnectionsResponse> listTeamConnectionsAsync() {
    return listTeamConnectionsWithHttpInfoAsync(new ListTeamConnectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TeamConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamConnectionsResponse listTeamConnections(
      ListTeamConnectionsOptionalParameters parameters) throws ApiException {
    return listTeamConnectionsWithHttpInfo(parameters).getData();
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamConnectionsResponse&gt;
   */
  public CompletableFuture<TeamConnectionsResponse> listTeamConnectionsAsync(
      ListTeamConnectionsOptionalParameters parameters) {
    return listTeamConnectionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;TeamConnection&gt;
   */
  public PaginationIterable<TeamConnection> listTeamConnectionsWithPagination() {
    ListTeamConnectionsOptionalParameters parameters = new ListTeamConnectionsOptionalParameters();
    return listTeamConnectionsWithPagination(parameters);
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfo}.
   *
   * @return TeamConnectionsResponse
   */
  public PaginationIterable<TeamConnection> listTeamConnectionsWithPagination(
      ListTeamConnectionsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listTeamConnections",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Returns all team connections.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamConnectionsResponse&gt;
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
  public ApiResponse<TeamConnectionsResponse> listTeamConnectionsWithHttpInfo(
      ListTeamConnectionsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterSources = parameters.filterSources;
    List<String> filterTeamIds = parameters.filterTeamIds;
    List<String> filterConnectedTeamIds = parameters.filterConnectedTeamIds;
    List<String> filterConnectionIds = parameters.filterConnectionIds;
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[sources]", filterSources));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[team_ids]", filterTeamIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[connected_team_ids]", filterConnectedTeamIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[connection_ids]", filterConnectionIds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamConnectionsApi.listTeamConnections",
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
        new GenericType<TeamConnectionsResponse>() {});
  }

  /**
   * List team connections.
   *
   * <p>See {@link #listTeamConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamConnectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamConnectionsResponse>>
      listTeamConnectionsWithHttpInfoAsync(ListTeamConnectionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listTeamConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamConnectionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterSources = parameters.filterSources;
    List<String> filterTeamIds = parameters.filterTeamIds;
    List<String> filterConnectedTeamIds = parameters.filterConnectedTeamIds;
    List<String> filterConnectionIds = parameters.filterConnectionIds;
    // create path and map variables
    String localVarPath = "/api/v2/team/connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[sources]", filterSources));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[team_ids]", filterTeamIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[connected_team_ids]", filterConnectedTeamIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "filter[connection_ids]", filterConnectionIds));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamConnectionsApi.listTeamConnections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamConnectionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamConnectionsResponse>() {});
  }
}
