package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.PagerDutyIntegration;
import com.datadog.api.v1.client.model.PagerDutyService;
import com.datadog.api.v1.client.model.PagerDutyServiceKey;
import com.datadog.api.v1.client.model.PagerDutyServiceName;
import com.datadog.api.v1.client.model.PagerDutyServicesAndSchedules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PagerDutyIntegrationApi {
  private ApiClient apiClient;

  public PagerDutyIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PagerDutyIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<Void> createPagerDutyIntegrationWithHttpInfo(PagerDutyIntegration body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPagerDutyIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty";

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

    
    return apiClient.invokeAPI("PagerDutyIntegrationApi.createPagerDutyIntegration", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIcreatePagerDutyIntegrationRequest {
    private PagerDutyIntegration body;

    private APIcreatePagerDutyIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Create Datadog-PagerDuty integration. (required)
     * @return APIcreatePagerDutyIntegrationRequest
     */
    public APIcreatePagerDutyIntegrationRequest body(PagerDutyIntegration body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createPagerDutyIntegration request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createPagerDutyIntegration request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return createPagerDutyIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Create a PagerDuty integration
   * Create a new Datadog-PagerDuty integration.  **Note:** All arguments are required when creating (&#x60;PUT&#x60;) a new PagerDuty configuration.
   * @return createPagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreatePagerDutyIntegrationRequest createPagerDutyIntegration() throws ApiException {
    return new APIcreatePagerDutyIntegrationRequest();
  }

private ApiResponse<PagerDutyServiceName> createPagerDutyIntegrationServiceWithHttpInfo(PagerDutyService body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPagerDutyIntegrationService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services";

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

    GenericType<PagerDutyServiceName> localVarReturnType = new GenericType<PagerDutyServiceName>() {};
    return apiClient.invokeAPI("PagerDutyIntegrationApi.createPagerDutyIntegrationService", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreatePagerDutyIntegrationServiceRequest {
    private PagerDutyService body;

    private APIcreatePagerDutyIntegrationServiceRequest() {
    }
    

    /**
     * Set body
     * @param body Create a new service object in the Datadog-PagerDuty integration. (required)
     * @return APIcreatePagerDutyIntegrationServiceRequest
     */
    public APIcreatePagerDutyIntegrationServiceRequest body(PagerDutyService body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createPagerDutyIntegrationService request
     * @return PagerDutyServiceName
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PagerDutyServiceName execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createPagerDutyIntegrationService request with HTTP info returned
     * @return ApiResponse&lt;PagerDutyServiceName&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<PagerDutyServiceName> executeWithHttpInfo() throws ApiException {
      return createPagerDutyIntegrationServiceWithHttpInfo(body);
    }
  }

  /**
   * Create a new service object
   * Create a new service object in the PagerDuty integration.
   * @return createPagerDutyIntegrationServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreatePagerDutyIntegrationServiceRequest createPagerDutyIntegrationService() throws ApiException {
    return new APIcreatePagerDutyIntegrationServiceRequest();
  }

private ApiResponse<Void> deletePagerDutyIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty";

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

    
    return apiClient.invokeAPI("PagerDutyIntegrationApi.deletePagerDutyIntegration", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIdeletePagerDutyIntegrationRequest {

    private APIdeletePagerDutyIntegrationRequest() {
    }
    

    /**
     * Execute deletePagerDutyIntegration request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deletePagerDutyIntegration request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deletePagerDutyIntegrationWithHttpInfo();
    }
  }

  /**
   * Delete a PagerDuty integration
   * Delete the Datadog-PagerDuty integration.
   * @return deletePagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeletePagerDutyIntegrationRequest deletePagerDutyIntegration() throws ApiException {
    return new APIdeletePagerDutyIntegrationRequest();
  }

private ApiResponse<Void> deletePagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling deletePagerDutyIntegrationService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

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

    
    return apiClient.invokeAPI("PagerDutyIntegrationApi.deletePagerDutyIntegrationService", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIdeletePagerDutyIntegrationServiceRequest {
    private String serviceName;

    private APIdeletePagerDutyIntegrationServiceRequest(String serviceName) {
      this.serviceName = serviceName;
    }
    

    /**
     * Execute deletePagerDutyIntegrationService request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deletePagerDutyIntegrationService request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deletePagerDutyIntegrationServiceWithHttpInfo(serviceName);
    }
  }

  /**
   * Delete a single service object
   * Delete a single service object in the Datadog-PagerDuty integration.
   * @param serviceName The service name (required)
   * @return deletePagerDutyIntegrationServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeletePagerDutyIntegrationServiceRequest deletePagerDutyIntegrationService(String serviceName) throws ApiException {
    return new APIdeletePagerDutyIntegrationServiceRequest(serviceName);
  }

private ApiResponse<PagerDutyIntegration> getPagerDutyIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty";

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

    GenericType<PagerDutyIntegration> localVarReturnType = new GenericType<PagerDutyIntegration>() {};
    return apiClient.invokeAPI("PagerDutyIntegrationApi.getPagerDutyIntegration", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetPagerDutyIntegrationRequest {

    private APIgetPagerDutyIntegrationRequest() {
    }
    

    /**
     * Execute getPagerDutyIntegration request
     * @return PagerDutyIntegration
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PagerDutyIntegration execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getPagerDutyIntegration request with HTTP info returned
     * @return ApiResponse&lt;PagerDutyIntegration&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<PagerDutyIntegration> executeWithHttpInfo() throws ApiException {
      return getPagerDutyIntegrationWithHttpInfo();
    }
  }

  /**
   * Get a PagerDuty integration
   * Get all information about your Datadog-PagerDuty integration.
   * @return getPagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetPagerDutyIntegrationRequest getPagerDutyIntegration() throws ApiException {
    return new APIgetPagerDutyIntegrationRequest();
  }

private ApiResponse<PagerDutyServiceName> getPagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling getPagerDutyIntegrationService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

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

    GenericType<PagerDutyServiceName> localVarReturnType = new GenericType<PagerDutyServiceName>() {};
    return apiClient.invokeAPI("PagerDutyIntegrationApi.getPagerDutyIntegrationService", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetPagerDutyIntegrationServiceRequest {
    private String serviceName;

    private APIgetPagerDutyIntegrationServiceRequest(String serviceName) {
      this.serviceName = serviceName;
    }
    

    /**
     * Execute getPagerDutyIntegrationService request
     * @return PagerDutyServiceName
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PagerDutyServiceName execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getPagerDutyIntegrationService request with HTTP info returned
     * @return ApiResponse&lt;PagerDutyServiceName&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<PagerDutyServiceName> executeWithHttpInfo() throws ApiException {
      return getPagerDutyIntegrationServiceWithHttpInfo(serviceName);
    }
  }

  /**
   * Get a single service object
   * Get service name in the Datadog-PagerDuty integration.
   * @param serviceName The service name (required)
   * @return getPagerDutyIntegrationServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetPagerDutyIntegrationServiceRequest getPagerDutyIntegrationService(String serviceName) throws ApiException {
    return new APIgetPagerDutyIntegrationServiceRequest(serviceName);
  }

private ApiResponse<Void> updatePagerDutyIntegrationWithHttpInfo(PagerDutyServicesAndSchedules body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePagerDutyIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty";

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

    
    return apiClient.invokeAPI("PagerDutyIntegrationApi.updatePagerDutyIntegration", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIupdatePagerDutyIntegrationRequest {
    private PagerDutyServicesAndSchedules body;

    private APIupdatePagerDutyIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Update an existing Datadog-PagerDuty integration. (required)
     * @return APIupdatePagerDutyIntegrationRequest
     */
    public APIupdatePagerDutyIntegrationRequest body(PagerDutyServicesAndSchedules body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updatePagerDutyIntegration request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePagerDutyIntegration request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return updatePagerDutyIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Add new services and schedules
   * Add new services and schedules to your Datadog-PagerDuty integration.
   * @return updatePagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdatePagerDutyIntegrationRequest updatePagerDutyIntegration() throws ApiException {
    return new APIupdatePagerDutyIntegrationRequest();
  }

private ApiResponse<Void> updatePagerDutyIntegrationServiceWithHttpInfo(String serviceName, PagerDutyServiceKey body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling updatePagerDutyIntegrationService");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePagerDutyIntegrationService");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

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

    
    return apiClient.invokeAPI("PagerDutyIntegrationApi.updatePagerDutyIntegrationService", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIupdatePagerDutyIntegrationServiceRequest {
    private String serviceName;
    private PagerDutyServiceKey body;

    private APIupdatePagerDutyIntegrationServiceRequest(String serviceName) {
      this.serviceName = serviceName;
    }
    

    /**
     * Set body
     * @param body Update an existing service object in the Datadog-PagerDuty integration. (required)
     * @return APIupdatePagerDutyIntegrationServiceRequest
     */
    public APIupdatePagerDutyIntegrationServiceRequest body(PagerDutyServiceKey body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updatePagerDutyIntegrationService request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePagerDutyIntegrationService request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 204 </td><td> Integration does not exist </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return updatePagerDutyIntegrationServiceWithHttpInfo(serviceName, body);
    }
  }

  /**
   * Update a single service object
   * Update a single service object in the Datadog-PagerDuty integration
   * @param serviceName The service name (required)
   * @return updatePagerDutyIntegrationServiceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdatePagerDutyIntegrationServiceRequest updatePagerDutyIntegrationService(String serviceName) throws ApiException {
    return new APIupdatePagerDutyIntegrationServiceRequest(serviceName);
  }
}
