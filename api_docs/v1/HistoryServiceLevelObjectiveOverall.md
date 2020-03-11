

# HistoryServiceLevelObjectiveOverall

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**history** | [**List&lt;List&lt;Double&gt;&gt;**](List.md) | For &#x60;monitor&#x60; based SLOs, this includes the aggregated history uptime time series. |  [optional]
**name** | **String** | For &#x60;monitor&#x60; based SLOs this represents the overall group. |  [optional]
**precision** | **Map&lt;String, Double&gt;** | A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the from &amp;&amp; to timestamp. |  [optional]
**preview** | **Boolean** | For &#x60;monitor&#x60; based SLOs when &#x60;true&#x60; this indicates that a replay is in progress to give an accurate uptime calculation. |  [optional]
**spanPrecision** | **Double** | The amount of decimal places the uptime value is accurate to for the given from and to timestamp. |  [optional]
**uptime** | **Double** | The uptime value of the SLO history window. |  [optional]



