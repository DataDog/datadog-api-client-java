

# GeomapWidgetDefinition

This visualization displays a series of values by country on a world map.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customLinks** | [**List&lt;WidgetCustomLink&gt;**](WidgetCustomLink.md) | A list of custom links. |  [optional]
**requests** | [**List&lt;GeomapWidgetRequest&gt;**](GeomapWidgetRequest.md) | Array of one request object to display in the widget. The request must contain a &#x60;group-by&#x60; tag whose value is a country ISO code.  See the [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json) for information about building the &#x60;REQUEST_SCHEMA&#x60;. | 
**style** | [**GeomapWidgetDefinitionStyle**](GeomapWidgetDefinitionStyle.md) |  | 
**time** | [**WidgetTime**](WidgetTime.md) |  |  [optional]
**title** | **String** | The title of your widget. |  [optional]
**titleAlign** | **WidgetTextAlign** |  |  [optional]
**titleSize** | **String** | The size of the title. |  [optional]
**type** | **GeomapWidgetDefinitionType** |  | 
**view** | [**GeomapWidgetDefinitionView**](GeomapWidgetDefinitionView.md) |  | 



