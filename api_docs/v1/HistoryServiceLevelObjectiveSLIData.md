

# HistoryServiceLevelObjectiveSLIData

An object that holds an SLI value and its associated data. It can represent an SLO's overall SLI value or the SLI value for a specific monitor (in multi-monitor SLOs) or group (in grouped SLOs). The uptime history is included for monitor SLOs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**history** | [**List&lt;List&lt;Double&gt;&gt;**](List.md) | For &#x60;monitor&#x60; based SLOs, this includes the aggregated history uptime time series. |  [optional]
**name** | **String** | For groups in a grouped SLO this is the group name. For monitors in a multi-monitor SLO this is the monitor name. |  [optional]
**precision** | **Map&lt;String, Double&gt;** | A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the from &amp;&amp; to timestamp. |  [optional]
**preview** | **Boolean** | For &#x60;monitor&#x60; based SLOs when &#x60;true&#x60; this indicates that a replay is in progress to give an accurate uptime calculation. |  [optional]
**sliValue** | **Double** | The current SLI value of the SLO over the history window. |  [optional]
**spanPrecision** | **Double** | The amount of decimal places the SLI value is accurate to for the given from and to timestamp. |  [optional]
**uptime** | **Double** | Deprecated. Use &#x60;sli_value&#x60; instead. |  [optional]



