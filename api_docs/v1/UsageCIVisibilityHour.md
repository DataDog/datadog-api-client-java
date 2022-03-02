# UsageCIVisibilityHour

CI visibility usage in a given hour.

## Properties

| Name                               | Type        | Description                                                                                                                                                    | Notes      |
| ---------------------------------- | ----------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **ciPipelineIndexedSpans**         | **Integer** | The number of spans for pipelines in the queried hour.                                                                                                         | [optional] |
| **ciTestIndexedSpans**             | **Integer** | The number of spans for tests in the queried hour.                                                                                                             | [optional] |
| **ciVisibilityPipelineCommitters** | **Integer** | Shows the total count of all active Git committers for Pipelines in the current month. A committer is active if they commit at least 3 times in a given month. | [optional] |
| **ciVisibilityTestCommitters**     | **Integer** | The total count of all active Git committers for tests in the current month. A committer is active if they commit at least 3 times in a given month.           | [optional] |
| **orgName**                        | **String**  | The organization name.                                                                                                                                         | [optional] |
| **publicId**                       | **String**  | The organization public ID.                                                                                                                                    | [optional] |
