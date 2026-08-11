package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountsResponse;
import com.datadog.api.client.v2.model.TwilioInterfaceType;
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param body (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse createTwilioIntegrationAccount(
      TwilioInterfaceType interfaceId, TwilioIntegrationAccountRequest body) throws ApiException {
    return createTwilioIntegrationAccountWithHttpInfo(interfaceId, body).getData();
  }

  /**
   * Create a Twilio integration account.
   *
   * <p>See {@link #createTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> createTwilioIntegrationAccountAsync(
      TwilioInterfaceType interfaceId, TwilioIntegrationAccountRequest body) {
    return createTwilioIntegrationAccountWithHttpInfoAsync(interfaceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Twilio integration account for a given interface.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TwilioIntegrationAccountResponse> createTwilioIntegrationAccountWithHttpInfo(
      TwilioInterfaceType interfaceId, TwilioIntegrationAccountRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling"
              + " createTwilioIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      createTwilioIntegrationAccountWithHttpInfoAsync(
          TwilioInterfaceType interfaceId, TwilioIntegrationAccountRequest body) {
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

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " createTwilioIntegrationAccount"));
      return result;
    }

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
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTwilioIntegrationAccount(TwilioInterfaceType interfaceId, String accountId)
      throws ApiException {
    deleteTwilioIntegrationAccountWithHttpInfo(interfaceId, accountId);
  }

  /**
   * Delete a Twilio integration account.
   *
   * <p>See {@link #deleteTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTwilioIntegrationAccountAsync(
      TwilioInterfaceType interfaceId, String accountId) {
    return deleteTwilioIntegrationAccountWithHttpInfoAsync(interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Twilio integration account.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
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
  public ApiResponse<Void> deleteTwilioIntegrationAccountWithHttpInfo(
      TwilioInterfaceType interfaceId, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling"
              + " deleteTwilioIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling deleteTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTwilioIntegrationAccountWithHttpInfoAsync(
      TwilioInterfaceType interfaceId, String accountId) {
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

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " deleteTwilioIntegrationAccount"));
      return result;
    }

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
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse getTwilioIntegrationAccount(
      TwilioInterfaceType interfaceId, String accountId) throws ApiException {
    return getTwilioIntegrationAccountWithHttpInfo(interfaceId, accountId).getData();
  }

  /**
   * Get a Twilio integration account.
   *
   * <p>See {@link #getTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> getTwilioIntegrationAccountAsync(
      TwilioInterfaceType interfaceId, String accountId) {
    return getTwilioIntegrationAccountWithHttpInfoAsync(interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Twilio integration account.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
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
      TwilioInterfaceType interfaceId, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling getTwilioIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling getTwilioIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      getTwilioIntegrationAccountWithHttpInfoAsync(
          TwilioInterfaceType interfaceId, String accountId) {
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

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " getTwilioIntegrationAccount"));
      return result;
    }

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
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @return TwilioIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountsResponse listTwilioIntegrationAccounts(
      TwilioInterfaceType interfaceId) throws ApiException {
    return listTwilioIntegrationAccountsWithHttpInfo(interfaceId).getData();
  }

  /**
   * List Twilio integration accounts.
   *
   * <p>See {@link #listTwilioIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountsResponse> listTwilioIntegrationAccountsAsync(
      TwilioInterfaceType interfaceId) {
    return listTwilioIntegrationAccountsWithHttpInfoAsync(interfaceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Twilio integration accounts for a given interface.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
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
  public ApiResponse<TwilioIntegrationAccountsResponse> listTwilioIntegrationAccountsWithHttpInfo(
      TwilioInterfaceType interfaceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTwilioIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling"
              + " listTwilioIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountsResponse>>
      listTwilioIntegrationAccountsWithHttpInfoAsync(TwilioInterfaceType interfaceId) {
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

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " listTwilioIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return TwilioIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TwilioIntegrationAccountResponse updateTwilioIntegrationAccount(
      TwilioInterfaceType interfaceId, String accountId, TwilioIntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateTwilioIntegrationAccountWithHttpInfo(interfaceId, accountId, body).getData();
  }

  /**
   * Update a Twilio integration account.
   *
   * <p>See {@link #updateTwilioIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TwilioIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TwilioIntegrationAccountResponse> updateTwilioIntegrationAccountAsync(
      TwilioInterfaceType interfaceId,
      String accountId,
      TwilioIntegrationAccountUpdateRequest body) {
    return updateTwilioIntegrationAccountWithHttpInfoAsync(interfaceId, accountId, body)
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TwilioIntegrationAccountResponse> updateTwilioIntegrationAccountWithHttpInfo(
      TwilioInterfaceType interfaceId, String accountId, TwilioIntegrationAccountUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTwilioIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling"
              + " updateTwilioIntegrationAccount");
    }

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
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
   * @param interfaceId Selects the Twilio interface (source-type). Supported values: <code>twilio
   *     </code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TwilioIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>>
      updateTwilioIntegrationAccountWithHttpInfoAsync(
          TwilioInterfaceType interfaceId,
          String accountId,
          TwilioIntegrationAccountUpdateRequest body) {
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

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<TwilioIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " updateTwilioIntegrationAccount"));
      return result;
    }

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
        "/api/v2/integrations/twilio/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
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
