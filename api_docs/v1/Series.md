

# Series

A metric to submit to Datadog. See [Datadog metrics](https://docs.datadoghq.com/developers/metrics/#custom-metrics-properties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | The name of the host that produced the metric. |  [optional]
**interval** | **Long** | If the type of the metric is rate or count, define the corresponding interval. |  [optional]
**metric** | **String** | The name of the timeseries. | 
**points** | **List&lt;List&lt;Double&gt;&gt;** | Points relating to a metric. All points must be tuples with timestamp and a scalar value (cannot be a string). Timestamps should be in POSIX time in seconds, and cannot be more than ten minutes in the future or more than one hour in the past. | 
**tags** | **List&lt;String&gt;** | A list of tags associated with the metric. |  [optional]
**type** | **String** | The type of the metric either &#x60;count&#x60;, &#x60;gauge&#x60;, or &#x60;rate&#x60;. |  [optional]



