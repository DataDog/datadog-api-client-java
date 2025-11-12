package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.ApiKey;
import com.datadog.api.client.v1.model.ApiKeyListResponse;
import com.datadog.api.client.v1.model.ApiKeyResponse;
import com.datadog.api.client.v1.model.ApplicationKey;
import com.datadog.api.client.v1.model.ApplicationKeyListResponse;
import com.datadog.api.client.v1.model.ApplicationKeyResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class KeyManagementApi {
  private ApiClient apiClient;

  public KeyManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public KeyManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an API key.
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

  /**
   * Create an API key.
   *
   * <p>See {@link #createAPIKeyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiKeyResponse&gt;
   */
  public CompletableFuture<ApiKeyResponse> createAPIKeyAsync(ApiKey body) {
    return createAPIKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates an API key with a given name.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.createAPIKey",
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Create an API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.createAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Create an application key.
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

  /**
   * Create an application key.
   *
   * <p>See {@link #createApplicationKeyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> createApplicationKeyAsync(ApplicationKey body) {
    return createApplicationKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an application key with a given name. This endpoint is disabled for organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.createApplicationKey",
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Create an application key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.createApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Delete an API key.
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

  /**
   * Delete an API key.
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfoAsync}.
   *
   * @param key The specific API key you are working with. (required)
   * @return CompletableFuture&lt;ApiKeyResponse&gt;
   */
  public CompletableFuture<ApiKeyResponse> deleteAPIKeyAsync(String key) {
    return deleteAPIKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a given API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.deleteAPIKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Delete an API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.deleteAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Delete an application key.
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

  /**
   * Delete an application key.
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfoAsync}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> deleteApplicationKeyAsync(String key) {
    return deleteApplicationKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a given application key. This endpoint is disabled for organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.deleteApplicationKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Delete an application key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.deleteApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Get API key.
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

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfoAsync}.
   *
   * @param key The specific API key you are working with. (required)
   * @return CompletableFuture&lt;ApiKeyResponse&gt;
   */
  public CompletableFuture<ApiKeyResponse> getAPIKeyAsync(String key) {
    return getAPIKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a given API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.getAPIKey",
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Get API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.getAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Get an application key.
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

  /**
   * Get an application key.
   *
   * <p>See {@link #getApplicationKeyWithHttpInfoAsync}.
   *
   * @param key The specific APP key you are working with. (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> getApplicationKeyAsync(String key) {
    return getApplicationKeyWithHttpInfoAsync(key)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a given application key. This endpoint is disabled for organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.getApplicationKey",
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Get an application key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.getApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @return ApiKeyListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiKeyListResponse listAPIKeys() throws ApiException {
    return listAPIKeysWithHttpInfo().getData();
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApiKeyListResponse&gt;
   */
  public CompletableFuture<ApiKeyListResponse> listAPIKeysAsync() {
    return listAPIKeysWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all API keys available for your account.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.listAPIKeys",
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
        new GenericType<ApiKeyListResponse>() {});
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApiKeyListResponse>> listAPIKeysWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/api_key";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.listAPIKeys",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApiKeyListResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApiKeyListResponse>() {});
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @return ApplicationKeyListResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyListResponse listApplicationKeys() throws ApiException {
    return listApplicationKeysWithHttpInfo().getData();
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApplicationKeyListResponse&gt;
   */
  public CompletableFuture<ApplicationKeyListResponse> listApplicationKeysAsync() {
    return listApplicationKeysWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all application keys available for your Datadog account. This endpoint is disabled for
   * organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.listApplicationKeys",
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
        new GenericType<ApplicationKeyListResponse>() {});
  }

  /**
   * Get all application keys.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.listApplicationKeys",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyListResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApplicationKeyListResponse>() {});
  }

  /**
   * Edit an API key.
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

  /**
   * Edit an API key.
   *
   * <p>See {@link #updateAPIKeyWithHttpInfoAsync}.
   *
   * @param key The specific API key you are working with. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiKeyResponse&gt;
   */
  public CompletableFuture<ApiKeyResponse> updateAPIKeyAsync(String key, ApiKey body) {
    return updateAPIKeyWithHttpInfoAsync(key, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an API key name.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.updateAPIKey",
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Edit an API key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.updateAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApiKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApiKeyResponse>() {});
  }

  /**
   * Edit an application key.
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

  /**
   * Edit an application key.
   *
   * <p>See {@link #updateApplicationKeyWithHttpInfoAsync}.
   *
   * @param key The specific APP key you are working with. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> updateApplicationKeyAsync(
      String key, ApplicationKey body) {
    return updateApplicationKeyWithHttpInfoAsync(key, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an application key name. This endpoint is disabled for organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.KeyManagementApi.updateApplicationKey",
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Edit an application key.
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.KeyManagementApi.updateApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApplicationKeyResponse>() {});
  }
}
