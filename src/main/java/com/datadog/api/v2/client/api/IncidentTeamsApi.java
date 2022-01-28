package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.IncidentRelatedObject;
import com.datadog.api.v2.client.model.IncidentTeamCreateRequest;
import com.datadog.api.v2.client.model.IncidentTeamResponse;
import com.datadog.api.v2.client.model.IncidentTeamUpdateRequest;
import com.datadog.api.v2.client.model.IncidentTeamsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentTeamsApi {
  private ApiClient apiClient;

  public IncidentTeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IncidentTeamsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new incident team
   *
   * <p>See {@link #createIncidentTeamWithHttpInfo}.
   *
   * @param body Incident Team Payload. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamResponse createIncidentTeam(IncidentTeamCreateRequest body)
      throws ApiException {
    return createIncidentTeamWithHttpInfo(body).getData();
  }

  public CompletableFuture<IncidentTeamResponse> createIncidentTeamAsync(
      IncidentTeamCreateRequest body) {
    return createIncidentTeamWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new incident team
   *
   * <p>Creates a new incident team.
   *
   * @param body Incident Team Payload. (required)
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTeamResponse> createIncidentTeamWithHttpInfo(
      IncidentTeamCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentTeam");
    }
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI(
        "IncidentTeamsApi.createIncidentTeam",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create a new incident team
   *
   * <p>See {@link #createIncidentTeamWithHttpInfo}.
   *
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> createIncidentTeamWithHttpInfoAsync(
      IncidentTeamCreateRequest body) {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPIAsync(
        "IncidentTeamsApi.createIncidentTeam",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete an existing incident team
   *
   * <p>See {@link #deleteIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentTeam(String teamId) throws ApiException {
    deleteIncidentTeamWithHttpInfo(teamId);
  }

  public CompletableFuture<Void> deleteIncidentTeamAsync(String teamId) {
    return deleteIncidentTeamWithHttpInfoAsync(teamId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing incident team
   *
   * <p>Deletes an existing incident team.
   *
   * @param teamId The ID of the incident team. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentTeamWithHttpInfo(String teamId) throws ApiException {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "IncidentTeamsApi.deleteIncidentTeam",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Delete an existing incident team
   *
   * <p>See {@link #deleteIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTeamWithHttpInfoAsync(String teamId) {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
        "IncidentTeamsApi.deleteIncidentTeam",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /** Manage optional parameters to getIncidentTeam. */
  public static class GetIncidentTeamOptionalParameters {
    private IncidentRelatedObject include;

    /**
     * Set include
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
   * Get details of an incident team
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamResponse getIncidentTeam(String teamId) throws ApiException {
    return getIncidentTeamWithHttpInfo(teamId, new GetIncidentTeamOptionalParameters()).getData();
  }

  /**
   * Get details of an incident team
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   */
  public CompletableFuture<IncidentTeamResponse> getIncidentTeamAsync(String teamId) {
    return getIncidentTeamWithHttpInfoAsync(teamId, new GetIncidentTeamOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident team
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamResponse getIncidentTeam(
      String teamId, GetIncidentTeamOptionalParameters parameters) throws ApiException {
    return getIncidentTeamWithHttpInfo(teamId, parameters).getData();
  }

  /**
   * Get details of an incident team
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTeamResponse&gt;
   */
  public CompletableFuture<IncidentTeamResponse> getIncidentTeamAsync(
      String teamId, GetIncidentTeamOptionalParameters parameters) {
    return getIncidentTeamWithHttpInfoAsync(teamId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident team
   *
   * <p>Get details of an incident team. If the &#x60;include[users]&#x60; query parameter is
   * provided, the included attribute will contain the users related to these incident teams.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTeamResponse> getIncidentTeamWithHttpInfo(
      String teamId, GetIncidentTeamOptionalParameters parameters) throws ApiException {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI(
        "IncidentTeamsApi.getIncidentTeam",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get details of an incident team
   *
   * <p>See {@link #getIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> getIncidentTeamWithHttpInfoAsync(
      String teamId, GetIncidentTeamOptionalParameters parameters) {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPIAsync(
        "IncidentTeamsApi.getIncidentTeam",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listIncidentTeams. */
  public static class ListIncidentTeamsOptionalParameters {
    private IncidentRelatedObject include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    /**
     * Set include
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
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListIncidentTeamsOptionalParameters
     */
    public ListIncidentTeamsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
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
     * Set filter
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
   * Get a list of all incident teams
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @return IncidentTeamsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamsResponse listIncidentTeams() throws ApiException {
    return listIncidentTeamsWithHttpInfo(new ListIncidentTeamsOptionalParameters()).getData();
  }

  /**
   * Get a list of all incident teams
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;IncidentTeamsResponse&gt;
   */
  public CompletableFuture<IncidentTeamsResponse> listIncidentTeamsAsync() {
    return listIncidentTeamsWithHttpInfoAsync(new ListIncidentTeamsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all incident teams
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentTeamsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamsResponse listIncidentTeams(ListIncidentTeamsOptionalParameters parameters)
      throws ApiException {
    return listIncidentTeamsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of all incident teams
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTeamsResponse&gt;
   */
  public CompletableFuture<IncidentTeamsResponse> listIncidentTeamsAsync(
      ListIncidentTeamsOptionalParameters parameters) {
    return listIncidentTeamsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all incident teams
   *
   * <p>Get all incident teams for the requesting user&#39;s organization. If the
   * &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the
   * users related to these incident teams.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTeamsResponse> listIncidentTeamsWithHttpInfo(
      ListIncidentTeamsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidentTeams");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamsResponse> localVarReturnType =
        new GenericType<IncidentTeamsResponse>() {};

    return apiClient.invokeAPI(
        "IncidentTeamsApi.listIncidentTeams",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get a list of all incident teams
   *
   * <p>See {@link #listIncidentTeamsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTeamsResponse>> listIncidentTeamsWithHttpInfoAsync(
      ListIncidentTeamsOptionalParameters parameters) {
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/teams";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidentTeams");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamsResponse> localVarReturnType =
        new GenericType<IncidentTeamsResponse>() {};

    return apiClient.invokeAPIAsync(
        "IncidentTeamsApi.listIncidentTeams",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update an existing incident team
   *
   * <p>See {@link #updateIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return IncidentTeamResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTeamResponse updateIncidentTeam(String teamId, IncidentTeamUpdateRequest body)
      throws ApiException {
    return updateIncidentTeamWithHttpInfo(teamId, body).getData();
  }

  public CompletableFuture<IncidentTeamResponse> updateIncidentTeamAsync(
      String teamId, IncidentTeamUpdateRequest body) {
    return updateIncidentTeamWithHttpInfoAsync(teamId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing incident team
   *
   * <p>Updates an existing incident team. Only provide the attributes which should be updated as
   * this request is a partial update.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return ApiResponse&lt;IncidentTeamResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTeamResponse> updateIncidentTeamWithHttpInfo(
      String teamId, IncidentTeamUpdateRequest body) throws ApiException {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI(
        "IncidentTeamsApi.updateIncidentTeam",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update an existing incident team
   *
   * <p>See {@link #updateIncidentTeamWithHttpInfo}.
   *
   * @param teamId The ID of the incident team. (required)
   * @param body Incident Team Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTeamResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTeamResponse>> updateIncidentTeamWithHttpInfoAsync(
      String teamId, IncidentTeamUpdateRequest body) {
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncidentTeam");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentTeamResponse> localVarReturnType =
        new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPIAsync(
        "IncidentTeamsApi.updateIncidentTeam",
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
