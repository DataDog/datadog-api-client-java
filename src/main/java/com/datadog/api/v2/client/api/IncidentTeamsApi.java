package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.IncidentTeamCreateRequest;
import com.datadog.api.v2.client.model.IncidentTeamResponse;
import com.datadog.api.v2.client.model.IncidentTeamUpdateRequest;
import com.datadog.api.v2.client.model.IncidentTeamsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<IncidentTeamResponse> createIncidentTeamWithHttpInfo(IncidentTeamCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIncidentTeam");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentTeamResponse> localVarReturnType = new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI("IncidentTeamsApi.createIncidentTeam", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateIncidentTeamRequest {
    private IncidentTeamCreateRequest body;

    private APIcreateIncidentTeamRequest() {
    }

    /**
     * Set body
     * @param body Incident Team Payload. (required)
     * @return APIcreateIncidentTeamRequest
     */
    public APIcreateIncidentTeamRequest body(IncidentTeamCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createIncidentTeam request
     * @return IncidentTeamResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IncidentTeamResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createIncidentTeam request with HTTP info returned
     * @return ApiResponse&lt;IncidentTeamResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<IncidentTeamResponse> executeWithHttpInfo() throws ApiException {
      return createIncidentTeamWithHttpInfo(body);
    }
  }

  /**
   * Create a new incident team
   * Creates a new incident team.
   * @return createIncidentTeamRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateIncidentTeamRequest createIncidentTeam() throws ApiException {
    String operationId = "createIncidentTeam";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIcreateIncidentTeamRequest();
  }

private ApiResponse<Void> deleteIncidentTeamWithHttpInfo(String teamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling deleteIncidentTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/teams/{team_id}"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncidentTeam");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("IncidentTeamsApi.deleteIncidentTeam", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteIncidentTeamRequest {
    private String teamId;

    private APIdeleteIncidentTeamRequest(String teamId) {
      this.teamId = teamId;
    }

    /**
     * Execute deleteIncidentTeam request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteIncidentTeam request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteIncidentTeamWithHttpInfo(teamId);
    }
  }

  /**
   * Delete an existing incident team
   * Deletes an existing incident team.
   * @param teamId The ID of the incident team. (required)
   * @return deleteIncidentTeamRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteIncidentTeamRequest deleteIncidentTeam(String teamId) throws ApiException {
    String operationId = "deleteIncidentTeam";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIdeleteIncidentTeamRequest(teamId);
  }

private ApiResponse<IncidentTeamResponse> getIncidentTeamWithHttpInfo(String teamId, String include) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getIncidentTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/teams/{team_id}"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentTeam");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentTeamResponse> localVarReturnType = new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI("IncidentTeamsApi.getIncidentTeam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetIncidentTeamRequest {
    private String teamId;
    private String include;

    private APIgetIncidentTeamRequest(String teamId) {
      this.teamId = teamId;
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIgetIncidentTeamRequest
     */
    public APIgetIncidentTeamRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Execute getIncidentTeam request
     * @return IncidentTeamResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IncidentTeamResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIncidentTeam request with HTTP info returned
     * @return ApiResponse&lt;IncidentTeamResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<IncidentTeamResponse> executeWithHttpInfo() throws ApiException {
      return getIncidentTeamWithHttpInfo(teamId, include);
    }
  }

  /**
   * Get details of an incident team
   * Get details of an incident team. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident teams.
   * @param teamId The ID of the incident team. (required)
   * @return getIncidentTeamRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIncidentTeamRequest getIncidentTeam(String teamId) throws ApiException {
    String operationId = "getIncidentTeam";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetIncidentTeamRequest(teamId);
  }

private ApiResponse<IncidentTeamsResponse> listIncidentTeamsWithHttpInfo(String include, Long pageSize, Long pageOffset, String filter) throws ApiException {
    Object localVarPostBody = null;
    
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentTeamsResponse> localVarReturnType = new GenericType<IncidentTeamsResponse>() {};

    return apiClient.invokeAPI("IncidentTeamsApi.listIncidentTeams", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistIncidentTeamsRequest {
    private String include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    private APIlistIncidentTeamsRequest() {
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIlistIncidentTeamsRequest
     */
    public APIlistIncidentTeamsRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistIncidentTeamsRequest
     */
    public APIlistIncidentTeamsRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0l)
     * @return APIlistIncidentTeamsRequest
     */
    public APIlistIncidentTeamsRequest pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filter
     * @param filter A search query that filters teams by name. (optional)
     * @return APIlistIncidentTeamsRequest
     */
    public APIlistIncidentTeamsRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Execute listIncidentTeams request
     * @return IncidentTeamsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IncidentTeamsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listIncidentTeams request with HTTP info returned
     * @return ApiResponse&lt;IncidentTeamsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<IncidentTeamsResponse> executeWithHttpInfo() throws ApiException {
      return listIncidentTeamsWithHttpInfo(include, pageSize, pageOffset, filter);
    }
  }

  /**
   * Get a list of all incident teams
   * Get all incident teams for the requesting user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident teams.
   * @return listIncidentTeamsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistIncidentTeamsRequest listIncidentTeams() throws ApiException {
    String operationId = "listIncidentTeams";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistIncidentTeamsRequest();
  }

private ApiResponse<IncidentTeamResponse> updateIncidentTeamWithHttpInfo(String teamId, IncidentTeamUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling updateIncidentTeam");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIncidentTeam");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/teams/{team_id}"
      .replaceAll("\\{" + "team_id" + "\\}", apiClient.escapeString(teamId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncidentTeam");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentTeamResponse> localVarReturnType = new GenericType<IncidentTeamResponse>() {};

    return apiClient.invokeAPI("IncidentTeamsApi.updateIncidentTeam", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateIncidentTeamRequest {
    private String teamId;
    private IncidentTeamUpdateRequest body;

    private APIupdateIncidentTeamRequest(String teamId) {
      this.teamId = teamId;
    }

    /**
     * Set body
     * @param body Incident Team Payload. (required)
     * @return APIupdateIncidentTeamRequest
     */
    public APIupdateIncidentTeamRequest body(IncidentTeamUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateIncidentTeam request
     * @return IncidentTeamResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IncidentTeamResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateIncidentTeam request with HTTP info returned
     * @return ApiResponse&lt;IncidentTeamResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<IncidentTeamResponse> executeWithHttpInfo() throws ApiException {
      return updateIncidentTeamWithHttpInfo(teamId, body);
    }
  }

  /**
   * Update an existing incident team
   * Updates an existing incident team. Only provide the attributes which should be updated as this request is a partial update.
   * @param teamId The ID of the incident team. (required)
   * @return updateIncidentTeamRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateIncidentTeamRequest updateIncidentTeam(String teamId) throws ApiException {
    String operationId = "updateIncidentTeam";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateIncidentTeamRequest(teamId);
  }
}
