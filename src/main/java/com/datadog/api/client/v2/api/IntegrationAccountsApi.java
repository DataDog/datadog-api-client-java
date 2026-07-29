package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;
import com.datadog.api.client.v2.model.IntegrationAccountRequest;
import com.datadog.api.client.v2.model.IntegrationAccountResponse;
import com.datadog.api.client.v2.model.IntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.IntegrationAccountsResponse;
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
   * Create an integration account.
   *
   * <p>See {@link #createIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param body (required)
   * @return IntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public IntegrationAccountResponse createIntegrationAccount(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      IntegrationAccountRequest body)
      throws ApiException {
    return createIntegrationAccountWithHttpInfo(integrationId, interfaceId, body).getData();
  }

  /**
   * Create an integration account.
   *
   * <p>See {@link #createIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IntegrationAccountResponse&gt;
   */
  public CompletableFuture<IntegrationAccountResponse> createIntegrationAccountAsync(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      IntegrationAccountRequest body) {
    return createIntegrationAccountWithHttpInfoAsync(integrationId, interfaceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an integration account for a given integration/interface.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param body (required)
   * @return ApiResponse&lt;IntegrationAccountResponse&gt;
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
  public ApiResponse<IntegrationAccountResponse> createIntegrationAccountWithHttpInfo(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      IntegrationAccountRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling createIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling createIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.createIntegrationAccount",
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
        new GenericType<IntegrationAccountResponse>() {});
  }

  /**
   * Create an integration account.
   *
   * <p>See {@link #createIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntegrationAccountResponse>>
      createIntegrationAccountWithHttpInfoAsync(
          IntegrationAccountIntegrationId integrationId,
          IntegrationAccountInterfaceId interfaceId,
          IntegrationAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " createIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " createIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.createIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<IntegrationAccountResponse>() {});
  }

  /**
   * Delete an integration account.
   *
   * <p>See {@link #deleteIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIntegrationAccount(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId)
      throws ApiException {
    deleteIntegrationAccountWithHttpInfo(integrationId, interfaceId, accountId);
  }

  /**
   * Delete an integration account.
   *
   * <p>See {@link #deleteIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIntegrationAccountAsync(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId) {
    return deleteIntegrationAccountWithHttpInfoAsync(integrationId, interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an integration account.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
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
  public ApiResponse<Void> deleteIntegrationAccountWithHttpInfo(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling deleteIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling deleteIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.deleteIntegrationAccount",
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
   * Delete an integration account.
   *
   * <p>See {@link #deleteIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIntegrationAccountWithHttpInfoAsync(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " deleteIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " deleteIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling deleteIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.deleteIntegrationAccount",
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
   * Get an integration account.
   *
   * <p>See {@link #getIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return IntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public IntegrationAccountResponse getIntegrationAccount(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId)
      throws ApiException {
    return getIntegrationAccountWithHttpInfo(integrationId, interfaceId, accountId).getData();
  }

  /**
   * Get an integration account.
   *
   * <p>See {@link #getIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;IntegrationAccountResponse&gt;
   */
  public CompletableFuture<IntegrationAccountResponse> getIntegrationAccountAsync(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId) {
    return getIntegrationAccountWithHttpInfoAsync(integrationId, interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single integration account.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;IntegrationAccountResponse&gt;
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
  public ApiResponse<IntegrationAccountResponse> getIntegrationAccountWithHttpInfo(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'integrationId' when calling getIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'interfaceId' when calling getIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.getIntegrationAccount",
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
        new GenericType<IntegrationAccountResponse>() {});
  }

  /**
   * Get an integration account.
   *
   * <p>See {@link #getIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntegrationAccountResponse>>
      getIntegrationAccountWithHttpInfoAsync(
          IntegrationAccountIntegrationId integrationId,
          IntegrationAccountInterfaceId interfaceId,
          String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling getIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling getIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling getIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.getIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<IntegrationAccountResponse>() {});
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @return IntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public IntegrationAccountsResponse listIntegrationAccounts(
      IntegrationAccountIntegrationId integrationId, IntegrationAccountInterfaceId interfaceId)
      throws ApiException {
    return listIntegrationAccountsWithHttpInfo(integrationId, interfaceId).getData();
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @return CompletableFuture&lt;IntegrationAccountsResponse&gt;
   */
  public CompletableFuture<IntegrationAccountsResponse> listIntegrationAccountsAsync(
      IntegrationAccountIntegrationId integrationId, IntegrationAccountInterfaceId interfaceId) {
    return listIntegrationAccountsWithHttpInfoAsync(integrationId, interfaceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the integration accounts for a given integration/interface.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @return ApiResponse&lt;IntegrationAccountsResponse&gt;
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
  public ApiResponse<IntegrationAccountsResponse> listIntegrationAccountsWithHttpInfo(
      IntegrationAccountIntegrationId integrationId, IntegrationAccountInterfaceId interfaceId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling listIntegrationAccounts");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'interfaceId' when calling listIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.listIntegrationAccounts",
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
        new GenericType<IntegrationAccountsResponse>() {});
  }

  /**
   * List integration accounts.
   *
   * <p>See {@link #listIntegrationAccountsWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntegrationAccountsResponse>>
      listIntegrationAccountsWithHttpInfoAsync(
          IntegrationAccountIntegrationId integrationId,
          IntegrationAccountInterfaceId interfaceId) {
    // Check if unstable operation is enabled
    String operationId = "listIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " listIntegrationAccounts"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling listIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.listIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntegrationAccountsResponse>> result =
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
        new GenericType<IntegrationAccountsResponse>() {});
  }

  /**
   * Update an integration account.
   *
   * <p>See {@link #updateIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return IntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public IntegrationAccountResponse updateIntegrationAccount(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId,
      IntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateIntegrationAccountWithHttpInfo(integrationId, interfaceId, accountId, body)
        .getData();
  }

  /**
   * Update an integration account.
   *
   * <p>See {@link #updateIntegrationAccountWithHttpInfoAsync}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IntegrationAccountResponse&gt;
   */
  public CompletableFuture<IntegrationAccountResponse> updateIntegrationAccountAsync(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId,
      IntegrationAccountUpdateRequest body) {
    return updateIntegrationAccountWithHttpInfoAsync(integrationId, interfaceId, accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an integration account. The update is a partial merge: only the fields provided are
   * changed, so a name-only or settings-only update does not need to resend the full integration
   * payload or write-only credentials. When present, <code>type</code> selects the
   * integration/interface variant. Top-level attributes and the contents of <code>authentication
   * </code> and <code>settings</code> are merged one level deep; the <code>dataflows</code> array
   * is merged by <code>id</code>.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;IntegrationAccountResponse&gt;
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
  public ApiResponse<IntegrationAccountResponse> updateIntegrationAccountWithHttpInfo(
      IntegrationAccountIntegrationId integrationId,
      IntegrationAccountInterfaceId interfaceId,
      String accountId,
      IntegrationAccountUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling updateIntegrationAccount");
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'interfaceId' when calling updateIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationAccountsApi.updateIntegrationAccount",
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
        new GenericType<IntegrationAccountResponse>() {});
  }

  /**
   * Update an integration account.
   *
   * <p>See {@link #updateIntegrationAccountWithHttpInfo}.
   *
   * @param integrationId Grouping/RBAC scope. Selects the integration whose accounts are addressed.
   *     (required)
   * @param interfaceId Selects the interface (source-type) within the integration. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntegrationAccountResponse>>
      updateIntegrationAccountWithHttpInfoAsync(
          IntegrationAccountIntegrationId integrationId,
          IntegrationAccountInterfaceId interfaceId,
          String accountId,
          IntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " updateIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " updateIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling updateIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/{integration_id}/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()))
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationAccountsApi.updateIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntegrationAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<IntegrationAccountResponse>() {});
  }
}
