# UsageCIVisibilityHour

CI visibility usage in a given hour.

## Properties

| Name                               | Type        | Description                                                              | Notes      |
| ---------------------------------- | ----------- | ------------------------------------------------------------------------ | ---------- |
| **ciPipelineIndexedSpans**         | **Integer** | The number of spans for pipelines in the queried hour.                   | [optional] |
| **ciTestIndexedSpans**             | **Integer** | The number of spans for tests in the queried hour.                       | [optional] |
| **ciVisibilityComboCommitters**    | **Integer** | The number of combined test and pipeline committers in the queried hour. | [optional] |
| **ciVisibilityPipelineCommitters** | **Integer** | The number of pipeline committers in the queried hour.                   | [optional] |
| **ciVisibilityTestCommitters**     | **Integer** | The number of test committers in the queried hour.                       | [optional] |
| **orgName**                        | **String**  | The organization name.                                                   | [optional] |
| **publicId**                       | **String**  | The organization public ID.                                              | [optional] |
