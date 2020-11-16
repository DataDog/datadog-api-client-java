package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.IncidentServiceCreateRequest;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentServiceUpdateRequest;
import com.datadog.api.v2.client.model.IncidentServicesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentServicesApi {
  private ApiClient apiClient;

  public IncidentServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IncidentServicesApi(ApiClient apiClient) {
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


private ApiResponse<IncidentServiceResponse> createIncidentServiceWithHttpInfo(IncidentServiceCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIncidentService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/services";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncidentService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentServiceResponse> localVarReturnType = new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI("IncidentServicesApi.createIncidentService", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateIncidentServiceRequest {
    private IncidentServiceCreateRequest body;

    private APIcreateIncidentServiceRequest() {
    }

    /**
     * Set body
     * @param body Incident Service Payload. (required)
     * @return APIcreateIncidentServiceRequest
     */
    public APIcreateIncidentServiceRequest body(IncidentServiceCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createIncidentService request
     * @return IncidentServiceResponse
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
    
    public IncidentServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createIncidentService request with HTTP info returned
     * @return ApiResponse&lt;IncidentServiceResponse&gt;
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
    public ApiResponse<IncidentServiceResponse> executeWithHttpInfo() throws ApiException {
      return createIncidentServiceWithHttpInfo(body);
    }
  }

  /**
   * Create a new incident service
   * Creates a new incident service.
   * @return createIncidentServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateIncidentServiceRequest createIncidentService() throws ApiException {
     String operationId = "createIncidentService";
     if (apiClient.isUnstableOperationEnabled(operationId)) {
       apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
     } else {
       throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
     }
    return new APIcreateIncidentServiceRequest();
  }

private ApiResponse<Void> deleteIncidentServiceWithHttpInfo(String serviceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteIncidentService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/services/{service_id}"
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncidentService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("IncidentServicesApi.deleteIncidentService", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteIncidentServiceRequest {
    private String serviceId;

    private APIdeleteIncidentServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Execute deleteIncidentService request
     
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
     * Execute deleteIncidentService request with HTTP info returned
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
      return deleteIncidentServiceWithHttpInfo(serviceId);
    }
  }

  /**
   * Delete an existing incident service
   * Deletes an existing incident service.
   * @param serviceId The ID of the incident service. (required)
   * @return deleteIncidentServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteIncidentServiceRequest deleteIncidentService(String serviceId) throws ApiException {
     String operationId = "deleteIncidentService";
     if (apiClient.isUnstableOperationEnabled(operationId)) {
       apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
     } else {
       throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
     }
    return new APIdeleteIncidentServiceRequest(serviceId);
  }

private ApiResponse<IncidentServiceResponse> getIncidentServiceWithHttpInfo(String serviceId, String include) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling getIncidentService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/services/{service_id}"
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentServiceResponse> localVarReturnType = new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI("IncidentServicesApi.getIncidentService", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetIncidentServiceRequest {
    private String serviceId;
    private String include;

    private APIgetIncidentServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIgetIncidentServiceRequest
     */
    public APIgetIncidentServiceRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Execute getIncidentService request
     * @return IncidentServiceResponse
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
    
    public IncidentServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIncidentService request with HTTP info returned
     * @return ApiResponse&lt;IncidentServiceResponse&gt;
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
    public ApiResponse<IncidentServiceResponse> executeWithHttpInfo() throws ApiException {
      return getIncidentServiceWithHttpInfo(serviceId, include);
    }
  }

  /**
   * Get details of an incident service
   * Get details of an incident service. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident services.
   * @param serviceId The ID of the incident service. (required)
   * @return getIncidentServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIncidentServiceRequest getIncidentService(String serviceId) throws ApiException {
     String operationId = "getIncidentService";
     if (apiClient.isUnstableOperationEnabled(operationId)) {
       apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
     } else {
       throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
     }
    return new APIgetIncidentServiceRequest(serviceId);
  }

private ApiResponse<IncidentServicesResponse> listIncidentServicesWithHttpInfo(String include, Long pageSize, Long pageOffset, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/services";

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
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidentServices");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentServicesResponse> localVarReturnType = new GenericType<IncidentServicesResponse>() {};

    return apiClient.invokeAPI("IncidentServicesApi.listIncidentServices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistIncidentServicesRequest {
    private String include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    private APIlistIncidentServicesRequest() {
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIlistIncidentServicesRequest
     */
    public APIlistIncidentServicesRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistIncidentServicesRequest
     */
    public APIlistIncidentServicesRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0l)
     * @return APIlistIncidentServicesRequest
     */
    public APIlistIncidentServicesRequest pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filter
     * @param filter A search query that filters services by name. (optional)
     * @return APIlistIncidentServicesRequest
     */
    public APIlistIncidentServicesRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Execute listIncidentServices request
     * @return IncidentServicesResponse
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
    
    public IncidentServicesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listIncidentServices request with HTTP info returned
     * @return ApiResponse&lt;IncidentServicesResponse&gt;
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
    public ApiResponse<IncidentServicesResponse> executeWithHttpInfo() throws ApiException {
      return listIncidentServicesWithHttpInfo(include, pageSize, pageOffset, filter);
    }
  }

  /**
   * Get a list of all incident services
   * Get all incident services uploaded for the requesting user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident services.
   * @return listIncidentServicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistIncidentServicesRequest listIncidentServices() throws ApiException {
     String operationId = "listIncidentServices";
     if (apiClient.isUnstableOperationEnabled(operationId)) {
       apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
     } else {
       throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
     }
    return new APIlistIncidentServicesRequest();
  }

private ApiResponse<IncidentServiceResponse> updateIncidentServiceWithHttpInfo(String serviceId, IncidentServiceUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling updateIncidentService");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIncidentService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/services/{service_id}"
      .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncidentService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IncidentServiceResponse> localVarReturnType = new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI("IncidentServicesApi.updateIncidentService", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateIncidentServiceRequest {
    private String serviceId;
    private IncidentServiceUpdateRequest body;

    private APIupdateIncidentServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Set body
     * @param body Incident Service Payload. (required)
     * @return APIupdateIncidentServiceRequest
     */
    public APIupdateIncidentServiceRequest body(IncidentServiceUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateIncidentService request
     * @return IncidentServiceResponse
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
    
    public IncidentServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateIncidentService request with HTTP info returned
     * @return ApiResponse&lt;IncidentServiceResponse&gt;
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
    public ApiResponse<IncidentServiceResponse> executeWithHttpInfo() throws ApiException {
      return updateIncidentServiceWithHttpInfo(serviceId, body);
    }
  }

  /**
   * Update an existing incident service
   * Updates an existing incident service. Only provide the attributes which should be updated as this request is a partial update.
   * @param serviceId The ID of the incident service. (required)
   * @return updateIncidentServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateIncidentServiceRequest updateIncidentService(String serviceId) throws ApiException {
     String operationId = "updateIncidentService";
     if (apiClient.isUnstableOperationEnabled(operationId)) {
       apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
     } else {
       throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
     }
    return new APIupdateIncidentServiceRequest(serviceId);
  }
}
