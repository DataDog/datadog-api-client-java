package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.ServiceCreateRequest;
import com.datadog.api.v2.client.model.ServiceResponse;
import com.datadog.api.v2.client.model.ServiceUpdateRequest;
import com.datadog.api.v2.client.model.ServicesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesApi {
  private ApiClient apiClient;

  public ServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServicesApi(ApiClient apiClient) {
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


private ApiResponse<ServiceResponse> createServiceWithHttpInfo(ServiceCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/services";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceResponse> localVarReturnType = new GenericType<ServiceResponse>() {};

    return apiClient.invokeAPI("ServicesApi.createService", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateServiceRequest {
    private ServiceCreateRequest body;

    private APIcreateServiceRequest() {
    }

    /**
     * Set body
     * @param body Service Payload. (required)
     * @return APIcreateServiceRequest
     */
    public APIcreateServiceRequest body(ServiceCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createService request
     * @return ServiceResponse
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
    
    public ServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createService request with HTTP info returned
     * @return ApiResponse&lt;ServiceResponse&gt;
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
    public ApiResponse<ServiceResponse> executeWithHttpInfo() throws ApiException {
      return createServiceWithHttpInfo(body);
    }
  }

  /**
   * Create a new service
   * Creates a new service.
   * @return createServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateServiceRequest createService() throws ApiException {
    String operationId = "createService";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIcreateServiceRequest();
  }

private ApiResponse<Void> deleteServiceWithHttpInfo(String serviceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling deleteService");
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
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("ServicesApi.deleteService", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteServiceRequest {
    private String serviceId;

    private APIdeleteServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Execute deleteService request
     
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
     * Execute deleteService request with HTTP info returned
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
      return deleteServiceWithHttpInfo(serviceId);
    }
  }

  /**
   * Delete an existing service
   * Deletes an existing service.
   * @param serviceId The ID of the service. (required)
   * @return deleteServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteServiceRequest deleteService(String serviceId) throws ApiException {
    String operationId = "deleteService";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIdeleteServiceRequest(serviceId);
  }

private ApiResponse<ServiceResponse> getServiceWithHttpInfo(String serviceId, String include) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling getService");
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
    localVarHeaderParams.put("DD-OPERATION-ID", "getService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceResponse> localVarReturnType = new GenericType<ServiceResponse>() {};

    return apiClient.invokeAPI("ServicesApi.getService", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetServiceRequest {
    private String serviceId;
    private String include;

    private APIgetServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIgetServiceRequest
     */
    public APIgetServiceRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Execute getService request
     * @return ServiceResponse
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
    
    public ServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getService request with HTTP info returned
     * @return ApiResponse&lt;ServiceResponse&gt;
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
    public ApiResponse<ServiceResponse> executeWithHttpInfo() throws ApiException {
      return getServiceWithHttpInfo(serviceId, include);
    }
  }

  /**
   * Get details of a service
   * Get details of a service. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these services
   * @param serviceId The ID of the service. (required)
   * @return getServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetServiceRequest getService(String serviceId) throws ApiException {
    String operationId = "getService";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetServiceRequest(serviceId);
  }

private ApiResponse<ServicesResponse> getServicesWithHttpInfo(String include, Long pageSize, Long pageOffset) throws ApiException {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getServices");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServicesResponse> localVarReturnType = new GenericType<ServicesResponse>() {};

    return apiClient.invokeAPI("ServicesApi.getServices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetServicesRequest {
    private String include;
    private Long pageSize;
    private Long pageOffset;

    private APIgetServicesRequest() {
    }

    /**
     * Set include
     * @param include Specifies which types of related objects should be included in the response. (optional)
     * @return APIgetServicesRequest
     */
    public APIgetServicesRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIgetServicesRequest
     */
    public APIgetServicesRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0l)
     * @return APIgetServicesRequest
     */
    public APIgetServicesRequest pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Execute getServices request
     * @return ServicesResponse
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
    
    public ServicesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getServices request with HTTP info returned
     * @return ApiResponse&lt;ServicesResponse&gt;
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
    public ApiResponse<ServicesResponse> executeWithHttpInfo() throws ApiException {
      return getServicesWithHttpInfo(include, pageSize, pageOffset);
    }
  }

  /**
   * Get a list of all services
   * Get all services for the requesting user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these services.
   * @return getServicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetServicesRequest getServices() throws ApiException {
    String operationId = "getServices";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetServicesRequest();
  }

private ApiResponse<ServiceResponse> updateServiceWithHttpInfo(String serviceId, ServiceUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceId' when calling updateService");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateService");
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
    localVarHeaderParams.put("DD-OPERATION-ID", "updateService");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceResponse> localVarReturnType = new GenericType<ServiceResponse>() {};

    return apiClient.invokeAPI("ServicesApi.updateService", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateServiceRequest {
    private String serviceId;
    private ServiceUpdateRequest body;

    private APIupdateServiceRequest(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Set body
     * @param body Service Payload. (required)
     * @return APIupdateServiceRequest
     */
    public APIupdateServiceRequest body(ServiceUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateService request
     * @return ServiceResponse
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
    
    public ServiceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateService request with HTTP info returned
     * @return ApiResponse&lt;ServiceResponse&gt;
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
    public ApiResponse<ServiceResponse> executeWithHttpInfo() throws ApiException {
      return updateServiceWithHttpInfo(serviceId, body);
    }
  }

  /**
   * Update an existing service
   * Updates an existing service. Only provide the attributes which should be updated as this request is a partial update.
   * @param serviceId The ID of the service. (required)
   * @return updateServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateServiceRequest updateService(String serviceId) throws ApiException {
    String operationId = "updateService";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIupdateServiceRequest(serviceId);
  }
}
