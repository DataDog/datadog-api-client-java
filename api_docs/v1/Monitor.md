

# Monitor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the monitor creation. |  [optional] [readonly]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**deleted** | [**OffsetDateTime**](OffsetDateTime.md) | Whether or not the monitor is deleted. (Always &#x60;null&#x60;) |  [optional] [readonly]
**id** | **Long** | ID of this monitor. |  [optional] [readonly]
**message** | **String** | A message to include with notifications for this monitor. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Last timestamp when the monitor was edited. |  [optional] [readonly]
**multi** | **Boolean** | Whether or not the monitor is broken down on different groups. |  [optional] [readonly]
**name** | **String** | The monitor name. |  [optional]
**options** | [**MonitorOptions**](MonitorOptions.md) |  |  [optional]
**overallState** | [**MonitorOverallStates**](MonitorOverallStates.md) |  |  [optional]
**query** | **String** |  |  [optional]
**state** | [**MonitorState**](MonitorState.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated to your monitor. |  [optional]
**type** | [**MonitorType**](MonitorType.md) |  |  [optional]



