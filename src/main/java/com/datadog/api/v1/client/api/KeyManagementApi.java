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
import java.util.concurrent.CompletableFuture;
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
   * Create an API key
   *
   * <p>See {@link #createAPIKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponse createAPIKey(ApiKey body) throws ApiException {
    return createAPIKeyWithHttpInfo(body).getData();
  }

  public CompletableFuture<ApiKeyResponse> createAPIKeyAsync(ApiKey body) {
    return createAPIKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an API key
   *
   * <p>Creates an API key with a given name.
   *
   * @param body (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
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
  public ApiResponse<ApiKeyResponse> createAPIKeyWithHttpInfo(ApiKey body) throws ApiException {
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

  /**
   * Create an API key
   *
   * <p>See {@link #createAPIKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyResponse>> createAPIKeyWithHttpInfoAsync(ApiKey body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createAPIKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Create an application key
   *
   * <p>See {@link #createApplicationKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse createApplicationKey(ApplicationKey body) throws ApiException {
    return createApplicationKeyWithHttpInfo(body).getData();
  }

  public CompletableFuture<ApplicationKeyResponse> createApplicationKeyAsync(ApplicationKey body) {
    return createApplicationKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an application key
   *
   * <p>Create an application key with a given name.
   *
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> createApplicationKeyWithHttpInfo(ApplicationKey body)
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

  /**
   * Create an application key
   *
   * <p>See {@link #createApplicationKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      createApplicationKeyWithHttpInfoAsync(ApplicationKey body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createApplicationKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Delete an API key
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponse deleteAPIKey(String key) throws ApiException {
    return deleteAPIKeyWithHttpInfo(key).getData();
  }

  public CompletableFuture<ApiKeyResponse> deleteAPIKeyAsync(String key) {
    return deleteAPIKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an API key
   *
   * <p>Delete a given API key.
   *
   * @param key The specific API key you are working with. (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApiKeyResponse> deleteAPIKeyWithHttpInfo(String key) throws ApiException {
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

  /**
   * Delete an API key
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyResponse>> deleteAPIKeyWithHttpInfoAsync(String key) {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'key' when calling deleteAPIKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Delete an application key
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse deleteApplicationKey(String key) throws ApiException {
    return deleteApplicationKeyWithHttpInfo(key).getData();
  }

  public CompletableFuture<ApplicationKeyResponse> deleteApplicationKeyAsync(String key) {
    return deleteApplicationKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an application key
   *
   * <p>Delete a given application key.
   *
   * @param key The specific APP key you are working with. (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> deleteApplicationKeyWithHttpInfo(String key)
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

  /**
   * Delete an application key
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      deleteApplicationKeyWithHttpInfoAsync(String key) {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'key' when calling deleteApplicationKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Get API key
   *
   * <p>See {@link #getAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponse getAPIKey(String key) throws ApiException {
    return getAPIKeyWithHttpInfo(key).getData();
  }

  public CompletableFuture<ApiKeyResponse> getAPIKeyAsync(String key) {
    return getAPIKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get API key
   *
   * <p>Get a given API key.
   *
   * @param key The specific API key you are working with. (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApiKeyResponse> getAPIKeyWithHttpInfo(String key) throws ApiException {
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

  /**
   * Get API key
   *
   * <p>See {@link #getAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyResponse>> getAPIKeyWithHttpInfoAsync(String key) {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'key' when calling getAPIKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Get an application key
   *
   * <p>See {@link #getApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse getApplicationKey(String key) throws ApiException {
    return getApplicationKeyWithHttpInfo(key).getData();
  }

  public CompletableFuture<ApplicationKeyResponse> getApplicationKeyAsync(String key) {
    return getApplicationKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an application key
   *
   * <p>Get a given application key.
   *
   * @param key The specific APP key you are working with. (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> getApplicationKeyWithHttpInfo(String key)
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

  /**
   * Get an application key
   *
   * <p>See {@link #getApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>> getApplicationKeyWithHttpInfoAsync(
      String key) {
    Object localVarPostBody = null;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'key' when calling getApplicationKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Get all API keys
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @return ApiKeyListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyListResponse listAPIKeys() throws ApiException {
    return listAPIKeysWithHttpInfo().getData();
  }

  public CompletableFuture<ApiKeyListResponse> listAPIKeysAsync() {
    return listAPIKeysWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all API keys
   *
   * <p>Get all API keys available for your account.
   *
   * @return ApiResponse&lt;ApiKeyListResponse&gt;
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
  public ApiResponse<ApiKeyListResponse> listAPIKeysWithHttpInfo() throws ApiException {
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

  /**
   * Get all API keys
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyListResponse>> listAPIKeysWithHttpInfoAsync() {
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Get all application keys
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @return ApplicationKeyListResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyListResponse listApplicationKeys() throws ApiException {
    return listApplicationKeysWithHttpInfo().getData();
  }

  public CompletableFuture<ApplicationKeyListResponse> listApplicationKeysAsync() {
    return listApplicationKeysWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all application keys
   *
   * <p>Get all application keys available for your Datadog account.
   *
   * @return ApiResponse&lt;ApplicationKeyListResponse&gt;
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
  public ApiResponse<ApplicationKeyListResponse> listApplicationKeysWithHttpInfo()
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

  /**
   * Get all application keys
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyListResponse>>
      listApplicationKeysWithHttpInfoAsync() {
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Edit an API key
   *
   * <p>See {@link #updateAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @param body (required)
   * @return ApiKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyResponse updateAPIKey(String key, ApiKey body) throws ApiException {
    return updateAPIKeyWithHttpInfo(key, body).getData();
  }

  public CompletableFuture<ApiKeyResponse> updateAPIKeyAsync(String key, ApiKey body) {
    return updateAPIKeyWithHttpInfoAsync(key, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an API key
   *
   * <p>Edit an API key name.
   *
   * @param key The specific API key you are working with. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApiKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApiKeyResponse> updateAPIKeyWithHttpInfo(String key, ApiKey body)
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

  /**
   * Edit an API key
   *
   * <p>See {@link #updateAPIKeyWithHttpInfo}.
   *
   * @param key The specific API key you are working with. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyResponse>> updateAPIKeyWithHttpInfoAsync(
      String key, ApiKey body) {
    Object localVarPostBody = body;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'key' when calling updateAPIKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateAPIKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Edit an application key
   *
   * <p>See {@link #updateApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse updateApplicationKey(String key, ApplicationKey body)
      throws ApiException {
    return updateApplicationKeyWithHttpInfo(key, body).getData();
  }

  public CompletableFuture<ApplicationKeyResponse> updateApplicationKeyAsync(
      String key, ApplicationKey body) {
    return updateApplicationKeyWithHttpInfoAsync(key, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an application key
   *
   * <p>Edit an application key name.
   *
   * @param key The specific APP key you are working with. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> updateApplicationKeyWithHttpInfo(
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

  /**
   * Edit an application key
   *
   * <p>See {@link #updateApplicationKeyWithHttpInfo}.
   *
   * @param key The specific APP key you are working with. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      updateApplicationKeyWithHttpInfoAsync(String key, ApplicationKey body) {
    Object localVarPostBody = body;

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'key' when calling updateApplicationKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateApplicationKey"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
}
