package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsIndex;
import com.datadog.api.v1.client.model.LogsIndexListResponse;
import com.datadog.api.v1.client.model.LogsIndexesOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogsIndexesApi {
  private ApiClient apiClient;

  public LogsIndexesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsIndexesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<LogsIndexListResponse> getAllLogIndexesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

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

    GenericType<LogsIndexListResponse> localVarReturnType = new GenericType<LogsIndexListResponse>() {};
    return apiClient.invokeAPI("LogsIndexesApi.getAllLogIndexes", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllLogIndexesRequest {

    private APIgetAllLogIndexesRequest() {
    }
    

    /**
     * Execute getAllLogIndexes request
     * @return LogsIndexListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllLogIndexes request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexListResponse> executeWithHttpInfo() throws ApiException {
      return getAllLogIndexesWithHttpInfo();
    }
  }

  /**
   * Get all Indexes
   * This endpoint returns an array of the &#x60;LogIndex&#x60; objects of your organization.
   * @return getAllLogIndexesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllLogIndexesRequest getAllLogIndexes() throws ApiException {
    return new APIgetAllLogIndexesRequest();
  }

private ApiResponse<LogsIndex> getLogsIndexWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getLogsIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};
    return apiClient.invokeAPI("LogsIndexesApi.getLogsIndex", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsIndexRequest {
    private String name;

    private APIgetLogsIndexRequest(String name) {
      this.name = name;
    }
    

    /**
     * Execute getLogsIndex request
     * @return LogsIndex
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndex execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsIndex request with HTTP info returned
     * @return ApiResponse&lt;LogsIndex&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndex> executeWithHttpInfo() throws ApiException {
      return getLogsIndexWithHttpInfo(name);
    }
  }

  /**
   * Get an index
   * ## Overview Get one log index from your organization. ### Arguments This endpoint takes no JSON arguments.
   * @param name Name of the log index (required)
   * @return getLogsIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetLogsIndexRequest getLogsIndex(String name) throws ApiException {
    return new APIgetLogsIndexRequest(name);
  }

private ApiResponse<LogsIndexesOrder> getLogsIndexOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

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

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};
    return apiClient.invokeAPI("LogsIndexesApi.getLogsIndexOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetLogsIndexOrderRequest {

    private APIgetLogsIndexOrderRequest() {
    }
    

    /**
     * Execute getLogsIndexOrder request
     * @return LogsIndexesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsIndexOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexesOrder> executeWithHttpInfo() throws ApiException {
      return getLogsIndexOrderWithHttpInfo();
    }
  }

  /**
   * Get Indexes Order
   * ## Overview Get the current order of your log indexes. ### Arguments This endpoint takes no JSON arguments.
   * @return getLogsIndexOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetLogsIndexOrderRequest getLogsIndexOrder() throws ApiException {
    return new APIgetLogsIndexOrderRequest();
  }

private ApiResponse<LogsIndex> updateLogsIndexWithHttpInfo(String name, LogsIndex body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateLogsIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};
    return apiClient.invokeAPI("LogsIndexesApi.updateLogsIndex", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsIndexRequest {
    private String name;
    private LogsIndex body;

    private APIupdateLogsIndexRequest(String name) {
      this.name = name;
    }
    

    /**
     * Set body
     * @param body Object containing the new LogsIndex (optional)
     * @return APIupdateLogsIndexRequest
     */
    public APIupdateLogsIndexRequest body(LogsIndex body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateLogsIndex request
     * @return LogsIndex
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndex execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsIndex request with HTTP info returned
     * @return ApiResponse&lt;LogsIndex&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndex> executeWithHttpInfo() throws ApiException {
      return updateLogsIndexWithHttpInfo(name, body);
    }
  }

  /**
   * Update an Index
   * ## Overview It returns the Index object passed in the request body when the request is successful. **Note:** Using the PUT method updates your index’s configuration by **replacing** your current configuration with the new one sent to your Datadog organization. ### Arguments * **&#x60;filter.query&#x60;**  [*required*]:     Only logs matching the filter criteria will be considered for this index. The search query follows the [Log search syntax][1]  * **&#x60;exclusion_filters&#x60;** An array of &#x60;ExclusionFilter&#x60; objects (see hereafter). The logs are tested against the query of each &#x60;ExclusionFilter&#x60;, following the order of the array. Only the first matching active &#x60;ExclusionFilter&#x60; matters, others (if any) are ignored. The &#x60;ExclusionFilter&#x60; object describes the configuration of an [exclusion filter][2]. It has the following attributes:    * **&#x60;name&#x60;** [*required*]:     The name of the exclusion filter    * **&#x60;is_enabled&#x60;**  [*optional*, *default*&#x3D;**False**]:     A boolean stating if the exclusion is active.    * **&#x60;filter.query&#x60;** [*optional*]:     Only logs matching the filter criteria AND the query of the parent index will be considered for this exclusion filter. The search query follows the [Log search syntax][1]    * **&#x60;filter.sample_rate&#x60;** [*required*]:     The fraction of logs excluded by the exclusion filter, when active. The sampling is uniform.  [1]: /logs/explorer/search [2]: /logs/indexes/#exclusion-filters
   * @param name Name of the log index (required)
   * @return updateLogsIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateLogsIndexRequest updateLogsIndex(String name) throws ApiException {
    return new APIupdateLogsIndexRequest(name);
  }

private ApiResponse<LogsIndexesOrder> updateLogsIndexOrderWithHttpInfo(LogsIndexesOrder body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

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

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};
    return apiClient.invokeAPI("LogsIndexesApi.updateLogsIndexOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateLogsIndexOrderRequest {
    private LogsIndexesOrder body;

    private APIupdateLogsIndexOrderRequest() {
    }
    

    /**
     * Set body
     * @param body Object containing the new ordered list of index names (optional)
     * @return APIupdateLogsIndexOrderRequest
     */
    public APIupdateLogsIndexOrderRequest body(LogsIndexesOrder body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateLogsIndexOrder request
     * @return LogsIndexesOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsIndexesOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsIndexOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsIndexesOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<LogsIndexesOrder> executeWithHttpInfo() throws ApiException {
      return updateLogsIndexOrderWithHttpInfo(body);
    }
  }

  /**
   * Update Indexes Order
   * ## Overview This endpoint updates the index order of your organization. It returns the index order object passed in the request body when the request is successful. ### Arguments - **&#x60;index_names&#x60;** [*required*]: Array of strings identifying by their name(s) the index(es) of your organisation. Logs are tested against the query filter of each index one by one, following the order of the array. Logs are eventually stored in the first matching index.
   * @return updateLogsIndexOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateLogsIndexOrderRequest updateLogsIndexOrder() throws ApiException {
    return new APIupdateLogsIndexOrderRequest();
  }
}
