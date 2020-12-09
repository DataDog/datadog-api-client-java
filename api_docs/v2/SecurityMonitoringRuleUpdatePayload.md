

# SecurityMonitoringRuleUpdatePayload

Update an existing rule.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List&lt;SecurityMonitoringRuleCase&gt;**](SecurityMonitoringRuleCase.md) | Cases for generating signals. |  [optional]
**filters** | [**List&lt;SecurityMonitoringFilter&gt;**](SecurityMonitoringFilter.md) | Additional queries to filter matched events before they are processed |  [optional]
**isEnabled** | **Boolean** | Whether the rule is enabled. |  [optional]
**message** | **String** | Message for generated signals. |  [optional]
**name** | **String** | Name of the rule. |  [optional]
**options** | [**SecurityMonitoringRuleOptions**](SecurityMonitoringRuleOptions.md) |  |  [optional]
**queries** | [**List&lt;SecurityMonitoringRuleQuery&gt;**](SecurityMonitoringRuleQuery.md) | Queries for selecting logs which are part of the rule. |  [optional]
**tags** | **List&lt;String&gt;** | Tags for generated signals. |  [optional]



