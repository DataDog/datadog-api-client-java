package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentTeamCreateRequest;
import com.datadog.api.client.v2.model.IncidentTeamResponse;
import com.datadog.api.client.v2.model.IncidentTeamUpdateRequest;
import com.datadog.api.client.v2.model.IncidentTeamsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTeamsApi {
  private ApiClient apiClient;

  public IncidentTeamsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IncidentTeamsApi(ApiClient apiClient) {
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
   * Create a new incident team.
   *
   * <p>See {@link #createIncidentTeamWithHttpInfo}.
   *
   * @param body Incident Team Payload. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamResponse createIncidentTeam(IncidentTeamCreateRequest body)
      throws ApiException {
    return createIncidentTeamWithHttpInfo(body).getData();
  }

  /**
   * Create a new incident team.
   *
   * <p>See {@link #createIncidentTeamWithHttpInfoAsync}.
   *
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamResponse> createIncidentTeamAsync(
      IncidentTeamCreateRequest body) {
    return createIncidentTeamWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new incident team.
   *
   * @param body Incident Team Payload. (required)
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentTeamResponse> createIncidentTeamWithHttpInfo(
      IncidentTeamCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentTeam");
    }
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentTeamsApi.createIncidentTeam",
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
        new GenericType<IncidentTeamResponse>() {});
  }

  /**
   * Create a new incident team.
   *
   * <p>See {@link #createIncidentTeamWithHttpInfo}.
   *
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> createIncidentTeamWithHttpInfoAsync(
      IncidentTeamCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentTeamsApi.createIncidentTeam",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTeamResponse>() {});
  }

  /**
   * Delete an existing incident team.
   *
   * <p>See {@link #deleteIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteIncidentTeam(String teamId) throws ApiException {
    deleteIncidentTeamWithHttpInfo(teamId);
  }

  /**
   * Delete an existing incident team.
   *
   * <p>See {@link #deleteIncidentTeamWithHttpInfoAsync}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> deleteIncidentTeamAsync(String teamId) {
    return deleteIncidentTeamWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an existing incident team.
   *
   * @param teamId The ID of the incident team. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteIncidentTeamWithHttpInfo(String teamId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling deleteIncidentTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentTeamsApi.deleteIncidentTeam",
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
   * Delete an existing incident team.
   *
   * <p>See {@link #deleteIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTeamWithHttpInfoAsync(String teamId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling deleteIncidentTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentTeamsApi.deleteIncidentTeam",
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

  /** Manage optional parameters to getIncidentTeam. */
  public static class GetIncidentTeamOptionalParameters {
    private IncidentRelatedObject include;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return GetIncidentTeamOptionalParameters
     */
    public GetIncidentTeamOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get details of an incident team.
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamResponse getIncidentTeam(String teamId) throws ApiException {
    return getIncidentTeamWithHttpInfo(teamId, new GetIncidentTeamOptionalParameters()).getData();
  }

  /**
   * Get details of an incident team.
   *
   * <p>See {@link #getIncidentTeamWithHttpInfoAsync}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamResponse> getIncidentTeamAsync(String teamId) {
    return getIncidentTeamWithHttpInfoAsync(teamId, new GetIncidentTeamOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident team.
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamResponse getIncidentTeam(
      String teamId, GetIncidentTeamOptionalParameters parameters) throws ApiException {
    return getIncidentTeamWithHttpInfo(teamId, parameters).getData();
  }

  /**
   * Get details of an incident team.
   *
   * <p>See {@link #getIncidentTeamWithHttpInfoAsync}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamResponse> getIncidentTeamAsync(
      String teamId, GetIncidentTeamOptionalParameters parameters) {
    return getIncidentTeamWithHttpInfoAsync(teamId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident team. If the <code>include[users]</code> query parameter is
   * provided, the included attribute will contain the users related to these incident teams.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
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
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentTeamResponse> getIncidentTeamWithHttpInfo(
      String teamId, GetIncidentTeamOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getIncidentTeam");
    }
    IncidentRelatedObject include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentTeamsApi.getIncidentTeam",
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
        new GenericType<IncidentTeamResponse>() {});
  }

  /**
   * Get details of an incident team.
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> getIncidentTeamWithHttpInfoAsync(
      String teamId, GetIncidentTeamOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling getIncidentTeam"));
      return result;
    }
    IncidentRelatedObject include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentTeamsApi.getIncidentTeam",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTeamResponse>() {});
  }

  /** Manage optional parameters to listIncidentTeams. */
  public static class ListIncidentTeamsOptionalParameters {
    private IncidentRelatedObject include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return ListIncidentTeamsOptionalParameters
     */
    public ListIncidentTeamsOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListIncidentTeamsOptionalParameters
     */
    public ListIncidentTeamsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListIncidentTeamsOptionalParameters
     */
    public ListIncidentTeamsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter A search query that filters teams by name. (optional)
     * @return ListIncidentTeamsOptionalParameters
     */
    public ListIncidentTeamsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
   * Get a list of all incident teams.
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @return IncidentTeamsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamsResponse listIncidentTeams() throws ApiException {
    return listIncidentTeamsWithHttpInfo(new ListIncidentTeamsOptionalParameters()).getData();
  }

  /**
   * Get a list of all incident teams.
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentTeamsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamsResponse> listIncidentTeamsAsync() {
    return listIncidentTeamsWithHttpInfoAsync(new ListIncidentTeamsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all incident teams.
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentTeamsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamsResponse listIncidentTeams(ListIncidentTeamsOptionalParameters parameters)
      throws ApiException {
    return listIncidentTeamsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of all incident teams.
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTeamsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamsResponse> listIncidentTeamsAsync(
      ListIncidentTeamsOptionalParameters parameters) {
    return listIncidentTeamsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all incident teams for the requesting user's organization. If the <code>include[users]
   * </code> query parameter is provided, the included attribute will contain the users related to
   * these incident teams.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTeamsResponse&gt;
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
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentTeamsResponse> listIncidentTeamsWithHttpInfo(
      ListIncidentTeamsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTeams";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentTeamsApi.listIncidentTeams",
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
        new GenericType<IncidentTeamsResponse>() {});
  }

  /**
   * Get a list of all incident teams.
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentTeamsResponse>> listIncidentTeamsWithHttpInfoAsync(
      ListIncidentTeamsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTeams";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTeamsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentTeamsApi.listIncidentTeams",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTeamsResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTeamsResponse>() {});
  }

  /**
   * Update an existing incident team.
   *
   * <p>See {@link #updateIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentTeamResponse updateIncidentTeam(String teamId, IncidentTeamUpdateRequest body)
      throws ApiException {
    return updateIncidentTeamWithHttpInfo(teamId, body).getData();
  }

  /**
   * Update an existing incident team.
   *
   * <p>See {@link #updateIncidentTeamWithHttpInfoAsync}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentTeamResponse> updateIncidentTeamAsync(
      String teamId, IncidentTeamUpdateRequest body) {
    return updateIncidentTeamWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing incident team. Only provide the attributes which should be updated as this
   * request is a partial update.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
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
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentTeamResponse> updateIncidentTeamWithHttpInfo(
      String teamId, IncidentTeamUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateIncidentTeam");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentTeamsApi.updateIncidentTeam",
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
        new GenericType<IncidentTeamResponse>() {});
  }

  /**
   * Update an existing incident team.
   *
   * <p>See {@link #updateIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> updateIncidentTeamWithHttpInfoAsync(
      String teamId, IncidentTeamUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling updateIncidentTeam"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/teams/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentTeamsApi.updateIncidentTeam",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTeamResponse>() {});
  }
}
