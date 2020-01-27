

# Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationKey** | **String** | An arbitrary string to use for aggregation. Limited to 100 characters. If you specify a key, all events using that key are grouped together in the Event Stream. |  [optional]
**alertType** | [**AlertTypeEnum**](#AlertTypeEnum) | If it is an alert event, set its type between: error, warning, info, and success. |  [optional]
**dateHappened** | **Long** | POSIX timestamp of the event. Must be sent as an integer (i.e. no quotes). Limited to events no older than 1 year, 24 days (389 days) |  [optional]
**deviceName** | **List&lt;String&gt;** | A list of device names to post the event with. |  [optional]
**host** | **String** | Host name to associate with the event. Any tags associated with the host are also applied to this event. |  [optional]
**id** | **Long** |  |  [optional] [readonly]
**payload** | **String** |  |  [optional] [readonly]
**priority** | [**PriorityEnum**](#PriorityEnum) | The priority of the event: normal or low. |  [optional]
**relatedEventId** | **Long** | ID of the parent event. Must be sent as an integer (i.e. no quotes). |  [optional]
**sourceTypeName** | **String** | The type of event being posted. Options: nagios, hudson, jenkins, my_apps, chef, puppet, git, bitbucket, ... [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags to apply to the event. |  [optional]
**text** | **String** | The body of the event. Limited to 4000 characters. The text supports markdown. Use msg_text with the Datadog Ruby library | 
**title** | **String** | The event title. Limited to 100 characters. Use msg_title with the Datadog Ruby library. | 
**url** | **String** |  |  [optional] [readonly]



## Enum: AlertTypeEnum

Name | Value
---- | -----
ERROR | &quot;error&quot;
WARNING | &quot;warning&quot;
INFO | &quot;info&quot;
SUCCESS | &quot;success&quot;



## Enum: PriorityEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
LOW | &quot;low&quot;



