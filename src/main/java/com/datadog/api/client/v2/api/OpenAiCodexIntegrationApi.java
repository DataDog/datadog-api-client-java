package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAiCodexIntegrationApi {
  private ApiClient apiClient;

  public OpenAiCodexIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OpenAiCodexIntegrationApi(ApiClient apiClient) {
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
   * Create an OpenAI Codex integration account.
   *
   * <p>See {@link #createOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return OpenAICodexIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAICodexIntegrationAccountResponse createOpenAICodexIntegrationAccount(
      OpenAICodexIntegrationAccountCreateRequest body) throws ApiException {
    return createOpenAICodexIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an OpenAI Codex integration account.
   *
   * <p>See {@link #createOpenAICodexIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OpenAICodexIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAICodexIntegrationAccountResponse>
      createOpenAICodexIntegrationAccountAsync(OpenAICodexIntegrationAccountCreateRequest body) {
    return createOpenAICodexIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an OpenAI Codex integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAICodexIntegrationAccountResponse>
      createOpenAICodexIntegrationAccountWithHttpInfo(
          OpenAICodexIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOpenAICodexIntegrationAccount";
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
          "Missing the required parameter 'body' when calling createOpenAICodexIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-codex/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiCodexIntegrationApi.createOpenAICodexIntegrationAccount",
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }

  /**
   * Create an OpenAI Codex integration account.
   *
   * <p>See {@link #createOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>>
      createOpenAICodexIntegrationAccountWithHttpInfoAsync(
          OpenAICodexIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOpenAICodexIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createOpenAICodexIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-codex/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiCodexIntegrationApi.createOpenAICodexIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }

  /**
   * Delete an OpenAI Codex integration account.
   *
   * <p>See {@link #deleteOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOpenAICodexIntegrationAccount(String accountId) throws ApiException {
    deleteOpenAICodexIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an OpenAI Codex integration account.
   *
   * <p>See {@link #deleteOpenAICodexIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOpenAICodexIntegrationAccountAsync(String accountId) {
    return deleteOpenAICodexIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an OpenAI Codex integration account.
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
  public ApiResponse<Void> deleteOpenAICodexIntegrationAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAICodexIntegrationAccount";
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
              + " deleteOpenAICodexIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiCodexIntegrationApi.deleteOpenAICodexIntegrationAccount",
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
   * Delete an OpenAI Codex integration account.
   *
   * <p>See {@link #deleteOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOpenAICodexIntegrationAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAICodexIntegrationAccount";
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
                  + " deleteOpenAICodexIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiCodexIntegrationApi.deleteOpenAICodexIntegrationAccount",
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
   * Get an OpenAI Codex integration account.
   *
   * <p>See {@link #getOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return OpenAICodexIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAICodexIntegrationAccountResponse getOpenAICodexIntegrationAccount(String accountId)
      throws ApiException {
    return getOpenAICodexIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an OpenAI Codex integration account.
   *
   * <p>See {@link #getOpenAICodexIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;OpenAICodexIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAICodexIntegrationAccountResponse>
      getOpenAICodexIntegrationAccountAsync(String accountId) {
    return getOpenAICodexIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an OpenAI Codex integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAICodexIntegrationAccountResponse>
      getOpenAICodexIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOpenAICodexIntegrationAccount";
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
              + " getOpenAICodexIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiCodexIntegrationApi.getOpenAICodexIntegrationAccount",
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }

  /**
   * Get an OpenAI Codex integration account.
   *
   * <p>See {@link #getOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>>
      getOpenAICodexIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getOpenAICodexIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getOpenAICodexIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiCodexIntegrationApi.getOpenAICodexIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }

  /**
   * List OpenAI Codex integration accounts.
   *
   * <p>See {@link #listOpenAICodexIntegrationAccountsWithHttpInfo}.
   *
   * @return OpenAICodexIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAICodexIntegrationAccountsResponse listOpenAICodexIntegrationAccounts()
      throws ApiException {
    return listOpenAICodexIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List OpenAI Codex integration accounts.
   *
   * <p>See {@link #listOpenAICodexIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OpenAICodexIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<OpenAICodexIntegrationAccountsResponse>
      listOpenAICodexIntegrationAccountsAsync() {
    return listOpenAICodexIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List OpenAI Codex integration accounts.
   *
   * @return ApiResponse&lt;OpenAICodexIntegrationAccountsResponse&gt;
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
  public ApiResponse<OpenAICodexIntegrationAccountsResponse>
      listOpenAICodexIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOpenAICodexIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-codex/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiCodexIntegrationApi.listOpenAICodexIntegrationAccounts",
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
        new GenericType<OpenAICodexIntegrationAccountsResponse>() {});
  }

  /**
   * List OpenAI Codex integration accounts.
   *
   * <p>See {@link #listOpenAICodexIntegrationAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OpenAICodexIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountsResponse>>
      listOpenAICodexIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listOpenAICodexIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-codex/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiCodexIntegrationApi.listOpenAICodexIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountsResponse>> result =
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
        new GenericType<OpenAICodexIntegrationAccountsResponse>() {});
  }

  /**
   * Update an OpenAI Codex integration account.
   *
   * <p>See {@link #updateOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return OpenAICodexIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAICodexIntegrationAccountResponse updateOpenAICodexIntegrationAccount(
      String accountId, OpenAICodexIntegrationAccountUpdateRequest body) throws ApiException {
    return updateOpenAICodexIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an OpenAI Codex integration account.
   *
   * <p>See {@link #updateOpenAICodexIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OpenAICodexIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAICodexIntegrationAccountResponse>
      updateOpenAICodexIntegrationAccountAsync(
          String accountId, OpenAICodexIntegrationAccountUpdateRequest body) {
    return updateOpenAICodexIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an OpenAI Codex integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAICodexIntegrationAccountResponse>
      updateOpenAICodexIntegrationAccountWithHttpInfo(
          String accountId, OpenAICodexIntegrationAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAICodexIntegrationAccount";
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
              + " updateOpenAICodexIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateOpenAICodexIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiCodexIntegrationApi.updateOpenAICodexIntegrationAccount",
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }

  /**
   * Update an OpenAI Codex integration account.
   *
   * <p>See {@link #updateOpenAICodexIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpenAICodexIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>>
      updateOpenAICodexIntegrationAccountWithHttpInfoAsync(
          String accountId, OpenAICodexIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAICodexIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateOpenAICodexIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateOpenAICodexIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-codex/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiCodexIntegrationApi.updateOpenAICodexIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAICodexIntegrationAccountResponse>> result =
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
        new GenericType<OpenAICodexIntegrationAccountResponse>() {});
  }
}
