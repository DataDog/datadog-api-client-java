

# IncidentCreateAttributes

The incident's attributes for a create request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerImpacted** | **Boolean** | A flag indicating whether the incident caused customer impact. | 
**fields** | [**Map&lt;String, IncidentFieldAttributes&gt;**](IncidentFieldAttributes.md) | A condensed view of the user-defined fields for which to create initial selections. |  [optional]
**initialTimelineCells** | [**List&lt;IncidentTimelineCellCreateAttributes&gt;**](IncidentTimelineCellCreateAttributes.md) | An array of initial timeline cells to be placed at the beginning of the incident timeline. |  [optional]
**notificationHandles** | **List&lt;String&gt;** | Notification handles that will be notified of the incident at creation. |  [optional]
**title** | **String** | The title of the incident, which summarizes what happened. | 



