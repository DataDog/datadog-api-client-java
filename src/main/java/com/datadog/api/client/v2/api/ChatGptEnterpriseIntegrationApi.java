package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGptEnterpriseIntegrationApi {
  private ApiClient apiClient;

  public ChatGptEnterpriseIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ChatGptEnterpriseIntegrationApi(ApiClient apiClient) {
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
   * Create a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #createChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return ChatGPTEnterpriseIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ChatGPTEnterpriseIntegrationAccountResponse createChatGPTEnterpriseIntegrationAccount(
      ChatGPTEnterpriseIntegrationAccountCreateRequest body) throws ApiException {
    return createChatGPTEnterpriseIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #createChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ChatGPTEnterpriseIntegrationAccountResponse>
      createChatGPTEnterpriseIntegrationAccountAsync(
          ChatGPTEnterpriseIntegrationAccountCreateRequest body) {
    return createChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a ChatGPT Enterprise integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
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
  public ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>
      createChatGPTEnterpriseIntegrationAccountWithHttpInfo(
          ChatGPTEnterpriseIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createChatGPTEnterpriseIntegrationAccount";
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
              + " createChatGPTEnterpriseIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/chatgpt-enterprise/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChatGptEnterpriseIntegrationApi.createChatGPTEnterpriseIntegrationAccount",
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }

  /**
   * Create a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #createChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>>
      createChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(
          ChatGPTEnterpriseIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createChatGPTEnterpriseIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createChatGPTEnterpriseIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/chatgpt-enterprise/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChatGptEnterpriseIntegrationApi.createChatGPTEnterpriseIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }

  /**
   * Delete a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #deleteChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteChatGPTEnterpriseIntegrationAccount(String accountId) throws ApiException {
    deleteChatGPTEnterpriseIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #deleteChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteChatGPTEnterpriseIntegrationAccountAsync(String accountId) {
    return deleteChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a ChatGPT Enterprise integration account.
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
  public ApiResponse<Void> deleteChatGPTEnterpriseIntegrationAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteChatGPTEnterpriseIntegrationAccount";
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
              + " deleteChatGPTEnterpriseIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChatGptEnterpriseIntegrationApi.deleteChatGPTEnterpriseIntegrationAccount",
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
   * Delete a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #deleteChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteChatGPTEnterpriseIntegrationAccount";
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
                  + " deleteChatGPTEnterpriseIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChatGptEnterpriseIntegrationApi.deleteChatGPTEnterpriseIntegrationAccount",
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
   * Get a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #getChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ChatGPTEnterpriseIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ChatGPTEnterpriseIntegrationAccountResponse getChatGPTEnterpriseIntegrationAccount(
      String accountId) throws ApiException {
    return getChatGPTEnterpriseIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #getChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ChatGPTEnterpriseIntegrationAccountResponse>
      getChatGPTEnterpriseIntegrationAccountAsync(String accountId) {
    return getChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a ChatGPT Enterprise integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
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
  public ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>
      getChatGPTEnterpriseIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getChatGPTEnterpriseIntegrationAccount";
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
              + " getChatGPTEnterpriseIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChatGptEnterpriseIntegrationApi.getChatGPTEnterpriseIntegrationAccount",
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }

  /**
   * Get a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #getChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>>
      getChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getChatGPTEnterpriseIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getChatGPTEnterpriseIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChatGptEnterpriseIntegrationApi.getChatGPTEnterpriseIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }

  /**
   * List ChatGPT Enterprise integration accounts.
   *
   * <p>See {@link #listChatGPTEnterpriseIntegrationAccountsWithHttpInfo}.
   *
   * @return ChatGPTEnterpriseIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public ChatGPTEnterpriseIntegrationAccountsResponse listChatGPTEnterpriseIntegrationAccounts()
      throws ApiException {
    return listChatGPTEnterpriseIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List ChatGPT Enterprise integration accounts.
   *
   * <p>See {@link #listChatGPTEnterpriseIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ChatGPTEnterpriseIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<ChatGPTEnterpriseIntegrationAccountsResponse>
      listChatGPTEnterpriseIntegrationAccountsAsync() {
    return listChatGPTEnterpriseIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List ChatGPT Enterprise integration accounts.
   *
   * @return ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountsResponse&gt;
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
  public ApiResponse<ChatGPTEnterpriseIntegrationAccountsResponse>
      listChatGPTEnterpriseIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listChatGPTEnterpriseIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/chatgpt-enterprise/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChatGptEnterpriseIntegrationApi.listChatGPTEnterpriseIntegrationAccounts",
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountsResponse>() {});
  }

  /**
   * List ChatGPT Enterprise integration accounts.
   *
   * <p>See {@link #listChatGPTEnterpriseIntegrationAccountsWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountsResponse>>
      listChatGPTEnterpriseIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listChatGPTEnterpriseIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/chatgpt-enterprise/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChatGptEnterpriseIntegrationApi.listChatGPTEnterpriseIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountsResponse>> result =
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountsResponse>() {});
  }

  /**
   * Update a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #updateChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ChatGPTEnterpriseIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ChatGPTEnterpriseIntegrationAccountResponse updateChatGPTEnterpriseIntegrationAccount(
      String accountId, ChatGPTEnterpriseIntegrationAccountUpdateRequest body) throws ApiException {
    return updateChatGPTEnterpriseIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #updateChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ChatGPTEnterpriseIntegrationAccountResponse>
      updateChatGPTEnterpriseIntegrationAccountAsync(
          String accountId, ChatGPTEnterpriseIntegrationAccountUpdateRequest body) {
    return updateChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a ChatGPT Enterprise integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;
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
  public ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>
      updateChatGPTEnterpriseIntegrationAccountWithHttpInfo(
          String accountId, ChatGPTEnterpriseIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateChatGPTEnterpriseIntegrationAccount";
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
              + " updateChatGPTEnterpriseIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateChatGPTEnterpriseIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ChatGptEnterpriseIntegrationApi.updateChatGPTEnterpriseIntegrationAccount",
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }

  /**
   * Update a ChatGPT Enterprise integration account.
   *
   * <p>See {@link #updateChatGPTEnterpriseIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ChatGPTEnterpriseIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>>
      updateChatGPTEnterpriseIntegrationAccountWithHttpInfoAsync(
          String accountId, ChatGPTEnterpriseIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateChatGPTEnterpriseIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateChatGPTEnterpriseIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateChatGPTEnterpriseIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/chatgpt-enterprise/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ChatGptEnterpriseIntegrationApi.updateChatGPTEnterpriseIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ChatGPTEnterpriseIntegrationAccountResponse>> result =
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
        new GenericType<ChatGPTEnterpriseIntegrationAccountResponse>() {});
  }
}
