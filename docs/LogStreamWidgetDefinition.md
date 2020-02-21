

# LogStreamWidgetDefinition

The Log Stream displays a log flow matching the defined query. Only available on FREE layout dashboards
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List&lt;String&gt;** | Which columns to display on the widget |  [optional]
**indexes** | **List&lt;String&gt;** | An array of index names to query in the stream. |  [optional]
**query** | **String** | Query to filter the log stream with |  [optional]
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | Title of the widget |  [optional]
**titleAlign** | [**WidgetTextAlign**](WidgetTextAlign.md) |  |  [optional]
**titleSize** | **String** | Size of the title |  [optional]
**type** | **String** | Type of the widget |  [readonly]


## Implemented Interfaces

* WidgetDefinition


