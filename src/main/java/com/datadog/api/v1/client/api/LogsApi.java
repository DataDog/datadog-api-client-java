package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.ContentEncoding;
import com.datadog.api.v1.client.model.HTTPLogItem;
import com.datadog.api.v1.client.model.LogsListRequest;
import com.datadog.api.v1.client.model.LogsListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsApi {
  private ApiClient apiClient;

  public LogsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  private ApiResponse<LogsListResponse> listLogsWithHttpInfo(LogsListRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listLogs");
    }

    // create path and map variables
    String localVarPath = "/api/v1/logs-queries/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogs");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsListResponse> localVarReturnType = new GenericType<LogsListResponse>() {};

    return apiClient.invokeAPI(
        "LogsApi.listLogs",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  public class APIlistLogsRequest {
    private LogsListRequest body;

    private APIlistLogsRequest() {}

    /**
     * Set body
     *
     * @param body Logs filter (required)
     * @return APIlistLogsRequest
     */
    public APIlistLogsRequest body(LogsListRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute listLogs request
     *
     * @return LogsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * </table>
     */
    public LogsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogs request with HTTP info returned
     *
     * @return ApiResponse&lt;LogsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<LogsListResponse> executeWithHttpInfo() throws ApiException {
      return listLogsWithHttpInfo(body);
    }
  }

  /**
   * Search logs List endpoint returns logs that match a log search query. [Results are
   * paginated][1]. **If you are considering archiving logs for your organization, consider use of
   * the Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive
   * documentation][2].** [1]: /logs/guide/collect-multiple-logs-with-pagination [2]:
   * https://docs.datadoghq.com/logs/archives
   *
   * @return listLogsRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistLogsRequest listLogs() throws ApiException {
    return new APIlistLogsRequest();
  }

  private ApiResponse<Object> submitLogWithHttpInfo(
      List<HTTPLogItem> body, ContentEncoding contentEncoding, String ddtags) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitLog");
    }

    // create path and map variables
    String localVarPath = "/v1/input";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ddtags", ddtags));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "submitLog");

    if (contentEncoding != null)
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/logplex-1", "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "LogsApi.submitLog",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  public class APIsubmitLogRequest {
    private List<HTTPLogItem> body;
    private ContentEncoding contentEncoding;
    private String ddtags;

    private APIsubmitLogRequest() {}

    /**
     * Set body
     *
     * @param body Log to send (JSON format). (required)
     * @return APIsubmitLogRequest
     */
    public APIsubmitLogRequest body(List<HTTPLogItem> body) {
      this.body = body;
      return this;
    }

    /**
     * Set contentEncoding
     *
     * @param contentEncoding HTTP header used to compress the media-type. (optional)
     * @return APIsubmitLogRequest
     */
    public APIsubmitLogRequest contentEncoding(ContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }

    /**
     * Set ddtags
     *
     * @param ddtags Log tags can be passed as query parameters with &#x60;text/plain&#x60; content
     *     type. (optional)
     * @return APIsubmitLogRequest
     */
    public APIsubmitLogRequest ddtags(String ddtags) {
      this.ddtags = ddtags;
      return this;
    }

    /**
     * Execute submitLog request
     *
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Response from server (always 200 empty JSON). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute submitLog request with HTTP info returned
     *
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Response from server (always 200 empty JSON). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return submitLogWithHttpInfo(body, contentEncoding, ddtags);
    }
  }

  /**
   * Send logs Send your logs to your Datadog platform over HTTP. Limits per HTTP request are: -
   * Maximum content size per payload (uncompressed): 5MB - Maximum size for a single log: 1MB -
   * Maximum array size if sending multiple logs in an array: 1000 entries Any log exceeding 1MB is
   * accepted and truncated by Datadog: - For a single log request, the API truncates the log at 1MB
   * and returns a 2xx. - For a multi-logs request, the API processes all logs, truncates only logs
   * larger than 1MB, and returns a 2xx. Datadog recommends sending your logs compressed. Add the
   * &#x60;Content-Encoding: gzip&#x60; header to the request when sending compressed logs. The
   * status codes answered by the HTTP API are: - 200: OK - 400: Bad request (likely an issue in the
   * payload formatting) - 403: Permission issue (likely using an invalid API Key) - 413: Payload
   * too large (batch is above 5MB uncompressed) - 5xx: Internal error, request should be retried
   * after some time
   *
   * @return submitLogRequest
   * @throws ApiException if fails to make API call
   */
  public APIsubmitLogRequest submitLog() throws ApiException {
    return new APIsubmitLogRequest();
  }
}
