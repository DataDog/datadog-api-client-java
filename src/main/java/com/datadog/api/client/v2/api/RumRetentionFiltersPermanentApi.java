package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumPermanentRetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RumPermanentRetentionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionFiltersPermanentApi {
  private ApiClient apiClient;

  public RumRetentionFiltersPermanentApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRetentionFiltersPermanentApi(ApiClient apiClient) {
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
   * Get a permanent retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @return RumPermanentRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumPermanentRetentionFilterResponse getPermanentRetentionFilter(String appId, String rfId)
      throws ApiException {
    return getPermanentRetentionFilterWithHttpInfo(appId, rfId).getData();
  }

  /**
   * Get a permanent retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @return CompletableFuture&lt;RumPermanentRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumPermanentRetentionFilterResponse> getPermanentRetentionFilterAsync(
      String appId, String rfId) {
    return getPermanentRetentionFilterWithHttpInfoAsync(appId, rfId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single permanent retention filter for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @return ApiResponse&lt;RumPermanentRetentionFilterResponse&gt;
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
  public ApiResponse<RumPermanentRetentionFilterResponse> getPermanentRetentionFilterWithHttpInfo(
      String appId, String rfId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getPermanentRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling getPermanentRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersPermanentApi.getPermanentRetentionFilter",
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
        new GenericType<RumPermanentRetentionFilterResponse>() {});
  }

  /**
   * Get a permanent retention filter.
   *
   * <p>See {@link #getPermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumPermanentRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>>
      getPermanentRetentionFilterWithHttpInfoAsync(String appId, String rfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling getPermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rfId' when calling getPermanentRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersPermanentApi.getPermanentRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
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
        new GenericType<RumPermanentRetentionFilterResponse>() {});
  }

  /**
   * Get all permanent retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RumPermanentRetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RumPermanentRetentionFiltersResponse listPermanentRetentionFilters(String appId)
      throws ApiException {
    return listPermanentRetentionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all permanent retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RumPermanentRetentionFiltersResponse&gt;
   */
  public CompletableFuture<RumPermanentRetentionFiltersResponse> listPermanentRetentionFiltersAsync(
      String appId) {
    return listPermanentRetentionFiltersWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of permanent retention filters for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RumPermanentRetentionFiltersResponse&gt;
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
  public ApiResponse<RumPermanentRetentionFiltersResponse>
      listPermanentRetentionFiltersWithHttpInfo(String appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listPermanentRetentionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersPermanentApi.listPermanentRetentionFilters",
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
        new GenericType<RumPermanentRetentionFiltersResponse>() {});
  }

  /**
   * Get all permanent retention filters.
   *
   * <p>See {@link #listPermanentRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumPermanentRetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumPermanentRetentionFiltersResponse>>
      listPermanentRetentionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling listPermanentRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersPermanentApi.listPermanentRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFiltersResponse>> result =
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
        new GenericType<RumPermanentRetentionFiltersResponse>() {});
  }

  /**
   * Update a permanent retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @param body New cross-product sample rates for the permanent retention filter. (required)
   * @return RumPermanentRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumPermanentRetentionFilterResponse updatePermanentRetentionFilter(
      String appId, String rfId, RumPermanentRetentionFilterUpdateRequest body)
      throws ApiException {
    return updatePermanentRetentionFilterWithHttpInfo(appId, rfId, body).getData();
  }

  /**
   * Update a permanent retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @param body New cross-product sample rates for the permanent retention filter. (required)
   * @return CompletableFuture&lt;RumPermanentRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumPermanentRetentionFilterResponse> updatePermanentRetentionFilterAsync(
      String appId, String rfId, RumPermanentRetentionFilterUpdateRequest body) {
    return updatePermanentRetentionFilterWithHttpInfoAsync(appId, rfId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the cross-product sample rates of a permanent retention filter for a RUM application.
   * Only <code>cross_product_sampling.trace_sample_rate</code> can be updated, and only when the
   * matching flag in <code>cross_product_sampling_editability</code> is <code>true</code> on the
   * filter. Any other field is read-only and cannot be sent in the payload. Returns the updated
   * permanent retention filter when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @param body New cross-product sample rates for the permanent retention filter. (required)
   * @return ApiResponse&lt;RumPermanentRetentionFilterResponse&gt;
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
  public ApiResponse<RumPermanentRetentionFilterResponse>
      updatePermanentRetentionFilterWithHttpInfo(
          String appId, String rfId, RumPermanentRetentionFilterUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appId' when calling updatePermanentRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling updatePermanentRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePermanentRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersPermanentApi.updatePermanentRetentionFilter",
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
        new GenericType<RumPermanentRetentionFilterResponse>() {});
  }

  /**
   * Update a permanent retention filter.
   *
   * <p>See {@link #updatePermanentRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Permanent retention filter ID. (required)
   * @param body New cross-product sample rates for the permanent retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumPermanentRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>>
      updatePermanentRetentionFilterWithHttpInfoAsync(
          String appId, String rfId, RumPermanentRetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling"
                  + " updatePermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rfId' when calling updatePermanentRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updatePermanentRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/permanent_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersPermanentApi.updatePermanentRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumPermanentRetentionFilterResponse>> result =
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
        new GenericType<RumPermanentRetentionFilterResponse>() {});
  }
}
