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
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchCreateRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchListScope;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPatchRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPhase;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchesResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorCreateRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUnlinkRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUpdateRequest;
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
import java.util.List;
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
   * Create a Product Analytics launch.
   *
   * <p>See {@link #createProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsLaunchResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsLaunchResponse createProductAnalyticsLaunch(
      ProductAnalyticsLaunchCreateRequest body) throws ApiException {
    return createProductAnalyticsLaunchWithHttpInfo(body).getData();
  }

  /**
   * Create a Product Analytics launch.
   *
   * <p>See {@link #createProductAnalyticsLaunchWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsLaunchResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsLaunchResponse> createProductAnalyticsLaunchAsync(
      ProductAnalyticsLaunchCreateRequest body) {
    return createProductAnalyticsLaunchWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Product Analytics launch and its tracking plan. The tracking plan lists the events and
   * event properties to instrument. Events can only reference properties and KPIs defined in the
   * launch.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;
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
  public ApiResponse<ProductAnalyticsLaunchResponse> createProductAnalyticsLaunchWithHttpInfo(
      ProductAnalyticsLaunchCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProductAnalyticsLaunch");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/launches";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.createProductAnalyticsLaunch",
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Create a Product Analytics launch.
   *
   * <p>See {@link #createProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>>
      createProductAnalyticsLaunchWithHttpInfoAsync(ProductAnalyticsLaunchCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createProductAnalyticsLaunch"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/launches";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.createProductAnalyticsLaunch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Create a Product Analytics monitor.
   *
   * <p>See {@link #createProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param body (required)
   * @return ProductAnalyticsMonitorResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsMonitorResponse createProductAnalyticsMonitor(
      ProductAnalyticsMonitorCreateRequest body) throws ApiException {
    return createProductAnalyticsMonitorWithHttpInfo(body).getData();
  }

  /**
   * Create a Product Analytics monitor.
   *
   * <p>See {@link #createProductAnalyticsMonitorWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsMonitorResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsMonitorResponse> createProductAnalyticsMonitorAsync(
      ProductAnalyticsMonitorCreateRequest body) {
    return createProductAnalyticsMonitorWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Product Analytics monitor that alerts on a Product Analytics query, such as a funnel
   * conversion rate. Link it to the chart it was created from with the <code>chart_id</code> and
   * <code>dashboard_id</code> tags.
   *
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;
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
  public ApiResponse<ProductAnalyticsMonitorResponse> createProductAnalyticsMonitorWithHttpInfo(
      ProductAnalyticsMonitorCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProductAnalyticsMonitor");
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/monitors";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.createProductAnalyticsMonitor",
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
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }

  /**
   * Create a Product Analytics monitor.
   *
   * <p>See {@link #createProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>>
      createProductAnalyticsMonitorWithHttpInfoAsync(ProductAnalyticsMonitorCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createProductAnalyticsMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/monitors";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.createProductAnalyticsMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
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
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }

  /**
   * Delete a Product Analytics launch.
   *
   * <p>See {@link #deleteProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProductAnalyticsLaunch(String id) throws ApiException {
    deleteProductAnalyticsLaunchWithHttpInfo(id);
  }

  /**
   * Delete a Product Analytics launch.
   *
   * <p>See {@link #deleteProductAnalyticsLaunchWithHttpInfoAsync}.
   *
   * @param id UUID of the launch. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProductAnalyticsLaunchAsync(String id) {
    return deleteProductAnalyticsLaunchWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Product Analytics launch and its tracking plan.
   *
   * @param id UUID of the launch. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProductAnalyticsLaunchWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteProductAnalyticsLaunch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.deleteProductAnalyticsLaunch",
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
   * Delete a Product Analytics launch.
   *
   * <p>See {@link #deleteProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProductAnalyticsLaunchWithHttpInfoAsync(
      String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteProductAnalyticsLaunch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.deleteProductAnalyticsLaunch",
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
   * Delete a Product Analytics monitor.
   *
   * <p>See {@link #deleteProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProductAnalyticsMonitor(String monitorId) throws ApiException {
    deleteProductAnalyticsMonitorWithHttpInfo(monitorId);
  }

  /**
   * Delete a Product Analytics monitor.
   *
   * <p>See {@link #deleteProductAnalyticsMonitorWithHttpInfoAsync}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProductAnalyticsMonitorAsync(String monitorId) {
    return deleteProductAnalyticsMonitorWithHttpInfoAsync(monitorId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Product Analytics monitor.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProductAnalyticsMonitorWithHttpInfo(String monitorId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'monitorId' when calling deleteProductAnalyticsMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.deleteProductAnalyticsMonitor",
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
   * Delete a Product Analytics monitor.
   *
   * <p>See {@link #deleteProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProductAnalyticsMonitorWithHttpInfoAsync(
      String monitorId) {
    // Check if unstable operation is enabled
    String operationId = "deleteProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling"
                  + " deleteProductAnalyticsMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.deleteProductAnalyticsMonitor",
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
   * Get a Product Analytics launch.
   *
   * <p>See {@link #getProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @return ProductAnalyticsLaunchResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsLaunchResponse getProductAnalyticsLaunch(String id) throws ApiException {
    return getProductAnalyticsLaunchWithHttpInfo(id).getData();
  }

  /**
   * Get a Product Analytics launch.
   *
   * <p>See {@link #getProductAnalyticsLaunchWithHttpInfoAsync}.
   *
   * @param id UUID of the launch. (required)
   * @return CompletableFuture&lt;ProductAnalyticsLaunchResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsLaunchResponse> getProductAnalyticsLaunchAsync(
      String id) {
    return getProductAnalyticsLaunchWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Product Analytics launch and its tracking plan by UUID.
   *
   * @param id UUID of the launch. (required)
   * @return ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;
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
  public ApiResponse<ProductAnalyticsLaunchResponse> getProductAnalyticsLaunchWithHttpInfo(
      String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getProductAnalyticsLaunch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.getProductAnalyticsLaunch",
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Get a Product Analytics launch.
   *
   * <p>See {@link #getProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>>
      getProductAnalyticsLaunchWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getProductAnalyticsLaunch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.getProductAnalyticsLaunch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Get a Product Analytics monitor.
   *
   * <p>See {@link #getProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return ProductAnalyticsMonitorResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsMonitorResponse getProductAnalyticsMonitor(String monitorId)
      throws ApiException {
    return getProductAnalyticsMonitorWithHttpInfo(monitorId).getData();
  }

  /**
   * Get a Product Analytics monitor.
   *
   * <p>See {@link #getProductAnalyticsMonitorWithHttpInfoAsync}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return CompletableFuture&lt;ProductAnalyticsMonitorResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsMonitorResponse> getProductAnalyticsMonitorAsync(
      String monitorId) {
    return getProductAnalyticsMonitorWithHttpInfoAsync(monitorId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Product Analytics monitor by its ID.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;
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
  public ApiResponse<ProductAnalyticsMonitorResponse> getProductAnalyticsMonitorWithHttpInfo(
      String monitorId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'monitorId' when calling getProductAnalyticsMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.getProductAnalyticsMonitor",
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
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }

  /**
   * Get a Product Analytics monitor.
   *
   * <p>See {@link #getProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>>
      getProductAnalyticsMonitorWithHttpInfoAsync(String monitorId) {
    // Check if unstable operation is enabled
    String operationId = "getProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling"
                  + " getProductAnalyticsMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.getProductAnalyticsMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
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
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }

  /** Manage optional parameters to listProductAnalyticsLaunches. */
  public static class ListProductAnalyticsLaunchesOptionalParameters {
    private String sort;
    private ProductAnalyticsLaunchListScope scope;
    private List<ProductAnalyticsLaunchPhase> phase;
    private String applicationId;
    private String name;

    /**
     * Set sort.
     *
     * @param sort Comma-separated fields to sort by: <code>id</code>, <code>phase</code>, <code>
     *     feature_flag_id</code>, <code>name</code>, <code>application_id</code>, <code>description
     *     </code>, <code>created_by</code>, <code>created_at</code>, <code>updated_by</code>, or
     *     <code>updated_at</code>. Prefix a field with <code>-</code> to sort in descending order.
     *     (optional)
     * @return ListProductAnalyticsLaunchesOptionalParameters
     */
    public ListProductAnalyticsLaunchesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set scope.
     *
     * @param scope Set to <code>liftoffs</code> to leave out launches in the <code>plan</code>
     *     phase. (optional)
     * @return ListProductAnalyticsLaunchesOptionalParameters
     */
    public ListProductAnalyticsLaunchesOptionalParameters scope(
        ProductAnalyticsLaunchListScope scope) {
      this.scope = scope;
      return this;
    }

    /**
     * Set phase.
     *
     * @param phase Return only launches in these phases. Repeat the parameter to pass several
     *     phases. (optional)
     * @return ListProductAnalyticsLaunchesOptionalParameters
     */
    public ListProductAnalyticsLaunchesOptionalParameters phase(
        List<ProductAnalyticsLaunchPhase> phase) {
      this.phase = phase;
      return this;
    }

    /**
     * Set applicationId.
     *
     * @param applicationId Return only launches of this RUM application UUID. (optional)
     * @return ListProductAnalyticsLaunchesOptionalParameters
     */
    public ListProductAnalyticsLaunchesOptionalParameters applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    /**
     * Set name.
     *
     * @param name Return only launches whose name contains this value, ignoring case. (optional)
     * @return ListProductAnalyticsLaunchesOptionalParameters
     */
    public ListProductAnalyticsLaunchesOptionalParameters name(String name) {
      this.name = name;
      return this;
    }
  }

  /**
   * List Product Analytics launches.
   *
   * <p>See {@link #listProductAnalyticsLaunchesWithHttpInfo}.
   *
   * @return ProductAnalyticsLaunchesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsLaunchesResponse listProductAnalyticsLaunches() throws ApiException {
    return listProductAnalyticsLaunchesWithHttpInfo(
            new ListProductAnalyticsLaunchesOptionalParameters())
        .getData();
  }

  /**
   * List Product Analytics launches.
   *
   * <p>See {@link #listProductAnalyticsLaunchesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProductAnalyticsLaunchesResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsLaunchesResponse> listProductAnalyticsLaunchesAsync() {
    return listProductAnalyticsLaunchesWithHttpInfoAsync(
            new ListProductAnalyticsLaunchesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Product Analytics launches.
   *
   * <p>See {@link #listProductAnalyticsLaunchesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ProductAnalyticsLaunchesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsLaunchesResponse listProductAnalyticsLaunches(
      ListProductAnalyticsLaunchesOptionalParameters parameters) throws ApiException {
    return listProductAnalyticsLaunchesWithHttpInfo(parameters).getData();
  }

  /**
   * List Product Analytics launches.
   *
   * <p>See {@link #listProductAnalyticsLaunchesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ProductAnalyticsLaunchesResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsLaunchesResponse> listProductAnalyticsLaunchesAsync(
      ListProductAnalyticsLaunchesOptionalParameters parameters) {
    return listProductAnalyticsLaunchesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Product Analytics launches of your organization. A launch tracks a feature release
   * with its phase, KPIs, and tracking plan. Results are sorted by <code>-created_at</code> by
   * default.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProductAnalyticsLaunchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsLaunchesResponse> listProductAnalyticsLaunchesWithHttpInfo(
      ListProductAnalyticsLaunchesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsLaunches";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String sort = parameters.sort;
    ProductAnalyticsLaunchListScope scope = parameters.scope;
    List<ProductAnalyticsLaunchPhase> phase = parameters.phase;
    String applicationId = parameters.applicationId;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/launches";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "phase", phase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "application_id", applicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.listProductAnalyticsLaunches",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ProductAnalyticsLaunchesResponse>() {});
  }

  /**
   * List Product Analytics launches.
   *
   * <p>See {@link #listProductAnalyticsLaunchesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsLaunchesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsLaunchesResponse>>
      listProductAnalyticsLaunchesWithHttpInfoAsync(
          ListProductAnalyticsLaunchesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsLaunches";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String sort = parameters.sort;
    ProductAnalyticsLaunchListScope scope = parameters.scope;
    List<ProductAnalyticsLaunchPhase> phase = parameters.phase;
    String applicationId = parameters.applicationId;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/launches";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "phase", phase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "application_id", applicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.listProductAnalyticsLaunches",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchesResponse>> result =
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
        new GenericType<ProductAnalyticsLaunchesResponse>() {});
  }

  /** Manage optional parameters to listProductAnalyticsMonitors. */
  public static class ListProductAnalyticsMonitorsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String chartId;
    private String dashboardId;

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of monitors per page, from 1 to 1000. Ignored when <code>
     *     chart_id</code> is set. (optional, default to 100)
     * @return ListProductAnalyticsMonitorsOptionalParameters
     */
    public ListProductAnalyticsMonitorsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number, starting at 1. Ignored when <code>chart_id</code> is set.
     *     (optional, default to 1)
     * @return ListProductAnalyticsMonitorsOptionalParameters
     */
    public ListProductAnalyticsMonitorsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set chartId.
     *
     * @param chartId Return only the monitors linked to this chart. Turns off pagination.
     *     (optional)
     * @return ListProductAnalyticsMonitorsOptionalParameters
     */
    public ListProductAnalyticsMonitorsOptionalParameters chartId(String chartId) {
      this.chartId = chartId;
      return this;
    }

    /**
     * Set dashboardId.
     *
     * @param dashboardId Return only the monitors linked to this dashboard. Requires <code>chart_id
     *     </code>. (optional)
     * @return ListProductAnalyticsMonitorsOptionalParameters
     */
    public ListProductAnalyticsMonitorsOptionalParameters dashboardId(String dashboardId) {
      this.dashboardId = dashboardId;
      return this;
    }
  }

  /**
   * List Product Analytics monitors.
   *
   * <p>See {@link #listProductAnalyticsMonitorsWithHttpInfo}.
   *
   * @return ProductAnalyticsMonitorListResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsMonitorListResponse listProductAnalyticsMonitors() throws ApiException {
    return listProductAnalyticsMonitorsWithHttpInfo(
            new ListProductAnalyticsMonitorsOptionalParameters())
        .getData();
  }

  /**
   * List Product Analytics monitors.
   *
   * <p>See {@link #listProductAnalyticsMonitorsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProductAnalyticsMonitorListResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsMonitorListResponse>
      listProductAnalyticsMonitorsAsync() {
    return listProductAnalyticsMonitorsWithHttpInfoAsync(
            new ListProductAnalyticsMonitorsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Product Analytics monitors.
   *
   * <p>See {@link #listProductAnalyticsMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ProductAnalyticsMonitorListResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsMonitorListResponse listProductAnalyticsMonitors(
      ListProductAnalyticsMonitorsOptionalParameters parameters) throws ApiException {
    return listProductAnalyticsMonitorsWithHttpInfo(parameters).getData();
  }

  /**
   * List Product Analytics monitors.
   *
   * <p>See {@link #listProductAnalyticsMonitorsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ProductAnalyticsMonitorListResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsMonitorListResponse> listProductAnalyticsMonitorsAsync(
      ListProductAnalyticsMonitorsOptionalParameters parameters) {
    return listProductAnalyticsMonitorsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Product Analytics monitors of your organization, one page at a time. When <code>
   * chart_id</code> is set, optionally with <code>dashboard_id</code>, the response includes every
   * monitor linked to that chart, without pagination. With <code>chart_id</code> alone, monitors
   * created from a dashboard widget are not returned. Monitors created in the last few seconds may
   * be missing.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProductAnalyticsMonitorListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductAnalyticsMonitorListResponse> listProductAnalyticsMonitorsWithHttpInfo(
      ListProductAnalyticsMonitorsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsMonitors";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String chartId = parameters.chartId;
    String dashboardId = parameters.dashboardId;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/monitors";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "chart_id", chartId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dashboard_id", dashboardId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.listProductAnalyticsMonitors",
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
        new GenericType<ProductAnalyticsMonitorListResponse>() {});
  }

  /**
   * List Product Analytics monitors.
   *
   * <p>See {@link #listProductAnalyticsMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsMonitorListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsMonitorListResponse>>
      listProductAnalyticsMonitorsWithHttpInfoAsync(
          ListProductAnalyticsMonitorsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listProductAnalyticsMonitors";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String chartId = parameters.chartId;
    String dashboardId = parameters.dashboardId;
    // create path and map variables
    String localVarPath = "/api/v2/product-analytics/monitors";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "chart_id", chartId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dashboard_id", dashboardId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.listProductAnalyticsMonitors",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorListResponse>> result =
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
        new GenericType<ProductAnalyticsMonitorListResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Unlink a Product Analytics monitor from its chart.
   *
   * <p>See {@link #removeChartFromProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void removeChartFromProductAnalyticsMonitor(
      String monitorId, ProductAnalyticsMonitorUnlinkRequest body) throws ApiException {
    removeChartFromProductAnalyticsMonitorWithHttpInfo(monitorId, body);
  }

  /**
   * Unlink a Product Analytics monitor from its chart.
   *
   * <p>See {@link #removeChartFromProductAnalyticsMonitorWithHttpInfoAsync}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> removeChartFromProductAnalyticsMonitorAsync(
      String monitorId, ProductAnalyticsMonitorUnlinkRequest body) {
    return removeChartFromProductAnalyticsMonitorWithHttpInfoAsync(monitorId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove the <code>chart_id</code> and <code>dashboard_id</code> tags from a Product Analytics
   * monitor. The monitor and the rest of its configuration are kept. The request must name the
   * stored link exactly. A monitor with no link is left unchanged.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeChartFromProductAnalyticsMonitorWithHttpInfo(
      String monitorId, ProductAnalyticsMonitorUnlinkRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "removeChartFromProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'monitorId' when calling"
              + " removeChartFromProductAnalyticsMonitor");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " removeChartFromProductAnalyticsMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}/unlink"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.removeChartFromProductAnalyticsMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unlink a Product Analytics monitor from its chart.
   *
   * <p>See {@link #removeChartFromProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      removeChartFromProductAnalyticsMonitorWithHttpInfoAsync(
          String monitorId, ProductAnalyticsMonitorUnlinkRequest body) {
    // Check if unstable operation is enabled
    String operationId = "removeChartFromProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling"
                  + " removeChartFromProductAnalyticsMonitor"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " removeChartFromProductAnalyticsMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}/unlink"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.removeChartFromProductAnalyticsMonitor",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

  /**
   * Update a Product Analytics launch.
   *
   * <p>See {@link #updateProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @param body (required)
   * @return ProductAnalyticsLaunchResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsLaunchResponse updateProductAnalyticsLaunch(
      String id, ProductAnalyticsLaunchPatchRequest body) throws ApiException {
    return updateProductAnalyticsLaunchWithHttpInfo(id, body).getData();
  }

  /**
   * Update a Product Analytics launch.
   *
   * <p>See {@link #updateProductAnalyticsLaunchWithHttpInfoAsync}.
   *
   * @param id UUID of the launch. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsLaunchResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsLaunchResponse> updateProductAnalyticsLaunchAsync(
      String id, ProductAnalyticsLaunchPatchRequest body) {
    return updateProductAnalyticsLaunchWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update some fields of a Product Analytics launch. Fields that are not set are left unchanged.
   * The <code>id</code> in the body must match the one in the path. Setting <code>
   * steps.tracking_plan</code> replaces the whole stored tracking plan, not only the fields you
   * send. Returns <code>409</code> when the launch changed during the update; fetch it again and
   * retry.
   *
   * @param id UUID of the launch. (required)
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;
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
  public ApiResponse<ProductAnalyticsLaunchResponse> updateProductAnalyticsLaunchWithHttpInfo(
      String id, ProductAnalyticsLaunchPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateProductAnalyticsLaunch");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProductAnalyticsLaunch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.updateProductAnalyticsLaunch",
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Update a Product Analytics launch.
   *
   * <p>See {@link #updateProductAnalyticsLaunchWithHttpInfo}.
   *
   * @param id UUID of the launch. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsLaunchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>>
      updateProductAnalyticsLaunchWithHttpInfoAsync(
          String id, ProductAnalyticsLaunchPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsLaunch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling updateProductAnalyticsLaunch"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateProductAnalyticsLaunch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/launches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.updateProductAnalyticsLaunch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsLaunchResponse>> result =
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
        new GenericType<ProductAnalyticsLaunchResponse>() {});
  }

  /**
   * Update a Product Analytics monitor.
   *
   * <p>See {@link #updateProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return ProductAnalyticsMonitorResponse
   * @throws ApiException if fails to make API call
   */
  public ProductAnalyticsMonitorResponse updateProductAnalyticsMonitor(
      String monitorId, ProductAnalyticsMonitorUpdateRequest body) throws ApiException {
    return updateProductAnalyticsMonitorWithHttpInfo(monitorId, body).getData();
  }

  /**
   * Update a Product Analytics monitor.
   *
   * <p>See {@link #updateProductAnalyticsMonitorWithHttpInfoAsync}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ProductAnalyticsMonitorResponse&gt;
   */
  public CompletableFuture<ProductAnalyticsMonitorResponse> updateProductAnalyticsMonitorAsync(
      String monitorId, ProductAnalyticsMonitorUpdateRequest body) {
    return updateProductAnalyticsMonitorWithHttpInfoAsync(monitorId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Product Analytics monitor. Fields that are not set are left unchanged, and at least
   * one field must be set. When set, <code>tags</code> replaces the monitor tags except <code>
   * chart_id</code> and <code>dashboard_id</code>, which this endpoint ignores. To remove them, use
   * the unlink endpoint.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;
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
  public ApiResponse<ProductAnalyticsMonitorResponse> updateProductAnalyticsMonitorWithHttpInfo(
      String monitorId, ProductAnalyticsMonitorUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'monitorId' when calling updateProductAnalyticsMonitor");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProductAnalyticsMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.updateProductAnalyticsMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }

  /**
   * Update a Product Analytics monitor.
   *
   * <p>See {@link #updateProductAnalyticsMonitorWithHttpInfo}.
   *
   * @param monitorId Numeric ID of the monitor. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProductAnalyticsMonitorResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>>
      updateProductAnalyticsMonitorWithHttpInfoAsync(
          String monitorId, ProductAnalyticsMonitorUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateProductAnalyticsMonitor";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling"
                  + " updateProductAnalyticsMonitor"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateProductAnalyticsMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/product-analytics/monitors/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.updateProductAnalyticsMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductAnalyticsMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProductAnalyticsMonitorResponse>() {});
  }
}
