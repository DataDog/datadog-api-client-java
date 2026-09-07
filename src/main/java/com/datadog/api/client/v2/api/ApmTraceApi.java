package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.PrunedTraceResponse;
import com.datadog.api.client.v2.model.TraceResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmTraceApi {
  private ApiClient apiClient;

  public ApmTraceApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApmTraceApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getPrunedTraceByID. */
  public static class GetPrunedTraceByIDOptionalParameters {
    private Long expandSpanId;
    private Integer timeHint;
    private String forceSource;
    private List<String> includePath;
    private List<String> tagInclude;
    private List<String> tagExclude;
    private Boolean onlyServiceEntrySpans;

    /**
     * Set expandSpanId.
     *
     * @param expandSpanId Span ID to expand and preserve in the pruned tree even when its branch
     *     would normally be summarized. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters expandSpanId(Long expandSpanId) {
      this.expandSpanId = expandSpanId;
      return this;
    }

    /**
     * Set timeHint.
     *
     * @param timeHint Optional Unix time hint, in seconds, used to optimize the lookup of the trace
     *     in long-term storage. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters timeHint(Integer timeHint) {
      this.timeHint = timeHint;
      return this;
    }

    /**
     * Set forceSource.
     *
     * @param forceSource Force the trace to be loaded from a specific source. When unset, the API
     *     picks the source automatically. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters forceSource(String forceSource) {
      this.forceSource = forceSource;
      return this;
    }

    /**
     * Set includePath.
     *
     * @param includePath Restrict the pruned tree to spans matching the given <code>key:value
     *     </code> pairs. Values may be passed as repeated query parameters. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters includePath(List<String> includePath) {
      this.includePath = includePath;
      return this;
    }

    /**
     * Set tagInclude.
     *
     * @param tagInclude Regex patterns of tag keys whose values must be included in the pruned
     *     spans. Values may be passed as repeated query parameters. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters tagInclude(List<String> tagInclude) {
      this.tagInclude = tagInclude;
      return this;
    }

    /**
     * Set tagExclude.
     *
     * @param tagExclude Regex patterns of tag keys whose values must be excluded from the pruned
     *     spans. Values may be passed as repeated query parameters. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters tagExclude(List<String> tagExclude) {
      this.tagExclude = tagExclude;
      return this;
    }

    /**
     * Set onlyServiceEntrySpans.
     *
     * @param onlyServiceEntrySpans When set to <code>true</code>, only service entry spans are
     *     included in the pruned tree. (optional)
     * @return GetPrunedTraceByIDOptionalParameters
     */
    public GetPrunedTraceByIDOptionalParameters onlyServiceEntrySpans(
        Boolean onlyServiceEntrySpans) {
      this.onlyServiceEntrySpans = onlyServiceEntrySpans;
      return this;
    }
  }

  /**
   * Get a pruned trace by ID.
   *
   * <p>See {@link #getPrunedTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @return PrunedTraceResponse
   * @throws ApiException if fails to make API call
   */
  public PrunedTraceResponse getPrunedTraceByID(String traceId) throws ApiException {
    return getPrunedTraceByIDWithHttpInfo(traceId, new GetPrunedTraceByIDOptionalParameters())
        .getData();
  }

  /**
   * Get a pruned trace by ID.
   *
   * <p>See {@link #getPrunedTraceByIDWithHttpInfoAsync}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @return CompletableFuture&lt;PrunedTraceResponse&gt;
   */
  public CompletableFuture<PrunedTraceResponse> getPrunedTraceByIDAsync(String traceId) {
    return getPrunedTraceByIDWithHttpInfoAsync(traceId, new GetPrunedTraceByIDOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a pruned trace by ID.
   *
   * <p>See {@link #getPrunedTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return PrunedTraceResponse
   * @throws ApiException if fails to make API call
   */
  public PrunedTraceResponse getPrunedTraceByID(
      String traceId, GetPrunedTraceByIDOptionalParameters parameters) throws ApiException {
    return getPrunedTraceByIDWithHttpInfo(traceId, parameters).getData();
  }

  /**
   * Get a pruned trace by ID.
   *
   * <p>See {@link #getPrunedTraceByIDWithHttpInfoAsync}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PrunedTraceResponse&gt;
   */
  public CompletableFuture<PrunedTraceResponse> getPrunedTraceByIDAsync(
      String traceId, GetPrunedTraceByIDOptionalParameters parameters) {
    return getPrunedTraceByIDWithHttpInfoAsync(traceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a pruned, hierarchical view of an APM trace by its trace ID. The trace is summarized
   * as a tree of spans rooted at the trace root and reduced in size to keep rendering large traces
   * in the UI practical. This endpoint is rate limited to <code>60</code> requests per minute per
   * organization.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;PrunedTraceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 504 </td><td> Gateway Timeout </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PrunedTraceResponse> getPrunedTraceByIDWithHttpInfo(
      String traceId, GetPrunedTraceByIDOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getPrunedTraceByID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'traceId' is set
    if (traceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'traceId' when calling getPrunedTraceByID");
    }
    Long expandSpanId = parameters.expandSpanId;
    Integer timeHint = parameters.timeHint;
    String forceSource = parameters.forceSource;
    List<String> includePath = parameters.includePath;
    List<String> tagInclude = parameters.tagInclude;
    List<String> tagExclude = parameters.tagExclude;
    Boolean onlyServiceEntrySpans = parameters.onlyServiceEntrySpans;
    // create path and map variables
    String localVarPath =
        "/api/v2/pruned_trace/{trace_id}"
            .replaceAll("\\{" + "trace_id" + "\\}", apiClient.escapeString(traceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand_span_id", expandSpanId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_hint", timeHint));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force_source", forceSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include_path", includePath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tag_include", tagInclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tag_exclude", tagExclude));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "only_service_entry_spans", onlyServiceEntrySpans));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmTraceApi.getPrunedTraceByID",
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
        new GenericType<PrunedTraceResponse>() {});
  }

  /**
   * Get a pruned trace by ID.
   *
   * <p>See {@link #getPrunedTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PrunedTraceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PrunedTraceResponse>> getPrunedTraceByIDWithHttpInfoAsync(
      String traceId, GetPrunedTraceByIDOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getPrunedTraceByID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PrunedTraceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'traceId' is set
    if (traceId == null) {
      CompletableFuture<ApiResponse<PrunedTraceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'traceId' when calling getPrunedTraceByID"));
      return result;
    }
    Long expandSpanId = parameters.expandSpanId;
    Integer timeHint = parameters.timeHint;
    String forceSource = parameters.forceSource;
    List<String> includePath = parameters.includePath;
    List<String> tagInclude = parameters.tagInclude;
    List<String> tagExclude = parameters.tagExclude;
    Boolean onlyServiceEntrySpans = parameters.onlyServiceEntrySpans;
    // create path and map variables
    String localVarPath =
        "/api/v2/pruned_trace/{trace_id}"
            .replaceAll("\\{" + "trace_id" + "\\}", apiClient.escapeString(traceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand_span_id", expandSpanId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_hint", timeHint));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force_source", forceSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include_path", includePath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tag_include", tagInclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tag_exclude", tagExclude));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "only_service_entry_spans", onlyServiceEntrySpans));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmTraceApi.getPrunedTraceByID",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PrunedTraceResponse>> result = new CompletableFuture<>();
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
        new GenericType<PrunedTraceResponse>() {});
  }

  /** Manage optional parameters to getTraceByID. */
  public static class GetTraceByIDOptionalParameters {
    private List<String> includeFields;

    /**
     * Set includeFields.
     *
     * @param includeFields List of span fields to include in the response. When omitted, every
     *     available field is returned. Values may be passed as repeated query parameters or as a
     *     single comma-separated value. (optional)
     * @return GetTraceByIDOptionalParameters
     */
    public GetTraceByIDOptionalParameters includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
      return this;
    }
  }

  /**
   * Get a trace by ID.
   *
   * <p>See {@link #getTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @return TraceResponse
   * @throws ApiException if fails to make API call
   */
  public TraceResponse getTraceByID(String traceId) throws ApiException {
    return getTraceByIDWithHttpInfo(traceId, new GetTraceByIDOptionalParameters()).getData();
  }

  /**
   * Get a trace by ID.
   *
   * <p>See {@link #getTraceByIDWithHttpInfoAsync}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @return CompletableFuture&lt;TraceResponse&gt;
   */
  public CompletableFuture<TraceResponse> getTraceByIDAsync(String traceId) {
    return getTraceByIDWithHttpInfoAsync(traceId, new GetTraceByIDOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a trace by ID.
   *
   * <p>See {@link #getTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return TraceResponse
   * @throws ApiException if fails to make API call
   */
  public TraceResponse getTraceByID(String traceId, GetTraceByIDOptionalParameters parameters)
      throws ApiException {
    return getTraceByIDWithHttpInfo(traceId, parameters).getData();
  }

  /**
   * Get a trace by ID.
   *
   * <p>See {@link #getTraceByIDWithHttpInfoAsync}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TraceResponse&gt;
   */
  public CompletableFuture<TraceResponse> getTraceByIDAsync(
      String traceId, GetTraceByIDOptionalParameters parameters) {
    return getTraceByIDWithHttpInfoAsync(traceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a full APM trace by its trace ID, including every span in the trace. Traces are
   * returned from live storage when available and fall back to longer-term storage. This endpoint
   * is rate limited to <code>60</code> requests per minute per organization.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TraceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TraceResponse> getTraceByIDWithHttpInfo(
      String traceId, GetTraceByIDOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTraceByID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'traceId' is set
    if (traceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'traceId' when calling getTraceByID");
    }
    List<String> includeFields = parameters.includeFields;
    // create path and map variables
    String localVarPath =
        "/api/v2/trace/{trace_id}"
            .replaceAll("\\{" + "trace_id" + "\\}", apiClient.escapeString(traceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "include_fields", includeFields));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmTraceApi.getTraceByID",
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
        new GenericType<TraceResponse>() {});
  }

  /**
   * Get a trace by ID.
   *
   * <p>See {@link #getTraceByIDWithHttpInfo}.
   *
   * @param traceId The trace ID. Accepts either a 32-character hexadecimal string (128-bit trace
   *     ID) or a decimal string of up to 39 digits. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TraceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TraceResponse>> getTraceByIDWithHttpInfoAsync(
      String traceId, GetTraceByIDOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getTraceByID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TraceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'traceId' is set
    if (traceId == null) {
      CompletableFuture<ApiResponse<TraceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'traceId' when calling getTraceByID"));
      return result;
    }
    List<String> includeFields = parameters.includeFields;
    // create path and map variables
    String localVarPath =
        "/api/v2/trace/{trace_id}"
            .replaceAll("\\{" + "trace_id" + "\\}", apiClient.escapeString(traceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "include_fields", includeFields));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmTraceApi.getTraceByID",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TraceResponse>> result = new CompletableFuture<>();
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
        new GenericType<TraceResponse>() {});
  }
}
