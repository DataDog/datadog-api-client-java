# LogsServiceRemapper

Use this processor if you want to assign one or more attributes as the official service. **Note:** If multiple service remapper processors can be applied to a given log, only the first one (according to the pipeline order) is taken into account.

## Properties

| Name          | Type                        | Description                              | Notes      |
| ------------- | --------------------------- | ---------------------------------------- | ---------- |
| **isEnabled** | **Boolean**                 | Whether or not the processor is enabled. | [optional] |
| **name**      | **String**                  | Name of the processor.                   | [optional] |
| **sources**   | **List&lt;String&gt;**      | Array of source attributes.              |
| **type**      | **LogsServiceRemapperType** |                                          |
