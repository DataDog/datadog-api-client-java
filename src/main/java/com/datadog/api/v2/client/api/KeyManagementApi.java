package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.APIKeyCreateRequest;
import com.datadog.api.v2.client.model.APIKeyResponse;
import com.datadog.api.v2.client.model.APIKeyUpdateRequest;
import com.datadog.api.v2.client.model.APIKeysResponse;
import com.datadog.api.v2.client.model.APIKeysSort;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeyUpdateRequest;
import com.datadog.api.v2.client.model.ApplicationKeysSort;
import com.datadog.api.v2.client.model.ListApplicationKeysResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyManagementApi {
  private ApiClient apiClient;

  public KeyManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KeyManagementApi(ApiClient apiClient) {
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

  private ApiResponse<APIKeyResponse> createAPIKeyWithHttpInfo(APIKeyCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAPIKey");
    }

    // create path and map variables
    String localVarPath = "/api/v2/api_keys";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAPIKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<APIKeyResponse> localVarReturnType = new GenericType<APIKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.createAPIKey",
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

  public class APIcreateAPIKeyRequest {
    private APIKeyCreateRequest body;

    private APIcreateAPIKeyRequest() {}

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateAPIKeyRequest
     */
    public APIcreateAPIKeyRequest body(APIKeyCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createAPIKey request
     *
     * @return APIKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public APIKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;APIKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<APIKeyResponse> executeWithHttpInfo() throws ApiException {
      return createAPIKeyWithHttpInfo(body);
    }
  }

  /**
   * Create an API key Create an API key.
   *
   * @return createAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateAPIKeyRequest createAPIKey() throws ApiException {
    return new APIcreateAPIKeyRequest();
  }

  private ApiResponse<ApplicationKeyResponse> createCurrentUserApplicationKeyWithHttpInfo(
      ApplicationKeyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createCurrentUserApplicationKey");
    }

    // create path and map variables
    String localVarPath = "/api/v2/current_user/application_keys";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createCurrentUserApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.createCurrentUserApplicationKey",
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

  public class APIcreateCurrentUserApplicationKeyRequest {
    private ApplicationKeyCreateRequest body;

    private APIcreateCurrentUserApplicationKeyRequest() {}

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateCurrentUserApplicationKeyRequest
     */
    public APIcreateCurrentUserApplicationKeyRequest body(ApplicationKeyCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createCurrentUserApplicationKey request
     *
     * @return ApplicationKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createCurrentUserApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return createCurrentUserApplicationKeyWithHttpInfo(body);
    }
  }

  /**
   * Create an application key for current user Create an application key for current user
   *
   * @return createCurrentUserApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateCurrentUserApplicationKeyRequest createCurrentUserApplicationKey()
      throws ApiException {
    return new APIcreateCurrentUserApplicationKeyRequest();
  }

  private ApiResponse<Void> deleteAPIKeyWithHttpInfo(String apiKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'apiKeyId' when calling deleteAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAPIKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "KeyManagementApi.deleteAPIKey",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  public class APIdeleteAPIKeyRequest {
    private String apiKeyId;

    private APIdeleteAPIKeyRequest(String apiKeyId) {
      this.apiKeyId = apiKeyId;
    }

    /**
     * Execute deleteAPIKey request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteAPIKeyWithHttpInfo(apiKeyId);
    }
  }

  /**
   * Delete an API key Delete an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return deleteAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteAPIKeyRequest deleteAPIKey(String apiKeyId) throws ApiException {
    return new APIdeleteAPIKeyRequest(apiKeyId);
  }

  private ApiResponse<Void> deleteApplicationKeyWithHttpInfo(String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling deleteApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "KeyManagementApi.deleteApplicationKey",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  public class APIdeleteApplicationKeyRequest {
    private String appKeyId;

    private APIdeleteApplicationKeyRequest(String appKeyId) {
      this.appKeyId = appKeyId;
    }

    /**
     * Execute deleteApplicationKey request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteApplicationKeyWithHttpInfo(appKeyId);
    }
  }

  /**
   * Delete an application key Delete an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @return deleteApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteApplicationKeyRequest deleteApplicationKey(String appKeyId) throws ApiException {
    return new APIdeleteApplicationKeyRequest(appKeyId);
  }

  private ApiResponse<Void> deleteCurrentUserApplicationKeyWithHttpInfo(String appKeyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling deleteCurrentUserApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteCurrentUserApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "KeyManagementApi.deleteCurrentUserApplicationKey",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  public class APIdeleteCurrentUserApplicationKeyRequest {
    private String appKeyId;

    private APIdeleteCurrentUserApplicationKeyRequest(String appKeyId) {
      this.appKeyId = appKeyId;
    }

    /**
     * Execute deleteCurrentUserApplicationKey request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteCurrentUserApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteCurrentUserApplicationKeyWithHttpInfo(appKeyId);
    }
  }

  /**
   * Delete an application key owned by current user Delete an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return deleteCurrentUserApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteCurrentUserApplicationKeyRequest deleteCurrentUserApplicationKey(String appKeyId)
      throws ApiException {
    return new APIdeleteCurrentUserApplicationKeyRequest(appKeyId);
  }

  private ApiResponse<APIKeyResponse> getAPIKeyWithHttpInfo(String apiKeyId, String include)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'apiKeyId' when calling getAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPIKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<APIKeyResponse> localVarReturnType = new GenericType<APIKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.getAPIKey",
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

  public class APIgetAPIKeyRequest {
    private String apiKeyId;
    private String include;

    private APIgetAPIKeyRequest(String apiKeyId) {
      this.apiKeyId = apiKeyId;
    }

    /**
     * Set include
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are &#x60;created_by&#x60; and
     *     &#x60;modified_by&#x60;. (optional)
     * @return APIgetAPIKeyRequest
     */
    public APIgetAPIKeyRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Execute getAPIKey request
     *
     * @return APIKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public APIKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;APIKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<APIKeyResponse> executeWithHttpInfo() throws ApiException {
      return getAPIKeyWithHttpInfo(apiKeyId, include);
    }
  }

  /**
   * Get API key Get an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return getAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetAPIKeyRequest getAPIKey(String apiKeyId) throws ApiException {
    return new APIgetAPIKeyRequest(apiKeyId);
  }

  private ApiResponse<ApplicationKeyResponse> getCurrentUserApplicationKeyWithHttpInfo(
      String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling getCurrentUserApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getCurrentUserApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.getCurrentUserApplicationKey",
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

  public class APIgetCurrentUserApplicationKeyRequest {
    private String appKeyId;

    private APIgetCurrentUserApplicationKeyRequest(String appKeyId) {
      this.appKeyId = appKeyId;
    }

    /**
     * Execute getCurrentUserApplicationKey request
     *
     * @return ApplicationKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getCurrentUserApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return getCurrentUserApplicationKeyWithHttpInfo(appKeyId);
    }
  }

  /**
   * Get one application key owned by current user Get an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return getCurrentUserApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetCurrentUserApplicationKeyRequest getCurrentUserApplicationKey(String appKeyId)
      throws ApiException {
    return new APIgetCurrentUserApplicationKeyRequest(appKeyId);
  }

  private ApiResponse<APIKeysResponse> listAPIKeysWithHttpInfo(
      Long pageSize,
      Long pageNumber,
      APIKeysSort sort,
      String filter,
      String filterCreatedAtStart,
      String filterCreatedAtEnd,
      String filterModifiedAtStart,
      String filterModifiedAtEnd,
      String include)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/api_keys";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[modified_at][start]", filterModifiedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[modified_at][end]", filterModifiedAtEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAPIKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<APIKeysResponse> localVarReturnType = new GenericType<APIKeysResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.listAPIKeys",
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

  public class APIlistAPIKeysRequest {
    private Long pageSize;
    private Long pageNumber;
    private APIKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;
    private String filterModifiedAtStart;
    private String filterModifiedAtEnd;
    private String include;

    private APIlistAPIKeysRequest() {}

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort API key attribute used to sort results. Sort order is ascending by default. In
     *     order to specify a descending sort, prefix the attribute with a minus sign. (optional,
     *     default to name)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest sort(APIKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter API keys by the specified string. (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include API keys created on or after the specified date.
     *     (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest filterCreatedAtStart(String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include API keys created on or before the specified date.
     *     (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }

    /**
     * Set filterModifiedAtStart
     *
     * @param filterModifiedAtStart Only include API keys modified on or after the specified date.
     *     (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest filterModifiedAtStart(String filterModifiedAtStart) {
      this.filterModifiedAtStart = filterModifiedAtStart;
      return this;
    }

    /**
     * Set filterModifiedAtEnd
     *
     * @param filterModifiedAtEnd Only include API keys modified on or before the specified date.
     *     (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest filterModifiedAtEnd(String filterModifiedAtEnd) {
      this.filterModifiedAtEnd = filterModifiedAtEnd;
      return this;
    }

    /**
     * Set include
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are &#x60;created_by&#x60; and
     *     &#x60;modified_by&#x60;. (optional)
     * @return APIlistAPIKeysRequest
     */
    public APIlistAPIKeysRequest include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Execute listAPIKeys request
     *
     * @return APIKeysResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public APIKeysResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAPIKeys request with HTTP info returned
     *
     * @return ApiResponse&lt;APIKeysResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<APIKeysResponse> executeWithHttpInfo() throws ApiException {
      return listAPIKeysWithHttpInfo(
          pageSize,
          pageNumber,
          sort,
          filter,
          filterCreatedAtStart,
          filterCreatedAtEnd,
          filterModifiedAtStart,
          filterModifiedAtEnd,
          include);
    }
  }

  /**
   * Get all API keys List all API keys available for your account.
   *
   * @return listAPIKeysRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistAPIKeysRequest listAPIKeys() throws ApiException {
    return new APIlistAPIKeysRequest();
  }

  private ApiResponse<ListApplicationKeysResponse> listApplicationKeysWithHttpInfo(
      Long pageSize,
      Long pageNumber,
      ApplicationKeysSort sort,
      String filter,
      String filterCreatedAtStart,
      String filterCreatedAtEnd)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/application_keys";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listApplicationKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ListApplicationKeysResponse> localVarReturnType =
        new GenericType<ListApplicationKeysResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.listApplicationKeys",
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

  public class APIlistApplicationKeysRequest {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    private APIlistApplicationKeysRequest() {}

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to name)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest filterCreatedAtStart(String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return APIlistApplicationKeysRequest
     */
    public APIlistApplicationKeysRequest filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }

    /**
     * Execute listApplicationKeys request
     *
     * @return ListApplicationKeysResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ListApplicationKeysResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listApplicationKeys request with HTTP info returned
     *
     * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ListApplicationKeysResponse> executeWithHttpInfo() throws ApiException {
      return listApplicationKeysWithHttpInfo(
          pageSize, pageNumber, sort, filter, filterCreatedAtStart, filterCreatedAtEnd);
    }
  }

  /**
   * Get all application keys List all application keys available for your org
   *
   * @return listApplicationKeysRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistApplicationKeysRequest listApplicationKeys() throws ApiException {
    return new APIlistApplicationKeysRequest();
  }

  private ApiResponse<ListApplicationKeysResponse> listCurrentUserApplicationKeysWithHttpInfo(
      Long pageSize,
      Long pageNumber,
      ApplicationKeysSort sort,
      String filter,
      String filterCreatedAtStart,
      String filterCreatedAtEnd)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v2/current_user/application_keys";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listCurrentUserApplicationKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ListApplicationKeysResponse> localVarReturnType =
        new GenericType<ListApplicationKeysResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.listCurrentUserApplicationKeys",
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

  public class APIlistCurrentUserApplicationKeysRequest {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    private APIlistCurrentUserApplicationKeysRequest() {}

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to name)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest filterCreatedAtStart(
        String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return APIlistCurrentUserApplicationKeysRequest
     */
    public APIlistCurrentUserApplicationKeysRequest filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }

    /**
     * Execute listCurrentUserApplicationKeys request
     *
     * @return ListApplicationKeysResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ListApplicationKeysResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listCurrentUserApplicationKeys request with HTTP info returned
     *
     * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ListApplicationKeysResponse> executeWithHttpInfo() throws ApiException {
      return listCurrentUserApplicationKeysWithHttpInfo(
          pageSize, pageNumber, sort, filter, filterCreatedAtStart, filterCreatedAtEnd);
    }
  }

  /**
   * Get all application keys owned by current user List all application keys available for current
   * user
   *
   * @return listCurrentUserApplicationKeysRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistCurrentUserApplicationKeysRequest listCurrentUserApplicationKeys()
      throws ApiException {
    return new APIlistCurrentUserApplicationKeysRequest();
  }

  private ApiResponse<APIKeyResponse> updateAPIKeyWithHttpInfo(
      String apiKeyId, APIKeyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'apiKeyId' when calling updateAPIKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAPIKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<APIKeyResponse> localVarReturnType = new GenericType<APIKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.updateAPIKey",
        localVarPath,
        "PATCH",
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

  public class APIupdateAPIKeyRequest {
    private String apiKeyId;
    private APIKeyUpdateRequest body;

    private APIupdateAPIKeyRequest(String apiKeyId) {
      this.apiKeyId = apiKeyId;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateAPIKeyRequest
     */
    public APIupdateAPIKeyRequest body(APIKeyUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateAPIKey request
     *
     * @return APIKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public APIKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;APIKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<APIKeyResponse> executeWithHttpInfo() throws ApiException {
      return updateAPIKeyWithHttpInfo(apiKeyId, body);
    }
  }

  /**
   * Edit an API key Update an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return updateAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateAPIKeyRequest updateAPIKey(String apiKeyId) throws ApiException {
    return new APIupdateAPIKeyRequest(apiKeyId);
  }

  private ApiResponse<ApplicationKeyResponse> updateApplicationKeyWithHttpInfo(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling updateApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.updateApplicationKey",
        localVarPath,
        "PATCH",
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

  public class APIupdateApplicationKeyRequest {
    private String appKeyId;
    private ApplicationKeyUpdateRequest body;

    private APIupdateApplicationKeyRequest(String appKeyId) {
      this.appKeyId = appKeyId;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateApplicationKeyRequest
     */
    public APIupdateApplicationKeyRequest body(ApplicationKeyUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateApplicationKey request
     *
     * @return ApplicationKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return updateApplicationKeyWithHttpInfo(appKeyId, body);
    }
  }

  /**
   * Edit an application key Edit an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @return updateApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateApplicationKeyRequest updateApplicationKey(String appKeyId) throws ApiException {
    return new APIupdateApplicationKeyRequest(appKeyId);
  }

  private ApiResponse<ApplicationKeyResponse> updateCurrentUserApplicationKeyWithHttpInfo(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling updateCurrentUserApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateCurrentUserApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateCurrentUserApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.updateCurrentUserApplicationKey",
        localVarPath,
        "PATCH",
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

  public class APIupdateCurrentUserApplicationKeyRequest {
    private String appKeyId;
    private ApplicationKeyUpdateRequest body;

    private APIupdateCurrentUserApplicationKeyRequest(String appKeyId) {
      this.appKeyId = appKeyId;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateCurrentUserApplicationKeyRequest
     */
    public APIupdateCurrentUserApplicationKeyRequest body(ApplicationKeyUpdateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateCurrentUserApplicationKey request
     *
     * @return ApplicationKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateCurrentUserApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return updateCurrentUserApplicationKeyWithHttpInfo(appKeyId, body);
    }
  }

  /**
   * Edit an application key owned by current user Edit an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return updateCurrentUserApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateCurrentUserApplicationKeyRequest updateCurrentUserApplicationKey(String appKeyId)
      throws ApiException {
    return new APIupdateCurrentUserApplicationKeyRequest(appKeyId);
  }
}
