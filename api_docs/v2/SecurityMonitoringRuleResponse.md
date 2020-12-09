

# SecurityMonitoringRuleResponse

Detection rule.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List&lt;SecurityMonitoringRuleCase&gt;**](SecurityMonitoringRuleCase.md) | Cases for generating signals. |  [optional]
**createdAt** | **Long** | When the rule was created, timestamp in milliseconds. |  [optional]
**creationAuthorId** | **Long** | User ID of the user who created the rule. |  [optional]
**filters** | [**List&lt;SecurityMonitoringFilter&gt;**](SecurityMonitoringFilter.md) | Additional queries to filter matched events before they are processed |  [optional]
**id** | **String** | The ID of the rule. |  [optional]
**isDefault** | **Boolean** | Whether the rule is included by default. |  [optional]
**isDeleted** | **Boolean** | Whether the rule has been deleted. |  [optional]
**isEnabled** | **Boolean** | Whether the rule is enabled. |  [optional]
**message** | **String** | Message for generated signals. |  [optional]
**name** | **String** | The name of the rule. |  [optional]
**options** | [**SecurityMonitoringRuleOptions**](SecurityMonitoringRuleOptions.md) |  |  [optional]
**queries** | [**List&lt;SecurityMonitoringRuleQuery&gt;**](SecurityMonitoringRuleQuery.md) | Queries for selecting logs which are part of the rule. |  [optional]
**tags** | **List&lt;String&gt;** | Tags for generated signals. |  [optional]
**version** | **Long** | The version of the rule. |  [optional]



