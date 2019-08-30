

# Monitor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**deleted** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** | ID of this monitor |  [optional]
**message** | **String** | A message to include with notifications for this monitor. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**multi** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**options** | [**MonitorOptions**](MonitorOptions.md) |  |  [optional]
**overallState** | [**MonitorOverallStates**](MonitorOverallStates.md) |  |  [optional]
**query** | **String** |  | 
**state** | [**MonitorState**](MonitorState.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the monitor | 



## Enum: TypeEnum

Name | Value
---- | -----
QUERY_ALERT | &quot;query alert&quot;
COMPOSITE | &quot;composite&quot;
SERVICE_CHECK | &quot;service check&quot;
EVENT_ALERT | &quot;event alert&quot;
PROCESS_ALERT | &quot;process alert&quot;
LOG_ALERT | &quot;log alert&quot;
METRIC_ALERT | &quot;metric alert&quot;
SYNTHETICS_ALERT | &quot;synthetics alert&quot;



