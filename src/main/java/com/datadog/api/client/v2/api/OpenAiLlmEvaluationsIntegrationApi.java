package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAiLlmEvaluationsIntegrationApi {
  private ApiClient apiClient;

  public OpenAiLlmEvaluationsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OpenAiLlmEvaluationsIntegrationApi(ApiClient apiClient) {
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
   * Create an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #createOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return OpenAILLMEvaluationsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAILLMEvaluationsIntegrationAccountResponse
      createOpenAILLMEvaluationsIntegrationAccount(
          OpenAILLMEvaluationsIntegrationAccountCreateRequest body) throws ApiException {
    return createOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #createOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAILLMEvaluationsIntegrationAccountResponse>
      createOpenAILLMEvaluationsIntegrationAccountAsync(
          OpenAILLMEvaluationsIntegrationAccountCreateRequest body) {
    return createOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an OpenAI LLM Evaluations integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>
      createOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(
          OpenAILLMEvaluationsIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOpenAILLMEvaluationsIntegrationAccount";
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
              + " createOpenAILLMEvaluationsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-llm-evaluations/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiLlmEvaluationsIntegrationApi.createOpenAILLMEvaluationsIntegrationAccount",
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }

  /**
   * Create an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #createOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>>
      createOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(
          OpenAILLMEvaluationsIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOpenAILLMEvaluationsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createOpenAILLMEvaluationsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-llm-evaluations/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiLlmEvaluationsIntegrationApi.createOpenAILLMEvaluationsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }

  /**
   * Delete an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOpenAILLMEvaluationsIntegrationAccount(String accountId) throws ApiException {
    deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOpenAILLMEvaluationsIntegrationAccountAsync(
      String accountId) {
    return deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an OpenAI LLM Evaluations integration account.
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
  public ApiResponse<Void> deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(
      String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAILLMEvaluationsIntegrationAccount";
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
              + " deleteOpenAILLMEvaluationsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiLlmEvaluationsIntegrationApi.deleteOpenAILLMEvaluationsIntegrationAccount",
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
   * Delete an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAILLMEvaluationsIntegrationAccount";
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
                  + " deleteOpenAILLMEvaluationsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiLlmEvaluationsIntegrationApi.deleteOpenAILLMEvaluationsIntegrationAccount",
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
   * Get an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #getOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return OpenAILLMEvaluationsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAILLMEvaluationsIntegrationAccountResponse getOpenAILLMEvaluationsIntegrationAccount(
      String accountId) throws ApiException {
    return getOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #getOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAILLMEvaluationsIntegrationAccountResponse>
      getOpenAILLMEvaluationsIntegrationAccountAsync(String accountId) {
    return getOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an OpenAI LLM Evaluations integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>
      getOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOpenAILLMEvaluationsIntegrationAccount";
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
              + " getOpenAILLMEvaluationsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiLlmEvaluationsIntegrationApi.getOpenAILLMEvaluationsIntegrationAccount",
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }

  /**
   * Get an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #getOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>>
      getOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getOpenAILLMEvaluationsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getOpenAILLMEvaluationsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiLlmEvaluationsIntegrationApi.getOpenAILLMEvaluationsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }

  /**
   * List OpenAI LLM Evaluations accounts.
   *
   * <p>See {@link #listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfo}.
   *
   * @return OpenAILLMEvaluationsIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAILLMEvaluationsIntegrationAccountsResponse
      listOpenAILLMEvaluationsIntegrationAccounts() throws ApiException {
    return listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List OpenAI LLM Evaluations accounts.
   *
   * <p>See {@link #listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OpenAILLMEvaluationsIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<OpenAILLMEvaluationsIntegrationAccountsResponse>
      listOpenAILLMEvaluationsIntegrationAccountsAsync() {
    return listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List OpenAI LLM Evaluations integration accounts.
   *
   * @return ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountsResponse&gt;
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
  public ApiResponse<OpenAILLMEvaluationsIntegrationAccountsResponse>
      listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOpenAILLMEvaluationsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-llm-evaluations/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiLlmEvaluationsIntegrationApi.listOpenAILLMEvaluationsIntegrationAccounts",
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountsResponse>() {});
  }

  /**
   * List OpenAI LLM Evaluations accounts.
   *
   * <p>See {@link #listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountsResponse>>
      listOpenAILLMEvaluationsIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listOpenAILLMEvaluationsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-llm-evaluations/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiLlmEvaluationsIntegrationApi.listOpenAILLMEvaluationsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountsResponse>> result =
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountsResponse>() {});
  }

  /**
   * Update an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return OpenAILLMEvaluationsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAILLMEvaluationsIntegrationAccountResponse
      updateOpenAILLMEvaluationsIntegrationAccount(
          String accountId, OpenAILLMEvaluationsIntegrationAccountUpdateRequest body)
          throws ApiException {
    return updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAILLMEvaluationsIntegrationAccountResponse>
      updateOpenAILLMEvaluationsIntegrationAccountAsync(
          String accountId, OpenAILLMEvaluationsIntegrationAccountUpdateRequest body) {
    return updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an OpenAI LLM Evaluations integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>
      updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfo(
          String accountId, OpenAILLMEvaluationsIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAILLMEvaluationsIntegrationAccount";
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
              + " updateOpenAILLMEvaluationsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateOpenAILLMEvaluationsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiLlmEvaluationsIntegrationApi.updateOpenAILLMEvaluationsIntegrationAccount",
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }

  /**
   * Update an OpenAI LLM Evaluations account.
   *
   * <p>See {@link #updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAILLMEvaluationsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>>
      updateOpenAILLMEvaluationsIntegrationAccountWithHttpInfoAsync(
          String accountId, OpenAILLMEvaluationsIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAILLMEvaluationsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateOpenAILLMEvaluationsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateOpenAILLMEvaluationsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-llm-evaluations/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiLlmEvaluationsIntegrationApi.updateOpenAILLMEvaluationsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAILLMEvaluationsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAILLMEvaluationsIntegrationAccountResponse>() {});
  }
}
