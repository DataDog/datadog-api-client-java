package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.ApiKey;
import com.datadog.api.v1.client.model.ApiKeyListResponse;
import com.datadog.api.v1.client.model.ApiKeyResponse;
import com.datadog.api.v1.client.model.ApplicationKey;
import com.datadog.api.v1.client.model.ApplicationKeyListResponse;
import com.datadog.api.v1.client.model.ApplicationKeyResponse;
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

  private ApiResponse<ApiKeyResponse> createAPIKeyWithHttpInfo(ApiKey body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAPIKey");
    }

    // create path and map variables
    String localVarPath = "/api/v1/api_key";

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};

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
    private ApiKey body;

    private APIcreateAPIKeyRequest() {}

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateAPIKeyRequest
     */
    public APIcreateAPIKeyRequest body(ApiKey body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createAPIKey request
     *
     * @return ApiKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApiKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return createAPIKeyWithHttpInfo(body);
    }
  }

  /**
   * Create an API key Creates an API key with a given name.
   *
   * @return createAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateAPIKeyRequest createAPIKey() throws ApiException {
    return new APIcreateAPIKeyRequest();
  }

  private ApiResponse<ApplicationKeyResponse> createApplicationKeyWithHttpInfo(ApplicationKey body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createApplicationKey");
    }

    // create path and map variables
    String localVarPath = "/api/v1/application_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.createApplicationKey",
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

  public class APIcreateApplicationKeyRequest {
    private ApplicationKey body;

    private APIcreateApplicationKeyRequest() {}

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateApplicationKeyRequest
     */
    public APIcreateApplicationKeyRequest body(ApplicationKey body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createApplicationKey request
     *
     * @return ApplicationKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createApplicationKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return createApplicationKeyWithHttpInfo(body);
    }
  }

  /**
   * Create an application key Create an application key with a given name.
   *
   * @return createApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateApplicationKeyRequest createApplicationKey() throws ApiException {
    return new APIcreateApplicationKeyRequest();
  }

  private ApiResponse<ApiKeyResponse> deleteAPIKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/api_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};

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
        localVarReturnType,
        false);
  }

  public class APIdeleteAPIKeyRequest {
    private String key;

    private APIdeleteAPIKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Execute deleteAPIKey request
     *
     * @return ApiKeyResponse
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
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApiKeyResponse&gt;
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
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return deleteAPIKeyWithHttpInfo(key);
    }
  }

  /**
   * Delete an API key Delete a given API key.
   *
   * @param key The specific API key you are working with. (required)
   * @return deleteAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteAPIKeyRequest deleteAPIKey(String key) throws ApiException {
    return new APIdeleteAPIKeyRequest(key);
  }

  private ApiResponse<ApplicationKeyResponse> deleteApplicationKeyWithHttpInfo(String key)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(
          400, "Missing the required parameter 'key' when calling deleteApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/application_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

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
        localVarReturnType,
        false);
  }

  public class APIdeleteApplicationKeyRequest {
    private String key;

    private APIdeleteApplicationKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Execute deleteApplicationKey request
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
     * Execute deleteApplicationKey request with HTTP info returned
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
      return deleteApplicationKeyWithHttpInfo(key);
    }
  }

  /**
   * Delete an application key Delete a given application key.
   *
   * @param key The specific APP key you are working with. (required)
   * @return deleteApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteApplicationKeyRequest deleteApplicationKey(String key) throws ApiException {
    return new APIdeleteApplicationKeyRequest(key);
  }

  private ApiResponse<ApiKeyResponse> getAPIKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/api_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPIKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};

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
    private String key;

    private APIgetAPIKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Execute getAPIKey request
     *
     * @return ApiKeyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApiKeyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return getAPIKeyWithHttpInfo(key);
    }
  }

  /**
   * Get API key Get a given API key.
   *
   * @param key The specific API key you are working with. (required)
   * @return getAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetAPIKeyRequest getAPIKey(String key) throws ApiException {
    return new APIgetAPIKeyRequest(key);
  }

  private ApiResponse<ApplicationKeyResponse> getApplicationKeyWithHttpInfo(String key)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(
          400, "Missing the required parameter 'key' when calling getApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/application_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.getApplicationKey",
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

  public class APIgetApplicationKeyRequest {
    private String key;

    private APIgetApplicationKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Execute getApplicationKey request
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
     * Execute getApplicationKey request with HTTP info returned
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
      return getApplicationKeyWithHttpInfo(key);
    }
  }

  /**
   * Get an application key Get a given application key.
   *
   * @param key The specific APP key you are working with. (required)
   * @return getApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetApplicationKeyRequest getApplicationKey(String key) throws ApiException {
    return new APIgetApplicationKeyRequest(key);
  }

  private ApiResponse<ApiKeyListResponse> listAPIKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v1/api_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAPIKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApiKeyListResponse> localVarReturnType = new GenericType<ApiKeyListResponse>() {};

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

    private APIlistAPIKeysRequest() {}

    /**
     * Execute listAPIKeys request
     *
     * @return ApiKeyListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiKeyListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAPIKeys request with HTTP info returned
     *
     * @return ApiResponse&lt;ApiKeyListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApiKeyListResponse> executeWithHttpInfo() throws ApiException {
      return listAPIKeysWithHttpInfo();
    }
  }

  /**
   * Get all API keys Get all API keys available for your account.
   *
   * @return listAPIKeysRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistAPIKeysRequest listAPIKeys() throws ApiException {
    return new APIlistAPIKeysRequest();
  }

  private ApiResponse<ApplicationKeyListResponse> listApplicationKeysWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/v1/application_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listApplicationKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyListResponse> localVarReturnType =
        new GenericType<ApplicationKeyListResponse>() {};

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

    private APIlistApplicationKeysRequest() {}

    /**
     * Execute listApplicationKeys request
     *
     * @return ApplicationKeyListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApplicationKeyListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listApplicationKeys request with HTTP info returned
     *
     * @return ApiResponse&lt;ApplicationKeyListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyListResponse> executeWithHttpInfo() throws ApiException {
      return listApplicationKeysWithHttpInfo();
    }
  }

  /**
   * Get all application keys Get all application keys available for your Datadog account.
   *
   * @return listApplicationKeysRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistApplicationKeysRequest listApplicationKeys() throws ApiException {
    return new APIlistApplicationKeysRequest();
  }

  private ApiResponse<ApiKeyResponse> updateAPIKeyWithHttpInfo(String key, ApiKey body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling updateAPIKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAPIKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/api_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};

    return apiClient.invokeAPI(
        "KeyManagementApi.updateAPIKey",
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

  public class APIupdateAPIKeyRequest {
    private String key;
    private ApiKey body;

    private APIupdateAPIKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateAPIKeyRequest
     */
    public APIupdateAPIKeyRequest body(ApiKey body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateAPIKey request
     *
     * @return ApiKeyResponse
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
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAPIKey request with HTTP info returned
     *
     * @return ApiResponse&lt;ApiKeyResponse&gt;
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
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return updateAPIKeyWithHttpInfo(key, body);
    }
  }

  /**
   * Edit an API key Edit an API key name.
   *
   * @param key The specific API key you are working with. (required)
   * @return updateAPIKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateAPIKeyRequest updateAPIKey(String key) throws ApiException {
    return new APIupdateAPIKeyRequest(key);
  }

  private ApiResponse<ApplicationKeyResponse> updateApplicationKeyWithHttpInfo(
      String key, ApplicationKey body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(
          400, "Missing the required parameter 'key' when calling updateApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateApplicationKey");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/application_key/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

  public class APIupdateApplicationKeyRequest {
    private String key;
    private ApplicationKey body;

    private APIupdateApplicationKeyRequest(String key) {
      this.key = key;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateApplicationKeyRequest
     */
    public APIupdateApplicationKeyRequest body(ApplicationKey body) {
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
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
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
     * <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return updateApplicationKeyWithHttpInfo(key, body);
    }
  }

  /**
   * Edit an application key Edit an application key name.
   *
   * @param key The specific APP key you are working with. (required)
   * @return updateApplicationKeyRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateApplicationKeyRequest updateApplicationKey(String key) throws ApiException {
    return new APIupdateApplicationKeyRequest(key);
  }
}
