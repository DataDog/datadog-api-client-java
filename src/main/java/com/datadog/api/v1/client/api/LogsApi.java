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
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
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
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Search logs
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @param body Logs filter (required)
   * @return LogsListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsListResponse listLogs(LogsListRequest body) throws ApiException {
    return listLogsWithHttpInfo(body).getData();
  }

  /**
   * Search logs
   *
   * <p>See {@link #listLogsWithHttpInfoAsync}.
   *
   * @param body Logs filter (required)
   * @return CompletableFuture&lt;LogsListResponse&gt;
   */
  public CompletableFuture<LogsListResponse> listLogsAsync(LogsListRequest body) {
    return listLogsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search logs
   *
   * <p>List endpoint returns logs that match a log search query. [Results are paginated][1]. **If
   * you are considering archiving logs for your organization, consider use of the Datadog archive
   * capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].** [1]:
   * /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives
   *
   * @param body Logs filter (required)
   * @return ApiResponse&lt;LogsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsListResponse> listLogsWithHttpInfo(LogsListRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listLogs");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs-queries/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsApi.listLogs",
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
        new GenericType<LogsListResponse>() {});
  }

  /**
   * Search logs
   *
   * <p>See {@link #listLogsWithHttpInfo}.
   *
   * @param body Logs filter (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsListResponse>> listLogsWithHttpInfoAsync(
      LogsListRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling listLogs"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs-queries/list";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogs");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsApi.listLogs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsListResponse>() {});
  }

  /** Manage optional parameters to submitLog. */
  public static class SubmitLogOptionalParameters {
    private ContentEncoding contentEncoding;
    private String ddtags;

    /**
     * Set contentEncoding
     *
     * @param contentEncoding HTTP header used to compress the media-type. (optional)
     * @return SubmitLogOptionalParameters
     */
    public SubmitLogOptionalParameters contentEncoding(ContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }

    /**
     * Set ddtags
     *
     * @param ddtags Log tags can be passed as query parameters with &#x60;text/plain&#x60; content
     *     type. (optional)
     * @return SubmitLogOptionalParameters
     */
    public SubmitLogOptionalParameters ddtags(String ddtags) {
      this.ddtags = ddtags;
      return this;
    }
  }

  /**
   * Send logs
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object submitLog(List<HTTPLogItem> body) throws ApiException {
    return submitLogWithHttpInfo(body, new SubmitLogOptionalParameters()).getData();
  }

  /**
   * Send logs
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> submitLogAsync(List<HTTPLogItem> body) {
    return submitLogWithHttpInfoAsync(body, new SubmitLogOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send logs
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object submitLog(List<HTTPLogItem> body, SubmitLogOptionalParameters parameters)
      throws ApiException {
    return submitLogWithHttpInfo(body, parameters).getData();
  }

  /**
   * Send logs
   *
   * <p>See {@link #submitLogWithHttpInfoAsync}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> submitLogAsync(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) {
    return submitLogWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send logs
   *
   * <p>Send your logs to your Datadog platform over HTTP. Limits per HTTP request are: - Maximum
   * content size per payload (uncompressed): 5MB - Maximum size for a single log: 1MB - Maximum
   * array size if sending multiple logs in an array: 1000 entries Any log exceeding 1MB is accepted
   * and truncated by Datadog: - For a single log request, the API truncates the log at 1MB and
   * returns a 2xx. - For a multi-logs request, the API processes all logs, truncates only logs
   * larger than 1MB, and returns a 2xx. Datadog recommends sending your logs compressed. Add the
   * &#x60;Content-Encoding: gzip&#x60; header to the request when sending compressed logs. The
   * status codes answered by the HTTP API are: - 200: OK - 400: Bad request (likely an issue in the
   * payload formatting) - 403: Permission issue (likely using an invalid API Key) - 413: Payload
   * too large (batch is above 5MB uncompressed) - 5xx: Internal error, request should be retried
   * after some time
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Response from server (always 200 empty JSON). </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> unexpected error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> submitLogWithHttpInfo(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitLog");
    }
    ContentEncoding contentEncoding = parameters.contentEncoding;
    String ddtags = parameters.ddtags;
    // create path and map variables
    String localVarPath = "/v1/input";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ddtags", ddtags));

    if (contentEncoding != null)
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsApi.submitLog",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {
          "application/json", "application/json;simple", "application/logplex-1", "text/plain"
        },
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Send logs
   *
   * <p>See {@link #submitLogWithHttpInfo}.
   *
   * @param body Log to send (JSON format). (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> submitLogWithHttpInfoAsync(
      List<HTTPLogItem> body, SubmitLogOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling submitLog"));
      return result;
    }
    ContentEncoding contentEncoding = parameters.contentEncoding;
    String ddtags = parameters.ddtags;
    // create path and map variables
    String localVarPath = "/v1/input";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ddtags", ddtags));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "submitLog");

    if (contentEncoding != null)
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsApi.submitLog",
              localVarPath,
              localVarQueryParams,
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
        new String[] {
          "application/json", "application/json;simple", "application/logplex-1", "text/plain"
        },
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }
}
