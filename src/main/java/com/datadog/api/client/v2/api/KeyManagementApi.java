package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.APIKeyCreateRequest;
import com.datadog.api.client.v2.model.APIKeyResponse;
import com.datadog.api.client.v2.model.APIKeyUpdateRequest;
import com.datadog.api.client.v2.model.APIKeysResponse;
import com.datadog.api.client.v2.model.APIKeysSort;
import com.datadog.api.client.v2.model.ApplicationKeyCreateRequest;
import com.datadog.api.client.v2.model.ApplicationKeyResponse;
import com.datadog.api.client.v2.model.ApplicationKeyUpdateRequest;
import com.datadog.api.client.v2.model.ApplicationKeysSort;
import com.datadog.api.client.v2.model.ListApplicationKeysResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenCreateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokenGetResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokenUpdateRequest;
import com.datadog.api.client.v2.model.PersonalAccessTokensListResponse;
import com.datadog.api.client.v2.model.PersonalAccessTokensSort;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeyResponse createAPIKey(APIKeyCreateRequest body) throws ApiException {
    return createAPIKeyWithHttpInfo(body).getData();
  }

  /**
   * Create an API key.
   *
   * <p>See {@link #createAPIKeyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;APIKeyResponse&gt;
   */
  public CompletableFuture<APIKeyResponse> createAPIKeyAsync(APIKeyCreateRequest body) {
    return createAPIKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an API key.
   *
   * @param body (required)
   * @return ApiResponse&lt;APIKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.createAPIKey",
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
        new GenericType<APIKeyResponse>() {});
  }

  /**
   * Create an API key.
   *
   * <p>See {@link #createAPIKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;APIKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<APIKeyResponse>> createAPIKeyWithHttpInfoAsync(
      APIKeyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createAPIKey"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/api_keys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.createAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<APIKeyResponse>() {});
  }

  /**
   * Create an application key for current user.
   *
   * <p>See {@link #createCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse createCurrentUserApplicationKey(ApplicationKeyCreateRequest body)
      throws ApiException {
    return createCurrentUserApplicationKeyWithHttpInfo(body).getData();
  }

  /**
   * Create an application key for current user.
   *
   * <p>See {@link #createCurrentUserApplicationKeyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> createCurrentUserApplicationKeyAsync(
      ApplicationKeyCreateRequest body) {
    return createCurrentUserApplicationKeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an application key for current user
   *
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.createCurrentUserApplicationKey",
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
   * Create an application key for current user.
   *
   * <p>See {@link #createCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      createCurrentUserApplicationKeyWithHttpInfoAsync(ApplicationKeyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createCurrentUserApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/current_user/application_keys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.createCurrentUserApplicationKey",
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
   * Create personal access token.
   *
   * <p>See {@link #createPersonalAccessTokenWithHttpInfo}.
   *
   * @param body (required)
   * @return PersonalAccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  public PersonalAccessTokenResponse createPersonalAccessToken(
      PersonalAccessTokenCreateRequest body) throws ApiException {
    return createPersonalAccessTokenWithHttpInfo(body).getData();
  }

  /**
   * Create personal access token.
   *
   * <p>See {@link #createPersonalAccessTokenWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;PersonalAccessTokenResponse&gt;
   */
  public CompletableFuture<PersonalAccessTokenResponse> createPersonalAccessTokenAsync(
      PersonalAccessTokenCreateRequest body) {
    return createPersonalAccessTokenWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new personal access token with fine-grained permissions. The token value will be
   * returned in the response and cannot be retrieved later. Be sure to save it securely.
   *
   * @param body (required)
   * @return ApiResponse&lt;PersonalAccessTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found - Personal access tokens feature is not enabled </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PersonalAccessTokenResponse> createPersonalAccessTokenWithHttpInfo(
      PersonalAccessTokenCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createPersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPersonalAccessToken");
    }
    // create path and map variables
    String localVarPath = "/api/v2/personal_access_tokens";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.createPersonalAccessToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PersonalAccessTokenResponse>() {});
  }

  /**
   * Create personal access token.
   *
   * <p>See {@link #createPersonalAccessTokenWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PersonalAccessTokenResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PersonalAccessTokenResponse>>
      createPersonalAccessTokenWithHttpInfoAsync(PersonalAccessTokenCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createPersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PersonalAccessTokenResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PersonalAccessTokenResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPersonalAccessToken"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/personal_access_tokens";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.createPersonalAccessToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PersonalAccessTokenResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<PersonalAccessTokenResponse>() {});
  }

  /**
   * Delete an API key.
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAPIKey(String apiKeyId) throws ApiException {
    deleteAPIKeyWithHttpInfo(apiKeyId);
  }

  /**
   * Delete an API key.
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfoAsync}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAPIKeyAsync(String apiKeyId) {
    return deleteAPIKeyWithHttpInfoAsync(apiKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.deleteAPIKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete an API key.
   *
   * <p>See {@link #deleteAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAPIKeyWithHttpInfoAsync(String apiKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'apiKeyId' when calling deleteAPIKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.deleteAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Delete an application key.
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationKey(String appKeyId) throws ApiException {
    deleteApplicationKeyWithHttpInfo(appKeyId);
  }

  /**
   * Delete an application key.
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApplicationKeyAsync(String appKeyId) {
    return deleteApplicationKeyWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an application key
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.deleteApplicationKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete an application key.
   *
   * <p>See {@link #deleteApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteApplicationKeyWithHttpInfoAsync(
      String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling deleteApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.deleteApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Delete an application key owned by current user.
   *
   * <p>See {@link #deleteCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCurrentUserApplicationKey(String appKeyId) throws ApiException {
    deleteCurrentUserApplicationKeyWithHttpInfo(appKeyId);
  }

  /**
   * Delete an application key owned by current user.
   *
   * <p>See {@link #deleteCurrentUserApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCurrentUserApplicationKeyAsync(String appKeyId) {
    return deleteCurrentUserApplicationKeyWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an application key owned by current user
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.deleteCurrentUserApplicationKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete an application key owned by current user.
   *
   * <p>See {@link #deleteCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCurrentUserApplicationKeyWithHttpInfoAsync(
      String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " deleteCurrentUserApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.deleteCurrentUserApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /** Manage optional parameters to getAPIKey. */
  public static class GetAPIKeyOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are <code>created_by</code> and <code>modified_by
     *     </code>. (optional)
     * @return GetAPIKeyOptionalParameters
     */
    public GetAPIKeyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeyResponse getAPIKey(String apiKeyId) throws ApiException {
    return getAPIKeyWithHttpInfo(apiKeyId, new GetAPIKeyOptionalParameters()).getData();
  }

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfoAsync}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @return CompletableFuture&lt;APIKeyResponse&gt;
   */
  public CompletableFuture<APIKeyResponse> getAPIKeyAsync(String apiKeyId) {
    return getAPIKeyWithHttpInfoAsync(apiKeyId, new GetAPIKeyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeyResponse getAPIKey(String apiKeyId, GetAPIKeyOptionalParameters parameters)
      throws ApiException {
    return getAPIKeyWithHttpInfo(apiKeyId, parameters).getData();
  }

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfoAsync}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;APIKeyResponse&gt;
   */
  public CompletableFuture<APIKeyResponse> getAPIKeyAsync(
      String apiKeyId, GetAPIKeyOptionalParameters parameters) {
    return getAPIKeyWithHttpInfoAsync(apiKeyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;APIKeyResponse&gt;
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.getAPIKey",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<APIKeyResponse>() {});
  }

  /**
   * Get API key.
   *
   * <p>See {@link #getAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;APIKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<APIKeyResponse>> getAPIKeyWithHttpInfoAsync(
      String apiKeyId, GetAPIKeyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'apiKeyId' when calling getAPIKey"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.getAPIKey",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<APIKeyResponse>() {});
  }

  /** Manage optional parameters to getApplicationKey. */
  public static class GetApplicationKeyOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Resource path for related resources to include in the response. Only <code>
     *     owned_by</code> is supported. (optional)
     * @return GetApplicationKeyOptionalParameters
     */
    public GetApplicationKeyOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get an application key.
   *
   * <p>See {@link #getApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse getApplicationKey(String appKeyId) throws ApiException {
    return getApplicationKeyWithHttpInfo(appKeyId, new GetApplicationKeyOptionalParameters())
        .getData();
  }

  /**
   * Get an application key.
   *
   * <p>See {@link #getApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> getApplicationKeyAsync(String appKeyId) {
    return getApplicationKeyWithHttpInfoAsync(appKeyId, new GetApplicationKeyOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an application key.
   *
   * <p>See {@link #getApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse getApplicationKey(
      String appKeyId, GetApplicationKeyOptionalParameters parameters) throws ApiException {
    return getApplicationKeyWithHttpInfo(appKeyId, parameters).getData();
  }

  /**
   * Get an application key.
   *
   * <p>See {@link #getApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> getApplicationKeyAsync(
      String appKeyId, GetApplicationKeyOptionalParameters parameters) {
    return getApplicationKeyWithHttpInfoAsync(appKeyId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an application key for your org.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.getApplicationKey",
            localVarPath,
            localVarQueryParams,
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
   * @param appKeyId The ID of the application key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>> getApplicationKeyWithHttpInfoAsync(
      String appKeyId, GetApplicationKeyOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling getApplicationKey"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.getApplicationKey",
              localVarPath,
              localVarQueryParams,
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
   * Get one application key owned by current user.
   *
   * <p>See {@link #getCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse getCurrentUserApplicationKey(String appKeyId) throws ApiException {
    return getCurrentUserApplicationKeyWithHttpInfo(appKeyId).getData();
  }

  /**
   * Get one application key owned by current user.
   *
   * <p>See {@link #getCurrentUserApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> getCurrentUserApplicationKeyAsync(
      String appKeyId) {
    return getCurrentUserApplicationKeyWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an application key owned by current user. The <code>key</code> field is not returned for
   * organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
   *
   * @param appKeyId The ID of the application key. (required)
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.getCurrentUserApplicationKey",
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
   * Get one application key owned by current user.
   *
   * <p>See {@link #getCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      getCurrentUserApplicationKeyWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " getCurrentUserApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.getCurrentUserApplicationKey",
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
   * Get personal access token.
   *
   * <p>See {@link #getPersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return PersonalAccessTokenGetResponse
   * @throws ApiException if fails to make API call
   */
  public PersonalAccessTokenGetResponse getPersonalAccessToken(UUID patUuid) throws ApiException {
    return getPersonalAccessTokenWithHttpInfo(patUuid).getData();
  }

  /**
   * Get personal access token.
   *
   * <p>See {@link #getPersonalAccessTokenWithHttpInfoAsync}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return CompletableFuture&lt;PersonalAccessTokenGetResponse&gt;
   */
  public CompletableFuture<PersonalAccessTokenGetResponse> getPersonalAccessTokenAsync(
      UUID patUuid) {
    return getPersonalAccessTokenWithHttpInfoAsync(patUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific personal access token by UUID.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return ApiResponse&lt;PersonalAccessTokenGetResponse&gt;
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
  public ApiResponse<PersonalAccessTokenGetResponse> getPersonalAccessTokenWithHttpInfo(
      UUID patUuid) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getPersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'patUuid' when calling getPersonalAccessToken");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.getPersonalAccessToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PersonalAccessTokenGetResponse>() {});
  }

  /**
   * Get personal access token.
   *
   * <p>See {@link #getPersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PersonalAccessTokenGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>>
      getPersonalAccessTokenWithHttpInfoAsync(UUID patUuid) {
    // Check if unstable operation is enabled
    String operationId = "getPersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'patUuid' when calling getPersonalAccessToken"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.getPersonalAccessToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<PersonalAccessTokenGetResponse>() {});
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
    private Boolean filterRemoteConfigReadEnabled;
    private String filterCategory;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort API key attribute used to sort results. Sort order is ascending by default. In
     *     order to specify a descending sort, prefix the attribute with a minus sign. (optional,
     *     default to "name")
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters sort(APIKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter API keys by the specified string. (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart.
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
     * Set filterCreatedAtEnd.
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
     * Set filterModifiedAtStart.
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
     * Set filterModifiedAtEnd.
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
     * Set include.
     *
     * @param include Comma separated list of resource paths for related resources to include in the
     *     response. Supported resource paths are <code>created_by</code> and <code>modified_by
     *     </code>. (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterRemoteConfigReadEnabled.
     *
     * @param filterRemoteConfigReadEnabled Filter API keys by remote config read enabled status.
     *     (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterRemoteConfigReadEnabled(
        Boolean filterRemoteConfigReadEnabled) {
      this.filterRemoteConfigReadEnabled = filterRemoteConfigReadEnabled;
      return this;
    }

    /**
     * Set filterCategory.
     *
     * @param filterCategory Filter API keys by category. (optional)
     * @return ListAPIKeysOptionalParameters
     */
    public ListAPIKeysOptionalParameters filterCategory(String filterCategory) {
      this.filterCategory = filterCategory;
      return this;
    }
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @return APIKeysResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeysResponse listAPIKeys() throws ApiException {
    return listAPIKeysWithHttpInfo(new ListAPIKeysOptionalParameters()).getData();
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;APIKeysResponse&gt;
   */
  public CompletableFuture<APIKeysResponse> listAPIKeysAsync() {
    return listAPIKeysWithHttpInfoAsync(new ListAPIKeysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return APIKeysResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeysResponse listAPIKeys(ListAPIKeysOptionalParameters parameters) throws ApiException {
    return listAPIKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;APIKeysResponse&gt;
   */
  public CompletableFuture<APIKeysResponse> listAPIKeysAsync(
      ListAPIKeysOptionalParameters parameters) {
    return listAPIKeysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all API keys available for your account.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;APIKeysResponse&gt;
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
    Boolean filterRemoteConfigReadEnabled = parameters.filterRemoteConfigReadEnabled;
    String filterCategory = parameters.filterCategory;
    // create path and map variables
    String localVarPath = "/api/v2/api_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[remote_config_read_enabled]", filterRemoteConfigReadEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[category]", filterCategory));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.listAPIKeys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<APIKeysResponse>() {});
  }

  /**
   * Get all API keys.
   *
   * <p>See {@link #listAPIKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;APIKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<APIKeysResponse>> listAPIKeysWithHttpInfoAsync(
      ListAPIKeysOptionalParameters parameters) {
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
    Boolean filterRemoteConfigReadEnabled = parameters.filterRemoteConfigReadEnabled;
    String filterCategory = parameters.filterCategory;
    // create path and map variables
    String localVarPath = "/api/v2/api_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[remote_config_read_enabled]", filterRemoteConfigReadEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[category]", filterCategory));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.listAPIKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<APIKeysResponse>> result = new CompletableFuture<>();
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
        new GenericType<APIKeysResponse>() {});
  }

  /** Manage optional parameters to listApplicationKeys. */
  public static class ListApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to "name")
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart.
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
     * Set filterCreatedAtEnd.
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters filterCreatedAtEnd(String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Resource path for related resources to include in the response. Only <code>
     *     owned_by</code> is supported. (optional)
     * @return ListApplicationKeysOptionalParameters
     */
    public ListApplicationKeysOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listApplicationKeys() throws ApiException {
    return listApplicationKeysWithHttpInfo(new ListApplicationKeysOptionalParameters()).getData();
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listApplicationKeysAsync() {
    return listApplicationKeysWithHttpInfoAsync(new ListApplicationKeysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listApplicationKeys(
      ListApplicationKeysOptionalParameters parameters) throws ApiException {
    return listApplicationKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listApplicationKeysAsync(
      ListApplicationKeysOptionalParameters parameters) {
    return listApplicationKeysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all application keys available for your org
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
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
  public ApiResponse<ListApplicationKeysResponse> listApplicationKeysWithHttpInfo(
      ListApplicationKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/application_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.listApplicationKeys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /**
   * Get all application keys.
   *
   * <p>See {@link #listApplicationKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListApplicationKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListApplicationKeysResponse>>
      listApplicationKeysWithHttpInfoAsync(ListApplicationKeysOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/application_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.listApplicationKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListApplicationKeysResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /** Manage optional parameters to listCurrentUserApplicationKeys. */
  public static class ListCurrentUserApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to "name")
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart.
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
     * Set filterCreatedAtEnd.
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

    /**
     * Set include.
     *
     * @param include Resource path for related resources to include in the response. Only <code>
     *     owned_by</code> is supported. (optional)
     * @return ListCurrentUserApplicationKeysOptionalParameters
     */
    public ListCurrentUserApplicationKeysOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get all application keys owned by current user.
   *
   * <p>See {@link #listCurrentUserApplicationKeysWithHttpInfo}.
   *
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listCurrentUserApplicationKeys() throws ApiException {
    return listCurrentUserApplicationKeysWithHttpInfo(
            new ListCurrentUserApplicationKeysOptionalParameters())
        .getData();
  }

  /**
   * Get all application keys owned by current user.
   *
   * <p>See {@link #listCurrentUserApplicationKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listCurrentUserApplicationKeysAsync() {
    return listCurrentUserApplicationKeysWithHttpInfoAsync(
            new ListCurrentUserApplicationKeysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all application keys owned by current user.
   *
   * <p>See {@link #listCurrentUserApplicationKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listCurrentUserApplicationKeys(
      ListCurrentUserApplicationKeysOptionalParameters parameters) throws ApiException {
    return listCurrentUserApplicationKeysWithHttpInfo(parameters).getData();
  }

  /**
   * Get all application keys owned by current user.
   *
   * <p>See {@link #listCurrentUserApplicationKeysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listCurrentUserApplicationKeysAsync(
      ListCurrentUserApplicationKeysOptionalParameters parameters) {
    return listCurrentUserApplicationKeysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all application keys available for current user
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
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
  public ApiResponse<ListApplicationKeysResponse> listCurrentUserApplicationKeysWithHttpInfo(
      ListCurrentUserApplicationKeysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/current_user/application_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.listCurrentUserApplicationKeys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /**
   * Get all application keys owned by current user.
   *
   * <p>See {@link #listCurrentUserApplicationKeysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListApplicationKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListApplicationKeysResponse>>
      listCurrentUserApplicationKeysWithHttpInfoAsync(
          ListCurrentUserApplicationKeysOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/current_user/application_keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.listCurrentUserApplicationKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListApplicationKeysResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /** Manage optional parameters to listPersonalAccessTokens. */
  public static class ListPersonalAccessTokensOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private PersonalAccessTokensSort sort;
    private String filter;
    private List<UUID> filterOwnerUuid;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListPersonalAccessTokensOptionalParameters
     */
    public ListPersonalAccessTokensOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListPersonalAccessTokensOptionalParameters
     */
    public ListPersonalAccessTokensOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Personal access token attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to "name")
     * @return ListPersonalAccessTokensOptionalParameters
     */
    public ListPersonalAccessTokensOptionalParameters sort(PersonalAccessTokensSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter personal access tokens by name. (optional)
     * @return ListPersonalAccessTokensOptionalParameters
     */
    public ListPersonalAccessTokensOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterOwnerUuid.
     *
     * @param filterOwnerUuid Filter personal access tokens by owner UUID. (optional)
     * @return ListPersonalAccessTokensOptionalParameters
     */
    public ListPersonalAccessTokensOptionalParameters filterOwnerUuid(List<UUID> filterOwnerUuid) {
      this.filterOwnerUuid = filterOwnerUuid;
      return this;
    }
  }

  /**
   * List personal access tokens.
   *
   * <p>See {@link #listPersonalAccessTokensWithHttpInfo}.
   *
   * @return PersonalAccessTokensListResponse
   * @throws ApiException if fails to make API call
   */
  public PersonalAccessTokensListResponse listPersonalAccessTokens() throws ApiException {
    return listPersonalAccessTokensWithHttpInfo(new ListPersonalAccessTokensOptionalParameters())
        .getData();
  }

  /**
   * List personal access tokens.
   *
   * <p>See {@link #listPersonalAccessTokensWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PersonalAccessTokensListResponse&gt;
   */
  public CompletableFuture<PersonalAccessTokensListResponse> listPersonalAccessTokensAsync() {
    return listPersonalAccessTokensWithHttpInfoAsync(
            new ListPersonalAccessTokensOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List personal access tokens.
   *
   * <p>See {@link #listPersonalAccessTokensWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return PersonalAccessTokensListResponse
   * @throws ApiException if fails to make API call
   */
  public PersonalAccessTokensListResponse listPersonalAccessTokens(
      ListPersonalAccessTokensOptionalParameters parameters) throws ApiException {
    return listPersonalAccessTokensWithHttpInfo(parameters).getData();
  }

  /**
   * List personal access tokens.
   *
   * <p>See {@link #listPersonalAccessTokensWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PersonalAccessTokensListResponse&gt;
   */
  public CompletableFuture<PersonalAccessTokensListResponse> listPersonalAccessTokensAsync(
      ListPersonalAccessTokensOptionalParameters parameters) {
    return listPersonalAccessTokensWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all personal access tokens in your organization. Supports filtering, pagination, and
   * sorting.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;PersonalAccessTokensListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found - Personal access tokens feature is not enabled </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PersonalAccessTokensListResponse> listPersonalAccessTokensWithHttpInfo(
      ListPersonalAccessTokensOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listPersonalAccessTokens";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    PersonalAccessTokensSort sort = parameters.sort;
    String filter = parameters.filter;
    List<UUID> filterOwnerUuid = parameters.filterOwnerUuid;
    // create path and map variables
    String localVarPath = "/api/v2/personal_access_tokens";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[owner_uuid]", filterOwnerUuid));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.listPersonalAccessTokens",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PersonalAccessTokensListResponse>() {});
  }

  /**
   * List personal access tokens.
   *
   * <p>See {@link #listPersonalAccessTokensWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PersonalAccessTokensListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PersonalAccessTokensListResponse>>
      listPersonalAccessTokensWithHttpInfoAsync(
          ListPersonalAccessTokensOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listPersonalAccessTokens";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PersonalAccessTokensListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    PersonalAccessTokensSort sort = parameters.sort;
    String filter = parameters.filter;
    List<UUID> filterOwnerUuid = parameters.filterOwnerUuid;
    // create path and map variables
    String localVarPath = "/api/v2/personal_access_tokens";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[owner_uuid]", filterOwnerUuid));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.listPersonalAccessTokens",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PersonalAccessTokensListResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<PersonalAccessTokensListResponse>() {});
  }

  /**
   * Revoke personal access token.
   *
   * <p>See {@link #revokePersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @throws ApiException if fails to make API call
   */
  public void revokePersonalAccessToken(UUID patUuid) throws ApiException {
    revokePersonalAccessTokenWithHttpInfo(patUuid);
  }

  /**
   * Revoke personal access token.
   *
   * <p>See {@link #revokePersonalAccessTokenWithHttpInfoAsync}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> revokePersonalAccessTokenAsync(UUID patUuid) {
    return revokePersonalAccessTokenWithHttpInfoAsync(patUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revoke a personal access token. Once revoked, the token can no longer be used to authenticate
   * API requests.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> revokePersonalAccessTokenWithHttpInfo(UUID patUuid) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "revokePersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'patUuid' when calling revokePersonalAccessToken");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.revokePersonalAccessToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Revoke personal access token.
   *
   * <p>See {@link #revokePersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> revokePersonalAccessTokenWithHttpInfoAsync(
      UUID patUuid) {
    // Check if unstable operation is enabled
    String operationId = "revokePersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'patUuid' when calling revokePersonalAccessToken"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.revokePersonalAccessToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Edit an API key.
   *
   * <p>See {@link #updateAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return APIKeyResponse
   * @throws ApiException if fails to make API call
   */
  public APIKeyResponse updateAPIKey(String apiKeyId, APIKeyUpdateRequest body)
      throws ApiException {
    return updateAPIKeyWithHttpInfo(apiKeyId, body).getData();
  }

  /**
   * Edit an API key.
   *
   * <p>See {@link #updateAPIKeyWithHttpInfoAsync}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;APIKeyResponse&gt;
   */
  public CompletableFuture<APIKeyResponse> updateAPIKeyAsync(
      String apiKeyId, APIKeyUpdateRequest body) {
    return updateAPIKeyWithHttpInfoAsync(apiKeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an API key.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return ApiResponse&lt;APIKeyResponse&gt;
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.updateAPIKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<APIKeyResponse>() {});
  }

  /**
   * Edit an API key.
   *
   * <p>See {@link #updateAPIKeyWithHttpInfo}.
   *
   * @param apiKeyId The ID of the API key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;APIKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<APIKeyResponse>> updateAPIKeyWithHttpInfoAsync(
      String apiKeyId, APIKeyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'apiKeyId' when calling updateAPIKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateAPIKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/api_keys/{api_key_id}"
            .replaceAll("\\{" + "api_key_id" + "\\}", apiClient.escapeString(apiKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.updateAPIKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<APIKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<APIKeyResponse>() {});
  }

  /**
   * Edit an application key.
   *
   * <p>See {@link #updateApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse updateApplicationKey(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    return updateApplicationKeyWithHttpInfo(appKeyId, body).getData();
  }

  /**
   * Edit an application key.
   *
   * <p>See {@link #updateApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> updateApplicationKeyAsync(
      String appKeyId, ApplicationKeyUpdateRequest body) {
    return updateApplicationKeyWithHttpInfoAsync(appKeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an application key
   *
   * @param appKeyId The ID of the application key. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.updateApplicationKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
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
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      updateApplicationKeyWithHttpInfoAsync(String appKeyId, ApplicationKeyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling updateApplicationKey"));
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
        "/api/v2/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.updateApplicationKey",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Edit an application key owned by current user.
   *
   * <p>See {@link #updateCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse updateCurrentUserApplicationKey(
      String appKeyId, ApplicationKeyUpdateRequest body) throws ApiException {
    return updateCurrentUserApplicationKeyWithHttpInfo(appKeyId, body).getData();
  }

  /**
   * Edit an application key owned by current user.
   *
   * <p>See {@link #updateCurrentUserApplicationKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> updateCurrentUserApplicationKeyAsync(
      String appKeyId, ApplicationKeyUpdateRequest body) {
    return updateCurrentUserApplicationKeyWithHttpInfoAsync(appKeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an application key owned by current user. The <code>key</code> field is not returned for
   * organizations in <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#one-time-read-mode">One-Time
   * Read mode</a>.
   *
   * @param appKeyId The ID of the application key. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.updateCurrentUserApplicationKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Edit an application key owned by current user.
   *
   * <p>See {@link #updateCurrentUserApplicationKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      updateCurrentUserApplicationKeyWithHttpInfoAsync(
          String appKeyId, ApplicationKeyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " updateCurrentUserApplicationKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateCurrentUserApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/current_user/application_keys/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.updateCurrentUserApplicationKey",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Update personal access token.
   *
   * <p>See {@link #updatePersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @param body (required)
   * @return PersonalAccessTokenGetResponse
   * @throws ApiException if fails to make API call
   */
  public PersonalAccessTokenGetResponse updatePersonalAccessToken(
      UUID patUuid, PersonalAccessTokenUpdateRequest body) throws ApiException {
    return updatePersonalAccessTokenWithHttpInfo(patUuid, body).getData();
  }

  /**
   * Update personal access token.
   *
   * <p>See {@link #updatePersonalAccessTokenWithHttpInfoAsync}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PersonalAccessTokenGetResponse&gt;
   */
  public CompletableFuture<PersonalAccessTokenGetResponse> updatePersonalAccessTokenAsync(
      UUID patUuid, PersonalAccessTokenUpdateRequest body) {
    return updatePersonalAccessTokenWithHttpInfoAsync(patUuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the name and/or scopes of an existing personal access token. The ID in the request body
   * must match the UUID in the path.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @param body (required)
   * @return ApiResponse&lt;PersonalAccessTokenGetResponse&gt;
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
  public ApiResponse<PersonalAccessTokenGetResponse> updatePersonalAccessTokenWithHttpInfo(
      UUID patUuid, PersonalAccessTokenUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updatePersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'patUuid' when calling updatePersonalAccessToken");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePersonalAccessToken");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.KeyManagementApi.updatePersonalAccessToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PersonalAccessTokenGetResponse>() {});
  }

  /**
   * Update personal access token.
   *
   * <p>See {@link #updatePersonalAccessTokenWithHttpInfo}.
   *
   * @param patUuid The UUID of the personal access token. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PersonalAccessTokenGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>>
      updatePersonalAccessTokenWithHttpInfoAsync(
          UUID patUuid, PersonalAccessTokenUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updatePersonalAccessToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'patUuid' is set
    if (patUuid == null) {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'patUuid' when calling updatePersonalAccessToken"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePersonalAccessToken"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/personal_access_tokens/{pat_uuid}"
            .replaceAll("\\{" + "pat_uuid" + "\\}", apiClient.escapeString(patUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.KeyManagementApi.updatePersonalAccessToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PersonalAccessTokenGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PersonalAccessTokenGetResponse>() {});
  }
}
