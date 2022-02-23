package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.CheckCanDeleteMonitorResponse;
import com.datadog.api.v1.client.model.DeletedMonitor;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorGroupSearchResponse;
import com.datadog.api.v1.client.model.MonitorSearchResponse;
import com.datadog.api.v1.client.model.MonitorUpdateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitorsApi {
  private ApiClient apiClient;

  public MonitorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MonitorsApi(ApiClient apiClient) {
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
   * Check if a monitor can be deleted
   *
   * <p>See {@link #checkCanDeleteMonitorWithHttpInfo}.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return CheckCanDeleteMonitorResponse
   * @throws ApiException if fails to make API call
   */
  public CheckCanDeleteMonitorResponse checkCanDeleteMonitor(List<Long> monitorIds)
      throws ApiException {
    return checkCanDeleteMonitorWithHttpInfo(monitorIds).getData();
  }

  /**
   * Check if a monitor can be deleted
   *
   * <p>See {@link #checkCanDeleteMonitorWithHttpInfoAsync}.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return CompletableFuture&lt;CheckCanDeleteMonitorResponse&gt;
   */
  public CompletableFuture<CheckCanDeleteMonitorResponse> checkCanDeleteMonitorAsync(
      List<Long> monitorIds) {
    return checkCanDeleteMonitorWithHttpInfoAsync(monitorIds)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Check if a monitor can be deleted
   *
   * <p>Check if the given monitors can be deleted.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return ApiResponse&lt;CheckCanDeleteMonitorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Deletion conflict error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CheckCanDeleteMonitorResponse> checkCanDeleteMonitorWithHttpInfo(
      List<Long> monitorIds) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorIds' is set
    if (monitorIds == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorIds' when calling checkCanDeleteMonitor");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/can_delete";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "monitor_ids", monitorIds));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.checkCanDeleteMonitor",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CheckCanDeleteMonitorResponse>() {});
  }

  /**
   * Check if a monitor can be deleted
   *
   * <p>See {@link #checkCanDeleteMonitorWithHttpInfo}.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CheckCanDeleteMonitorResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CheckCanDeleteMonitorResponse>>
      checkCanDeleteMonitorWithHttpInfoAsync(List<Long> monitorIds) {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorIds' is set
    if (monitorIds == null) {
      CompletableFuture<ApiResponse<CheckCanDeleteMonitorResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorIds' when calling checkCanDeleteMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/can_delete";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "monitor_ids", monitorIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.checkCanDeleteMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CheckCanDeleteMonitorResponse>> result =
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
        new GenericType<CheckCanDeleteMonitorResponse>() {});
  }

  /**
   * Create a monitor
   *
   * <p>See {@link #createMonitorWithHttpInfo}.
   *
   * @param body Create a monitor request body. (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   */
  public Monitor createMonitor(Monitor body) throws ApiException {
    return createMonitorWithHttpInfo(body).getData();
  }

  /**
   * Create a monitor
   *
   * <p>See {@link #createMonitorWithHttpInfoAsync}.
   *
   * @param body Create a monitor request body. (required)
   * @return CompletableFuture&lt;Monitor&gt;
   */
  public CompletableFuture<Monitor> createMonitorAsync(Monitor body) {
    return createMonitorWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a monitor
   *
   * <p>Create a monitor using the specified options. #### Monitor Types The type of monitor chosen
   * from: - anomaly: &#x60;query alert&#x60; - APM: &#x60;query alert&#x60; or
   * &#x60;trace-analytics alert&#x60; - composite: &#x60;composite&#x60; - custom: &#x60;service
   * check&#x60; - event: &#x60;event alert&#x60; - forecast: &#x60;query alert&#x60; - host:
   * &#x60;service check&#x60; - integration: &#x60;query alert&#x60; or &#x60;service check&#x60; -
   * live process: &#x60;process alert&#x60; - logs: &#x60;log alert&#x60; - metric: &#x60;query
   * alert&#x60; - network: &#x60;service check&#x60; - outlier: &#x60;query alert&#x60; - process:
   * &#x60;service check&#x60; - rum: &#x60;rum alert&#x60; - SLO: &#x60;slo alert&#x60; - watchdog:
   * &#x60;event alert&#x60; - event-v2: &#x60;event-v2 alert&#x60; - audit: &#x60;audit alert&#x60;
   * #### Query Types **Metric Alert Query** Example:
   * &#x60;time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator #&#x60; -
   * &#x60;time_aggr&#x60;: avg, sum, max, min, change, or pct_change - &#x60;time_window&#x60;:
   * &#x60;last_#m&#x60; (with &#x60;#&#x60; between 1 and 10080 depending on the monitor type) or
   * &#x60;last_#h&#x60;(with &#x60;#&#x60; between 1 and 168 depending on the monitor type) or
   * &#x60;last_1d&#x60;, or &#x60;last_1w&#x60; - &#x60;space_aggr&#x60;: avg, sum, min, or max -
   * &#x60;tags&#x60;: one or more tags (comma-separated), or * - &#x60;key&#x60;: a &#39;key&#39;
   * in key:value tag syntax; defines a separate alert for each tag in the group (multi-alert) -
   * &#x60;operator&#x60;: &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;&#x3D;, or !&#x3D; -
   * &#x60;#&#x60;: an integer or decimal number used to set the threshold If you are using the
   * &#x60;_change_&#x60; or &#x60;_pct_change_&#x60; time aggregator, instead use
   * &#x60;change_aggr(time_aggr(time_window), timeshift):space_aggr:metric{tags} [by {key}]
   * operator #&#x60; with: - &#x60;change_aggr&#x60; change, pct_change - &#x60;time_aggr&#x60;
   * avg, sum, max, min [Learn
   * more](https://docs.datadoghq.com/monitors/create/types/#define-the-conditions) -
   * &#x60;time_window&#x60; last\\_#m (between 1 and 2880 depending on the monitor type), last\\_#h
   * (between 1 and 48 depending on the monitor type), or last_#d (1 or 2) - &#x60;timeshift&#x60;
   * #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago Use this to create an outlier monitor
   * using the following query:
   * &#x60;avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host},
   * &#39;dbscan&#39;, 7) &gt; 0&#x60; **Service Check Query** Example:
   * &#x60;\&quot;check\&quot;.over(tags).last(count).by(group).count_by_status()&#x60; -
   * **&#x60;check&#x60;** name of the check, for example &#x60;datadog.agent.up&#x60; -
   * **&#x60;tags&#x60;** one or more quoted tags (comma-separated), or \&quot;*\&quot;. for
   * example: &#x60;.over(\&quot;env:prod\&quot;, \&quot;role:db\&quot;)&#x60;; **&#x60;over&#x60;**
   * cannot be blank. - **&#x60;count&#x60;** must be at greater than or equal to your max threshold
   * (defined in the &#x60;options&#x60;). It is limited to 100. For example, if you&#39;ve
   * specified to notify on 1 critical, 3 ok, and 2 warn statuses, &#x60;count&#x60; should be at
   * least 3. - **&#x60;group&#x60;** must be specified for check monitors. Per-check grouping is
   * already explicitly known for some service checks. For example, Postgres integration monitors
   * are tagged by &#x60;db&#x60;, &#x60;host&#x60;, and &#x60;port&#x60;, and Network monitors by
   * &#x60;host&#x60;, &#x60;instance&#x60;, and &#x60;url&#x60;. See [Service
   * Checks](https://docs.datadoghq.com/api/latest/service-checks/) documentation for more
   * information. **Event Alert Query** Example: &#x60;events(&#39;sources:nagios
   * status:error,warning priority:normal tags: \&quot;string
   * query\&quot;&#39;).rollup(\&quot;count\&quot;).last(\&quot;1h\&quot;)\&quot;&#x60; -
   * **&#x60;event&#x60;**, the event query string: - **&#x60;string_query&#x60;** free text query
   * to match against event title and text. - **&#x60;sources&#x60;** event sources
   * (comma-separated). - **&#x60;status&#x60;** event statuses (comma-separated). Valid options:
   * error, warn, and info. - **&#x60;priority&#x60;** event priorities (comma-separated). Valid
   * options: low, normal, all. - **&#x60;host&#x60;** event reporting host (comma-separated). -
   * **&#x60;tags&#x60;** event tags (comma-separated). - **&#x60;excluded_tags&#x60;** excluded
   * event tags (comma-separated). - **&#x60;rollup&#x60;** the stats roll-up method.
   * &#x60;count&#x60; is the only supported method now. - **&#x60;last&#x60;** the timeframe to
   * roll up the counts. Examples: 45m, 4h. Supported timeframes: m, h and d. This value should not
   * exceed 48 hours. **NOTE** The Event Alert Query is being deprecated and replaced by the Event
   * V2 Alert Query. For more information, see the [Event Migration
   * guide](https://docs.datadoghq.com/events/guides/migrating_to_new_events_features/). **Event V2
   * Alert Query** Example: &#x60;events(query).rollup(rollup_method[, measure]).last(time_window)
   * operator #&#x60; - **&#x60;query&#x60;** The search query - following the [Log search
   * syntax](https://docs.datadoghq.com/logs/search_syntax/). - **&#x60;rollup_method&#x60;** The
   * stats roll-up method - supports &#x60;count&#x60;, &#x60;avg&#x60; and &#x60;cardinality&#x60;.
   * - **&#x60;measure&#x60;** For &#x60;avg&#x60; and cardinality &#x60;rollup_method&#x60; -
   * specify the measure or the facet name you want to use. - **&#x60;time_window&#x60;** #m
   * (between 1 and 2880), #h (between 1 and 48). - **&#x60;operator&#x60;** &#x60;&lt;&#x60;,
   * &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or
   * &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;** an integer or decimal number used to set the
   * threshold. **NOTE** Only available on US1-FED, US3, US5 and in closed beta on EU and US1.
   * **Process Alert Query** Example:
   * &#x60;processes(search).over(tags).rollup(&#39;count&#39;).last(timeframe) operator #&#x60; -
   * **&#x60;search&#x60;** free text search string for querying processes. Matching processes match
   * results on the [Live
   * Processes](https://docs.datadoghq.com/infrastructure/process/?tab&#x3D;linuxwindows) page. -
   * **&#x60;tags&#x60;** one or more tags (comma-separated) - **&#x60;timeframe&#x60;** the
   * timeframe to roll up the counts. Examples: 10m, 4h. Supported timeframes: s, m, h and d -
   * **&#x60;operator&#x60;** &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;&#x3D;, or !&#x3D; -
   * **&#x60;#&#x60;** an integer or decimal number used to set the threshold **Logs Alert Query**
   * Example: &#x60;logs(query).index(index_name).rollup(rollup_method[, measure]).last(time_window)
   * operator #&#x60; - **&#x60;query&#x60;** The search query - following the [Log search
   * syntax](https://docs.datadoghq.com/logs/search_syntax/). - **&#x60;index_name&#x60;** For
   * multi-index organizations, the log index in which the request is performed. -
   * **&#x60;rollup_method&#x60;** The stats roll-up method - supports &#x60;count&#x60;,
   * &#x60;avg&#x60; and &#x60;cardinality&#x60;. - **&#x60;measure&#x60;** For &#x60;avg&#x60; and
   * cardinality &#x60;rollup_method&#x60; - specify the measure or the facet name you want to use.
   * - **&#x60;time_window&#x60;** #m (between 1 and 2880), #h (between 1 and 48). -
   * **&#x60;operator&#x60;** &#x60;&lt;&#x60;, &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;,
   * &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;**
   * an integer or decimal number used to set the threshold. **Composite Query** Example:
   * &#x60;12345 &amp;&amp; 67890&#x60;, where &#x60;12345&#x60; and &#x60;67890&#x60; are the IDs
   * of non-composite monitors * **&#x60;name&#x60;** [*required*, *default* &#x3D; **dynamic, based
   * on query**]: The name of the alert. * **&#x60;message&#x60;** [*required*, *default* &#x3D;
   * **dynamic, based on query**]: A message to include with notifications for this monitor. Email
   * notifications can be sent to specific users by using the same &#39;@username&#39; notation as
   * events. * **&#x60;tags&#x60;** [*optional*, *default* &#x3D; **empty list**]: A list of tags to
   * associate with your monitor. When getting all monitor details via the API, use the
   * &#x60;monitor_tags&#x60; argument to filter results by these tags. It is only available via the
   * API and isn&#39;t visible or editable in the Datadog UI. **SLO Alert Query** Example:
   * &#x60;error_budget(\&quot;slo_id\&quot;).over(\&quot;time_window\&quot;) operator #&#x60; -
   * **&#x60;slo_id&#x60;**: The alphanumeric SLO ID of the SLO you are configuring the alert for. -
   * **&#x60;time_window&#x60;**: The time window of the SLO target you wish to alert on. Valid
   * options: &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;90d&#x60;. - **&#x60;operator&#x60;**:
   * &#x60;&gt;&#x3D;&#x60; or &#x60;&gt;&#x60; **Audit Alert Query** Example:
   * &#x60;audits(query).rollup(rollup_method[, measure]).last(time_window) operator #&#x60; -
   * **&#x60;query&#x60;** The search query - following the [Log search
   * syntax](https://docs.datadoghq.com/logs/search_syntax/). - **&#x60;rollup_method&#x60;** The
   * stats roll-up method - supports &#x60;count&#x60;, &#x60;avg&#x60; and &#x60;cardinality&#x60;.
   * - **&#x60;measure&#x60;** For &#x60;avg&#x60; and cardinality &#x60;rollup_method&#x60; -
   * specify the measure or the facet name you want to use. - **&#x60;time_window&#x60;** #m
   * (between 1 and 2880), #h (between 1 and 48). - **&#x60;operator&#x60;** &#x60;&lt;&#x60;,
   * &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or
   * &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;** an integer or decimal number used to set the
   * threshold. **NOTE** Only available on US1-FED and in closed beta on US1, EU, US3, and US5. **CI
   * Pipelines Alert Query** Example: &#x60;ci-pipelines(query).rollup(rollup_method[,
   * measure]).last(time_window) operator #&#x60; - **&#x60;query&#x60;** The search query -
   * following the [Log search syntax](https://docs.datadoghq.com/logs/search_syntax/). -
   * **&#x60;rollup_method&#x60;** The stats roll-up method - supports &#x60;count&#x60;,
   * &#x60;avg&#x60;, and &#x60;cardinality&#x60;. - **&#x60;measure&#x60;** For &#x60;avg&#x60; and
   * cardinality &#x60;rollup_method&#x60; - specify the measure or the facet name you want to use.
   * - **&#x60;time_window&#x60;** #m (between 1 and 2880), #h (between 1 and 48). -
   * **&#x60;operator&#x60;** &#x60;&lt;&#x60;, &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;,
   * &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;**
   * an integer or decimal number used to set the threshold. **NOTE** Only available in closed beta
   * on US1, EU, US3 and US5.
   *
   * @param body Create a monitor request body. (required)
   * @return ApiResponse&lt;Monitor&gt;
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
  public ApiResponse<Monitor> createMonitorWithHttpInfo(Monitor body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMonitor");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.createMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Monitor>() {});
  }

  /**
   * Create a monitor
   *
   * <p>See {@link #createMonitorWithHttpInfo}.
   *
   * @param body Create a monitor request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Monitor&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Monitor>> createMonitorWithHttpInfoAsync(Monitor body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.createMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
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
        new GenericType<Monitor>() {});
  }

  /** Manage optional parameters to deleteMonitor. */
  public static class DeleteMonitorOptionalParameters {
    private String force;

    /**
     * Set force
     *
     * @param force Delete the monitor even if it&#39;s referenced by other resources (for example
     *     SLO, composite monitor). (optional)
     * @return DeleteMonitorOptionalParameters
     */
    public DeleteMonitorOptionalParameters force(String force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete a monitor
   *
   * <p>See {@link #deleteMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @return DeletedMonitor
   * @throws ApiException if fails to make API call
   */
  public DeletedMonitor deleteMonitor(Long monitorId) throws ApiException {
    return deleteMonitorWithHttpInfo(monitorId, new DeleteMonitorOptionalParameters()).getData();
  }

  /**
   * Delete a monitor
   *
   * <p>See {@link #deleteMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @return CompletableFuture&lt;DeletedMonitor&gt;
   */
  public CompletableFuture<DeletedMonitor> deleteMonitorAsync(Long monitorId) {
    return deleteMonitorWithHttpInfoAsync(monitorId, new DeleteMonitorOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a monitor
   *
   * <p>See {@link #deleteMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return DeletedMonitor
   * @throws ApiException if fails to make API call
   */
  public DeletedMonitor deleteMonitor(Long monitorId, DeleteMonitorOptionalParameters parameters)
      throws ApiException {
    return deleteMonitorWithHttpInfo(monitorId, parameters).getData();
  }

  /**
   * Delete a monitor
   *
   * <p>See {@link #deleteMonitorWithHttpInfoAsync}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DeletedMonitor&gt;
   */
  public CompletableFuture<DeletedMonitor> deleteMonitorAsync(
      Long monitorId, DeleteMonitorOptionalParameters parameters) {
    return deleteMonitorWithHttpInfoAsync(monitorId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a monitor
   *
   * <p>Delete the specified monitor
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeletedMonitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeletedMonitor> deleteMonitorWithHttpInfo(
      Long monitorId, DeleteMonitorOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling deleteMonitor");
    }
    String force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.deleteMonitor",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeletedMonitor>() {});
  }

  /**
   * Delete a monitor
   *
   * <p>See {@link #deleteMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeletedMonitor&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeletedMonitor>> deleteMonitorWithHttpInfoAsync(
      Long monitorId, DeleteMonitorOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<DeletedMonitor>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'monitorId' when calling deleteMonitor"));
      return result;
    }
    String force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.deleteMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeletedMonitor>> result = new CompletableFuture<>();
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
        new GenericType<DeletedMonitor>() {});
  }

  /** Manage optional parameters to getMonitor. */
  public static class GetMonitorOptionalParameters {
    private String groupStates;

    /**
     * Set groupStates
     *
     * @param groupStates When specified, shows additional information about the group states.
     *     Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and
     *     &#x60;no data&#x60;. (optional)
     * @return GetMonitorOptionalParameters
     */
    public GetMonitorOptionalParameters groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>See {@link #getMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   */
  public Monitor getMonitor(Long monitorId) throws ApiException {
    return getMonitorWithHttpInfo(monitorId, new GetMonitorOptionalParameters()).getData();
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>See {@link #getMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @return CompletableFuture&lt;Monitor&gt;
   */
  public CompletableFuture<Monitor> getMonitorAsync(Long monitorId) {
    return getMonitorWithHttpInfoAsync(monitorId, new GetMonitorOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>See {@link #getMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return Monitor
   * @throws ApiException if fails to make API call
   */
  public Monitor getMonitor(Long monitorId, GetMonitorOptionalParameters parameters)
      throws ApiException {
    return getMonitorWithHttpInfo(monitorId, parameters).getData();
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>See {@link #getMonitorWithHttpInfoAsync}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Monitor&gt;
   */
  public CompletableFuture<Monitor> getMonitorAsync(
      Long monitorId, GetMonitorOptionalParameters parameters) {
    return getMonitorWithHttpInfoAsync(monitorId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>Get details about the specified monitor from your organization.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Monitor> getMonitorWithHttpInfo(
      Long monitorId, GetMonitorOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling getMonitor");
    }
    String groupStates = parameters.groupStates;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.getMonitor",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Monitor>() {});
  }

  /**
   * Get a monitor&#39;s details
   *
   * <p>See {@link #getMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Monitor&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Monitor>> getMonitorWithHttpInfoAsync(
      Long monitorId, GetMonitorOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'monitorId' when calling getMonitor"));
      return result;
    }
    String groupStates = parameters.groupStates;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.getMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
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
        new GenericType<Monitor>() {});
  }

  /** Manage optional parameters to listMonitors. */
  public static class ListMonitorsOptionalParameters {
    private String groupStates;
    private String name;
    private String tags;
    private String monitorTags;
    private Boolean withDowntimes;
    private Long idOffset;
    private Long page;
    private Integer pageSize;

    /**
     * Set groupStates
     *
     * @param groupStates When specified, shows additional information about the group states.
     *     Choose one or more from &#x60;all&#x60;, &#x60;alert&#x60;, &#x60;warn&#x60;, and
     *     &#x60;no data&#x60;. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }

    /**
     * Set name
     *
     * @param name A string to filter monitors by name. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set tags
     *
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the
     *     list of monitors by scope. For example, &#x60;host:host0&#x60;. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set monitorTags
     *
     * @param monitorTags A comma separated list indicating what service and/or custom tags, if any,
     *     should be used to filter the list of monitors. Tags created in the Datadog UI
     *     automatically have the service key prepended. For example, &#x60;service:my-app&#x60;.
     *     (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters monitorTags(String monitorTags) {
      this.monitorTags = monitorTags;
      return this;
    }

    /**
     * Set withDowntimes
     *
     * @param withDowntimes If this argument is set to true, then the returned data includes all
     *     current active downtimes for each monitor. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }

    /**
     * Set idOffset
     *
     * @param idOffset Use this parameter for paginating through large sets of monitors. Start with
     *     a value of zero, make a request, set the value to the last ID of result set, and then
     *     repeat until the response is empty. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters idOffset(Long idOffset) {
      this.idOffset = idOffset;
      return this;
    }

    /**
     * Set page
     *
     * @param page The page to start paginating from. If this argument is not specified, the request
     *     returns all monitors without pagination. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set pageSize
     *
     * @param pageSize The number of monitors to return per page. If the page argument is not
     *     specified, the default behavior returns all monitors without a &#x60;page_size&#x60;
     *     limit. However, if page is specified and &#x60;page_size&#x60; is not, the argument
     *     defaults to 100. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * Get all monitor details
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @return List&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Monitor> listMonitors() throws ApiException {
    return listMonitorsWithHttpInfo(new ListMonitorsOptionalParameters()).getData();
  }

  /**
   * Get all monitor details
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;List&lt;Monitor&gt;&gt;
   */
  public CompletableFuture<List<Monitor>> listMonitorsAsync() {
    return listMonitorsWithHttpInfoAsync(new ListMonitorsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all monitor details
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return List&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Monitor> listMonitors(ListMonitorsOptionalParameters parameters) throws ApiException {
    return listMonitorsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all monitor details
   *
   * <p>See {@link #listMonitorsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;List&lt;Monitor&gt;&gt;
   */
  public CompletableFuture<List<Monitor>> listMonitorsAsync(
      ListMonitorsOptionalParameters parameters) {
    return listMonitorsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all monitor details
   *
   * <p>Get details about the specified monitor from your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
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
  public ApiResponse<List<Monitor>> listMonitorsWithHttpInfo(
      ListMonitorsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String groupStates = parameters.groupStates;
    String name = parameters.name;
    String tags = parameters.tags;
    String monitorTags = parameters.monitorTags;
    Boolean withDowntimes = parameters.withDowntimes;
    Long idOffset = parameters.idOffset;
    Long page = parameters.page;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tags", monitorTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", withDowntimes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id_offset", idOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.listMonitors",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<List<Monitor>>() {});
  }

  /**
   * Get all monitor details
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;Monitor&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<Monitor>>> listMonitorsWithHttpInfoAsync(
      ListMonitorsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String groupStates = parameters.groupStates;
    String name = parameters.name;
    String tags = parameters.tags;
    String monitorTags = parameters.monitorTags;
    Boolean withDowntimes = parameters.withDowntimes;
    Long idOffset = parameters.idOffset;
    Long page = parameters.page;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v1/monitor";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tags", monitorTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", withDowntimes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id_offset", idOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listMonitors");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.listMonitors",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<Monitor>>> result = new CompletableFuture<>();
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
        new GenericType<List<Monitor>>() {});
  }

  /** Manage optional parameters to searchMonitorGroups. */
  public static class SearchMonitorGroupsOptionalParameters {
    private String query;
    private Long page;
    private Long perPage;
    private String sort;

    /**
     * Set query
     *
     * @param query After entering a search query in your [Manage Monitor page][1] use the query
     *     parameter value in the URL of the page as value for this parameter. Consult the dedicated
     *     [manage monitor documentation][2] page to learn more. The query can contain any number of
     *     space-separated monitor attributes, for instance &#x60;query&#x3D;\&quot;type:metric
     *     status:alert\&quot;&#x60;. [1]: https://app.datadoghq.com/monitors/manage [2]:
     *     /monitors/manage/#find-the-monitors (optional)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set page
     *
     * @param page Page to start paginating from. (optional, default to 0)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set perPage
     *
     * @param perPage Number of monitors to return per page. (optional, default to 30)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters perPage(Long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort String for sort order, composed of field and sort order separate by a comma, for
     *     example &#x60;name,asc&#x60;. Supported sort directions: &#x60;asc&#x60;,
     *     &#x60;desc&#x60;. Supported fields: * &#x60;name&#x60; * &#x60;status&#x60; *
     *     &#x60;tags&#x60; (optional)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Monitors group search
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfo}.
   *
   * @return MonitorGroupSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorGroupSearchResponse searchMonitorGroups() throws ApiException {
    return searchMonitorGroupsWithHttpInfo(new SearchMonitorGroupsOptionalParameters()).getData();
  }

  /**
   * Monitors group search
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;MonitorGroupSearchResponse&gt;
   */
  public CompletableFuture<MonitorGroupSearchResponse> searchMonitorGroupsAsync() {
    return searchMonitorGroupsWithHttpInfoAsync(new SearchMonitorGroupsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Monitors group search
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return MonitorGroupSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorGroupSearchResponse searchMonitorGroups(
      SearchMonitorGroupsOptionalParameters parameters) throws ApiException {
    return searchMonitorGroupsWithHttpInfo(parameters).getData();
  }

  /**
   * Monitors group search
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonitorGroupSearchResponse&gt;
   */
  public CompletableFuture<MonitorGroupSearchResponse> searchMonitorGroupsAsync(
      SearchMonitorGroupsOptionalParameters parameters) {
    return searchMonitorGroupsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Monitors group search
   *
   * <p>Search and filter your monitor groups details.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonitorGroupSearchResponse&gt;
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
  public ApiResponse<MonitorGroupSearchResponse> searchMonitorGroupsWithHttpInfo(
      SearchMonitorGroupsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long page = parameters.page;
    Long perPage = parameters.perPage;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monitor/groups/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.searchMonitorGroups",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MonitorGroupSearchResponse>() {});
  }

  /**
   * Monitors group search
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorGroupSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorGroupSearchResponse>>
      searchMonitorGroupsWithHttpInfoAsync(SearchMonitorGroupsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long page = parameters.page;
    Long perPage = parameters.perPage;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monitor/groups/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "searchMonitorGroups");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.searchMonitorGroups",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorGroupSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<MonitorGroupSearchResponse>() {});
  }

  /** Manage optional parameters to searchMonitors. */
  public static class SearchMonitorsOptionalParameters {
    private String query;
    private Long page;
    private Long perPage;
    private String sort;

    /**
     * Set query
     *
     * @param query After entering a search query in your [Manage Monitor page][1] use the query
     *     parameter value in the URL of the page as value for this parameter. Consult the dedicated
     *     [manage monitor documentation][2] page to learn more. The query can contain any number of
     *     space-separated monitor attributes, for instance &#x60;query&#x3D;\&quot;type:metric
     *     status:alert\&quot;&#x60;. [1]: https://app.datadoghq.com/monitors/manage [2]:
     *     /monitors/manage/#find-the-monitors (optional)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set page
     *
     * @param page Page to start paginating from. (optional, default to 0)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set perPage
     *
     * @param perPage Number of monitors to return per page. (optional, default to 30)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters perPage(Long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort String for sort order, composed of field and sort order separate by a comma, for
     *     example &#x60;name,asc&#x60;. Supported sort directions: &#x60;asc&#x60;,
     *     &#x60;desc&#x60;. Supported fields: * &#x60;name&#x60; * &#x60;status&#x60; *
     *     &#x60;tags&#x60; (optional)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Monitors search
   *
   * <p>See {@link #searchMonitorsWithHttpInfo}.
   *
   * @return MonitorSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorSearchResponse searchMonitors() throws ApiException {
    return searchMonitorsWithHttpInfo(new SearchMonitorsOptionalParameters()).getData();
  }

  /**
   * Monitors search
   *
   * <p>See {@link #searchMonitorsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;MonitorSearchResponse&gt;
   */
  public CompletableFuture<MonitorSearchResponse> searchMonitorsAsync() {
    return searchMonitorsWithHttpInfoAsync(new SearchMonitorsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Monitors search
   *
   * <p>See {@link #searchMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return MonitorSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MonitorSearchResponse searchMonitors(SearchMonitorsOptionalParameters parameters)
      throws ApiException {
    return searchMonitorsWithHttpInfo(parameters).getData();
  }

  /**
   * Monitors search
   *
   * <p>See {@link #searchMonitorsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MonitorSearchResponse&gt;
   */
  public CompletableFuture<MonitorSearchResponse> searchMonitorsAsync(
      SearchMonitorsOptionalParameters parameters) {
    return searchMonitorsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Monitors search
   *
   * <p>Search and filter your monitors details.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MonitorSearchResponse&gt;
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
  public ApiResponse<MonitorSearchResponse> searchMonitorsWithHttpInfo(
      SearchMonitorsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long page = parameters.page;
    Long perPage = parameters.perPage;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monitor/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.searchMonitors",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MonitorSearchResponse>() {});
  }

  /**
   * Monitors search
   *
   * <p>See {@link #searchMonitorsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MonitorSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MonitorSearchResponse>> searchMonitorsWithHttpInfoAsync(
      SearchMonitorsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long page = parameters.page;
    Long perPage = parameters.perPage;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/monitor/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "searchMonitors");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.searchMonitors",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MonitorSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<MonitorSearchResponse>() {});
  }

  /**
   * Edit a monitor
   *
   * <p>See {@link #updateMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   */
  public Monitor updateMonitor(Long monitorId, MonitorUpdateRequest body) throws ApiException {
    return updateMonitorWithHttpInfo(monitorId, body).getData();
  }

  /**
   * Edit a monitor
   *
   * <p>See {@link #updateMonitorWithHttpInfoAsync}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return CompletableFuture&lt;Monitor&gt;
   */
  public CompletableFuture<Monitor> updateMonitorAsync(Long monitorId, MonitorUpdateRequest body) {
    return updateMonitorWithHttpInfoAsync(monitorId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a monitor
   *
   * <p>Edit the specified monitor.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Monitor> updateMonitorWithHttpInfo(Long monitorId, MonitorUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling updateMonitor");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.updateMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Monitor>() {});
  }

  /**
   * Edit a monitor
   *
   * <p>See {@link #updateMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Monitor&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Monitor>> updateMonitorWithHttpInfoAsync(
      Long monitorId, MonitorUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'monitorId' when calling updateMonitor"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.updateMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Monitor>> result = new CompletableFuture<>();
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
        new GenericType<Monitor>() {});
  }

  /**
   * Validate a monitor
   *
   * <p>See {@link #validateMonitorWithHttpInfo}.
   *
   * @param body Monitor request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object validateMonitor(Monitor body) throws ApiException {
    return validateMonitorWithHttpInfo(body).getData();
  }

  /**
   * Validate a monitor
   *
   * <p>See {@link #validateMonitorWithHttpInfoAsync}.
   *
   * @param body Monitor request object (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> validateMonitorAsync(Monitor body) {
    return validateMonitorWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Validate a monitor
   *
   * <p>Validate the monitor provided in the request.
   *
   * @param body Monitor request object (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> validateMonitorWithHttpInfo(Monitor body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateMonitor");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "MonitorsApi.validateMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Validate a monitor
   *
   * <p>See {@link #validateMonitorWithHttpInfo}.
   *
   * @param body Monitor request object (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> validateMonitorWithHttpInfoAsync(Monitor body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling validateMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/validate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "validateMonitor");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "MonitorsApi.validateMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
