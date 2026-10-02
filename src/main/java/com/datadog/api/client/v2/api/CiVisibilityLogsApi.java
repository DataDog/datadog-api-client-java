package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CILogContentEncoding;
import com.datadog.api.client.v2.model.CILogItem;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CiVisibilityLogsApi {
  private ApiClient apiClient;

  public CiVisibilityLogsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CiVisibilityLogsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to submitCILog. */
  public static class SubmitCILogOptionalParameters {
    private CILogContentEncoding contentEncoding;

    /**
     * Set contentEncoding.
     *
     * @param contentEncoding HTTP header used to compress the JSON request body. (optional)
     * @return SubmitCILogOptionalParameters
     */
    public SubmitCILogOptionalParameters contentEncoding(CILogContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }
  }

  /**
   * Send CI job logs.
   *
   * <p>See {@link #submitCILogWithHttpInfo}.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitCILog(List<CILogItem> body) throws ApiException {
    return submitCILogWithHttpInfo(body, new SubmitCILogOptionalParameters()).getData();
  }

  /**
   * Send CI job logs.
   *
   * <p>See {@link #submitCILogWithHttpInfoAsync}.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitCILogAsync(List<CILogItem> body) {
    return submitCILogWithHttpInfoAsync(body, new SubmitCILogOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send CI job logs.
   *
   * <p>See {@link #submitCILogWithHttpInfo}.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @param parameters Optional parameters for the request.
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitCILog(List<CILogItem> body, SubmitCILogOptionalParameters parameters)
      throws ApiException {
    return submitCILogWithHttpInfo(body, parameters).getData();
  }

  /**
   * Send CI job logs.
   *
   * <p>See {@link #submitCILogWithHttpInfoAsync}.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitCILogAsync(
      List<CILogItem> body, SubmitCILogOptionalParameters parameters) {
    return submitCILogWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send log lines for a CI job over HTTP. See the <a
   * href="https://docs.datadoghq.com/api/latest/ci-visibility-pipelines/send-pipeline-event/">CI
   * Visibility Pipelines API</a> for submitting the associated pipeline and job events.
   *
   * <p>A request can contain one log object or an array of up to 1,000 log objects. The maximum
   * uncompressed request body size is 5.1 MiB.
   *
   * <p>You can stream log lines while a CI job runs or send them after it finishes. After you
   * submit the completed job event, 20 seconds without a new log line marks the job's logs as
   * complete. Lines sent after that may not appear.
   *
   * <p>A job can have up to 128 additional attributes and 256 tags. Additional attributes are
   * top-level fields with string, number, boolean, or null values. Nested objects and arrays are
   * rejected. Additional attributes and <code>ddtags</code> apply to all log lines in the job. If
   * an additional attribute has different values on different lines, the first value received is
   * used. Tags supplied on different lines are combined. A job can contain up to 2,000,000 log
   * records or 1 GiB of message bytes in total.
   *
   * <p>To reduce request size, send gzip-compressed JSON with the <code>Content-Encoding: gzip
   * </code> header. Retry requests after a 408, 429, 500, or 503 response.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Request accepted for processing </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> submitCILogWithHttpInfo(
      List<CILogItem> body, SubmitCILogOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitCILog");
    }
    CILogContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/cilogs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CiVisibilityLogsApi.submitCILog",
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
   * Send CI job logs.
   *
   * <p>See {@link #submitCILogWithHttpInfo}.
   *
   * @param body CI job log line or batch in JSON format. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> submitCILogWithHttpInfoAsync(
      List<CILogItem> body, SubmitCILogOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling submitCILog"));
      return result;
    }
    CILogContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/cilogs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CiVisibilityLogsApi.submitCILog",
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
