package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountResponse;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationApi {
  private ApiClient apiClient;

  public SnowflakeIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SnowflakeIntegrationApi(ApiClient apiClient) {
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
   * Create a Snowflake integration account.
   *
   * <p>See {@link #createSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return SnowflakeIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public SnowflakeIntegrationAccountResponse createSnowflakeIntegrationAccount(
      SnowflakeIntegrationAccountCreateRequest body) throws ApiException {
    return createSnowflakeIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a Snowflake integration account.
   *
   * <p>See {@link #createSnowflakeIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SnowflakeIntegrationAccountResponse&gt;
   */
  public CompletableFuture<SnowflakeIntegrationAccountResponse>
      createSnowflakeIntegrationAccountAsync(SnowflakeIntegrationAccountCreateRequest body) {
    return createSnowflakeIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Snowflake integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SnowflakeIntegrationAccountResponse>
      createSnowflakeIntegrationAccountWithHttpInfo(SnowflakeIntegrationAccountCreateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createSnowflakeIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/snowflake/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SnowflakeIntegrationApi.createSnowflakeIntegrationAccount",
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }

  /**
   * Create a Snowflake integration account.
   *
   * <p>See {@link #createSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>>
      createSnowflakeIntegrationAccountWithHttpInfoAsync(
          SnowflakeIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createSnowflakeIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/snowflake/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SnowflakeIntegrationApi.createSnowflakeIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }

  /**
   * Delete a Snowflake integration account.
   *
   * <p>See {@link #deleteSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSnowflakeIntegrationAccount(String accountId) throws ApiException {
    deleteSnowflakeIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete a Snowflake integration account.
   *
   * <p>See {@link #deleteSnowflakeIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSnowflakeIntegrationAccountAsync(String accountId) {
    return deleteSnowflakeIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Snowflake integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> deleteSnowflakeIntegrationAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " deleteSnowflakeIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SnowflakeIntegrationApi.deleteSnowflakeIntegrationAccount",
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
   * Delete a Snowflake integration account.
   *
   * <p>See {@link #deleteSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSnowflakeIntegrationAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " deleteSnowflakeIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SnowflakeIntegrationApi.deleteSnowflakeIntegrationAccount",
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
   * Get a Snowflake integration account.
   *
   * <p>See {@link #getSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return SnowflakeIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public SnowflakeIntegrationAccountResponse getSnowflakeIntegrationAccount(String accountId)
      throws ApiException {
    return getSnowflakeIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get a Snowflake integration account.
   *
   * <p>See {@link #getSnowflakeIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;SnowflakeIntegrationAccountResponse&gt;
   */
  public CompletableFuture<SnowflakeIntegrationAccountResponse> getSnowflakeIntegrationAccountAsync(
      String accountId) {
    return getSnowflakeIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Snowflake integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;
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
  public ApiResponse<SnowflakeIntegrationAccountResponse>
      getSnowflakeIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling getSnowflakeIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SnowflakeIntegrationApi.getSnowflakeIntegrationAccount",
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }

  /**
   * Get a Snowflake integration account.
   *
   * <p>See {@link #getSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>>
      getSnowflakeIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getSnowflakeIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SnowflakeIntegrationApi.getSnowflakeIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }

  /**
   * List Snowflake integration accounts.
   *
   * <p>See {@link #listSnowflakeIntegrationAccountsWithHttpInfo}.
   *
   * @return SnowflakeIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public SnowflakeIntegrationAccountsResponse listSnowflakeIntegrationAccounts()
      throws ApiException {
    return listSnowflakeIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List Snowflake integration accounts.
   *
   * <p>See {@link #listSnowflakeIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SnowflakeIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<SnowflakeIntegrationAccountsResponse>
      listSnowflakeIntegrationAccountsAsync() {
    return listSnowflakeIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Snowflake integration accounts.
   *
   * @return ApiResponse&lt;SnowflakeIntegrationAccountsResponse&gt;
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
  public ApiResponse<SnowflakeIntegrationAccountsResponse>
      listSnowflakeIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listSnowflakeIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/snowflake/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SnowflakeIntegrationApi.listSnowflakeIntegrationAccounts",
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
        new GenericType<SnowflakeIntegrationAccountsResponse>() {});
  }

  /**
   * List Snowflake integration accounts.
   *
   * <p>See {@link #listSnowflakeIntegrationAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SnowflakeIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SnowflakeIntegrationAccountsResponse>>
      listSnowflakeIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listSnowflakeIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/snowflake/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SnowflakeIntegrationApi.listSnowflakeIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountsResponse>> result =
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
        new GenericType<SnowflakeIntegrationAccountsResponse>() {});
  }

  /**
   * Update a Snowflake integration account.
   *
   * <p>See {@link #updateSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return SnowflakeIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public SnowflakeIntegrationAccountResponse updateSnowflakeIntegrationAccount(
      String accountId, SnowflakeIntegrationAccountUpdateRequest body) throws ApiException {
    return updateSnowflakeIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update a Snowflake integration account.
   *
   * <p>See {@link #updateSnowflakeIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SnowflakeIntegrationAccountResponse&gt;
   */
  public CompletableFuture<SnowflakeIntegrationAccountResponse>
      updateSnowflakeIntegrationAccountAsync(
          String accountId, SnowflakeIntegrationAccountUpdateRequest body) {
    return updateSnowflakeIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Snowflake integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;
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
  public ApiResponse<SnowflakeIntegrationAccountResponse>
      updateSnowflakeIntegrationAccountWithHttpInfo(
          String accountId, SnowflakeIntegrationAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " updateSnowflakeIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateSnowflakeIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SnowflakeIntegrationApi.updateSnowflakeIntegrationAccount",
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }

  /**
   * Update a Snowflake integration account.
   *
   * <p>See {@link #updateSnowflakeIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SnowflakeIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>>
      updateSnowflakeIntegrationAccountWithHttpInfoAsync(
          String accountId, SnowflakeIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateSnowflakeIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateSnowflakeIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateSnowflakeIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/snowflake/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SnowflakeIntegrationApi.updateSnowflakeIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SnowflakeIntegrationAccountResponse>> result =
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
        new GenericType<SnowflakeIntegrationAccountResponse>() {});
  }
}
