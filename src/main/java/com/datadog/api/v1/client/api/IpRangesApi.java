package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.IPRanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IpRangesApi {
  private ApiClient apiClient;

  public IpRangesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpRangesApi(ApiClient apiClient) {
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


private ApiResponse<IPRanges> getIPRangesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIPRanges");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<IPRanges> localVarReturnType = new GenericType<IPRanges>() {};

    return apiClient.invokeAPI("IpRangesApi.getIPRanges", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIgetIPRangesRequest {

    private APIgetIPRangesRequest() {
    }

    /**
     * Execute getIPRanges request
     * @return IPRanges
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> List of IP ranges. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IPRanges execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIPRanges request with HTTP info returned
     * @return ApiResponse&lt;IPRanges&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> List of IP ranges. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<IPRanges> executeWithHttpInfo() throws ApiException {
      return getIPRangesWithHttpInfo();
    }
  }

  /**
   * List IP Ranges
   * Get information about Datadog IP ranges.
   * @return getIPRangesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIPRangesRequest getIPRanges() throws ApiException {
    return new APIgetIPRangesRequest();
  }
}
