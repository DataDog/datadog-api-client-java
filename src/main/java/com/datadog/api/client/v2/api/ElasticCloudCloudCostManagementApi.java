package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudCloudCostManagementApi {
  private ApiClient apiClient;

  public ElasticCloudCloudCostManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ElasticCloudCloudCostManagementApi(ApiClient apiClient) {
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
   * Create an Elastic Cloud CCM account.
   *
   * <p>See {@link #createElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return ElasticCloudCcmAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudCcmAccountResponse createElasticCloudCcmAccount(
      ElasticCloudCcmAccountRequest body) throws ApiException {
    return createElasticCloudCcmAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an Elastic Cloud CCM account.
   *
   * <p>See {@link #createElasticCloudCcmAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudCcmAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudCcmAccountResponse> createElasticCloudCcmAccountAsync(
      ElasticCloudCcmAccountRequest body) {
    return createElasticCloudCcmAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Elastic Cloud CCM (Cloud Cost Management) account.
   *
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;
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
  public ApiResponse<ElasticCloudCcmAccountResponse> createElasticCloudCcmAccountWithHttpInfo(
      ElasticCloudCcmAccountRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudCcmAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createElasticCloudCcmAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudCloudCostManagementApi.createElasticCloudCcmAccount",
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }

  /**
   * Create an Elastic Cloud CCM account.
   *
   * <p>See {@link #createElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>>
      createElasticCloudCcmAccountWithHttpInfoAsync(ElasticCloudCcmAccountRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createElasticCloudCcmAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createElasticCloudCcmAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudCloudCostManagementApi.createElasticCloudCcmAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }

  /**
   * Delete an Elastic Cloud CCM account.
   *
   * <p>See {@link #deleteElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteElasticCloudCcmAccount(String accountId) throws ApiException {
    deleteElasticCloudCcmAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an Elastic Cloud CCM account.
   *
   * <p>See {@link #deleteElasticCloudCcmAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteElasticCloudCcmAccountAsync(String accountId) {
    return deleteElasticCloudCcmAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Elastic Cloud CCM (Cloud Cost Management) account.
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
  public ApiResponse<Void> deleteElasticCloudCcmAccountWithHttpInfo(String accountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudCcmAccount";
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
          "Missing the required parameter 'accountId' when calling deleteElasticCloudCcmAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudCloudCostManagementApi.deleteElasticCloudCcmAccount",
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
   * Delete an Elastic Cloud CCM account.
   *
   * <p>See {@link #deleteElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteElasticCloudCcmAccountWithHttpInfoAsync(
      String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteElasticCloudCcmAccount";
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
                  + " deleteElasticCloudCcmAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudCloudCostManagementApi.deleteElasticCloudCcmAccount",
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
   * Get an Elastic Cloud CCM account.
   *
   * <p>See {@link #getElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ElasticCloudCcmAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudCcmAccountResponse getElasticCloudCcmAccount(String accountId)
      throws ApiException {
    return getElasticCloudCcmAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get an Elastic Cloud CCM account.
   *
   * <p>See {@link #getElasticCloudCcmAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ElasticCloudCcmAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudCcmAccountResponse> getElasticCloudCcmAccountAsync(
      String accountId) {
    return getElasticCloudCcmAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Elastic Cloud CCM (Cloud Cost Management) account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;
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
  public ApiResponse<ElasticCloudCcmAccountResponse> getElasticCloudCcmAccountWithHttpInfo(
      String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudCcmAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getElasticCloudCcmAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudCloudCostManagementApi.getElasticCloudCcmAccount",
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }

  /**
   * Get an Elastic Cloud CCM account.
   *
   * <p>See {@link #getElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>>
      getElasticCloudCcmAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getElasticCloudCcmAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling getElasticCloudCcmAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudCloudCostManagementApi.getElasticCloudCcmAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }

  /**
   * List Elastic Cloud CCM accounts.
   *
   * <p>See {@link #listElasticCloudCcmAccountsWithHttpInfo}.
   *
   * @return ElasticCloudCcmAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudCcmAccountsResponse listElasticCloudCcmAccounts() throws ApiException {
    return listElasticCloudCcmAccountsWithHttpInfo().getData();
  }

  /**
   * List Elastic Cloud CCM accounts.
   *
   * <p>See {@link #listElasticCloudCcmAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ElasticCloudCcmAccountsResponse&gt;
   */
  public CompletableFuture<ElasticCloudCcmAccountsResponse> listElasticCloudCcmAccountsAsync() {
    return listElasticCloudCcmAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Elastic Cloud CCM (Cloud Cost Management) accounts.
   *
   * @return ApiResponse&lt;ElasticCloudCcmAccountsResponse&gt;
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
  public ApiResponse<ElasticCloudCcmAccountsResponse> listElasticCloudCcmAccountsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudCcmAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudCloudCostManagementApi.listElasticCloudCcmAccounts",
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
        new GenericType<ElasticCloudCcmAccountsResponse>() {});
  }

  /**
   * List Elastic Cloud CCM accounts.
   *
   * <p>See {@link #listElasticCloudCcmAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudCcmAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudCcmAccountsResponse>>
      listElasticCloudCcmAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listElasticCloudCcmAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudCloudCostManagementApi.listElasticCloudCcmAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountsResponse>> result =
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
        new GenericType<ElasticCloudCcmAccountsResponse>() {});
  }

  /**
   * Update an Elastic Cloud CCM account.
   *
   * <p>See {@link #updateElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ElasticCloudCcmAccountResponse
   * @throws ApiException if fails to make API call
   */
  public ElasticCloudCcmAccountResponse updateElasticCloudCcmAccount(
      String accountId, ElasticCloudCcmAccountUpdateRequest body) throws ApiException {
    return updateElasticCloudCcmAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an Elastic Cloud CCM account.
   *
   * <p>See {@link #updateElasticCloudCcmAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ElasticCloudCcmAccountResponse&gt;
   */
  public CompletableFuture<ElasticCloudCcmAccountResponse> updateElasticCloudCcmAccountAsync(
      String accountId, ElasticCloudCcmAccountUpdateRequest body) {
    return updateElasticCloudCcmAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an Elastic Cloud CCM account. The update is a partial merge: only the fields provided
   * are changed, so a name-only or settings-only update does not need to resend the full payload or
   * write-only credentials.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;
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
  public ApiResponse<ElasticCloudCcmAccountResponse> updateElasticCloudCcmAccountWithHttpInfo(
      String accountId, ElasticCloudCcmAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudCcmAccount";
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
          "Missing the required parameter 'accountId' when calling updateElasticCloudCcmAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateElasticCloudCcmAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ElasticCloudCloudCostManagementApi.updateElasticCloudCcmAccount",
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }

  /**
   * Update an Elastic Cloud CCM account.
   *
   * <p>See {@link #updateElasticCloudCcmAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ElasticCloudCcmAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>>
      updateElasticCloudCcmAccountWithHttpInfoAsync(
          String accountId, ElasticCloudCcmAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateElasticCloudCcmAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateElasticCloudCcmAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateElasticCloudCcmAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integrations/elastic-cloud/interfaces/elastic-cloud-ccm/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ElasticCloudCloudCostManagementApi.updateElasticCloudCcmAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ElasticCloudCcmAccountResponse>> result =
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
        new GenericType<ElasticCloudCcmAccountResponse>() {});
  }
}
