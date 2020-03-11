

# LogsDateRemapper

As Datadog receives logs, it timestamps them using the value(s) from any of these default attributes:    - timestamp    - date    - _timestamp    - Timestamp    - eventTime    - published_date     If your logs put their dates in an attribute not in this list, use the log date Remapper Processor to define their date attribute as the official log timestamp.   The recognized date formats are: ISO8601, UNIX (the milliseconds EPOCH format), and RFC3164.    **Note:**      - If your logs don’t contain any of the default attributes and you haven’t defined your own date attribute, Datadog timestamps the logs with the date it received them.      - If multiple log date remapper processors can be applied to a given log, only the first one (according to the pipelines order) is taken into account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | **List&lt;String&gt;** | Array of source attributes. | 
**type** | **String** | Type of processor |  [optional] [readonly]
**isEnabled** | **Boolean** | Whether or not the processor is enabled |  [optional]
**name** | **String** | Name of the processor |  [optional]


## Implemented Interfaces

* LogsProcessor


