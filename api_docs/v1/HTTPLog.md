

# HTTPLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ddsource** | **String** | The integration name associated with your log: the technology from which the log originated. When it matches an integration name, Datadog automatically installs the corresponding parsers and facets. See [reserved attribute](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes). |  [optional]
**ddtags** | **String** | Tags associated with your logs. |  [optional]
**hostname** | **String** | The name of the originating host of the log. |  [optional]
**message** | **String** | The message [reserved attribute](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes) of your log. By default, Datadog ingests the value of the message attribute as the body of the log entry. That value is then highlighted and displayed in the Logstream, where it is indexed for full text search. |  [optional]



