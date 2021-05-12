

# DowntimeChild

The downtime object definition of the active child for the original parent recurring downtime. This field will only exist on recurring downtimes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If a scheduled downtime currently exists. |  [optional] [readonly]
**canceled** | **Long** | If a scheduled downtime is canceled. |  [optional] [readonly]
**creatorId** | **Integer** | User ID of the downtime creator. |  [optional] [readonly]
**disabled** | **Boolean** | If a downtime has been disabled. |  [optional]
**downtimeType** | **Integer** | &#x60;0&#x60; for a downtime applied on &#x60;*&#x60; or all, &#x60;1&#x60; when the downtime is only scoped to hosts, or &#x60;2&#x60; when the downtime is scoped to anything but hosts. |  [optional] [readonly]
**end** | **Long** | POSIX timestamp to end the downtime. If not provided, the downtime is in effect indefinitely until you cancel it. |  [optional]
**id** | **Long** | The downtime ID. |  [optional] [readonly]
**message** | **String** | A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same &#x60;@username&#x60; notation as events. |  [optional]
**monitorId** | **Long** | A single monitor to which the downtime applies. If not provided, the downtime applies to all monitors. |  [optional]
**monitorTags** | **List&lt;String&gt;** | A comma-separated list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match ALL provided monitor tags. For example, &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;. |  [optional]
**parentId** | **Long** | ID of the parent Downtime. |  [optional]
**recurrence** | [**DowntimeRecurrence**](DowntimeRecurrence.md) |  |  [optional]
**scope** | **List&lt;String&gt;** | The scope(s) to which the downtime applies. For example, &#x60;host:app2&#x60;. Provide multiple scopes as a comma-separated list like &#x60;env:dev,env:prod&#x60;. The resulting downtime applies to sources that matches ALL provided scopes (&#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;). |  [optional]
**start** | **Long** | POSIX timestamp to start the downtime. If not provided, the downtime starts the moment it is created. |  [optional]
**timezone** | **String** | The timezone in which to display the downtime&#39;s start and end times in Datadog applications. |  [optional]
**updaterId** | **Integer** | ID of the last user that updated the downtime. |  [optional] [readonly]



