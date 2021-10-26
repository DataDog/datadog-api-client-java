

# IncidentUpdateAttributes

The incident's attributes for an update request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerImpactEnd** | **OffsetDateTime** | Timestamp when customers were no longer impacted by the incident. |  [optional]
**customerImpactScope** | **String** | A summary of the impact customers experienced during the incident. |  [optional]
**customerImpactStart** | **OffsetDateTime** | Timestamp when customers began being impacted by the incident. |  [optional]
**customerImpacted** | **Boolean** | A flag indicating whether the incident caused customer impact. |  [optional]
**detected** | **OffsetDateTime** | Timestamp when the incident was detected. |  [optional]
**fields** | [**Map&lt;String, IncidentFieldAttributes&gt;**](IncidentFieldAttributes.md) | A condensed view of the user-defined fields for which to update selections. |  [optional]
**notificationHandles** | [**List&lt;IncidentNotificationHandle&gt;**](IncidentNotificationHandle.md) | Notification handles that will be notified of the incident during update. |  [optional]
**resolved** | **OffsetDateTime** | Timestamp when the incident&#39;s state was set to resolved. |  [optional]
**title** | **String** | The title of the incident, which summarizes what happened. |  [optional]



