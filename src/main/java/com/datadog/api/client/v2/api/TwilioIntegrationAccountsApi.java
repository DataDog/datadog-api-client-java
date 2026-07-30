package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TwilioAccountRequest;
import com.datadog.api.client.v2.model.TwilioAccountResponse;
import com.datadog.api.client.v2.model.TwilioAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioAccountsResponse;
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
   * <p>See {@link #createTwilioAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return TwilioAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioAccountResponse createTwilioAccount(TwilioAccountRequest body) throws ApiException {
    return createTwilioAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TwilioAccountResponse&gt;
   */
  public CompletableFuture<TwilioAccountResponse> createTwilioAccountAsync(
      TwilioAccountRequest body) {
    return createTwilioAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Twilio integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;TwilioAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TwilioAccountResponse> createTwilioAccountWithHttpInfo(
      TwilioAccountRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTwilioAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/twilio/interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.createTwilioAccount",
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
        new GenericType<TwilioAccountResponse>() {});
  }

  /**
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioAccountResponse>> createTwilioAccountWithHttpInfoAsync(
      TwilioAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTwilioAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/twilio/interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.createTwilioAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<TwilioAccountResponse>() {});
  }

  /**
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTwilioAccount(String accountId) throws ApiException {
    deleteTwilioAccountWithHttpInfo(accountId);
  }

  /**
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTwilioAccountAsync(String accountId) {
    return deleteTwilioAccountWithHttpInfoAsync(accountId)
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
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTwilioAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteTwilioAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.deleteTwilioAccount",
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
   * <p>See {@link #deleteTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTwilioAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteTwilioAccount";
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
              400, "Missing the required parameter 'accountId' when calling deleteTwilioAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.deleteTwilioAccount",
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
   * <p>See {@link #getTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return TwilioAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioAccountResponse getTwilioAccount(String accountId) throws ApiException {
    return getTwilioAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;TwilioAccountResponse&gt;
   */
  public CompletableFuture<TwilioAccountResponse> getTwilioAccountAsync(String accountId) {
    return getTwilioAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Twilio integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;TwilioAccountResponse&gt;
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
  public ApiResponse<TwilioAccountResponse> getTwilioAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getTwilioAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.getTwilioAccount",
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
        new GenericType<TwilioAccountResponse>() {});
  }

  /**
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioAccountResponse>> getTwilioAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling getTwilioAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.getTwilioAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<TwilioAccountResponse>() {});
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioAccountsWithHttpInfo}.
   *
   * @return TwilioAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioAccountsResponse listTwilioAccounts() throws ApiException {
    return listTwilioAccountsWithHttpInfo().getData();
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TwilioAccountsResponse&gt;
   */
  public CompletableFuture<TwilioAccountsResponse> listTwilioAccountsAsync() {
    return listTwilioAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Twilio integration accounts.
   *
   * @return ApiResponse&lt;TwilioAccountsResponse&gt;
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
  public ApiResponse<TwilioAccountsResponse> listTwilioAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTwilioAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/twilio/interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.listTwilioAccounts",
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
        new GenericType<TwilioAccountsResponse>() {});
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioAccountsResponse>>
      listTwilioAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listTwilioAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/twilio/interfaces/twilio/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.listTwilioAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioAccountsResponse>> result = new CompletableFuture<>();
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
        new GenericType<TwilioAccountsResponse>() {});
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return TwilioAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioAccountResponse updateTwilioAccount(
      String accountId, TwilioAccountUpdateRequest body) throws ApiException {
    return updateTwilioAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TwilioAccountResponse&gt;
   */
  public CompletableFuture<TwilioAccountResponse> updateTwilioAccountAsync(
      String accountId, TwilioAccountUpdateRequest body) {
    return updateTwilioAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Twilio integration account. The update is a partial merge: only the fields provided
   * are changed, so a name-only or settings-only update does not need to resend the full payload or
   * write-only credentials.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;TwilioAccountResponse&gt;
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
  public ApiResponse<TwilioAccountResponse> updateTwilioAccountWithHttpInfo(
      String accountId, TwilioAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateTwilioAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTwilioAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TwilioIntegrationAccountsApi.updateTwilioAccount",
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
        new GenericType<TwilioAccountResponse>() {});
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioAccountResponse>> updateTwilioAccountWithHttpInfoAsync(
      String accountId, TwilioAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTwilioAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling updateTwilioAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTwilioAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/twilio/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TwilioIntegrationAccountsApi.updateTwilioAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TwilioAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<TwilioAccountResponse>() {});
  }
}
