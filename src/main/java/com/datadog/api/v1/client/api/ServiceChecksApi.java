package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.ServiceCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServiceChecksApi {
  private ApiClient apiClient;

  public ServiceChecksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceChecksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<IntakePayloadAccepted> submitServiceCheckWithHttpInfo(List<ServiceCheck> body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitServiceCheck");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/check_run";

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

    String[] localVarAuthNames = new String[] { "apiKeyAuthQuery" };

    GenericType<IntakePayloadAccepted> localVarReturnType = new GenericType<IntakePayloadAccepted>() {};
    return apiClient.invokeAPI("ServiceChecksApi.submitServiceCheck", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIsubmitServiceCheckRequest {
    private List<ServiceCheck> body;

    private APIsubmitServiceCheckRequest() {
    }
    

    /**
     * Set body
     * @param body Service Check body (required)
     * @return APIsubmitServiceCheckRequest
     */
    public APIsubmitServiceCheckRequest body(List<ServiceCheck> body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute submitServiceCheck request
     * @return IntakePayloadAccepted
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
         <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IntakePayloadAccepted execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute submitServiceCheck request with HTTP info returned
     * @return ApiResponse&lt;IntakePayloadAccepted&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
         <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<IntakePayloadAccepted> executeWithHttpInfo() throws ApiException {
      return submitServiceCheckWithHttpInfo(body);
    }
  }

  /**
   * Submit a Service Check
   * ### Overview Submit a list of Service Checks. **Note**: valid API key is required.
   * @return submitServiceCheckRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIsubmitServiceCheckRequest submitServiceCheck() throws ApiException {
    return new APIsubmitServiceCheckRequest();
  }
}
