package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;
import com.datadog.api.client.v2.model.WebIntegrationAccountSchemaResponse;
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
   * Create integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param body (required)
   * @return WebIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountResponse createWebIntegrationAccount(
      String integrationName, WebIntegrationAccountCreateRequest body) throws ApiException {
    return createWebIntegrationAccountWithHttpInfo(integrationName, body).getData();
  }

  /**
   * Create integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
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
   * Create a new account for a specific integration. The account configuration must conform to the
   * schema defined for the integration, which can be retrieved using the schema endpoint.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param body (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created: The account was successfully created. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The request body is malformed or the integration name format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access or the user lacks permissions to manage integrations. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity: The account configuration does not match the integration schema. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 50 requests per user every 20 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountResponse> createWebIntegrationAccountWithHttpInfo(
      String integrationName, WebIntegrationAccountCreateRequest body) throws ApiException {
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
   * Create integration account.
   *
   * <p>See {@link #createWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      createWebIntegrationAccountWithHttpInfoAsync(
          String integrationName, WebIntegrationAccountCreateRequest body) {
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
   * Delete integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebIntegrationAccount(String integrationName, String accountId)
      throws ApiException {
    deleteWebIntegrationAccountWithHttpInfo(integrationName, accountId);
  }

  /**
   * Delete integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
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
   * Delete a specific account by its ID for a given integration. This will remove the account
   * configuration and stop any data collection associated with it.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK: The account was successfully deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The integration name or account ID format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access or the user lacks permissions to manage this account. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration or account does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 50 requests per user every 20 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId) throws ApiException {
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
   * Delete integration account.
   *
   * <p>See {@link #deleteWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWebIntegrationAccountWithHttpInfoAsync(
      String integrationName, String accountId) {
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
   * Get integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return WebIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountResponse getWebIntegrationAccount(
      String integrationName, String accountId) throws ApiException {
    return getWebIntegrationAccountWithHttpInfo(integrationName, accountId).getData();
  }

  /**
   * Get integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
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
   * Retrieve a specific account by its ID for a given integration. The response includes the
   * account name and settings, but excludes sensitive secret values.
   *
   * <p>Rate limit: 12000 requests per organization every 60 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK: The account details for the specified integration. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The integration name or account ID format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access or the user lacks required permissions. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration or account does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 12000 requests per organization every 60 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountResponse> getWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId) throws ApiException {
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
   * Get integration account.
   *
   * <p>See {@link #getWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      getWebIntegrationAccountWithHttpInfoAsync(String integrationName, String accountId) {
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
   * Get account schema for an integration.
   *
   * <p>See {@link #getWebIntegrationAccountSchemaWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @return WebIntegrationAccountSchemaResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountSchemaResponse getWebIntegrationAccountSchema(String integrationName)
      throws ApiException {
    return getWebIntegrationAccountSchemaWithHttpInfo(integrationName).getData();
  }

  /**
   * Get account schema for an integration.
   *
   * <p>See {@link #getWebIntegrationAccountSchemaWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @return CompletableFuture&lt;WebIntegrationAccountSchemaResponse&gt;
   */
  public CompletableFuture<WebIntegrationAccountSchemaResponse> getWebIntegrationAccountSchemaAsync(
      String integrationName) {
    return getWebIntegrationAccountSchemaWithHttpInfoAsync(integrationName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the JSON schema that defines the structure and validation rules for account configuration
   * of a specific integration. This schema describes the required and optional fields for both
   * settings and secrets when creating or updating an account.
   *
   * <p>Rate limit: 12000 requests per organization every 60 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @return ApiResponse&lt;WebIntegrationAccountSchemaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK: The JSON schema for the integration&#39;s account configuration. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The integration name format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration does not exist or has no schema available. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 12000 requests per organization every 60 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountSchemaResponse>
      getWebIntegrationAccountSchemaWithHttpInfo(String integrationName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " getWebIntegrationAccountSchema");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/schema"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WebIntegrationsApi.getWebIntegrationAccountSchema",
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
        new GenericType<WebIntegrationAccountSchemaResponse>() {});
  }

  /**
   * Get account schema for an integration.
   *
   * <p>See {@link #getWebIntegrationAccountSchemaWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountSchemaResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountSchemaResponse>>
      getWebIntegrationAccountSchemaWithHttpInfoAsync(String integrationName) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<WebIntegrationAccountSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " getWebIntegrationAccountSchema"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/web-integrations/{integration_name}/accounts/schema"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WebIntegrationsApi.getWebIntegrationAccountSchema",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebIntegrationAccountSchemaResponse>> result =
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
        new GenericType<WebIntegrationAccountSchemaResponse>() {});
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @return WebIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public WebIntegrationAccountsResponse listWebIntegrationAccounts(String integrationName)
      throws ApiException {
    return listWebIntegrationAccountsWithHttpInfo(integrationName).getData();
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
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
   * Retrieve all configured accounts for a specific integration within your organization.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @return ApiResponse&lt;WebIntegrationAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK: List of all accounts for the specified integration. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The integration name format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access or the user lacks required permissions. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 50 requests per user every 20 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountsResponse> listWebIntegrationAccountsWithHttpInfo(
      String integrationName) throws ApiException {
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
   * List integration accounts.
   *
   * <p>See {@link #listWebIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountsResponse>>
      listWebIntegrationAccountsWithHttpInfoAsync(String integrationName) {
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
   * Update integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
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
   * Update integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
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
   * Update an existing account for a specific integration. You can update the name, settings,
   * and/or secrets. Only the fields provided in the request will be updated.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return ApiResponse&lt;WebIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK: The account was successfully updated. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The request body is malformed or the integration name/account ID format is invalid. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: The integration is not enabled for API access or the user lacks permissions to manage this account. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The integration or account does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity: The account configuration does not match the integration schema. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests: Rate limit exceeded. This endpoint has a rate limit of 50 requests per user every 20 seconds. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebIntegrationAccountResponse> updateWebIntegrationAccountWithHttpInfo(
      String integrationName, String accountId, WebIntegrationAccountUpdateRequest body)
      throws ApiException {
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
   * Update integration account.
   *
   * <p>See {@link #updateWebIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebIntegrationAccountResponse>>
      updateWebIntegrationAccountWithHttpInfoAsync(
          String integrationName, String accountId, WebIntegrationAccountUpdateRequest body) {
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
