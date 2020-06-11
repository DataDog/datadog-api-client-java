

# SecurityMonitoringRuleCreatePayload

Create a new rule.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List&lt;SecurityMonitoringRuleCase&gt;**](SecurityMonitoringRuleCase.md) | Cases for generating signals. | 
**enabled** | **Boolean** | Whether the rule is enabled. | 
**message** | **String** | Message for generated signals. | 
**name** | **String** | The name of the rule | 
**options** | [**SecurityMonitoringRuleOptions**](SecurityMonitoringRuleOptions.md) |  | 
**queries** | [**List&lt;SecurityMonitoringRuleQuery&gt;**](SecurityMonitoringRuleQuery.md) | Queries for selecting logs which are part of the rule. | 
**tags** | **List&lt;String&gt;** | Tags for generated signals. | 



