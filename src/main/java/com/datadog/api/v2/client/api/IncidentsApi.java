package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.IncidentCreateRequest;
import com.datadog.api.v2.client.model.IncidentRelatedObject;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.IncidentUpdateRequest;
import com.datadog.api.v2.client.model.IncidentsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentsApi {
  private ApiClient apiClient;

  public IncidentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IncidentsApi(ApiClient apiClient) {
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


private ApiResponse<IncidentResponse> createIncidentWithHttpInfo(IncidentCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIncident");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncident");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentResponse> localVarReturnType = new GenericType<IncidentResponse>() {};

    return apiClient.invokeAPI("IncidentsApi.createIncident", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateIncidentRequest {
    private IncidentCreateRequest body;

    private APIcreateIncidentRequest() {
    }

    /**
     * Set body
     * @param body Incident payload. (required)
     * @return APIcreateIncidentRequest
     */
    public APIcreateIncidentRequest body(IncidentCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createIncident request
     * @return IncidentResponse
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
    
    public IncidentResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createIncident request with HTTP info returned
     * @return ApiResponse&lt;IncidentResponse&gt;
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
    public ApiResponse<IncidentResponse> executeWithHttpInfo() throws ApiException {
      return createIncidentWithHttpInfo(body);
    }
  }

  /**
   * Create an incident
   * Create an incident.
   * @return createIncidentRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateIncidentRequest createIncident() throws ApiException {
    String operationId = "createIncident";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIcreateIncidentRequest();
  }

private ApiResponse<Void> deleteIncidentWithHttpInfo(String incidentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(400, "Missing the required parameter 'incidentId' when calling deleteIncident");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/incidents/{incident_id}"
      .replaceAll("\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncident");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("IncidentsApi.deleteIncident", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteIncidentRequest {
    private String incidentId;

    private APIdeleteIncidentRequest(String incidentId) {
      this.incidentId = incidentId;
    }

    /**
     * Execute deleteIncident request
     
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
     * Execute deleteIncident request with HTTP info returned
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
      return deleteIncidentWithHttpInfo(incidentId);
    }
  }

  /**
   * Delete an existing incident
   * Deletes an existing incident from the users organization.
   * @param incidentId The UUID the incident. (required)
   * @return deleteIncidentRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteIncidentRequest deleteIncident(String incidentId) throws ApiException {
    String operationId = "deleteIncident";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIdeleteIncidentRequest(incidentId);
  }

private ApiResponse<IncidentResponse> getIncidentWithHttpInfo(String incidentId, List<IncidentRelatedObject> include) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(400, "Missing the required parameter 'incidentId' when calling getIncident");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/incidents/{incident_id}"
      .replaceAll("\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncident");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentResponse> localVarReturnType = new GenericType<IncidentResponse>() {};

    return apiClient.invokeAPI("IncidentsApi.getIncident", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetIncidentRequest {
    private String incidentId;
    private List<IncidentRelatedObject> include;

    private APIgetIncidentRequest(String incidentId) {
      this.incidentId = incidentId;
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIgetIncidentRequest
     */
    public APIgetIncidentRequest include(List<IncidentRelatedObject> include) {
      this.include = include;
      return this;
    }

    /**
     * Execute getIncident request
     * @return IncidentResponse
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
    
    public IncidentResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIncident request with HTTP info returned
     * @return ApiResponse&lt;IncidentResponse&gt;
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
    public ApiResponse<IncidentResponse> executeWithHttpInfo() throws ApiException {
      return getIncidentWithHttpInfo(incidentId, include);
    }
  }

  /**
   * Get the details of an incident
   * Get the details of an incident by &#x60;incident_id&#x60;.
   * @param incidentId The UUID the incident. (required)
   * @return getIncidentRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIncidentRequest getIncident(String incidentId) throws ApiException {
    String operationId = "getIncident";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetIncidentRequest(incidentId);
  }

private ApiResponse<IncidentsResponse> listIncidentsWithHttpInfo(List<IncidentRelatedObject> include, Long pageSize, Long pageOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidents");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentsResponse> localVarReturnType = new GenericType<IncidentsResponse>() {};

    return apiClient.invokeAPI("IncidentsApi.listIncidents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistIncidentsRequest {
    private List<IncidentRelatedObject> include;
    private Long pageSize;
    private Long pageOffset;

    private APIlistIncidentsRequest() {
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIlistIncidentsRequest
     */
    public APIlistIncidentsRequest include(List<IncidentRelatedObject> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistIncidentsRequest
     */
    public APIlistIncidentsRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0l)
     * @return APIlistIncidentsRequest
     */
    public APIlistIncidentsRequest pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Execute listIncidents request
     * @return IncidentsResponse
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
    
    public IncidentsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listIncidents request with HTTP info returned
     * @return ApiResponse&lt;IncidentsResponse&gt;
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
    public ApiResponse<IncidentsResponse> executeWithHttpInfo() throws ApiException {
      return listIncidentsWithHttpInfo(include, pageSize, pageOffset);
    }
  }

  /**
   * Get a list of incidents
   * Get all incidents for the user&#39;s organization.
   * @return listIncidentsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistIncidentsRequest listIncidents() throws ApiException {
    String operationId = "listIncidents";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistIncidentsRequest();
  }

private ApiResponse<IncidentResponse> updateIncidentWithHttpInfo(String incidentId, IncidentUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(400, "Missing the required parameter 'incidentId' when calling updateIncident");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIncident");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/incidents/{incident_id}"
      .replaceAll("\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncident");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentResponse> localVarReturnType = new GenericType<IncidentResponse>() {};

    return apiClient.invokeAPI("IncidentsApi.updateIncident", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateIncidentRequest {
    private String incidentId;
    private IncidentUpdateRequest body;

    private APIupdateIncidentRequest(String incidentId) {
      this.incidentId = incidentId;
    }

    /**
     * Set body
     * @param body Incident Payload. (required)
     * @return APIupdateIncidentRequest
     */
    public APIupdateIncidentRequest body(IncidentUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateIncident request
     * @return IncidentResponse
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
    
    public IncidentResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateIncident request with HTTP info returned
     * @return ApiResponse&lt;IncidentResponse&gt;
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
    public ApiResponse<IncidentResponse> executeWithHttpInfo() throws ApiException {
      return updateIncidentWithHttpInfo(incidentId, body);
    }
  }

  /**
   * Update an existing incident
   * Updates an incident. Provide only the attributes that should be updated as this request is a partial update.
   * @param incidentId The UUID the incident. (required)
   * @return updateIncidentRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateIncidentRequest updateIncident(String incidentId) throws ApiException {
    String operationId = "updateIncident";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateIncidentRequest(incidentId);
  }
}
