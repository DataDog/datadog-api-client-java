package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GCPSTSDelegateAccountResponse;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountCreateRequest;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountResponse;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountUpdateRequest;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GcpIntegrationApi {
  private ApiClient apiClient;

  public GcpIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GcpIntegrationApi(ApiClient apiClient) {
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
   * Create a new entry for your service account.
   *
   * <p>See {@link #createGCPSTSAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return GCPSTSServiceAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSServiceAccountResponse createGCPSTSAccount(GCPSTSServiceAccountCreateRequest body)
      throws ApiException {
    return createGCPSTSAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a new entry for your service account.
   *
   * <p>See {@link #createGCPSTSAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GCPSTSServiceAccountResponse&gt;
   */
  public CompletableFuture<GCPSTSServiceAccountResponse> createGCPSTSAccountAsync(
      GCPSTSServiceAccountCreateRequest body) {
    return createGCPSTSAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new entry within Datadog for your STS enabled service account.
   *
   * @param body (required)
   * @return ApiResponse&lt;GCPSTSServiceAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GCPSTSServiceAccountResponse> createGCPSTSAccountWithHttpInfo(
      GCPSTSServiceAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGCPSTSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.createGCPSTSAccount",
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
        new GenericType<GCPSTSServiceAccountResponse>() {});
  }

  /**
   * Create a new entry for your service account.
   *
   * <p>See {@link #createGCPSTSAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GCPSTSServiceAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>>
      createGCPSTSAccountWithHttpInfoAsync(GCPSTSServiceAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createGCPSTSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.createGCPSTSAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>> result =
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
        new GenericType<GCPSTSServiceAccountResponse>() {});
  }

  /**
   * Delete an STS enabled GCP Account.
   *
   * <p>See {@link #deleteGCPSTSAccountWithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGCPSTSAccount(String accountId) throws ApiException {
    deleteGCPSTSAccountWithHttpInfo(accountId);
  }

  /**
   * Delete an STS enabled GCP Account.
   *
   * <p>See {@link #deleteGCPSTSAccountWithHttpInfoAsync}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGCPSTSAccountAsync(String accountId) {
    return deleteGCPSTSAccountWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an STS enabled GCP account from within Datadog.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGCPSTSAccountWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteGCPSTSAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.deleteGCPSTSAccount",
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
   * Delete an STS enabled GCP Account.
   *
   * <p>See {@link #deleteGCPSTSAccountWithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGCPSTSAccountWithHttpInfoAsync(
      String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling deleteGCPSTSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.deleteGCPSTSAccount",
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
   * List delegate account.
   *
   * <p>See {@link #getGCPSTSDelegateWithHttpInfo}.
   *
   * @return GCPSTSDelegateAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSDelegateAccountResponse getGCPSTSDelegate() throws ApiException {
    return getGCPSTSDelegateWithHttpInfo().getData();
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getGCPSTSDelegateWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GCPSTSDelegateAccountResponse&gt;
   */
  public CompletableFuture<GCPSTSDelegateAccountResponse> getGCPSTSDelegateAsync() {
    return getGCPSTSDelegateWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List your Datadog-GCP STS delegate account configured in your Datadog account.
   *
   * @return ApiResponse&lt;GCPSTSDelegateAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GCPSTSDelegateAccountResponse> getGCPSTSDelegateWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.getGCPSTSDelegate",
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
        new GenericType<GCPSTSDelegateAccountResponse>() {});
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getGCPSTSDelegateWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GCPSTSDelegateAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPSTSDelegateAccountResponse>>
      getGCPSTSDelegateWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.getGCPSTSDelegate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPSTSDelegateAccountResponse>> result =
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
        new GenericType<GCPSTSDelegateAccountResponse>() {});
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsWithHttpInfo}.
   *
   * @return GCPSTSServiceAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSServiceAccountsResponse listGCPSTSAccounts() throws ApiException {
    return listGCPSTSAccountsWithHttpInfo().getData();
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GCPSTSServiceAccountsResponse&gt;
   */
  public CompletableFuture<GCPSTSServiceAccountsResponse> listGCPSTSAccountsAsync() {
    return listGCPSTSAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all GCP STS-enabled service accounts configured in your Datadog account.
   *
   * @return ApiResponse&lt;GCPSTSServiceAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GCPSTSServiceAccountsResponse> listGCPSTSAccountsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.listGCPSTSAccounts",
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
        new GenericType<GCPSTSServiceAccountsResponse>() {});
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GCPSTSServiceAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPSTSServiceAccountsResponse>>
      listGCPSTSAccountsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.listGCPSTSAccounts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountsResponse>> result =
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
        new GenericType<GCPSTSServiceAccountsResponse>() {});
  }

  /** Manage optional parameters to makeGCPSTSDelegate. */
  public static class MakeGCPSTSDelegateOptionalParameters {
    private Object body;

    /**
     * Set body.
     *
     * @param body Create a delegate service account within Datadog. (optional)
     * @return MakeGCPSTSDelegateOptionalParameters
     */
    public MakeGCPSTSDelegateOptionalParameters body(Object body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeGCPSTSDelegateWithHttpInfo}.
   *
   * @return GCPSTSDelegateAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSDelegateAccountResponse makeGCPSTSDelegate() throws ApiException {
    return makeGCPSTSDelegateWithHttpInfo(new MakeGCPSTSDelegateOptionalParameters()).getData();
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeGCPSTSDelegateWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GCPSTSDelegateAccountResponse&gt;
   */
  public CompletableFuture<GCPSTSDelegateAccountResponse> makeGCPSTSDelegateAsync() {
    return makeGCPSTSDelegateWithHttpInfoAsync(new MakeGCPSTSDelegateOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeGCPSTSDelegateWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return GCPSTSDelegateAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSDelegateAccountResponse makeGCPSTSDelegate(
      MakeGCPSTSDelegateOptionalParameters parameters) throws ApiException {
    return makeGCPSTSDelegateWithHttpInfo(parameters).getData();
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeGCPSTSDelegateWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GCPSTSDelegateAccountResponse&gt;
   */
  public CompletableFuture<GCPSTSDelegateAccountResponse> makeGCPSTSDelegateAsync(
      MakeGCPSTSDelegateOptionalParameters parameters) {
    return makeGCPSTSDelegateWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Datadog GCP principal.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GCPSTSDelegateAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GCPSTSDelegateAccountResponse> makeGCPSTSDelegateWithHttpInfo(
      MakeGCPSTSDelegateOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.makeGCPSTSDelegate",
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
        new GenericType<GCPSTSDelegateAccountResponse>() {});
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeGCPSTSDelegateWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GCPSTSDelegateAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPSTSDelegateAccountResponse>>
      makeGCPSTSDelegateWithHttpInfoAsync(MakeGCPSTSDelegateOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.makeGCPSTSDelegate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPSTSDelegateAccountResponse>> result =
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
        new GenericType<GCPSTSDelegateAccountResponse>() {});
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountWithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return GCPSTSServiceAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GCPSTSServiceAccountResponse updateGCPSTSAccount(
      String accountId, GCPSTSServiceAccountUpdateRequest body) throws ApiException {
    return updateGCPSTSAccountWithHttpInfo(accountId, body).getData();
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountWithHttpInfoAsync}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;GCPSTSServiceAccountResponse&gt;
   */
  public CompletableFuture<GCPSTSServiceAccountResponse> updateGCPSTSAccountAsync(
      String accountId, GCPSTSServiceAccountUpdateRequest body) {
    return updateGCPSTSAccountWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an STS enabled service account.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;GCPSTSServiceAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GCPSTSServiceAccountResponse> updateGCPSTSAccountWithHttpInfo(
      String accountId, GCPSTSServiceAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateGCPSTSAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGCPSTSAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.updateGCPSTSAccount",
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
        new GenericType<GCPSTSServiceAccountResponse>() {});
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountWithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GCPSTSServiceAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>>
      updateGCPSTSAccountWithHttpInfoAsync(
          String accountId, GCPSTSServiceAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling updateGCPSTSAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGCPSTSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.updateGCPSTSAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GCPSTSServiceAccountResponse>> result =
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
        new GenericType<GCPSTSServiceAccountResponse>() {});
  }
}
