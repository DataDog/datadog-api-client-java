package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAiUsageAndCostsIntegrationApi {
  private ApiClient apiClient;

  public OpenAiUsageAndCostsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OpenAiUsageAndCostsIntegrationApi(ApiClient apiClient) {
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
   * Create an OpenAI Usage and Costs account.
   *
   * <p>See {@link #createOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return OpenAIUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAIUsageAndCostsIntegrationAccountResponse createOpenAIUsageAndCostsIntegrationAccount(
      OpenAIUsageAndCostsIntegrationAccountCreateRequest body) throws ApiException {
    return createOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an OpenAI Usage and Costs account.
   *
   * <p>See {@link #createOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAIUsageAndCostsIntegrationAccountResponse>
      createOpenAIUsageAndCostsIntegrationAccountAsync(
          OpenAIUsageAndCostsIntegrationAccountCreateRequest body) {
    return createOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an OpenAI Usage and Costs integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>
      createOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(
          OpenAIUsageAndCostsIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOpenAIUsageAndCostsIntegrationAccount";
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
              + " createOpenAIUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiUsageAndCostsIntegrationApi.createOpenAIUsageAndCostsIntegrationAccount",
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Create an OpenAI Usage and Costs account.
   *
   * <p>See {@link #createOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>>
      createOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(
          OpenAIUsageAndCostsIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOpenAIUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createOpenAIUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiUsageAndCostsIntegrationApi.createOpenAIUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Delete an OpenAI Usage and Costs account.
   *
   * <p>See {@link #deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOpenAIUsageAndCostsIntegrationAccount(String accountId) throws ApiException {
    deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an OpenAI Usage and Costs account.
   *
   * <p>See {@link #deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOpenAIUsageAndCostsIntegrationAccountAsync(
      String accountId) {
    return deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an OpenAI Usage and Costs integration account.
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
  public ApiResponse<Void> deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAIUsageAndCostsIntegrationAccount";
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
              + " deleteOpenAIUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiUsageAndCostsIntegrationApi.deleteOpenAIUsageAndCostsIntegrationAccount",
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
   * Delete an OpenAI Usage and Costs account.
   *
   * <p>See {@link #deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAIUsageAndCostsIntegrationAccount";
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
                  + " deleteOpenAIUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiUsageAndCostsIntegrationApi.deleteOpenAIUsageAndCostsIntegrationAccount",
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
   * Get an OpenAI Usage and Costs account.
   *
   * <p>See {@link #getOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return OpenAIUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAIUsageAndCostsIntegrationAccountResponse getOpenAIUsageAndCostsIntegrationAccount(
      String accountId) throws ApiException {
    return getOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an OpenAI Usage and Costs account.
   *
   * <p>See {@link #getOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAIUsageAndCostsIntegrationAccountResponse>
      getOpenAIUsageAndCostsIntegrationAccountAsync(String accountId) {
    return getOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an OpenAI Usage and Costs integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>
      getOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOpenAIUsageAndCostsIntegrationAccount";
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
              + " getOpenAIUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiUsageAndCostsIntegrationApi.getOpenAIUsageAndCostsIntegrationAccount",
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Get an OpenAI Usage and Costs account.
   *
   * <p>See {@link #getOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>>
      getOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getOpenAIUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getOpenAIUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiUsageAndCostsIntegrationApi.getOpenAIUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * List OpenAI Usage and Costs accounts.
   *
   * <p>See {@link #listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfo}.
   *
   * @return OpenAIUsageAndCostsIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAIUsageAndCostsIntegrationAccountsResponse listOpenAIUsageAndCostsIntegrationAccounts()
      throws ApiException {
    return listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List OpenAI Usage and Costs accounts.
   *
   * <p>See {@link #listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OpenAIUsageAndCostsIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<OpenAIUsageAndCostsIntegrationAccountsResponse>
      listOpenAIUsageAndCostsIntegrationAccountsAsync() {
    return listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List OpenAI Usage and Costs integration accounts.
   *
   * @return ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountsResponse&gt;
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
  public ApiResponse<OpenAIUsageAndCostsIntegrationAccountsResponse>
      listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOpenAIUsageAndCostsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiUsageAndCostsIntegrationApi.listOpenAIUsageAndCostsIntegrationAccounts",
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountsResponse>() {});
  }

  /**
   * List OpenAI Usage and Costs accounts.
   *
   * <p>See {@link #listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountsResponse>>
      listOpenAIUsageAndCostsIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listOpenAIUsageAndCostsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/openai-usage-and-costs/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiUsageAndCostsIntegrationApi.listOpenAIUsageAndCostsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountsResponse>> result =
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountsResponse>() {});
  }

  /**
   * Update an OpenAI Usage and Costs account.
   *
   * <p>See {@link #updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return OpenAIUsageAndCostsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpenAIUsageAndCostsIntegrationAccountResponse updateOpenAIUsageAndCostsIntegrationAccount(
      String accountId, OpenAIUsageAndCostsIntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an OpenAI Usage and Costs account.
   *
   * <p>See {@link #updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<OpenAIUsageAndCostsIntegrationAccountResponse>
      updateOpenAIUsageAndCostsIntegrationAccountAsync(
          String accountId, OpenAIUsageAndCostsIntegrationAccountUpdateRequest body) {
    return updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an OpenAI Usage and Costs integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;
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
  public ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>
      updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfo(
          String accountId, OpenAIUsageAndCostsIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAIUsageAndCostsIntegrationAccount";
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
              + " updateOpenAIUsageAndCostsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateOpenAIUsageAndCostsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpenAiUsageAndCostsIntegrationApi.updateOpenAIUsageAndCostsIntegrationAccount",
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }

  /**
   * Update an OpenAI Usage and Costs account.
   *
   * <p>See {@link #updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OpenAIUsageAndCostsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>>
      updateOpenAIUsageAndCostsIntegrationAccountWithHttpInfoAsync(
          String accountId, OpenAIUsageAndCostsIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAIUsageAndCostsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateOpenAIUsageAndCostsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateOpenAIUsageAndCostsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/openai-usage-and-costs/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpenAiUsageAndCostsIntegrationApi.updateOpenAIUsageAndCostsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpenAIUsageAndCostsIntegrationAccountResponse>> result =
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
        new GenericType<OpenAIUsageAndCostsIntegrationAccountResponse>() {});
  }
}
