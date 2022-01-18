# SecurityMonitoringRuleThirdPartyOptions

Options for third-party rules.

## Properties

| Name                     | Type                               | Description                                                                                      | Notes      |
| ------------------------ | ---------------------------------- | ------------------------------------------------------------------------------------------------ | ---------- |
| **defaultNotifications** | **List&lt;String&gt;**             | Notification targets for the root query.                                                         | [optional] |
| **defaultStatus**        | **SecurityMonitoringRuleSeverity** |                                                                                                  | [optional] |
| **firstSeenOverride**    | **String**                         | (Optional): the name of an attribute to override the first seen value of the third party signal. | [optional] |
| **lastSeenOverride**     | **String**                         | (Optional): the name of an attribute to override the last seen value of the third party signal.  | [optional] |
| **rootQuery**            | **String**                         | Root query of the rule.                                                                          | [optional] |
| **signalId**             | **String**                         | Optional mapping of the third-party signal ID.                                                   | [optional] |
