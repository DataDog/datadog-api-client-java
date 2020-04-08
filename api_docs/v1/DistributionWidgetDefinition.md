

# DistributionWidgetDefinition

The Distribution visualization is another way of showing metrics aggregated across one or several tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legendSize** | [**WidgetLegendSize**](WidgetLegendSize.md) |  |  [optional]
**requests** | [**List&lt;DistributionWidgetRequest&gt;**](DistributionWidgetRequest.md) | TODO. | 
**showLegend** | **Boolean** | Whether or not to display the legend on this widget |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title |  [optional]
**type** | **String** | Type of the widget |  [readonly]


## Implemented Interfaces

* WidgetDefinition


