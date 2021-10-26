# LogsPipelineProcessor

Nested Pipelines are pipelines within a pipeline. Use Nested Pipelines to split the processing into two steps. For example, first use a high-level filtering such as team and then a second level of filtering based on the integration, service, or any other tag or attribute. A pipeline can contain Nested Pipelines and Processors whereas a Nested Pipeline can only contain Processors.

## Properties

| Name           | Type                                              | Description                                  | Notes      |
| -------------- | ------------------------------------------------- | -------------------------------------------- | ---------- |
| **filter**     | [**LogsFilter**](LogsFilter.md)                   |                                              | [optional] |
| **isEnabled**  | **Boolean**                                       | Whether or not the processor is enabled.     | [optional] |
| **name**       | **String**                                        | Name of the processor.                       | [optional] |
| **processors** | [**List&lt;LogsProcessor&gt;**](LogsProcessor.md) | Ordered list of processors in this pipeline. | [optional] |
| **type**       | **LogsPipelineProcessorType**                     |                                              |
