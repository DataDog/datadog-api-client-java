package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountsResponse;
import com.datadog.api.client.v2.model.ElasticCloudInterfaceId;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationAccountsApi {
  private ApiClient apiClient;

  public ElasticCloudIntegrationAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ElasticCloudIntegrationAccountsApi(ApiClient apiClient) {
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
   * Create an Elastic Cloud integration account.
   *
   * <p>See {@link #createElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param body (required)
   * @return ElasticCloudIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudIntegrationAccountResponse createElasticCloudIntegrationAccount(
      ElasticCloudInterfaceId interfaceId, ElasticCloudIntegrationAccountRequest body)
      throws ApiException {
    return createElasticCloudIntegrationAccountWithHttpInfo(interfaceId, body).getData();
  }

  /**
   * Create an Elastic Cloud integration account.
   *
   * <p>See {@link #createElasticCloudIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>
      createElasticCloudIntegrationAccountAsync(
          ElasticCloudInterfaceId interfaceId, ElasticCloudIntegrationAccountRequest body) {
    return createElasticCloudIntegrationAccountWithHttpInfoAsync(interfaceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Elastic Cloud integration account for a given interface.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountResponse>
      createElasticCloudIntegrationAccountWithHttpInfo(
          ElasticCloudInterfaceId interfaceId, ElasticCloudIntegrationAccountRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudIntegrationAccount";
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
              + " createElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudIntegrationAccountsApi.createElasticCloudIntegrationAccount",
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Create an Elastic Cloud integration account.
   *
   * <p>See {@link #createElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>>
      createElasticCloudIntegrationAccountWithHttpInfoAsync(
          ElasticCloudInterfaceId interfaceId, ElasticCloudIntegrationAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " createElasticCloudIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createElasticCloudIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudIntegrationAccountsApi.createElasticCloudIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Delete an Elastic Cloud integration account.
   *
   * <p>See {@link #deleteElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteElasticCloudIntegrationAccount(
      ElasticCloudInterfaceId interfaceId, String accountId) throws ApiException {
    deleteElasticCloudIntegrationAccountWithHttpInfo(interfaceId, accountId);
  }

  /**
   * Delete an Elastic Cloud integration account.
   *
   * <p>See {@link #deleteElasticCloudIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteElasticCloudIntegrationAccountAsync(
      ElasticCloudInterfaceId interfaceId, String accountId) {
    return deleteElasticCloudIntegrationAccountWithHttpInfoAsync(interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Elastic Cloud integration account.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
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
  public ApiResponse<Void> deleteElasticCloudIntegrationAccountWithHttpInfo(
      ElasticCloudInterfaceId interfaceId, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudIntegrationAccount";
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
              + " deleteElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " deleteElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudIntegrationAccountsApi.deleteElasticCloudIntegrationAccount",
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
   * Delete an Elastic Cloud integration account.
   *
   * <p>See {@link #deleteElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteElasticCloudIntegrationAccountWithHttpInfoAsync(
      ElasticCloudInterfaceId interfaceId, String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudIntegrationAccount";
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
                  + " deleteElasticCloudIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " deleteElasticCloudIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudIntegrationAccountsApi.deleteElasticCloudIntegrationAccount",
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
   * Get an Elastic Cloud integration account.
   *
   * <p>See {@link #getElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return ElasticCloudIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudIntegrationAccountResponse getElasticCloudIntegrationAccount(
      ElasticCloudInterfaceId interfaceId, String accountId) throws ApiException {
    return getElasticCloudIntegrationAccountWithHttpInfo(interfaceId, accountId).getData();
  }

  /**
   * Get an Elastic Cloud integration account.
   *
   * <p>See {@link #getElasticCloudIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>
      getElasticCloudIntegrationAccountAsync(
          ElasticCloudInterfaceId interfaceId, String accountId) {
    return getElasticCloudIntegrationAccountWithHttpInfoAsync(interfaceId, accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Elastic Cloud integration account.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountResponse>
      getElasticCloudIntegrationAccountWithHttpInfo(
          ElasticCloudInterfaceId interfaceId, String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudIntegrationAccount";
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
              + " getElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " getElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudIntegrationAccountsApi.getElasticCloudIntegrationAccount",
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Get an Elastic Cloud integration account.
   *
   * <p>See {@link #getElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>>
      getElasticCloudIntegrationAccountWithHttpInfoAsync(
          ElasticCloudInterfaceId interfaceId, String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " getElasticCloudIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getElasticCloudIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudIntegrationAccountsApi.getElasticCloudIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * List Elastic Cloud integration accounts.
   *
   * <p>See {@link #listElasticCloudIntegrationAccountsWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @return ElasticCloudIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudIntegrationAccountsResponse listElasticCloudIntegrationAccounts(
      ElasticCloudInterfaceId interfaceId) throws ApiException {
    return listElasticCloudIntegrationAccountsWithHttpInfo(interfaceId).getData();
  }

  /**
   * List Elastic Cloud integration accounts.
   *
   * <p>See {@link #listElasticCloudIntegrationAccountsWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @return CompletableFuture&lt;ElasticCloudIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<ElasticCloudIntegrationAccountsResponse>
      listElasticCloudIntegrationAccountsAsync(ElasticCloudInterfaceId interfaceId) {
    return listElasticCloudIntegrationAccountsWithHttpInfoAsync(interfaceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Elastic Cloud integration accounts for a given interface.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountsResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountsResponse>
      listElasticCloudIntegrationAccountsWithHttpInfo(ElasticCloudInterfaceId interfaceId)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudIntegrationAccounts";
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
              + " listElasticCloudIntegrationAccounts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudIntegrationAccountsApi.listElasticCloudIntegrationAccounts",
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
        new GenericType<ElasticCloudIntegrationAccountsResponse>() {});
  }

  /**
   * List Elastic Cloud integration accounts.
   *
   * <p>See {@link #listElasticCloudIntegrationAccountsWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>>
      listElasticCloudIntegrationAccountsWithHttpInfoAsync(ElasticCloudInterfaceId interfaceId) {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " listElasticCloudIntegrationAccounts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudIntegrationAccountsApi.listElasticCloudIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountsResponse>> result =
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
        new GenericType<ElasticCloudIntegrationAccountsResponse>() {});
  }

  /**
   * Update an Elastic Cloud integration account.
   *
   * <p>See {@link #updateElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ElasticCloudIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudIntegrationAccountResponse updateElasticCloudIntegrationAccount(
      ElasticCloudInterfaceId interfaceId,
      String accountId,
      ElasticCloudIntegrationAccountUpdateRequest body)
      throws ApiException {
    return updateElasticCloudIntegrationAccountWithHttpInfo(interfaceId, accountId, body).getData();
  }

  /**
   * Update an Elastic Cloud integration account.
   *
   * <p>See {@link #updateElasticCloudIntegrationAccountWithHttpInfoAsync}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudIntegrationAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudIntegrationAccountResponse>
      updateElasticCloudIntegrationAccountAsync(
          ElasticCloudInterfaceId interfaceId,
          String accountId,
          ElasticCloudIntegrationAccountUpdateRequest body) {
    return updateElasticCloudIntegrationAccountWithHttpInfoAsync(interfaceId, accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an Elastic Cloud integration account. The update is a partial merge: only the fields
   * provided are changed, so a name-only or settings-only update does not need to resend the full
   * payload or write-only credentials.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;
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
  public ApiResponse<ElasticCloudIntegrationAccountResponse>
      updateElasticCloudIntegrationAccountWithHttpInfo(
          ElasticCloudInterfaceId interfaceId,
          String accountId,
          ElasticCloudIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudIntegrationAccount";
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
              + " updateElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling"
              + " updateElasticCloudIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateElasticCloudIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudIntegrationAccountsApi.updateElasticCloudIntegrationAccount",
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }

  /**
   * Update an Elastic Cloud integration account.
   *
   * <p>See {@link #updateElasticCloudIntegrationAccountWithHttpInfo}.
   *
   * @param interfaceId Selects the Elastic Cloud interface (source-type). Supported values: <code>
   *     elastic-cloud</code>, <code>elastic-cloud-ccm</code>. (required)
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>>
      updateElasticCloudIntegrationAccountWithHttpInfoAsync(
          ElasticCloudInterfaceId interfaceId,
          String accountId,
          ElasticCloudIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling"
                  + " updateElasticCloudIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateElasticCloudIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateElasticCloudIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/{interface_id}/accounts/{account_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()))
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudIntegrationAccountsApi.updateElasticCloudIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudIntegrationAccountResponse>> result =
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
        new GenericType<ElasticCloudIntegrationAccountResponse>() {});
  }
}
