
package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v1.model.GraphSnapshot;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnapshotsApi {
  private ApiClient apiClient;
  public SnapshotsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SnapshotsApi(ApiClient apiClient) {
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
   * Manage optional parameters to getGraphSnapshot.
   */
  public static class GetGraphSnapshotOptionalParameters {
    private String metricQuery;
    private String eventQuery;
    private String graphDef;
    private String title;
    private Long height;
    private Long width;

    /**
     * Set metricQuery.
     * @param metricQuery The metric query. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters metricQuery(String metricQuery) {
      this.metricQuery = metricQuery;
      return this;
    }

    /**
     * Set eventQuery.
     * @param eventQuery A query that adds event bands to the graph. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters eventQuery(String eventQuery) {
      this.eventQuery = eventQuery;
      return this;
    }

    /**
     * Set graphDef.
     * @param graphDef A JSON document defining the graph. <code>graph_def</code> can be used instead of <code>metric_query</code>. The JSON document uses the <a href="https://docs.datadoghq.com/graphing/graphing_json/#grammar">grammar defined here</a> and should be formatted to a single line then URL encoded. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters graphDef(String graphDef) {
      this.graphDef = graphDef;
      return this;
    }

    /**
     * Set title.
     * @param title A title for the graph. If no title is specified, the graph does not have a title. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Set height.
     * @param height The height of the graph. If no height is specified, the graph's original height is used. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters height(Long height) {
      this.height = height;
      return this;
    }

    /**
     * Set width.
     * @param width The width of the graph. If no width is specified, the graph's original width is used. (optional)
     * @return GetGraphSnapshotOptionalParameters
     */
    public GetGraphSnapshotOptionalParameters width(Long width) {
      this.width = width;
      return this;
    }
  }

  /**
 * Take graph snapshots.
 *
 * See {@link #getGraphSnapshotWithHttpInfo}.
 *
 * @param start The POSIX timestamp of the start of the query in seconds. (required)
 * @param end The POSIX timestamp of the end of the query in seconds. (required)
 * @return GraphSnapshot
 * @throws ApiException if fails to make API call
 */
  public GraphSnapshot getGraphSnapshot (Long start, Long end) throws ApiException {
    return getGraphSnapshotWithHttpInfo( start,  end, new GetGraphSnapshotOptionalParameters()).getData();
  }

  /**
 * Take graph snapshots.
 *
 * See {@link #getGraphSnapshotWithHttpInfoAsync}.
 *
 * @param start The POSIX timestamp of the start of the query in seconds. (required)
 * @param end The POSIX timestamp of the end of the query in seconds. (required)
 * @return CompletableFuture&lt;GraphSnapshot&gt;
 */
  public CompletableFuture<GraphSnapshot>getGraphSnapshotAsync(Long start, Long end) {
    return getGraphSnapshotWithHttpInfoAsync(start, end, new GetGraphSnapshotOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Take graph snapshots.
 *
 * See {@link #getGraphSnapshotWithHttpInfo}.
 *
 * @param start The POSIX timestamp of the start of the query in seconds. (required)
 * @param end The POSIX timestamp of the end of the query in seconds. (required)
 * @param parameters Optional parameters for the request.
 * @return GraphSnapshot
 * @throws ApiException if fails to make API call
 */
  public GraphSnapshot getGraphSnapshot(Long start, Long end, GetGraphSnapshotOptionalParameters parameters) throws ApiException {
    return getGraphSnapshotWithHttpInfo(start, end, parameters).getData();
  }

  /**
 * Take graph snapshots.
 *
 * See {@link #getGraphSnapshotWithHttpInfoAsync}.
 *
 * @param start The POSIX timestamp of the start of the query in seconds. (required)
 * @param end The POSIX timestamp of the end of the query in seconds. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;GraphSnapshot&gt;
 */
  public CompletableFuture<GraphSnapshot>getGraphSnapshotAsync( Long start,  Long end, GetGraphSnapshotOptionalParameters parameters) {
    return getGraphSnapshotWithHttpInfoAsync(start, end, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Take graph snapshots. Snapshots are PNG images generated by rendering a specified widget in a web page and capturing it once the data is available. The image is then uploaded to cloud storage.</p>
   * <p><strong>Note</strong>: When a snapshot is created, there is some delay before it is available.</p>
   *
   * @param start The POSIX timestamp of the start of the query in seconds. (required)
   * @param end The POSIX timestamp of the end of the query in seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GraphSnapshot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GraphSnapshot> getGraphSnapshotWithHttpInfo(Long start, Long end, GetGraphSnapshotOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling getGraphSnapshot");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling getGraphSnapshot");
    }
    String metricQuery = parameters.metricQuery;
    String eventQuery = parameters.eventQuery;
    String graphDef = parameters.graphDef;
    String title = parameters.title;
    Long height = parameters.height;
    Long width = parameters.width;
    // create path and map variables
    String localVarPath = "/api/v1/graph/snapshot";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metric_query", metricQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_query", eventQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graph_def", graphDef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));

    Invocation.Builder builder = apiClient.createBuilder("v1.SnapshotsApi.getGraphSnapshot", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GraphSnapshot>() {});
  }

  /**
   * Take graph snapshots.
   *
   * See {@link #getGraphSnapshotWithHttpInfo}.
   *
   * @param start The POSIX timestamp of the start of the query in seconds. (required)
   * @param end The POSIX timestamp of the end of the query in seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GraphSnapshot&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GraphSnapshot>> getGraphSnapshotWithHttpInfoAsync(Long start, Long end, GetGraphSnapshotOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'start' is set
    if (start == null) {
        CompletableFuture<ApiResponse<GraphSnapshot>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'start' when calling getGraphSnapshot"));
        return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
        CompletableFuture<ApiResponse<GraphSnapshot>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'end' when calling getGraphSnapshot"));
        return result;
    }
    String metricQuery = parameters.metricQuery;
    String eventQuery = parameters.eventQuery;
    String graphDef = parameters.graphDef;
    String title = parameters.title;
    Long height = parameters.height;
    Long width = parameters.width;
    // create path and map variables
    String localVarPath = "/api/v1/graph/snapshot";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metric_query", metricQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_query", eventQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graph_def", graphDef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SnapshotsApi.getGraphSnapshot", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GraphSnapshot>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GraphSnapshot>() {});
  }
}