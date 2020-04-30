package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.GraphSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SnapshotsApi {
  private ApiClient apiClient;

  public SnapshotsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnapshotsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<GraphSnapshot> getGraphSnapshotWithHttpInfo(Long start, Long end, String metricQuery, String eventQuery, String graphDef, String title) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling getGraphSnapshot");
    }
    
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling getGraphSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/graph/snapshot";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metric_query", metricQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "event_query", eventQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graph_def", graphDef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getGraphSnapshot");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<GraphSnapshot> localVarReturnType = new GenericType<GraphSnapshot>() {};
    return apiClient.invokeAPI("SnapshotsApi.getGraphSnapshot", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetGraphSnapshotRequest {
    private Long start;
    private Long end;
    private String metricQuery;
    private String eventQuery;
    private String graphDef;
    private String title;

    private APIgetGraphSnapshotRequest() {
    }
    

    /**
     * Set start
     * @param start The POSIX timestamp of the start of the query. (required)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest start(Long start) {
      this.start = start;
      return this;
    }
    

    /**
     * Set end
     * @param end The POSIX timestamp of the end of the query. (required)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest end(Long end) {
      this.end = end;
      return this;
    }
    

    /**
     * Set metricQuery
     * @param metricQuery The metric query. (optional)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest metricQuery(String metricQuery) {
      this.metricQuery = metricQuery;
      return this;
    }
    

    /**
     * Set eventQuery
     * @param eventQuery A query that adds event bands to the graph. (optional)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest eventQuery(String eventQuery) {
      this.eventQuery = eventQuery;
      return this;
    }
    

    /**
     * Set graphDef
     * @param graphDef A JSON document defining the graph. &#x60;graph_def&#x60; can be used instead of &#x60;metric_query&#x60;. The JSON document uses the [grammar defined here](https://docs.datadoghq.com/graphing/graphing_json/#grammar) and should be formatted to a single line then URLEncoded. (optional)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest graphDef(String graphDef) {
      this.graphDef = graphDef;
      return this;
    }
    

    /**
     * Set title
     * @param title A title for the graph. If no title is specified, the graph doesn’t have a title. (optional)
     * @return APIgetGraphSnapshotRequest
     */
    public APIgetGraphSnapshotRequest title(String title) {
      this.title = title;
      return this;
    }
    

    /**
     * Execute getGraphSnapshot request
     * @return GraphSnapshot
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GraphSnapshot execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getGraphSnapshot request with HTTP info returned
     * @return ApiResponse&lt;GraphSnapshot&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<GraphSnapshot> executeWithHttpInfo() throws ApiException {
      return getGraphSnapshotWithHttpInfo(start, end, metricQuery, eventQuery, graphDef, title);
    }
  }

  /**
   * Take graph snapshots
   * Take graph snapshots. **Note**: When a snapshot is created, there is some delay before it is available.
   * @return getGraphSnapshotRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetGraphSnapshotRequest getGraphSnapshot() throws ApiException {
    return new APIgetGraphSnapshotRequest();
  }
}
