# MonitorFormulaAndFunctionEventQueryDefinition

A formula and functions events query.

## Properties

| Name           | Type                                                                                                                | Description                                                                                              | Notes      |
| -------------- | ------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | ---------- |
| **compute**    | [**MonitorFormulaAndFunctionEventQueryDefinitionCompute**](MonitorFormulaAndFunctionEventQueryDefinitionCompute.md) |                                                                                                          |
| **dataSource** | **MonitorFormulaAndFunctionEventsDataSource**                                                                       |                                                                                                          |
| **groupBy**    | [**List&lt;MonitorFormulaAndFunctionEventQueryGroupBy&gt;**](MonitorFormulaAndFunctionEventQueryGroupBy.md)         | Group by options.                                                                                        | [optional] |
| **indexes**    | **List&lt;String&gt;**                                                                                              | An array of index names to query in the stream. Omit or use &#x60;[]&#x60; to query all indexes at once. | [optional] |
| **name**       | **String**                                                                                                          | Name of the query for use in formulas.                                                                   |
| **search**     | [**MonitorFormulaAndFunctionEventQueryDefinitionSearch**](MonitorFormulaAndFunctionEventQueryDefinitionSearch.md)   |                                                                                                          | [optional] |
