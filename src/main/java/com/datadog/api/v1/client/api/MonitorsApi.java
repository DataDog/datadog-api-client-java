package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.CheckCanDeleteMonitorResponse;
import com.datadog.api.v1.client.model.DeletedMonitor;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorUpdateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  /**
   * Check if a monitor can be deleted Check if the given monitors can be deleted.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return CheckCanDeleteMonitorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Deletion conflict error </td><td>  -  </td></tr>
   *     </table>
   */
  public CheckCanDeleteMonitorResponse checkCanDeleteMonitor(List<Long> monitorIds)
      throws ApiException {
    return checkCanDeleteMonitorWithHttpInfo(monitorIds).getData();
  }

  /**
   * Check if a monitor can be deleted Check if the given monitors can be deleted.
   *
   * @param monitorIds The IDs of the monitor to check. (required)
   * @return ApiResponse&lt;CheckCanDeleteMonitorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Deletion conflict error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "monitor_ids", monitorIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CheckCanDeleteMonitorResponse> localVarReturnType =
        new GenericType<CheckCanDeleteMonitorResponse>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.checkCanDeleteMonitor",
        localVarPath,
        "GET",
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

  /**
   * Create a monitor Create a monitor using the specified options. #### Monitor Types The type of
   * monitor chosen from: - anomaly: &#x60;query alert&#x60; - APM: &#x60;query alert&#x60; or
   * &#x60;trace-analytics alert&#x60; - composite: &#x60;composite&#x60; - custom: &#x60;service
   * check&#x60; - event: &#x60;event alert&#x60; - forecast: &#x60;query alert&#x60; - host:
   * &#x60;service check&#x60; - integration: &#x60;query alert&#x60; or &#x60;service check&#x60; -
   * live process: &#x60;process alert&#x60; - logs: &#x60;log alert&#x60; - metric: &#x60;metric
   * alert&#x60; - network: &#x60;service check&#x60; - outlier: &#x60;query alert&#x60; - process:
   * &#x60;service check&#x60; - rum: &#x60;rum alert&#x60; - SLO: &#x60;slo alert&#x60; - watchdog:
   * &#x60;event alert&#x60; - event-v2: &#x60;event-v2 alert&#x60; #### Query Types **Metric Alert
   * Query** Example: &#x60;time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator
   * #&#x60; - &#x60;time_aggr&#x60;: avg, sum, max, min, change, or pct_change -
   * &#x60;time_window&#x60;: &#x60;last_#m&#x60; (with &#x60;#&#x60; between 1 and 2880 depending
   * on the monitor type) or &#x60;last_#h&#x60;(with &#x60;#&#x60; between 1 and 48 depending on
   * the monitor type), or &#x60;last_1d&#x60; - &#x60;space_aggr&#x60;: avg, sum, min, or max -
   * &#x60;tags&#x60;: one or more tags (comma-separated), or * - &#x60;key&#x60;: a &#39;key&#39;
   * in key:value tag syntax; defines a separate alert for each tag in the group (multi-alert) -
   * &#x60;operator&#x60;: &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;&#x3D;, or !&#x3D; -
   * &#x60;#&#x60;: an integer or decimal number used to set the threshold If you are using the
   * &#x60;_change_&#x60; or &#x60;_pct_change_&#x60; time aggregator, instead use
   * &#x60;change_aggr(time_aggr(time_window), timeshift):space_aggr:metric{tags} [by {key}]
   * operator #&#x60; with: - &#x60;change_aggr&#x60; change, pct_change - &#x60;time_aggr&#x60;
   * avg, sum, max, min [Learn
   * more](https://docs.datadoghq.com/monitors/monitor_types/#define-the-conditions) -
   * &#x60;time_window&#x60; last\\_#m (between 1 and 2880 depending on the monitor type), last\\_#h
   * (between 1 and 48 depending on the monitor type), or last_#d (1 or 2) - &#x60;timeshift&#x60;
   * #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago Use this to create an outlier monitor
   * using the following query:
   * &#x60;avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host},
   * &#39;dbscan&#39;, 7) &gt; 0&#x60; **Service Check Query** Example:
   * &#x60;\&quot;check\&quot;.over(tags).last(count).count_by_status()&#x60; -
   * **&#x60;check&#x60;** name of the check, e.g. &#x60;datadog.agent.up&#x60; -
   * **&#x60;tags&#x60;** one or more quoted tags (comma-separated), or \&quot;*\&quot;. e.g.:
   * &#x60;.over(\&quot;env:prod\&quot;, \&quot;role:db\&quot;)&#x60; - **&#x60;count&#x60;** must
   * be at greater than or equal to your max threshold (defined in the &#x60;options&#x60;). It is
   * limited to 100. For example, if you&#39;ve specified to notify on 1 critical, 3 ok, and 2 warn
   * statuses, &#x60;count&#x60; should be 3. **Event Alert Query** Example:
   * &#x60;events(&#39;sources:nagios status:error,warning priority:normal tags: \&quot;string
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
   * exceed 48 hours. **NOTE** Only available on US1 and EU. **Event V2 Alert Query** Example:
   * &#x60;events(query).rollup(rollup_method[, measure]).last(time_window) operator #&#x60; -
   * **&#x60;query&#x60;** The search query - following the [Log search
   * syntax](https://docs.datadoghq.com/logs/search_syntax/). - **&#x60;rollup_method&#x60;** The
   * stats roll-up method - supports &#x60;count&#x60;, &#x60;avg&#x60; and &#x60;cardinality&#x60;.
   * - **&#x60;measure&#x60;** For &#x60;avg&#x60; and cardinality &#x60;rollup_method&#x60; -
   * specify the measure or the facet name you want to use. - **&#x60;time_window&#x60;** #m (5, 10,
   * 15, or 30), #h (1, 2, or 4, 24). - **&#x60;operator&#x60;** &#x60;&lt;&#x60;,
   * &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or
   * &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;** an integer or decimal number used to set the
   * threshold. **NOTE** Only available on US1-FED, US3, and in closed beta on EU and US1. **Process
   * Alert Query** Example:
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
   * - **&#x60;time_window&#x60;** #m (between 1 and 2880), #h (between 1 and 48) -
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
   * &#x60;&gt;&#x3D;&#x60; or &#x60;&gt;&#x60;
   *
   * @param body Create a monitor request body. (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public Monitor createMonitor(Monitor body) throws ApiException {
    return createMonitorWithHttpInfo(body).getData();
  }

  /**
   * Create a monitor Create a monitor using the specified options. #### Monitor Types The type of
   * monitor chosen from: - anomaly: &#x60;query alert&#x60; - APM: &#x60;query alert&#x60; or
   * &#x60;trace-analytics alert&#x60; - composite: &#x60;composite&#x60; - custom: &#x60;service
   * check&#x60; - event: &#x60;event alert&#x60; - forecast: &#x60;query alert&#x60; - host:
   * &#x60;service check&#x60; - integration: &#x60;query alert&#x60; or &#x60;service check&#x60; -
   * live process: &#x60;process alert&#x60; - logs: &#x60;log alert&#x60; - metric: &#x60;metric
   * alert&#x60; - network: &#x60;service check&#x60; - outlier: &#x60;query alert&#x60; - process:
   * &#x60;service check&#x60; - rum: &#x60;rum alert&#x60; - SLO: &#x60;slo alert&#x60; - watchdog:
   * &#x60;event alert&#x60; - event-v2: &#x60;event-v2 alert&#x60; #### Query Types **Metric Alert
   * Query** Example: &#x60;time_aggr(time_window):space_aggr:metric{tags} [by {key}] operator
   * #&#x60; - &#x60;time_aggr&#x60;: avg, sum, max, min, change, or pct_change -
   * &#x60;time_window&#x60;: &#x60;last_#m&#x60; (with &#x60;#&#x60; between 1 and 2880 depending
   * on the monitor type) or &#x60;last_#h&#x60;(with &#x60;#&#x60; between 1 and 48 depending on
   * the monitor type), or &#x60;last_1d&#x60; - &#x60;space_aggr&#x60;: avg, sum, min, or max -
   * &#x60;tags&#x60;: one or more tags (comma-separated), or * - &#x60;key&#x60;: a &#39;key&#39;
   * in key:value tag syntax; defines a separate alert for each tag in the group (multi-alert) -
   * &#x60;operator&#x60;: &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;&#x3D;, or !&#x3D; -
   * &#x60;#&#x60;: an integer or decimal number used to set the threshold If you are using the
   * &#x60;_change_&#x60; or &#x60;_pct_change_&#x60; time aggregator, instead use
   * &#x60;change_aggr(time_aggr(time_window), timeshift):space_aggr:metric{tags} [by {key}]
   * operator #&#x60; with: - &#x60;change_aggr&#x60; change, pct_change - &#x60;time_aggr&#x60;
   * avg, sum, max, min [Learn
   * more](https://docs.datadoghq.com/monitors/monitor_types/#define-the-conditions) -
   * &#x60;time_window&#x60; last\\_#m (between 1 and 2880 depending on the monitor type), last\\_#h
   * (between 1 and 48 depending on the monitor type), or last_#d (1 or 2) - &#x60;timeshift&#x60;
   * #m_ago (5, 10, 15, or 30), #h_ago (1, 2, or 4), or 1d_ago Use this to create an outlier monitor
   * using the following query:
   * &#x60;avg(last_30m):outliers(avg:system.cpu.user{role:es-events-data} by {host},
   * &#39;dbscan&#39;, 7) &gt; 0&#x60; **Service Check Query** Example:
   * &#x60;\&quot;check\&quot;.over(tags).last(count).count_by_status()&#x60; -
   * **&#x60;check&#x60;** name of the check, e.g. &#x60;datadog.agent.up&#x60; -
   * **&#x60;tags&#x60;** one or more quoted tags (comma-separated), or \&quot;*\&quot;. e.g.:
   * &#x60;.over(\&quot;env:prod\&quot;, \&quot;role:db\&quot;)&#x60; - **&#x60;count&#x60;** must
   * be at greater than or equal to your max threshold (defined in the &#x60;options&#x60;). It is
   * limited to 100. For example, if you&#39;ve specified to notify on 1 critical, 3 ok, and 2 warn
   * statuses, &#x60;count&#x60; should be 3. **Event Alert Query** Example:
   * &#x60;events(&#39;sources:nagios status:error,warning priority:normal tags: \&quot;string
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
   * exceed 48 hours. **NOTE** Only available on US1 and EU. **Event V2 Alert Query** Example:
   * &#x60;events(query).rollup(rollup_method[, measure]).last(time_window) operator #&#x60; -
   * **&#x60;query&#x60;** The search query - following the [Log search
   * syntax](https://docs.datadoghq.com/logs/search_syntax/). - **&#x60;rollup_method&#x60;** The
   * stats roll-up method - supports &#x60;count&#x60;, &#x60;avg&#x60; and &#x60;cardinality&#x60;.
   * - **&#x60;measure&#x60;** For &#x60;avg&#x60; and cardinality &#x60;rollup_method&#x60; -
   * specify the measure or the facet name you want to use. - **&#x60;time_window&#x60;** #m (5, 10,
   * 15, or 30), #h (1, 2, or 4, 24). - **&#x60;operator&#x60;** &#x60;&lt;&#x60;,
   * &#x60;&lt;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;&gt;&#x3D;&#x60;, &#x60;&#x3D;&#x3D;&#x60;, or
   * &#x60;!&#x3D;&#x60;. - **&#x60;#&#x60;** an integer or decimal number used to set the
   * threshold. **NOTE** Only available on US1-FED, US3, and in closed beta on EU and US1. **Process
   * Alert Query** Example:
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
   * - **&#x60;time_window&#x60;** #m (between 1 and 2880), #h (between 1 and 48) -
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
   * &#x60;&gt;&#x3D;&#x60; or &#x60;&gt;&#x60;
   *
   * @param body Create a monitor request body. (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.createMonitor",
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

  /** Manage optional parameters to deleteMonitor. */
  public static class DeleteMonitorOptionalParameters {
    private String force;

    /**
     * Set force
     *
     * @param force Delete the monitor even if it&#39;s referenced by other resources (e.g. SLO,
     *     composite monitor). (optional)
     * @return DeleteMonitorOptionalParameters
     */
    public DeleteMonitorOptionalParameters force(String force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete a monitor Delete the specified monitor
   *
   * @param monitorId The ID of the monitor. (required)
   * @return DeletedMonitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
   *     </table>
   */
  public DeletedMonitor deleteMonitor(Long monitorId) throws ApiException {
    return deleteMonitorWithHttpInfo(monitorId, new DeleteMonitorOptionalParameters()).getData();
  }

  /**
   * Delete a monitor Delete the specified monitor
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return DeletedMonitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
   *     </table>
   */
  public DeletedMonitor deleteMonitor(Long monitorId, DeleteMonitorOptionalParameters parameters)
      throws ApiException {
    return deleteMonitorWithHttpInfo(monitorId, parameters).getData();
  }

  /**
   * Delete a monitor Delete the specified monitor
   *
   * @param monitorId The ID of the monitor. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeletedMonitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item not found error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<DeletedMonitor> localVarReturnType = new GenericType<DeletedMonitor>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.deleteMonitor",
        localVarPath,
        "DELETE",
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
   * Get a monitor&#39;s details Get details about the specified monitor from your organization.
   *
   * @param monitorId The ID of the monitor (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *     </table>
   */
  public Monitor getMonitor(Long monitorId) throws ApiException {
    return getMonitorWithHttpInfo(monitorId, new GetMonitorOptionalParameters()).getData();
  }

  /**
   * Get a monitor&#39;s details Get details about the specified monitor from your organization.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *     </table>
   */
  public Monitor getMonitor(Long monitorId, GetMonitorOptionalParameters parameters)
      throws ApiException {
    return getMonitorWithHttpInfo(monitorId, parameters).getData();
  }

  /**
   * Get a monitor&#39;s details Get details about the specified monitor from your organization.
   *
   * @param monitorId The ID of the monitor (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_states", groupStates));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.getMonitor",
        localVarPath,
        "GET",
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
     *     current downtimes for each monitor. (optional)
     * @return ListMonitorsOptionalParameters
     */
    public ListMonitorsOptionalParameters withDowntimes(Boolean withDowntimes) {
      this.withDowntimes = withDowntimes;
      return this;
    }

    /**
     * Set idOffset
     *
     * @param idOffset Monitor ID offset. (optional)
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
   * Get all monitor details Get details about the specified monitor from your organization.
   *
   * @return List&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public List<Monitor> listMonitors() throws ApiException {
    return listMonitorsWithHttpInfo(new ListMonitorsOptionalParameters()).getData();
  }

  /**
   * Get all monitor details Get details about the specified monitor from your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return List&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public List<Monitor> listMonitors(ListMonitorsOptionalParameters parameters) throws ApiException {
    return listMonitorsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all monitor details Get details about the specified monitor from your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<Monitor>> localVarReturnType = new GenericType<List<Monitor>>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.listMonitors",
        localVarPath,
        "GET",
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

  /**
   * Edit a monitor Edit the specified monitor.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *     </table>
   */
  public Monitor updateMonitor(Long monitorId, MonitorUpdateRequest body) throws ApiException {
    return updateMonitorWithHttpInfo(monitorId, body).getData();
  }

  /**
   * Edit a monitor Edit the specified monitor.
   *
   * @param monitorId The ID of the monitor. (required)
   * @param body Edit a monitor request body. (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.updateMonitor",
        localVarPath,
        "PUT",
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

  /**
   * Validate a monitor Validate the monitor provided in the request.
   *
   * @param body Monitor request object (required)
   * @return Monitor
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public Monitor validateMonitor(Monitor body) throws ApiException {
    return validateMonitorWithHttpInfo(body).getData();
  }

  /**
   * Validate a monitor Validate the monitor provided in the request.
   *
   * @param body Monitor request object (required)
   * @return ApiResponse&lt;Monitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid JSON </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Monitor> validateMonitorWithHttpInfo(Monitor body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateMonitor");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/validate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "validateMonitor");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Monitor> localVarReturnType = new GenericType<Monitor>() {};

    return apiClient.invokeAPI(
        "MonitorsApi.validateMonitor",
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
}
