package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.StatuspageAccountCreateRequest;
import com.datadog.api.client.v2.model.StatuspageAccountResponse;
import com.datadog.api.client.v2.model.StatuspageAccountUpdateRequest;
import com.datadog.api.client.v2.model.StatuspageUrlSettingCreateRequest;
import com.datadog.api.client.v2.model.StatuspageUrlSettingResponse;
import com.datadog.api.client.v2.model.StatuspageUrlSettingUpdateRequest;
import com.datadog.api.client.v2.model.StatuspageUrlSettingsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatuspageIntegrationApi {
  private ApiClient apiClient;

  public StatuspageIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StatuspageIntegrationApi(ApiClient apiClient) {
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
   * Create the Statuspage account.
   *
   * <p>See {@link #createStatuspageAccountWithHttpInfo}.
   *
   * @param body Statuspage account payload. (required)
   * @return StatuspageAccountResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageAccountResponse createStatuspageAccount(StatuspageAccountCreateRequest body)
      throws ApiException {
    return createStatuspageAccountWithHttpInfo(body).getData();
  }

  /**
   * Create the Statuspage account.
   *
   * <p>See {@link #createStatuspageAccountWithHttpInfoAsync}.
   *
   * @param body Statuspage account payload. (required)
   * @return CompletableFuture&lt;StatuspageAccountResponse&gt;
   */
  public CompletableFuture<StatuspageAccountResponse> createStatuspageAccountAsync(
      StatuspageAccountCreateRequest body) {
    return createStatuspageAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Statuspage account for your organization. Only one Statuspage account can be
   * configured per organization.
   *
   * @param body Statuspage account payload. (required)
   * @return ApiResponse&lt;StatuspageAccountResponse&gt;
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
  public ApiResponse<StatuspageAccountResponse> createStatuspageAccountWithHttpInfo(
      StatuspageAccountCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createStatuspageAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.createStatuspageAccount",
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Create the Statuspage account.
   *
   * <p>See {@link #createStatuspageAccountWithHttpInfo}.
   *
   * @param body Statuspage account payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageAccountResponse>>
      createStatuspageAccountWithHttpInfoAsync(StatuspageAccountCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatuspageAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createStatuspageAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.createStatuspageAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Create a Statuspage URL setting.
   *
   * <p>See {@link #createStatuspageUrlSettingWithHttpInfo}.
   *
   * @param body Statuspage URL setting payload. (required)
   * @return StatuspageUrlSettingResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageUrlSettingResponse createStatuspageUrlSetting(
      StatuspageUrlSettingCreateRequest body) throws ApiException {
    return createStatuspageUrlSettingWithHttpInfo(body).getData();
  }

  /**
   * Create a Statuspage URL setting.
   *
   * <p>See {@link #createStatuspageUrlSettingWithHttpInfoAsync}.
   *
   * @param body Statuspage URL setting payload. (required)
   * @return CompletableFuture&lt;StatuspageUrlSettingResponse&gt;
   */
  public CompletableFuture<StatuspageUrlSettingResponse> createStatuspageUrlSettingAsync(
      StatuspageUrlSettingCreateRequest body) {
    return createStatuspageUrlSettingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Statuspage URL setting for your organization.
   *
   * @param body Statuspage URL setting payload. (required)
   * @return ApiResponse&lt;StatuspageUrlSettingResponse&gt;
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
  public ApiResponse<StatuspageUrlSettingResponse> createStatuspageUrlSettingWithHttpInfo(
      StatuspageUrlSettingCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createStatuspageUrlSetting");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/url_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.createStatuspageUrlSetting",
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
        new GenericType<StatuspageUrlSettingResponse>() {});
  }

  /**
   * Create a Statuspage URL setting.
   *
   * <p>See {@link #createStatuspageUrlSettingWithHttpInfo}.
   *
   * @param body Statuspage URL setting payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageUrlSettingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>>
      createStatuspageUrlSettingWithHttpInfoAsync(StatuspageUrlSettingCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createStatuspageUrlSetting"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/url_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.createStatuspageUrlSetting",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>> result =
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
        new GenericType<StatuspageUrlSettingResponse>() {});
  }

  /**
   * Delete the Statuspage account.
   *
   * <p>See {@link #deleteStatuspageAccountWithHttpInfo}.
   *
   * @throws ApiException if fails to make API call
   */
  public void deleteStatuspageAccount() throws ApiException {
    deleteStatuspageAccountWithHttpInfo();
  }

  /**
   * Delete the Statuspage account.
   *
   * <p>See {@link #deleteStatuspageAccountWithHttpInfoAsync}.
   *
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteStatuspageAccountAsync() {
    return deleteStatuspageAccountWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the Statuspage account configured for your organization.
   *
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
  public ApiResponse<Void> deleteStatuspageAccountWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.deleteStatuspageAccount",
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
   * Delete the Statuspage account.
   *
   * <p>See {@link #deleteStatuspageAccountWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteStatuspageAccountWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.deleteStatuspageAccount",
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
   * Delete a Statuspage URL setting.
   *
   * <p>See {@link #deleteStatuspageUrlSettingWithHttpInfo}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStatuspageUrlSetting(String statuspageUrlSettingId) throws ApiException {
    deleteStatuspageUrlSettingWithHttpInfo(statuspageUrlSettingId);
  }

  /**
   * Delete a Statuspage URL setting.
   *
   * <p>See {@link #deleteStatuspageUrlSettingWithHttpInfoAsync}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteStatuspageUrlSettingAsync(String statuspageUrlSettingId) {
    return deleteStatuspageUrlSettingWithHttpInfoAsync(statuspageUrlSettingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single Statuspage URL setting from your organization.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
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
  public ApiResponse<Void> deleteStatuspageUrlSettingWithHttpInfo(String statuspageUrlSettingId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'statuspageUrlSettingId' is set
    if (statuspageUrlSettingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'statuspageUrlSettingId' when calling"
              + " deleteStatuspageUrlSetting");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/statuspage/url_settings/{statuspage_url_setting_id}"
            .replaceAll(
                "\\{" + "statuspage_url_setting_id" + "\\}",
                apiClient.escapeString(statuspageUrlSettingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.deleteStatuspageUrlSetting",
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
   * Delete a Statuspage URL setting.
   *
   * <p>See {@link #deleteStatuspageUrlSettingWithHttpInfo}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteStatuspageUrlSettingWithHttpInfoAsync(
      String statuspageUrlSettingId) {
    Object localVarPostBody = null;

    // verify the required parameter 'statuspageUrlSettingId' is set
    if (statuspageUrlSettingId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'statuspageUrlSettingId' when calling"
                  + " deleteStatuspageUrlSetting"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/statuspage/url_settings/{statuspage_url_setting_id}"
            .replaceAll(
                "\\{" + "statuspage_url_setting_id" + "\\}",
                apiClient.escapeString(statuspageUrlSettingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.deleteStatuspageUrlSetting",
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
   * Get the Statuspage account.
   *
   * <p>See {@link #getStatuspageAccountWithHttpInfo}.
   *
   * @return StatuspageAccountResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageAccountResponse getStatuspageAccount() throws ApiException {
    return getStatuspageAccountWithHttpInfo().getData();
  }

  /**
   * Get the Statuspage account.
   *
   * <p>See {@link #getStatuspageAccountWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;StatuspageAccountResponse&gt;
   */
  public CompletableFuture<StatuspageAccountResponse> getStatuspageAccountAsync() {
    return getStatuspageAccountWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the Statuspage account configured for your organization.
   *
   * @return ApiResponse&lt;StatuspageAccountResponse&gt;
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
  public ApiResponse<StatuspageAccountResponse> getStatuspageAccountWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.getStatuspageAccount",
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Get the Statuspage account.
   *
   * <p>See {@link #getStatuspageAccountWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageAccountResponse>>
      getStatuspageAccountWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.getStatuspageAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Get all Statuspage URL settings.
   *
   * <p>See {@link #listStatuspageUrlSettingsWithHttpInfo}.
   *
   * @return StatuspageUrlSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageUrlSettingsResponse listStatuspageUrlSettings() throws ApiException {
    return listStatuspageUrlSettingsWithHttpInfo().getData();
  }

  /**
   * Get all Statuspage URL settings.
   *
   * <p>See {@link #listStatuspageUrlSettingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;StatuspageUrlSettingsResponse&gt;
   */
  public CompletableFuture<StatuspageUrlSettingsResponse> listStatuspageUrlSettingsAsync() {
    return listStatuspageUrlSettingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Statuspage URL settings configured for your organization.
   *
   * @return ApiResponse&lt;StatuspageUrlSettingsResponse&gt;
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
  public ApiResponse<StatuspageUrlSettingsResponse> listStatuspageUrlSettingsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/url_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.listStatuspageUrlSettings",
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
        new GenericType<StatuspageUrlSettingsResponse>() {});
  }

  /**
   * Get all Statuspage URL settings.
   *
   * <p>See {@link #listStatuspageUrlSettingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageUrlSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageUrlSettingsResponse>>
      listStatuspageUrlSettingsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/url_settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.listStatuspageUrlSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingsResponse>> result =
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
        new GenericType<StatuspageUrlSettingsResponse>() {});
  }

  /**
   * Update the Statuspage account.
   *
   * <p>See {@link #updateStatuspageAccountWithHttpInfo}.
   *
   * @param body Statuspage account payload. (required)
   * @return StatuspageAccountResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageAccountResponse updateStatuspageAccount(StatuspageAccountUpdateRequest body)
      throws ApiException {
    return updateStatuspageAccountWithHttpInfo(body).getData();
  }

  /**
   * Update the Statuspage account.
   *
   * <p>See {@link #updateStatuspageAccountWithHttpInfoAsync}.
   *
   * @param body Statuspage account payload. (required)
   * @return CompletableFuture&lt;StatuspageAccountResponse&gt;
   */
  public CompletableFuture<StatuspageAccountResponse> updateStatuspageAccountAsync(
      StatuspageAccountUpdateRequest body) {
    return updateStatuspageAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Statuspage account configured for your organization.
   *
   * @param body Statuspage account payload. (required)
   * @return ApiResponse&lt;StatuspageAccountResponse&gt;
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
  public ApiResponse<StatuspageAccountResponse> updateStatuspageAccountWithHttpInfo(
      StatuspageAccountUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateStatuspageAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.updateStatuspageAccount",
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Update the Statuspage account.
   *
   * <p>See {@link #updateStatuspageAccountWithHttpInfo}.
   *
   * @param body Statuspage account payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageAccountResponse>>
      updateStatuspageAccountWithHttpInfoAsync(StatuspageAccountUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatuspageAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateStatuspageAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/statuspage/account";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.updateStatuspageAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<StatuspageAccountResponse>() {});
  }

  /**
   * Update a Statuspage URL setting.
   *
   * <p>See {@link #updateStatuspageUrlSettingWithHttpInfo}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @param body Statuspage URL setting payload. (required)
   * @return StatuspageUrlSettingResponse
   * @throws ApiException if fails to make API call
   */
  public StatuspageUrlSettingResponse updateStatuspageUrlSetting(
      String statuspageUrlSettingId, StatuspageUrlSettingUpdateRequest body) throws ApiException {
    return updateStatuspageUrlSettingWithHttpInfo(statuspageUrlSettingId, body).getData();
  }

  /**
   * Update a Statuspage URL setting.
   *
   * <p>See {@link #updateStatuspageUrlSettingWithHttpInfoAsync}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @param body Statuspage URL setting payload. (required)
   * @return CompletableFuture&lt;StatuspageUrlSettingResponse&gt;
   */
  public CompletableFuture<StatuspageUrlSettingResponse> updateStatuspageUrlSettingAsync(
      String statuspageUrlSettingId, StatuspageUrlSettingUpdateRequest body) {
    return updateStatuspageUrlSettingWithHttpInfoAsync(statuspageUrlSettingId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a single Statuspage URL setting in your organization.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @param body Statuspage URL setting payload. (required)
   * @return ApiResponse&lt;StatuspageUrlSettingResponse&gt;
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
  public ApiResponse<StatuspageUrlSettingResponse> updateStatuspageUrlSettingWithHttpInfo(
      String statuspageUrlSettingId, StatuspageUrlSettingUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'statuspageUrlSettingId' is set
    if (statuspageUrlSettingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'statuspageUrlSettingId' when calling"
              + " updateStatuspageUrlSetting");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateStatuspageUrlSetting");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/statuspage/url_settings/{statuspage_url_setting_id}"
            .replaceAll(
                "\\{" + "statuspage_url_setting_id" + "\\}",
                apiClient.escapeString(statuspageUrlSettingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatuspageIntegrationApi.updateStatuspageUrlSetting",
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
        new GenericType<StatuspageUrlSettingResponse>() {});
  }

  /**
   * Update a Statuspage URL setting.
   *
   * <p>See {@link #updateStatuspageUrlSettingWithHttpInfo}.
   *
   * @param statuspageUrlSettingId The UUID of the Statuspage URL setting. (required)
   * @param body Statuspage URL setting payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;StatuspageUrlSettingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>>
      updateStatuspageUrlSettingWithHttpInfoAsync(
          String statuspageUrlSettingId, StatuspageUrlSettingUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'statuspageUrlSettingId' is set
    if (statuspageUrlSettingId == null) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'statuspageUrlSettingId' when calling"
                  + " updateStatuspageUrlSetting"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateStatuspageUrlSetting"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/statuspage/url_settings/{statuspage_url_setting_id}"
            .replaceAll(
                "\\{" + "statuspage_url_setting_id" + "\\}",
                apiClient.escapeString(statuspageUrlSettingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatuspageIntegrationApi.updateStatuspageUrlSetting",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatuspageUrlSettingResponse>> result =
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
        new GenericType<StatuspageUrlSettingResponse>() {});
  }
}
