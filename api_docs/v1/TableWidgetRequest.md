

# TableWidgetRequest

Updated table widget.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregator** | **WidgetAggregator** |  |  [optional]
**alias** | **String** | The column name (defaults to the metric name). |  [optional]
**apmQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**apmStatsQuery** | [**ApmStatsQueryDefinition**](ApmStatsQueryDefinition.md) |  |  [optional]
**cellDisplayMode** | **List&lt;TableWidgetCellDisplayMode&gt;** | A list of display modes for each table cell. |  [optional]
**conditionalFormats** | [**List&lt;WidgetConditionalFormat&gt;**](WidgetConditionalFormat.md) | List of conditional formats. |  [optional]
**eventQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**limit** | **Long** | For metric queries, the number of lines to show in the table. Only one request should have this property. |  [optional]
**logQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**networkQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**order** | **WidgetSort** |  |  [optional]
**processQuery** | [**ProcessQueryDefinition**](ProcessQueryDefinition.md) |  |  [optional]
**profileMetricsQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**q** | **String** | Query definition. |  [optional]
**rumQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**securityQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]



