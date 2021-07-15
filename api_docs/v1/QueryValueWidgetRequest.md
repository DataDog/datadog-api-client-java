

# QueryValueWidgetRequest

Updated query value widget.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregator** | **WidgetAggregator** |  |  [optional]
**apmQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**auditQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**conditionalFormats** | [**List&lt;WidgetConditionalFormat&gt;**](WidgetConditionalFormat.md) | List of conditional formats. |  [optional]
**eventQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**formulas** | [**List&lt;WidgetFormula&gt;**](WidgetFormula.md) | List of formulas that operate on queries. **This feature is currently in beta.** |  [optional]
**logQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**networkQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**processQuery** | [**ProcessQueryDefinition**](ProcessQueryDefinition.md) |  |  [optional]
**profileMetricsQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**q** | **String** | TODO. |  [optional]
**queries** | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. **This feature is currently in beta.** |  [optional]
**responseFormat** | **FormulaAndFunctionResponseFormat** |  |  [optional]
**rumQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**securityQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]



