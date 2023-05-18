package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AccountCreationResponse;
import com.datadog.api.client.v2.model.AccountPatchBody;
import com.datadog.api.client.v2.model.DelegateCreationResponse;
import com.datadog.api.client.v2.model.STSEnabledAccountData;
import com.datadog.api.client.v2.model.ServiceAccountToBeCreatedData;
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
   * <p>See {@link #createGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param body (required)
   * @return AccountCreationResponse
   * @throws ApiException if fails to make API call
   */
  public AccountCreationResponse createGCPSTSAccountsV2(ServiceAccountToBeCreatedData body)
      throws ApiException {
    return createGCPSTSAccountsV2WithHttpInfo(body).getData();
  }

  /**
   * Create a new entry for your service account.
   *
   * <p>See {@link #createGCPSTSAccountsV2WithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AccountCreationResponse&gt;
   */
  public CompletableFuture<AccountCreationResponse> createGCPSTSAccountsV2Async(
      ServiceAccountToBeCreatedData body) {
    return createGCPSTSAccountsV2WithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new entry within Datadog for your STS enabled service account.
   *
   * @param body (required)
   * @return ApiResponse&lt;AccountCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AccountCreationResponse> createGCPSTSAccountsV2WithHttpInfo(
      ServiceAccountToBeCreatedData body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGCPSTSAccountsV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.createGCPSTSAccountsV2",
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
        new GenericType<AccountCreationResponse>() {});
  }

  /**
   * Create a new entry for your service account.
   *
   * <p>See {@link #createGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountCreationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AccountCreationResponse>>
      createGCPSTSAccountsV2WithHttpInfoAsync(ServiceAccountToBeCreatedData body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AccountCreationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createGCPSTSAccountsV2"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.createGCPSTSAccountsV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AccountCreationResponse>> result = new CompletableFuture<>();
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
        new GenericType<AccountCreationResponse>() {});
  }

  /**
   * Delete an STS enabled GCP Account.
   *
   * <p>See {@link #deleteGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGCPSTSAccountsV2(String accountId) throws ApiException {
    deleteGCPSTSAccountsV2WithHttpInfo(accountId);
  }

  /**
   * Delete an STS enabled GCP Account.
   *
   * <p>See {@link #deleteGCPSTSAccountsV2WithHttpInfoAsync}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGCPSTSAccountsV2Async(String accountId) {
    return deleteGCPSTSAccountsV2WithHttpInfoAsync(accountId)
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGCPSTSAccountsV2WithHttpInfo(String accountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteGCPSTSAccountsV2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.deleteGCPSTSAccountsV2",
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
   * <p>See {@link #deleteGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGCPSTSAccountsV2WithHttpInfoAsync(
      String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling deleteGCPSTSAccountsV2"));
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
              "v2.GcpIntegrationApi.deleteGCPSTSAccountsV2",
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

  /** Manage optional parameters to getDelegateV2. */
  public static class GetDelegateV2OptionalParameters {
    private Object body;

    /**
     * Set body.
     *
     * @param body Get a Datadog GCP STS delegate account. (optional)
     * @return GetDelegateV2OptionalParameters
     */
    public GetDelegateV2OptionalParameters body(Object body) {
      this.body = body;
      return this;
    }
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getDelegateV2WithHttpInfo}.
   *
   * @return DelegateCreationResponse
   * @throws ApiException if fails to make API call
   */
  public DelegateCreationResponse getDelegateV2() throws ApiException {
    return getDelegateV2WithHttpInfo(new GetDelegateV2OptionalParameters()).getData();
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getDelegateV2WithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DelegateCreationResponse&gt;
   */
  public CompletableFuture<DelegateCreationResponse> getDelegateV2Async() {
    return getDelegateV2WithHttpInfoAsync(new GetDelegateV2OptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getDelegateV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DelegateCreationResponse
   * @throws ApiException if fails to make API call
   */
  public DelegateCreationResponse getDelegateV2(GetDelegateV2OptionalParameters parameters)
      throws ApiException {
    return getDelegateV2WithHttpInfo(parameters).getData();
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getDelegateV2WithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DelegateCreationResponse&gt;
   */
  public CompletableFuture<DelegateCreationResponse> getDelegateV2Async(
      GetDelegateV2OptionalParameters parameters) {
    return getDelegateV2WithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List your Datadog-GCP STS delegate account configured in your Datadog account.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DelegateCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DelegateCreationResponse> getDelegateV2WithHttpInfo(
      GetDelegateV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.getDelegateV2",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DelegateCreationResponse>() {});
  }

  /**
   * List delegate account.
   *
   * <p>See {@link #getDelegateV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DelegateCreationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DelegateCreationResponse>> getDelegateV2WithHttpInfoAsync(
      GetDelegateV2OptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.getDelegateV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DelegateCreationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DelegateCreationResponse>() {});
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsV2WithHttpInfo}.
   *
   * @return STSEnabledAccountData
   * @throws ApiException if fails to make API call
   */
  public STSEnabledAccountData listGCPSTSAccountsV2() throws ApiException {
    return listGCPSTSAccountsV2WithHttpInfo().getData();
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsV2WithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;STSEnabledAccountData&gt;
   */
  public CompletableFuture<STSEnabledAccountData> listGCPSTSAccountsV2Async() {
    return listGCPSTSAccountsV2WithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all GCP STS-enabled service accounts configured in your Datadog account.
   *
   * @return ApiResponse&lt;STSEnabledAccountData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<STSEnabledAccountData> listGCPSTSAccountsV2WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.listGCPSTSAccountsV2",
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
        new GenericType<STSEnabledAccountData>() {});
  }

  /**
   * List all GCP STS-enabled service accounts.
   *
   * <p>See {@link #listGCPSTSAccountsV2WithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;STSEnabledAccountData&gt;&gt;
   */
  public CompletableFuture<ApiResponse<STSEnabledAccountData>>
      listGCPSTSAccountsV2WithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.listGCPSTSAccountsV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<STSEnabledAccountData>> result = new CompletableFuture<>();
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
        new GenericType<STSEnabledAccountData>() {});
  }

  /** Manage optional parameters to makeDelegateV2. */
  public static class MakeDelegateV2OptionalParameters {
    private Object body;

    /**
     * Set body.
     *
     * @param body Create a delegate service account within Datadog. (optional)
     * @return MakeDelegateV2OptionalParameters
     */
    public MakeDelegateV2OptionalParameters body(Object body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeDelegateV2WithHttpInfo}.
   *
   * @return DelegateCreationResponse
   * @throws ApiException if fails to make API call
   */
  public DelegateCreationResponse makeDelegateV2() throws ApiException {
    return makeDelegateV2WithHttpInfo(new MakeDelegateV2OptionalParameters()).getData();
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeDelegateV2WithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DelegateCreationResponse&gt;
   */
  public CompletableFuture<DelegateCreationResponse> makeDelegateV2Async() {
    return makeDelegateV2WithHttpInfoAsync(new MakeDelegateV2OptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeDelegateV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DelegateCreationResponse
   * @throws ApiException if fails to make API call
   */
  public DelegateCreationResponse makeDelegateV2(MakeDelegateV2OptionalParameters parameters)
      throws ApiException {
    return makeDelegateV2WithHttpInfo(parameters).getData();
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeDelegateV2WithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DelegateCreationResponse&gt;
   */
  public CompletableFuture<DelegateCreationResponse> makeDelegateV2Async(
      MakeDelegateV2OptionalParameters parameters) {
    return makeDelegateV2WithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Datadog GCP principal.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DelegateCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DelegateCreationResponse> makeDelegateV2WithHttpInfo(
      MakeDelegateV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.makeDelegateV2",
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
        new GenericType<DelegateCreationResponse>() {});
  }

  /**
   * Create a Datadog GCP principal.
   *
   * <p>See {@link #makeDelegateV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DelegateCreationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DelegateCreationResponse>> makeDelegateV2WithHttpInfoAsync(
      MakeDelegateV2OptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/integration/gcp/sts_delegate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GcpIntegrationApi.makeDelegateV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DelegateCreationResponse>> result = new CompletableFuture<>();
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
        new GenericType<DelegateCreationResponse>() {});
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return AccountPatchBody
   * @throws ApiException if fails to make API call
   */
  public AccountPatchBody updateGCPSTSAccountsV2(String accountId, AccountPatchBody body)
      throws ApiException {
    return updateGCPSTSAccountsV2WithHttpInfo(accountId, body).getData();
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountsV2WithHttpInfoAsync}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AccountPatchBody&gt;
   */
  public CompletableFuture<AccountPatchBody> updateGCPSTSAccountsV2Async(
      String accountId, AccountPatchBody body) {
    return updateGCPSTSAccountsV2WithHttpInfoAsync(accountId, body)
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
   * @return ApiResponse&lt;AccountPatchBody&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AccountPatchBody> updateGCPSTSAccountsV2WithHttpInfo(
      String accountId, AccountPatchBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateGCPSTSAccountsV2");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGCPSTSAccountsV2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/gcp/accounts/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GcpIntegrationApi.updateGCPSTSAccountsV2",
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
        new GenericType<AccountPatchBody>() {});
  }

  /**
   * Update STS Service Account.
   *
   * <p>See {@link #updateGCPSTSAccountsV2WithHttpInfo}.
   *
   * @param accountId Your GCP STS enabled service account's unique ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountPatchBody&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AccountPatchBody>> updateGCPSTSAccountsV2WithHttpInfoAsync(
      String accountId, AccountPatchBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AccountPatchBody>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountId' when calling updateGCPSTSAccountsV2"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AccountPatchBody>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGCPSTSAccountsV2"));
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
              "v2.GcpIntegrationApi.updateGCPSTSAccountsV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AccountPatchBody>> result = new CompletableFuture<>();
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
        new GenericType<AccountPatchBody>() {});
  }
}
