

# HeatMapWidgetDefinition

The heat map visualization shows metrics aggregated across many tags, such as hosts. The more hosts that have a particular value, the darker that square is.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List&lt;WidgetEvent&gt;**](WidgetEvent.md) | List of widget events. |  [optional]
**legendSize** | [**WidgetLegendSize**](WidgetLegendSize.md) |  |  [optional]
**requests** | [**List&lt;HeatMapWidgetRequest&gt;**](HeatMapWidgetRequest.md) | List of widget types. | 
**showLegend** | **Boolean** | Whether or not to display the legend on this widget. |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **String** | Type of the widget. |  [readonly]
**yaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]


## Implemented Interfaces

* WidgetDefinition


