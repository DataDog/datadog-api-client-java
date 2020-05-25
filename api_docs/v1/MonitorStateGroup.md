

# MonitorStateGroup

Monitor state for a single group.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastNodataTs** | **Long** | Latest timestamp the monitor was in NO_DATA state. |  [optional]
**lastNotifiedTs** | **Long** | Latest timestamp of the notification sent for this monitor group. |  [optional]
**lastResolvedTs** | **Long** | Latest timestamp the monitor group was resolved. |  [optional]
**lastTriggeredTs** | **Long** | Latest timestamp the monitor group triggered. |  [optional]
**name** | **String** | The name of the monitor. |  [optional]
**status** | [**MonitorOverallStates**](MonitorOverallStates.md) |  |  [optional]



