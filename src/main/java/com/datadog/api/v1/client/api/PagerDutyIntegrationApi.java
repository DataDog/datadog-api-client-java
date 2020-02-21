package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.PagerDutyIntegration;
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
   * ### Overview Create a new Datadog-PagerDuty integration. **Note:** All arguments are required when creating (PUT) a new PagerDuty configuration.
   * @return createPagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreatePagerDutyIntegrationRequest createPagerDutyIntegration() throws ApiException {
    return new APIcreatePagerDutyIntegrationRequest();
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
   * ### Overview Delete the Datadog-PagerDuty integration.
   * @return deletePagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeletePagerDutyIntegrationRequest deletePagerDutyIntegration() throws ApiException {
    return new APIdeletePagerDutyIntegrationRequest();
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
   * ### Overview Get all information about your Datadog-PagerDuty integration.
   * @return getPagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetPagerDutyIntegrationRequest getPagerDutyIntegration() throws ApiException {
    return new APIgetPagerDutyIntegrationRequest();
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
   * ### Overview Add new services and schedules to your Datadog-PagerDuty integration.
   * @return updatePagerDutyIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdatePagerDutyIntegrationRequest updatePagerDutyIntegration() throws ApiException {
    return new APIupdatePagerDutyIntegrationRequest();
  }
}
