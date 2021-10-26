# MonitorSummaryWidgetDefinition

The monitor summary widget displays a summary view of all your Datadog monitors, or a subset based on a query. Only available on FREE layout dashboards.

## Properties

| Name                  | Type                                   | Description                                                                  | Notes      |
| --------------------- | -------------------------------------- | ---------------------------------------------------------------------------- | ---------- |
| **colorPreference**   | **WidgetColorPreference**              |                                                                              | [optional] |
| **count**             | **Long**                               | The number of monitors to display.                                           | [optional] |
| **displayFormat**     | **WidgetMonitorSummaryDisplayFormat**  |                                                                              | [optional] |
| **hideZeroCounts**    | **Boolean**                            | Whether to show counts of 0 or not.                                          | [optional] |
| **query**             | **String**                             | Query to filter the monitors with.                                           |
| **showLastTriggered** | **Boolean**                            | Whether to show the time that has elapsed since the monitor/group triggered. | [optional] |
| **sort**              | **WidgetMonitorSummarySort**           |                                                                              | [optional] |
| **start**             | **Long**                               | The start of the list. Typically 0.                                          | [optional] |
| **summaryType**       | **WidgetSummaryType**                  |                                                                              | [optional] |
| **title**             | **String**                             | Title of the widget.                                                         | [optional] |
| **titleAlign**        | **WidgetTextAlign**                    |                                                                              | [optional] |
| **titleSize**         | **String**                             | Size of the title.                                                           | [optional] |
| **type**              | **MonitorSummaryWidgetDefinitionType** |                                                                              |
