

# LogContent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** | JSON object of attributes from your log. |  [optional]
**host** | **String** | Name of the machine from where the logs are being sent. |  [optional]
**message** | **String** | The message [reserved attribute](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes) of your log. By default, Datadog ingests the value of the message attribute as the body of the log entry. That value is then highlighted and displayed in the Logstream, where it is indexed for full text search. |  [optional]
**service** | **String** | The name of the application or service generating the log events. It is used to switch from Logs to APM, so make sure you define the same value when you use both products. |  [optional]
**tags** | **List&lt;Object&gt;** | Array of tags associated with your log. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of your log. |  [optional]



