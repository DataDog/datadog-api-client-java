# GeomapWidgetRequest

An updated geomap widget.

## Properties

| Name               | Type                                                                                      | Description                                                        | Notes      |
| ------------------ | ----------------------------------------------------------------------------------------- | ------------------------------------------------------------------ | ---------- |
| **formulas**       | [**List&lt;WidgetFormula&gt;**](WidgetFormula.md)                                         | List of formulas that operate on queries.                          | [optional] |
| **logQuery**       | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                    | [optional] |
| **q**              | **String**                                                                                | The widget metrics query.                                          | [optional] |
| **queries**        | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. | [optional] |
| **responseFormat** | **FormulaAndFunctionResponseFormat**                                                      |                                                                    | [optional] |
| **rumQuery**       | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                    | [optional] |
| **securityQuery**  | [**LogQueryDefinition**](LogQueryDefinition.md)                                           |                                                                    | [optional] |
