

# ChangeWidgetDefinition

The Change graph shows you the change in a value over the time period chosen.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;ChangeWidgetRequest&gt;**](ChangeWidgetRequest.md) | Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the &#x60;REQUEST_SCHEMA&#x60;. | 
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget. |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title. |  [optional]
**type** | **String** | Type of the widget. |  [readonly]


## Implemented Interfaces

* WidgetDefinition


