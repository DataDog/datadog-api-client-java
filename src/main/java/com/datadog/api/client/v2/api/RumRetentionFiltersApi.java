package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.RUMExclusionFilterResponse;
import com.datadog.api.client.v2.model.RUMExclusionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RUMExclusionFiltersResponse;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterID;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterResponse;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RUMPermanentRetentionFiltersResponse;
import com.datadog.api.client.v2.model.RUMRetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RUMRetentionFilterResponse;
import com.datadog.api.client.v2.model.RUMRetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RUMRetentionFiltersOrderRequest;
import com.datadog.api.client.v2.model.RUMRetentionFiltersOrderResponse;
import com.datadog.api.client.v2.model.RUMRetentionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionFiltersApi {
  private ApiClient apiClient;

  public RumRetentionFiltersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRetentionFiltersApi(ApiClient apiClient) {
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
   * Create a RUM exclusion filter.
   *
   * <p>See {@link #createExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM exclusion filter. (required)
   * @return RUMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMExclusionFilterResponse createExclusionFilter(
      String appId, RUMExclusionFilterCreateRequest body) throws ApiException {
    return createExclusionFilterWithHttpInfo(appId, body).getData();
  }

  /**
   * Create a RUM exclusion filter.
   *
   * <p>See {@link #createExclusionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM exclusion filter. (required)
   * @return CompletableFuture&lt;RUMExclusionFilterResponse&gt;
   */
  public CompletableFuture<RUMExclusionFilterResponse> createExclusionFilterAsync(
      String appId, RUMExclusionFilterCreateRequest body) {
    return createExclusionFilterWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an exclusion filter for a RUM application. Returns the created exclusion filter when the
   * request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM exclusion filter. (required)
   * @return ApiResponse&lt;RUMExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMExclusionFilterResponse> createExclusionFilterWithHttpInfo(
      String appId, RUMExclusionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling createExclusionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.createExclusionFilter",
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Create a RUM exclusion filter.
   *
   * <p>See {@link #createExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMExclusionFilterResponse>>
      createExclusionFilterWithHttpInfoAsync(String appId, RUMExclusionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling createExclusionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.createExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return RUMRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionFilterResponse createRetentionFilter(
      String appId, RUMRetentionFilterCreateRequest body) throws ApiException {
    return createRetentionFilterWithHttpInfo(appId, body).getData();
  }

  /**
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return CompletableFuture&lt;RUMRetentionFilterResponse&gt;
   */
  public CompletableFuture<RUMRetentionFilterResponse> createRetentionFilterAsync(
      String appId, RUMRetentionFilterCreateRequest body) {
    return createRetentionFilterWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a RUM retention filter for a RUM application. Returns RUM retention filter objects from
   * the request body when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return ApiResponse&lt;RUMRetentionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMRetentionFilterResponse> createRetentionFilterWithHttpInfo(
      String appId, RUMRetentionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling createRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.createRetentionFilter",
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }

  /**
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionFilterResponse>>
      createRetentionFilterWithHttpInfoAsync(String appId, RUMRetentionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling createRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.createRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }

  /**
   * Delete a RUM exclusion filter.
   *
   * <p>See {@link #deleteExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExclusionFilter(String appId, String efId) throws ApiException {
    deleteExclusionFilterWithHttpInfo(appId, efId);
  }

  /**
   * Delete a RUM exclusion filter.
   *
   * <p>See {@link #deleteExclusionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteExclusionFilterAsync(String appId, String efId) {
    return deleteExclusionFilterWithHttpInfoAsync(appId, efId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an exclusion filter for a RUM application. The built-in Error Tracking exclusion filter
   * (<code>error_tracking_exclusion_filter</code>) cannot be deleted; attempting to do so returns a
   * <code>405 Method Not Allowed</code> response.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteExclusionFilterWithHttpInfo(String appId, String efId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling deleteExclusionFilter");
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'efId' when calling deleteExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.deleteExclusionFilter",
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
   * Delete a RUM exclusion filter.
   *
   * <p>See {@link #deleteExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteExclusionFilterWithHttpInfoAsync(
      String appId, String efId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling deleteExclusionFilter"));
      return result;
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'efId' when calling deleteExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.deleteExclusionFilter",
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
   * Delete a RUM retention filter.
   *
   * <p>See {@link #deleteRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRetentionFilter(String appId, String rfId) throws ApiException {
    deleteRetentionFilterWithHttpInfo(appId, rfId);
  }

  /**
   * Delete a RUM retention filter.
   *
   * <p>See {@link #deleteRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRetentionFilterAsync(String appId, String rfId) {
    return deleteRetentionFilterWithHttpInfoAsync(appId, rfId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a RUM retention filter for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRetentionFilterWithHttpInfo(String appId, String rfId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling deleteRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling deleteRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.deleteRetentionFilter",
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
   * Delete a RUM retention filter.
   *
   * <p>See {@link #deleteRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRetentionFilterWithHttpInfoAsync(
      String appId, String rfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling deleteRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rfId' when calling deleteRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.deleteRetentionFilter",
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
   * Get a RUM exclusion filter.
   *
   * <p>See {@link #getExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return RUMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMExclusionFilterResponse getExclusionFilter(String appId, String efId)
      throws ApiException {
    return getExclusionFilterWithHttpInfo(appId, efId).getData();
  }

  /**
   * Get a RUM exclusion filter.
   *
   * <p>See {@link #getExclusionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return CompletableFuture&lt;RUMExclusionFilterResponse&gt;
   */
  public CompletableFuture<RUMExclusionFilterResponse> getExclusionFilterAsync(
      String appId, String efId) {
    return getExclusionFilterWithHttpInfoAsync(appId, efId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single exclusion filter for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return ApiResponse&lt;RUMExclusionFilterResponse&gt;
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
  public ApiResponse<RUMExclusionFilterResponse> getExclusionFilterWithHttpInfo(
      String appId, String efId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getExclusionFilter");
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'efId' when calling getExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.getExclusionFilter",
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Get a RUM exclusion filter.
   *
   * <p>See {@link #getExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMExclusionFilterResponse>>
      getExclusionFilterWithHttpInfoAsync(String appId, String efId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling getExclusionFilter"));
      return result;
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'efId' when calling getExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.getExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Get a permanent RUM retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @return RUMPermanentRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMPermanentRetentionFilterResponse getPermanentRetentionFilter(
      String appId, RUMPermanentRetentionFilterID permanentRfId) throws ApiException {
    return getPermanentRetentionFilterWithHttpInfo(appId, permanentRfId).getData();
  }

  /**
   * Get a permanent RUM retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @return CompletableFuture&lt;RUMPermanentRetentionFilterResponse&gt;
   */
  public CompletableFuture<RUMPermanentRetentionFilterResponse> getPermanentRetentionFilterAsync(
      String appId, RUMPermanentRetentionFilterID permanentRfId) {
    return getPermanentRetentionFilterWithHttpInfoAsync(appId, permanentRfId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a permanent RUM retention filter for a RUM application by its identifier.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @return ApiResponse&lt;RUMPermanentRetentionFilterResponse&gt;
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
  public ApiResponse<RUMPermanentRetentionFilterResponse> getPermanentRetentionFilterWithHttpInfo(
      String appId, RUMPermanentRetentionFilterID permanentRfId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getPermanentRetentionFilter");
    }

    // verify the required parameter 'permanentRfId' is set
    if (permanentRfId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'permanentRfId' when calling"
              + " getPermanentRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent/{permanent_rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll(
                "\\{" + "permanent_rf_id" + "\\}",
                apiClient.escapeString(permanentRfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.getPermanentRetentionFilter",
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
        new GenericType<RUMPermanentRetentionFilterResponse>() {});
  }

  /**
   * Get a permanent RUM retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMPermanentRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>>
      getPermanentRetentionFilterWithHttpInfoAsync(
          String appId, RUMPermanentRetentionFilterID permanentRfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling getPermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'permanentRfId' is set
    if (permanentRfId == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'permanentRfId' when calling"
                  + " getPermanentRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent/{permanent_rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll(
                "\\{" + "permanent_rf_id" + "\\}",
                apiClient.escapeString(permanentRfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.getPermanentRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
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
        new GenericType<RUMPermanentRetentionFilterResponse>() {});
  }

  /**
   * Get a RUM retention filter.
   *
   * <p>See {@link #getRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return RUMRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionFilterResponse getRetentionFilter(String appId, String rfId)
      throws ApiException {
    return getRetentionFilterWithHttpInfo(appId, rfId).getData();
  }

  /**
   * Get a RUM retention filter.
   *
   * <p>See {@link #getRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return CompletableFuture&lt;RUMRetentionFilterResponse&gt;
   */
  public CompletableFuture<RUMRetentionFilterResponse> getRetentionFilterAsync(
      String appId, String rfId) {
    return getRetentionFilterWithHttpInfoAsync(appId, rfId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a RUM retention filter for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return ApiResponse&lt;RUMRetentionFilterResponse&gt;
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
  public ApiResponse<RUMRetentionFilterResponse> getRetentionFilterWithHttpInfo(
      String appId, String rfId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling getRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.getRetentionFilter",
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }

  /**
   * Get a RUM retention filter.
   *
   * <p>See {@link #getRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionFilterResponse>>
      getRetentionFilterWithHttpInfoAsync(String appId, String rfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling getRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rfId' when calling getRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.getRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }

  /**
   * Get all RUM exclusion filters.
   *
   * <p>See {@link #listExclusionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RUMExclusionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RUMExclusionFiltersResponse listExclusionFilters(String appId) throws ApiException {
    return listExclusionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all RUM exclusion filters.
   *
   * <p>See {@link #listExclusionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RUMExclusionFiltersResponse&gt;
   */
  public CompletableFuture<RUMExclusionFiltersResponse> listExclusionFiltersAsync(String appId) {
    return listExclusionFiltersWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of exclusion filters for a RUM application. The built-in Error Tracking exclusion
   * filter (<code>error_tracking_exclusion_filter</code>) is always returned first.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RUMExclusionFiltersResponse&gt;
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
  public ApiResponse<RUMExclusionFiltersResponse> listExclusionFiltersWithHttpInfo(String appId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listExclusionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.listExclusionFilters",
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
        new GenericType<RUMExclusionFiltersResponse>() {});
  }

  /**
   * Get all RUM exclusion filters.
   *
   * <p>See {@link #listExclusionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMExclusionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMExclusionFiltersResponse>>
      listExclusionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling listExclusionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.listExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMExclusionFiltersResponse>> result =
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
        new GenericType<RUMExclusionFiltersResponse>() {});
  }

  /**
   * Get all permanent RUM retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RUMPermanentRetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RUMPermanentRetentionFiltersResponse listPermanentRetentionFilters(String appId)
      throws ApiException {
    return listPermanentRetentionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all permanent RUM retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RUMPermanentRetentionFiltersResponse&gt;
   */
  public CompletableFuture<RUMPermanentRetentionFiltersResponse> listPermanentRetentionFiltersAsync(
      String appId) {
    return listPermanentRetentionFiltersWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of permanent RUM retention filters for a RUM application. Permanent retention
   * filters are predefined filters that cannot be created or deleted. For each filter, the <code>
   * editability</code> block indicates which cross-product fields can be updated.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RUMPermanentRetentionFiltersResponse&gt;
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
  public ApiResponse<RUMPermanentRetentionFiltersResponse>
      listPermanentRetentionFiltersWithHttpInfo(String appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listPermanentRetentionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.listPermanentRetentionFilters",
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
        new GenericType<RUMPermanentRetentionFiltersResponse>() {});
  }

  /**
   * Get all permanent RUM retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMPermanentRetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMPermanentRetentionFiltersResponse>>
      listPermanentRetentionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling listPermanentRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.listPermanentRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFiltersResponse>> result =
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
        new GenericType<RUMPermanentRetentionFiltersResponse>() {});
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RUMRetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionFiltersResponse listRetentionFilters(String appId) throws ApiException {
    return listRetentionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RUMRetentionFiltersResponse&gt;
   */
  public CompletableFuture<RUMRetentionFiltersResponse> listRetentionFiltersAsync(String appId) {
    return listRetentionFiltersWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of RUM retention filters for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RUMRetentionFiltersResponse&gt;
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
  public ApiResponse<RUMRetentionFiltersResponse> listRetentionFiltersWithHttpInfo(String appId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listRetentionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.listRetentionFilters",
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
        new GenericType<RUMRetentionFiltersResponse>() {});
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionFiltersResponse>>
      listRetentionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling listRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.listRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionFiltersResponse>> result =
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
        new GenericType<RUMRetentionFiltersResponse>() {});
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return RUMRetentionFiltersOrderResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionFiltersOrderResponse orderRetentionFilters(
      String appId, RUMRetentionFiltersOrderRequest body) throws ApiException {
    return orderRetentionFiltersWithHttpInfo(appId, body).getData();
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;RUMRetentionFiltersOrderResponse&gt;
   */
  public CompletableFuture<RUMRetentionFiltersOrderResponse> orderRetentionFiltersAsync(
      String appId, RUMRetentionFiltersOrderRequest body) {
    return orderRetentionFiltersWithHttpInfoAsync(appId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Order RUM retention filters for a RUM application. Returns RUM retention filter objects without
   * attributes from the request body when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return ApiResponse&lt;RUMRetentionFiltersOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Ordered </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMRetentionFiltersOrderResponse> orderRetentionFiltersWithHttpInfo(
      String appId, RUMRetentionFiltersOrderRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling orderRetentionFilters");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling orderRetentionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/relationships/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.orderRetentionFilters",
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
        new GenericType<RUMRetentionFiltersOrderResponse>() {});
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionFiltersOrderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionFiltersOrderResponse>>
      orderRetentionFiltersWithHttpInfoAsync(String appId, RUMRetentionFiltersOrderRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFiltersOrderResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling orderRetentionFilters"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMRetentionFiltersOrderResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling orderRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/relationships/retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.orderRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionFiltersOrderResponse>> result =
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
        new GenericType<RUMRetentionFiltersOrderResponse>() {});
  }

  /**
   * Update a RUM exclusion filter.
   *
   * <p>See {@link #updateExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @param body New definition of the RUM exclusion filter. (required)
   * @return RUMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMExclusionFilterResponse updateExclusionFilter(
      String appId, String efId, RUMExclusionFilterUpdateRequest body) throws ApiException {
    return updateExclusionFilterWithHttpInfo(appId, efId, body).getData();
  }

  /**
   * Update a RUM exclusion filter.
   *
   * <p>See {@link #updateExclusionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @param body New definition of the RUM exclusion filter. (required)
   * @return CompletableFuture&lt;RUMExclusionFilterResponse&gt;
   */
  public CompletableFuture<RUMExclusionFilterResponse> updateExclusionFilterAsync(
      String appId, String efId, RUMExclusionFilterUpdateRequest body) {
    return updateExclusionFilterWithHttpInfoAsync(appId, efId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an exclusion filter for a RUM application. For the built-in Error Tracking exclusion
   * filter (<code>error_tracking_exclusion_filter</code>), only <code>enabled</code> can be
   * updated; <code>name</code>, <code>event_type</code>, and <code>query</code> must be omitted.
   * Returns the updated exclusion filter when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @param body New definition of the RUM exclusion filter. (required)
   * @return ApiResponse&lt;RUMExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMExclusionFilterResponse> updateExclusionFilterWithHttpInfo(
      String appId, String efId, RUMExclusionFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateExclusionFilter");
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'efId' when calling updateExclusionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.updateExclusionFilter",
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Update a RUM exclusion filter.
   *
   * <p>See {@link #updateExclusionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param efId Exclusion filter ID. (required)
   * @param body New definition of the RUM exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMExclusionFilterResponse>>
      updateExclusionFilterWithHttpInfoAsync(
          String appId, String efId, RUMExclusionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateExclusionFilter"));
      return result;
    }

    // verify the required parameter 'efId' is set
    if (efId == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'efId' when calling updateExclusionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/exclusion/{ef_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "ef_id" + "\\}", apiClient.escapeString(efId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.updateExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMExclusionFilterResponse>() {});
  }

  /**
   * Update a permanent RUM retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @param body New configuration of the permanent RUM retention filter. (required)
   * @return RUMPermanentRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMPermanentRetentionFilterResponse updatePermanentRetentionFilter(
      String appId,
      RUMPermanentRetentionFilterID permanentRfId,
      RUMPermanentRetentionFilterUpdateRequest body)
      throws ApiException {
    return updatePermanentRetentionFilterWithHttpInfo(appId, permanentRfId, body).getData();
  }

  /**
   * Update a permanent RUM retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @param body New configuration of the permanent RUM retention filter. (required)
   * @return CompletableFuture&lt;RUMPermanentRetentionFilterResponse&gt;
   */
  public CompletableFuture<RUMPermanentRetentionFilterResponse> updatePermanentRetentionFilterAsync(
      String appId,
      RUMPermanentRetentionFilterID permanentRfId,
      RUMPermanentRetentionFilterUpdateRequest body) {
    return updatePermanentRetentionFilterWithHttpInfoAsync(appId, permanentRfId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the cross-product sampling configuration of a permanent RUM retention filter for a RUM
   * application. Only fields marked as editable in the <code>editability</code> block of the filter
   * can be updated. Updating a non-editable field returns a <code>400</code> response.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @param body New configuration of the permanent RUM retention filter. (required)
   * @return ApiResponse&lt;RUMPermanentRetentionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMPermanentRetentionFilterResponse>
      updatePermanentRetentionFilterWithHttpInfo(
          String appId,
          RUMPermanentRetentionFilterID permanentRfId,
          RUMPermanentRetentionFilterUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appId' when calling updatePermanentRetentionFilter");
    }

    // verify the required parameter 'permanentRfId' is set
    if (permanentRfId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'permanentRfId' when calling"
              + " updatePermanentRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePermanentRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent/{permanent_rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll(
                "\\{" + "permanent_rf_id" + "\\}",
                apiClient.escapeString(permanentRfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.updatePermanentRetentionFilter",
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
        new GenericType<RUMPermanentRetentionFilterResponse>() {});
  }

  /**
   * Update a permanent RUM retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param permanentRfId The identifier of the permanent RUM retention filter. (required)
   * @param body New configuration of the permanent RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMPermanentRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>>
      updatePermanentRetentionFilterWithHttpInfoAsync(
          String appId,
          RUMPermanentRetentionFilterID permanentRfId,
          RUMPermanentRetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling"
                  + " updatePermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'permanentRfId' is set
    if (permanentRfId == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'permanentRfId' when calling"
                  + " updatePermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updatePermanentRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/permanent/{permanent_rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll(
                "\\{" + "permanent_rf_id" + "\\}",
                apiClient.escapeString(permanentRfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.updatePermanentRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMPermanentRetentionFilterResponse>> result =
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
        new GenericType<RUMPermanentRetentionFilterResponse>() {});
  }

  /**
   * Update a RUM retention filter.
   *
   * <p>See {@link #updateRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return RUMRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RUMRetentionFilterResponse updateRetentionFilter(
      String appId, String rfId, RUMRetentionFilterUpdateRequest body) throws ApiException {
    return updateRetentionFilterWithHttpInfo(appId, rfId, body).getData();
  }

  /**
   * Update a RUM retention filter.
   *
   * <p>See {@link #updateRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;RUMRetentionFilterResponse&gt;
   */
  public CompletableFuture<RUMRetentionFilterResponse> updateRetentionFilterAsync(
      String appId, String rfId, RUMRetentionFilterUpdateRequest body) {
    return updateRetentionFilterWithHttpInfoAsync(appId, rfId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a RUM retention filter for a RUM application. Returns RUM retention filter objects from
   * the request body when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return ApiResponse&lt;RUMRetentionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Updated </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMRetentionFilterResponse> updateRetentionFilterWithHttpInfo(
      String appId, String rfId, RUMRetentionFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling updateRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling updateRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersApi.updateRetentionFilter",
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }

  /**
   * Update a RUM retention filter.
   *
   * <p>See {@link #updateRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMRetentionFilterResponse>>
      updateRetentionFilterWithHttpInfoAsync(
          String appId, String rfId, RUMRetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rfId' when calling updateRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersApi.updateRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMRetentionFilterResponse>() {});
  }
}
