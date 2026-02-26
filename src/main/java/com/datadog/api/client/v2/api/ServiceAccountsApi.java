package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ApplicationKeyCreateRequest;
import com.datadog.api.client.v2.model.ApplicationKeyResponse;
import com.datadog.api.client.v2.model.ApplicationKeyUpdateRequest;
import com.datadog.api.client.v2.model.ApplicationKeysSort;
import com.datadog.api.client.v2.model.ListApplicationKeysResponse;
import com.datadog.api.client.v2.model.PartialApplicationKeyResponse;
import com.datadog.api.client.v2.model.ServiceAccountCreateRequest;
import com.datadog.api.client.v2.model.UserResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceAccountsApi {
  private ApiClient apiClient;

  public ServiceAccountsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceAccountsApi(ApiClient apiClient) {
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
   * Create a service account.
   *
   * <p>See {@link #createServiceAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   */
  public UserResponse createServiceAccount(ServiceAccountCreateRequest body) throws ApiException {
    return createServiceAccountWithHttpInfo(body).getData();
  }

  /**
   * Create a service account.
   *
   * <p>See {@link #createServiceAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;UserResponse&gt;
   */
  public CompletableFuture<UserResponse> createServiceAccountAsync(
      ServiceAccountCreateRequest body) {
    return createServiceAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a service account for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserResponse> createServiceAccountWithHttpInfo(
      ServiceAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createServiceAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/service_accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.createServiceAccount",
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Create a service account.
   *
   * <p>See {@link #createServiceAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserResponse>> createServiceAccountWithHttpInfoAsync(
      ServiceAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createServiceAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/service_accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.createServiceAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserResponse>> result = new CompletableFuture<>();
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
        new GenericType<UserResponse>() {});
  }

  /**
   * Create an application key for this service account.
   *
   * <p>See {@link #createServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationKeyResponse createServiceAccountApplicationKey(
      String serviceAccountId, ApplicationKeyCreateRequest body) throws ApiException {
    return createServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, body).getData();
  }

  /**
   * Create an application key for this service account.
   *
   * <p>See {@link #createServiceAccountApplicationKeyWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApplicationKeyResponse&gt;
   */
  public CompletableFuture<ApplicationKeyResponse> createServiceAccountApplicationKeyAsync(
      String serviceAccountId, ApplicationKeyCreateRequest body) {
    return createServiceAccountApplicationKeyWithHttpInfoAsync(serviceAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an application key for this service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> createServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, ApplicationKeyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " createServiceAccountApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.createServiceAccountApplicationKey",
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Create an application key for this service account.
   *
   * <p>See {@link #createServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationKeyResponse>>
      createServiceAccountApplicationKeyWithHttpInfoAsync(
          String serviceAccountId, ApplicationKeyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceAccountId' when calling"
                  + " createServiceAccountApplicationKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createServiceAccountApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.createServiceAccountApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<ApplicationKeyResponse>() {});
  }

  /**
   * Delete an application key for this service account.
   *
   * <p>See {@link #deleteServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceAccountApplicationKey(String serviceAccountId, String appKeyId)
      throws ApiException {
    deleteServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId);
  }

  /**
   * Delete an application key for this service account.
   *
   * <p>See {@link #deleteServiceAccountApplicationKeyWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteServiceAccountApplicationKeyAsync(
      String serviceAccountId, String appKeyId) {
    return deleteServiceAccountApplicationKeyWithHttpInfoAsync(serviceAccountId, appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an application key owned by this service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " deleteServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling"
              + " deleteServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.deleteServiceAccountApplicationKey",
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
   * Delete an application key for this service account.
   *
   * <p>See {@link #deleteServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteServiceAccountApplicationKeyWithHttpInfoAsync(
      String serviceAccountId, String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceAccountId' when calling"
                  + " deleteServiceAccountApplicationKey"));
      return result;
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " deleteServiceAccountApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.deleteServiceAccountApplicationKey",
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
   * Get one application key for this service account.
   *
   * <p>See {@link #getServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return PartialApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public PartialApplicationKeyResponse getServiceAccountApplicationKey(
      String serviceAccountId, String appKeyId) throws ApiException {
    return getServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId).getData();
  }

  /**
   * Get one application key for this service account.
   *
   * <p>See {@link #getServiceAccountApplicationKeyWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;PartialApplicationKeyResponse&gt;
   */
  public CompletableFuture<PartialApplicationKeyResponse> getServiceAccountApplicationKeyAsync(
      String serviceAccountId, String appKeyId) {
    return getServiceAccountApplicationKeyWithHttpInfoAsync(serviceAccountId, appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an application key owned by this service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;PartialApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PartialApplicationKeyResponse> getServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " getServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling getServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.getServiceAccountApplicationKey",
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
        new GenericType<PartialApplicationKeyResponse>() {});
  }

  /**
   * Get one application key for this service account.
   *
   * <p>See {@link #getServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PartialApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PartialApplicationKeyResponse>>
      getServiceAccountApplicationKeyWithHttpInfoAsync(String serviceAccountId, String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceAccountId' when calling"
                  + " getServiceAccountApplicationKey"));
      return result;
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " getServiceAccountApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.getServiceAccountApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
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
        new GenericType<PartialApplicationKeyResponse>() {});
  }

  /** Manage optional parameters to listServiceAccountApplicationKeys. */
  public static class ListServiceAccountApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional, default to "name")
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart.
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filterCreatedAtStart(
        String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd.
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filterCreatedAtEnd(
        String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }
  }

  /**
   * List application keys for this service account.
   *
   * <p>See {@link #listServiceAccountApplicationKeysWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listServiceAccountApplicationKeys(String serviceAccountId)
      throws ApiException {
    return listServiceAccountApplicationKeysWithHttpInfo(
            serviceAccountId, new ListServiceAccountApplicationKeysOptionalParameters())
        .getData();
  }

  /**
   * List application keys for this service account.
   *
   * <p>See {@link #listServiceAccountApplicationKeysWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listServiceAccountApplicationKeysAsync(
      String serviceAccountId) {
    return listServiceAccountApplicationKeysWithHttpInfoAsync(
            serviceAccountId, new ListServiceAccountApplicationKeysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List application keys for this service account.
   *
   * <p>See {@link #listServiceAccountApplicationKeysWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ListApplicationKeysResponse listServiceAccountApplicationKeys(
      String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters)
      throws ApiException {
    return listServiceAccountApplicationKeysWithHttpInfo(serviceAccountId, parameters).getData();
  }

  /**
   * List application keys for this service account.
   *
   * <p>See {@link #listServiceAccountApplicationKeysWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListApplicationKeysResponse&gt;
   */
  public CompletableFuture<ListApplicationKeysResponse> listServiceAccountApplicationKeysAsync(
      String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters) {
    return listServiceAccountApplicationKeysWithHttpInfoAsync(serviceAccountId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all application keys available for this service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
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
  public ApiResponse<ListApplicationKeysResponse> listServiceAccountApplicationKeysWithHttpInfo(
      String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " listServiceAccountApplicationKeys");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.listServiceAccountApplicationKeys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /**
   * List application keys for this service account.
   *
   * <p>See {@link #listServiceAccountApplicationKeysWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListApplicationKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListApplicationKeysResponse>>
      listServiceAccountApplicationKeysWithHttpInfoAsync(
          String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      CompletableFuture<ApiResponse<ListApplicationKeysResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceAccountId' when calling"
                  + " listServiceAccountApplicationKeys"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.listServiceAccountApplicationKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListApplicationKeysResponse>> result =
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
        new GenericType<ListApplicationKeysResponse>() {});
  }

  /**
   * Edit an application key for this service account.
   *
   * <p>See {@link #updateServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return PartialApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public PartialApplicationKeyResponse updateServiceAccountApplicationKey(
      String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body)
      throws ApiException {
    return updateServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId, body)
        .getData();
  }

  /**
   * Edit an application key for this service account.
   *
   * <p>See {@link #updateServiceAccountApplicationKeyWithHttpInfoAsync}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PartialApplicationKeyResponse&gt;
   */
  public CompletableFuture<PartialApplicationKeyResponse> updateServiceAccountApplicationKeyAsync(
      String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body) {
    return updateServiceAccountApplicationKeyWithHttpInfoAsync(serviceAccountId, appKeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an application key owned by this service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApiResponse&lt;PartialApplicationKeyResponse&gt;
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
  public ApiResponse<PartialApplicationKeyResponse> updateServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " updateServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling"
              + " updateServiceAccountApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceAccountsApi.updateServiceAccountApplicationKey",
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
        new GenericType<PartialApplicationKeyResponse>() {});
  }

  /**
   * Edit an application key for this service account.
   *
   * <p>See {@link #updateServiceAccountApplicationKeyWithHttpInfo}.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PartialApplicationKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PartialApplicationKeyResponse>>
      updateServiceAccountApplicationKeyWithHttpInfoAsync(
          String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceAccountId' when calling"
                  + " updateServiceAccountApplicationKey"));
      return result;
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appKeyId' when calling"
                  + " updateServiceAccountApplicationKey"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateServiceAccountApplicationKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceAccountsApi.updateServiceAccountApplicationKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PartialApplicationKeyResponse>> result =
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
        new GenericType<PartialApplicationKeyResponse>() {});
  }
}
