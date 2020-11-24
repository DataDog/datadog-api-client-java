

# TimeseriesWidgetDefinition

The timeseries visualization allows you to display the evolution of one or more metrics, log events, or Indexed Spans over time.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customLinks** | [**List&lt;WidgetCustomLink&gt;**](WidgetCustomLink.md) | List of custom links. |  [optional]
**events** | [**List&lt;WidgetEvent&gt;**](WidgetEvent.md) | List of widget events. |  [optional]
**legendSize** | **String** | Available legend sizes for a widget. Should be one of \&quot;0\&quot;, \&quot;2\&quot;, \&quot;4\&quot;, \&quot;8\&quot;, \&quot;16\&quot;, or \&quot;auto\&quot;. |  [optional]
**markers** | [**List&lt;WidgetMarker&gt;**](WidgetMarker.md) | List of markers. |  [optional]
**requests** | [**List&lt;TimeseriesWidgetRequest&gt;**](TimeseriesWidgetRequest.md) | List of timeseries widget requests. | 
**rightYaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]
**showLegend** | **Boolean** | (screenboard only) Show the legend for this widget. |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of your widget. |  [optional]
**titleAlign** | **WidgetTextAlign** |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **TimeseriesWidgetDefinitionType** |  | 
**yaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]



