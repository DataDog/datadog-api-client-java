package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;
import com.datadog.api.client.v2.model.WebIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationsApi {
  private ApiClient apiClient;

  public WebIntegrationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WebIntegrationsApi(ApiClient apiClient) {
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
   * Create a web integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param body (required)
   * @return WebIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountResponse createWebIntegrationAccount(
      String integrationName, WebIntegrationAccountCreateRequest body) throws ApiException {
    return createWebIntegrationAccountWithHttpInfo(integrationName, body).getData();
  }

  /**
   * Create a web integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;WebIntegrationAccountResponse&gt;
   */
  public CompletableFuture<WebIntegrationAccountResponse> createWebIntegrationAccountAsync(
      String integrationName, WebIntegrationAccountCreateRequest body) {
    return createWebIntegrationAccountWithHttpInfoAsync(integrationName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new account for a given web integration.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param body (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountResponse> createWebIntegrationAccountWithHttpInfo(
      String integrationName, WebIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " createWebIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createWebIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.createWebIntegrationAccount",
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }

  /**
   * Create a web integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      createWebIntegrationAccountWithHttpInfoAsync(
          String integrationName, WebIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " createWebIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createWebIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.createWebIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }

  /**
   * Delete a web integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebIntegrationAccount(String integrationName, String accountId)
      throws ApiException {
    deleteWebIntegrationAccountWithHttpInfo(integrationName, accountId);
  }

  /**
   * Delete a web integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteWebIntegrationAccountAsync(
      String integrationName, String accountId) {
    return deleteWebIntegrationAccountWithHttpInfoAsync(integrationName, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an account for a given web integration.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " deleteWebIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling deleteWebIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.deleteWebIntegrationAccount",
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
   * Delete a web integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWebIntegrationAccountWithHttpInfoAsync(
      String integrationName, String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " deleteWebIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " deleteWebIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.deleteWebIntegrationAccount",
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
   * Get a web integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return WebIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountResponse getWebIntegrationAccount(
      String integrationName, String accountId) throws ApiException {
    return getWebIntegrationAccountWithHttpInfo(integrationName, accountId).getData();
  }

  /**
   * Get a web integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return CompletableFuture&lt;WebIntegrationAccountResponse&gt;
   */
  public CompletableFuture<WebIntegrationAccountResponse> getWebIntegrationAccountAsync(
      String integrationName, String accountId) {
    return getWebIntegrationAccountWithHttpInfoAsync(integrationName, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single account for a given web integration.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
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
  public ApiResponse<WebIntegrationAccountResponse> getWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling getWebIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getWebIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.getWebIntegrationAccount",
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }

  /**
   * Get a web integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      getWebIntegrationAccountWithHttpInfoAsync(String integrationName, String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " getWebIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling getWebIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.getWebIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }

  /**
   * List web integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @return WebIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountsResponse listWebIntegrationAccounts(String integrationName)
      throws ApiException {
    return listWebIntegrationAccountsWithHttpInfo(integrationName).getData();
  }

  /**
   * List web integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @return CompletableFuture&lt;WebIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<WebIntegrationAccountsResponse> listWebIntegrationAccountsAsync(
      String integrationName) {
    return listWebIntegrationAccountsWithHttpInfoAsync(integrationName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List accounts for a given web integration.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @return ApiResponse&lt;WebIntegrationAccountsResponse&gt;
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
  public ApiResponse<WebIntegrationAccountsResponse> listWebIntegrationAccountsWithHttpInfo(
      String integrationName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listWebIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " listWebIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.listWebIntegrationAccounts",
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
        new GenericType<WebIntegrationAccountsResponse>() {});
  }

  /**
   * List web integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountsResponse>>
      listWebIntegrationAccountsWithHttpInfoAsync(String integrationName) {
    // Check if unstable operation is enabled
    String operationId = "listWebIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<WebIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " listWebIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.listWebIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebIntegrationAccountsResponse>> result =
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
        new GenericType<WebIntegrationAccountsResponse>() {});
  }

  /**
   * Update a web integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @param body (required)
   * @return WebIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountResponse updateWebIntegrationAccount(
      String integrationName, String accountId, WebIntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateWebIntegrationAccountWithHttpInfo(integrationName, accountId, body).getData();
  }

  /**
   * Update a web integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;WebIntegrationAccountResponse&gt;
   */
  public CompletableFuture<WebIntegrationAccountResponse> updateWebIntegrationAccountAsync(
      String integrationName, String accountId, WebIntegrationAccountUpdateRequest body) {
    return updateWebIntegrationAccountWithHttpInfoAsync(integrationName, accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing account for a given web integration.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountResponse> updateWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId, WebIntegrationAccountUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " updateWebIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling updateWebIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateWebIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.updateWebIntegrationAccount",
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }

  /**
   * Update a web integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration (for example, <code>databricks</code>).
   *     (required)
   * @param accountId The unique identifier of the web integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      updateWebIntegrationAccountWithHttpInfoAsync(
          String integrationName, String accountId, WebIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateWebIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " updateWebIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateWebIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateWebIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.updateWebIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebIntegrationAccountResponse>> result =
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
        new GenericType<WebIntegrationAccountResponse>() {});
  }
}
