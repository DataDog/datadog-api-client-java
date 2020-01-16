package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.CheckCanDeleteServiceLevelObjectiveResponse;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error401;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error404;
import com.datadog.api.v1.client.model.HistoryServiceLevelObjectiveResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveDeleted;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveListResponse;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveResponse;
import com.datadog.api.v1.client.model.ServiceLevelObjectivesBulkDeleted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SloApi {
  private ApiClient apiClient;

  public SloApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SloApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<ServiceLevelObjectivesBulkDeleted> bulkPartialDeleteSLOWithHttpInfo(Map<String, List<SLOTimeframe>> body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling bulkPartialDeleteSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectivesBulkDeleted> localVarReturnType = new GenericType<ServiceLevelObjectivesBulkDeleted>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIbulkPartialDeleteSLORequest {
    private Map<String, List<SLOTimeframe>> body;

    private APIbulkPartialDeleteSLORequest() {
    }
    

    /**
     * Set body
     * @param body Thresholds by service level objective object ID (required)
     * @return APIbulkPartialDeleteSLORequest
     */
    public APIbulkPartialDeleteSLORequest body(Map<String, List<SLOTimeframe>> body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute bulkPartialDeleteSLO request
     * @return ServiceLevelObjectivesBulkDeleted
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ServiceLevelObjectivesBulkDeleted execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute bulkPartialDeleteSLO request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectivesBulkDeleted&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<ServiceLevelObjectivesBulkDeleted> executeWithHttpInfo() throws ApiException {
      return bulkPartialDeleteSLOWithHttpInfo(body);
    }
  }

  /**
   * Delete (or partially delete) multiple service level objective objects.
   * ### Overview Delete (or partially delete) multiple service level objective objects. This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
   * @return bulkPartialDeleteSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIbulkPartialDeleteSLORequest bulkPartialDeleteSLO() throws ApiException {
    return new APIbulkPartialDeleteSLORequest();
  }

private ApiResponse<CheckCanDeleteServiceLevelObjectiveResponse> checkCanDeleteSLOWithHttpInfo(String ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling checkCanDeleteSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/can_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<CheckCanDeleteServiceLevelObjectiveResponse> localVarReturnType = new GenericType<CheckCanDeleteServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcheckCanDeleteSLORequest {
    private String ids;

    private APIcheckCanDeleteSLORequest() {
    }
    

    /**
     * Set ids
     * @param ids A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). (required)
     * @return APIcheckCanDeleteSLORequest
     */
    public APIcheckCanDeleteSLORequest ids(String ids) {
      this.ids = ids;
      return this;
    }
    

    /**
     * Execute checkCanDeleteSLO request
     * @return CheckCanDeleteServiceLevelObjectiveResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CheckCanDeleteServiceLevelObjectiveResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkCanDeleteSLO request with HTTP info returned
     * @return ApiResponse&lt;CheckCanDeleteServiceLevelObjectiveResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<CheckCanDeleteServiceLevelObjectiveResponse> executeWithHttpInfo() throws ApiException {
      return checkCanDeleteSLOWithHttpInfo(ids);
    }
  }

  /**
   * Check if SLOs can be safely deleted.
   * ### Overview Check if an SLO can be safely deleted without disrupting dashboards for example. ### Arguments * **&#x60;ids&#x60;** [*required*]: The ID (csv) of the service level objective objects to check.
   * @return checkCanDeleteSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcheckCanDeleteSLORequest checkCanDeleteSLO() throws ApiException {
    return new APIcheckCanDeleteSLORequest();
  }

private ApiResponse<ServiceLevelObjectiveListResponse> createSLOWithHttpInfo(ServiceLevelObjective body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveListResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateSLORequest {
    private ServiceLevelObjective body;

    private APIcreateSLORequest() {
    }
    

    /**
     * Set body
     * @param body Service level objective request object (required)
     * @return APIcreateSLORequest
     */
    public APIcreateSLORequest body(ServiceLevelObjective body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createSLO request
     * @return ServiceLevelObjectiveListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ServiceLevelObjectiveListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createSLO request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectiveListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<ServiceLevelObjectiveListResponse> executeWithHttpInfo() throws ApiException {
      return createSLOWithHttpInfo(body);
    }
  }

  /**
   * Create a service level objective object.
   * ### Overview Create a service level objective object.
   * @return createSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateSLORequest createSLO() throws ApiException {
    return new APIcreateSLORequest();
  }

private ApiResponse<ServiceLevelObjectiveDeleted> deleteSLOWithHttpInfo(String sloId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling deleteSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveDeleted> localVarReturnType = new GenericType<ServiceLevelObjectiveDeleted>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteSLORequest {
    private String sloId;

    private APIdeleteSLORequest(String sloId) {
      this.sloId = sloId;
    }
    

    /**
     * Execute deleteSLO request
     * @return ServiceLevelObjectiveDeleted
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ServiceLevelObjectiveDeleted execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteSLO request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectiveDeleted&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<ServiceLevelObjectiveDeleted> executeWithHttpInfo() throws ApiException {
      return deleteSLOWithHttpInfo(sloId);
    }
  }

  /**
   * Delete the specified service level objective object.
   * ### Overview Delete the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The id of the service level objective (required)
   * @return deleteSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteSLORequest deleteSLO(String sloId) throws ApiException {
    return new APIdeleteSLORequest(sloId);
  }

private ApiResponse<ServiceLevelObjectiveListResponse> editSLOWithHttpInfo(String sloId, ServiceLevelObjective body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling editSLO");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling editSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveListResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIeditSLORequest {
    private String sloId;
    private ServiceLevelObjective body;

    private APIeditSLORequest(String sloId) {
      this.sloId = sloId;
    }
    

    /**
     * Set body
     * @param body The edited service level objective request object. (required)
     * @return APIeditSLORequest
     */
    public APIeditSLORequest body(ServiceLevelObjective body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute editSLO request
     * @return ServiceLevelObjectiveListResponse
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
    
    public ServiceLevelObjectiveListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute editSLO request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectiveListResponse&gt;
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
    
    public ApiResponse<ServiceLevelObjectiveListResponse> executeWithHttpInfo() throws ApiException {
      return editSLOWithHttpInfo(sloId, body);
    }
  }

  /**
   * Edit the specified service level objective
   * ### Overview Edit the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @return editSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIeditSLORequest editSLO(String sloId) throws ApiException {
    return new APIeditSLORequest(sloId);
  }

private ApiResponse<ServiceLevelObjectiveResponse> getSLOWithHttpInfo(String sloId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetSLORequest {
    private String sloId;

    private APIgetSLORequest(String sloId) {
      this.sloId = sloId;
    }
    

    /**
     * Execute getSLO request
     * @return ServiceLevelObjectiveResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ServiceLevelObjectiveResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSLO request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectiveResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<ServiceLevelObjectiveResponse> executeWithHttpInfo() throws ApiException {
      return getSLOWithHttpInfo(sloId);
    }
  }

  /**
   * Get a service level objective object
   * ### Overview Get a service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @return getSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetSLORequest getSLO(String sloId) throws ApiException {
    return new APIgetSLORequest(sloId);
  }

private ApiResponse<ServiceLevelObjectiveListResponse> getSLOsWithHttpInfo(String ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSLOs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveListResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetSLOsRequest {
    private String ids;

    private APIgetSLOsRequest() {
    }
    

    /**
     * Set ids
     * @param ids A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). (required)
     * @return APIgetSLOsRequest
     */
    public APIgetSLOsRequest ids(String ids) {
      this.ids = ids;
      return this;
    }
    

    /**
     * Execute getSLOs request
     * @return ServiceLevelObjectiveListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ServiceLevelObjectiveListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSLOs request with HTTP info returned
     * @return ApiResponse&lt;ServiceLevelObjectiveListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<ServiceLevelObjectiveListResponse> executeWithHttpInfo() throws ApiException {
      return getSLOsWithHttpInfo(ids);
    }
  }

  /**
   * Get multiple service level objective objects by their IDs.
   * ### Overview Get multiple service level objective objects by their IDs. ### Arguments * **&#x60;ids&#x60;** [*required*]: A comma separated list of the IDs of the service level   objectives objects (e.g. \&quot;id1,id2,id3\&quot;).
   * @return getSLOsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetSLOsRequest getSLOs() throws ApiException {
    return new APIgetSLOsRequest();
  }

private ApiResponse<HistoryServiceLevelObjectiveResponse> historyForSLOWithHttpInfo(String sloId, String fromTs, String toTs) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling historyForSLO");
    }
    
    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      throw new ApiException(400, "Missing the required parameter 'fromTs' when calling historyForSLO");
    }
    
    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      throw new ApiException(400, "Missing the required parameter 'toTs' when calling historyForSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}/history"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HistoryServiceLevelObjectiveResponse> localVarReturnType = new GenericType<HistoryServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIhistoryForSLORequest {
    private String sloId;
    private String fromTs;
    private String toTs;

    private APIhistoryForSLORequest(String sloId) {
      this.sloId = sloId;
    }
    

    /**
     * Set fromTs
     * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds (required)
     * @return APIhistoryForSLORequest
     */
    public APIhistoryForSLORequest fromTs(String fromTs) {
      this.fromTs = fromTs;
      return this;
    }
    

    /**
     * Set toTs
     * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds (required)
     * @return APIhistoryForSLORequest
     */
    public APIhistoryForSLORequest toTs(String toTs) {
      this.toTs = toTs;
      return this;
    }
    

    /**
     * Execute historyForSLO request
     * @return HistoryServiceLevelObjectiveResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HistoryServiceLevelObjectiveResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute historyForSLO request with HTTP info returned
     * @return ApiResponse&lt;HistoryServiceLevelObjectiveResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HistoryServiceLevelObjectiveResponse> executeWithHttpInfo() throws ApiException {
      return historyForSLOWithHttpInfo(sloId, fromTs, toTs);
    }
  }

  /**
   * Get the history of the service level objective.
   * ### Overview Get the SLO history data ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object * **&#x60;from_ts&#x60;** [*required*]: The &#x60;from&#x60; timestamp in epoch seconds for the query timeframe * **&#x60;to_ts&#x60;** [*required*]: The &#x60;to&#x60; timestamp in epoch seconds for the query timeframe
   * @param sloId The ID of the service level objective object (required)
   * @return historyForSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIhistoryForSLORequest historyForSLO(String sloId) throws ApiException {
    return new APIhistoryForSLORequest(sloId);
  }
}
