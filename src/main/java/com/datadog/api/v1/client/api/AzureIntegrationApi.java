package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.AzureAccount;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;

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

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<Object> azureUpdateHostFiltersWithHttpInfo(AzureAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling azureUpdateHostFilters");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure/host_filters";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIazureUpdateHostFiltersRequest {
    private AzureAccount body;

    private APIazureUpdateHostFiltersRequest() {
    }
    

    /**
     * Set body
     * @param body Update a Datadog-Azure integrations host filters. (required)
     * @return APIazureUpdateHostFiltersRequest
     */
    public APIazureUpdateHostFiltersRequest body(AzureAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute azureUpdateHostFilters request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute azureUpdateHostFilters request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return azureUpdateHostFiltersWithHttpInfo(body);
    }
  }

  /**
   * Update the defined list of host filters for a given Datadog-Azure integration.
   * ### Overview Update the defined list of host filters for a given Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application ID. * **&#x60;host_filters&#x60;** [*required*, *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
   * @return azureUpdateHostFiltersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIazureUpdateHostFiltersRequest azureUpdateHostFilters() throws ApiException {
    return new APIazureUpdateHostFiltersRequest();
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateAzureIntegrationRequest {
    private AzureAccount body;

    private APIcreateAzureIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Create a Datadog-Azure integration. (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return createAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Add a Azure integration to your Datadog account.
   * ### Overview Create a Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application ID. * **&#x60;client_secret&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application secret key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAzureIntegrationRequest {
    private AzureAccount body;

    private APIdeleteAzureIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Delete a given Datadog-Azure integration. (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Delete an Azure Integration from your Datadog account.
   * ### Overview Delete a given Datadog-Azure integration. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Azure web application ID.
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


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AzureAccount>> localVarReturnType = new GenericType<List<AzureAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<AzureAccount>> executeWithHttpInfo() throws ApiException {
      return listAzureIntegrationWithHttpInfo();
    }
  }

  /**
   * List configured Azure integrations.
   * ### Overview List all Datadog-Azure integrations configured in your Datadog account.
   * @return listAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistAzureIntegrationRequest listAzureIntegration() throws ApiException {
    return new APIlistAzureIntegrationRequest();
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateAzureIntegrationRequest {
    private AzureAccount body;

    private APIupdateAzureIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Update a Datadog-Azure integration. (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAzureIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Update an Azure integration to your Datadog account.
   * ### Overview Update an Datadog-Azure integration. Requires an existing tenant_name and client_id. Any other fields supplied will overwrite existing values. To overwrite tenant_name or client_id, use new_tenant_name and new_client_id. To leave a field unchanged, do not supply that field in the payload. ### Arguments * **&#x60;tenant_name&#x60;** [*required*, *default* &#x3D; **None**]: Your existing Azure Active Directory ID. * **&#x60;new_tenant_name&#x60;** [*optional*, *default* &#x3D; **None**]: Your new Azure Active Directory ID. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your existing Azure web application ID. * **&#x60;new_client_id&#x60;** [*optional*, *default* &#x3D; **None**]: Your new Azure web application ID. * **&#x60;client_secret&#x60;** [*optional*, *default* &#x3D; **None**]: Your Azure web application secret key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
   * @return updateAzureIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateAzureIntegrationRequest updateAzureIntegration() throws ApiException {
    return new APIupdateAzureIntegrationRequest();
  }
}
