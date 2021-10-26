

# EventCreateResponse

Object containing an event response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertType** | **EventAlertType** |  |  [optional]
**dateHappened** | **Long** | POSIX timestamp of the event. Must be sent as an integer (i.e. no quotes). Limited to events no older than 7 days. |  [optional]
**deviceName** | **String** | A device name. |  [optional]
**host** | **String** | Host name to associate with the event. Any tags associated with the host are also applied to this event. |  [optional]
**id** | **Long** | Integer ID of the event. |  [optional] [readonly]
**payload** | **String** | Payload of the event. |  [optional] [readonly]
**priority** | **EventPriority** |  |  [optional]
**relatedEventId** | **Long** | ID of the parent event. Must be sent as an integer (i.e. no quotes). |  [optional]
**sourceTypeName** | **String** | The type of event being posted. Option examples include nagios, hudson, jenkins, my_apps, chef, puppet, git, bitbucket, etc. A complete list of source attribute values [available here](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value). |  [optional]
**status** | **String** | A status. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags to apply to the event. |  [optional]
**text** | **String** | The body of the event. Limited to 4000 characters. The text supports markdown. Use &#x60;msg_text&#x60; with the Datadog Ruby library. |  [optional]
**title** | **String** | The event title. Limited to 100 characters. Use &#x60;msg_title&#x60; with the Datadog Ruby library. |  [optional]
**url** | **String** | URL of the event. |  [optional] [readonly]



