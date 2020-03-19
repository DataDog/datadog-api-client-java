package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import java.io.File;
import com.datadog.api.v1.client.model.IdpResponse;
import com.datadog.api.v1.client.model.Org;
import com.datadog.api.v1.client.model.OrgCreateBody;
import com.datadog.api.v1.client.model.OrgCreateResponse;
import com.datadog.api.v1.client.model.OrgListResponse;
import com.datadog.api.v1.client.model.OrgResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrgsApi {
  private ApiClient apiClient;

  public OrgsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrgsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<OrgCreateResponse> createChildOrgWithHttpInfo(OrgCreateBody body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createChildOrg");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/org";

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

    GenericType<OrgCreateResponse> localVarReturnType = new GenericType<OrgCreateResponse>() {};
    return apiClient.invokeAPI("OrgsApi.createChildOrg", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateChildOrgRequest {
    private OrgCreateBody body;

    private APIcreateChildOrgRequest() {
    }
    

    /**
     * Set body
     * @param body Org object that needs to be created (required)
     * @return APIcreateChildOrgRequest
     */
    public APIcreateChildOrgRequest body(OrgCreateBody body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createChildOrg request
     * @return OrgCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OrgCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createChildOrg request with HTTP info returned
     * @return ApiResponse&lt;OrgCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<OrgCreateResponse> executeWithHttpInfo() throws ApiException {
      return createChildOrgWithHttpInfo(body);
    }
  }

  /**
   * Create child-organization
   * You can create, edit, and manage organizations. This endpoint requires the [multi-org account](https://docs.datadoghq.com/account_management/multi_organization/) feature and must be enabled by [contacting support](https://docs.datadoghq.com/help/). Once a new child-organization is created, you can interact with it by using the **org.public_id**, **api_key.key**, and **application_key.hash** provided in the response.
   * @return createChildOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateChildOrgRequest createChildOrg() throws ApiException {
    return new APIcreateChildOrgRequest();
  }

private ApiResponse<OrgListResponse> getOrgWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/org";

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

    GenericType<OrgListResponse> localVarReturnType = new GenericType<OrgListResponse>() {};
    return apiClient.invokeAPI("OrgsApi.getOrg", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetOrgRequest {

    private APIgetOrgRequest() {
    }
    

    /**
     * Execute getOrg request
     * @return OrgListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OrgListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getOrg request with HTTP info returned
     * @return ApiResponse&lt;OrgListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<OrgListResponse> executeWithHttpInfo() throws ApiException {
      return getOrgWithHttpInfo();
    }
  }

  /**
   * Get organization
   * Get information about your organization.
   * @return getOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetOrgRequest getOrg() throws ApiException {
    return new APIgetOrgRequest();
  }

private ApiResponse<OrgResponse> updateOrgWithHttpInfo(String publicId, Org body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateOrg");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/org/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<OrgResponse> localVarReturnType = new GenericType<OrgResponse>() {};
    return apiClient.invokeAPI("OrgsApi.updateOrg", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateOrgRequest {
    private String publicId;
    private Org body;

    private APIupdateOrgRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateOrgRequest
     */
    public APIupdateOrgRequest body(Org body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateOrg request
     * @return OrgResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OrgResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateOrg request with HTTP info returned
     * @return ApiResponse&lt;OrgResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<OrgResponse> executeWithHttpInfo() throws ApiException {
      return updateOrgWithHttpInfo(publicId, body);
    }
  }

  /**
   * Update organization
   * Updates the organization.
   * @param publicId The public_id of the org you are operating with (required)
   * @return updateOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateOrgRequest updateOrg(String publicId) throws ApiException {
    return new APIupdateOrgRequest(publicId);
  }

private ApiResponse<IdpResponse> uploadIdPForOrgWithHttpInfo(String publicId, File idpFile) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling uploadIdPForOrg");
    }
    
    // verify the required parameter 'idpFile' is set
    if (idpFile == null) {
      throw new ApiException(400, "Missing the required parameter 'idpFile' when calling uploadIdPForOrg");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/org/{public_id}/idp_metadata"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (idpFile != null)
      localVarFormParams.put("idp_file", idpFile);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<IdpResponse> localVarReturnType = new GenericType<IdpResponse>() {};
    return apiClient.invokeAPI("OrgsApi.uploadIdPForOrg", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIuploadIdPForOrgRequest {
    private String publicId;
    private File idpFile;

    private APIuploadIdPForOrgRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set idpFile
     * @param idpFile The path to the XML metadata file you wish to upload. (required)
     * @return APIuploadIdPForOrgRequest
     */
    public APIuploadIdPForOrgRequest idpFile(File idpFile) {
      this.idpFile = idpFile;
      return this;
    }
    

    /**
     * Execute uploadIdPForOrg request
     * @return IdpResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       </table>
     
     */
    
    public IdpResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute uploadIdPForOrg request with HTTP info returned
     * @return ApiResponse&lt;IdpResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<IdpResponse> executeWithHttpInfo() throws ApiException {
      return uploadIdPForOrgWithHttpInfo(publicId, idpFile);
    }
  }

  /**
   * Upload IdP metadata
   * There are a couple of options for updating the Identity Provider (IdP) metadata from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form post. * **XML Body:** Post the IdP metadata file as the body of the request.
   * @param publicId The public_id of the org you are operating with (required)
   * @return uploadIdPForOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIuploadIdPForOrgRequest uploadIdPForOrg(String publicId) throws ApiException {
    return new APIuploadIdPForOrgRequest(publicId);
  }
}
