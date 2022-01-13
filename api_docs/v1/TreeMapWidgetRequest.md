# TreeMapWidgetRequest

An updated treemap widget.

## Properties

| Name               | Type                                                                                      | Description                                                                                               | Notes      |
| ------------------ | ----------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | ---------- |
| **formulas**       | [**List&lt;WidgetFormula&gt;**](WidgetFormula.md)                                         | List of formulas that operate on queries. **This feature is currently in beta.**                          | [optional] |
| **q**              | **String**                                                                                | The widget metrics query.                                                                                 | [optional] |
| **queries**        | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. **This feature is currently in beta.** | [optional] |
| **responseFormat** | **FormulaAndFunctionResponseFormat**                                                      |                                                                                                           | [optional] |
