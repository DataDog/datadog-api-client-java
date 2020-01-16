

# HistoryServiceLevelObjectiveResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTs** | **Long** | the &#x60;from&#x60; timestamp in epoch seconds |  [optional]
**groups** | [**HistoryServiceLevelObjectiveGroups**](HistoryServiceLevelObjectiveGroups.md) |  |  [optional]
**overall** | [**HistoryServiceLevelObjectiveOverall**](HistoryServiceLevelObjectiveOverall.md) |  |  [optional]
**series** | [**HistoryServiceLevelObjectiveMetrics**](HistoryServiceLevelObjectiveMetrics.md) |  |  [optional]
**thresholds** | [**Map&lt;String, SLOThreshold&gt;**](SLOThreshold.md) | mapping of string timeframe to the SLO threshold. |  [optional]
**toTs** | **Long** | the &#x60;to&#x60; timestamp in epoch seconds |  [optional]



