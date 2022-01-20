# SecurityMonitoringRuleCaseCreate

Case when signal is generated.

## Properties

| Name              | Type                               | Description                                                                                                      | Notes      |
| ----------------- | ---------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------- | ----------------------------------------------------------------------------------------------------------------- | ---------- |
| **condition**     | **String**                         | A rule case contains logical operations (&#x60;&gt;&#x60;,&#x60;&gt;&#x3D;&#x60;, &#x60;&amp;&amp;&#x60;, &#x60; |            | &#x60;) to determine if a signal should be generated based on the event counts in the previously defined queries. | [optional] |
| **name**          | **String**                         | Name of the case.                                                                                                | [optional] |
| **notifications** | **List&lt;String&gt;**             | Notification targets for each rule case.                                                                         | [optional] |
| **status**        | **SecurityMonitoringRuleSeverity** |                                                                                                                  |
