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
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
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
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a child organization
   *
   * <p>See {@link #createChildOrgWithHttpInfo}.
   *
   * @param body Organization object that needs to be created (required)
   * @return OrganizationCreateResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationCreateResponse createChildOrg(OrganizationCreateBody body)
      throws ApiException {
    return createChildOrgWithHttpInfo(body).getData();
  }

  /**
   * Create a child organization
   *
   * <p>See {@link #createChildOrgWithHttpInfoAsync}.
   *
   * @param body Organization object that needs to be created (required)
   * @return CompletableFuture&lt;OrganizationCreateResponse&gt;
   */
  public CompletableFuture<OrganizationCreateResponse> createChildOrgAsync(
      OrganizationCreateBody body) {
    return createChildOrgWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a child organization
   *
   * <p>Create a child organization. This endpoint requires the [multi-organization
   * account](https://docs.datadoghq.com/account_management/multi_organization/) feature and must be
   * enabled by [contacting support](https://docs.datadoghq.com/help/). Once a new child
   * organization is created, you can interact with it by using the &#x60;org.public_id&#x60;,
   * &#x60;api_key.key&#x60;, and &#x60;application_key.hash&#x60; provided in the response.
   *
   * @param body Organization object that needs to be created (required)
   * @return ApiResponse&lt;OrganizationCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "OrganizationsApi.createChildOrg",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationCreateResponse>() {});
  }

  /**
   * Create a child organization
   *
   * <p>See {@link #createChildOrgWithHttpInfo}.
   *
   * @param body Organization object that needs to be created (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrganizationCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrganizationCreateResponse>> createChildOrgWithHttpInfoAsync(
      OrganizationCreateBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrganizationCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createChildOrg"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/org";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createChildOrg");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "OrganizationsApi.createChildOrg",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrganizationCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationCreateResponse>() {});
  }

  /**
   * Get organization information
   *
   * <p>See {@link #getOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return OrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationResponse getOrg(String publicId) throws ApiException {
    return getOrgWithHttpInfo(publicId).getData();
  }

  /**
   * Get organization information
   *
   * <p>See {@link #getOrgWithHttpInfoAsync}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return CompletableFuture&lt;OrganizationResponse&gt;
   */
  public CompletableFuture<OrganizationResponse> getOrgAsync(String publicId) {
    return getOrgWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get organization information
   *
   * <p>Get organization information.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return ApiResponse&lt;OrganizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "OrganizationsApi.getOrg",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationResponse>() {});
  }

  /**
   * Get organization information
   *
   * <p>See {@link #getOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrganizationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrganizationResponse>> getOrgWithHttpInfoAsync(
      String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<OrganizationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'publicId' when calling getOrg"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getOrg");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "OrganizationsApi.getOrg",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrganizationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationResponse>() {});
  }

  /**
   * List your managed organizations
   *
   * <p>See {@link #listOrgsWithHttpInfo}.
   *
   * @return OrganizationListResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationListResponse listOrgs() throws ApiException {
    return listOrgsWithHttpInfo().getData();
  }

  /**
   * List your managed organizations
   *
   * <p>See {@link #listOrgsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrganizationListResponse&gt;
   */
  public CompletableFuture<OrganizationListResponse> listOrgsAsync() {
    return listOrgsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List your managed organizations
   *
   * <p>List your managed organizations.
   *
   * @return ApiResponse&lt;OrganizationListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrganizationListResponse> listOrgsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/org";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "OrganizationsApi.listOrgs",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationListResponse>() {});
  }

  /**
   * List your managed organizations
   *
   * <p>See {@link #listOrgsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OrganizationListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrganizationListResponse>> listOrgsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/org";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listOrgs");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "OrganizationsApi.listOrgs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrganizationListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationListResponse>() {});
  }

  /**
   * Update your organization
   *
   * <p>See {@link #updateOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return OrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationResponse updateOrg(String publicId, Organization body) throws ApiException {
    return updateOrgWithHttpInfo(publicId, body).getData();
  }

  /**
   * Update your organization
   *
   * <p>See {@link #updateOrgWithHttpInfoAsync}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrganizationResponse&gt;
   */
  public CompletableFuture<OrganizationResponse> updateOrgAsync(
      String publicId, Organization body) {
    return updateOrgWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update your organization
   *
   * <p>Update your organization.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return ApiResponse&lt;OrganizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "OrganizationsApi.updateOrg",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationResponse>() {});
  }

  /**
   * Update your organization
   *
   * <p>See {@link #updateOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating within.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrganizationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrganizationResponse>> updateOrgWithHttpInfoAsync(
      String publicId, Organization body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<OrganizationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling updateOrg"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrganizationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateOrg"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateOrg");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "OrganizationsApi.updateOrg",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrganizationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OrganizationResponse>() {});
  }

  /**
   * Upload IdP metadata
   *
   * <p>See {@link #uploadIdPForOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return IdpResponse
   * @throws ApiException if fails to make API call
   */
  public IdpResponse uploadIdPForOrg(String publicId, File idpFile) throws ApiException {
    return uploadIdPForOrgWithHttpInfo(publicId, idpFile).getData();
  }

  /**
   * Upload IdP metadata
   *
   * <p>See {@link #uploadIdPForOrgWithHttpInfoAsync}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return CompletableFuture&lt;IdpResponse&gt;
   */
  public CompletableFuture<IdpResponse> uploadIdPForOrgAsync(String publicId, File idpFile) {
    return uploadIdPForOrgWithHttpInfoAsync(publicId, idpFile)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload IdP metadata
   *
   * <p>There are a couple of options for updating the Identity Provider (IdP) metadata from your
   * SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form post. * **XML
   * Body:** Post the IdP metadata file as the body of the request.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return ApiResponse&lt;IdpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (idpFile != null) localVarFormParams.put("idp_file", idpFile);

    Invocation.Builder builder =
        apiClient.createBuilder(
            "OrganizationsApi.uploadIdPForOrg",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<IdpResponse>() {});
  }

  /**
   * Upload IdP metadata
   *
   * <p>See {@link #uploadIdPForOrgWithHttpInfo}.
   *
   * @param publicId The &#x60;public_id&#x60; of the organization you are operating with (required)
   * @param idpFile The path to the XML metadata file you wish to upload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IdpResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IdpResponse>> uploadIdPForOrgWithHttpInfoAsync(
      String publicId, File idpFile) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<IdpResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling uploadIdPForOrg"));
      return result;
    }

    // verify the required parameter 'idpFile' is set
    if (idpFile == null) {
      CompletableFuture<ApiResponse<IdpResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'idpFile' when calling uploadIdPForOrg"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/org/{public_id}/idp_metadata"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "uploadIdPForOrg");

    if (idpFile != null) localVarFormParams.put("idp_file", idpFile);

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "OrganizationsApi.uploadIdPForOrg",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IdpResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<IdpResponse>() {});
  }
}
