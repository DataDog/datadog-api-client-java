

# Downtime

Downtiming gives you greater control over monitor notifications by allowing you to globally exclude scopes from alerting. Downtime settings, which can be scheduled with start and end times, prevent all alerting related to specified Datadog tags.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If a scheduled downtime currently exists. |  [optional] [readonly]
**canceled** | **Long** | If a scheduled downtime is cancelled. |  [optional] [readonly]
**creatorId** | **Integer** | TODO. |  [optional] [readonly]
**disabled** | **Boolean** | If a downtime has been disabled. |  [optional]
**downtimeType** | **Integer** | TODO. |  [optional] [readonly]
**end** | **Long** | POSIX timestamp to end the downtime. If not provided, the downtime is in effect indefinitely until you cancel it. |  [optional]
**id** | **Long** | TODO. |  [optional] [readonly]
**message** | **String** | A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same ‘@username’ notation as events. |  [optional]
**monitorId** | **Long** | A single monitor to which the downtime applies. If not provided, the downtime applies to all monitors. |  [optional]
**monitorTags** | **List&lt;String&gt;** | A comma-separated list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match ALL provided monitor tags. For example, &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;. |  [optional]
**parentId** | **Long** | TODO. |  [optional]
**recurrence** | [**DowntimeRecurrence**](DowntimeRecurrence.md) |  |  [optional]
**scope** | **List&lt;String&gt;** | The scope(s) to which the downtime applies. For example, &#x60;host:app2&#x60;. Provide multiple scopes as a comma-separated list like &#x60;env:dev,env:prod&#x60;. The resulting downtime applies to sources that matches ALL provided scopes (&#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;). |  [optional]
**start** | **Long** | POSIX timestamp to start the downtime. If not provided, the downtime starts the moment it is created. |  [optional]
**timezone** | **String** | The timezone for the downtime. |  [optional]
**updaterId** | **Integer** | TODO. |  [optional] [readonly]



