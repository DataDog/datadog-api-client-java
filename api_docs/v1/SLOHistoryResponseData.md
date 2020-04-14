

# SLOHistoryResponseData

An array of service level objective objects.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTs** | **Long** | The &#x60;from&#x60; timestamp in epoch seconds. |  [optional]
**groups** | [**SLOHistorySLIData**](SLOHistorySLIData.md) |  |  [optional]
**overall** | [**SLOHistorySLIData**](SLOHistorySLIData.md) |  |  [optional]
**series** | [**SLOHistoryMetrics**](SLOHistoryMetrics.md) |  |  [optional]
**thresholds** | [**Map&lt;String, SLOThreshold&gt;**](SLOThreshold.md) | mapping of string timeframe to the SLO threshold. |  [optional]
**toTs** | **Long** | The &#x60;to&#x60; timestamp in epoch seconds. |  [optional]
**type** | [**SLOType**](SLOType.md) |  |  [optional]
**typeId** | [**SLOTypeNumeric**](SLOTypeNumeric.md) |  |  [optional]



