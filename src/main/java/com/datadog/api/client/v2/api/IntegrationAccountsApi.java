package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AmsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.AmsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AmsIntegrationAccountSchemaResponse;
import com.datadog.api.client.v2.model.AmsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.AmsIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationAccountsApi {
  private ApiClient apiClient;

  public IntegrationAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IntegrationAccountsApi(ApiClient apiClient) {
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
   * <p>See {@link #createAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param body (required)
   * @return AmsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AmsIntegrationAccountResponse createAmsIntegrationAccount(
      String integrationName, String interfaceId, AmsIntegrationAccountCreateRequest body)
      throws ApiException {
    return createAmsIntegrationAccountWithHttpInfo(integrationName, interfaceId, body).getData();
  }

  /**
   * Create integration account.
   *
   * <p>See {@link #createAmsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AmsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AmsIntegrationAccountResponse> createAmsIntegrationAccountAsync(
      String integrationName, String interfaceId, AmsIntegrationAccountCreateRequest body) {
    return createAmsIntegrationAccountWithHttpInfoAsync(integrationName, interfaceId, body)
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
   * @param interfaceId The unique identifier of the interface. (required)
   * @param body (required)
   * @return ApiResponse&lt;AmsIntegrationAccountResponse&gt;
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
  public ApiResponse<AmsIntegrationAccountResponse> createAmsIntegrationAccountWithHttpInfo(
      String integrationName, String interfaceId, AmsIntegrationAccountCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " createAmsIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling createAmsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAmsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.createAmsIntegrationAccount",
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }

  /**
   * Create integration account.
   *
   * <p>See {@link #createAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AmsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>>
      createAmsIntegrationAccountWithHttpInfoAsync(
          String integrationName, String interfaceId, AmsIntegrationAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " createAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " createAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAmsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.createAmsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }

  /**
   * Delete integration account.
   *
   * <p>See {@link #deleteAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAmsIntegrationAccount(
      String integrationName, String interfaceId, String accountId) throws ApiException {
    deleteAmsIntegrationAccountWithHttpInfo(integrationName, interfaceId, accountId);
  }

  /**
   * Delete integration account.
   *
   * <p>See {@link #deleteAmsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAmsIntegrationAccountAsync(
      String integrationName, String interfaceId, String accountId) {
    return deleteAmsIntegrationAccountWithHttpInfoAsync(integrationName, interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific account by its ID for a given integration. This removes the account
   * configuration and stops any data collection associated with it.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
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
  public ApiResponse<Void> deleteAmsIntegrationAccountWithHttpInfo(
      String integrationName, String interfaceId, String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " deleteAmsIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling deleteAmsIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling deleteAmsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.deleteAmsIntegrationAccount",
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
   * <p>See {@link #deleteAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAmsIntegrationAccountWithHttpInfoAsync(
      String integrationName, String interfaceId, String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " deleteAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " deleteAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " deleteAmsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.deleteAmsIntegrationAccount",
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
   * <p>See {@link #getAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return AmsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AmsIntegrationAccountResponse getAmsIntegrationAccount(
      String integrationName, String interfaceId, String accountId) throws ApiException {
    return getAmsIntegrationAccountWithHttpInfo(integrationName, interfaceId, accountId).getData();
  }

  /**
   * Get integration account.
   *
   * <p>See {@link #getAmsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture&lt;AmsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AmsIntegrationAccountResponse> getAmsIntegrationAccountAsync(
      String integrationName, String interfaceId, String accountId) {
    return getAmsIntegrationAccountWithHttpInfoAsync(integrationName, interfaceId, accountId)
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
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return ApiResponse&lt;AmsIntegrationAccountResponse&gt;
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
  public ApiResponse<AmsIntegrationAccountResponse> getAmsIntegrationAccountWithHttpInfo(
      String integrationName, String interfaceId, String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling getAmsIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling getAmsIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getAmsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.getAmsIntegrationAccount",
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }

  /**
   * Get integration account.
   *
   * <p>See {@link #getAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AmsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>>
      getAmsIntegrationAccountWithHttpInfoAsync(
          String integrationName, String interfaceId, String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " getAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " getAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling getAmsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.getAmsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }

  /**
   * Get account schema for an integration.
   *
   * <p>See {@link #getAmsIntegrationAccountSchemaWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return AmsIntegrationAccountSchemaResponse
   * @throws ApiException if fails to make API call
   */
  public AmsIntegrationAccountSchemaResponse getAmsIntegrationAccountSchema(
      String integrationName, String interfaceId) throws ApiException {
    return getAmsIntegrationAccountSchemaWithHttpInfo(integrationName, interfaceId).getData();
  }

  /**
   * Get account schema for an integration.
   *
   * <p>See {@link #getAmsIntegrationAccountSchemaWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return CompletableFuture&lt;AmsIntegrationAccountSchemaResponse&gt;
   */
  public CompletableFuture<AmsIntegrationAccountSchemaResponse> getAmsIntegrationAccountSchemaAsync(
      String integrationName, String interfaceId) {
    return getAmsIntegrationAccountSchemaWithHttpInfoAsync(integrationName, interfaceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the JSON schema that defines the structure and validation rules for account configuration
   * of a specific integration. This schema describes the required and optional fields for both
   * <strong>settings</strong> and <strong>secrets</strong> when creating or updating an account.
   *
   * <p>The schema structure varies between integrations, so always retrieve the schema for your
   * specific integration before creating or updating accounts.
   *
   * <p>Rate limit: 12000 requests per organization every 60 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return ApiResponse&lt;AmsIntegrationAccountSchemaResponse&gt;
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
  public ApiResponse<AmsIntegrationAccountSchemaResponse>
      getAmsIntegrationAccountSchemaWithHttpInfo(String integrationName, String interfaceId)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " getAmsIntegrationAccountSchema");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling"
              + " getAmsIntegrationAccountSchema");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/schema"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.getAmsIntegrationAccountSchema",
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
        new GenericType<AmsIntegrationAccountSchemaResponse>() {});
  }

  /**
   * Get account schema for an integration.
   *
   * <p>See {@link #getAmsIntegrationAccountSchemaWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AmsIntegrationAccountSchemaResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AmsIntegrationAccountSchemaResponse>>
      getAmsIntegrationAccountSchemaWithHttpInfoAsync(String integrationName, String interfaceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " getAmsIntegrationAccountSchema"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountSchemaResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " getAmsIntegrationAccountSchema"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/schema"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.getAmsIntegrationAccountSchema",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountSchemaResponse>> result =
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
        new GenericType<AmsIntegrationAccountSchemaResponse>() {});
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listAmsIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return AmsIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AmsIntegrationAccountsResponse listAmsIntegrationAccounts(
      String integrationName, String interfaceId) throws ApiException {
    return listAmsIntegrationAccountsWithHttpInfo(integrationName, interfaceId).getData();
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listAmsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return CompletableFuture&lt;AmsIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<AmsIntegrationAccountsResponse> listAmsIntegrationAccountsAsync(
      String integrationName, String interfaceId) {
    return listAmsIntegrationAccountsWithHttpInfoAsync(integrationName, interfaceId)
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
   * @param interfaceId The unique identifier of the interface. (required)
   * @return ApiResponse&lt;AmsIntegrationAccountsResponse&gt;
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
  public ApiResponse<AmsIntegrationAccountsResponse> listAmsIntegrationAccountsWithHttpInfo(
      String integrationName, String interfaceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " listAmsIntegrationAccounts");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling listAmsIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.listAmsIntegrationAccounts",
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
        new GenericType<AmsIntegrationAccountsResponse>() {});
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listAmsIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AmsIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AmsIntegrationAccountsResponse>>
      listAmsIntegrationAccountsWithHttpInfoAsync(String integrationName, String interfaceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " listAmsIntegrationAccounts"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " listAmsIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.listAmsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountsResponse>> result =
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
        new GenericType<AmsIntegrationAccountsResponse>() {});
  }

  /**
   * Update integration account.
   *
   * <p>See {@link #updateAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return AmsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AmsIntegrationAccountResponse updateAmsIntegrationAccount(
      String integrationName,
      String interfaceId,
      String accountId,
      AmsIntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateAmsIntegrationAccountWithHttpInfo(integrationName, interfaceId, accountId, body)
        .getData();
  }

  /**
   * Update integration account.
   *
   * <p>See {@link #updateAmsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AmsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AmsIntegrationAccountResponse> updateAmsIntegrationAccountAsync(
      String integrationName,
      String interfaceId,
      String accountId,
      AmsIntegrationAccountUpdateRequest body) {
    return updateAmsIntegrationAccountWithHttpInfoAsync(
            integrationName, interfaceId, accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing account for a specific integration. You can update the name, settings, and
   * secrets. Only the fields provided in the request are updated.
   *
   * <p>Rate limit: 50 requests per user every 20 seconds.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return ApiResponse&lt;AmsIntegrationAccountResponse&gt;
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
  public ApiResponse<AmsIntegrationAccountResponse> updateAmsIntegrationAccountWithHttpInfo(
      String integrationName,
      String interfaceId,
      String accountId,
      AmsIntegrationAccountUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationName' when calling"
              + " updateAmsIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling updateAmsIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling updateAmsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAmsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.updateAmsIntegrationAccount",
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }

  /**
   * Update integration account.
   *
   * <p>See {@link #updateAmsIntegrationAccountWithHttpInfo}.
   *
   * @param integrationName The name of the integration. (required)
   * @param interfaceId The unique identifier of the interface. (required)
   * @param accountId The unique identifier of the account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AmsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>>
      updateAmsIntegrationAccountWithHttpInfoAsync(
          String integrationName,
          String interfaceId,
          String accountId,
          AmsIntegrationAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationName' is set
    if (integrationName == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationName' when calling"
                  + " updateAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " updateAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateAmsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateAmsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_name}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_name" + "\\}",
                apiClient.escapeString(integrationName.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.updateAmsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AmsIntegrationAccountResponse>> result =
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
        new GenericType<AmsIntegrationAccountResponse>() {});
  }
}
