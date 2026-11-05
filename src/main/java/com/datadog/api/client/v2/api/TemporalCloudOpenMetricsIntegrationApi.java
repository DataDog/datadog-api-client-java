package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.TemporalCloudOpenMetricsIntegrationAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporalCloudOpenMetricsIntegrationApi {
  private ApiClient apiClient;

  public TemporalCloudOpenMetricsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TemporalCloudOpenMetricsIntegrationApi(ApiClient apiClient) {
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
   * Create a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return TemporalCloudOpenMetricsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TemporalCloudOpenMetricsIntegrationAccountResponse
      createTemporalCloudOpenMetricsIntegrationAccount(
          TemporalCloudOpenMetricsIntegrationAccountCreateRequest body) throws ApiException {
    return createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TemporalCloudOpenMetricsIntegrationAccountResponse>
      createTemporalCloudOpenMetricsIntegrationAccountAsync(
          TemporalCloudOpenMetricsIntegrationAccountCreateRequest body) {
    return createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Temporal Cloud OpenMetrics integration account.
   *
   * @param body (required)
   * @return ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
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
  public ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>
      createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(
          TemporalCloudOpenMetricsIntegrationAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTemporalCloudOpenMetricsIntegrationAccount";
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
              + " createTemporalCloudOpenMetricsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TemporalCloudOpenMetricsIntegrationApi.createTemporalCloudOpenMetricsIntegrationAccount",
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }

  /**
   * Create a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>>
      createTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(
          TemporalCloudOpenMetricsIntegrationAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTemporalCloudOpenMetricsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createTemporalCloudOpenMetricsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TemporalCloudOpenMetricsIntegrationApi.createTemporalCloudOpenMetricsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }

  /**
   * Delete a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemporalCloudOpenMetricsIntegrationAccount(String accountId)
      throws ApiException {
    deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(accountId);
  }

  /**
   * Delete a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTemporalCloudOpenMetricsIntegrationAccountAsync(
      String accountId) {
    return deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Temporal Cloud OpenMetrics integration account.
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
  public ApiResponse<Void> deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(
      String accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTemporalCloudOpenMetricsIntegrationAccount";
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
              + " deleteTemporalCloudOpenMetricsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TemporalCloudOpenMetricsIntegrationApi.deleteTemporalCloudOpenMetricsIntegrationAccount",
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
   * Delete a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteTemporalCloudOpenMetricsIntegrationAccount";
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
                  + " deleteTemporalCloudOpenMetricsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TemporalCloudOpenMetricsIntegrationApi.deleteTemporalCloudOpenMetricsIntegrationAccount",
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
   * Get a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return TemporalCloudOpenMetricsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TemporalCloudOpenMetricsIntegrationAccountResponse
      getTemporalCloudOpenMetricsIntegrationAccount(String accountId) throws ApiException {
    return getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(accountId).getData();
  }

  /**
   * Get a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return CompletableFuture&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TemporalCloudOpenMetricsIntegrationAccountResponse>
      getTemporalCloudOpenMetricsIntegrationAccountAsync(String accountId) {
    return getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Temporal Cloud OpenMetrics integration account.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
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
  public ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>
      getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(String accountId)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTemporalCloudOpenMetricsIntegrationAccount";
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
              + " getTemporalCloudOpenMetricsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TemporalCloudOpenMetricsIntegrationApi.getTemporalCloudOpenMetricsIntegrationAccount",
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }

  /**
   * Get a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>>
      getTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(String accountId) {
    // Check if unstable operation is enabled
    String operationId = "getTemporalCloudOpenMetricsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " getTemporalCloudOpenMetricsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TemporalCloudOpenMetricsIntegrationApi.getTemporalCloudOpenMetricsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }

  /**
   * List Temporal Cloud OpenMetrics accounts.
   *
   * <p>See {@link #listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfo}.
   *
   * @return TemporalCloudOpenMetricsIntegrationAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public TemporalCloudOpenMetricsIntegrationAccountsResponse
      listTemporalCloudOpenMetricsIntegrationAccounts() throws ApiException {
    return listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfo().getData();
  }

  /**
   * List Temporal Cloud OpenMetrics accounts.
   *
   * <p>See {@link #listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TemporalCloudOpenMetricsIntegrationAccountsResponse&gt;
   */
  public CompletableFuture<TemporalCloudOpenMetricsIntegrationAccountsResponse>
      listTemporalCloudOpenMetricsIntegrationAccountsAsync() {
    return listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Temporal Cloud OpenMetrics integration accounts.
   *
   * @return ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountsResponse&gt;
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
  public ApiResponse<TemporalCloudOpenMetricsIntegrationAccountsResponse>
      listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTemporalCloudOpenMetricsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TemporalCloudOpenMetricsIntegrationApi.listTemporalCloudOpenMetricsIntegrationAccounts",
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountsResponse>() {});
  }

  /**
   * List Temporal Cloud OpenMetrics accounts.
   *
   * <p>See {@link #listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountsResponse>>
      listTemporalCloudOpenMetricsIntegrationAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listTemporalCloudOpenMetricsIntegrationAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TemporalCloudOpenMetricsIntegrationApi.listTemporalCloudOpenMetricsIntegrationAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountsResponse>> result =
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountsResponse>() {});
  }

  /**
   * Update a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return TemporalCloudOpenMetricsIntegrationAccountResponse
   * @throws ApiException if fails to make API call
   */
  public TemporalCloudOpenMetricsIntegrationAccountResponse
      updateTemporalCloudOpenMetricsIntegrationAccount(
          String accountId, TemporalCloudOpenMetricsIntegrationAccountUpdateRequest body)
          throws ApiException {
    return updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
   */
  public CompletableFuture<TemporalCloudOpenMetricsIntegrationAccountResponse>
      updateTemporalCloudOpenMetricsIntegrationAccountAsync(
          String accountId, TemporalCloudOpenMetricsIntegrationAccountUpdateRequest body) {
    return updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Temporal Cloud OpenMetrics integration account. Only the fields provided are changed.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;
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
  public ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>
      updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo(
          String accountId, TemporalCloudOpenMetricsIntegrationAccountUpdateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTemporalCloudOpenMetricsIntegrationAccount";
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
              + " updateTemporalCloudOpenMetricsIntegrationAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateTemporalCloudOpenMetricsIntegrationAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TemporalCloudOpenMetricsIntegrationApi.updateTemporalCloudOpenMetricsIntegrationAccount",
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }

  /**
   * Update a Temporal Cloud OpenMetrics account.
   *
   * <p>See {@link #updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfo}.
   *
   * @param accountId Unique identifier of the integration account. (required)
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;TemporalCloudOpenMetricsIntegrationAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>>
      updateTemporalCloudOpenMetricsIntegrationAccountWithHttpInfoAsync(
          String accountId, TemporalCloudOpenMetricsIntegrationAccountUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTemporalCloudOpenMetricsIntegrationAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling"
                  + " updateTemporalCloudOpenMetricsIntegrationAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateTemporalCloudOpenMetricsIntegrationAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration-interfaces/temporal-cloud-openmetrics/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TemporalCloudOpenMetricsIntegrationApi.updateTemporalCloudOpenMetricsIntegrationAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TemporalCloudOpenMetricsIntegrationAccountResponse>> result =
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
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountResponse>() {});
  }
}
