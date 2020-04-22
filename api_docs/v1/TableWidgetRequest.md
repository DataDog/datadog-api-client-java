

# TableWidgetRequest

TODO.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregator** | [**WidgetAggregator**](WidgetAggregator.md) |  |  [optional]
**alias** | **String** | The column name (defaults to the metric name). |  [optional]
**apmQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**conditionalFormats** | [**List&lt;WidgetConditionalFormat&gt;**](WidgetConditionalFormat.md) | TODO. |  [optional]
**eventQuery** | [**EventQueryDefinition**](EventQueryDefinition.md) |  |  [optional]
**limit** | **Long** | For metric queries, the number of lines to show in the table. Only one request should have this property. |  [optional]
**logQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**networkQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**order** | [**WidgetSort**](WidgetSort.md) |  |  [optional]
**processQuery** | [**ProcessQueryDefinition**](ProcessQueryDefinition.md) |  |  [optional]
**q** | **String** | TODO. |  [optional]
**rumQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]



