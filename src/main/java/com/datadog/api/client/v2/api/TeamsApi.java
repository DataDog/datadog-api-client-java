package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AddMemberTeamRequest;
import com.datadog.api.client.v2.model.GetTeamMembershipsSort;
import com.datadog.api.client.v2.model.ListTeamsInclude;
import com.datadog.api.client.v2.model.ListTeamsSort;
import com.datadog.api.client.v2.model.Team;
import com.datadog.api.client.v2.model.TeamConnection;
import com.datadog.api.client.v2.model.TeamConnectionCreateRequest;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequest;
import com.datadog.api.client.v2.model.TeamConnectionsResponse;
import com.datadog.api.client.v2.model.TeamCreateRequest;
import com.datadog.api.client.v2.model.TeamHierarchyLink;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamHierarchyLinkResponse;
import com.datadog.api.client.v2.model.TeamHierarchyLinksResponse;
import com.datadog.api.client.v2.model.TeamLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamLinkResponse;
import com.datadog.api.client.v2.model.TeamLinksResponse;
import com.datadog.api.client.v2.model.TeamNotificationRuleRequest;
import com.datadog.api.client.v2.model.TeamNotificationRuleResponse;
import com.datadog.api.client.v2.model.TeamNotificationRulesResponse;
import com.datadog.api.client.v2.model.TeamPermissionSettingResponse;
import com.datadog.api.client.v2.model.TeamPermissionSettingUpdateRequest;
import com.datadog.api.client.v2.model.TeamPermissionSettingsResponse;
import com.datadog.api.client.v2.model.TeamResponse;
import com.datadog.api.client.v2.model.TeamSyncAttributesSource;
import com.datadog.api.client.v2.model.TeamSyncRequest;
import com.datadog.api.client.v2.model.TeamSyncResponse;
import com.datadog.api.client.v2.model.TeamUpdateRequest;
import com.datadog.api.client.v2.model.TeamsField;
import com.datadog.api.client.v2.model.TeamsResponse;
import com.datadog.api.client.v2.model.UserTeam;
import com.datadog.api.client.v2.model.UserTeamRequest;
import com.datadog.api.client.v2.model.UserTeamResponse;
import com.datadog.api.client.v2.model.UserTeamUpdateRequest;
import com.datadog.api.client.v2.model.UserTeamsResponse;
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
public class TeamsApi {
  private ApiClient apiClient;

  public TeamsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
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
   * Add a member team.
   *
   * <p>See {@link #addMemberTeamWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void addMemberTeam(String superTeamId, AddMemberTeamRequest body) throws ApiException {
    addMemberTeamWithHttpInfo(superTeamId, body);
  }

  /**
   * Add a member team.
   *
   * <p>See {@link #addMemberTeamWithHttpInfoAsync}.
   *
   * @param superTeamId None (required)
   * @param body (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> addMemberTeamAsync(String superTeamId, AddMemberTeamRequest body) {
    return addMemberTeamWithHttpInfoAsync(superTeamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a member team. Adds the team given by the <code>id</code> in the body as a member team of
   * the super team.
   *
   * <p><strong>Note</strong>: This API is deprecated. For creating team hierarchy links, use the
   * team hierarchy links API: <code>POST /api/v2/team-hierarchy-links</code>.
   *
   * @param superTeamId None (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Added </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> addMemberTeamWithHttpInfo(String superTeamId, AddMemberTeamRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "addMemberTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'superTeamId' when calling addMemberTeam");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addMemberTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.addMemberTeam",
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
   * Add a member team.
   *
   * <p>See {@link #addMemberTeamWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> addMemberTeamWithHttpInfoAsync(
      String superTeamId, AddMemberTeamRequest body) {
    // Check if unstable operation is enabled
    String operationId = "addMemberTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'superTeamId' when calling addMemberTeam"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addMemberTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.addMemberTeam",
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
   * Create a team hierarchy link.
   *
   * <p>See {@link #addTeamHierarchyLinkWithHttpInfo}.
   *
   * @param body (required)
   * @return TeamHierarchyLinkResponse
   * @throws ApiException if fails to make API call
   */
  public TeamHierarchyLinkResponse addTeamHierarchyLink(TeamHierarchyLinkCreateRequest body)
      throws ApiException {
    return addTeamHierarchyLinkWithHttpInfo(body).getData();
  }

  /**
   * Create a team hierarchy link.
   *
   * <p>See {@link #addTeamHierarchyLinkWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TeamHierarchyLinkResponse&gt;
   */
  public CompletableFuture<TeamHierarchyLinkResponse> addTeamHierarchyLinkAsync(
      TeamHierarchyLinkCreateRequest body) {
    return addTeamHierarchyLinkWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new team hierarchy link between a parent team and a sub team.
   *
   * @param body (required)
   * @return ApiResponse&lt;TeamHierarchyLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamHierarchyLinkResponse> addTeamHierarchyLinkWithHttpInfo(
      TeamHierarchyLinkCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addTeamHierarchyLink");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team-hierarchy-links";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.addTeamHierarchyLink",
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
        new GenericType<TeamHierarchyLinkResponse>() {});
  }

  /**
   * Create a team hierarchy link.
   *
   * <p>See {@link #addTeamHierarchyLinkWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamHierarchyLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>>
      addTeamHierarchyLinkWithHttpInfoAsync(TeamHierarchyLinkCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addTeamHierarchyLink"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team-hierarchy-links";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.addTeamHierarchyLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamHierarchyLinkResponse>() {});
  }

  /**
   * Create a team.
   *
   * <p>See {@link #createTeamWithHttpInfo}.
   *
   * @param body (required)
   * @return TeamResponse
   * @throws ApiException if fails to make API call
   */
  public TeamResponse createTeam(TeamCreateRequest body) throws ApiException {
    return createTeamWithHttpInfo(body).getData();
  }

  /**
   * Create a team.
   *
   * <p>See {@link #createTeamWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TeamResponse&gt;
   */
  public CompletableFuture<TeamResponse> createTeamAsync(TeamCreateRequest body) {
    return createTeamWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new team. User IDs passed through the <code>users</code> relationship field are added
   * to the team.
   *
   * @param body (required)
   * @return ApiResponse&lt;TeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamResponse> createTeamWithHttpInfo(TeamCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTeam");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.createTeam",
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
        new GenericType<TeamResponse>() {});
  }

  /**
   * Create a team.
   *
   * <p>See {@link #createTeamWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamResponse>> createTeamWithHttpInfoAsync(
      TeamCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.createTeam",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamResponse>() {});
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
            "v2.TeamsApi.createTeamConnections",
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
              "v2.TeamsApi.createTeamConnections",
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
   * Create a team link.
   *
   * <p>See {@link #createTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return TeamLinkResponse
   * @throws ApiException if fails to make API call
   */
  public TeamLinkResponse createTeamLink(String teamId, TeamLinkCreateRequest body)
      throws ApiException {
    return createTeamLinkWithHttpInfo(teamId, body).getData();
  }

  /**
   * Create a team link.
   *
   * <p>See {@link #createTeamLinkWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamLinkResponse&gt;
   */
  public CompletableFuture<TeamLinkResponse> createTeamLinkAsync(
      String teamId, TeamLinkCreateRequest body) {
    return createTeamLinkWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a new link to a team.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamLinkResponse> createTeamLinkWithHttpInfo(
      String teamId, TeamLinkCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling createTeamLink");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTeamLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.createTeamLink",
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Create a team link.
   *
   * <p>See {@link #createTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamLinkResponse>> createTeamLinkWithHttpInfoAsync(
      String teamId, TeamLinkCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling createTeamLink"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTeamLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.createTeamLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Add a user to a team.
   *
   * <p>See {@link #createTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return UserTeamResponse
   * @throws ApiException if fails to make API call
   */
  public UserTeamResponse createTeamMembership(String teamId, UserTeamRequest body)
      throws ApiException {
    return createTeamMembershipWithHttpInfo(teamId, body).getData();
  }

  /**
   * Add a user to a team.
   *
   * <p>See {@link #createTeamMembershipWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;UserTeamResponse&gt;
   */
  public CompletableFuture<UserTeamResponse> createTeamMembershipAsync(
      String teamId, UserTeamRequest body) {
    return createTeamMembershipWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a user to a team.
   *
   * <p><strong>Note</strong>: Each team has a setting that determines who is allowed to modify
   * membership of the team. The <code>user_access_manage</code> permission generally grants access
   * to modify membership of any team. To get the full picture, see <a
   * href="https://docs.datadoghq.com/account_management/teams/manage/#team-membership">Team
   * Membership documentation</a>.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return ApiResponse&lt;UserTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Represents a user&#39;s association to a team </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserTeamResponse> createTeamMembershipWithHttpInfo(
      String teamId, UserTeamRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling createTeamMembership");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTeamMembership");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.createTeamMembership",
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
        new GenericType<UserTeamResponse>() {});
  }

  /**
   * Add a user to a team.
   *
   * <p>See {@link #createTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserTeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserTeamResponse>> createTeamMembershipWithHttpInfoAsync(
      String teamId, UserTeamRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling createTeamMembership"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTeamMembership"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.createTeamMembership",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserTeamResponse>() {});
  }

  /**
   * Create team notification rule.
   *
   * <p>See {@link #createTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return TeamNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TeamNotificationRuleResponse createTeamNotificationRule(
      String teamId, TeamNotificationRuleRequest body) throws ApiException {
    return createTeamNotificationRuleWithHttpInfo(teamId, body).getData();
  }

  /**
   * Create team notification rule.
   *
   * <p>See {@link #createTeamNotificationRuleWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamNotificationRuleResponse&gt;
   */
  public CompletableFuture<TeamNotificationRuleResponse> createTeamNotificationRuleAsync(
      String teamId, TeamNotificationRuleRequest body) {
    return createTeamNotificationRuleWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param teamId None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamNotificationRuleResponse> createTeamNotificationRuleWithHttpInfo(
      String teamId, TeamNotificationRuleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling createTeamNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTeamNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.createTeamNotificationRule",
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
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Create team notification rule.
   *
   * <p>See {@link #createTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamNotificationRuleResponse>>
      createTeamNotificationRuleWithHttpInfoAsync(String teamId, TeamNotificationRuleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling createTeamNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createTeamNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.createTeamNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Remove a team.
   *
   * <p>See {@link #deleteTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTeam(String teamId) throws ApiException {
    deleteTeamWithHttpInfo(teamId);
  }

  /**
   * Remove a team.
   *
   * <p>See {@link #deleteTeamWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTeamAsync(String teamId) {
    return deleteTeamWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a team using the team's <code>id</code>.
   *
   * @param teamId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamWithHttpInfo(String teamId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling deleteTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.deleteTeam",
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
   * Remove a team.
   *
   * <p>See {@link #deleteTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamWithHttpInfoAsync(String teamId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'teamId' when calling deleteTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.deleteTeam",
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
            "v2.TeamsApi.deleteTeamConnections",
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
              "v2.TeamsApi.deleteTeamConnections",
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

  /**
   * Remove a team link.
   *
   * <p>See {@link #deleteTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTeamLink(String teamId, String linkId) throws ApiException {
    deleteTeamLinkWithHttpInfo(teamId, linkId);
  }

  /**
   * Remove a team link.
   *
   * <p>See {@link #deleteTeamLinkWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTeamLinkAsync(String teamId, String linkId) {
    return deleteTeamLinkWithHttpInfoAsync(teamId, linkId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a link from a team.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamLinkWithHttpInfo(String teamId, String linkId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling deleteTeamLink");
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling deleteTeamLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.deleteTeamLink",
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
   * Remove a team link.
   *
   * <p>See {@link #deleteTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamLinkWithHttpInfoAsync(
      String teamId, String linkId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling deleteTeamLink"));
      return result;
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling deleteTeamLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.deleteTeamLink",
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
   * Remove a user from a team.
   *
   * <p>See {@link #deleteTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTeamMembership(String teamId, String userId) throws ApiException {
    deleteTeamMembershipWithHttpInfo(teamId, userId);
  }

  /**
   * Remove a user from a team.
   *
   * <p>See {@link #deleteTeamMembershipWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTeamMembershipAsync(String teamId, String userId) {
    return deleteTeamMembershipWithHttpInfoAsync(teamId, userId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a user from a team.
   *
   * <p><strong>Note</strong>: Each team has a setting that determines who is allowed to modify
   * membership of the team. The <code>user_access_manage</code> permission generally grants access
   * to modify membership of any team. To get the full picture, see <a
   * href="https://docs.datadoghq.com/account_management/teams/manage/#team-membership">Team
   * Membership documentation</a>.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamMembershipWithHttpInfo(String teamId, String userId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling deleteTeamMembership");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling deleteTeamMembership");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships/{user_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.deleteTeamMembership",
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
   * Remove a user from a team.
   *
   * <p>See {@link #deleteTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamMembershipWithHttpInfoAsync(
      String teamId, String userId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling deleteTeamMembership"));
      return result;
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling deleteTeamMembership"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships/{user_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.deleteTeamMembership",
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
   * Delete team notification rule.
   *
   * <p>See {@link #deleteTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTeamNotificationRule(String teamId, String ruleId) throws ApiException {
    deleteTeamNotificationRuleWithHttpInfo(teamId, ruleId);
  }

  /**
   * Delete team notification rule.
   *
   * <p>See {@link #deleteTeamNotificationRuleWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTeamNotificationRuleAsync(String teamId, String ruleId) {
    return deleteTeamNotificationRuleWithHttpInfoAsync(teamId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTeamNotificationRuleWithHttpInfo(String teamId, String ruleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling deleteTeamNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteTeamNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.deleteTeamNotificationRule",
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
   * Delete team notification rule.
   *
   * <p>See {@link #deleteTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTeamNotificationRuleWithHttpInfoAsync(
      String teamId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling deleteTeamNotificationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling deleteTeamNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.deleteTeamNotificationRule",
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
   * Get a team.
   *
   * <p>See {@link #getTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return TeamResponse
   * @throws ApiException if fails to make API call
   */
  public TeamResponse getTeam(String teamId) throws ApiException {
    return getTeamWithHttpInfo(teamId).getData();
  }

  /**
   * Get a team.
   *
   * <p>See {@link #getTeamWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;TeamResponse&gt;
   */
  public CompletableFuture<TeamResponse> getTeamAsync(String teamId) {
    return getTeamWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single team using the team's <code>id</code>.
   *
   * @param teamId None (required)
   * @return ApiResponse&lt;TeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamResponse> getTeamWithHttpInfo(String teamId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeam",
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
        new GenericType<TeamResponse>() {});
  }

  /**
   * Get a team.
   *
   * <p>See {@link #getTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamResponse>> getTeamWithHttpInfoAsync(String teamId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'teamId' when calling getTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeam",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamResponse>() {});
  }

  /**
   * Get a team hierarchy link.
   *
   * <p>See {@link #getTeamHierarchyLinkWithHttpInfo}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return TeamHierarchyLinkResponse
   * @throws ApiException if fails to make API call
   */
  public TeamHierarchyLinkResponse getTeamHierarchyLink(String linkId) throws ApiException {
    return getTeamHierarchyLinkWithHttpInfo(linkId).getData();
  }

  /**
   * Get a team hierarchy link.
   *
   * <p>See {@link #getTeamHierarchyLinkWithHttpInfoAsync}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return CompletableFuture&lt;TeamHierarchyLinkResponse&gt;
   */
  public CompletableFuture<TeamHierarchyLinkResponse> getTeamHierarchyLinkAsync(String linkId) {
    return getTeamHierarchyLinkWithHttpInfoAsync(linkId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single team hierarchy link for the given link_id.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return ApiResponse&lt;TeamHierarchyLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamHierarchyLinkResponse> getTeamHierarchyLinkWithHttpInfo(String linkId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling getTeamHierarchyLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team-hierarchy-links/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamHierarchyLink",
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
        new GenericType<TeamHierarchyLinkResponse>() {});
  }

  /**
   * Get a team hierarchy link.
   *
   * <p>See {@link #getTeamHierarchyLinkWithHttpInfo}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamHierarchyLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>>
      getTeamHierarchyLinkWithHttpInfoAsync(String linkId) {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling getTeamHierarchyLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team-hierarchy-links/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamHierarchyLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamHierarchyLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamHierarchyLinkResponse>() {});
  }

  /**
   * Get a team link.
   *
   * <p>See {@link #getTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return TeamLinkResponse
   * @throws ApiException if fails to make API call
   */
  public TeamLinkResponse getTeamLink(String teamId, String linkId) throws ApiException {
    return getTeamLinkWithHttpInfo(teamId, linkId).getData();
  }

  /**
   * Get a team link.
   *
   * <p>See {@link #getTeamLinkWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return CompletableFuture&lt;TeamLinkResponse&gt;
   */
  public CompletableFuture<TeamLinkResponse> getTeamLinkAsync(String teamId, String linkId) {
    return getTeamLinkWithHttpInfoAsync(teamId, linkId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single link for a team.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return ApiResponse&lt;TeamLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamLinkResponse> getTeamLinkWithHttpInfo(String teamId, String linkId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamLink");
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling getTeamLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamLink",
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Get a team link.
   *
   * <p>See {@link #getTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamLinkResponse>> getTeamLinkWithHttpInfoAsync(
      String teamId, String linkId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling getTeamLink"));
      return result;
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling getTeamLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Get links for a team.
   *
   * <p>See {@link #getTeamLinksWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return TeamLinksResponse
   * @throws ApiException if fails to make API call
   */
  public TeamLinksResponse getTeamLinks(String teamId) throws ApiException {
    return getTeamLinksWithHttpInfo(teamId).getData();
  }

  /**
   * Get links for a team.
   *
   * <p>See {@link #getTeamLinksWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;TeamLinksResponse&gt;
   */
  public CompletableFuture<TeamLinksResponse> getTeamLinksAsync(String teamId) {
    return getTeamLinksWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all links for a given team.
   *
   * @param teamId None (required)
   * @return ApiResponse&lt;TeamLinksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamLinksResponse> getTeamLinksWithHttpInfo(String teamId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamLinks");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamLinks",
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
        new GenericType<TeamLinksResponse>() {});
  }

  /**
   * Get links for a team.
   *
   * <p>See {@link #getTeamLinksWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamLinksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamLinksResponse>> getTeamLinksWithHttpInfoAsync(
      String teamId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamLinksResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling getTeamLinks"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamLinks",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamLinksResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamLinksResponse>() {});
  }

  /** Manage optional parameters to getTeamMemberships. */
  public static class GetTeamMembershipsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private GetTeamMembershipsSort sort;
    private String filterKeyword;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return GetTeamMembershipsOptionalParameters
     */
    public GetTeamMembershipsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return GetTeamMembershipsOptionalParameters
     */
    public GetTeamMembershipsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Specifies the order of returned team memberships (optional)
     * @return GetTeamMembershipsOptionalParameters
     */
    public GetTeamMembershipsOptionalParameters sort(GetTeamMembershipsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filterKeyword.
     *
     * @param filterKeyword Search query, can be user email or name (optional)
     * @return GetTeamMembershipsOptionalParameters
     */
    public GetTeamMembershipsOptionalParameters filterKeyword(String filterKeyword) {
      this.filterKeyword = filterKeyword;
      return this;
    }
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return UserTeamsResponse
   * @throws ApiException if fails to make API call
   */
  public UserTeamsResponse getTeamMemberships(String teamId) throws ApiException {
    return getTeamMembershipsWithHttpInfo(teamId, new GetTeamMembershipsOptionalParameters())
        .getData();
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;UserTeamsResponse&gt;
   */
  public CompletableFuture<UserTeamsResponse> getTeamMembershipsAsync(String teamId) {
    return getTeamMembershipsWithHttpInfoAsync(teamId, new GetTeamMembershipsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param parameters Optional parameters for the request.
   * @return UserTeamsResponse
   * @throws ApiException if fails to make API call
   */
  public UserTeamsResponse getTeamMemberships(
      String teamId, GetTeamMembershipsOptionalParameters parameters) throws ApiException {
    return getTeamMembershipsWithHttpInfo(teamId, parameters).getData();
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UserTeamsResponse&gt;
   */
  public CompletableFuture<UserTeamsResponse> getTeamMembershipsAsync(
      String teamId, GetTeamMembershipsOptionalParameters parameters) {
    return getTeamMembershipsWithHttpInfoAsync(teamId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return PaginationIterable&lt;UserTeam&gt;
   */
  public PaginationIterable<UserTeam> getTeamMembershipsWithPagination(String teamId) {
    GetTeamMembershipsOptionalParameters parameters = new GetTeamMembershipsOptionalParameters();
    return getTeamMembershipsWithPagination(teamId, parameters);
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return UserTeamsResponse
   */
  public PaginationIterable<UserTeam> getTeamMembershipsWithPagination(
      String teamId, GetTeamMembershipsOptionalParameters parameters) {
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
    args.put("teamId", teamId);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "getTeamMemberships",
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
   * Get a paginated list of members for a team
   *
   * @param teamId None (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UserTeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Represents a user&#39;s association to a team </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserTeamsResponse> getTeamMembershipsWithHttpInfo(
      String teamId, GetTeamMembershipsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamMemberships");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    GetTeamMembershipsSort sort = parameters.sort;
    String filterKeyword = parameters.filterKeyword;
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[keyword]", filterKeyword));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamMemberships",
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
        new GenericType<UserTeamsResponse>() {});
  }

  /**
   * Get team memberships.
   *
   * <p>See {@link #getTeamMembershipsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UserTeamsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserTeamsResponse>> getTeamMembershipsWithHttpInfoAsync(
      String teamId, GetTeamMembershipsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<UserTeamsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling getTeamMemberships"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    GetTeamMembershipsSort sort = parameters.sort;
    String filterKeyword = parameters.filterKeyword;
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[keyword]", filterKeyword));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamMemberships",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserTeamsResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserTeamsResponse>() {});
  }

  /**
   * Get team notification rule.
   *
   * <p>See {@link #getTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return TeamNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TeamNotificationRuleResponse getTeamNotificationRule(String teamId, String ruleId)
      throws ApiException {
    return getTeamNotificationRuleWithHttpInfo(teamId, ruleId).getData();
  }

  /**
   * Get team notification rule.
   *
   * <p>See {@link #getTeamNotificationRuleWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return CompletableFuture&lt;TeamNotificationRuleResponse&gt;
   */
  public CompletableFuture<TeamNotificationRuleResponse> getTeamNotificationRuleAsync(
      String teamId, String ruleId) {
    return getTeamNotificationRuleWithHttpInfoAsync(teamId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return ApiResponse&lt;TeamNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamNotificationRuleResponse> getTeamNotificationRuleWithHttpInfo(
      String teamId, String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getTeamNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamNotificationRule",
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
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Get team notification rule.
   *
   * <p>See {@link #getTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamNotificationRuleResponse>>
      getTeamNotificationRuleWithHttpInfoAsync(String teamId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling getTeamNotificationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getTeamNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Get team notification rules.
   *
   * <p>See {@link #getTeamNotificationRulesWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return TeamNotificationRulesResponse
   * @throws ApiException if fails to make API call
   */
  public TeamNotificationRulesResponse getTeamNotificationRules(String teamId) throws ApiException {
    return getTeamNotificationRulesWithHttpInfo(teamId).getData();
  }

  /**
   * Get team notification rules.
   *
   * <p>See {@link #getTeamNotificationRulesWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;TeamNotificationRulesResponse&gt;
   */
  public CompletableFuture<TeamNotificationRulesResponse> getTeamNotificationRulesAsync(
      String teamId) {
    return getTeamNotificationRulesWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param teamId None (required)
   * @return ApiResponse&lt;TeamNotificationRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamNotificationRulesResponse> getTeamNotificationRulesWithHttpInfo(
      String teamId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamNotificationRules");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamNotificationRules",
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
        new GenericType<TeamNotificationRulesResponse>() {});
  }

  /**
   * Get team notification rules.
   *
   * <p>See {@link #getTeamNotificationRulesWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamNotificationRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamNotificationRulesResponse>>
      getTeamNotificationRulesWithHttpInfoAsync(String teamId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRulesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling getTeamNotificationRules"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamNotificationRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamNotificationRulesResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamNotificationRulesResponse>() {});
  }

  /**
   * Get permission settings for a team.
   *
   * <p>See {@link #getTeamPermissionSettingsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return TeamPermissionSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamPermissionSettingsResponse getTeamPermissionSettings(String teamId)
      throws ApiException {
    return getTeamPermissionSettingsWithHttpInfo(teamId).getData();
  }

  /**
   * Get permission settings for a team.
   *
   * <p>See {@link #getTeamPermissionSettingsWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;TeamPermissionSettingsResponse&gt;
   */
  public CompletableFuture<TeamPermissionSettingsResponse> getTeamPermissionSettingsAsync(
      String teamId) {
    return getTeamPermissionSettingsWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all permission settings for a given team.
   *
   * @param teamId None (required)
   * @return ApiResponse&lt;TeamPermissionSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamPermissionSettingsResponse> getTeamPermissionSettingsWithHttpInfo(
      String teamId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling getTeamPermissionSettings");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/permission-settings"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamPermissionSettings",
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
        new GenericType<TeamPermissionSettingsResponse>() {});
  }

  /**
   * Get permission settings for a team.
   *
   * <p>See {@link #getTeamPermissionSettingsWithHttpInfo}.
   *
   * @param teamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamPermissionSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamPermissionSettingsResponse>>
      getTeamPermissionSettingsWithHttpInfoAsync(String teamId) {
    Object localVarPostBody = null;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamPermissionSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling getTeamPermissionSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/permission-settings"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamPermissionSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamPermissionSettingsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamPermissionSettingsResponse>() {});
  }

  /**
   * Get team sync configurations.
   *
   * <p>See {@link #getTeamSyncWithHttpInfo}.
   *
   * @param filterSource Filter by the external source platform for team synchronization (required)
   * @return TeamSyncResponse
   * @throws ApiException if fails to make API call
   */
  public TeamSyncResponse getTeamSync(TeamSyncAttributesSource filterSource) throws ApiException {
    return getTeamSyncWithHttpInfo(filterSource).getData();
  }

  /**
   * Get team sync configurations.
   *
   * <p>See {@link #getTeamSyncWithHttpInfoAsync}.
   *
   * @param filterSource Filter by the external source platform for team synchronization (required)
   * @return CompletableFuture&lt;TeamSyncResponse&gt;
   */
  public CompletableFuture<TeamSyncResponse> getTeamSyncAsync(
      TeamSyncAttributesSource filterSource) {
    return getTeamSyncWithHttpInfoAsync(filterSource)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all team synchronization configurations. Returns a list of configurations used for linking
   * or provisioning teams with external sources like GitHub.
   *
   * @param filterSource Filter by the external source platform for team synchronization (required)
   * @return ApiResponse&lt;TeamSyncResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Team sync configurations not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamSyncResponse> getTeamSyncWithHttpInfo(
      TeamSyncAttributesSource filterSource) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'filterSource' is set
    if (filterSource == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterSource' when calling getTeamSync");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/sync";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getTeamSync",
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
        new GenericType<TeamSyncResponse>() {});
  }

  /**
   * Get team sync configurations.
   *
   * <p>See {@link #getTeamSyncWithHttpInfo}.
   *
   * @param filterSource Filter by the external source platform for team synchronization (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamSyncResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamSyncResponse>> getTeamSyncWithHttpInfoAsync(
      TeamSyncAttributesSource filterSource) {
    Object localVarPostBody = null;

    // verify the required parameter 'filterSource' is set
    if (filterSource == null) {
      CompletableFuture<ApiResponse<TeamSyncResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'filterSource' when calling getTeamSync"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/sync";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[source]", filterSource));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getTeamSync",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamSyncResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamSyncResponse>() {});
  }

  /**
   * Get user memberships.
   *
   * <p>See {@link #getUserMembershipsWithHttpInfo}.
   *
   * @param userUuid None (required)
   * @return UserTeamsResponse
   * @throws ApiException if fails to make API call
   */
  public UserTeamsResponse getUserMemberships(String userUuid) throws ApiException {
    return getUserMembershipsWithHttpInfo(userUuid).getData();
  }

  /**
   * Get user memberships.
   *
   * <p>See {@link #getUserMembershipsWithHttpInfoAsync}.
   *
   * @param userUuid None (required)
   * @return CompletableFuture&lt;UserTeamsResponse&gt;
   */
  public CompletableFuture<UserTeamsResponse> getUserMembershipsAsync(String userUuid) {
    return getUserMembershipsWithHttpInfoAsync(userUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of memberships for a user
   *
   * @param userUuid None (required)
   * @return ApiResponse&lt;UserTeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Represents a user&#39;s association to a team </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserTeamsResponse> getUserMembershipsWithHttpInfo(String userUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userUuid' when calling getUserMemberships");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_uuid}/memberships"
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.getUserMemberships",
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
        new GenericType<UserTeamsResponse>() {});
  }

  /**
   * Get user memberships.
   *
   * <p>See {@link #getUserMembershipsWithHttpInfo}.
   *
   * @param userUuid None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserTeamsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserTeamsResponse>> getUserMembershipsWithHttpInfoAsync(
      String userUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      CompletableFuture<ApiResponse<UserTeamsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userUuid' when calling getUserMemberships"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/users/{user_uuid}/memberships"
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.getUserMemberships",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserTeamsResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserTeamsResponse>() {});
  }

  /** Manage optional parameters to listMemberTeams. */
  public static class ListMemberTeamsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private List<TeamsField> fieldsTeam;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListMemberTeamsOptionalParameters
     */
    public ListMemberTeamsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListMemberTeamsOptionalParameters
     */
    public ListMemberTeamsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set fieldsTeam.
     *
     * @param fieldsTeam List of fields that need to be fetched. (optional)
     * @return ListMemberTeamsOptionalParameters
     */
    public ListMemberTeamsOptionalParameters fieldsTeam(List<TeamsField> fieldsTeam) {
      this.fieldsTeam = fieldsTeam;
      return this;
    }
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @return TeamsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public TeamsResponse listMemberTeams(String superTeamId) throws ApiException {
    return listMemberTeamsWithHttpInfo(superTeamId, new ListMemberTeamsOptionalParameters())
        .getData();
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfoAsync}.
   *
   * @param superTeamId None (required)
   * @return CompletableFuture&lt;TeamsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<TeamsResponse> listMemberTeamsAsync(String superTeamId) {
    return listMemberTeamsWithHttpInfoAsync(superTeamId, new ListMemberTeamsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param parameters Optional parameters for the request.
   * @return TeamsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public TeamsResponse listMemberTeams(
      String superTeamId, ListMemberTeamsOptionalParameters parameters) throws ApiException {
    return listMemberTeamsWithHttpInfo(superTeamId, parameters).getData();
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfoAsync}.
   *
   * @param superTeamId None (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<TeamsResponse> listMemberTeamsAsync(
      String superTeamId, ListMemberTeamsOptionalParameters parameters) {
    return listMemberTeamsWithHttpInfoAsync(superTeamId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @return PaginationIterable&lt;Team&gt;
   * @deprecated
   */
  @Deprecated
  public PaginationIterable<Team> listMemberTeamsWithPagination(String superTeamId) {
    ListMemberTeamsOptionalParameters parameters = new ListMemberTeamsOptionalParameters();
    return listMemberTeamsWithPagination(superTeamId, parameters);
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @return TeamsResponse
   * @deprecated
   */
  @Deprecated
  public PaginationIterable<Team> listMemberTeamsWithPagination(
      String superTeamId, ListMemberTeamsOptionalParameters parameters) {
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
    args.put("superTeamId", superTeamId);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listMemberTeams",
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
   * Get all member teams.
   *
   * <p><strong>Note</strong>: This API is deprecated. For team hierarchy relationships
   * (parent-child teams), use the team hierarchy links API: <code>GET /api/v2/team-hierarchy-links
   * </code>.
   *
   * @param superTeamId None (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<TeamsResponse> listMemberTeamsWithHttpInfo(
      String superTeamId, ListMemberTeamsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listMemberTeams";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'superTeamId' when calling listMemberTeams");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<TeamsField> fieldsTeam = parameters.fieldsTeam;
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[team]", fieldsTeam));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.listMemberTeams",
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
        new GenericType<TeamsResponse>() {});
  }

  /**
   * Get all member teams.
   *
   * <p>See {@link #listMemberTeamsWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<TeamsResponse>> listMemberTeamsWithHttpInfoAsync(
      String superTeamId, ListMemberTeamsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listMemberTeams";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TeamsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      CompletableFuture<ApiResponse<TeamsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'superTeamId' when calling listMemberTeams"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<TeamsField> fieldsTeam = parameters.fieldsTeam;
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[team]", fieldsTeam));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.listMemberTeams",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamsResponse>() {});
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
            "v2.TeamsApi.listTeamConnections",
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
              "v2.TeamsApi.listTeamConnections",
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

  /** Manage optional parameters to listTeamHierarchyLinks. */
  public static class ListTeamHierarchyLinksOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String filterParentTeam;
    private String filterSubTeam;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListTeamHierarchyLinksOptionalParameters
     */
    public ListTeamHierarchyLinksOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListTeamHierarchyLinksOptionalParameters
     */
    public ListTeamHierarchyLinksOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterParentTeam.
     *
     * @param filterParentTeam Filter by parent team ID (optional)
     * @return ListTeamHierarchyLinksOptionalParameters
     */
    public ListTeamHierarchyLinksOptionalParameters filterParentTeam(String filterParentTeam) {
      this.filterParentTeam = filterParentTeam;
      return this;
    }

    /**
     * Set filterSubTeam.
     *
     * @param filterSubTeam Filter by sub team ID (optional)
     * @return ListTeamHierarchyLinksOptionalParameters
     */
    public ListTeamHierarchyLinksOptionalParameters filterSubTeam(String filterSubTeam) {
      this.filterSubTeam = filterSubTeam;
      return this;
    }
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfo}.
   *
   * @return TeamHierarchyLinksResponse
   * @throws ApiException if fails to make API call
   */
  public TeamHierarchyLinksResponse listTeamHierarchyLinks() throws ApiException {
    return listTeamHierarchyLinksWithHttpInfo(new ListTeamHierarchyLinksOptionalParameters())
        .getData();
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TeamHierarchyLinksResponse&gt;
   */
  public CompletableFuture<TeamHierarchyLinksResponse> listTeamHierarchyLinksAsync() {
    return listTeamHierarchyLinksWithHttpInfoAsync(new ListTeamHierarchyLinksOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TeamHierarchyLinksResponse
   * @throws ApiException if fails to make API call
   */
  public TeamHierarchyLinksResponse listTeamHierarchyLinks(
      ListTeamHierarchyLinksOptionalParameters parameters) throws ApiException {
    return listTeamHierarchyLinksWithHttpInfo(parameters).getData();
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamHierarchyLinksResponse&gt;
   */
  public CompletableFuture<TeamHierarchyLinksResponse> listTeamHierarchyLinksAsync(
      ListTeamHierarchyLinksOptionalParameters parameters) {
    return listTeamHierarchyLinksWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfo}.
   *
   * @return PaginationIterable&lt;TeamHierarchyLink&gt;
   */
  public PaginationIterable<TeamHierarchyLink> listTeamHierarchyLinksWithPagination() {
    ListTeamHierarchyLinksOptionalParameters parameters =
        new ListTeamHierarchyLinksOptionalParameters();
    return listTeamHierarchyLinksWithPagination(parameters);
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfo}.
   *
   * @return TeamHierarchyLinksResponse
   */
  public PaginationIterable<TeamHierarchyLink> listTeamHierarchyLinksWithPagination(
      ListTeamHierarchyLinksOptionalParameters parameters) {
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
            "listTeamHierarchyLinks",
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
   * List all team hierarchy links that match the provided filters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamHierarchyLinksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamHierarchyLinksResponse> listTeamHierarchyLinksWithHttpInfo(
      ListTeamHierarchyLinksOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filterParentTeam = parameters.filterParentTeam;
    String filterSubTeam = parameters.filterSubTeam;
    // create path and map variables
    String localVarPath = "/api/v2/team-hierarchy-links";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_team]", filterParentTeam));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sub_team]", filterSubTeam));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.listTeamHierarchyLinks",
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
        new GenericType<TeamHierarchyLinksResponse>() {});
  }

  /**
   * Get team hierarchy links.
   *
   * <p>See {@link #listTeamHierarchyLinksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamHierarchyLinksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamHierarchyLinksResponse>>
      listTeamHierarchyLinksWithHttpInfoAsync(ListTeamHierarchyLinksOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filterParentTeam = parameters.filterParentTeam;
    String filterSubTeam = parameters.filterSubTeam;
    // create path and map variables
    String localVarPath = "/api/v2/team-hierarchy-links";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_team]", filterParentTeam));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sub_team]", filterSubTeam));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.listTeamHierarchyLinks",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamHierarchyLinksResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamHierarchyLinksResponse>() {});
  }

  /** Manage optional parameters to listTeams. */
  public static class ListTeamsOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private ListTeamsSort sort;
    private List<ListTeamsInclude> include;
    private String filterKeyword;
    private Boolean filterMe;
    private List<TeamsField> fieldsTeam;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Specifies the order of the returned teams (optional)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters sort(ListTeamsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Included related resources optionally requested. Allowed enum values: <code>
     *     team_links, user_team_permissions</code> (optional)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters include(List<ListTeamsInclude> include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterKeyword.
     *
     * @param filterKeyword Search query. Can be team name, team handle, or email of team member
     *     (optional)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters filterKeyword(String filterKeyword) {
      this.filterKeyword = filterKeyword;
      return this;
    }

    /**
     * Set filterMe.
     *
     * @param filterMe When true, only returns teams the current user belongs to (optional)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters filterMe(Boolean filterMe) {
      this.filterMe = filterMe;
      return this;
    }

    /**
     * Set fieldsTeam.
     *
     * @param fieldsTeam List of fields that need to be fetched. (optional)
     * @return ListTeamsOptionalParameters
     */
    public ListTeamsOptionalParameters fieldsTeam(List<TeamsField> fieldsTeam) {
      this.fieldsTeam = fieldsTeam;
      return this;
    }
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfo}.
   *
   * @return TeamsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamsResponse listTeams() throws ApiException {
    return listTeamsWithHttpInfo(new ListTeamsOptionalParameters()).getData();
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TeamsResponse&gt;
   */
  public CompletableFuture<TeamsResponse> listTeamsAsync() {
    return listTeamsWithHttpInfoAsync(new ListTeamsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TeamsResponse
   * @throws ApiException if fails to make API call
   */
  public TeamsResponse listTeams(ListTeamsOptionalParameters parameters) throws ApiException {
    return listTeamsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TeamsResponse&gt;
   */
  public CompletableFuture<TeamsResponse> listTeamsAsync(ListTeamsOptionalParameters parameters) {
    return listTeamsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Team&gt;
   */
  public PaginationIterable<Team> listTeamsWithPagination() {
    ListTeamsOptionalParameters parameters = new ListTeamsOptionalParameters();
    return listTeamsWithPagination(parameters);
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfo}.
   *
   * @return TeamsResponse
   */
  public PaginationIterable<Team> listTeamsWithPagination(ListTeamsOptionalParameters parameters) {
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
            "listTeams",
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
   * Get all teams. Can be used to search for teams using the <code>filter[keyword]</code> and
   * <code>filter[me]</code> query parameters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamsResponse> listTeamsWithHttpInfo(ListTeamsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    ListTeamsSort sort = parameters.sort;
    List<ListTeamsInclude> include = parameters.include;
    String filterKeyword = parameters.filterKeyword;
    Boolean filterMe = parameters.filterMe;
    List<TeamsField> fieldsTeam = parameters.fieldsTeam;
    // create path and map variables
    String localVarPath = "/api/v2/team";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[keyword]", filterKeyword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[me]", filterMe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[team]", fieldsTeam));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.listTeams",
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
        new GenericType<TeamsResponse>() {});
  }

  /**
   * Get all teams.
   *
   * <p>See {@link #listTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TeamsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamsResponse>> listTeamsWithHttpInfoAsync(
      ListTeamsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    ListTeamsSort sort = parameters.sort;
    List<ListTeamsInclude> include = parameters.include;
    String filterKeyword = parameters.filterKeyword;
    Boolean filterMe = parameters.filterMe;
    List<TeamsField> fieldsTeam = parameters.fieldsTeam;
    // create path and map variables
    String localVarPath = "/api/v2/team";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[keyword]", filterKeyword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[me]", filterMe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[team]", fieldsTeam));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.listTeams",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamsResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamsResponse>() {});
  }

  /**
   * Remove a member team.
   *
   * <p>See {@link #removeMemberTeamWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param memberTeamId None (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void removeMemberTeam(String superTeamId, String memberTeamId) throws ApiException {
    removeMemberTeamWithHttpInfo(superTeamId, memberTeamId);
  }

  /**
   * Remove a member team.
   *
   * <p>See {@link #removeMemberTeamWithHttpInfoAsync}.
   *
   * @param superTeamId None (required)
   * @param memberTeamId None (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> removeMemberTeamAsync(String superTeamId, String memberTeamId) {
    return removeMemberTeamWithHttpInfoAsync(superTeamId, memberTeamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a super team's member team identified by <code>member_team_id</code>.
   *
   * <p><strong>Note</strong>: This API is deprecated. For deleting team hierarchy links, use the
   * team hierarchy links API: <code>DELETE /api/v2/team-hierarchy-links/{link_id}</code>.
   *
   * @param superTeamId None (required)
   * @param memberTeamId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> removeMemberTeamWithHttpInfo(String superTeamId, String memberTeamId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "removeMemberTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'superTeamId' when calling removeMemberTeam");
    }

    // verify the required parameter 'memberTeamId' is set
    if (memberTeamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'memberTeamId' when calling removeMemberTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams/{member_team_id}"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()))
            .replaceAll(
                "\\{" + "member_team_id" + "\\}", apiClient.escapeString(memberTeamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.removeMemberTeam",
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
   * Remove a member team.
   *
   * <p>See {@link #removeMemberTeamWithHttpInfo}.
   *
   * @param superTeamId None (required)
   * @param memberTeamId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> removeMemberTeamWithHttpInfoAsync(
      String superTeamId, String memberTeamId) {
    // Check if unstable operation is enabled
    String operationId = "removeMemberTeam";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'superTeamId' is set
    if (superTeamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'superTeamId' when calling removeMemberTeam"));
      return result;
    }

    // verify the required parameter 'memberTeamId' is set
    if (memberTeamId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'memberTeamId' when calling removeMemberTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{super_team_id}/member_teams/{member_team_id}"
            .replaceAll(
                "\\{" + "super_team_id" + "\\}", apiClient.escapeString(superTeamId.toString()))
            .replaceAll(
                "\\{" + "member_team_id" + "\\}", apiClient.escapeString(memberTeamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.removeMemberTeam",
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
   * Remove a team hierarchy link.
   *
   * <p>See {@link #removeTeamHierarchyLinkWithHttpInfo}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @throws ApiException if fails to make API call
   */
  public void removeTeamHierarchyLink(String linkId) throws ApiException {
    removeTeamHierarchyLinkWithHttpInfo(linkId);
  }

  /**
   * Remove a team hierarchy link.
   *
   * <p>See {@link #removeTeamHierarchyLinkWithHttpInfoAsync}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> removeTeamHierarchyLinkAsync(String linkId) {
    return removeTeamHierarchyLinkWithHttpInfoAsync(linkId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a team hierarchy link by the given link_id.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeTeamHierarchyLinkWithHttpInfo(String linkId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling removeTeamHierarchyLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team-hierarchy-links/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.removeTeamHierarchyLink",
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
   * Remove a team hierarchy link.
   *
   * <p>See {@link #removeTeamHierarchyLinkWithHttpInfo}.
   *
   * @param linkId The team hierarchy link's identifier (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeTeamHierarchyLinkWithHttpInfoAsync(
      String linkId) {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling removeTeamHierarchyLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team-hierarchy-links/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.removeTeamHierarchyLink",
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
   * Link Teams with GitHub Teams.
   *
   * <p>See {@link #syncTeamsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void syncTeams(TeamSyncRequest body) throws ApiException {
    syncTeamsWithHttpInfo(body);
  }

  /**
   * Link Teams with GitHub Teams.
   *
   * <p>See {@link #syncTeamsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> syncTeamsAsync(TeamSyncRequest body) {
    return syncTeamsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint attempts to link your existing Datadog teams with GitHub teams by matching their
   * names. It evaluates all current Datadog teams and compares them against teams in the GitHub
   * organization connected to your Datadog account, based on Datadog Team handle and GitHub Team
   * slug (lowercased and kebab-cased).
   *
   * <p>This operation is read-only on the GitHub side, no teams will be modified or created.
   *
   * <p><a href="https://docs.datadoghq.com/integrations/github/">A GitHub organization must be
   * connected to your Datadog account</a>, and the GitHub App integrated with Datadog must have the
   * <code>Members Read</code> permission. Matching is performed by comparing the Datadog team
   * handle to the GitHub team slug using a normalized exact match; case is ignored and spaces are
   * removed. No modifications are made to teams in GitHub. This only creates new teams in Datadog
   * when type is set to <code>provision</code>.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error - Unexpected error during linking. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> syncTeamsWithHttpInfo(TeamSyncRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling syncTeams");
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/sync";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.syncTeams",
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
   * Link Teams with GitHub Teams.
   *
   * <p>See {@link #syncTeamsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> syncTeamsWithHttpInfoAsync(TeamSyncRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling syncTeams"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/team/sync";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.syncTeams",
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
   * Update a team.
   *
   * <p>See {@link #updateTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return TeamResponse
   * @throws ApiException if fails to make API call
   */
  public TeamResponse updateTeam(String teamId, TeamUpdateRequest body) throws ApiException {
    return updateTeamWithHttpInfo(teamId, body).getData();
  }

  /**
   * Update a team.
   *
   * <p>See {@link #updateTeamWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamResponse&gt;
   */
  public CompletableFuture<TeamResponse> updateTeamAsync(String teamId, TeamUpdateRequest body) {
    return updateTeamWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a team using the team's <code>id</code>. If the <code>team_links</code> relationship is
   * present, the associated links are updated to be in the order they appear in the array, and any
   * existing team links not present are removed.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamResponse> updateTeamWithHttpInfo(String teamId, TeamUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateTeam");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTeam");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.updateTeam",
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
        new GenericType<TeamResponse>() {});
  }

  /**
   * Update a team.
   *
   * <p>See {@link #updateTeamWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamResponse>> updateTeamWithHttpInfoAsync(
      String teamId, TeamUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'teamId' when calling updateTeam"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateTeam"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.updateTeam",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamResponse>() {});
  }

  /**
   * Update a team link.
   *
   * <p>See {@link #updateTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @param body (required)
   * @return TeamLinkResponse
   * @throws ApiException if fails to make API call
   */
  public TeamLinkResponse updateTeamLink(String teamId, String linkId, TeamLinkCreateRequest body)
      throws ApiException {
    return updateTeamLinkWithHttpInfo(teamId, linkId, body).getData();
  }

  /**
   * Update a team link.
   *
   * <p>See {@link #updateTeamLinkWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamLinkResponse&gt;
   */
  public CompletableFuture<TeamLinkResponse> updateTeamLinkAsync(
      String teamId, String linkId, TeamLinkCreateRequest body) {
    return updateTeamLinkWithHttpInfoAsync(teamId, linkId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a team link.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamLinkResponse> updateTeamLinkWithHttpInfo(
      String teamId, String linkId, TeamLinkCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateTeamLink");
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling updateTeamLink");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTeamLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.updateTeamLink",
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Update a team link.
   *
   * <p>See {@link #updateTeamLinkWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param linkId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamLinkResponse>> updateTeamLinkWithHttpInfoAsync(
      String teamId, String linkId, TeamLinkCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling updateTeamLink"));
      return result;
    }

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling updateTeamLink"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTeamLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/links/{link_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.updateTeamLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<TeamLinkResponse>() {});
  }

  /**
   * Update a user&#39;s membership attributes on a team.
   *
   * <p>See {@link #updateTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @param body (required)
   * @return UserTeamResponse
   * @throws ApiException if fails to make API call
   */
  public UserTeamResponse updateTeamMembership(
      String teamId, String userId, UserTeamUpdateRequest body) throws ApiException {
    return updateTeamMembershipWithHttpInfo(teamId, userId, body).getData();
  }

  /**
   * Update a user&#39;s membership attributes on a team.
   *
   * <p>See {@link #updateTeamMembershipWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;UserTeamResponse&gt;
   */
  public CompletableFuture<UserTeamResponse> updateTeamMembershipAsync(
      String teamId, String userId, UserTeamUpdateRequest body) {
    return updateTeamMembershipWithHttpInfoAsync(teamId, userId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a user's membership attributes on a team.
   *
   * <p><strong>Note</strong>: Each team has a setting that determines who is allowed to modify
   * membership of the team. The <code>user_access_manage</code> permission generally grants access
   * to modify membership of any team. To get the full picture, see <a
   * href="https://docs.datadoghq.com/account_management/teams/manage/#team-membership">Team
   * Membership documentation</a>.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @param body (required)
   * @return ApiResponse&lt;UserTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserTeamResponse> updateTeamMembershipWithHttpInfo(
      String teamId, String userId, UserTeamUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateTeamMembership");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling updateTeamMembership");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTeamMembership");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships/{user_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.updateTeamMembership",
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
        new GenericType<UserTeamResponse>() {});
  }

  /**
   * Update a user&#39;s membership attributes on a team.
   *
   * <p>See {@link #updateTeamMembershipWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param userId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserTeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserTeamResponse>> updateTeamMembershipWithHttpInfoAsync(
      String teamId, String userId, UserTeamUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamId' when calling updateTeamMembership"));
      return result;
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userId' when calling updateTeamMembership"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTeamMembership"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/memberships/{user_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.updateTeamMembership",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserTeamResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserTeamResponse>() {});
  }

  /**
   * Update team notification rule.
   *
   * <p>See {@link #updateTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @param body (required)
   * @return TeamNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public TeamNotificationRuleResponse updateTeamNotificationRule(
      String teamId, String ruleId, TeamNotificationRuleRequest body) throws ApiException {
    return updateTeamNotificationRuleWithHttpInfo(teamId, ruleId, body).getData();
  }

  /**
   * Update team notification rule.
   *
   * <p>See {@link #updateTeamNotificationRuleWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamNotificationRuleResponse&gt;
   */
  public CompletableFuture<TeamNotificationRuleResponse> updateTeamNotificationRuleAsync(
      String teamId, String ruleId, TeamNotificationRuleRequest body) {
    return updateTeamNotificationRuleWithHttpInfoAsync(teamId, ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param teamId None (required)
   * @param ruleId None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamNotificationRuleResponse> updateTeamNotificationRuleWithHttpInfo(
      String teamId, String ruleId, TeamNotificationRuleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateTeamNotificationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateTeamNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTeamNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.updateTeamNotificationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Update team notification rule.
   *
   * <p>See {@link #updateTeamNotificationRuleWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param ruleId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamNotificationRuleResponse>>
      updateTeamNotificationRuleWithHttpInfoAsync(
          String teamId, String ruleId, TeamNotificationRuleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling updateTeamNotificationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling updateTeamNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateTeamNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/notification-rules/{rule_id}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.updateTeamNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamNotificationRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamNotificationRuleResponse>() {});
  }

  /**
   * Update permission setting for team.
   *
   * <p>See {@link #updateTeamPermissionSettingWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param action None (required)
   * @param body (required)
   * @return TeamPermissionSettingResponse
   * @throws ApiException if fails to make API call
   */
  public TeamPermissionSettingResponse updateTeamPermissionSetting(
      String teamId, String action, TeamPermissionSettingUpdateRequest body) throws ApiException {
    return updateTeamPermissionSettingWithHttpInfo(teamId, action, body).getData();
  }

  /**
   * Update permission setting for team.
   *
   * <p>See {@link #updateTeamPermissionSettingWithHttpInfoAsync}.
   *
   * @param teamId None (required)
   * @param action None (required)
   * @param body (required)
   * @return CompletableFuture&lt;TeamPermissionSettingResponse&gt;
   */
  public CompletableFuture<TeamPermissionSettingResponse> updateTeamPermissionSettingAsync(
      String teamId, String action, TeamPermissionSettingUpdateRequest body) {
    return updateTeamPermissionSettingWithHttpInfoAsync(teamId, action, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a team permission setting for a given team.
   *
   * @param teamId None (required)
   * @param action None (required)
   * @param body (required)
   * @return ApiResponse&lt;TeamPermissionSettingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TeamPermissionSettingResponse> updateTeamPermissionSettingWithHttpInfo(
      String teamId, String action, TeamPermissionSettingUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamId' when calling updateTeamPermissionSetting");
    }

    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(
          400, "Missing the required parameter 'action' when calling updateTeamPermissionSetting");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTeamPermissionSetting");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/permission-settings/{action}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TeamsApi.updateTeamPermissionSetting",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TeamPermissionSettingResponse>() {});
  }

  /**
   * Update permission setting for team.
   *
   * <p>See {@link #updateTeamPermissionSettingWithHttpInfo}.
   *
   * @param teamId None (required)
   * @param action None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TeamPermissionSettingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TeamPermissionSettingResponse>>
      updateTeamPermissionSettingWithHttpInfoAsync(
          String teamId, String action, TeamPermissionSettingUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      CompletableFuture<ApiResponse<TeamPermissionSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'teamId' when calling updateTeamPermissionSetting"));
      return result;
    }

    // verify the required parameter 'action' is set
    if (action == null) {
      CompletableFuture<ApiResponse<TeamPermissionSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'action' when calling updateTeamPermissionSetting"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TeamPermissionSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateTeamPermissionSetting"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/team/{team_id}/permission-settings/{action}"
            .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TeamsApi.updateTeamPermissionSetting",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TeamPermissionSettingResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<TeamPermissionSettingResponse>() {});
  }
}
