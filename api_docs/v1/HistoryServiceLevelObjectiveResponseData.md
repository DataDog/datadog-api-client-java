

# HistoryServiceLevelObjectiveResponseData

An array of service level objective objects.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTs** | **Long** | The &#x60;from&#x60; timestamp in epoch seconds. |  [optional]
**groups** | [**HistoryServiceLevelObjectiveGroups**](HistoryServiceLevelObjectiveGroups.md) |  |  [optional]
**overall** | [**HistoryServiceLevelObjectiveOverall**](HistoryServiceLevelObjectiveOverall.md) |  |  [optional]
**series** | [**HistoryServiceLevelObjectiveMetrics**](HistoryServiceLevelObjectiveMetrics.md) |  |  [optional]
**thresholds** | [**Map&lt;String, SLOThreshold&gt;**](SLOThreshold.md) | mapping of string timeframe to the SLO threshold. |  [optional]
**toTs** | **Long** | The &#x60;to&#x60; timestamp in epoch seconds. |  [optional]
**type** | [**ServiceLevelObjectiveType**](ServiceLevelObjectiveType.md) |  |  [optional]
**typeId** | [**ServiceLevelObjectiveTypeNumeric**](ServiceLevelObjectiveTypeNumeric.md) |  |  [optional]



