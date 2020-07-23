

# SecurityMonitoringSignalAttributes

JSON object containing all signal attributes and their associated values.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** | JSON object of attributes in the security signal. |  [optional]
**message** | **String** | The message the security signal, defined by the rule which which generated the signal. |  [optional]
**tags** | **List&lt;Object&gt;** | Array of tags associated with the security signal. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the security signal. |  [optional]



