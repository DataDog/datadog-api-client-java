package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CheckCanDeleteSLOResponse;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponse;
import com.datadog.api.v1.client.model.SLODeleteResponse;
import com.datadog.api.v1.client.model.SLOHistoryResponse;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectivesApi {
  private ApiClient apiClient;

  public ServiceLevelObjectivesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectivesApi(ApiClient apiClient) {
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


private ApiResponse<CheckCanDeleteSLOResponse> checkCanDeleteSLOWithHttpInfo(String ids) throws ApiException {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteSLO");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<CheckCanDeleteSLOResponse> localVarReturnType = new GenericType<CheckCanDeleteSLOResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.checkCanDeleteSLO", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcheckCanDeleteSLORequest {
    private String ids;

    private APIcheckCanDeleteSLORequest() {
    }

    /**
     * Set ids
     * @param ids A comma separated list of the IDs of the service level objectives objects. (required)
     * @return APIcheckCanDeleteSLORequest
     */
    public APIcheckCanDeleteSLORequest ids(String ids) {
      this.ids = ids;
      return this;
    }

    /**
     * Execute checkCanDeleteSLO request
     * @return CheckCanDeleteSLOResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CheckCanDeleteSLOResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkCanDeleteSLO request with HTTP info returned
     * @return ApiResponse&lt;CheckCanDeleteSLOResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CheckCanDeleteSLOResponse> executeWithHttpInfo() throws ApiException {
      return checkCanDeleteSLOWithHttpInfo(ids);
    }
  }

  /**
   * Check if SLOs can be safely deleted
   * Check if a SLO can be safely deleted. For example, assure an SLO can be deleted without disrupting a dashboard.
   * @return checkCanDeleteSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcheckCanDeleteSLORequest checkCanDeleteSLO() throws ApiException {
    return new APIcheckCanDeleteSLORequest();
  }

private ApiResponse<SLOListResponse> createSLOWithHttpInfo(ServiceLevelObjectiveRequest body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLO");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.createSLO", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateSLORequest {
    private ServiceLevelObjectiveRequest body;

    private APIcreateSLORequest() {
    }

    /**
     * Set body
     * @param body Service level objective request object. (required)
     * @return APIcreateSLORequest
     */
    public APIcreateSLORequest body(ServiceLevelObjectiveRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createSLO request
     * @return SLOListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createSLO request with HTTP info returned
     * @return ApiResponse&lt;SLOListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOListResponse> executeWithHttpInfo() throws ApiException {
      return createSLOWithHttpInfo(body);
    }
  }

  /**
   * Create a SLO object
   * Create a service level objective object.
   * @return createSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateSLORequest createSLO() throws ApiException {
    return new APIcreateSLORequest();
  }

private ApiResponse<SLODeleteResponse> deleteSLOWithHttpInfo(String sloId, String force) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLO");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLODeleteResponse> localVarReturnType = new GenericType<SLODeleteResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.deleteSLO", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteSLORequest {
    private String sloId;
    private String force;

    private APIdeleteSLORequest(String sloId) {
      this.sloId = sloId;
    }

    /**
     * Set force
     * @param force Delete the monitor even if it&#39;s referenced by other resources (e.g. SLO, composite monitor). (optional)
     * @return APIdeleteSLORequest
     */
    public APIdeleteSLORequest force(String force) {
      this.force = force;
      return this;
    }

    /**
     * Execute deleteSLO request
     * @return SLODeleteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLODeleteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteSLO request with HTTP info returned
     * @return ApiResponse&lt;SLODeleteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLODeleteResponse> executeWithHttpInfo() throws ApiException {
      return deleteSLOWithHttpInfo(sloId, force);
    }
  }

  /**
   * Delete a SLO
   * Permanently delete the specified service level objective object.  If an SLO is used in a dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error because the SLO is referenced in a dashboard.
   * @param sloId The ID of the service level objective. (required)
   * @return deleteSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteSLORequest deleteSLO(String sloId) throws ApiException {
    return new APIdeleteSLORequest(sloId);
  }

private ApiResponse<SLOBulkDeleteResponse> deleteSLOTimeframeInBulkWithHttpInfo(Map<String, List<SLOTimeframe>> body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteSLOTimeframeInBulk");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOTimeframeInBulk");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOBulkDeleteResponse> localVarReturnType = new GenericType<SLOBulkDeleteResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.deleteSLOTimeframeInBulk", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteSLOTimeframeInBulkRequest {
    private Map<String, List<SLOTimeframe>> body;

    private APIdeleteSLOTimeframeInBulkRequest() {
    }

    /**
     * Set body
     * @param body Delete multiple service level objective objects request body. (required)
     * @return APIdeleteSLOTimeframeInBulkRequest
     */
    public APIdeleteSLOTimeframeInBulkRequest body(Map<String, List<SLOTimeframe>> body) {
      this.body = body;
      return this;
    }

    /**
     * Execute deleteSLOTimeframeInBulk request
     * @return SLOBulkDeleteResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOBulkDeleteResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteSLOTimeframeInBulk request with HTTP info returned
     * @return ApiResponse&lt;SLOBulkDeleteResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOBulkDeleteResponse> executeWithHttpInfo() throws ApiException {
      return deleteSLOTimeframeInBulkWithHttpInfo(body);
    }
  }

  /**
   * Bulk Delete SLO Timeframes
   * Delete (or partially delete) multiple service level objective objects.  This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
   * @return deleteSLOTimeframeInBulkRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteSLOTimeframeInBulkRequest deleteSLOTimeframeInBulk() throws ApiException {
    return new APIdeleteSLOTimeframeInBulkRequest();
  }

private ApiResponse<SLOResponse> getSLOWithHttpInfo(String sloId) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLO");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOResponse> localVarReturnType = new GenericType<SLOResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.getSLO", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetSLORequest {
    private String sloId;

    private APIgetSLORequest(String sloId) {
      this.sloId = sloId;
    }

    /**
     * Execute getSLO request
     * @return SLOResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSLO request with HTTP info returned
     * @return ApiResponse&lt;SLOResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOResponse> executeWithHttpInfo() throws ApiException {
      return getSLOWithHttpInfo(sloId);
    }
  }

  /**
   * Get a SLO&#39;s details
   * Get a service level objective object.
   * @param sloId The ID of the service level objective object. (required)
   * @return getSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetSLORequest getSLO(String sloId) throws ApiException {
    return new APIgetSLORequest(sloId);
  }

private ApiResponse<SLOHistoryResponse> getSLOHistoryWithHttpInfo(String sloId, Long fromTs, Long toTs) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSLOHistory");
    }
    
    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      throw new ApiException(400, "Missing the required parameter 'fromTs' when calling getSLOHistory");
    }
    
    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      throw new ApiException(400, "Missing the required parameter 'toTs' when calling getSLOHistory");
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOHistory");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOHistoryResponse> localVarReturnType = new GenericType<SLOHistoryResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.getSLOHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetSLOHistoryRequest {
    private String sloId;
    private Long fromTs;
    private Long toTs;

    private APIgetSLOHistoryRequest(String sloId) {
      this.sloId = sloId;
    }

    /**
     * Set fromTs
     * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
     * @return APIgetSLOHistoryRequest
     */
    public APIgetSLOHistoryRequest fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
     * @return APIgetSLOHistoryRequest
     */
    public APIgetSLOHistoryRequest toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Execute getSLOHistory request
     * @return SLOHistoryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOHistoryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSLOHistory request with HTTP info returned
     * @return ApiResponse&lt;SLOHistoryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOHistoryResponse> executeWithHttpInfo() throws ApiException {
      return getSLOHistoryWithHttpInfo(sloId, fromTs, toTs);
    }
  }

  /**
   * Get an SLO&#39;s history
   * Get a specific SLO’s history, regardless of its SLO type.  The detailed history data is structured according to the source data type. For example, metric data is included for event SLOs that use the metric source, and monitor SLO types include the monitor transition history.  **Note:** There are different response formats for event based and time based SLOs. Examples of both are shown.
   * @param sloId The ID of the service level objective object. (required)
   * @return getSLOHistoryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetSLOHistoryRequest getSLOHistory(String sloId) throws ApiException {
    String operationId = "getSLOHistory";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetSLOHistoryRequest(sloId);
  }

private ApiResponse<SLOListResponse> listSLOsWithHttpInfo(String ids, String query, String tagsQuery, String metricsQuery) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags_query", tagsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metrics_query", metricsQuery));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOs");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.listSLOs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistSLOsRequest {
    private String ids;
    private String query;
    private String tagsQuery;
    private String metricsQuery;

    private APIlistSLOsRequest() {
    }

    /**
     * Set ids
     * @param ids A comma separated list of the IDs of the service level objectives objects. (optional)
     * @return APIlistSLOsRequest
     */
    public APIlistSLOsRequest ids(String ids) {
      this.ids = ids;
      return this;
    }

    /**
     * Set query
     * @param query The query string to filter results based on SLO names. (optional)
     * @return APIlistSLOsRequest
     */
    public APIlistSLOsRequest query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set tagsQuery
     * @param tagsQuery The query string to filter results based on SLO tags. (optional)
     * @return APIlistSLOsRequest
     */
    public APIlistSLOsRequest tagsQuery(String tagsQuery) {
      this.tagsQuery = tagsQuery;
      return this;
    }

    /**
     * Set metricsQuery
     * @param metricsQuery The query string to filter results based on SLO numerator and denominator. (optional)
     * @return APIlistSLOsRequest
     */
    public APIlistSLOsRequest metricsQuery(String metricsQuery) {
      this.metricsQuery = metricsQuery;
      return this;
    }

    /**
     * Execute listSLOs request
     * @return SLOListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSLOs request with HTTP info returned
     * @return ApiResponse&lt;SLOListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOListResponse> executeWithHttpInfo() throws ApiException {
      return listSLOsWithHttpInfo(ids, query, tagsQuery, metricsQuery);
    }
  }

  /**
   * Get all SLOs
   * Get a list of service level objective objects for your organization.
   * @return listSLOsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistSLOsRequest listSLOs() throws ApiException {
    return new APIlistSLOsRequest();
  }

private ApiResponse<SLOListResponse> updateSLOWithHttpInfo(String sloId, ServiceLevelObjective body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling updateSLO");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSLO");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLO");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectivesApi.updateSLO", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateSLORequest {
    private String sloId;
    private ServiceLevelObjective body;

    private APIupdateSLORequest(String sloId) {
      this.sloId = sloId;
    }

    /**
     * Set body
     * @param body The edited service level objective request object. (required)
     * @return APIupdateSLORequest
     */
    public APIupdateSLORequest body(ServiceLevelObjective body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateSLO request
     * @return SLOListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateSLO request with HTTP info returned
     * @return ApiResponse&lt;SLOListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOListResponse> executeWithHttpInfo() throws ApiException {
      return updateSLOWithHttpInfo(sloId, body);
    }
  }

  /**
   * Update a SLO
   * Update the specified service level objective object.
   * @param sloId The ID of the service level objective object. (required)
   * @return updateSLORequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateSLORequest updateSLO(String sloId) throws ApiException {
    return new APIupdateSLORequest(sloId);
  }
}
