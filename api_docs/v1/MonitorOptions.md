

# MonitorOptions

List of options associated with your monitor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation** | [**MonitorOptionsAggregation**](MonitorOptionsAggregation.md) |  |  [optional]
**deviceIds** | **List&lt;MonitorDeviceID&gt;** | IDs of the device the Synthetics monitor is running on. |  [optional] [readonly]
**enableLogsSample** | **Boolean** | Whether or not to send a log sample when the log monitor triggers. |  [optional]
**escalationMessage** | **String** | We recommend using the [is_renotify](https://docs.datadoghq.com/monitors/notifications/?tab&#x3D;is_alert#renotify), block in the original message instead. A message to include with a re-notification. Supports the &#x60;@username&#x60; notification we allow elsewhere. Not applicable if &#x60;renotify_interval&#x60; is &#x60;None&#x60;. |  [optional]
**evaluationDelay** | **Long** | Time (in seconds) to delay evaluation, as a non-negative integer. For example, if the value is set to &#x60;300&#x60; (5min), the timeframe is set to &#x60;last_5m&#x60; and the time is 7:00, the monitor evaluates data from 6:50 to 6:55. This is useful for AWS CloudWatch and other backfilled metrics to ensure the monitor always has data during evaluation. |  [optional]
**groupbySimpleMonitor** | **Boolean** | Whether the log alert monitor triggers a single alert or multiple alerts when any group breaches a threshold. |  [optional]
**includeTags** | **Boolean** | A Boolean indicating whether notifications from this monitor automatically inserts its triggering tags into the title.  **Examples** - If &#x60;True&#x60;, &#x60;[Triggered on {host:h1}] Monitor Title&#x60; - If &#x60;False&#x60;, &#x60;[Triggered] Monitor Title&#x60; |  [optional]
**locked** | **Boolean** | Whether or not the monitor is locked (only editable by creator and admins). |  [optional]
**minFailureDuration** | **Long** | How long the test should be in failure before alerting (integer, number of seconds, max 7200). |  [optional]
**minLocationFailed** | **Long** | The minimum number of locations in failure at the same time during at least one moment in the &#x60;min_failure_duration&#x60; period (&#x60;min_location_failed&#x60; and &#x60;min_failure_duration&#x60; are part of the advanced alerting rules - integer, &gt;&#x3D; 1). |  [optional]
**newHostDelay** | **Long** | Time (in seconds) to allow a host to boot and applications to fully start before starting the evaluation of monitor results. Should be a non negative integer. |  [optional]
**noDataTimeframe** | **Long** | The number of minutes before a monitor notifies after data stops reporting. Datadog recommends at least 2x the monitor timeframe for metric alerts or 2 minutes for service checks. If omitted, 2x the evaluation timeframe is used for metric alerts, and 24 hours is used for service checks. |  [optional]
**notifyAudit** | **Boolean** | A Boolean indicating whether tagged users is notified on changes to this monitor. |  [optional]
**notifyNoData** | **Boolean** | A Boolean indicating whether this monitor notifies when data stops reporting. |  [optional]
**renotifyInterval** | **Long** | The number of minutes after the last notification before a monitor re-notifies on the current status. It only re-notifies if it’s not resolved. |  [optional]
**requireFullWindow** | **Boolean** | A Boolean indicating whether this monitor needs a full window of data before it’s evaluated. We highly recommend you set this to &#x60;false&#x60; for sparse metrics, otherwise some evaluations are skipped. Default is false. |  [optional]
**silenced** | **Map&lt;String, Long&gt;** | Information about the downtime applied to the monitor. |  [optional]
**syntheticsCheckId** | **String** | ID of the corresponding Synthetic check. |  [optional]
**thresholdWindows** | [**MonitorThresholdWindowOptions**](MonitorThresholdWindowOptions.md) |  |  [optional]
**thresholds** | [**MonitorThresholds**](MonitorThresholds.md) |  |  [optional]
**timeoutH** | **Long** | The number of hours of the monitor not reporting data before it automatically resolves from a triggered state. |  [optional]



