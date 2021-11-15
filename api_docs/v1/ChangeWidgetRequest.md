# ChangeWidgetRequest

Updated change widget.

## Properties

| Name                    | Type                                                                                      | Description                                                                                               | Notes      |
| ----------------------- | ----------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | ---------- |
| **apmQuery**            | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **changeType**          | **WidgetChangeType**                                                                      |                                                                                                           | [optional] |
| **compareTo**           | **WidgetCompareTo**                                                                       |                                                                                                           | [optional] |
| **eventQuery**          | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **formulas**            | [**List&lt;WidgetFormula&gt;**](WidgetFormula.md)                                         | List of formulas that operate on queries. **This feature is currently in beta.**                          | [optional] |
| **increaseGood**        | **Boolean**                                                                               | Whether to show increase as good.                                                                         | [optional] |
| **logQuery**            | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **networkQuery**        | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **orderBy**             | **WidgetOrderBy**                                                                         |                                                                                                           | [optional] |
| **orderDir**            | **WidgetSort**                                                                            |                                                                                                           | [optional] |
| **processQuery**        | [**ProcessQueryDefinition**](ProcessQueryDefinition.md)                                   |                                                                                                           | [optional] |
| **profileMetricsQuery** | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **q**                   | **String**                                                                                | Query definition.                                                                                         | [optional] |
| **queries**             | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. **This feature is currently in beta.** | [optional] |
| **responseFormat**      | **FormulaAndFunctionResponseFormat**                                                      |                                                                                                           | [optional] |
| **rumQuery**            | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **securityQuery**       | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                                                           | [optional] |
| **showPresent**         | **Boolean**                                                                               | Whether to show the present value.                                                                        | [optional] |
