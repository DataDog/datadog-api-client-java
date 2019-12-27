package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error415;
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

private ApiResponse<OrgCreateResponse> createChildOrgWithHttpInfo(OrgCreateBody orgCreateBody) throws ApiException {
    Object localVarPostBody = orgCreateBody;
    
    // verify the required parameter 'orgCreateBody' is set
    if (orgCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'orgCreateBody' when calling createChildOrg");
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateChildOrgRequest {
    private OrgCreateBody orgCreateBody;

    private APIcreateChildOrgRequest(OrgCreateBody orgCreateBody) {
      this.orgCreateBody = orgCreateBody;
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
      return createChildOrgWithHttpInfo(orgCreateBody);
    }
  }

  /**
   * Create child-organization.
   * ## Overview This endpoint requires the [multi-org account](https://docs.datadoghq.com/account_management/multi_organization/) feature and must be enabled by [contacting support](https://docs.datadoghq.com/help/). ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: The name of the new child-organization, limited to 32 characters. * **&#x60;subscription&#x60;** [*required*]: A JSON array of subscription type. Types available are **trial**, **free**, and **pro**. * **&#x60;billing&#x60;** [*required*]: A JSON array of billing type. Note that only **parent_billing** is supported.  Once a new child-organization is created, you can interact with it by using the **org.public_id**, **api_key.key**, and **application_key.hash** provided in the response.
   * @param orgCreateBody Org object that needs to be created (require)
   * @return createChildOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateChildOrgRequest createChildOrg(OrgCreateBody orgCreateBody) throws ApiException {
    return new APIcreateChildOrgRequest(orgCreateBody);
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Get the organization
   * ## Overview Gets information about your organization
   
   * @return getOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetOrgRequest getOrg() throws ApiException {
    return new APIgetOrgRequest();
  }

private ApiResponse<OrgResponse> updateOrgWithHttpInfo(String publicId, Org org) throws ApiException {
    Object localVarPostBody = org;
    
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateOrgRequest {
    private String publicId;
    private Org org;

    private APIupdateOrgRequest(String publicId, Org org) {
      this.publicId = publicId;
      this.org = org;
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
      return updateOrgWithHttpInfo(publicId, org);
    }
  }

  /**
   * Update the organization
   * ## Overview Updates the organization ### ARGUMENTS * **&#x60;name&#x60;** [*optional*]: The organization name.  * **&#x60;settings&#x60;** [*optional*]: A JSON array of settings. Settings include:    * **&#x60;saml&#x60;**: Set the boolean property **enabled** to enable or disable single sign on with SAML. See the [SAML documentation](https://docs.datadoghq.com/account_management/saml) for more information about all SAML settings.    * **&#x60;saml_idp_initiated_login&#x60;**: has one property **enabled** (boolean).    * **&#x60;saml_strict_mode&#x60;**: has one property **enabled** (boolean).    * **&#x60;saml_autocreate_users_domains&#x60;**: has two properties: **enabled** (boolean) and **domains** which is a list of domains without the @ symbol.
   * @param publicId The public_id of the org you are operating with (required)
   * @param org  (require)
   * @return updateOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateOrgRequest updateOrg(String publicId, Org org) throws ApiException {
    return new APIupdateOrgRequest(publicId, org);
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * ## Overview There are a couple of options for updating the Identity Provider (IdP) metadata from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form post. ### Multipart Form-Data #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** #### Arguments * **&#x60;public_id&#x60;** [*required*]: The public id of the org you want to update metadata for. ### MultiPart Form Data Body * The encoded data for the IDP settings to upload #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** #### Arguments * The body must contain the contents of your IdP metadata XML file.
   * @param publicId The public_id of the org you are operating with (required)
   
   * @return uploadIdPForOrgRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIuploadIdPForOrgRequest uploadIdPForOrg(String publicId) throws ApiException {
    return new APIuploadIdPForOrgRequest(publicId);
  }
}
