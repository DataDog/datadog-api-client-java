package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsFormulaJourneyRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsFormulaRetentionRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyFunnelRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyFunnelResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyScalarRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyScalarResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyTimeseriesResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionGridRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionGridResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsScalarResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItem;
import com.datadog.api.client.v2.model.ProductAnalyticsTimeseriesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsApi {
  private ApiClient apiClient;

  public ProductAnalyticsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ProductAnalyticsApi(ApiClient apiClient) {
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
   * Compute journey funnel analysis.
   *
   * <p>See {@link #queryProductAnalyticsJourneyFunnelWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsJourneyFunnelResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsJourneyFunnelResponse queryProductAnalyticsJourneyFunnel(
      ProductAnalyticsJourneyFunnelRequest body) throws ApiException {
    return queryProductAnalyticsJourneyFunnelWithHttpInfo(body).getData();
  }

  /**
   * Compute journey funnel analysis.
   *
   * <p>See {@link #queryProductAnalyticsJourneyFunnelWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsJourneyFunnelResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsJourneyFunnelResponse>
      queryProductAnalyticsJourneyFunnelAsync(ProductAnalyticsJourneyFunnelRequest body) {
    return queryProductAnalyticsJourneyFunnelWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute a funnel over an ordered sequence of Product Analytics events. Returns the per-step
   * conversion counts, conversion rates, and elapsed times, optionally segmented by group-by
   * facets.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsJourneyFunnelResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsJourneyFunnelResponse>
      queryProductAnalyticsJourneyFunnelWithHttpInfo(ProductAnalyticsJourneyFunnelRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyFunnel";
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
          "Missing the required parameter 'body' when calling queryProductAnalyticsJourneyFunnel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/funnel";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyFunnel",
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
        new GenericType<ProductAnalyticsJourneyFunnelResponse>() {});
  }

  /**
   * Compute journey funnel analysis.
   *
   * <p>See {@link #queryProductAnalyticsJourneyFunnelWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsJourneyFunnelResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsJourneyFunnelResponse>>
      queryProductAnalyticsJourneyFunnelWithHttpInfoAsync(
          ProductAnalyticsJourneyFunnelRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyFunnel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyFunnelResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyFunnelResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsJourneyFunnel"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/funnel";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyFunnel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyFunnelResponse>> result =
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
        new GenericType<ProductAnalyticsJourneyFunnelResponse>() {});
  }

  /**
   * List journey entities.
   *
   * <p>See {@link #queryProductAnalyticsJourneyListWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsJourneyListResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsJourneyListResponse queryProductAnalyticsJourneyList(
      ProductAnalyticsJourneyListRequest body) throws ApiException {
    return queryProductAnalyticsJourneyListWithHttpInfo(body).getData();
  }

  /**
   * List journey entities.
   *
   * <p>See {@link #queryProductAnalyticsJourneyListWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsJourneyListResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsJourneyListResponse>
      queryProductAnalyticsJourneyListAsync(ProductAnalyticsJourneyListRequest body) {
    return queryProductAnalyticsJourneyListWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return the individual sessions that reached, or dropped off at, a given step of the journey.
   * Each row contains the identity join key, the event timestamp, and the columns requested in
   * <code>entity_columns</code>.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsJourneyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsJourneyListResponse>
      queryProductAnalyticsJourneyListWithHttpInfo(ProductAnalyticsJourneyListRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyList";
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
          "Missing the required parameter 'body' when calling queryProductAnalyticsJourneyList");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyList",
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
        new GenericType<ProductAnalyticsJourneyListResponse>() {});
  }

  /**
   * List journey entities.
   *
   * <p>See {@link #queryProductAnalyticsJourneyListWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsJourneyListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsJourneyListResponse>>
      queryProductAnalyticsJourneyListWithHttpInfoAsync(ProductAnalyticsJourneyListRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsJourneyList"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyListResponse>> result =
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
        new GenericType<ProductAnalyticsJourneyListResponse>() {});
  }

  /**
   * Compute journey scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyScalarWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsJourneyScalarResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsJourneyScalarResponse queryProductAnalyticsJourneyScalar(
      ProductAnalyticsJourneyScalarRequest body) throws ApiException {
    return queryProductAnalyticsJourneyScalarWithHttpInfo(body).getData();
  }

  /**
   * Compute journey scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyScalarWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsJourneyScalarResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsJourneyScalarResponse>
      queryProductAnalyticsJourneyScalarAsync(ProductAnalyticsJourneyScalarRequest body) {
    return queryProductAnalyticsJourneyScalarWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute scalar results for a journey query, such as the conversion count, the conversion rate,
   * or the time to convert, optionally segmented by group-by facets.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsJourneyScalarResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsJourneyScalarResponse>
      queryProductAnalyticsJourneyScalarWithHttpInfo(ProductAnalyticsJourneyScalarRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyScalar";
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
          "Missing the required parameter 'body' when calling queryProductAnalyticsJourneyScalar");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyScalar",
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
        new GenericType<ProductAnalyticsJourneyScalarResponse>() {});
  }

  /**
   * Compute journey scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyScalarWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsJourneyScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsJourneyScalarResponse>>
      queryProductAnalyticsJourneyScalarWithHttpInfoAsync(
          ProductAnalyticsJourneyScalarRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsJourneyScalar"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyScalar",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyScalarResponse>> result =
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
        new GenericType<ProductAnalyticsJourneyScalarResponse>() {});
  }

  /**
   * Compute journey timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyTimeseriesWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsJourneyTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsJourneyTimeseriesResponse queryProductAnalyticsJourneyTimeseries(
      ProductAnalyticsFormulaJourneyRequest body) throws ApiException {
    return queryProductAnalyticsJourneyTimeseriesWithHttpInfo(body).getData();
  }

  /**
   * Compute journey timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyTimeseriesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsJourneyTimeseriesResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsJourneyTimeseriesResponse>
      queryProductAnalyticsJourneyTimeseriesAsync(ProductAnalyticsFormulaJourneyRequest body) {
    return queryProductAnalyticsJourneyTimeseriesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute timeseries results for a journey query. Returns one series per group-by combination,
   * bucketed by the requested interval.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsJourneyTimeseriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsJourneyTimeseriesResponse>
      queryProductAnalyticsJourneyTimeseriesWithHttpInfo(ProductAnalyticsFormulaJourneyRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyTimeseries";
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
              + " queryProductAnalyticsJourneyTimeseries");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyTimeseries",
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
        new GenericType<ProductAnalyticsJourneyTimeseriesResponse>() {});
  }

  /**
   * Compute journey timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsJourneyTimeseriesWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsJourneyTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsJourneyTimeseriesResponse>>
      queryProductAnalyticsJourneyTimeseriesWithHttpInfoAsync(
          ProductAnalyticsFormulaJourneyRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsJourneyTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsJourneyTimeseries"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/journey/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsJourneyTimeseries",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsJourneyTimeseriesResponse>> result =
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
        new GenericType<ProductAnalyticsJourneyTimeseriesResponse>() {});
  }

  /**
   * List analytics events.
   *
   * <p>See {@link #queryProductAnalyticsListWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsAnalyticsListResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsAnalyticsListResponse queryProductAnalyticsList(
      ProductAnalyticsAnalyticsListRequest body) throws ApiException {
    return queryProductAnalyticsListWithHttpInfo(body).getData();
  }

  /**
   * List analytics events.
   *
   * <p>See {@link #queryProductAnalyticsListWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsAnalyticsListResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsAnalyticsListResponse> queryProductAnalyticsListAsync(
      ProductAnalyticsAnalyticsListRequest body) {
    return queryProductAnalyticsListWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the individual event records matching an analytics query. Use <code>columns</code> to
   * choose the attributes returned on each row, <code>sort</code> to order the rows, and <code>
   * limit</code> to cap how many are returned.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsAnalyticsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsAnalyticsListResponse> queryProductAnalyticsListWithHttpInfo(
      ProductAnalyticsAnalyticsListRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryProductAnalyticsList");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsList",
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
        new GenericType<ProductAnalyticsAnalyticsListResponse>() {});
  }

  /**
   * List analytics events.
   *
   * <p>See {@link #queryProductAnalyticsListWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsAnalyticsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsAnalyticsListResponse>>
      queryProductAnalyticsListWithHttpInfoAsync(ProductAnalyticsAnalyticsListRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsAnalyticsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsAnalyticsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling queryProductAnalyticsList"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsAnalyticsListResponse>> result =
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
        new GenericType<ProductAnalyticsAnalyticsListResponse>() {});
  }

  /**
   * Compute a retention grid.
   *
   * <p>See {@link #queryProductAnalyticsRetentionGridWithHttpInfo}.
   *
   * @param body The retention grid query. (required)
   * @return ProductAnalyticsRetentionGridResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsRetentionGridResponse queryProductAnalyticsRetentionGrid(
      ProductAnalyticsRetentionGridRequest body) throws ApiException {
    return queryProductAnalyticsRetentionGridWithHttpInfo(body).getData();
  }

  /**
   * Compute a retention grid.
   *
   * <p>See {@link #queryProductAnalyticsRetentionGridWithHttpInfoAsync}.
   *
   * @param body The retention grid query. (required)
   * @return CompletableFuture&lt;ProductAnalyticsRetentionGridResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsRetentionGridResponse>
      queryProductAnalyticsRetentionGridAsync(ProductAnalyticsRetentionGridRequest body) {
    return queryProductAnalyticsRetentionGridWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute a retention grid, showing how much of each cohort came back over each subsequent
   * period. Rows are cohorts, columns are return periods, and each cell holds the count and rate of
   * entities that returned.
   *
   * @param body The retention grid query. (required)
   * @return ApiResponse&lt;ProductAnalyticsRetentionGridResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsRetentionGridResponse>
      queryProductAnalyticsRetentionGridWithHttpInfo(ProductAnalyticsRetentionGridRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionGrid";
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
          "Missing the required parameter 'body' when calling queryProductAnalyticsRetentionGrid");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/grid";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionGrid",
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
        new GenericType<ProductAnalyticsRetentionGridResponse>() {});
  }

  /**
   * Compute a retention grid.
   *
   * <p>See {@link #queryProductAnalyticsRetentionGridWithHttpInfo}.
   *
   * @param body The retention grid query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsRetentionGridResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsRetentionGridResponse>>
      queryProductAnalyticsRetentionGridWithHttpInfoAsync(
          ProductAnalyticsRetentionGridRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionGrid";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionGridResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionGridResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsRetentionGrid"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/grid";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionGrid",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionGridResponse>> result =
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
        new GenericType<ProductAnalyticsRetentionGridResponse>() {});
  }

  /**
   * List the entities behind a retention cell.
   *
   * <p>See {@link #queryProductAnalyticsRetentionListWithHttpInfo}.
   *
   * @param body The retention list query. (required)
   * @return ProductAnalyticsRetentionListResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsRetentionListResponse queryProductAnalyticsRetentionList(
      ProductAnalyticsRetentionListRequest body) throws ApiException {
    return queryProductAnalyticsRetentionListWithHttpInfo(body).getData();
  }

  /**
   * List the entities behind a retention cell.
   *
   * <p>See {@link #queryProductAnalyticsRetentionListWithHttpInfoAsync}.
   *
   * @param body The retention list query. (required)
   * @return CompletableFuture&lt;ProductAnalyticsRetentionListResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsRetentionListResponse>
      queryProductAnalyticsRetentionListAsync(ProductAnalyticsRetentionListRequest body) {
    return queryProductAnalyticsRetentionListWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the individual users or accounts counted in one cell of the retention grid. Set <code>
   * computation_scope</code> to the cohort and return period you want to examine.
   *
   * @param body The retention list query. (required)
   * @return ApiResponse&lt;ProductAnalyticsRetentionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsRetentionListResponse>
      queryProductAnalyticsRetentionListWithHttpInfo(ProductAnalyticsRetentionListRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionList";
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
          "Missing the required parameter 'body' when calling queryProductAnalyticsRetentionList");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionList",
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
        new GenericType<ProductAnalyticsRetentionListResponse>() {});
  }

  /**
   * List the entities behind a retention cell.
   *
   * <p>See {@link #queryProductAnalyticsRetentionListWithHttpInfo}.
   *
   * @param body The retention list query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsRetentionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsRetentionListResponse>>
      queryProductAnalyticsRetentionListWithHttpInfoAsync(
          ProductAnalyticsRetentionListRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionList";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsRetentionList"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionList",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsRetentionListResponse>> result =
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
        new GenericType<ProductAnalyticsRetentionListResponse>() {});
  }

  /**
   * Compute retention scalar values.
   *
   * <p>See {@link #queryProductAnalyticsRetentionScalarWithHttpInfo}.
   *
   * @param body The retention scalar query. (required)
   * @return ProductAnalyticsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsScalarResponse queryProductAnalyticsRetentionScalar(
      ProductAnalyticsFormulaRetentionRequest body) throws ApiException {
    return queryProductAnalyticsRetentionScalarWithHttpInfo(body).getData();
  }

  /**
   * Compute retention scalar values.
   *
   * <p>See {@link #queryProductAnalyticsRetentionScalarWithHttpInfoAsync}.
   *
   * @param body The retention scalar query. (required)
   * @return CompletableFuture&lt;ProductAnalyticsScalarResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsScalarResponse>
      queryProductAnalyticsRetentionScalarAsync(ProductAnalyticsFormulaRetentionRequest body) {
    return queryProductAnalyticsRetentionScalarWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute retention as a single value per group, suitable for a query value or top list widget.
   *
   * @param body The retention scalar query. (required)
   * @return ApiResponse&lt;ProductAnalyticsScalarResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsScalarResponse>
      queryProductAnalyticsRetentionScalarWithHttpInfo(ProductAnalyticsFormulaRetentionRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionScalar";
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
              + " queryProductAnalyticsRetentionScalar");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionScalar",
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
        new GenericType<ProductAnalyticsScalarResponse>() {});
  }

  /**
   * Compute retention scalar values.
   *
   * <p>See {@link #queryProductAnalyticsRetentionScalarWithHttpInfo}.
   *
   * @param body The retention scalar query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>>
      queryProductAnalyticsRetentionScalarWithHttpInfoAsync(
          ProductAnalyticsFormulaRetentionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionScalar";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsRetentionScalar"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionScalar",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>> result =
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
        new GenericType<ProductAnalyticsScalarResponse>() {});
  }

  /**
   * Compute retention timeseries.
   *
   * <p>See {@link #queryProductAnalyticsRetentionTimeseriesWithHttpInfo}.
   *
   * @param body The retention timeseries query. (required)
   * @return ProductAnalyticsTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsTimeseriesResponse queryProductAnalyticsRetentionTimeseries(
      ProductAnalyticsFormulaRetentionRequest body) throws ApiException {
    return queryProductAnalyticsRetentionTimeseriesWithHttpInfo(body).getData();
  }

  /**
   * Compute retention timeseries.
   *
   * <p>See {@link #queryProductAnalyticsRetentionTimeseriesWithHttpInfoAsync}.
   *
   * @param body The retention timeseries query. (required)
   * @return CompletableFuture&lt;ProductAnalyticsTimeseriesResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsTimeseriesResponse>
      queryProductAnalyticsRetentionTimeseriesAsync(ProductAnalyticsFormulaRetentionRequest body) {
    return queryProductAnalyticsRetentionTimeseriesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute retention as a series of values over time, using the same query definition as the
   * retention grid.
   *
   * @param body The retention timeseries query. (required)
   * @return ApiResponse&lt;ProductAnalyticsTimeseriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsTimeseriesResponse>
      queryProductAnalyticsRetentionTimeseriesWithHttpInfo(
          ProductAnalyticsFormulaRetentionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionTimeseries";
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
              + " queryProductAnalyticsRetentionTimeseries");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionTimeseries",
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
        new GenericType<ProductAnalyticsTimeseriesResponse>() {});
  }

  /**
   * Compute retention timeseries.
   *
   * <p>See {@link #queryProductAnalyticsRetentionTimeseriesWithHttpInfo}.
   *
   * @param body The retention timeseries query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>>
      queryProductAnalyticsRetentionTimeseriesWithHttpInfoAsync(
          ProductAnalyticsFormulaRetentionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsRetentionTimeseries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsRetentionTimeseries"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/retention/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsRetentionTimeseries",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>> result =
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
        new GenericType<ProductAnalyticsTimeseriesResponse>() {});
  }

  /**
   * Compute a Sankey diagram.
   *
   * <p>See {@link #queryProductAnalyticsSankeyWithHttpInfo}.
   *
   * @param body The Sankey diagram query. (required)
   * @return ProductAnalyticsSankeyResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsSankeyResponse queryProductAnalyticsSankey(
      ProductAnalyticsSankeyRequest body) throws ApiException {
    return queryProductAnalyticsSankeyWithHttpInfo(body).getData();
  }

  /**
   * Compute a Sankey diagram.
   *
   * <p>See {@link #queryProductAnalyticsSankeyWithHttpInfoAsync}.
   *
   * @param body The Sankey diagram query. (required)
   * @return CompletableFuture&lt;ProductAnalyticsSankeyResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsSankeyResponse> queryProductAnalyticsSankeyAsync(
      ProductAnalyticsSankeyRequest body) {
    return queryProductAnalyticsSankeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute a Sankey diagram of how sessions flow between the values of two facets, showing where
   * users continue and where they drop off at each step.
   *
   * @param body The Sankey diagram query. (required)
   * @return ApiResponse&lt;ProductAnalyticsSankeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsSankeyResponse> queryProductAnalyticsSankeyWithHttpInfo(
      ProductAnalyticsSankeyRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsSankey";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryProductAnalyticsSankey");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/sankey";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsSankey",
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
        new GenericType<ProductAnalyticsSankeyResponse>() {});
  }

  /**
   * Compute a Sankey diagram.
   *
   * <p>See {@link #queryProductAnalyticsSankeyWithHttpInfo}.
   *
   * @param body The Sankey diagram query. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsSankeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsSankeyResponse>>
      queryProductAnalyticsSankeyWithHttpInfoAsync(ProductAnalyticsSankeyRequest body) {
    // Check if unstable operation is enabled
    String operationId = "queryProductAnalyticsSankey";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsSankeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsSankeyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling queryProductAnalyticsSankey"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/sankey";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsSankey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsSankeyResponse>> result =
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
        new GenericType<ProductAnalyticsSankeyResponse>() {});
  }

  /**
   * Compute scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsScalarWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsScalarResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsScalarResponse queryProductAnalyticsScalar(
      ProductAnalyticsAnalyticsRequest body) throws ApiException {
    return queryProductAnalyticsScalarWithHttpInfo(body).getData();
  }

  /**
   * Compute scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsScalarWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsScalarResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsScalarResponse> queryProductAnalyticsScalarAsync(
      ProductAnalyticsAnalyticsRequest body) {
    return queryProductAnalyticsScalarWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute scalar analytics results for Product Analytics data. Returns aggregated values (counts,
   * averages, percentiles) optionally grouped by facets.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsScalarResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsScalarResponse> queryProductAnalyticsScalarWithHttpInfo(
      ProductAnalyticsAnalyticsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling queryProductAnalyticsScalar");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsScalar",
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
        new GenericType<ProductAnalyticsScalarResponse>() {});
  }

  /**
   * Compute scalar analytics.
   *
   * <p>See {@link #queryProductAnalyticsScalarWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsScalarResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>>
      queryProductAnalyticsScalarWithHttpInfoAsync(ProductAnalyticsAnalyticsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling queryProductAnalyticsScalar"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/scalar";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsScalar",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsScalarResponse>> result =
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
        new GenericType<ProductAnalyticsScalarResponse>() {});
  }

  /**
   * Compute timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsTimeseriesWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsTimeseriesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsTimeseriesResponse queryProductAnalyticsTimeseries(
      ProductAnalyticsAnalyticsRequest body) throws ApiException {
    return queryProductAnalyticsTimeseriesWithHttpInfo(body).getData();
  }

  /**
   * Compute timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsTimeseriesWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsTimeseriesResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsTimeseriesResponse> queryProductAnalyticsTimeseriesAsync(
      ProductAnalyticsAnalyticsRequest body) {
    return queryProductAnalyticsTimeseriesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Compute timeseries analytics results for Product Analytics data. Returns time-bucketed values
   * for charts and trend analysis. The <code>compute.interval</code> field (milliseconds) is
   * required for time bucketing.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsTimeseriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsTimeseriesResponse>
      queryProductAnalyticsTimeseriesWithHttpInfo(ProductAnalyticsAnalyticsRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling queryProductAnalyticsTimeseries");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.queryProductAnalyticsTimeseries",
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
        new GenericType<ProductAnalyticsTimeseriesResponse>() {});
  }

  /**
   * Compute timeseries analytics.
   *
   * <p>See {@link #queryProductAnalyticsTimeseriesWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsTimeseriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>>
      queryProductAnalyticsTimeseriesWithHttpInfoAsync(ProductAnalyticsAnalyticsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " queryProductAnalyticsTimeseries"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/analytics/timeseries";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.queryProductAnalyticsTimeseries",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsTimeseriesResponse>> result =
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
        new GenericType<ProductAnalyticsTimeseriesResponse>() {});
  }

  /**
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfo}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitProductAnalyticsEvent(ProductAnalyticsServerSideEventItem body)
      throws ApiException {
    return submitProductAnalyticsEventWithHttpInfo(body).getData();
  }

  /**
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfoAsync}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitProductAnalyticsEventAsync(
      ProductAnalyticsServerSideEventItem body) {
    return submitProductAnalyticsEventWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send server-side events to Product Analytics. Server-side events are retained for 15 months.
   *
   * <p>Server-Side events in Product Analytics are helpful for tracking events that occur on the
   * server, as opposed to client-side events, which are captured by Real User Monitoring (RUM)
   * SDKs. This allows for a more comprehensive view of the user journey by including actions that
   * happen on the server. Typical examples could be <code>checkout.completed</code> or <code>
   * payment.processed</code>.
   *
   * <p>Ingested server-side events are integrated into Product Analytics to allow users to select
   * and filter these events in the event picker, similar to how views or actions are handled.
   *
   * <p><strong>Requirements:</strong> - At least one of <code>usr</code>, <code>account</code>, or
   * <code>session</code> must be provided with a valid ID. - The <code>application.id</code> must
   * reference a Product Analytics-enabled application.
   *
   * <p><strong>Custom Attributes:</strong> Any additional fields in the payload are flattened and
   * searchable as facets. For example, a payload with <code>{"customer": {"tier": "premium"}}
   * </code> is searchable with the syntax <code>@customer.tier:premium</code> in Datadog.
   *
   * <p>The status codes answered by the HTTP API are: - 202: Accepted: The request has been
   * accepted for processing - 400: Bad request (likely an issue in the payload formatting) - 401:
   * Unauthorized (likely a missing API Key) - 403: Permission issue (likely using an invalid API
   * Key) - 408: Request Timeout, request should be retried after some time - 413: Payload too large
   * (batch is above 5MB uncompressed) - 429: Too Many Requests, request should be retried after
   * some time - 500: Internal Server Error, the server encountered an unexpected condition that
   * prevented it from fulfilling the request, request should be retried after some time - 503:
   * Service Unavailable, the server is not ready to handle the request probably because it is
   * overloaded, request should be retried after some time
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Request accepted for processing (always 202 empty JSON). </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> submitProductAnalyticsEventWithHttpInfo(
      ProductAnalyticsServerSideEventItem body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitProductAnalyticsEvent");
    }
    // create path and map variables
    String localVarPath = "/api/v2/prodlytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.submitProductAnalyticsEvent",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfo}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> submitProductAnalyticsEventWithHttpInfoAsync(
      ProductAnalyticsServerSideEventItem body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling submitProductAnalyticsEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/prodlytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.submitProductAnalyticsEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }
}
