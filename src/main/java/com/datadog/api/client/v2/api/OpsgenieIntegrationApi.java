package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OpsgenieAccountCreateRequest;
import com.datadog.api.client.v2.model.OpsgenieAccountResponse;
import com.datadog.api.client.v2.model.OpsgenieAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpsgenieAccountsResponse;
import com.datadog.api.client.v2.model.OpsgenieServiceCreateRequest;
import com.datadog.api.client.v2.model.OpsgenieServiceResponse;
import com.datadog.api.client.v2.model.OpsgenieServiceUpdateRequest;
import com.datadog.api.client.v2.model.OpsgenieServicesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpsgenieIntegrationApi {
  private ApiClient apiClient;

  public OpsgenieIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OpsgenieIntegrationApi(ApiClient apiClient) {
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
   * Create a new Opsgenie account.
   *
   * <p>See {@link #createOpsgenieAccountWithHttpInfo}.
   *
   * @param body Opsgenie account payload. (required)
   * @return OpsgenieAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieAccountResponse createOpsgenieAccount(OpsgenieAccountCreateRequest body)
      throws ApiException {
    return createOpsgenieAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a new Opsgenie account.
   *
   * <p>See {@link #createOpsgenieAccountWithHttpInfoAsync}.
   *
   * @param body Opsgenie account payload. (required)
   * @return CompletableFuture&lt;OpsgenieAccountResponse&gt;
   */
  public CompletableFuture<OpsgenieAccountResponse> createOpsgenieAccountAsync(
      OpsgenieAccountCreateRequest body) {
    return createOpsgenieAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Opsgenie account in the Datadog Opsgenie integration.
   *
   * @param body Opsgenie account payload. (required)
   * @return ApiResponse&lt;OpsgenieAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieAccountResponse> createOpsgenieAccountWithHttpInfo(
      OpsgenieAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOpsgenieAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.createOpsgenieAccount",
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
        new GenericType<OpsgenieAccountResponse>() {});
  }

  /**
   * Create a new Opsgenie account.
   *
   * <p>See {@link #createOpsgenieAccountWithHttpInfo}.
   *
   * @param body Opsgenie account payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieAccountResponse>>
      createOpsgenieAccountWithHttpInfoAsync(OpsgenieAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpsgenieAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOpsgenieAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.createOpsgenieAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieAccountResponse>() {});
  }

  /**
   * Create a new service object.
   *
   * <p>See {@link #createOpsgenieServiceWithHttpInfo}.
   *
   * @param body Opsgenie service payload (required)
   * @return OpsgenieServiceResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieServiceResponse createOpsgenieService(OpsgenieServiceCreateRequest body)
      throws ApiException {
    return createOpsgenieServiceWithHttpInfo(body).getData();
  }

  /**
   * Create a new service object.
   *
   * <p>See {@link #createOpsgenieServiceWithHttpInfoAsync}.
   *
   * @param body Opsgenie service payload (required)
   * @return CompletableFuture&lt;OpsgenieServiceResponse&gt;
   */
  public CompletableFuture<OpsgenieServiceResponse> createOpsgenieServiceAsync(
      OpsgenieServiceCreateRequest body) {
    return createOpsgenieServiceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new service object in the Opsgenie integration.
   *
   * @param body Opsgenie service payload (required)
   * @return ApiResponse&lt;OpsgenieServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieServiceResponse> createOpsgenieServiceWithHttpInfo(
      OpsgenieServiceCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOpsgenieService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.createOpsgenieService",
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
        new GenericType<OpsgenieServiceResponse>() {});
  }

  /**
   * Create a new service object.
   *
   * <p>See {@link #createOpsgenieServiceWithHttpInfo}.
   *
   * @param body Opsgenie service payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieServiceResponse>>
      createOpsgenieServiceWithHttpInfoAsync(OpsgenieServiceCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOpsgenieService"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.createOpsgenieService",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieServiceResponse>() {});
  }

  /**
   * Delete an Opsgenie account.
   *
   * <p>See {@link #deleteOpsgenieAccountWithHttpInfo}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOpsgenieAccount(String accountId) throws ApiException {
    deleteOpsgenieAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an Opsgenie account.
   *
   * <p>See {@link #deleteOpsgenieAccountWithHttpInfoAsync}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOpsgenieAccountAsync(String accountId) {
    return deleteOpsgenieAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single Opsgenie account from the Datadog Opsgenie integration.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOpsgenieAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteOpsgenieAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.deleteOpsgenieAccount",
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
   * Delete an Opsgenie account.
   *
   * <p>See {@link #deleteOpsgenieAccountWithHttpInfo}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOpsgenieAccountWithHttpInfoAsync(
      String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling deleteOpsgenieAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.deleteOpsgenieAccount",
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
   * Delete a single service object.
   *
   * <p>See {@link #deleteOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOpsgenieService(String integrationServiceId) throws ApiException {
    deleteOpsgenieServiceWithHttpInfo(integrationServiceId);
  }

  /**
   * Delete a single service object.
   *
   * <p>See {@link #deleteOpsgenieServiceWithHttpInfoAsync}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOpsgenieServiceAsync(String integrationServiceId) {
    return deleteOpsgenieServiceWithHttpInfoAsync(integrationServiceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single service object in the Datadog Opsgenie integration.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOpsgenieServiceWithHttpInfo(String integrationServiceId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationServiceId' when calling"
              + " deleteOpsgenieService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.deleteOpsgenieService",
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
   * Delete a single service object.
   *
   * <p>See {@link #deleteOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOpsgenieServiceWithHttpInfoAsync(
      String integrationServiceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationServiceId' when calling"
                  + " deleteOpsgenieService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.deleteOpsgenieService",
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
   * Get a single service object.
   *
   * <p>See {@link #getOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return OpsgenieServiceResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieServiceResponse getOpsgenieService(String integrationServiceId)
      throws ApiException {
    return getOpsgenieServiceWithHttpInfo(integrationServiceId).getData();
  }

  /**
   * Get a single service object.
   *
   * <p>See {@link #getOpsgenieServiceWithHttpInfoAsync}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return CompletableFuture&lt;OpsgenieServiceResponse&gt;
   */
  public CompletableFuture<OpsgenieServiceResponse> getOpsgenieServiceAsync(
      String integrationServiceId) {
    return getOpsgenieServiceWithHttpInfoAsync(integrationServiceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single service from the Datadog Opsgenie integration.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return ApiResponse&lt;OpsgenieServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieServiceResponse> getOpsgenieServiceWithHttpInfo(
      String integrationServiceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationServiceId' when calling getOpsgenieService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.getOpsgenieService",
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
        new GenericType<OpsgenieServiceResponse>() {});
  }

  /**
   * Get a single service object.
   *
   * <p>See {@link #getOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieServiceResponse>>
      getOpsgenieServiceWithHttpInfoAsync(String integrationServiceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationServiceId' when calling"
                  + " getOpsgenieService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.getOpsgenieService",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieServiceResponse>() {});
  }

  /**
   * Get all Opsgenie accounts.
   *
   * <p>See {@link #listOpsgenieAccountsWithHttpInfo}.
   *
   * @return OpsgenieAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieAccountsResponse listOpsgenieAccounts() throws ApiException {
    return listOpsgenieAccountsWithHttpInfo().getData();
  }

  /**
   * Get all Opsgenie accounts.
   *
   * <p>See {@link #listOpsgenieAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OpsgenieAccountsResponse&gt;
   */
  public CompletableFuture<OpsgenieAccountsResponse> listOpsgenieAccountsAsync() {
    return listOpsgenieAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all Opsgenie accounts from the Datadog Opsgenie integration.
   *
   * @return ApiResponse&lt;OpsgenieAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieAccountsResponse> listOpsgenieAccountsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.listOpsgenieAccounts",
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
        new GenericType<OpsgenieAccountsResponse>() {});
  }

  /**
   * Get all Opsgenie accounts.
   *
   * <p>See {@link #listOpsgenieAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieAccountsResponse>>
      listOpsgenieAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.listOpsgenieAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieAccountsResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieAccountsResponse>() {});
  }

  /**
   * Get all service objects.
   *
   * <p>See {@link #listOpsgenieServicesWithHttpInfo}.
   *
   * @return OpsgenieServicesResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieServicesResponse listOpsgenieServices() throws ApiException {
    return listOpsgenieServicesWithHttpInfo().getData();
  }

  /**
   * Get all service objects.
   *
   * <p>See {@link #listOpsgenieServicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OpsgenieServicesResponse&gt;
   */
  public CompletableFuture<OpsgenieServicesResponse> listOpsgenieServicesAsync() {
    return listOpsgenieServicesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all services from the Datadog Opsgenie integration.
   *
   * @return ApiResponse&lt;OpsgenieServicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieServicesResponse> listOpsgenieServicesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.listOpsgenieServices",
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
        new GenericType<OpsgenieServicesResponse>() {});
  }

  /**
   * Get all service objects.
   *
   * <p>See {@link #listOpsgenieServicesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieServicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieServicesResponse>>
      listOpsgenieServicesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/opsgenie/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.listOpsgenieServices",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieServicesResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieServicesResponse>() {});
  }

  /**
   * Update an Opsgenie account.
   *
   * <p>See {@link #updateOpsgenieAccountWithHttpInfo}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @param body Opsgenie account payload. (required)
   * @return OpsgenieAccountResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieAccountResponse updateOpsgenieAccount(
      String accountId, OpsgenieAccountUpdateRequest body) throws ApiException {
    return updateOpsgenieAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update an Opsgenie account.
   *
   * <p>See {@link #updateOpsgenieAccountWithHttpInfoAsync}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @param body Opsgenie account payload. (required)
   * @return CompletableFuture&lt;OpsgenieAccountResponse&gt;
   */
  public CompletableFuture<OpsgenieAccountResponse> updateOpsgenieAccountAsync(
      String accountId, OpsgenieAccountUpdateRequest body) {
    return updateOpsgenieAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a single Opsgenie account in the Datadog Opsgenie integration.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @param body Opsgenie account payload. (required)
   * @return ApiResponse&lt;OpsgenieAccountResponse&gt;
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
  public ApiResponse<OpsgenieAccountResponse> updateOpsgenieAccountWithHttpInfo(
      String accountId, OpsgenieAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateOpsgenieAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOpsgenieAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.updateOpsgenieAccount",
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
        new GenericType<OpsgenieAccountResponse>() {});
  }

  /**
   * Update an Opsgenie account.
   *
   * <p>See {@link #updateOpsgenieAccountWithHttpInfo}.
   *
   * @param accountId The UUID of the Opsgenie account. (required)
   * @param body Opsgenie account payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieAccountResponse>>
      updateOpsgenieAccountWithHttpInfoAsync(String accountId, OpsgenieAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<OpsgenieAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling updateOpsgenieAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpsgenieAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOpsgenieAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.updateOpsgenieAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieAccountResponse>() {});
  }

  /**
   * Update a single service object.
   *
   * <p>See {@link #updateOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @param body Opsgenie service payload. (required)
   * @return OpsgenieServiceResponse
   * @throws ApiException if fails to make API call
   */
  public OpsgenieServiceResponse updateOpsgenieService(
      String integrationServiceId, OpsgenieServiceUpdateRequest body) throws ApiException {
    return updateOpsgenieServiceWithHttpInfo(integrationServiceId, body).getData();
  }

  /**
   * Update a single service object.
   *
   * <p>See {@link #updateOpsgenieServiceWithHttpInfoAsync}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @param body Opsgenie service payload. (required)
   * @return CompletableFuture&lt;OpsgenieServiceResponse&gt;
   */
  public CompletableFuture<OpsgenieServiceResponse> updateOpsgenieServiceAsync(
      String integrationServiceId, OpsgenieServiceUpdateRequest body) {
    return updateOpsgenieServiceWithHttpInfoAsync(integrationServiceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a single service object in the Datadog Opsgenie integration.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @param body Opsgenie service payload. (required)
   * @return ApiResponse&lt;OpsgenieServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OpsgenieServiceResponse> updateOpsgenieServiceWithHttpInfo(
      String integrationServiceId, OpsgenieServiceUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationServiceId' when calling"
              + " updateOpsgenieService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOpsgenieService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OpsgenieIntegrationApi.updateOpsgenieService",
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
        new GenericType<OpsgenieServiceResponse>() {});
  }

  /**
   * Update a single service object.
   *
   * <p>See {@link #updateOpsgenieServiceWithHttpInfo}.
   *
   * @param integrationServiceId The UUID of the service. (required)
   * @param body Opsgenie service payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OpsgenieServiceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OpsgenieServiceResponse>>
      updateOpsgenieServiceWithHttpInfoAsync(
          String integrationServiceId, OpsgenieServiceUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'integrationServiceId' is set
    if (integrationServiceId == null) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationServiceId' when calling"
                  + " updateOpsgenieService"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOpsgenieService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/opsgenie/services/{integration_service_id}"
            .replaceAll(
                "\\{" + "integration_service_id" + "\\}",
                apiClient.escapeString(integrationServiceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OpsgenieIntegrationApi.updateOpsgenieService",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OpsgenieServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<OpsgenieServiceResponse>() {});
  }
}
