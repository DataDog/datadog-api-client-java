

# Dashboard

A dashboard is Datadog’s tool for visually tracking, analyzing, and displaying key performance metrics, which enable you to monitor the health of your infrastructure.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorHandle** | **String** | Identifier of the dashboard author. |  [optional] [readonly]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Creation date of the dashboard. |  [optional] [readonly]
**description** | **String** | Description of the dashboard. |  [optional]
**id** | **String** | ID of the dashboard. |  [optional] [readonly]
**isReadOnly** | **Boolean** | Whether this dashboard is read-only. If True, only the author and admins can make changes to it. |  [optional]
**layoutType** | [**DashboardLayoutType**](DashboardLayoutType.md) |  | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Modification date of the dashboard. |  [optional] [readonly]
**notifyList** | **List&lt;String&gt;** | List of handles of users to notify when changes are made to this dashboard. |  [optional]
**templateVariablePresets** | [**List&lt;DashboardTemplateVariablePreset&gt;**](DashboardTemplateVariablePreset.md) | Array of template variables saved views. |  [optional]
**templateVariables** | [**List&lt;DashboardTemplateVariables&gt;**](DashboardTemplateVariables.md) | List of template variables for this dashboard. |  [optional]
**title** | **String** | Title of the dashboard. | 
**url** | **String** | The URL of the dashboard. |  [optional] [readonly]
**widgets** | [**List&lt;Widget&gt;**](Widget.md) | List of widgets to display on the dashboard. | 



