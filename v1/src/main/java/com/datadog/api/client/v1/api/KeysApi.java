package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiResponse;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.client.v1.model.ApiKey;
import com.datadog.api.client.v1.model.ApiKeyListResponse;
import com.datadog.api.client.v1.model.ApiKeyResponse;
import com.datadog.api.client.v1.model.ApplicationKey;
import com.datadog.api.client.v1.model.ApplicationKeyListResponse;
import com.datadog.api.client.v1.model.ApplicationKeyResponse;
import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.Error404;
import com.datadog.api.client.v1.model.Error409;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KeysApi {
  private ApiClient apiClient;

  public KeysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KeysApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an API key with a given name.
   * ## Overview Creates an API key ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param apiKey  (optional)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
   */
  public ApiKeyResponse createAPIKey(ApiKey apiKey) throws ApiException {
    return createAPIKeyWithHttpInfo(apiKey).getData();
      }

  /**
   * Create an API key with a given name.
   * ## Overview Creates an API key ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param apiKey  (optional)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiKeyResponse> createAPIKeyWithHttpInfo(ApiKey apiKey) throws ApiException {
    Object localVarPostBody = apiKey;
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an application key with a given name.
   * ## Overview Create an application key with a given name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param applicationKey  (optional)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
   */
  public ApplicationKeyResponse createApplicationKey(ApplicationKey applicationKey) throws ApiException {
    return createApplicationKeyWithHttpInfo(applicationKey).getData();
      }

  /**
   * Create an application key with a given name.
   * ## Overview Create an application key with a given name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param applicationKey  (optional)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicationKeyResponse> createApplicationKeyWithHttpInfo(ApplicationKey applicationKey) throws ApiException {
    Object localVarPostBody = applicationKey;
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a given API key.
   * ## Overview Delete a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param apiKey The specific API key you are working with (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiKeyResponse deleteAPIKey(String apiKey) throws ApiException {
    return deleteAPIKeyWithHttpInfo(apiKey).getData();
      }

  /**
   * Delete a given API key.
   * ## Overview Delete a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param apiKey The specific API key you are working with (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiKeyResponse> deleteAPIKeyWithHttpInfo(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{api_key}"
      .replaceAll("\\{" + "api_key" + "\\}", apiClient.escapeString(apiKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a given application key.
   * ## Overview Delete a given application key. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param appKey The specific APP key you are working with (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApplicationKeyResponse deleteApplicationKey(String appKey) throws ApiException {
    return deleteApplicationKeyWithHttpInfo(appKey).getData();
      }

  /**
   * Delete a given application key.
   * ## Overview Delete a given application key. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param appKey The specific APP key you are working with (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicationKeyResponse> deleteApplicationKeyWithHttpInfo(String appKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling deleteApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{app_key}"
      .replaceAll("\\{" + "app_key" + "\\}", apiClient.escapeString(appKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Edit an API key name.
   * ## Overview Edit an API key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param apiKey The specific API key you are working with (required)
   * @param apiKey  (optional)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiKeyResponse editAPIKey(String apiKey, ApiKey apiKey) throws ApiException {
    return editAPIKeyWithHttpInfo(apiKey, apiKey).getData();
      }

  /**
   * Edit an API key name.
   * ## Overview Edit an API key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param apiKey The specific API key you are working with (required)
   * @param apiKey  (optional)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiKeyResponse> editAPIKeyWithHttpInfo(String apiKey, ApiKey apiKey) throws ApiException {
    Object localVarPostBody = apiKey;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling editAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{api_key}"
      .replaceAll("\\{" + "api_key" + "\\}", apiClient.escapeString(apiKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Edit an application key name.
   * ## Overview Edit an application key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param appKey The specific APP key you are working with (required)
   * @param applicationKey  (optional)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApplicationKeyResponse editApplicationKey(String appKey, ApplicationKey applicationKey) throws ApiException {
    return editApplicationKeyWithHttpInfo(appKey, applicationKey).getData();
      }

  /**
   * Edit an application key name.
   * ## Overview Edit an application key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param appKey The specific APP key you are working with (required)
   * @param applicationKey  (optional)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicationKeyResponse> editApplicationKeyWithHttpInfo(String appKey, ApplicationKey applicationKey) throws ApiException {
    Object localVarPostBody = applicationKey;
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling editApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{app_key}"
      .replaceAll("\\{" + "app_key" + "\\}", apiClient.escapeString(appKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a given API key.
   * ## Overview Get a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param apiKey The specific API key you are working with (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiKeyResponse getAPIKey(String apiKey) throws ApiException {
    return getAPIKeyWithHttpInfo(apiKey).getData();
      }

  /**
   * Get a given API key.
   * ## Overview Get a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param apiKey The specific API key you are working with (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiKeyResponse> getAPIKeyWithHttpInfo(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{api_key}"
      .replaceAll("\\{" + "api_key" + "\\}", apiClient.escapeString(apiKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all API keys available for your account.
   * ## Overview Get all API keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @return ApiKeyListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiKeyListResponse getAllAPIKeys() throws ApiException {
    return getAllAPIKeysWithHttpInfo().getData();
      }

  /**
   * Get all API keys available for your account.
   * ## Overview Get all API keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @return ApiResponse&lt;ApiKeyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiKeyListResponse> getAllAPIKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApiKeyListResponse> localVarReturnType = new GenericType<ApiKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all application keys available for your account.
   * ## Overview Get all application keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @return ApplicationKeyListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApplicationKeyListResponse getAllApplicationKeys() throws ApiException {
    return getAllApplicationKeysWithHttpInfo().getData();
      }

  /**
   * Get all application keys available for your account.
   * ## Overview Get all application keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @return ApiResponse&lt;ApplicationKeyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicationKeyListResponse> getAllApplicationKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApplicationKeyListResponse> localVarReturnType = new GenericType<ApplicationKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a given application key.
   * ## Overview Get a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param appKey The specific APP key you are working with (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApplicationKeyResponse getApplicationKey(String appKey) throws ApiException {
    return getApplicationKeyWithHttpInfo(appKey).getData();
      }

  /**
   * Get a given application key.
   * ## Overview Get a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param appKey The specific APP key you are working with (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicationKeyResponse> getApplicationKeyWithHttpInfo(String appKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling getApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{app_key}"
      .replaceAll("\\{" + "app_key" + "\\}", apiClient.escapeString(appKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
