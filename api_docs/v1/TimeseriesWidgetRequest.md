

# TimeseriesWidgetRequest

Updated timeseries widget.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apmQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**displayType** | **WidgetDisplayType** |  |  [optional]
**eventQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**formulas** | [**List&lt;WidgetFormula&gt;**](WidgetFormula.md) | List of formulas that operate on queries. This feature is currently in beta. |  [optional]
**logQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**metadata** | [**List&lt;TimeseriesWidgetRequestMetadata&gt;**](TimeseriesWidgetRequestMetadata.md) | Used to define expression aliases. |  [optional]
**networkQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**onRightYaxis** | **Boolean** | Whether or not to display a second y-axis on the right. |  [optional]
**processQuery** | [**ProcessQueryDefinition**](ProcessQueryDefinition.md) |  |  [optional]
**q** | **String** | Widget query. |  [optional]
**queries** | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. This feature is currently in beta. |  [optional]
**responseFormat** | **FormulaAndFunctionResponseFormat** |  |  [optional]
**rumQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**securityQuery** | [**LogQueryDefinition**](LogQueryDefinition.md) |  |  [optional]
**style** | [**WidgetRequestStyle**](WidgetRequestStyle.md) |  |  [optional]



