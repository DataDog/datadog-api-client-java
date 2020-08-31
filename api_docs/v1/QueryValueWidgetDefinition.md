

# QueryValueWidgetDefinition

Query values display the current value of a given metric, APM, or log query.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoscale** | **Boolean** | Whether to use auto-scaling or not. |  [optional]
**customLinks** | [**List&lt;WidgetCustomLink&gt;**](WidgetCustomLink.md) | List of custom links. |  [optional]
**customUnit** | **String** | Display a unit of your choice on the widget. |  [optional]
**precision** | **Long** | Number of decimals to show. If not defined, the widget uses the raw value. |  [optional]
**requests** | [**List&lt;QueryValueWidgetRequest&gt;**](QueryValueWidgetRequest.md) | Widget definition. | 
**textAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of your widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | [**QueryValueWidgetDefinitionType**](QueryValueWidgetDefinitionType.md) |  | 



