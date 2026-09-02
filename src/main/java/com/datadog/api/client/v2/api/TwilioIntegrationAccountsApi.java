package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationAccountsApi {
  private ApiClient apiClient;

  public TwilioIntegrationAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TwilioIntegrationAccountsApi(ApiClient apiClient) {
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
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse createTwilioIntegrationAccount(
      TwilioIntegrationAccountCreateRequest body) throws ApiException {
    return createTwilioIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> createTwilioIntegrationAccountAsync(
      TwilioIntegrationAccountCreateRequest body) {
    return createTwilioIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Twilio integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;TwilioIntegrationAccountResponse&gt;
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
  public ApiResponse<TwilioIntegrationAccountResponse> createTwilioIntegrationAccountWithHttpInfo(
      TwilioIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.createTwilioIntegrationAccount",
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }

  /**
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      createTwilioIntegrationAccountWithHttpInfoAsync(TwilioIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createTwilioIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.createTwilioIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }

  /**
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTwilioIntegrationAccount(String accountId) throws ApiException {
    deleteTwilioIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTwilioIntegrationAccountAsync(String accountId) {
    return deleteTwilioIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Twilio integration account.
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
  public ApiResponse<Void> deleteTwilioIntegrationAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTwilioIntegrationAccount";
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
          "Missing the required parameter 'accountId' when calling deleteTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.deleteTwilioIntegrationAccount",
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
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTwilioIntegrationAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteTwilioIntegrationAccount";
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
                  + " deleteTwilioIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.deleteTwilioIntegrationAccount",
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
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse getTwilioIntegrationAccount(String accountId)
      throws ApiException {
    return getTwilioIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> getTwilioIntegrationAccountAsync(
      String accountId) {
    return getTwilioIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Twilio integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;TwilioIntegrationAccountResponse&gt;
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
  public ApiResponse<TwilioIntegrationAccountResponse> getTwilioIntegrationAccountWithHttpInfo(
      String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTwilioIntegrationAccount";
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
          "Missing the required parameter 'accountId' when calling getTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.getTwilioIntegrationAccount",
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }

  /**
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      getTwilioIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getTwilioIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.getTwilioIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioIntegrationAccountsWithHttpInfo}.
   *
   * @return TwilioIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountsResponse listTwilioIntegrationAccounts() throws ApiException {
    return listTwilioIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TwilioIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountsResponse> listTwilioIntegrationAccountsAsync() {
    return listTwilioIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Twilio integration accounts.
   *
   * @return ApiResponse&lt;TwilioIntegrationAccountsResponse&gt;
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
  public ApiResponse<TwilioIntegrationAccountsResponse> listTwilioIntegrationAccountsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTwilioIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.listTwilioIntegrationAccounts",
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
        new GenericType<TwilioIntegrationAccountsResponse>() {});
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioIntegrationAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountsResponse>>
      listTwilioIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listTwilioIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.listTwilioIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountsResponse>> result =
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
        new GenericType<TwilioIntegrationAccountsResponse>() {});
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse updateTwilioIntegrationAccount(
      String accountId, TwilioIntegrationAccountUpdateRequest body) throws ApiException {
    return updateTwilioIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> updateTwilioIntegrationAccountAsync(
      String accountId, TwilioIntegrationAccountUpdateRequest body) {
    return updateTwilioIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Twilio integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;TwilioIntegrationAccountResponse&gt;
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
  public ApiResponse<TwilioIntegrationAccountResponse> updateTwilioIntegrationAccountWithHttpInfo(
      String accountId, TwilioIntegrationAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTwilioIntegrationAccount";
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
          "Missing the required parameter 'accountId' when calling updateTwilioIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.updateTwilioIntegrationAccount",
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      updateTwilioIntegrationAccountWithHttpInfoAsync(
          String accountId, TwilioIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateTwilioIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateTwilioIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.updateTwilioIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
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
        new GenericType<TwilioIntegrationAccountResponse>() {});
  }
}
