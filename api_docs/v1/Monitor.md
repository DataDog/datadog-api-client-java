

# Monitor

Object describing a monitor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **OffsetDateTime** | Timestamp of the monitor creation. |  [optional] [readonly]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**deleted** | **OffsetDateTime** | Whether or not the monitor is deleted. (Always &#x60;null&#x60;) |  [optional] [readonly]
**id** | **Long** | ID of this monitor. |  [optional] [readonly]
**message** | **String** | A message to include with notifications for this monitor. |  [optional]
**modified** | **OffsetDateTime** | Last timestamp when the monitor was edited. |  [optional] [readonly]
**multi** | **Boolean** | Whether or not the monitor is broken down on different groups. |  [optional] [readonly]
**name** | **String** | The monitor name. |  [optional]
**options** | [**MonitorOptions**](MonitorOptions.md) |  |  [optional]
**overallState** | **MonitorOverallStates** |  |  [optional]
**priority** | **Long** | Integer from 1 (high) to 5 (low) indicating alert severity. |  [optional]
**query** | **String** | The monitor query. |  [optional]
**restrictedRoles** | **List&lt;String&gt;** | A list of role identifiers that can be pulled from the Roles API. Cannot be used with &#x60;locked&#x60; option. |  [optional]
**state** | [**MonitorState**](MonitorState.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated to your monitor. |  [optional]
**type** | **MonitorType** |  |  [optional]



