package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionFiltersHardcodedApi {
  private ApiClient apiClient;

  public RumRetentionFiltersHardcodedApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumRetentionFiltersHardcodedApi(ApiClient apiClient) {
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
   * Get a hardcoded retention filter.
   *
   * <p>See {@link #getHardcodedRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @return RumHardcodedRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumHardcodedRetentionFilterResponse getHardcodedRetentionFilter(String appId, String rfId)
      throws ApiException {
    return getHardcodedRetentionFilterWithHttpInfo(appId, rfId).getData();
  }

  /**
   * Get a hardcoded retention filter.
   *
   * <p>See {@link #getHardcodedRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @return CompletableFuture&lt;RumHardcodedRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumHardcodedRetentionFilterResponse> getHardcodedRetentionFilterAsync(
      String appId, String rfId) {
    return getHardcodedRetentionFilterWithHttpInfoAsync(appId, rfId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single hardcoded retention filter for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @return ApiResponse&lt;RumHardcodedRetentionFilterResponse&gt;
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
  public ApiResponse<RumHardcodedRetentionFilterResponse> getHardcodedRetentionFilterWithHttpInfo(
      String appId, String rfId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling getHardcodedRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling getHardcodedRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersHardcodedApi.getHardcodedRetentionFilter",
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
        new GenericType<RumHardcodedRetentionFilterResponse>() {});
  }

  /**
   * Get a hardcoded retention filter.
   *
   * <p>See {@link #getHardcodedRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumHardcodedRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>>
      getHardcodedRetentionFilterWithHttpInfoAsync(String appId, String rfId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling getHardcodedRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rfId' when calling getHardcodedRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersHardcodedApi.getHardcodedRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
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
        new GenericType<RumHardcodedRetentionFilterResponse>() {});
  }

  /**
   * Get all hardcoded retention filters.
   *
   * <p>See {@link #listHardcodedRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return RumHardcodedRetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RumHardcodedRetentionFiltersResponse listHardcodedRetentionFilters(String appId)
      throws ApiException {
    return listHardcodedRetentionFiltersWithHttpInfo(appId).getData();
  }

  /**
   * Get all hardcoded retention filters.
   *
   * <p>See {@link #listHardcodedRetentionFiltersWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;RumHardcodedRetentionFiltersResponse&gt;
   */
  public CompletableFuture<RumHardcodedRetentionFiltersResponse> listHardcodedRetentionFiltersAsync(
      String appId) {
    return listHardcodedRetentionFiltersWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of hardcoded retention filters for a RUM application.
   *
   * @param appId RUM application ID. (required)
   * @return ApiResponse&lt;RumHardcodedRetentionFiltersResponse&gt;
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
  public ApiResponse<RumHardcodedRetentionFiltersResponse>
      listHardcodedRetentionFiltersWithHttpInfo(String appId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appId' when calling listHardcodedRetentionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersHardcodedApi.listHardcodedRetentionFilters",
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
        new GenericType<RumHardcodedRetentionFiltersResponse>() {});
  }

  /**
   * Get all hardcoded retention filters.
   *
   * <p>See {@link #listHardcodedRetentionFiltersWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumHardcodedRetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumHardcodedRetentionFiltersResponse>>
      listHardcodedRetentionFiltersWithHttpInfoAsync(String appId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling listHardcodedRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersHardcodedApi.listHardcodedRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFiltersResponse>> result =
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
        new GenericType<RumHardcodedRetentionFiltersResponse>() {});
  }

  /**
   * Update a hardcoded retention filter.
   *
   * <p>See {@link #updateHardcodedRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @param body New cross-product sample rates for the hardcoded retention filter. (required)
   * @return RumHardcodedRetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RumHardcodedRetentionFilterResponse updateHardcodedRetentionFilter(
      String appId, String rfId, RumHardcodedRetentionFilterUpdateRequest body)
      throws ApiException {
    return updateHardcodedRetentionFilterWithHttpInfo(appId, rfId, body).getData();
  }

  /**
   * Update a hardcoded retention filter.
   *
   * <p>See {@link #updateHardcodedRetentionFilterWithHttpInfoAsync}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @param body New cross-product sample rates for the hardcoded retention filter. (required)
   * @return CompletableFuture&lt;RumHardcodedRetentionFilterResponse&gt;
   */
  public CompletableFuture<RumHardcodedRetentionFilterResponse> updateHardcodedRetentionFilterAsync(
      String appId, String rfId, RumHardcodedRetentionFilterUpdateRequest body) {
    return updateHardcodedRetentionFilterWithHttpInfoAsync(appId, rfId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the cross-product sample rates of a hardcoded retention filter for a RUM application.
   * Only fields whose matching flag in <code>cross_product_sampling_editability</code> is <code>
   * true</code> can be updated. Any other field is read-only and cannot be sent in the payload.
   * Returns the updated hardcoded retention filter when the request is successful.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @param body New cross-product sample rates for the hardcoded retention filter. (required)
   * @return ApiResponse&lt;RumHardcodedRetentionFilterResponse&gt;
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
  public ApiResponse<RumHardcodedRetentionFilterResponse>
      updateHardcodedRetentionFilterWithHttpInfo(
          String appId, String rfId, RumHardcodedRetentionFilterUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appId' when calling updateHardcodedRetentionFilter");
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rfId' when calling updateHardcodedRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateHardcodedRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumRetentionFiltersHardcodedApi.updateHardcodedRetentionFilter",
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
        new GenericType<RumHardcodedRetentionFilterResponse>() {});
  }

  /**
   * Update a hardcoded retention filter.
   *
   * <p>See {@link #updateHardcodedRetentionFilterWithHttpInfo}.
   *
   * @param appId RUM application ID. (required)
   * @param rfId Hardcoded retention filter ID. (required)
   * @param body New cross-product sample rates for the hardcoded retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumHardcodedRetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>>
      updateHardcodedRetentionFilterWithHttpInfoAsync(
          String appId, String rfId, RumHardcodedRetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'appId' when calling"
                  + " updateHardcodedRetentionFilter"));
      return result;
    }

    // verify the required parameter 'rfId' is set
    if (rfId == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'rfId' when calling updateHardcodedRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateHardcodedRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{app_id}/hardcoded_retention_filters/{rf_id}"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "rf_id" + "\\}", apiClient.escapeString(rfId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumRetentionFiltersHardcodedApi.updateHardcodedRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumHardcodedRetentionFilterResponse>> result =
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
        new GenericType<RumHardcodedRetentionFilterResponse>() {});
  }
}
