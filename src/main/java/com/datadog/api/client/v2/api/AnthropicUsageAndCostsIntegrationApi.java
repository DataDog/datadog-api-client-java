package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnthropicUsageAndCostsIntegrationApi {
  private ApiClient apiClient;

  public AnthropicUsageAndCostsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AnthropicUsageAndCostsIntegrationApi(ApiClient apiClient) {
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
   * Create an Anthropic Usage and Costs account.
   *
   * <p>See {@link #createAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return AnthropicUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AnthropicUsageAndCostsIntegrationAccountResponse
      createAnthropicUsageAndCostsIntegrationAccount(
          AnthropicUsageAndCostsIntegrationAccountCreateRequest body) throws ApiException {
    return createAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an Anthropic Usage and Costs account.
   *
   * <p>See {@link #createAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AnthropicUsageAndCostsIntegrationAccountResponse>
      createAnthropicUsageAndCostsIntegrationAccountAsync(
          AnthropicUsageAndCostsIntegrationAccountCreateRequest body) {
    return createAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Anthropic Usage and Costs integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>
      createAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(
          AnthropicUsageAndCostsIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAnthropicUsageAndCostsIntegrationAccount";
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
          "Missing the required parameter 'body' when calling"
              + " createAnthropicUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnthropicUsageAndCostsIntegrationApi.createAnthropicUsageAndCostsIntegrationAccount",
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Create an Anthropic Usage and Costs account.
   *
   * <p>See {@link #createAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>>
      createAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(
          AnthropicUsageAndCostsIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAnthropicUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createAnthropicUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnthropicUsageAndCostsIntegrationApi.createAnthropicUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Delete an Anthropic Usage and Costs account.
   *
   * <p>See {@link #deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAnthropicUsageAndCostsIntegrationAccount(String accountId) throws ApiException {
    deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an Anthropic Usage and Costs account.
   *
   * <p>See {@link #deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAnthropicUsageAndCostsIntegrationAccountAsync(
      String accountId) {
    return deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Anthropic Usage and Costs integration account.
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
  public ApiResponse<Void> deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(
      String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAnthropicUsageAndCostsIntegrationAccount";
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
              + " deleteAnthropicUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnthropicUsageAndCostsIntegrationApi.deleteAnthropicUsageAndCostsIntegrationAccount",
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
   * Delete an Anthropic Usage and Costs account.
   *
   * <p>See {@link #deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAnthropicUsageAndCostsIntegrationAccount";
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
                  + " deleteAnthropicUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnthropicUsageAndCostsIntegrationApi.deleteAnthropicUsageAndCostsIntegrationAccount",
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
   * Get an Anthropic Usage and Costs account.
   *
   * <p>See {@link #getAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return AnthropicUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AnthropicUsageAndCostsIntegrationAccountResponse
      getAnthropicUsageAndCostsIntegrationAccount(String accountId) throws ApiException {
    return getAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an Anthropic Usage and Costs account.
   *
   * <p>See {@link #getAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AnthropicUsageAndCostsIntegrationAccountResponse>
      getAnthropicUsageAndCostsIntegrationAccountAsync(String accountId) {
    return getAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an Anthropic Usage and Costs integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>
      getAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(String accountId)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAnthropicUsageAndCostsIntegrationAccount";
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
              + " getAnthropicUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnthropicUsageAndCostsIntegrationApi.getAnthropicUsageAndCostsIntegrationAccount",
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Get an Anthropic Usage and Costs account.
   *
   * <p>See {@link #getAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>>
      getAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getAnthropicUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getAnthropicUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnthropicUsageAndCostsIntegrationApi.getAnthropicUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * List Anthropic Usage and Costs accounts.
   *
   * <p>See {@link #listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfo}.
   *
   * @return AnthropicUsageAndCostsIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AnthropicUsageAndCostsIntegrationAccountsResponse
      listAnthropicUsageAndCostsIntegrationAccounts() throws ApiException {
    return listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List Anthropic Usage and Costs accounts.
   *
   * <p>See {@link #listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AnthropicUsageAndCostsIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<AnthropicUsageAndCostsIntegrationAccountsResponse>
      listAnthropicUsageAndCostsIntegrationAccountsAsync() {
    return listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Anthropic Usage and Costs integration accounts.
   *
   * @return ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountsResponse&gt;
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
  public ApiResponse<AnthropicUsageAndCostsIntegrationAccountsResponse>
      listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAnthropicUsageAndCostsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnthropicUsageAndCostsIntegrationApi.listAnthropicUsageAndCostsIntegrationAccounts",
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountsResponse>() {});
  }

  /**
   * List Anthropic Usage and Costs accounts.
   *
   * <p>See {@link #listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountsResponse>>
      listAnthropicUsageAndCostsIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAnthropicUsageAndCostsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnthropicUsageAndCostsIntegrationApi.listAnthropicUsageAndCostsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountsResponse>> result =
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountsResponse>() {});
  }

  /**
   * Update an Anthropic Usage and Costs account.
   *
   * <p>See {@link #updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return AnthropicUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AnthropicUsageAndCostsIntegrationAccountResponse
      updateAnthropicUsageAndCostsIntegrationAccount(
          String accountId, AnthropicUsageAndCostsIntegrationAccountUpdateRequest body)
          throws ApiException {
    return updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an Anthropic Usage and Costs account.
   *
   * <p>See {@link #updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<AnthropicUsageAndCostsIntegrationAccountResponse>
      updateAnthropicUsageAndCostsIntegrationAccountAsync(
          String accountId, AnthropicUsageAndCostsIntegrationAccountUpdateRequest body) {
    return updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an Anthropic Usage and Costs integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>
      updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfo(
          String accountId, AnthropicUsageAndCostsIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAnthropicUsageAndCostsIntegrationAccount";
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
              + " updateAnthropicUsageAndCostsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateAnthropicUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnthropicUsageAndCostsIntegrationApi.updateAnthropicUsageAndCostsIntegrationAccount",
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Update an Anthropic Usage and Costs account.
   *
   * <p>See {@link #updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;AnthropicUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>>
      updateAnthropicUsageAndCostsIntegrationAccountWithHttpInfoAsync(
          String accountId, AnthropicUsageAndCostsIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAnthropicUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateAnthropicUsageAndCostsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateAnthropicUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/anthropic-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnthropicUsageAndCostsIntegrationApi.updateAnthropicUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnthropicUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<AnthropicUsageAndCostsIntegrationAccountResponse>() {});
  }
}
