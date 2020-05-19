

# LogsMessageRemapper

The message is a key attribute in Datadog. It is displayed in the message column of the Log Explorer and you can do full string search on it. Use this Processor to define one or more attributes as the official log message.  **Note:** If multiple log message remapper processors can be applied to a given log, only the first one (according to the pipeline order) is taken into account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**sources** | **List&lt;String&gt;** | Array of source attributes. | 
**type** | [**LogsMessageRemapperType**](LogsMessageRemapperType.md) |  | 



