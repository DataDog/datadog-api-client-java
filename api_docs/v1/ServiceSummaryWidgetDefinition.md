

# ServiceSummaryWidgetDefinition

The service summary displays the graphs of a chosen service in your screenboard. Only available on FREE layout dashboards.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayFormat** | [**WidgetServiceSummaryDisplayFormat**](WidgetServiceSummaryDisplayFormat.md) |  |  [optional]
**env** | **String** | APM environment. | 
**service** | **String** | APM service. | 
**showBreakdown** | **Boolean** | Whether to show the latency breakdown or not. |  [optional]
**showDistribution** | **Boolean** | Whether to show the latency distribution or not. |  [optional]
**showErrors** | **Boolean** | Whether to show the error metrics or not. |  [optional]
**showHits** | **Boolean** | Whether to show the hits metrics or not. |  [optional]
**showLatency** | **Boolean** | Whether to show the latency metrics or not. |  [optional]
**showResourceList** | **Boolean** | Whether to show the resource list or not. |  [optional]
**sizeFormat** | [**WidgetSizeFormat**](WidgetSizeFormat.md) |  |  [optional]
**spanName** | **String** | APM span name. | 
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **String** | Type of the widget. |  [readonly]


## Implemented Interfaces

* WidgetDefinition


