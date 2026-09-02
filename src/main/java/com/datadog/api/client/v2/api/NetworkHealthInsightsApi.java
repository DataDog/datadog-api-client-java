package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.NetworkHealthInsightsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NetworkHealthInsightsApi {
  private ApiClient apiClient;

  public NetworkHealthInsightsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public NetworkHealthInsightsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listNetworkHealthInsights. */
  public static class ListNetworkHealthInsightsOptionalParameters {
    private String from;
    private String to;

    /**
     * Set from.
     *
     * @param from Unix timestamp (number of seconds since epoch) of the start of the query window.
     *     If not provided, the start of the query window will be 15 minutes before the <code>to
     *     </code> timestamp. If neither <code>from</code> nor <code>to</code> are provided, the
     *     query window will be <code>[now - 15m, now]</code>. (optional)
     * @return ListNetworkHealthInsightsOptionalParameters
     */
    public ListNetworkHealthInsightsOptionalParameters from(String from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     *
     * @param to Unix timestamp (number of seconds since epoch) of the end of the query window. If
     *     not provided, the end of the query window will be the current time. If neither <code>from
     *     </code> nor <code>to</code> are provided, the query window will be <code>[now - 15m, now]
     *     </code>. (optional)
     * @return ListNetworkHealthInsightsOptionalParameters
     */
    public ListNetworkHealthInsightsOptionalParameters to(String to) {
      this.to = to;
      return this;
    }
  }

  /**
   * List network health insights.
   *
   * <p>See {@link #listNetworkHealthInsightsWithHttpInfo}.
   *
   * @return NetworkHealthInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public NetworkHealthInsightsResponse listNetworkHealthInsights() throws ApiException {
    return listNetworkHealthInsightsWithHttpInfo(new ListNetworkHealthInsightsOptionalParameters())
        .getData();
  }

  /**
   * List network health insights.
   *
   * <p>See {@link #listNetworkHealthInsightsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;NetworkHealthInsightsResponse&gt;
   */
  public CompletableFuture<NetworkHealthInsightsResponse> listNetworkHealthInsightsAsync() {
    return listNetworkHealthInsightsWithHttpInfoAsync(
            new ListNetworkHealthInsightsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List network health insights.
   *
   * <p>See {@link #listNetworkHealthInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return NetworkHealthInsightsResponse
   * @throws ApiException if fails to make API call
   */
  public NetworkHealthInsightsResponse listNetworkHealthInsights(
      ListNetworkHealthInsightsOptionalParameters parameters) throws ApiException {
    return listNetworkHealthInsightsWithHttpInfo(parameters).getData();
  }

  /**
   * List network health insights.
   *
   * <p>See {@link #listNetworkHealthInsightsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;NetworkHealthInsightsResponse&gt;
   */
  public CompletableFuture<NetworkHealthInsightsResponse> listNetworkHealthInsightsAsync(
      ListNetworkHealthInsightsOptionalParameters parameters) {
    return listNetworkHealthInsightsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return network health insights for the organization within the given time window. Insights are
   * produced by analyzing DNS failures pre-classified by <code>network-dns-logger</code>, TLS
   * certificate metrics, and denied security group connections. Each insight identifies the client
   * and server services involved, the type of issue, and the magnitude of the failure observed
   * during the query window.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;NetworkHealthInsightsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NetworkHealthInsightsResponse> listNetworkHealthInsightsWithHttpInfo(
      ListNetworkHealthInsightsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listNetworkHealthInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String from = parameters.from;
    String to = parameters.to;
    // create path and map variables
    String localVarPath = "/api/v2/network-health-insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkHealthInsightsApi.listNetworkHealthInsights",
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
        new GenericType<NetworkHealthInsightsResponse>() {});
  }

  /**
   * List network health insights.
   *
   * <p>See {@link #listNetworkHealthInsightsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;NetworkHealthInsightsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NetworkHealthInsightsResponse>>
      listNetworkHealthInsightsWithHttpInfoAsync(
          ListNetworkHealthInsightsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listNetworkHealthInsights";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<NetworkHealthInsightsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String from = parameters.from;
    String to = parameters.to;
    // create path and map variables
    String localVarPath = "/api/v2/network-health-insights";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkHealthInsightsApi.listNetworkHealthInsights",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NetworkHealthInsightsResponse>> result =
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
        new GenericType<NetworkHealthInsightsResponse>() {});
  }
}
