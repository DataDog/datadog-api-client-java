
package com.datadog.api.client.v2.api;

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


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplaySessionsApi {
  private ApiClient apiClient;
  public RumReplaySessionsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplaySessionsApi(ApiClient apiClient) {
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
   * Manage optional parameters to getSegments.
   */
  public static class GetSegmentsOptionalParameters {
    private String source;
    private Long ts;
    private Integer maxListSize;
    private String paging;

    /**
     * Set source.
     * @param source Storage source: 'event_platform' or 'blob'. (optional)
     * @return GetSegmentsOptionalParameters
     */
    public GetSegmentsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set ts.
     * @param ts Server-side timestamp in milliseconds. (optional)
     * @return GetSegmentsOptionalParameters
     */
    public GetSegmentsOptionalParameters ts(Long ts) {
      this.ts = ts;
      return this;
    }

    /**
     * Set maxListSize.
     * @param maxListSize Maximum size in bytes for the segment list. (optional)
     * @return GetSegmentsOptionalParameters
     */
    public GetSegmentsOptionalParameters maxListSize(Integer maxListSize) {
      this.maxListSize = maxListSize;
      return this;
    }

    /**
     * Set paging.
     * @param paging Paging token for pagination. (optional)
     * @return GetSegmentsOptionalParameters
     */
    public GetSegmentsOptionalParameters paging(String paging) {
      this.paging = paging;
      return this;
    }
  }

  /**
 * Get segments.
 *
 * See {@link #getSegmentsWithHttpInfo}.
 *
 * @param viewId Unique identifier of the view. (required)
 * @param sessionId Unique identifier of the session. (required)
 * @throws ApiException if fails to make API call
 */
  public void getSegments (String viewId, String sessionId) throws ApiException {
     getSegmentsWithHttpInfo( viewId,  sessionId, new GetSegmentsOptionalParameters());
  }

  /**
 * Get segments.
 *
 * See {@link #getSegmentsWithHttpInfoAsync}.
 *
 * @param viewId Unique identifier of the view. (required)
 * @param sessionId Unique identifier of the session. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>getSegmentsAsync(String viewId, String sessionId) {
    return getSegmentsWithHttpInfoAsync(viewId, sessionId, new GetSegmentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get segments.
 *
 * See {@link #getSegmentsWithHttpInfo}.
 *
 * @param viewId Unique identifier of the view. (required)
 * @param sessionId Unique identifier of the session. (required)
 * @param parameters Optional parameters for the request.
 * @throws ApiException if fails to make API call
 */
  public  void getSegments(String viewId, String sessionId, GetSegmentsOptionalParameters parameters) throws ApiException {
     getSegmentsWithHttpInfo(viewId, sessionId, parameters);
  }

  /**
 * Get segments.
 *
 * See {@link #getSegmentsWithHttpInfoAsync}.
 *
 * @param viewId Unique identifier of the view. (required)
 * @param sessionId Unique identifier of the session. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture
 */
  public CompletableFuture<Void>getSegmentsAsync( String viewId,  String sessionId, GetSegmentsOptionalParameters parameters) {
    return getSegmentsWithHttpInfoAsync(viewId, sessionId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get segments for a view.</p>
   *
   * @param viewId Unique identifier of the view. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> getSegmentsWithHttpInfo(String viewId, String sessionId, GetSegmentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(400, "Missing the required parameter 'viewId' when calling getSegments");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getSegments");
    }
    String source = parameters.source;
    Long ts = parameters.ts;
    Integer maxListSize = parameters.maxListSize;
    String paging = parameters.paging;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/sessions/{session_id}/views/{view_id}/segments"
      .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()))
      .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_list_size", maxListSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paging", paging));

    Invocation.Builder builder = apiClient.createBuilder("v2.RumReplaySessionsApi.getSegments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Get segments.
   *
   * See {@link #getSegmentsWithHttpInfo}.
   *
   * @param viewId Unique identifier of the view. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> getSegmentsWithHttpInfoAsync(String viewId, String sessionId, GetSegmentsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'viewId' when calling getSegments"));
        return result;
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'sessionId' when calling getSegments"));
        return result;
    }
    String source = parameters.source;
    Long ts = parameters.ts;
    Integer maxListSize = parameters.maxListSize;
    String paging = parameters.paging;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/sessions/{session_id}/views/{view_id}/segments"
      .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()))
      .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_list_size", maxListSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paging", paging));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.RumReplaySessionsApi.getSegments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }
}