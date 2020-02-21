

# Dashboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorHandle** | **String** |  |  [optional] [readonly]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**description** | **String** | Description of the dashboard |  [optional]
**id** | **String** | ID of the dashboard |  [optional] [readonly]
**isReadOnly** | **Boolean** | Whether this dashboard is read-only. If True, only the author and admins can make changes to it. |  [optional]
**layoutType** | [**DashboardLayoutType**](DashboardLayoutType.md) |  | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**notifyList** | **List&lt;String&gt;** | List of handles of users to notify when changes are made to this dashboard. |  [optional] [readonly]
**templateVariablePresets** | [**List&lt;DashboardTemplateVariablePreset&gt;**](DashboardTemplateVariablePreset.md) |  |  [optional]
**templateVariables** | [**List&lt;DashboardTemplateVariables&gt;**](DashboardTemplateVariables.md) |  |  [optional]
**title** | **String** | Title of the dashboard | 
**url** | **String** |  |  [optional] [readonly]
**widgets** | [**List&lt;Widget&gt;**](Widget.md) | List of widgets to display on the dashboard | 



