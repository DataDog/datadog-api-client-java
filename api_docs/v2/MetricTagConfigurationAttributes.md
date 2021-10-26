# MetricTagConfigurationAttributes

Object containing the definition of a metric tag configuration attributes.

## Properties

| Name                   | Type                                  | Description                                                                                                                                        | Notes      |
| ---------------------- | ------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **createdAt**          | **OffsetDateTime**                    | Timestamp when the tag configuration was created.                                                                                                  | [optional] |
| **includePercentiles** | **Boolean**                           | Toggle to turn on/off percentile aggregations for distribution metrics. Only present when the &#x60;metric_type&#x60; is &#x60;distribution&#x60;. | [optional] |
| **metricType**         | **MetricTagConfigurationMetricTypes** |                                                                                                                                                    | [optional] |
| **modifiedAt**         | **OffsetDateTime**                    | Timestamp when the tag configuration was last modified.                                                                                            | [optional] |
| **tags**               | **List&lt;String&gt;**                | List of tag keys on which to group.                                                                                                                | [optional] |
