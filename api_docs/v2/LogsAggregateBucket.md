# LogsAggregateBucket

A bucket values

## Properties

| Name         | Type                                                                           | Description                                                                                 | Notes      |
| ------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------- | ---------- |
| **by**       | **Map&lt;String, String&gt;**                                                  | The key, value pairs for each group by                                                      | [optional] |
| **computes** | [**Map&lt;String, LogsAggregateBucketValue&gt;**](LogsAggregateBucketValue.md) | A map of the metric name -&gt; value for regular compute or list of values for a timeseries | [optional] |
