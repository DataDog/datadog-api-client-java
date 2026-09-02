package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.WebhooksAuthMethodProtocol;
import com.datadog.api.client.v2.model.WebhooksAuthMethodsResponse;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsCreateRequest;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsResponse;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksIntegrationApi {
  private ApiClient apiClient;

  public WebhooksIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WebhooksIntegrationApi(ApiClient apiClient) {
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
   * Create an OAuth2 client credentials auth method.
   *
   * <p>See {@link #createOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param body OAuth2 client credentials payload. (required)
   * @return WebhooksOAuth2ClientCredentialsResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksOAuth2ClientCredentialsResponse createOAuth2ClientCredentials(
      WebhooksOAuth2ClientCredentialsCreateRequest body) throws ApiException {
    return createOAuth2ClientCredentialsWithHttpInfo(body).getData();
  }

  /**
   * Create an OAuth2 client credentials auth method.
   *
   * <p>See {@link #createOAuth2ClientCredentialsWithHttpInfoAsync}.
   *
   * @param body OAuth2 client credentials payload. (required)
   * @return CompletableFuture&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
   */
  public CompletableFuture<WebhooksOAuth2ClientCredentialsResponse>
      createOAuth2ClientCredentialsAsync(WebhooksOAuth2ClientCredentialsCreateRequest body) {
    return createOAuth2ClientCredentialsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new OAuth2 client credentials auth method for the Webhooks integration. The <code>
   * client_secret</code> is stored securely and never returned.
   *
   * @param body OAuth2 client credentials payload. (required)
   * @return ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksOAuth2ClientCredentialsResponse>
      createOAuth2ClientCredentialsWithHttpInfo(WebhooksOAuth2ClientCredentialsCreateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOAuth2ClientCredentials");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebhooksIntegrationApi.createOAuth2ClientCredentials",
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }

  /**
   * Create an OAuth2 client credentials auth method.
   *
   * <p>See {@link #createOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param body OAuth2 client credentials payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>>
      createOAuth2ClientCredentialsWithHttpInfoAsync(
          WebhooksOAuth2ClientCredentialsCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createOAuth2ClientCredentials"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebhooksIntegrationApi.createOAuth2ClientCredentials",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }

  /**
   * Delete an OAuth2 client credentials auth method.
   *
   * <p>See {@link #deleteOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOAuth2ClientCredentials(String authMethodId) throws ApiException {
    deleteOAuth2ClientCredentialsWithHttpInfo(authMethodId);
  }

  /**
   * Delete an OAuth2 client credentials auth method.
   *
   * <p>See {@link #deleteOAuth2ClientCredentialsWithHttpInfoAsync}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOAuth2ClientCredentialsAsync(String authMethodId) {
    return deleteOAuth2ClientCredentialsWithHttpInfoAsync(authMethodId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an OAuth2 client credentials auth method by ID.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOAuth2ClientCredentialsWithHttpInfo(String authMethodId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'authMethodId' when calling"
              + " deleteOAuth2ClientCredentials");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebhooksIntegrationApi.deleteOAuth2ClientCredentials",
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
   * Delete an OAuth2 client credentials auth method.
   *
   * <p>See {@link #deleteOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOAuth2ClientCredentialsWithHttpInfoAsync(
      String authMethodId) {
    Object localVarPostBody = null;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'authMethodId' when calling"
                  + " deleteOAuth2ClientCredentials"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebhooksIntegrationApi.deleteOAuth2ClientCredentials",
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

  /** Manage optional parameters to getAllAuthMethods. */
  public static class GetAllAuthMethodsOptionalParameters {
    private WebhooksAuthMethodProtocol include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationships to include in the response. (optional)
     * @return GetAllAuthMethodsOptionalParameters
     */
    public GetAllAuthMethodsOptionalParameters include(WebhooksAuthMethodProtocol include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get all auth methods.
   *
   * <p>See {@link #getAllAuthMethodsWithHttpInfo}.
   *
   * @return WebhooksAuthMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksAuthMethodsResponse getAllAuthMethods() throws ApiException {
    return getAllAuthMethodsWithHttpInfo(new GetAllAuthMethodsOptionalParameters()).getData();
  }

  /**
   * Get all auth methods.
   *
   * <p>See {@link #getAllAuthMethodsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;WebhooksAuthMethodsResponse&gt;
   */
  public CompletableFuture<WebhooksAuthMethodsResponse> getAllAuthMethodsAsync() {
    return getAllAuthMethodsWithHttpInfoAsync(new GetAllAuthMethodsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all auth methods.
   *
   * <p>See {@link #getAllAuthMethodsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return WebhooksAuthMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksAuthMethodsResponse getAllAuthMethods(
      GetAllAuthMethodsOptionalParameters parameters) throws ApiException {
    return getAllAuthMethodsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all auth methods.
   *
   * <p>See {@link #getAllAuthMethodsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;WebhooksAuthMethodsResponse&gt;
   */
  public CompletableFuture<WebhooksAuthMethodsResponse> getAllAuthMethodsAsync(
      GetAllAuthMethodsOptionalParameters parameters) {
    return getAllAuthMethodsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all auth methods configured for the Webhooks integration in your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;WebhooksAuthMethodsResponse&gt;
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
  public ApiResponse<WebhooksAuthMethodsResponse> getAllAuthMethodsWithHttpInfo(
      GetAllAuthMethodsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    WebhooksAuthMethodProtocol include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/integration/webhooks/configuration/auth-method";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebhooksIntegrationApi.getAllAuthMethods",
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
        new GenericType<WebhooksAuthMethodsResponse>() {});
  }

  /**
   * Get all auth methods.
   *
   * <p>See {@link #getAllAuthMethodsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksAuthMethodsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksAuthMethodsResponse>>
      getAllAuthMethodsWithHttpInfoAsync(GetAllAuthMethodsOptionalParameters parameters) {
    Object localVarPostBody = null;
    WebhooksAuthMethodProtocol include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/integration/webhooks/configuration/auth-method";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebhooksIntegrationApi.getAllAuthMethods",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksAuthMethodsResponse>> result =
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
        new GenericType<WebhooksAuthMethodsResponse>() {});
  }

  /**
   * Get an OAuth2 client credentials auth method.
   *
   * <p>See {@link #getOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return WebhooksOAuth2ClientCredentialsResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksOAuth2ClientCredentialsResponse getOAuth2ClientCredentials(String authMethodId)
      throws ApiException {
    return getOAuth2ClientCredentialsWithHttpInfo(authMethodId).getData();
  }

  /**
   * Get an OAuth2 client credentials auth method.
   *
   * <p>See {@link #getOAuth2ClientCredentialsWithHttpInfoAsync}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return CompletableFuture&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
   */
  public CompletableFuture<WebhooksOAuth2ClientCredentialsResponse> getOAuth2ClientCredentialsAsync(
      String authMethodId) {
    return getOAuth2ClientCredentialsWithHttpInfoAsync(authMethodId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single OAuth2 client credentials auth method by ID.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
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
  public ApiResponse<WebhooksOAuth2ClientCredentialsResponse>
      getOAuth2ClientCredentialsWithHttpInfo(String authMethodId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'authMethodId' when calling getOAuth2ClientCredentials");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebhooksIntegrationApi.getOAuth2ClientCredentials",
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }

  /**
   * Get an OAuth2 client credentials auth method.
   *
   * <p>See {@link #getOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>>
      getOAuth2ClientCredentialsWithHttpInfoAsync(String authMethodId) {
    Object localVarPostBody = null;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'authMethodId' when calling"
                  + " getOAuth2ClientCredentials"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebhooksIntegrationApi.getOAuth2ClientCredentials",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }

  /**
   * Update an OAuth2 client credentials auth method.
   *
   * <p>See {@link #updateOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @param body OAuth2 client credentials payload. (required)
   * @return WebhooksOAuth2ClientCredentialsResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksOAuth2ClientCredentialsResponse updateOAuth2ClientCredentials(
      String authMethodId, WebhooksOAuth2ClientCredentialsUpdateRequest body) throws ApiException {
    return updateOAuth2ClientCredentialsWithHttpInfo(authMethodId, body).getData();
  }

  /**
   * Update an OAuth2 client credentials auth method.
   *
   * <p>See {@link #updateOAuth2ClientCredentialsWithHttpInfoAsync}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @param body OAuth2 client credentials payload. (required)
   * @return CompletableFuture&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
   */
  public CompletableFuture<WebhooksOAuth2ClientCredentialsResponse>
      updateOAuth2ClientCredentialsAsync(
          String authMethodId, WebhooksOAuth2ClientCredentialsUpdateRequest body) {
    return updateOAuth2ClientCredentialsWithHttpInfoAsync(authMethodId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing OAuth2 client credentials auth method.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @param body OAuth2 client credentials payload. (required)
   * @return ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;
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
  public ApiResponse<WebhooksOAuth2ClientCredentialsResponse>
      updateOAuth2ClientCredentialsWithHttpInfo(
          String authMethodId, WebhooksOAuth2ClientCredentialsUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'authMethodId' when calling"
              + " updateOAuth2ClientCredentials");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOAuth2ClientCredentials");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebhooksIntegrationApi.updateOAuth2ClientCredentials",
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }

  /**
   * Update an OAuth2 client credentials auth method.
   *
   * <p>See {@link #updateOAuth2ClientCredentialsWithHttpInfo}.
   *
   * @param authMethodId The UUID of the auth method. (required)
   * @param body OAuth2 client credentials payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksOAuth2ClientCredentialsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>>
      updateOAuth2ClientCredentialsWithHttpInfoAsync(
          String authMethodId, WebhooksOAuth2ClientCredentialsUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'authMethodId' is set
    if (authMethodId == null) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'authMethodId' when calling"
                  + " updateOAuth2ClientCredentials"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateOAuth2ClientCredentials"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/webhooks/configuration/auth-method/oauth2-client-credentials/{auth_method_id}"
            .replaceAll(
                "\\{" + "auth_method_id" + "\\}", apiClient.escapeString(authMethodId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebhooksIntegrationApi.updateOAuth2ClientCredentials",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksOAuth2ClientCredentialsResponse>> result =
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
        new GenericType<WebhooksOAuth2ClientCredentialsResponse>() {});
  }
}
