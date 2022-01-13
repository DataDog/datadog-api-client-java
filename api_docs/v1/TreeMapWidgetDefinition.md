# TreeMapWidgetDefinition

The treemap visualization found on the Host Dashboards comes from the output of `ps auxww`. This is not continuously run on your hosts. Instead, it’s run once on Agent start/restart. The treemap is only supported for process data on a single host dashboard — this may not be reused in other dashboards or for other metrics.

## Properties

| Name         | Type                                                            | Description                       | Notes      |
| ------------ | --------------------------------------------------------------- | --------------------------------- | ---------- |
| **colorBy**  | **TreeMapColorBy**                                              |                                   | [optional] |
| **groupBy**  | **TreeMapGroupBy**                                              |                                   | [optional] |
| **requests** | [**List&lt;TreeMapWidgetRequest&gt;**](TreeMapWidgetRequest.md) | List of top list widget requests. |
| **sizeBy**   | **TreeMapSizeBy**                                               |                                   | [optional] |
| **title**    | **String**                                                      | Title of your widget.             | [optional] |
| **type**     | **TreeMapWidgetDefinitionType**                                 |                                   |
