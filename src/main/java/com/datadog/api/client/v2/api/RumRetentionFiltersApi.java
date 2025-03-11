package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumRetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RumRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumRetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RumRetentionFiltersOrderRequest;
import com.datadog.api.client.v2.model.RumRetentionFiltersOrderResponse;
import com.datadog.api.client.v2.model.RumRetentionFiltersResponse;
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
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return RumRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionFilterResponse createRetentionFilter(
      String appId, RumRetentionFilterCreateRequest body) throws ApiException {
    return createRetentionFilterWithHttpInfo(appId, body).getData();
  }

  /**
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return CompletableFuture&lt;RumRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumRetentionFilterResponse> createRetentionFilterAsync(
      String appId, RumRetentionFilterCreateRequest body) {
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
   * @return ApiResponse&lt;RumRetentionFilterResponse&gt;
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
  public ApiResponse<RumRetentionFilterResponse> createRetentionFilterWithHttpInfo(
      String appId, RumRetentionFilterCreateRequest body) throws ApiException {
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumRetentionFilterResponse>() {});
  }

  /**
   * Create a RUM retention filter.
   *
   * <p>See {@link #createRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body The definition of the new RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionFilterResponse>>
      createRetentionFilterWithHttpInfoAsync(String appId, RumRetentionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling createRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRetentionFilterResponse>() {});
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
   * Get a RUM retention filter.
   *
   * <p>See {@link #getRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return RumRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionFilterResponse getRetentionFilter(String appId, String rfId)
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
   * @return CompletableFuture&lt;RumRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumRetentionFilterResponse> getRetentionFilterAsync(
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
   * @return ApiResponse&lt;RumRetentionFilterResponse&gt;
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
  public ApiResponse<RumRetentionFilterResponse> getRetentionFilterWithHttpInfo(
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumRetentionFilterResponse>() {});
  }

  /**
   * Get a RUM retention filter.
   *
   * <p>See {@link #getRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionFilterResponse>>
      getRetentionFilterWithHttpInfoAsync(String appId, String rfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling getRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRetentionFilterResponse>() {});
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RumRetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionFiltersResponse listRetentionFilters(String appId) throws ApiException {
    return listRetentionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RumRetentionFiltersResponse&gt;
   */
  public CompletableFuture<RumRetentionFiltersResponse> listRetentionFiltersAsync(String appId) {
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
   * @return ApiResponse&lt;RumRetentionFiltersResponse&gt;
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
  public ApiResponse<RumRetentionFiltersResponse> listRetentionFiltersWithHttpInfo(String appId)
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumRetentionFiltersResponse>() {});
  }

  /**
   * Get all RUM retention filters.
   *
   * <p>See {@link #listRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionFiltersResponse>>
      listRetentionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumRetentionFiltersResponse>> result =
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionFiltersResponse>> result =
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
        new GenericType<RumRetentionFiltersResponse>() {});
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return RumRetentionFiltersOrderResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionFiltersOrderResponse orderRetentionFilters(
      String appId, RumRetentionFiltersOrderRequest body) throws ApiException {
    return orderRetentionFiltersWithHttpInfo(appId, body).getData();
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;RumRetentionFiltersOrderResponse&gt;
   */
  public CompletableFuture<RumRetentionFiltersOrderResponse> orderRetentionFiltersAsync(
      String appId, RumRetentionFiltersOrderRequest body) {
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
   * @return ApiResponse&lt;RumRetentionFiltersOrderResponse&gt;
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
  public ApiResponse<RumRetentionFiltersOrderResponse> orderRetentionFiltersWithHttpInfo(
      String appId, RumRetentionFiltersOrderRequest body) throws ApiException {
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumRetentionFiltersOrderResponse>() {});
  }

  /**
   * Order RUM retention filters.
   *
   * <p>See {@link #orderRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionFiltersOrderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionFiltersOrderResponse>>
      orderRetentionFiltersWithHttpInfoAsync(String appId, RumRetentionFiltersOrderRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumRetentionFiltersOrderResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling orderRetentionFilters"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRetentionFiltersOrderResponse>> result =
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionFiltersOrderResponse>> result =
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
        new GenericType<RumRetentionFiltersOrderResponse>() {});
  }

  /**
   * Update a RUM retention filter.
   *
   * <p>See {@link #updateRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return RumRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumRetentionFilterResponse updateRetentionFilter(
      String appId, String rfId, RumRetentionFilterUpdateRequest body) throws ApiException {
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
   * @return CompletableFuture&lt;RumRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumRetentionFilterResponse> updateRetentionFilterAsync(
      String appId, String rfId, RumRetentionFilterUpdateRequest body) {
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
   * @return ApiResponse&lt;RumRetentionFilterResponse&gt;
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
  public ApiResponse<RumRetentionFilterResponse> updateRetentionFilterWithHttpInfo(
      String appId, String rfId, RumRetentionFilterUpdateRequest body) throws ApiException {
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RumRetentionFilterResponse>() {});
  }

  /**
   * Update a RUM retention filter.
   *
   * <p>See {@link #updateRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Retention filter ID. (required)
   * @param body New definition of the RUM retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumRetentionFilterResponse>>
      updateRetentionFilterWithHttpInfoAsync(
          String appId, String rfId, RumRetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appId' when calling updateRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'rfId' when calling updateRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumRetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumRetentionFilterResponse>() {});
  }
}
