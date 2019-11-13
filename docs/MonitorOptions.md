

# MonitorOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation** | **String** |  |  [optional]
**deviceIds** | [**List&lt;DeviceIdsEnum&gt;**](#List&lt;DeviceIdsEnum&gt;) |  |  [optional]
**enableLogsSample** | **Boolean** |  |  [optional]
**escalationMessage** | **String** |  |  [optional]
**evaluationDelay** | **Long** |  |  [optional]
**includeTags** | **Boolean** |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**minFailureDuration** | **Long** |  |  [optional]
**minLocationFailed** | **Long** |  |  [optional]
**newHostDelay** | **Long** |  |  [optional]
**noDataTimeframe** | **Long** |  |  [optional]
**notifyAudit** | **Boolean** |  |  [optional]
**notifyNoData** | **Boolean** |  |  [optional]
**renotifyInterval** | **Long** |  |  [optional]
**requireFullWindow** | **Boolean** |  |  [optional]
**silenced** | **Map&lt;String, Long&gt;** |  |  [optional]
**syntheticsCheckId** | **Long** |  |  [optional]
**thresholdWindows** | [**MonitorThresholdWindowOptions**](MonitorThresholdWindowOptions.md) |  |  [optional]
**thresholds** | [**MonitorThresholds**](MonitorThresholds.md) |  |  [optional]
**timeoutH** | **Integer** |  |  [optional]



## Enum: List&lt;DeviceIdsEnum&gt;

Name | Value
---- | -----
LAPTOP_LARGE | &quot;laptop_large&quot;
TABLET | &quot;tablet&quot;
MOBILE_SMALL | &quot;mobile_small&quot;



