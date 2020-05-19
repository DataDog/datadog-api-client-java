

# SecurityMonitoringRuleCase

Case when signal is generated.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | **String** | A rule case contains logical operations (&gt;, &gt;&#x3D;, &amp;&amp;, ||) to determine if a signal should be generated based on the event counts in the previously defined queries. |  [optional]
**name** | **String** | Name of the case. |  [optional]
**notifications** | **List&lt;String&gt;** | Notification targets for each rule case |  [optional]
**status** | [**SecurityMonitoringRuleSeverity**](SecurityMonitoringRuleSeverity.md) |  |  [optional]



