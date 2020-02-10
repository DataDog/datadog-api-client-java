package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.GCPAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GcpIntegrationApi {
  private ApiClient apiClient;

  public GcpIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GcpIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<Object> createGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGCPIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

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
    return apiClient.invokeAPI("GcpIntegrationApi.createGCPIntegration", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateGCPIntegrationRequest {
    private GCPAccount body;

    private APIcreateGCPIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Create a Datadog-Azure integration. (required)
     * @return APIcreateGCPIntegrationRequest
     */
    public APIcreateGCPIntegrationRequest body(GCPAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createGCPIntegration request
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
     * Execute createGCPIntegration request with HTTP info returned
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
      return createGCPIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Add a GCP integration to your Datadog account.
   * ### Overview Create a Datadog-GCP integration. ### Arguments * **&#x60;type&#x60;** [*required*, *default* &#x3D; **None**]: The value for service_account found in your JSON service account key. * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID found in your JSON service account key. * **&#x60;private_key_id&#x60;** [*required*, *default* &#x3D; **None**]: Your private key ID found in your JSON service account key. * **&#x60;private_key&#x60;** [*required*, *default* &#x3D; **None**]: Your private key name found in your JSON service account key. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your email found in your JSON service account key. * **&#x60;client_id&#x60;** [*required*, *default* &#x3D; **None**]: Your ID found in your JSON service account key. * **&#x60;auth_uri&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://accounts.google.com/o/oauth2/auth. * **&#x60;token_uri&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://accounts.google.com/o/oauth2/token. * **&#x60;auth_provider_x509_cert_url&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://www.googleapis.com/oauth2/v1/certs. * **&#x60;client_x509_cert_url&#x60;** [*required*, *default* &#x3D; **None**]: Should be https://www.googleapis.com/robot/v1/metadata/x509/&lt;CLIENT_EMAIL&gt; where &lt;CLIENT_EMAIL&gt; is the email found in your JSON service account key. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence monitors for expected GCE instance shutdowns.
   * @return createGCPIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateGCPIntegrationRequest createGCPIntegration() throws ApiException {
    return new APIcreateGCPIntegrationRequest();
  }

private ApiResponse<Object> deleteGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteGCPIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

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
    return apiClient.invokeAPI("GcpIntegrationApi.deleteGCPIntegration", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteGCPIntegrationRequest {
    private GCPAccount body;

    private APIdeleteGCPIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Delete a given Datadog-GCP integration. (required)
     * @return APIdeleteGCPIntegrationRequest
     */
    public APIdeleteGCPIntegrationRequest body(GCPAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute deleteGCPIntegration request
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
     * Execute deleteGCPIntegration request with HTTP info returned
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
      return deleteGCPIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Delete a GCP Integration from your Datadog account.
   * ### Overview Delete a given Datadog-GCP integration. ### Arguments * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID to be deleted. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your client email associated with the integration to be deleted.
   * @return deleteGCPIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteGCPIntegrationRequest deleteGCPIntegration() throws ApiException {
    return new APIdeleteGCPIntegrationRequest();
  }

private ApiResponse<List<GCPAccount>> listGCPIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

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

    GenericType<List<GCPAccount>> localVarReturnType = new GenericType<List<GCPAccount>>() {};
    return apiClient.invokeAPI("GcpIntegrationApi.listGCPIntegration", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistGCPIntegrationRequest {

    private APIlistGCPIntegrationRequest() {
    }
    

    /**
     * Execute listGCPIntegration request
     * @return List&lt;GCPAccount&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<GCPAccount> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listGCPIntegration request with HTTP info returned
     * @return ApiResponse&lt;List&lt;GCPAccount&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<GCPAccount>> executeWithHttpInfo() throws ApiException {
      return listGCPIntegrationWithHttpInfo();
    }
  }

  /**
   * List configured GCP integrations.
   * ### Overview List all Datadog-GCP integrations configured in your Datadog account.
   * @return listGCPIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistGCPIntegrationRequest listGCPIntegration() throws ApiException {
    return new APIlistGCPIntegrationRequest();
  }

private ApiResponse<Object> updateGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateGCPIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

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
    return apiClient.invokeAPI("GcpIntegrationApi.updateGCPIntegration", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateGCPIntegrationRequest {
    private GCPAccount body;

    private APIupdateGCPIntegrationRequest() {
    }
    

    /**
     * Set body
     * @param body Update a Datadog-GCP integration. (required)
     * @return APIupdateGCPIntegrationRequest
     */
    public APIupdateGCPIntegrationRequest body(GCPAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateGCPIntegration request
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
     * Execute updateGCPIntegration request with HTTP info returned
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
      return updateGCPIntegrationWithHttpInfo(body);
    }
  }

  /**
   * Update a GCP integration in your Datadog account.
   * ### Overview Update a Datadog-GCP integrations host_filters and/or automute. Requires a project_id and client_email, however these fields cannot be updated. If you need to update these fields please delete and use the create (POST) endpoint. The unspecified fields will keep their original values. ### Arguments * **&#x60;project_id&#x60;** [*required*, *default* &#x3D; **None**]: Your Google Cloud project ID associated with the integration to be updated. * **&#x60;client_email&#x60;** [*required*, *default* &#x3D; **None**]: Your client email associated with the integration to be updated. * **&#x60;host_filters&#x60;** [*optional*, *default* &#x3D; **None**]: Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog. * **&#x60;automute&#x60;** [*optional*, *default* &#x3D; false]: Silence monitors for expected GCE instance shutdowns.
   * @return updateGCPIntegrationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateGCPIntegrationRequest updateGCPIntegration() throws ApiException {
    return new APIupdateGCPIntegrationRequest();
  }
}
