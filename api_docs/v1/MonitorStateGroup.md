

# MonitorStateGroup

Monitor state for a single group.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastDataTs** | **Long** | Lastest data timestamp for this monitor group. |  [optional]
**lastNodataTs** | **Long** | TODO. |  [optional]
**lastNotifiedTs** | **Long** | Timestamp of the last notification sent for this monitor group. |  [optional]
**lastResolvedTs** | **Long** | Lastest timestamp the monitor group was resolved. |  [optional]
**lastTriggeredTs** | **Long** | Last timestamp the monitor group triggered. |  [optional]
**message** | **String** | A message to include with notifications for this monitor. Email notifications can be sent to specific users by using the same ‘@username’ notation as events. |  [optional]
**name** | **String** | The name of the monitor. |  [optional]
**status** | [**MonitorOverallStates**](MonitorOverallStates.md) |  |  [optional]
**triggeringValue** | [**MonitorStateGroupValue**](MonitorStateGroupValue.md) |  |  [optional]



