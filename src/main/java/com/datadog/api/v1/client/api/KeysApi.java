package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.ApiKey;
import com.datadog.api.v1.client.model.ApiKeyListResponse;
import com.datadog.api.v1.client.model.ApiKeyResponse;
import com.datadog.api.v1.client.model.ApplicationKey;
import com.datadog.api.v1.client.model.ApplicationKeyListResponse;
import com.datadog.api.v1.client.model.ApplicationKeyResponse;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error404;
import com.datadog.api.v1.client.model.Error409;

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

private ApiResponse<ApiKeyResponse> createAPIKeyWithHttpInfo(ApiKey apiKey) throws ApiException {
    Object localVarPostBody = apiKey;
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key";

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateAPIKeyRequest {
    private ApiKey apiKey;

    private APIcreateAPIKeyRequest(ApiKey apiKey) {
      this.apiKey = apiKey;
    }
    

    /**
     * Execute createAPIKey request
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
    
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAPIKey request with HTTP info returned
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
    
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return createAPIKeyWithHttpInfo(apiKey);
    }
  }

  /**
   * Create an API key with a given name.
   * ## Overview Creates an API key ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param apiKey  (require)
   * @return createAPIKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateAPIKeyRequest createAPIKey(ApiKey apiKey) throws ApiException {
    return new APIcreateAPIKeyRequest(apiKey);
  }

private ApiResponse<ApplicationKeyResponse> createApplicationKeyWithHttpInfo(ApplicationKey applicationKey) throws ApiException {
    Object localVarPostBody = applicationKey;
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key";

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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateApplicationKeyRequest {
    private ApplicationKey applicationKey;

    private APIcreateApplicationKeyRequest(ApplicationKey applicationKey) {
      this.applicationKey = applicationKey;
    }
    

    /**
     * Execute createApplicationKey request
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
    
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createApplicationKey request with HTTP info returned
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
    
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return createApplicationKeyWithHttpInfo(applicationKey);
    }
  }

  /**
   * Create an application key with a given name.
   * ## Overview Create an application key with a given name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param applicationKey  (require)
   * @return createApplicationKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateApplicationKeyRequest createApplicationKey(ApplicationKey applicationKey) throws ApiException {
    return new APIcreateApplicationKeyRequest(applicationKey);
  }

private ApiResponse<ApiKeyResponse> deleteAPIKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAPIKeyRequest {
    private String key;

    private APIdeleteAPIKeyRequest(String key) {
      this.key = key;
    }
    

    /**
     * Execute deleteAPIKey request
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
    
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAPIKey request with HTTP info returned
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
    
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return deleteAPIKeyWithHttpInfo(key);
    }
  }

  /**
   * Delete a given API key.
   * ## Overview Delete a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param key The specific API key you are working with (required)
   
   * @return deleteAPIKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteAPIKeyRequest deleteAPIKey(String key) throws ApiException {
    return new APIdeleteAPIKeyRequest(key);
  }

private ApiResponse<ApplicationKeyResponse> deleteApplicationKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteApplicationKeyRequest {
    private String key;

    private APIdeleteApplicationKeyRequest(String key) {
      this.key = key;
    }
    

    /**
     * Execute deleteApplicationKey request
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
    
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteApplicationKey request with HTTP info returned
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
    
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return deleteApplicationKeyWithHttpInfo(key);
    }
  }

  /**
   * Delete a given application key.
   * ## Overview Delete a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param key The specific APP key you are working with (required)
   
   * @return deleteApplicationKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteApplicationKeyRequest deleteApplicationKey(String key) throws ApiException {
    return new APIdeleteApplicationKeyRequest(key);
  }

private ApiResponse<ApiKeyResponse> editAPIKeyWithHttpInfo(String key, ApiKey apiKey) throws ApiException {
    Object localVarPostBody = apiKey;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling editAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIeditAPIKeyRequest {
    private String key;
    private ApiKey apiKey;

    private APIeditAPIKeyRequest(String key, ApiKey apiKey) {
      this.key = key;
      this.apiKey = apiKey;
    }
    

    /**
     * Execute editAPIKey request
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
    
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute editAPIKey request with HTTP info returned
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
    
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return editAPIKeyWithHttpInfo(key, apiKey);
    }
  }

  /**
   * Edit an API key name.
   * ## Overview Edit an API key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
   * @param key The specific API key you are working with (required)
   * @param apiKey  (require)
   * @return editAPIKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIeditAPIKeyRequest editAPIKey(String key, ApiKey apiKey) throws ApiException {
    return new APIeditAPIKeyRequest(key, apiKey);
  }

private ApiResponse<ApplicationKeyResponse> editApplicationKeyWithHttpInfo(String key, ApplicationKey applicationKey) throws ApiException {
    Object localVarPostBody = applicationKey;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling editApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIeditApplicationKeyRequest {
    private String key;
    private ApplicationKey applicationKey;

    private APIeditApplicationKeyRequest(String key, ApplicationKey applicationKey) {
      this.key = key;
      this.applicationKey = applicationKey;
    }
    

    /**
     * Execute editApplicationKey request
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
    
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute editApplicationKey request with HTTP info returned
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
    
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return editApplicationKeyWithHttpInfo(key, applicationKey);
    }
  }

  /**
   * Edit an application key name.
   * ## Overview Edit an application key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
   * @param key The specific APP key you are working with (required)
   * @param applicationKey  (require)
   * @return editApplicationKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIeditApplicationKeyRequest editApplicationKey(String key, ApplicationKey applicationKey) throws ApiException {
    return new APIeditApplicationKeyRequest(key, applicationKey);
  }

private ApiResponse<ApiKeyResponse> getAPIKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAPIKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApiKeyResponse> localVarReturnType = new GenericType<ApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAPIKeyRequest {
    private String key;

    private APIgetAPIKeyRequest(String key) {
      this.key = key;
    }
    

    /**
     * Execute getAPIKey request
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
    
    public ApiKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAPIKey request with HTTP info returned
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
    
    public ApiResponse<ApiKeyResponse> executeWithHttpInfo() throws ApiException {
      return getAPIKeyWithHttpInfo(key);
    }
  }

  /**
   * Get a given API key.
   * ## Overview Get a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param key The specific API key you are working with (required)
   
   * @return getAPIKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAPIKeyRequest getAPIKey(String key) throws ApiException {
    return new APIgetAPIKeyRequest(key);
  }

private ApiResponse<ApiKeyListResponse> getAllAPIKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/api_key";

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

    GenericType<ApiKeyListResponse> localVarReturnType = new GenericType<ApiKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllAPIKeysRequest {

    private APIgetAllAPIKeysRequest() {
    }
    

    /**
     * Execute getAllAPIKeys request
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
    
    public ApiKeyListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllAPIKeys request with HTTP info returned
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
    
    public ApiResponse<ApiKeyListResponse> executeWithHttpInfo() throws ApiException {
      return getAllAPIKeysWithHttpInfo();
    }
  }

  /**
   * Get all API keys available for your account.
   * ## Overview Get all API keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   
   * @return getAllAPIKeysRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllAPIKeysRequest getAllAPIKeys() throws ApiException {
    return new APIgetAllAPIKeysRequest();
  }

private ApiResponse<ApplicationKeyListResponse> getAllApplicationKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key";

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

    GenericType<ApplicationKeyListResponse> localVarReturnType = new GenericType<ApplicationKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllApplicationKeysRequest {

    private APIgetAllApplicationKeysRequest() {
    }
    

    /**
     * Execute getAllApplicationKeys request
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
    
    public ApplicationKeyListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllApplicationKeys request with HTTP info returned
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
    
    public ApiResponse<ApplicationKeyListResponse> executeWithHttpInfo() throws ApiException {
      return getAllApplicationKeysWithHttpInfo();
    }
  }

  /**
   * Get all application keys available for your account.
   * ## Overview Get all application keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
   
   * @return getAllApplicationKeysRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllApplicationKeysRequest getAllApplicationKeys() throws ApiException {
    return new APIgetAllApplicationKeysRequest();
  }

private ApiResponse<ApplicationKeyResponse> getApplicationKeyWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getApplicationKey");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/application_key/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<ApplicationKeyResponse> localVarReturnType = new GenericType<ApplicationKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetApplicationKeyRequest {
    private String key;

    private APIgetApplicationKeyRequest(String key) {
      this.key = key;
    }
    

    /**
     * Execute getApplicationKey request
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
    
    public ApplicationKeyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getApplicationKey request with HTTP info returned
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
    
    public ApiResponse<ApplicationKeyResponse> executeWithHttpInfo() throws ApiException {
      return getApplicationKeyWithHttpInfo(key);
    }
  }

  /**
   * Get a given application key.
   * ## Overview Get a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
   * @param key The specific APP key you are working with (required)
   
   * @return getApplicationKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetApplicationKeyRequest getApplicationKey(String key) throws ApiException {
    return new APIgetApplicationKeyRequest(key);
  }
}
