

# SecurityMonitoringRuleQueryCreate

Query for matching rule.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentRule** | [**SecurityMonitoringRuntimeAgentRule**](SecurityMonitoringRuntimeAgentRule.md) |  |  [optional]
**aggregation** | **SecurityMonitoringRuleQueryAggregation** |  |  [optional]
**distinctFields** | **List&lt;String&gt;** | Field for which the cardinality is measured. Sent as an array. |  [optional]
**groupByFields** | **List&lt;String&gt;** | Fields to group by. |  [optional]
**metric** | **String** | The target field to aggregate over when using the sum or max aggregations. |  [optional]
**name** | **String** | Name of the query. |  [optional]
**query** | **String** | Query to run on logs. | 



