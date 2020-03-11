

# MonitorSummaryWidgetDefinition

The monitor summary widget displays a summary view of all your Datadog monitors, or a subset based on a query. Only available on FREE layout dashboards
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colorPreference** | [**WidgetColorPreference**](WidgetColorPreference.md) |  |  [optional]
**displayFormat** | [**WidgetMonitorSummaryDisplayFormat**](WidgetMonitorSummaryDisplayFormat.md) |  |  [optional]
**hideZeroCounts** | **Boolean** | Whether to show counts of 0 or not |  [optional]
**query** | **String** | Query to filter the monitors with | 
**showLastTriggered** | **Boolean** | Whether to show the time that has elapsed since the monitor/group triggered |  [optional]
**sort** | [**WidgetSort**](WidgetSort.md) |  |  [optional]
**summaryType** | [**WidgetSummaryType**](WidgetSummaryType.md) |  |  [optional]
**title** | **String** | Title of the widget |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title |  [optional]
**type** | **String** | Type of the widget |  [readonly]


## Implemented Interfaces

* WidgetDefinition


