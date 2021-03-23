

# DistributionWidgetDefinition

The Distribution visualization is another way of showing metrics aggregated across one or several tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legendSize** | **String** | Available legend sizes for a widget. Should be one of \&quot;0\&quot;, \&quot;2\&quot;, \&quot;4\&quot;, \&quot;8\&quot;, \&quot;16\&quot;, or \&quot;auto\&quot;. |  [optional]
**requests** | [**List&lt;DistributionWidgetRequest&gt;**](DistributionWidgetRequest.md) | Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the &#x60;REQUEST_SCHEMA&#x60;. | 
**showLegend** | **Boolean** | Whether or not to display the legend on this widget. |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | **WidgetTextAlign** |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **DistributionWidgetDefinitionType** |  | 



