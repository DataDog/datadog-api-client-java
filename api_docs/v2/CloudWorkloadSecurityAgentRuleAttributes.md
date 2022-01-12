# CloudWorkloadSecurityAgentRuleAttributes

A Cloud Workload Security Agent rule returned by the API.

## Properties

| Name             | Type                                                                                                      | Description                                                      | Notes      |
| ---------------- | --------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ---------- |
| **category**     | **String**                                                                                                | The category of the Agent rule.                                  | [optional] |
| **creationDate** | **Long**                                                                                                  | When the Agent rule was created, timestamp in milliseconds.      | [optional] |
| **creator**      | [**CloudWorkloadSecurityAgentRuleCreatorAttributes**](CloudWorkloadSecurityAgentRuleCreatorAttributes.md) |                                                                  | [optional] |
| **defaultRule**  | **Boolean**                                                                                               | Whether the rule is included by default.                         | [optional] |
| **description**  | **String**                                                                                                | The description of the Agent rule.                               | [optional] |
| **enabled**      | **Boolean**                                                                                               | Whether the Agent rule is enabled.                               | [optional] |
| **expression**   | **String**                                                                                                | The SECL expression of the Agent rule.                           | [optional] |
| **name**         | **String**                                                                                                | The name of the Agent rule.                                      | [optional] |
| **updatedAt**    | **Long**                                                                                                  | When the Agent rule was last updated, timestamp in milliseconds. | [optional] |
| **updater**      | [**CloudWorkloadSecurityAgentRuleUpdaterAttributes**](CloudWorkloadSecurityAgentRuleUpdaterAttributes.md) |                                                                  | [optional] |
| **version**      | **Long**                                                                                                  | The version of the Agent rule.                                   | [optional] |
