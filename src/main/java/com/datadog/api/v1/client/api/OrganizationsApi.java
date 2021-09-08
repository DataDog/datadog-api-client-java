package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.IdpResponse;
import com.datadog.api.v1.client.model.Organization;
import com.datadog.api.v1.client.model.OrganizationCreateBody;
import com.datadog.api.v1.client.model.OrganizationCreateResponse;
import com.datadog.api.v1.client.model.OrganizationListResponse;
import com.datadog.api.v1.client.model.OrganizationResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
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

  /**
   * Create a child organization Create a child organization. This endpoint requires the
   * [multi-organization account](https://docs.datadoghq.com/account_management/multi_organization/)
   * feature and must be enabled by [contacting support](https://docs.datadoghq.com/help/). Once a
   * new child organization is created, you can interact with it by using the
   * &#x60;org.public_id&#x60;, &#x60;api_key.key&#x60;, and &#x60;application_key.hash&#x60;
   * provided in the response.
   *
   * @param body Organization object that needs to be created (required)
   * @return OrganizationCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public OrganizationCreateResponse createChildOrg(OrganizationCreateBody body)
      throws ApiException {
    return createChildOrgWithHttpInfo(body).getData();
  }

  /**
   * Create a child organization Create a child organization. This endpoint requires the
   * [multi-organization account](https://docs.datadoghq.com/account_management/multi_organization/)
   * feature and must be enabled by [contacting support](https://docs.datadoghq.com/help/). Once a
   * new child organization is created, you can interact with it by using the
   * &#x60;org.public_id&#x60;, &#x60;api_key.key&#x60;, and &#x60;application_key.hash&#x60;
   * provided in the response.
   *
   * @param body Organization object that needs to be created (required)
   * @return ApiResponse&lt;OrganizationCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrganizationCreateResponse> createChildOrgWithHttpInfo(
      OrganizationCreateBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createChildOrg");
    }
    // create path and map variables
    String localVarPath = "/api/v1/org";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createChildOrg");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<OrganizationCreateResponse> localVarReturnType =
        new GenericType<OrganizationCreateResponse>() {};

    return apiClient.invokeAPI(
        "OrganizationsApi.createChildOrg",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get organization information Get organization information.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return OrganizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public OrganizationResponse getOrg(String publicId) throws ApiException {
    return getOrgWithHttpInfo(publicId).getData();
  }

  /**
   * Get organization information Get organization information.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return ApiResponse&lt;OrganizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrganizationResponse> getOrgWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getOrg");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getOrg");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<OrganizationResponse> localVarReturnType =
        new GenericType<OrganizationResponse>() {};

    return apiClient.invokeAPI(
        "OrganizationsApi.getOrg",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * List your managed organizations List your managed organizations.
   *
   * @return OrganizationListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public OrganizationListResponse listOrgs() throws ApiException {
    return listOrgsWithHttpInfo().getData();
  }

  /**
   * List your managed organizations List your managed organizations.
   *
   * @return ApiResponse&lt;OrganizationListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrganizationListResponse> listOrgsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/org";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listOrgs");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<OrganizationListResponse> localVarReturnType =
        new GenericType<OrganizationListResponse>() {};

    return apiClient.invokeAPI(
        "OrganizationsApi.listOrgs",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update your organization Update your organization.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return OrganizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public OrganizationResponse updateOrg(String publicId, Organization body) throws ApiException {
    return updateOrgWithHttpInfo(publicId, body).getData();
  }

  /**
   * Update your organization Update your organization.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return ApiResponse&lt;OrganizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrganizationResponse> updateOrgWithHttpInfo(String publicId, Organization body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling updateOrg");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrg");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateOrg");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<OrganizationResponse> localVarReturnType =
        new GenericType<OrganizationResponse>() {};

    return apiClient.invokeAPI(
        "OrganizationsApi.updateOrg",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Upload IdP metadata There are a couple of options for updating the Identity Provider (IdP)
   * metadata from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form
   * post. * **XML Body:** Post the IdP metadata file as the body of the request.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return IdpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
   *     </table>
   */
  public IdpResponse uploadIdPForOrg(String publicId, File idpFile) throws ApiException {
    return uploadIdPForOrgWithHttpInfo(publicId, idpFile).getData();
  }

  /**
   * Upload IdP metadata There are a couple of options for updating the Identity Provider (IdP)
   * metadata from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form
   * post. * **XML Body:** Post the IdP metadata file as the body of the request.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return ApiResponse&lt;IdpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IdpResponse> uploadIdPForOrgWithHttpInfo(String publicId, File idpFile)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling uploadIdPForOrg");
    }

    // verify the required parameter 'idpFile' is set
    if (idpFile == null) {
      throw new ApiException(
          400, "Missing the required parameter 'idpFile' when calling uploadIdPForOrg");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}/idp_metadata"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "uploadIdPForOrg");

    if (idpFile != null) localVarFormParams.put("idp_file", idpFile);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<IdpResponse> localVarReturnType = new GenericType<IdpResponse>() {};

    return apiClient.invokeAPI(
        "OrganizationsApi.uploadIdPForOrg",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
