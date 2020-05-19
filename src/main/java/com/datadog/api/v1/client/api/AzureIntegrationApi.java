package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.AzureAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AzureIntegrationApi {
  private ApiClient apiClient;

  public AzureIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AzureIntegrationApi(ApiClient apiClient) {
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


private ApiResponse<Object> createAzureIntegrationWithHttpInfo(AzureAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAzureIntegration");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AzureIntegrationApi.createAzureIntegration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIcreateAzureIntegrationRequest {
    private AzureAccount body;

    private APIcreateAzureIntegrationRequest() {
    }

    /**
     * Set body
     * @param body Create a Datadog-Azure integration for your Datadog account request body. (required)
     * @return APIcreateAzureIntegrationRequest
     */
    public APIcreateAzureIntegrationRequest body(AzureAccount body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createAzureIntegration request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAzureIntegration request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return createAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Create an Azure integration
   * Create a Datadog-Azure integration.  Using the &#x60;POST&#x60; method updates your integration configuration by adding your new configuration to the existing one in your Datadog organization.  Using the &#x60;PUT&#x60; method updates your integration configuration by replacing your current configuration with the new one sent to your Datadog organization.
   * @return createAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAzureIntegrationRequest createAzureIntegration() throws ApiException {
    return new APIcreateAzureIntegrationRequest();
  }

private ApiResponse<Object> deleteAzureIntegrationWithHttpInfo(AzureAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAzureIntegration");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AzureIntegrationApi.deleteAzureIntegration", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIdeleteAzureIntegrationRequest {
    private AzureAccount body;

    private APIdeleteAzureIntegrationRequest() {
    }

    /**
     * Set body
     * @param body Delete a given Datadog-Azure integration request body. (required)
     * @return APIdeleteAzureIntegrationRequest
     */
    public APIdeleteAzureIntegrationRequest body(AzureAccount body) {
      this.body = body;
      return this;
    }

    /**
     * Execute deleteAzureIntegration request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAzureIntegration request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Delete an Azure integration
   * Delete a given Datadog-Azure integration from your Datadog account.
   * @return deleteAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAzureIntegrationRequest deleteAzureIntegration() throws ApiException {
    return new APIdeleteAzureIntegrationRequest();
  }

private ApiResponse<List<AzureAccount>> listAzureIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAzureIntegration");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AzureAccount>> localVarReturnType = new GenericType<List<AzureAccount>>() {};

    return apiClient.invokeAPI("AzureIntegrationApi.listAzureIntegration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIlistAzureIntegrationRequest {

    private APIlistAzureIntegrationRequest() {
    }

    /**
     * Execute listAzureIntegration request
     * @return List&lt;AzureAccount&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<AzureAccount> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAzureIntegration request with HTTP info returned
     * @return ApiResponse&lt;List&lt;AzureAccount&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<AzureAccount>> executeWithHttpInfo() throws ApiException {
      return listAzureIntegrationWithHttpInfo();
    }
  }

  /**
   * List all Azure integrations
   * List all Datadog-Azure integrations configured in your Datadog account.
   * @return listAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAzureIntegrationRequest listAzureIntegration() throws ApiException {
    return new APIlistAzureIntegrationRequest();
  }

private ApiResponse<Object> updateAzureHostFiltersWithHttpInfo(AzureAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAzureHostFilters");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure/host_filters";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAzureHostFilters");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AzureIntegrationApi.updateAzureHostFilters", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIupdateAzureHostFiltersRequest {
    private AzureAccount body;

    private APIupdateAzureHostFiltersRequest() {
    }

    /**
     * Set body
     * @param body Update a Datadog-Azure integration&#39;s host filters request body. (required)
     * @return APIupdateAzureHostFiltersRequest
     */
    public APIupdateAzureHostFiltersRequest body(AzureAccount body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateAzureHostFilters request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAzureHostFilters request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAzureHostFiltersWithHttpInfo(body);
    }
  }

  /**
   * Update Azure integration host filters
   * Update the defined list of host filters for a given Datadog-Azure integration.
   * @return updateAzureHostFiltersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAzureHostFiltersRequest updateAzureHostFilters() throws ApiException {
    return new APIupdateAzureHostFiltersRequest();
  }

private ApiResponse<Object> updateAzureIntegrationWithHttpInfo(AzureAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAzureIntegration");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AzureIntegrationApi.updateAzureIntegration", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIupdateAzureIntegrationRequest {
    private AzureAccount body;

    private APIupdateAzureIntegrationRequest() {
    }

    /**
     * Set body
     * @param body Update a Datadog-Azure integration request body. (required)
     * @return APIupdateAzureIntegrationRequest
     */
    public APIupdateAzureIntegrationRequest body(AzureAccount body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateAzureIntegration request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAzureIntegration request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Update an Azure integration
   * Update a Datadog-Azure integration. Requires an existing &#x60;tenant_name&#x60; and &#x60;client_id&#x60;. Any other fields supplied will overwrite existing values. To overwrite &#x60;tenant_name&#x60; or &#x60;client_id&#x60;, use &#x60;new_tenant_name&#x60; and &#x60;new_client_id&#x60;. To leave a field unchanged, do not supply that field in the payload.
   * @return updateAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAzureIntegrationRequest updateAzureIntegration() throws ApiException {
    return new APIupdateAzureIntegrationRequest();
  }
}
