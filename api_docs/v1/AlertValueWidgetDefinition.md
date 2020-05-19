

# AlertValueWidgetDefinition

Alert values are query values showing the current value of the metric in any monitor defined on your system.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertId** | **String** | ID of the alert to use in the widget. | 
**precision** | **Long** | Number of decimal to show. If not defined, will use the raw value. |  [optional]
**textAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of value in the widget. |  [optional]
**type** | [**AlertValueWidgetDefinitionType**](AlertValueWidgetDefinitionType.md) |  | 
**unit** | **String** | Unit to display with the value. |  [optional]



