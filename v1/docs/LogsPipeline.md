

# LogsPipeline

Pipelines and processors operate on incoming logs, parsing and transforming them into structured attributes for easier querying.  **Note**: These endpoints are only available for admin users. Make sure to use an application key created by an admin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**LogsFilter**](LogsFilter.md) |  |  [optional]
**id** | **String** | ID of the pipeline. |  [optional] [readonly]
**isEnabled** | **Boolean** | Whether or not the pipeline is enabled. |  [optional]
**isReadOnly** | **Boolean** | Whether or not the pipeline can be edited. |  [optional] [readonly]
**name** | **String** | Name of the pipeline. | 
**processors** | [**List&lt;LogsProcessor&gt;**](LogsProcessor.md) | Ordered list of processors in this pipeline. |  [optional]
**type** | **String** | Type of pipeline. |  [optional] [readonly]



