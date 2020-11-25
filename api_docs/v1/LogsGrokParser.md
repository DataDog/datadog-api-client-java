

# LogsGrokParser

Create custom grok rules to parse the full message or [a specific attribute of your raw event](https://docs.datadoghq.com/logs/processing/parsing/#advanced-settings). For more information, see the [parsing section](https://docs.datadoghq.com/logs/processing/parsing).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grok** | [**LogsGrokParserRules**](LogsGrokParserRules.md) |  | 
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**samples** | **List&lt;String&gt;** | List of sample logs to test this grok parser. |  [optional]
**source** | **String** | Name of the log attribute to parse. | 
**type** | **LogsGrokParserType** |  | 



