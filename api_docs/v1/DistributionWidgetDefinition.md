

# DistributionWidgetDefinition

The Distribution visualization is another way of showing metrics aggregated across one or several tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legendSize** | **String** | (Deprecated) The widget legend was replaced by a tooltip and sidebar. |  [optional]
**markers** | [**List&lt;WidgetMarker&gt;**](WidgetMarker.md) | List of markers. |  [optional]
**requests** | [**List&lt;DistributionWidgetRequest&gt;**](DistributionWidgetRequest.md) | Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the &#x60;REQUEST_SCHEMA&#x60;. | 
**showLegend** | **Boolean** | (Deprecated) The widget legend was replaced by a tooltip and sidebar. |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | **WidgetTextAlign** |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **DistributionWidgetDefinitionType** |  | 
**xaxis** | [**DistributionWidgetXAxis**](DistributionWidgetXAxis.md) |  |  [optional]
**yaxis** | [**DistributionWidgetYAxis**](DistributionWidgetYAxis.md) |  |  [optional]



