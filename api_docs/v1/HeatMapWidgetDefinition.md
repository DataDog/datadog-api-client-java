

# HeatMapWidgetDefinition

The heat map visualization shows metrics aggregated across many tags, such as hosts. The more hosts that have a particular value, the darker that square is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customLinks** | [**List&lt;WidgetCustomLink&gt;**](WidgetCustomLink.md) | List of custom links. |  [optional]
**events** | [**List&lt;WidgetEvent&gt;**](WidgetEvent.md) | List of widget events. |  [optional]
**legendSize** | **String** | Available legend sizes for a widget. Should be one of \&quot;0\&quot;, \&quot;2\&quot;, \&quot;4\&quot;, \&quot;8\&quot;, \&quot;16\&quot;, or \&quot;auto\&quot;. |  [optional]
**requests** | [**List&lt;HeatMapWidgetRequest&gt;**](HeatMapWidgetRequest.md) | List of widget types. | 
**showLegend** | **Boolean** | Whether or not to display the legend on this widget. |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | **WidgetTextAlign** |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **HeatMapWidgetDefinitionType** |  | 
**yaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]



