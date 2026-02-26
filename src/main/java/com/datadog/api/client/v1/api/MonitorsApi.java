package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.CheckCanDeleteMonitorResponse;
import com.datadog.api.client.v1.model.DeletedMonitor;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorGroupSearchResponse;
import com.datadog.api.client.v1.model.MonitorSearchResponse;
import com.datadog.api.client.v1.model.MonitorUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorsApi {
  private ApiClient apiClient;

  public MonitorsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public MonitorsApi(ApiClient apiClient) {
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
   * Check if a monitor can be deleted.
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
   * Check if a monitor can be deleted.
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
   * Check if the given monitors can be deleted.
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
            "v1.MonitorsApi.checkCanDeleteMonitor",
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
        new GenericType<CheckCanDeleteMonitorResponse>() {});
  }

  /**
   * Check if a monitor can be deleted.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.checkCanDeleteMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Create a monitor.
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
   * Create a monitor.
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
   * Create a monitor using the specified options.
   *
   * <h3>Monitor Types</h3>
   *
   * <p>The type of monitor chosen from:
   *
   * <ul>
   *   <li>anomaly: <code>query alert</code>
   *   <li>APM: <code>query alert</code> or <code>trace-analytics alert</code>
   *   <li>composite: <code>composite</code>
   *   <li>custom: <code>service check</code>
   *   <li>forecast: <code>query alert</code>
   *   <li>host: <code>service check</code>
   *   <li>integration: <code>query alert</code> or <code>service check</code>
   *   <li>live process: <code>process alert</code>
   *   <li>logs: <code>log alert</code>
   *   <li>metric: <code>query alert</code>
   *   <li>network: <code>service check</code>
   *   <li>outlier: <code>query alert</code>
   *   <li>process: <code>service check</code>
   *   <li>rum: <code>rum alert</code>
   *   <li>SLO: <code>slo alert</code>
   *   <li>watchdog: <code>event-v2 alert</code>
   *   <li>event-v2: <code>event-v2 alert</code>
   *   <li>audit: <code>audit alert</code>
   *   <li>error-tracking: <code>error-tracking alert</code>
   *   <li>database-monitoring: <code>database-monitoring alert</code>
   *   <li>network-performance: <code>network-performance alert</code>
   *   <li>cloud cost: <code>cost alert</code>
   *   <li>network-path: <code>network-path alert</code>
   * </ul>
   *
   * <p><strong>Notes</strong>: - Synthetic monitors are created through the Synthetics API. See the
   * <a href="https://docs.datadoghq.com/api/latest/synthetics/">Synthetics API</a> documentation
   * for more information. - Log monitors require an unscoped App Key.
   *
   * <h3>Query Types</h3>
   *
   * <h4>Metric Alert Query</h4>
   *
   * <p>Example: <code>time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator #</code>
   *
   * <ul>
   *   <li><code>time_aggr</code>: avg, sum, max, min, change, or pct_change
   *   <li><code>time_window</code>: <code>last_#m</code> (with <code>#</code> between 1 and 10080
   *       depending on the monitor type) or <code>last_#h</code>(with <code>#</code> between 1 and
   *       168 depending on the monitor type) or <code>last_1d</code>, or <code>last_1w</code>
   *   <li><code>space_aggr</code>: avg, sum, min, or max
   *   <li><code>tags</code>: one or more tags (comma-separated), or *
   *   <li><code>key</code>: a 'key' in key:value tag syntax; defines a separate alert for each tag
   *       in the group (multi-alert)
   *   <li><code>operator</code>: &lt;, &lt;=, &gt;, &gt;=, ==, or !=
   *   <li><code>#</code>: an integer or decimal number used to set the threshold
   * </ul>
   *
   * <p>If you are using the <code>_change_</code> or <code>_pct_change_</code> time aggregator,
   * instead use <code>change_aggr(time_aggr(time_window),
   * timeshift):space_aggr:metric{tags} [by {key}] operator #</code> with:
   *
   * <ul>
   *   <li><code>change_aggr</code> change, pct_change
   *   <li><code>time_aggr</code> avg, sum, max, min <a
   *       href="https://docs.datadoghq.com/monitors/create/types/#define-the-conditions">Learn
   *       more</a>
   *   <li><code>time_window</code> last_#m (between 1 and 2880 depending on the monitor type),
   *       last_#h (between 1 and 48 depending on the monitor type), or last_#d (1 or 2)
   *   <li><code>timeshift</code> #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago
   * </ul>
   *
   * <p>Use this to create an outlier monitor using the following query: <code>
   * avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host}, 'dbscan', 7) &gt; 0
   * </code>
   *
   * <h4>Service Check Query</h4>
   *
   * <p>Example: <code>"check".over(tags).last(count).by(group).count_by_status()</code>
   *
   * <ul>
   *   <li><code>check</code> name of the check, for example <code>datadog.agent.up</code>
   *   <li><code>tags</code> one or more quoted tags (comma-separated), or "*". for example: <code>
   *       .over("env:prod", "role:db")</code>; <code>over</code> cannot be blank.
   *   <li><code>count</code> must be at greater than or equal to your max threshold (defined in the
   *       <code>options</code>). It is limited to 100. For example, if you've specified to notify
   *       on 1 critical, 3 ok, and 2 warn statuses, <code>count</code> should be at least 3.
   *   <li><code>group</code> must be specified for check monitors. Per-check grouping is already
   *       explicitly known for some service checks. For example, Postgres integration monitors are
   *       tagged by <code>db</code>, <code>host</code>, and <code>port</code>, and Network monitors
   *       by <code>host</code>, <code>instance</code>, and <code>url</code>. See <a
   *       href="https://docs.datadoghq.com/api/latest/service-checks/">Service Checks</a>
   *       documentation for more information.
   * </ul>
   *
   * <h4>Event Alert Query</h4>
   *
   * <p><strong>Note:</strong> The Event Alert Query has been replaced by the Event V2 Alert Query.
   * For more information, see the <a
   * href="https://docs.datadoghq.com/service_management/events/guides/migrating_to_new_events_features/">Event
   * Migration guide</a>.
   *
   * <h4>Event V2 Alert Query</h4>
   *
   * <p>Example: <code>events(query).rollup(rollup_method[, measure]).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code> and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <h4>Process Alert Query</h4>
   *
   * <p>Example: <code>processes(search).over(tags).rollup('count').last(timeframe) operator #
   * </code>
   *
   * <ul>
   *   <li><code>search</code> free text search string for querying processes. Matching processes
   *       match results on the <a
   *       href="https://docs.datadoghq.com/infrastructure/process/?tab=linuxwindows">Live
   *       Processes</a> page.
   *   <li><code>tags</code> one or more tags (comma-separated)
   *   <li><code>timeframe</code> the timeframe to roll up the counts. Examples: 10m, 4h. Supported
   *       timeframes: s, m, h and d
   *   <li><code>operator</code> &lt;, &lt;=, &gt;, &gt;=, ==, or !=
   *   <li><code>#</code> an integer or decimal number used to set the threshold
   * </ul>
   *
   * <h4>Logs Alert Query</h4>
   *
   * <p>Example: <code>
   * logs(query).index(index_name).rollup(rollup_method[, measure]).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>index_name</code> For multi-index organizations, the log index in which the request
   *       is performed.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code> and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <h4>Composite Query</h4>
   *
   * <p>Example: <code>12345 &amp;&amp; 67890</code>, where <code>12345</code> and <code>67890
   * </code> are the IDs of non-composite monitors
   *
   * <ul>
   *   <li><code>name</code> [<em>required</em>, <em>default</em> = <strong>dynamic, based on
   *       query</strong>]: The name of the alert.
   *   <li><code>message</code> [<em>required</em>, <em>default</em> = <strong>dynamic, based on
   *       query</strong>]: A message to include with notifications for this monitor. Email
   *       notifications can be sent to specific users by using the same '@username' notation as
   *       events.
   *   <li><code>tags</code> [<em>optional</em>, <em>default</em> = <strong>empty list</strong>]: A
   *       list of tags to associate with your monitor. When getting all monitor details via the
   *       API, use the <code>monitor_tags</code> argument to filter results by these tags. It is
   *       only available via the API and isn't visible or editable in the Datadog UI.
   * </ul>
   *
   * <h4>SLO Alert Query</h4>
   *
   * <p>Example: <code>error_budget("slo_id").over("time_window") operator #</code>
   *
   * <ul>
   *   <li><code>slo_id</code>: The alphanumeric SLO ID of the SLO you are configuring the alert
   *       for.
   *   <li><code>time_window</code>: The time window of the SLO target you wish to alert on. Valid
   *       options: <code>7d</code>, <code>30d</code>, <code>90d</code>.
   *   <li><code>operator</code>: <code>&gt;=</code> or <code>&gt;</code>
   * </ul>
   *
   * <h4>Audit Alert Query</h4>
   *
   * <p>Example: <code>audits(query).rollup(rollup_method[, measure]).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code> and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <h4>CI Pipelines Alert Query</h4>
   *
   * <p>Example: <code>
   * ci-pipelines(query).rollup(rollup_method[, measure]).last(time_window) operator #</code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <h4>CI Tests Alert Query</h4>
   *
   * <p>Example: <code>ci-tests(query).rollup(rollup_method[, measure]).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <h4>Error Tracking Alert Query</h4>
   *
   * <p>"New issue" example: <code>
   * error-tracking(query).source(issue_source).new().rollup(rollup_method[, measure]).by(group_by).last(time_window) operator #
   * </code> "High impact issue" example: <code>
   * error-tracking(query).source(issue_source).impact().rollup(rollup_method[, measure]).by(group_by).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>issue_source</code> The issue source - supports <code>all</code>, <code>browser
   *       </code>, <code>mobile</code> and <code>backend</code> and defaults to <code>all</code> if
   *       omitted.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code> and defaults to <code>count</code> if omitted.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>group by</code> Comma-separated list of attributes to group by - should contain at
   *       least <code>issue.id</code>.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <p><strong>Database Monitoring Alert Query</strong>
   *
   * <p>Example: <code>
   * database-monitoring(query).rollup(rollup_method[, measure]).last(time_window) operator #</code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <p><strong>Network Performance Alert Query</strong>
   *
   * <p>Example: <code>
   * network-performance(query).rollup(rollup_method[, measure]).last(time_window) operator #</code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <p><strong>Cost Alert Query</strong>
   *
   * <p>Example: <code>formula(query).timeframe_type(time_window).function(parameter) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>timeframe_type</code> The timeframe type to evaluate the cost - for <code>forecast
   *       </code> supports <code>current</code> - for <code>change</code>, <code>anomaly</code>,
   *       <code>threshold</code> supports <code>last</code>
   *   <li><code>time_window</code> - supports daily roll-up e.g. <code>7d</code>
   *   <li><code>function</code> - [optional, defaults to <code>threshold</code> monitor if omitted]
   *       supports <code>change</code>, <code>anomaly</code>, <code>forecast</code>
   *   <li><code>parameter</code> Specify the parameter of the type
   *       <ul>
   *         <li>for <code>change</code>:
   *             <ul>
   *               <li>supports <code>relative</code>, <code>absolute</code>
   *               <li>[optional] supports <code>#</code>, where <code>#</code> is an integer or
   *                   decimal number used to set the threshold
   *             </ul>
   *         <li>for <code>anomaly</code>:
   *             <ul>
   *               <li>supports <code>direction=both</code>, <code>direction=above</code>, <code>
   *                   direction=below</code>
   *               <li>[optional] supports <code>threshold=#</code>, where <code>#</code> is an
   *                   integer or decimal number used to set the threshold
   *             </ul>
   *       </ul>
   *   <li><code>operator</code>
   *       <ul>
   *         <li>for <code>threshold</code> supports <code>&lt;</code>, <code>&lt;=</code>, <code>
   *             &gt;</code>, <code>&gt;=</code>, <code>==</code>, or <code>!=</code>
   *         <li>for <code>change</code> supports <code>&gt;</code>, <code>&lt;</code>
   *         <li>for <code>anomaly</code> supports <code>&gt;=</code>
   *         <li>for <code>forecast</code> supports <code>&gt;</code>
   *       </ul>
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
   *
   * <p><strong>Network Path Alert Query</strong>
   *
   * <p>Example: <code>
   * network-path(query).index(index_name).rollup(rollup_method[, measure]).last(time_window) operator #
   * </code>
   *
   * <ul>
   *   <li><code>query</code> The search query - following the <a
   *       href="https://docs.datadoghq.com/logs/search_syntax/">Log search syntax</a>.
   *   <li><code>index_name</code> The data type to monitor on - supports <code>netpath-path</code>
   *       and <code>netpath-hop</code>.
   *   <li><code>rollup_method</code> The stats roll-up method - supports <code>count</code>, <code>
   *       avg</code>, and <code>cardinality</code>.
   *   <li><code>measure</code> For <code>avg</code> and cardinality <code>rollup_method</code> -
   *       specify the measure or the facet name you want to use.
   *   <li><code>time_window</code> #m (between 1 and 2880), #h (between 1 and 48).
   *   <li><code>operator</code> <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code>, <code>
   *       &gt;=</code>, <code>==</code>, or <code>!=</code>.
   *   <li><code>#</code> an integer or decimal number used to set the threshold.
   * </ul>
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
            "v1.MonitorsApi.createMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Create a monitor.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.createMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
     * Set force.
     *
     * @param force Delete the monitor even if it's referenced by other resources (for example SLO,
     *     composite monitor). (optional)
     * @return DeleteMonitorOptionalParameters
     */
    public DeleteMonitorOptionalParameters force(String force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete a monitor.
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
   * Delete a monitor.
   *
   * <p>See {@link #deleteMonitorWithHttpInfoAsync}.
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
   * Delete a monitor.
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
   * Delete a monitor.
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
   * Delete the specified monitor
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
            "v1.MonitorsApi.deleteMonitor",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete a monitor.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.deleteMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
    private Boolean withDowntimes;
    private Boolean withAssets;

    /**
     * Set groupStates.
     *
     * @param groupStates When specified, shows additional information about the group states.
     *     Choose one or more from <code>all</code>, <code>alert</code>, <code>warn</code>, and
     *     <code>no data</code>. (optional)
     * @return GetMonitorOptionalParameters
     */
    public GetMonitorOptionalParameters groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }

    /**
     * Set withDowntimes.
     *
     * @param withDowntimes If this argument is set to true, then the returned data includes all
     *     current active downtimes for the monitor. (optional)
     * @return GetMonitorOptionalParameters
     */
    public GetMonitorOptionalParameters withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }

    /**
     * Set withAssets.
     *
     * @param withAssets If this argument is set to <code>true</code>, the returned data includes
     *     all assets tied to this monitor. (optional)
     * @return GetMonitorOptionalParameters
     */
    public GetMonitorOptionalParameters withAssets(Boolean withAssets) {
      this.withAssets = withAssets;
      return this;
    }
  }

  /**
   * Get a monitor&#39;s details.
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
   * Get a monitor&#39;s details.
   *
   * <p>See {@link #getMonitorWithHttpInfoAsync}.
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
   * Get a monitor&#39;s details.
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
   * Get a monitor&#39;s details.
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
   * Get details about the specified monitor from your organization.
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
    Boolean withDowntimes = parameters.withDowntimes;
    Boolean withAssets = parameters.withAssets;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", withDowntimes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_assets", withAssets));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MonitorsApi.getMonitor",
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
        new GenericType<Monitor>() {});
  }

  /**
   * Get a monitor&#39;s details.
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
    Boolean withDowntimes = parameters.withDowntimes;
    Boolean withAssets = parameters.withAssets;
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_downtimes", withDowntimes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_assets", withAssets));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.getMonitor",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
     * Set groupStates.
     *
     * @param groupStates When specified, shows additional information about the group states.
     *     Choose one or more from <code>all</code>, <code>alert</code>, <code>warn</code>, and
     *     <code>no data</code>. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters groupStates(String groupStates) {
      this.groupStates = groupStates;
      return this;
    }

    /**
     * Set name.
     *
     * @param name A string to filter monitors by name. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the
     *     list of monitors by scope. For example, <code>host:host0</code>. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set monitorTags.
     *
     * @param monitorTags A comma separated list indicating what service and/or custom tags, if any,
     *     should be used to filter the list of monitors. Tags created in the Datadog UI
     *     automatically have the service key prepended. For example, <code>service:my-app</code>.
     *     (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters monitorTags(String monitorTags) {
      this.monitorTags = monitorTags;
      return this;
    }

    /**
     * Set withDowntimes.
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
     * Set idOffset.
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
     * Set page.
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
     * Set pageSize.
     *
     * @param pageSize The number of monitors to return per page. If the page argument is not
     *     specified, the default behavior returns all monitors without a <code>page_size</code>
     *     limit. However, if page is specified and <code>page_size</code> is not, the argument
     *     defaults to 100. (optional, default to 100)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * Get all monitors.
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
   * Get all monitors.
   *
   * <p>See {@link #listMonitorsWithHttpInfoAsync}.
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
   * Get all monitors.
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
   * Get all monitors.
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
   * Get all monitors.
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Monitor&gt;
   */
  public PaginationIterable<Monitor> listMonitorsWithPagination() {
    ListMonitorsOptionalParameters parameters = new ListMonitorsOptionalParameters();
    return listMonitorsWithPagination(parameters);
  }

  /**
   * Get all monitors.
   *
   * <p>See {@link #listMonitorsWithHttpInfo}.
   *
   * @return List&lt;Monitor&gt;
   */
  public PaginationIterable<Monitor> listMonitorsWithPagination(
      ListMonitorsOptionalParameters parameters) {
    String resultsPath = "";
    String valueGetterPath = "";
    String valueSetterPath = "page";
    Boolean valueSetterParamOptional = true;
    parameters.page(0l);
    Integer limit;

    if (parameters.pageSize == null) {
      limit = 100;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listMonitors",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Get all monitors from your organization.
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
            "v1.MonitorsApi.listMonitors",
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
        new GenericType<List<Monitor>>() {});
  }

  /**
   * Get all monitors.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.listMonitors",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
     * Set query.
     *
     * @param query After entering a search query on the <a
     *     href="https://app.datadoghq.com/monitors/triggered">Triggered Monitors page</a>, use the
     *     query parameter value in the URL of the page as a value for this parameter. For more
     *     information, see the <a href="/monitors/manage/#triggered-monitors">Manage Monitors
     *     documentation</a>. The query can contain any number of space-separated monitor
     *     attributes, for instance: <code>query="type:metric group_status:alert"</code>. (optional)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set page.
     *
     * @param page Page to start paginating from. (optional, default to 0)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set perPage.
     *
     * @param perPage Number of monitors to return per page. (optional, default to 30)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters perPage(Long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort String for sort order, composed of field and sort order separate by a comma, for
     *     example <code>name,asc</code>. Supported sort directions: <code>asc</code>, <code>desc
     *     </code>. Supported fields:
     *     <ul>
     *       <li><code>name</code>
     *       <li><code>status</code>
     *       <li><code>tags</code>
     *     </ul>
     *     (optional)
     * @return SearchMonitorGroupsOptionalParameters
     */
    public SearchMonitorGroupsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Monitors group search.
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
   * Monitors group search.
   *
   * <p>See {@link #searchMonitorGroupsWithHttpInfoAsync}.
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
   * Monitors group search.
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
   * Monitors group search.
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
   * Search and filter your monitor groups details.
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
            "v1.MonitorsApi.searchMonitorGroups",
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
        new GenericType<MonitorGroupSearchResponse>() {});
  }

  /**
   * Monitors group search.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.searchMonitorGroups",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
     * Set query.
     *
     * @param query After entering a search query in your <a
     *     href="https://app.datadoghq.com/monitors/manage">Manage Monitor page</a> use the query
     *     parameter value in the URL of the page as value for this parameter. Consult the dedicated
     *     <a href="/monitors/manage/#find-the-monitors">manage monitor documentation</a> page to
     *     learn more. The query can contain any number of space-separated monitor attributes, for
     *     instance <code>query="type:metric status:alert"</code>. (optional)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set page.
     *
     * @param page Page to start paginating from. (optional, default to 0)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }

    /**
     * Set perPage.
     *
     * @param perPage Number of monitors to return per page. (optional, default to 30)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters perPage(Long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort String for sort order, composed of field and sort order separate by a comma, for
     *     example <code>name,asc</code>. Supported sort directions: <code>asc</code>, <code>desc
     *     </code>. Supported fields:
     *     <ul>
     *       <li><code>name</code>
     *       <li><code>status</code>
     *       <li><code>tags</code>
     *     </ul>
     *     (optional)
     * @return SearchMonitorsOptionalParameters
     */
    public SearchMonitorsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * Monitors search.
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
   * Monitors search.
   *
   * <p>See {@link #searchMonitorsWithHttpInfoAsync}.
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
   * Monitors search.
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
   * Monitors search.
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
   * Search and filter your monitors details.
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
            "v1.MonitorsApi.searchMonitors",
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
        new GenericType<MonitorSearchResponse>() {});
  }

  /**
   * Monitors search.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.searchMonitors",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Edit a monitor.
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
   * Edit a monitor.
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
   * Edit the specified monitor.
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
            "v1.MonitorsApi.updateMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Edit a monitor.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.updateMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Validate an existing monitor.
   *
   * <p>See {@link #validateExistingMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param body Monitor request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object validateExistingMonitor(Long monitorId, Monitor body) throws ApiException {
    return validateExistingMonitorWithHttpInfo(monitorId, body).getData();
  }

  /**
   * Validate an existing monitor.
   *
   * <p>See {@link #validateExistingMonitorWithHttpInfoAsync}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param body Monitor request object (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> validateExistingMonitorAsync(Long monitorId, Monitor body) {
    return validateExistingMonitorWithHttpInfoAsync(monitorId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Validate the monitor provided in the request.
   *
   * @param monitorId The ID of the monitor (required)
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
  public ApiResponse<Object> validateExistingMonitorWithHttpInfo(Long monitorId, Monitor body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'monitorId' when calling validateExistingMonitor");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateExistingMonitor");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}/validate"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.MonitorsApi.validateExistingMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Validate an existing monitor.
   *
   * <p>See {@link #validateExistingMonitorWithHttpInfo}.
   *
   * @param monitorId The ID of the monitor (required)
   * @param body Monitor request object (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> validateExistingMonitorWithHttpInfoAsync(
      Long monitorId, Monitor body) {
    Object localVarPostBody = body;

    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'monitorId' when calling validateExistingMonitor"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling validateExistingMonitor"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/monitor/{monitor_id}/validate"
            .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.validateExistingMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /**
   * Validate a monitor.
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
   * Validate a monitor.
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
   * Validate the monitor provided in the request.
   *
   * <p><strong>Note</strong>: Log monitors require an unscoped App Key.
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
            "v1.MonitorsApi.validateMonitor",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Validate a monitor.
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

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.MonitorsApi.validateMonitor",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
