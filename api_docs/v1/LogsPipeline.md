

# LogsPipeline

Definition of a logs pipeline
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**LogsFilter**](LogsFilter.md) |  |  [optional]
**id** | **String** | ID of the pipeline |  [optional] [readonly]
**isEnabled** | **Boolean** | Whether or not the pipeline is enabled |  [optional]
**isReadOnly** | **Boolean** | Whether or not the pipeline can be edited |  [optional] [readonly]
**name** | **String** | Name of the pipeline | 
**processors** | [**List&lt;LogsProcessor&gt;**](LogsProcessor.md) | Ordered list of processors in this pipeline |  [optional]
**type** | **String** | Type of pipeline |  [optional] [readonly]



