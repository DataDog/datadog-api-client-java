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
   * Create an API key Create an API key.
   *
   * @param body (required)
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeyResponse createAPIKey(APIKeyCreateRequest body) throws ApiException {
    return createAPIKeyWithHttpInfo(body).getData();
  }

  /**
   * Create an API key Create an API key.
   *
   * @param body (required)
   * @return ApiResponse&lt;APIKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<APIKeyResponse> createAPIKeyWithHttpInfo(APIKeyCreateRequest body)
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

  /**
   * Create an application key for current user Create an application key for current user
   *
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse createCurrentUserApplicationKey(ApplicationKeyCreateRequest body)
      throws ApiException {
    return createCurrentUserApplicationKeyWithHttpInfo(body).getData();
  }

  /**
   * Create an application key for current user Create an application key for current user
   *
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> createCurrentUserApplicationKeyWithHttpInfo(
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

  /**
   * Delete an API key Delete an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteAPIKey(String apiKeyId) throws ApiException {
    deleteAPIKeyWithHttpInfo(apiKeyId);
  }

  /**
   * Delete an API key Delete an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAPIKeyWithHttpInfo(String apiKeyId) throws ApiException {
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

  /**
   * Delete an application key Delete an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteApplicationKey(String appKeyId) throws ApiException {
    deleteApplicationKeyWithHttpInfo(appKeyId);
  }

  /**
   * Delete an application key Delete an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteApplicationKeyWithHttpInfo(String appKeyId) throws ApiException {
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

  /**
   * Delete an application key owned by current user Delete an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteCurrentUserApplicationKey(String appKeyId) throws ApiException {
    deleteCurrentUserApplicationKeyWithHttpInfo(appKeyId);
  }

  /**
   * Delete an application key owned by current user Delete an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCurrentUserApplicationKeyWithHttpInfo(String appKeyId)
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

  /** Manage optional parameters to getAPIKey. */
  public static class GetAPIKeyOptionalParameters {
    private String include;

    /**
     * Set include
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are &#x60;created_by&#x60; and
     *     &#x60;modified_by&#x60;. (optional)
     * @return GetAPIKeyOptionalParameters
     */
    public GetAPIKeyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get API key Get an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeyResponse getAPIKey(String apiKeyId) throws ApiException {
    return getAPIKeyWithHttpInfo(apiKeyId, new GetAPIKeyOptionalParameters()).getData();
  }

  /**
   * Get API key Get an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeyResponse getAPIKey(String apiKeyId, GetAPIKeyOptionalParameters parameters)
      throws ApiException {
    return getAPIKeyWithHttpInfo(apiKeyId, parameters).getData();
  }

  /**
   * Get API key Get an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;APIKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<APIKeyResponse> getAPIKeyWithHttpInfo(
      String apiKeyId, GetAPIKeyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'apiKeyId' when calling getAPIKey");
    }
    String include = parameters.include;
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

  /** Manage optional parameters to getApplicationKey. */
  public static class GetApplicationKeyOptionalParameters {
    private String include;

    /**
     * Set include
     *
     * @param include Resource path for related resources to include in the response. Only
     *     &#x60;owned_by&#x60; is supported. (optional)
     * @return GetApplicationKeyOptionalParameters
     */
    public GetApplicationKeyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get an application key Get an application key for your org.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse getApplicationKey(String appKeyId) throws ApiException {
    return getApplicationKeyWithHttpInfo(appKeyId, new GetApplicationKeyOptionalParameters())
        .getData();
  }

  /**
   * Get an application key Get an application key for your org.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse getApplicationKey(
      String appKeyId, GetApplicationKeyOptionalParameters parameters) throws ApiException {
    return getApplicationKeyWithHttpInfo(appKeyId, parameters).getData();
  }

  /**
   * Get an application key Get an application key for your org.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> getApplicationKeyWithHttpInfo(
      String appKeyId, GetApplicationKeyOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling getApplicationKey");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

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

  /**
   * Get one application key owned by current user Get an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse getCurrentUserApplicationKey(String appKeyId) throws ApiException {
    return getCurrentUserApplicationKeyWithHttpInfo(appKeyId).getData();
  }

  /**
   * Get one application key owned by current user Get an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> getCurrentUserApplicationKeyWithHttpInfo(
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

  /** Manage optional parameters to listAPIKeys. */
  public static class ListAPIKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private APIKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;
    private String filterModifiedAtStart;
    private String filterModifiedAtEnd;
    private String include;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort API key attribute used to sort results. Sort order is ascending by default. In
     *     order to specify a descending sort, prefix the attribute with a minus sign. (optional,
     *     default to name)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters sort(APIKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter API keys by the specified string. (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include API keys created on or after the specified date.
     *     (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterCreatedAtStart(String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include API keys created on or before the specified date.
     *     (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }

    /**
     * Set filterModifiedAtStart
     *
     * @param filterModifiedAtStart Only include API keys modified on or after the specified date.
     *     (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterModifiedAtStart(String filterModifiedAtStart) {
      this.filterModifiedAtStart = filterModifiedAtStart;
      return this;
    }

    /**
     * Set filterModifiedAtEnd
     *
     * @param filterModifiedAtEnd Only include API keys modified on or before the specified date.
     *     (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterModifiedAtEnd(String filterModifiedAtEnd) {
      this.filterModifiedAtEnd = filterModifiedAtEnd;
      return this;
    }

    /**
     * Set include
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are &#x60;created_by&#x60; and
     *     &#x60;modified_by&#x60;. (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get all API keys List all API keys available for your account.
   *
   * @return APIKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeysResponse listAPIKeys() throws ApiException {
    return listAPIKeysWithHttpInfo(new ListAPIKeysOptionalParameters()).getData();
  }

  /**
   * Get all API keys List all API keys available for your account.
   *
   * @param parameters Optional parameters for the request.
   * @return APIKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeysResponse listAPIKeys(ListAPIKeysOptionalParameters parameters) throws ApiException {
    return listAPIKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all API keys List all API keys available for your account.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;APIKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<APIKeysResponse> listAPIKeysWithHttpInfo(
      ListAPIKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    APIKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    String filterModifiedAtStart = parameters.filterModifiedAtStart;
    String filterModifiedAtEnd = parameters.filterModifiedAtEnd;
    String include = parameters.include;
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

  /** Manage optional parameters to listApplicationKeys. */
  public static class ListApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to name)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters filterCreatedAtStart(String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }
  }

  /**
   * Get all application keys List all application keys available for your org
   *
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listApplicationKeys() throws ApiException {
    return listApplicationKeysWithHttpInfo(new ListApplicationKeysOptionalParameters()).getData();
  }

  /**
   * Get all application keys List all application keys available for your org
   *
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listApplicationKeys(
      ListApplicationKeysOptionalParameters parameters) throws ApiException {
    return listApplicationKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all application keys List all application keys available for your org
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListApplicationKeysResponse> listApplicationKeysWithHttpInfo(
      ListApplicationKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
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

  /** Manage optional parameters to listCurrentUserApplicationKeys. */
  public static class ListCurrentUserApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to name)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters filterCreatedAtStart(
        String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters filterCreatedAtEnd(
        String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }
  }

  /**
   * Get all application keys owned by current user List all application keys available for current
   * user
   *
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listCurrentUserApplicationKeys() throws ApiException {
    return listCurrentUserApplicationKeysWithHttpInfo(
            new ListCurrentUserApplicationKeysOptionalParameters())
        .getData();
  }

  /**
   * Get all application keys owned by current user List all application keys available for current
   * user
   *
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listCurrentUserApplicationKeys(
      ListCurrentUserApplicationKeysOptionalParameters parameters) throws ApiException {
    return listCurrentUserApplicationKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all application keys owned by current user List all application keys available for current
   * user
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListApplicationKeysResponse> listCurrentUserApplicationKeysWithHttpInfo(
      ListCurrentUserApplicationKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
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

  /**
   * Edit an API key Update an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public APIKeyResponse updateAPIKey(String apiKeyId, APIKeyUpdateRequest body)
      throws ApiException {
    return updateAPIKeyWithHttpInfo(apiKeyId, body).getData();
  }

  /**
   * Edit an API key Update an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return ApiResponse&lt;APIKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<APIKeyResponse> updateAPIKeyWithHttpInfo(
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

  /**
   * Edit an application key Edit an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse updateApplicationKey(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    return updateApplicationKeyWithHttpInfo(appKeyId, body).getData();
  }

  /**
   * Edit an application key Edit an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> updateApplicationKeyWithHttpInfo(
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

  /**
   * Edit an application key owned by current user Edit an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse updateCurrentUserApplicationKey(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    return updateCurrentUserApplicationKeyWithHttpInfo(appKeyId, body).getData();
  }

  /**
   * Edit an application key owned by current user Edit an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> updateCurrentUserApplicationKeyWithHttpInfo(
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
}
