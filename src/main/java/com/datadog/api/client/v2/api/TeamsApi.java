package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetTeamMembershipsSort;
import com.datadog.api.client.v2.model.ListTeamsInclude;
import com.datadog.api.client.v2.model.ListTeamsSort;
import com.datadog.api.client.v2.model.Team;
import com.datadog.api.client.v2.model.TeamCreateRequest;
import com.datadog.api.client.v2.model.TeamLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamLinkResponse;
import com.datadog.api.client.v2.model.TeamLinksResponse;
import com.datadog.api.client.v2.model.TeamPermissionSettingResponse;
import com.datadog.api.client.v2.model.TeamPermissionSettingUpdateRequest;
import com.datadog.api.client.v2.model.TeamPermissionSettingsResponse;
import com.datadog.api.client.v2.model.TeamResponse;
import com.datadog.api.client.v2.model.TeamUpdateRequest;
import com.datadog.api.client.v2.model.TeamsField;
import com.datadog.api.client.v2.model.TeamsResponse;
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * @param teamId None (required)
   * @param userId None (required)
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
