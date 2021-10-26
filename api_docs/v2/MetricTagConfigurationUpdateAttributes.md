# MetricTagConfigurationUpdateAttributes

Object containing the definition of a metric tag configuration to be updated.

## Properties

| Name                   | Type                   | Description                                                                                                                                                                         | Notes      |
| ---------------------- | ---------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **includePercentiles** | **Boolean**            | Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can only be applied to metrics that have a &#x60;metric_type&#x60; of &#x60;distribution&#x60;. | [optional] |
| **tags**               | **List&lt;String&gt;** | A list of tag keys that will be queryable for your metric.                                                                                                                          | [optional] |
