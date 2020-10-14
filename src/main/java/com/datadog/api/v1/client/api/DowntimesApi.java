package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.CanceledDowntimesIds;
import com.datadog.api.v1.client.model.Downtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DowntimesApi {
  private ApiClient apiClient;

  public DowntimesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DowntimesApi(ApiClient apiClient) {
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


private ApiResponse<Void> cancelDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling cancelDowntime");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "cancelDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("DowntimesApi.cancelDowntime", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIcancelDowntimeRequest {
    private Long downtimeId;

    private APIcancelDowntimeRequest(Long downtimeId) {
      this.downtimeId = downtimeId;
    }

    /**
     * Execute cancelDowntime request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute cancelDowntime request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return cancelDowntimeWithHttpInfo(downtimeId);
    }
  }

  /**
   * Cancel a downtime
   * Cancel a downtime.
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return cancelDowntimeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcancelDowntimeRequest cancelDowntime(Long downtimeId) throws ApiException {
    return new APIcancelDowntimeRequest(downtimeId);
  }

private ApiResponse<CanceledDowntimesIds> cancelDowntimesByScopeWithHttpInfo(CancelDowntimesByScopeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling cancelDowntimesByScope");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime/cancel/by_scope";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "cancelDowntimesByScope");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<CanceledDowntimesIds> localVarReturnType = new GenericType<CanceledDowntimesIds>() {};

    return apiClient.invokeAPI("DowntimesApi.cancelDowntimesByScope", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcancelDowntimesByScopeRequest {
    private CancelDowntimesByScopeRequest body;

    private APIcancelDowntimesByScopeRequest() {
    }

    /**
     * Set body
     * @param body Scope to cancel downtimes for. (required)
     * @return APIcancelDowntimesByScopeRequest
     */
    public APIcancelDowntimesByScopeRequest body(CancelDowntimesByScopeRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute cancelDowntimesByScope request
     * @return CanceledDowntimesIds
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtimes not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CanceledDowntimesIds execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute cancelDowntimesByScope request with HTTP info returned
     * @return ApiResponse&lt;CanceledDowntimesIds&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtimes not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CanceledDowntimesIds> executeWithHttpInfo() throws ApiException {
      return cancelDowntimesByScopeWithHttpInfo(body);
    }
  }

  /**
   * Cancel downtimes by scope
   * Delete all downtimes that match the scope of &#x60;X&#x60;.
   * @return cancelDowntimesByScopeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcancelDowntimesByScopeRequest cancelDowntimesByScope() throws ApiException {
    return new APIcancelDowntimesByScopeRequest();
  }

private ApiResponse<Downtime> createDowntimeWithHttpInfo(Downtime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDowntime");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.createDowntime", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateDowntimeRequest {
    private Downtime body;

    private APIcreateDowntimeRequest() {
    }

    /**
     * Set body
     * @param body Schedule a downtime request body. (required)
     * @return APIcreateDowntimeRequest
     */
    public APIcreateDowntimeRequest body(Downtime body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createDowntime request
     * @return Downtime
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Downtime execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createDowntime request with HTTP info returned
     * @return ApiResponse&lt;Downtime&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Downtime> executeWithHttpInfo() throws ApiException {
      return createDowntimeWithHttpInfo(body);
    }
  }

  /**
   * Schedule a downtime
   * Schedule a downtime.
   * @return createDowntimeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateDowntimeRequest createDowntime() throws ApiException {
    return new APIcreateDowntimeRequest();
  }

private ApiResponse<Downtime> getDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling getDowntime");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.getDowntime", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetDowntimeRequest {
    private Long downtimeId;

    private APIgetDowntimeRequest(Long downtimeId) {
      this.downtimeId = downtimeId;
    }

    /**
     * Execute getDowntime request
     * @return Downtime
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Downtime execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDowntime request with HTTP info returned
     * @return ApiResponse&lt;Downtime&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Downtime> executeWithHttpInfo() throws ApiException {
      return getDowntimeWithHttpInfo(downtimeId);
    }
  }

  /**
   * Get a downtime
   * Get downtime detail by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return getDowntimeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDowntimeRequest getDowntime(Long downtimeId) throws ApiException {
    return new APIgetDowntimeRequest(downtimeId);
  }

private ApiResponse<List<Downtime>> listDowntimesWithHttpInfo(Boolean currentOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDowntimes");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Downtime>> localVarReturnType = new GenericType<List<Downtime>>() {};

    return apiClient.invokeAPI("DowntimesApi.listDowntimes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistDowntimesRequest {
    private Boolean currentOnly;

    private APIlistDowntimesRequest() {
    }

    /**
     * Set currentOnly
     * @param currentOnly Only return downtimes that are active when the request is made. (optional)
     * @return APIlistDowntimesRequest
     */
    public APIlistDowntimesRequest currentOnly(Boolean currentOnly) {
      this.currentOnly = currentOnly;
      return this;
    }

    /**
     * Execute listDowntimes request
     * @return List&lt;Downtime&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<Downtime> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listDowntimes request with HTTP info returned
     * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<Downtime>> executeWithHttpInfo() throws ApiException {
      return listDowntimesWithHttpInfo(currentOnly);
    }
  }

  /**
   * Get all downtimes
   * Get all scheduled downtimes.
   * @return listDowntimesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistDowntimesRequest listDowntimes() throws ApiException {
    return new APIlistDowntimesRequest();
  }

private ApiResponse<Downtime> updateDowntimeWithHttpInfo(Long downtimeId, Downtime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling updateDowntime");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDowntime");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.updateDowntime", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateDowntimeRequest {
    private Long downtimeId;
    private Downtime body;

    private APIupdateDowntimeRequest(Long downtimeId) {
      this.downtimeId = downtimeId;
    }

    /**
     * Set body
     * @param body Update a downtime request body. (required)
     * @return APIupdateDowntimeRequest
     */
    public APIupdateDowntimeRequest body(Downtime body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateDowntime request
     * @return Downtime
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Downtime execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDowntime request with HTTP info returned
     * @return ApiResponse&lt;Downtime&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Downtime> executeWithHttpInfo() throws ApiException {
      return updateDowntimeWithHttpInfo(downtimeId, body);
    }
  }

  /**
   * Update a downtime
   * Update a single downtime by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to update. (required)
   * @return updateDowntimeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateDowntimeRequest updateDowntime(Long downtimeId) throws ApiException {
    return new APIupdateDowntimeRequest(downtimeId);
  }
}
