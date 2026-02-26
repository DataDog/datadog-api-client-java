package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SingleAggregatedConnectionResponseArray;
import com.datadog.api.client.v2.model.SingleAggregatedDnsResponseArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudNetworkMonitoringApi {
  private ApiClient apiClient;

  public CloudNetworkMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudNetworkMonitoringApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getAggregatedConnections. */
  public static class GetAggregatedConnectionsOptionalParameters {
    private Long from;
    private Long to;
    private String groupBy;
    private String tags;
    private Integer limit;

    /**
     * Set from.
     *
     * @param from Unix timestamp (number of seconds since epoch) of the start of the query window.
     *     If not provided, the start of the query window is 15 minutes before the <code>to</code>
     *     timestamp. If neither <code>from</code> nor <code>to</code> are provided, the query
     *     window is <code>[now - 15m, now]</code>. (optional)
     * @return GetAggregatedConnectionsOptionalParameters
     */
    public GetAggregatedConnectionsOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     *
     * @param to Unix timestamp (number of seconds since epoch) of the end of the query window. If
     *     not provided, the end of the query window is the current time. If neither <code>from
     *     </code> nor <code>to</code> are provided, the query window is <code>[now - 15m, now]
     *     </code>. (optional)
     * @return GetAggregatedConnectionsOptionalParameters
     */
    public GetAggregatedConnectionsOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set groupBy.
     *
     * @param groupBy Comma-separated list of fields to group connections by. The maximum number of
     *     group_by(s) is 10. (optional)
     * @return GetAggregatedConnectionsOptionalParameters
     */
    public GetAggregatedConnectionsOptionalParameters groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Comma-separated list of tags to filter connections by. (optional)
     * @return GetAggregatedConnectionsOptionalParameters
     */
    public GetAggregatedConnectionsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit The number of connections to be returned. The maximum value is 7500. The default
     *     is 100. (optional, default to 100)
     * @return GetAggregatedConnectionsOptionalParameters
     */
    public GetAggregatedConnectionsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Get all aggregated connections.
   *
   * <p>See {@link #getAggregatedConnectionsWithHttpInfo}.
   *
   * @return SingleAggregatedConnectionResponseArray
   * @throws ApiException if fails to make API call
   */
  public SingleAggregatedConnectionResponseArray getAggregatedConnections() throws ApiException {
    return getAggregatedConnectionsWithHttpInfo(new GetAggregatedConnectionsOptionalParameters())
        .getData();
  }

  /**
   * Get all aggregated connections.
   *
   * <p>See {@link #getAggregatedConnectionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SingleAggregatedConnectionResponseArray&gt;
   */
  public CompletableFuture<SingleAggregatedConnectionResponseArray>
      getAggregatedConnectionsAsync() {
    return getAggregatedConnectionsWithHttpInfoAsync(
            new GetAggregatedConnectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all aggregated connections.
   *
   * <p>See {@link #getAggregatedConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SingleAggregatedConnectionResponseArray
   * @throws ApiException if fails to make API call
   */
  public SingleAggregatedConnectionResponseArray getAggregatedConnections(
      GetAggregatedConnectionsOptionalParameters parameters) throws ApiException {
    return getAggregatedConnectionsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all aggregated connections.
   *
   * <p>See {@link #getAggregatedConnectionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SingleAggregatedConnectionResponseArray&gt;
   */
  public CompletableFuture<SingleAggregatedConnectionResponseArray> getAggregatedConnectionsAsync(
      GetAggregatedConnectionsOptionalParameters parameters) {
    return getAggregatedConnectionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all aggregated connections.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SingleAggregatedConnectionResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SingleAggregatedConnectionResponseArray> getAggregatedConnectionsWithHttpInfo(
      GetAggregatedConnectionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    String groupBy = parameters.groupBy;
    String tags = parameters.tags;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/network/connections/aggregate";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudNetworkMonitoringApi.getAggregatedConnections",
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
        new GenericType<SingleAggregatedConnectionResponseArray>() {});
  }

  /**
   * Get all aggregated connections.
   *
   * <p>See {@link #getAggregatedConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SingleAggregatedConnectionResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SingleAggregatedConnectionResponseArray>>
      getAggregatedConnectionsWithHttpInfoAsync(
          GetAggregatedConnectionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    String groupBy = parameters.groupBy;
    String tags = parameters.tags;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/network/connections/aggregate";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudNetworkMonitoringApi.getAggregatedConnections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SingleAggregatedConnectionResponseArray>> result =
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
        new GenericType<SingleAggregatedConnectionResponseArray>() {});
  }

  /** Manage optional parameters to getAggregatedDns. */
  public static class GetAggregatedDnsOptionalParameters {
    private Long from;
    private Long to;
    private String groupBy;
    private String tags;
    private Integer limit;

    /**
     * Set from.
     *
     * @param from Unix timestamp (number of seconds since epoch) of the start of the query window.
     *     If not provided, the start of the query window is 15 minutes before the <code>to</code>
     *     timestamp. If neither <code>from</code> nor <code>to</code> are provided, the query
     *     window is <code>[now - 15m, now]</code>. (optional)
     * @return GetAggregatedDnsOptionalParameters
     */
    public GetAggregatedDnsOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     *
     * @param to Unix timestamp (number of seconds since epoch) of the end of the query window. If
     *     not provided, the end of the query window is the current time. If neither <code>from
     *     </code> nor <code>to</code> are provided, the query window is <code>[now - 15m, now]
     *     </code>. (optional)
     * @return GetAggregatedDnsOptionalParameters
     */
    public GetAggregatedDnsOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set groupBy.
     *
     * @param groupBy Comma-separated list of fields to group DNS traffic by. The server side
     *     defaults to <code>network.dns_query</code> if unspecified. <code>server_ungrouped</code>
     *     may be used if groups are not desired. The maximum number of group_by(s) is 10.
     *     (optional)
     * @return GetAggregatedDnsOptionalParameters
     */
    public GetAggregatedDnsOptionalParameters groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Comma-separated list of tags to filter DNS traffic by. (optional)
     * @return GetAggregatedDnsOptionalParameters
     */
    public GetAggregatedDnsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit The number of aggregated DNS entries to be returned. The maximum value is 7500.
     *     The default is 100. (optional, default to 100)
     * @return GetAggregatedDnsOptionalParameters
     */
    public GetAggregatedDnsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * <p>See {@link #getAggregatedDnsWithHttpInfo}.
   *
   * @return SingleAggregatedDnsResponseArray
   * @throws ApiException if fails to make API call
   */
  public SingleAggregatedDnsResponseArray getAggregatedDns() throws ApiException {
    return getAggregatedDnsWithHttpInfo(new GetAggregatedDnsOptionalParameters()).getData();
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * <p>See {@link #getAggregatedDnsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SingleAggregatedDnsResponseArray&gt;
   */
  public CompletableFuture<SingleAggregatedDnsResponseArray> getAggregatedDnsAsync() {
    return getAggregatedDnsWithHttpInfoAsync(new GetAggregatedDnsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * <p>See {@link #getAggregatedDnsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SingleAggregatedDnsResponseArray
   * @throws ApiException if fails to make API call
   */
  public SingleAggregatedDnsResponseArray getAggregatedDns(
      GetAggregatedDnsOptionalParameters parameters) throws ApiException {
    return getAggregatedDnsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * <p>See {@link #getAggregatedDnsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SingleAggregatedDnsResponseArray&gt;
   */
  public CompletableFuture<SingleAggregatedDnsResponseArray> getAggregatedDnsAsync(
      GetAggregatedDnsOptionalParameters parameters) {
    return getAggregatedDnsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SingleAggregatedDnsResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SingleAggregatedDnsResponseArray> getAggregatedDnsWithHttpInfo(
      GetAggregatedDnsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    String groupBy = parameters.groupBy;
    String tags = parameters.tags;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/network/dns/aggregate";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudNetworkMonitoringApi.getAggregatedDns",
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
        new GenericType<SingleAggregatedDnsResponseArray>() {});
  }

  /**
   * Get all aggregated DNS traffic.
   *
   * <p>See {@link #getAggregatedDnsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SingleAggregatedDnsResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SingleAggregatedDnsResponseArray>>
      getAggregatedDnsWithHttpInfoAsync(GetAggregatedDnsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    String groupBy = parameters.groupBy;
    String tags = parameters.tags;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/network/dns/aggregate";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_by", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudNetworkMonitoringApi.getAggregatedDns",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SingleAggregatedDnsResponseArray>> result =
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
        new GenericType<SingleAggregatedDnsResponseArray>() {});
  }
}
