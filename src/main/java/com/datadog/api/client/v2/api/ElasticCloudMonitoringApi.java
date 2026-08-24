package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudMonitoringApi {
  private ApiClient apiClient;

  public ElasticCloudMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ElasticCloudMonitoringApi(ApiClient apiClient) {
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
   * Create an Elastic Cloud monitoring account.
   *
   * <p>See {@link #createElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return ElasticCloudMonitoringAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudMonitoringAccountResponse createElasticCloudMonitoringAccount(
      ElasticCloudMonitoringAccountRequest body) throws ApiException {
    return createElasticCloudMonitoringAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an Elastic Cloud monitoring account.
   *
   * <p>See {@link #createElasticCloudMonitoringAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudMonitoringAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudMonitoringAccountResponse>
      createElasticCloudMonitoringAccountAsync(ElasticCloudMonitoringAccountRequest body) {
    return createElasticCloudMonitoringAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Elastic Cloud monitoring account.
   *
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;
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
  public ApiResponse<ElasticCloudMonitoringAccountResponse>
      createElasticCloudMonitoringAccountWithHttpInfo(ElasticCloudMonitoringAccountRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudMonitoringAccount";
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
          "Missing the required parameter 'body' when calling createElasticCloudMonitoringAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudMonitoringApi.createElasticCloudMonitoringAccount",
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }

  /**
   * Create an Elastic Cloud monitoring account.
   *
   * <p>See {@link #createElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>>
      createElasticCloudMonitoringAccountWithHttpInfoAsync(
          ElasticCloudMonitoringAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudMonitoringAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createElasticCloudMonitoringAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudMonitoringApi.createElasticCloudMonitoringAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }

  /**
   * Delete an Elastic Cloud monitoring account.
   *
   * <p>See {@link #deleteElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteElasticCloudMonitoringAccount(String accountId) throws ApiException {
    deleteElasticCloudMonitoringAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an Elastic Cloud monitoring account.
   *
   * <p>See {@link #deleteElasticCloudMonitoringAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteElasticCloudMonitoringAccountAsync(String accountId) {
    return deleteElasticCloudMonitoringAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Elastic Cloud monitoring account.
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
  public ApiResponse<Void> deleteElasticCloudMonitoringAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudMonitoringAccount";
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
              + " deleteElasticCloudMonitoringAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudMonitoringApi.deleteElasticCloudMonitoringAccount",
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
   * Delete an Elastic Cloud monitoring account.
   *
   * <p>See {@link #deleteElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteElasticCloudMonitoringAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudMonitoringAccount";
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
                  + " deleteElasticCloudMonitoringAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudMonitoringApi.deleteElasticCloudMonitoringAccount",
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
   * Get an Elastic Cloud monitoring account.
   *
   * <p>See {@link #getElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ElasticCloudMonitoringAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudMonitoringAccountResponse getElasticCloudMonitoringAccount(String accountId)
      throws ApiException {
    return getElasticCloudMonitoringAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an Elastic Cloud monitoring account.
   *
   * <p>See {@link #getElasticCloudMonitoringAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ElasticCloudMonitoringAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudMonitoringAccountResponse>
      getElasticCloudMonitoringAccountAsync(String accountId) {
    return getElasticCloudMonitoringAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Elastic Cloud monitoring account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;
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
  public ApiResponse<ElasticCloudMonitoringAccountResponse>
      getElasticCloudMonitoringAccountWithHttpInfo(String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudMonitoringAccount";
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
              + " getElasticCloudMonitoringAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudMonitoringApi.getElasticCloudMonitoringAccount",
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }

  /**
   * Get an Elastic Cloud monitoring account.
   *
   * <p>See {@link #getElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>>
      getElasticCloudMonitoringAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudMonitoringAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getElasticCloudMonitoringAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudMonitoringApi.getElasticCloudMonitoringAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }

  /**
   * List Elastic Cloud monitoring accounts.
   *
   * <p>See {@link #listElasticCloudMonitoringAccountsWithHttpInfo}.
   *
   * @return ElasticCloudMonitoringAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudMonitoringAccountsResponse listElasticCloudMonitoringAccounts()
      throws ApiException {
    return listElasticCloudMonitoringAccountsWithHttpInfo().getData();
  }

  /**
   * List Elastic Cloud monitoring accounts.
   *
   * <p>See {@link #listElasticCloudMonitoringAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ElasticCloudMonitoringAccountsResponse&gt;
   */
  public CompletableFuture<ElasticCloudMonitoringAccountsResponse>
      listElasticCloudMonitoringAccountsAsync() {
    return listElasticCloudMonitoringAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Elastic Cloud monitoring accounts.
   *
   * @return ApiResponse&lt;ElasticCloudMonitoringAccountsResponse&gt;
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
  public ApiResponse<ElasticCloudMonitoringAccountsResponse>
      listElasticCloudMonitoringAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudMonitoringAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudMonitoringApi.listElasticCloudMonitoringAccounts",
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
        new GenericType<ElasticCloudMonitoringAccountsResponse>() {});
  }

  /**
   * List Elastic Cloud monitoring accounts.
   *
   * <p>See {@link #listElasticCloudMonitoringAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudMonitoringAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountsResponse>>
      listElasticCloudMonitoringAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudMonitoringAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudMonitoringApi.listElasticCloudMonitoringAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountsResponse>> result =
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
        new GenericType<ElasticCloudMonitoringAccountsResponse>() {});
  }

  /**
   * Update an Elastic Cloud monitoring account.
   *
   * <p>See {@link #updateElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ElasticCloudMonitoringAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudMonitoringAccountResponse updateElasticCloudMonitoringAccount(
      String accountId, ElasticCloudMonitoringAccountUpdateRequest body) throws ApiException {
    return updateElasticCloudMonitoringAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an Elastic Cloud monitoring account.
   *
   * <p>See {@link #updateElasticCloudMonitoringAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudMonitoringAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudMonitoringAccountResponse>
      updateElasticCloudMonitoringAccountAsync(
          String accountId, ElasticCloudMonitoringAccountUpdateRequest body) {
    return updateElasticCloudMonitoringAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an Elastic Cloud monitoring account. The update is a partial merge: only the fields
   * provided are changed, so a name-only or settings-only update does not need to resend the full
   * payload or write-only credentials.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;
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
  public ApiResponse<ElasticCloudMonitoringAccountResponse>
      updateElasticCloudMonitoringAccountWithHttpInfo(
          String accountId, ElasticCloudMonitoringAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudMonitoringAccount";
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
              + " updateElasticCloudMonitoringAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateElasticCloudMonitoringAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudMonitoringApi.updateElasticCloudMonitoringAccount",
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }

  /**
   * Update an Elastic Cloud monitoring account.
   *
   * <p>See {@link #updateElasticCloudMonitoringAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudMonitoringAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>>
      updateElasticCloudMonitoringAccountWithHttpInfoAsync(
          String accountId, ElasticCloudMonitoringAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudMonitoringAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateElasticCloudMonitoringAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateElasticCloudMonitoringAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudMonitoringApi.updateElasticCloudMonitoringAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudMonitoringAccountResponse>> result =
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
        new GenericType<ElasticCloudMonitoringAccountResponse>() {});
  }
}
