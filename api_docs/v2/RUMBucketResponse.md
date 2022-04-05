# RUMBucketResponse

Bucket values.

## Properties

| Name         | Type                                                                         | Description                                                                                  | Notes      |
| ------------ | ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | ---------- |
| **by**       | **Map&lt;String, String&gt;**                                                | The key-value pairs for each group-by.                                                       | [optional] |
| **computes** | [**Map&lt;String, RUMAggregateBucketValue&gt;**](RUMAggregateBucketValue.md) | A map of the metric name to value for regular compute, or a list of values for a timeseries. | [optional] |
