package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OAuthClientRegistrationRequest;
import com.datadog.api.client.v2.model.OAuthClientRegistrationResponse;
import com.datadog.api.client.v2.model.OAuthScopesRestrictionResponse;
import com.datadog.api.client.v2.model.UpsertOAuthScopesRestrictionRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuth2ClientPublicApi {
  private ApiClient apiClient;

  public OAuth2ClientPublicApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OAuth2ClientPublicApi(ApiClient apiClient) {
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
   * Delete an OAuth2 client scopes restriction.
   *
   * <p>See {@link #deleteScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScopesRestriction(UUID clientUuid) throws ApiException {
    deleteScopesRestrictionWithHttpInfo(clientUuid);
  }

  /**
   * Delete an OAuth2 client scopes restriction.
   *
   * <p>See {@link #deleteScopesRestrictionWithHttpInfoAsync}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteScopesRestrictionAsync(UUID clientUuid) {
    return deleteScopesRestrictionWithHttpInfoAsync(clientUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the scopes restriction configured for the OAuth2 client.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteScopesRestrictionWithHttpInfo(UUID clientUuid)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'clientUuid' when calling deleteScopesRestriction");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OAuth2ClientPublicApi.deleteScopesRestriction",
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
   * Delete an OAuth2 client scopes restriction.
   *
   * <p>See {@link #deleteScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteScopesRestrictionWithHttpInfoAsync(
      UUID clientUuid) {
    // Check if unstable operation is enabled
    String operationId = "deleteScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'clientUuid' when calling deleteScopesRestriction"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OAuth2ClientPublicApi.deleteScopesRestriction",
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
   * Get an OAuth2 client scopes restriction.
   *
   * <p>See {@link #getScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return OAuthScopesRestrictionResponse
   * @throws ApiException if fails to make API call
   */
  public OAuthScopesRestrictionResponse getScopesRestriction(UUID clientUuid) throws ApiException {
    return getScopesRestrictionWithHttpInfo(clientUuid).getData();
  }

  /**
   * Get an OAuth2 client scopes restriction.
   *
   * <p>See {@link #getScopesRestrictionWithHttpInfoAsync}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return CompletableFuture&lt;OAuthScopesRestrictionResponse&gt;
   */
  public CompletableFuture<OAuthScopesRestrictionResponse> getScopesRestrictionAsync(
      UUID clientUuid) {
    return getScopesRestrictionWithHttpInfoAsync(clientUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the scopes restriction configured for the OAuth2 client.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return ApiResponse&lt;OAuthScopesRestrictionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OAuthScopesRestrictionResponse> getScopesRestrictionWithHttpInfo(
      UUID clientUuid) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'clientUuid' when calling getScopesRestriction");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OAuth2ClientPublicApi.getScopesRestriction",
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
        new GenericType<OAuthScopesRestrictionResponse>() {});
  }

  /**
   * Get an OAuth2 client scopes restriction.
   *
   * <p>See {@link #getScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OAuthScopesRestrictionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>>
      getScopesRestrictionWithHttpInfoAsync(UUID clientUuid) {
    // Check if unstable operation is enabled
    String operationId = "getScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'clientUuid' when calling getScopesRestriction"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OAuth2ClientPublicApi.getScopesRestriction",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
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
        new GenericType<OAuthScopesRestrictionResponse>() {});
  }

  /**
   * Register an OAuth2 client.
   *
   * <p>See {@link #registerOAuthClientWithHttpInfo}.
   *
   * @param body (required)
   * @return OAuthClientRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public OAuthClientRegistrationResponse registerOAuthClient(OAuthClientRegistrationRequest body)
      throws ApiException {
    return registerOAuthClientWithHttpInfo(body).getData();
  }

  /**
   * Register an OAuth2 client.
   *
   * <p>See {@link #registerOAuthClientWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OAuthClientRegistrationResponse&gt;
   */
  public CompletableFuture<OAuthClientRegistrationResponse> registerOAuthClientAsync(
      OAuthClientRegistrationRequest body) {
    return registerOAuthClientWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Register an OAuth2 client using the Dynamic Client Registration protocol defined in RFC 7591.
   *
   * @param body (required)
   * @return ApiResponse&lt;OAuthClientRegistrationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OAuthClientRegistrationResponse> registerOAuthClientWithHttpInfo(
      OAuthClientRegistrationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "registerOAuthClient";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling registerOAuthClient");
    }
    // create path and map variables
    String localVarPath = "/api/v2/oauth2/register";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OAuth2ClientPublicApi.registerOAuthClient",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<OAuthClientRegistrationResponse>() {});
  }

  /**
   * Register an OAuth2 client.
   *
   * <p>See {@link #registerOAuthClientWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OAuthClientRegistrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OAuthClientRegistrationResponse>>
      registerOAuthClientWithHttpInfoAsync(OAuthClientRegistrationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "registerOAuthClient";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OAuthClientRegistrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OAuthClientRegistrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling registerOAuthClient"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/oauth2/register";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OAuth2ClientPublicApi.registerOAuthClient",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OAuthClientRegistrationResponse>> result =
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
        new GenericType<OAuthClientRegistrationResponse>() {});
  }

  /**
   * Upsert an OAuth2 client scopes restriction.
   *
   * <p>See {@link #upsertScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @param body (required)
   * @return OAuthScopesRestrictionResponse
   * @throws ApiException if fails to make API call
   */
  public OAuthScopesRestrictionResponse upsertScopesRestriction(
      UUID clientUuid, UpsertOAuthScopesRestrictionRequest body) throws ApiException {
    return upsertScopesRestrictionWithHttpInfo(clientUuid, body).getData();
  }

  /**
   * Upsert an OAuth2 client scopes restriction.
   *
   * <p>See {@link #upsertScopesRestrictionWithHttpInfoAsync}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OAuthScopesRestrictionResponse&gt;
   */
  public CompletableFuture<OAuthScopesRestrictionResponse> upsertScopesRestrictionAsync(
      UUID clientUuid, UpsertOAuthScopesRestrictionRequest body) {
    return upsertScopesRestrictionWithHttpInfoAsync(clientUuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update the scopes restriction configured for the OAuth2 client.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @param body (required)
   * @return ApiResponse&lt;OAuthScopesRestrictionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OAuthScopesRestrictionResponse> upsertScopesRestrictionWithHttpInfo(
      UUID clientUuid, UpsertOAuthScopesRestrictionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'clientUuid' when calling upsertScopesRestriction");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertScopesRestriction");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OAuth2ClientPublicApi.upsertScopesRestriction",
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
        new GenericType<OAuthScopesRestrictionResponse>() {});
  }

  /**
   * Upsert an OAuth2 client scopes restriction.
   *
   * <p>See {@link #upsertScopesRestrictionWithHttpInfo}.
   *
   * @param clientUuid UUID of the OAuth2 client. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OAuthScopesRestrictionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>>
      upsertScopesRestrictionWithHttpInfoAsync(
          UUID clientUuid, UpsertOAuthScopesRestrictionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "upsertScopesRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'clientUuid' is set
    if (clientUuid == null) {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'clientUuid' when calling upsertScopesRestriction"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertScopesRestriction"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/oauth2/clients/{client_uuid}/scopes_restriction"
            .replaceAll(
                "\\{" + "client_uuid" + "\\}", apiClient.escapeString(clientUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OAuth2ClientPublicApi.upsertScopesRestriction",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OAuthScopesRestrictionResponse>> result =
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
        new GenericType<OAuthScopesRestrictionResponse>() {});
  }
}
