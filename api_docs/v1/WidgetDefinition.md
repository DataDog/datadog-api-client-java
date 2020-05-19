

# WidgetDefinition

[Definition of the widget](https://docs.datadoghq.com/dashboards/widgets/).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertId** | **String** | ID of the alert to use in the widget. | 
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of your widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | [**ToplistWidgetDefinitionType**](ToplistWidgetDefinitionType.md) |  | 
**vizType** | [**WidgetVizType**](WidgetVizType.md) |  | 
**precision** | **Long** | Number of decimals to show. If not defined, the widget uses the raw value. |  [optional]
**textAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**unit** | **String** | Unit to display with the value. |  [optional]
**requests** | [**List&lt;ToplistWidgetRequest&gt;**](ToplistWidgetRequest.md) | List of top list widget requests. | 
**check** | **String** | Name of the check to use in the widget. | 
**group** | **List&lt;String&gt;** | List of tag prefixes to group by. |  [optional]
**groupBy** | **List&lt;String&gt;** | List of tag prefixes to group by in the case of a cluster check. |  [optional]
**grouping** | [**WidgetGrouping**](WidgetGrouping.md) |  | 
**tags** | **List&lt;String&gt;** | List of tags used to filter the groups reporting a cluster check. |  [optional]
**legendSize** | [**WidgetLegendSize**](WidgetLegendSize.md) |  |  [optional]
**showLegend** | **Boolean** | (screenboard only) Show the legend for this widget. |  [optional]
**eventSize** | [**WidgetEventSize**](WidgetEventSize.md) |  |  [optional]
**query** | **String** | Query to filter the monitors with. | 
**tagsExecution** | **String** | The execution method for multi-value filters. Can be either and or or. |  [optional]
**color** | **String** | Color of the text. |  [optional]
**fontSize** | **String** | Size of the text. |  [optional]
**text** | **String** | Text to display. | 
**layoutType** | [**WidgetLayoutType**](WidgetLayoutType.md) |  | 
**widgets** | [**List&lt;Widget&gt;**](Widget.md) | List of widget groups. | 
**events** | [**List&lt;WidgetEvent&gt;**](WidgetEvent.md) | List of widget events. |  [optional]
**yaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]
**noGroupHosts** | **Boolean** | Whether to show the hosts that don’t fit in a group. |  [optional]
**noMetricHosts** | **Boolean** | Whether to show the hosts with no metrics. |  [optional]
**nodeType** | [**WidgetNodeType**](WidgetNodeType.md) |  |  [optional]
**notes** | **String** | Notes on the title. |  [optional]
**scope** | **List&lt;String&gt;** | List of tags used to filter the map. |  [optional]
**style** | [**HostMapWidgetDefinitionStyle**](HostMapWidgetDefinitionStyle.md) |  |  [optional]
**url** | **String** | URL of the image. | 
**margin** | [**WidgetMargin**](WidgetMargin.md) |  |  [optional]
**sizing** | [**WidgetImageSizing**](WidgetImageSizing.md) |  |  [optional]
**columns** | **List&lt;String&gt;** | Which columns to display on the widget. |  [optional]
**indexes** | **List&lt;String&gt;** | An array of index names to query in the stream. Use [] to query all indexes at once. |  [optional]
**logset** | **String** | ID of the log set to use. |  [optional]
**messageDisplay** | [**WidgetMessageDisplay**](WidgetMessageDisplay.md) |  |  [optional]
**showDateColumn** | **Boolean** | Whether to show the date column or not |  [optional]
**showMessageColumn** | **Boolean** | Whether to show the message column or not |  [optional]
**sort** | [**WidgetSort**](WidgetSort.md) |  |  [optional]
**colorPreference** | [**WidgetColorPreference**](WidgetColorPreference.md) |  |  [optional]
**count** | **Long** | The number of monitors to display. |  [optional]
**displayFormat** | [**WidgetServiceSummaryDisplayFormat**](WidgetServiceSummaryDisplayFormat.md) |  |  [optional]
**hideZeroCounts** | **Boolean** | Whether to show counts of 0 or not. |  [optional]
**showLastTriggered** | **Boolean** | Whether to show the time that has elapsed since the monitor/group triggered. |  [optional]
**start** | **Long** | The start of the list. Typically 0. |  [optional]
**summaryType** | [**WidgetSummaryType**](WidgetSummaryType.md) |  |  [optional]
**backgroundColor** | **String** | Background color of the note. |  [optional]
**content** | **String** | Content of the note. | 
**showTick** | **Boolean** | Whether to show a tick or not. |  [optional]
**tickEdge** | [**WidgetTickEdge**](WidgetTickEdge.md) |  |  [optional]
**tickPos** | **String** | Where to position the tick on an edge. |  [optional]
**autoscale** | **Boolean** | Whether to use auto-scaling or not. |  [optional]
**customUnit** | **String** | Display a unit of your choice on the widget. |  [optional]
**colorByGroups** | **List&lt;String&gt;** | List of groups used for colors. |  [optional]
**xaxis** | [**WidgetAxis**](WidgetAxis.md) |  |  [optional]
**showErrorBudget** | **Boolean** | Defined error budget. |  [optional]
**sloId** | **String** | ID of the SLO displayed. |  [optional]
**timeWindows** | [**List&lt;WidgetTimeWindows&gt;**](WidgetTimeWindows.md) | Times being monitored. |  [optional]
**viewMode** | [**WidgetViewMode**](WidgetViewMode.md) |  |  [optional]
**viewType** | **String** | Type of view displayed by the widget. | 
**filters** | **List&lt;String&gt;** | Your environment and primary tag (or * if enabled for your account). | 
**service** | **String** | APM service. | 
**env** | **String** | APM environment. | 
**showBreakdown** | **Boolean** | Whether to show the latency breakdown or not. |  [optional]
**showDistribution** | **Boolean** | Whether to show the latency distribution or not. |  [optional]
**showErrors** | **Boolean** | Whether to show the error metrics or not. |  [optional]
**showHits** | **Boolean** | Whether to show the hits metrics or not. |  [optional]
**showLatency** | **Boolean** | Whether to show the latency metrics or not. |  [optional]
**showResourceList** | **Boolean** | Whether to show the resource list or not. |  [optional]
**sizeFormat** | [**WidgetSizeFormat**](WidgetSizeFormat.md) |  |  [optional]
**spanName** | **String** | APM span name. | 
**markers** | [**List&lt;WidgetMarker&gt;**](WidgetMarker.md) | List of markers. |  [optional]



