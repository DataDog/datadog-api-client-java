

# SecurityMonitoringRuleUpdatePayload

Update an existing rule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List&lt;SecurityMonitoringRuleCase&gt;**](SecurityMonitoringRuleCase.md) | Cases for generating signals. |  [optional]
**filters** | [**List&lt;SecurityMonitoringFilter&gt;**](SecurityMonitoringFilter.md) | Additional queries to filter matched events before they are processed. |  [optional]
**hasExtendedTitle** | **Boolean** | Whether the notifications include the triggering group-by values in their title. |  [optional]
**isEnabled** | **Boolean** | Whether the rule is enabled. |  [optional]
**message** | **String** | Message for generated signals. |  [optional]
**name** | **String** | Name of the rule. |  [optional]
**options** | [**SecurityMonitoringRuleOptions**](SecurityMonitoringRuleOptions.md) |  |  [optional]
**queries** | [**List&lt;SecurityMonitoringRuleQuery&gt;**](SecurityMonitoringRuleQuery.md) | Queries for selecting logs which are part of the rule. |  [optional]
**tags** | **List&lt;String&gt;** | Tags for generated signals. |  [optional]
**version** | **Integer** | The version of the rule being updated. |  [optional]



