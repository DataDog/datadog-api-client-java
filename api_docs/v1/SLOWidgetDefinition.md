# SLOWidgetDefinition

Use the SLO and uptime widget to track your SLOs (Service Level Objectives) and uptime on screenboards and timeboards.

## Properties

| Name                 | Type                              | Description                           | Notes      |
| -------------------- | --------------------------------- | ------------------------------------- | ---------- |
| **globalTimeTarget** | **String**                        | Defined global time target.           | [optional] |
| **showErrorBudget**  | **Boolean**                       | Defined error budget.                 | [optional] |
| **sloId**            | **String**                        | ID of the SLO displayed.              | [optional] |
| **timeWindows**      | **List&lt;WidgetTimeWindows&gt;** | Times being monitored.                | [optional] |
| **title**            | **String**                        | Title of the widget.                  | [optional] |
| **titleAlign**       | **WidgetTextAlign**               |                                       | [optional] |
| **titleSize**        | **String**                        | Size of the title.                    | [optional] |
| **type**             | **SLOWidgetDefinitionType**       |                                       |
| **viewMode**         | **WidgetViewMode**                |                                       | [optional] |
| **viewType**         | **String**                        | Type of view displayed by the widget. |
