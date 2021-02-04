package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequest;
import com.datadog.api.v1.client.model.SLOCorrectionListResponse;
import com.datadog.api.v1.client.model.SLOCorrectionResponse;
import com.datadog.api.v1.client.model.SLOCorrectionUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectiveCorrectionsApi {
  private ApiClient apiClient;

  public ServiceLevelObjectiveCorrectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectiveCorrectionsApi(ApiClient apiClient) {
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


private ApiResponse<SLOCorrectionResponse> createSLOCorrectionWithHttpInfo(SLOCorrectionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLOCorrection");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLOCorrection");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOCorrectionResponse> localVarReturnType = new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectiveCorrectionsApi.createSLOCorrection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateSLOCorrectionRequest {
    private SLOCorrectionCreateRequest body;

    private APIcreateSLOCorrectionRequest() {
    }

    /**
     * Set body
     * @param body Create an SLO Correction (required)
     * @return APIcreateSLOCorrectionRequest
     */
    public APIcreateSLOCorrectionRequest body(SLOCorrectionCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createSLOCorrection request
     * @return SLOCorrectionResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOCorrectionResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createSLOCorrection request with HTTP info returned
     * @return ApiResponse&lt;SLOCorrectionResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOCorrectionResponse> executeWithHttpInfo() throws ApiException {
      return createSLOCorrectionWithHttpInfo(body);
    }
  }

  /**
   * Create an SLO correction
   * Create an SLO Correction
   * @return createSLOCorrectionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateSLOCorrectionRequest createSLOCorrection() throws ApiException {
    String operationId = "createSLOCorrection";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIcreateSLOCorrectionRequest();
  }

private ApiResponse<Void> deleteSLOCorrectionWithHttpInfo(String sloCorrectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOCorrection");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteSLOCorrectionRequest {
    private String sloCorrectionId;

    private APIdeleteSLOCorrectionRequest(String sloCorrectionId) {
      this.sloCorrectionId = sloCorrectionId;
    }

    /**
     * Execute deleteSLOCorrection request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteSLOCorrection request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteSLOCorrectionWithHttpInfo(sloCorrectionId);
    }
  }

  /**
   * Delete an SLO Correction
   * Permanently delete the specified SLO Correction object
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return deleteSLOCorrectionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteSLOCorrectionRequest deleteSLOCorrection(String sloCorrectionId) throws ApiException {
    String operationId = "deleteSLOCorrection";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIdeleteSLOCorrectionRequest(sloCorrectionId);
  }

private ApiResponse<SLOCorrectionResponse> getSLOCorrectionWithHttpInfo(String sloCorrectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOCorrection");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOCorrectionResponse> localVarReturnType = new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectiveCorrectionsApi.getSLOCorrection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetSLOCorrectionRequest {
    private String sloCorrectionId;

    private APIgetSLOCorrectionRequest(String sloCorrectionId) {
      this.sloCorrectionId = sloCorrectionId;
    }

    /**
     * Execute getSLOCorrection request
     * @return SLOCorrectionResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOCorrectionResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSLOCorrection request with HTTP info returned
     * @return ApiResponse&lt;SLOCorrectionResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOCorrectionResponse> executeWithHttpInfo() throws ApiException {
      return getSLOCorrectionWithHttpInfo(sloCorrectionId);
    }
  }

  /**
   * Get an SLO correction for an SLO
   * Get an SLO Correction
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return getSLOCorrectionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetSLOCorrectionRequest getSLOCorrection(String sloCorrectionId) throws ApiException {
    String operationId = "getSLOCorrection";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetSLOCorrectionRequest(sloCorrectionId);
  }

private ApiResponse<SLOCorrectionListResponse> listSLOCorrectionWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOCorrection");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOCorrectionListResponse> localVarReturnType = new GenericType<SLOCorrectionListResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectiveCorrectionsApi.listSLOCorrection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistSLOCorrectionRequest {

    private APIlistSLOCorrectionRequest() {
    }

    /**
     * Execute listSLOCorrection request
     * @return SLOCorrectionListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SLOCorrectionListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSLOCorrection request with HTTP info returned
     * @return ApiResponse&lt;SLOCorrectionListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SLOCorrectionListResponse> executeWithHttpInfo() throws ApiException {
      return listSLOCorrectionWithHttpInfo();
    }
  }

  /**
   * Get all SLO corrections
   * Get all Service Level Objective Corrections
   * @return listSLOCorrectionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistSLOCorrectionRequest listSLOCorrection() throws ApiException {
    String operationId = "listSLOCorrection";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistSLOCorrectionRequest();
  }

private ApiResponse<SLOCorrectionResponse> updateSLOCorrectionWithHttpInfo(String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSLOCorrection");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLOCorrection");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SLOCorrectionResponse> localVarReturnType = new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI("ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateSLOCorrectionRequest {
    private String sloCorrectionId;
    private SLOCorrectionUpdateRequest body;

    private APIupdateSLOCorrectionRequest(String sloCorrectionId) {
      this.sloCorrectionId = sloCorrectionId;
    }

    /**
     * Set body
     * @param body The edited SLO correction object. (required)
     * @return APIupdateSLOCorrectionRequest
     */
    public APIupdateSLOCorrectionRequest body(SLOCorrectionUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateSLOCorrection request
     * @return SLOCorrectionResponse
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
    
    public SLOCorrectionResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateSLOCorrection request with HTTP info returned
     * @return ApiResponse&lt;SLOCorrectionResponse&gt;
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
    public ApiResponse<SLOCorrectionResponse> executeWithHttpInfo() throws ApiException {
      return updateSLOCorrectionWithHttpInfo(sloCorrectionId, body);
    }
  }

  /**
   * Update an SLO Correction
   * Update the specified SLO correction object object
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return updateSLOCorrectionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateSLOCorrectionRequest updateSLOCorrection(String sloCorrectionId) throws ApiException {
    String operationId = "updateSLOCorrection";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateSLOCorrectionRequest(sloCorrectionId);
  }
}
