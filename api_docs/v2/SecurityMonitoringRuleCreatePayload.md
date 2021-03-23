

# SecurityMonitoringRuleCreatePayload

Create a new rule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List&lt;SecurityMonitoringRuleCaseCreate&gt;**](SecurityMonitoringRuleCaseCreate.md) | Cases for generating signals. | 
**filters** | [**List&lt;SecurityMonitoringFilter&gt;**](SecurityMonitoringFilter.md) | Additional queries to filter matched events before they are processed. |  [optional]
**isEnabled** | **Boolean** | Whether the rule is enabled. | 
**message** | **String** | Message for generated signals. | 
**name** | **String** | The name of the rule. | 
**options** | [**SecurityMonitoringRuleOptions**](SecurityMonitoringRuleOptions.md) |  | 
**queries** | [**List&lt;SecurityMonitoringRuleQueryCreate&gt;**](SecurityMonitoringRuleQueryCreate.md) | Queries for selecting logs which are part of the rule. | 
**tags** | **List&lt;String&gt;** | Tags for generated signals. |  [optional]



