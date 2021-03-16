

# SLOHistorySLIData

An object that holds an SLI value and its associated data. It can represent an SLO's overall SLI value. This can also represent the SLI value for a specific monitor in multi-monitor SLOs, or a group in grouped SLOs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorBudgetRemaining** | **Map&lt;String, Double&gt;** | A mapping of threshold &#x60;timeframe&#x60; to the remaining error budget. |  [optional]
**errors** | [**List&lt;SLOHistoryResponseError&gt;**](SLOHistoryResponseError.md) | A list of errors while querying the history data for the service level objective. |  [optional]
**group** | **String** | For groups in a grouped SLO, this is the group name. |  [optional]
**history** | **List&lt;List&lt;Double&gt;&gt;** | For &#x60;monitor&#x60; based SLOs, this includes the aggregated history uptime time series. |  [optional]
**monitorModified** | **Long** | For &#x60;monitor&#x60; based SLOs, this is the last modified timestamp in epoch seconds of the monitor. |  [optional]
**monitorType** | **String** | For &#x60;monitor&#x60; based SLOs, this describes the type of monitor. |  [optional]
**name** | **String** | For groups in a grouped SLO, this is the group name. For monitors in a multi-monitor SLO, this is the monitor name. |  [optional]
**precision** | **Map&lt;String, Double&gt;** | A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the from &amp;&amp; to timestamp. |  [optional]
**preview** | **Boolean** | For &#x60;monitor&#x60; based SLOs, when &#x60;true&#x60; this indicates that a replay is in progress to give an accurate uptime calculation. |  [optional]
**sliValue** | **Double** | The current SLI value of the SLO over the history window. |  [optional]
**spanPrecision** | **Double** | The amount of decimal places the SLI value is accurate to for the given from &#x60;&amp;&amp;&#x60; to timestamp. |  [optional]
**uptime** | **Double** | Use &#x60;sli_value&#x60; instead. |  [optional]



