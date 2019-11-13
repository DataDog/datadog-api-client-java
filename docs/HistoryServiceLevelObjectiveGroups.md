

# HistoryServiceLevelObjectiveGroups

A `monitor` based SLO history for either `groups` or `monitors` depending on the type of `monitor` SLO. Ex. `single-monitor` these represent `groups`     vs `multi-monitor` which represents individual monitor's overall history
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**history** | [**List&lt;List&lt;BigDecimal&gt;&gt;**](List.md) | For &#x60;monitor&#x60; based SLOs, this includes the aggregated history uptime time series. |  [optional]
**name** | **String** | For single-monitor &#x60;monitor&#x60; based SLOs this is the &#x60;monitor group&#x60; name For multi-monitor &#x60;monitor&#x60; based SLOs this is the &#x60;monitor&#x60; name |  [optional]
**precision** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the from &amp;&amp; to timestamp. |  [optional]
**preview** | **Boolean** | For &#x60;monitor&#x60; based SLOs when &#x60;true&#x60; this indicates that a replay is in progress to give an accurate uptime calculation. |  [optional]
**spanPrecision** | [**BigDecimal**](BigDecimal.md) | The amount of decimal places the uptime value is accurate to for the given from and to timestamp. |  [optional]
**uptime** | **Float** | The uptime value of the SLO history window. |  [optional]



