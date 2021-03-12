

# SLOHistoryResponseData

An array of service level objective objects.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTs** | **Long** | The &#x60;from&#x60; timestamp in epoch seconds. |  [optional]
**groupBy** | **List&lt;String&gt;** | For &#x60;metric&#x60; based SLOs where the query includes a group-by clause, this represents the list of grouping parameters.  This is not included in responses for &#x60;monitor&#x60; based SLOs. |  [optional]
**groups** | [**List&lt;SLOHistorySLIData&gt;**](SLOHistorySLIData.md) | For grouped SLOs, this represents SLI data for specific groups.  This is not included in the responses for &#x60;metric&#x60; based SLOs. |  [optional]
**monitors** | [**List&lt;SLOHistorySLIData&gt;**](SLOHistorySLIData.md) | For multi-monitor SLOs, this represents SLI data for specific monitors.  This is not included in the responses for &#x60;metric&#x60; based SLOs. |  [optional]
**overall** | [**SLOHistorySLIData**](SLOHistorySLIData.md) |  |  [optional]
**series** | [**SLOHistoryMetrics**](SLOHistoryMetrics.md) |  |  [optional]
**thresholds** | [**Map&lt;String, SLOThreshold&gt;**](SLOThreshold.md) | mapping of string timeframe to the SLO threshold. |  [optional]
**toTs** | **Long** | The &#x60;to&#x60; timestamp in epoch seconds. |  [optional]
**type** | **SLOType** |  |  [optional]
**typeId** | **SLOTypeNumeric** |  |  [optional]



