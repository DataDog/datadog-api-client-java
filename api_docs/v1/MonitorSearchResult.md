

# MonitorSearchResult

Holds search results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **String** | Classification of the monitor. |  [optional] [readonly]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**id** | **Long** | ID of the monitor. |  [optional] [readonly]
**lastTriggeredTs** | **Long** | Latest timestamp the monitor triggered. |  [optional] [readonly]
**metrics** | **List&lt;String&gt;** | Metrics used by the monitor. |  [optional] [readonly]
**name** | **String** | The monitor name. |  [optional] [readonly]
**notifications** | [**List&lt;MonitorSearchResultNotification&gt;**](MonitorSearchResultNotification.md) | The notification triggered by the monitor. |  [optional] [readonly]
**orgId** | **Long** | The ID of the organization. |  [optional] [readonly]
**scopes** | **List&lt;String&gt;** | The scope(s) to which the downtime applies, e.g. &#x60;host:app2&#x60;. Provide multiple scopes as a comma-separated list, e.g. &#x60;env:dev,env:prod&#x60;. The resulting downtime applies to sources that matches ALL provided scopes (i.e. &#x60;env:dev AND env:prod&#x60;), NOT any of them. |  [optional]
**status** | **MonitorOverallStates** |  |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated with the monitor. |  [optional] [readonly]
**type** | **MonitorType** |  |  [optional]



