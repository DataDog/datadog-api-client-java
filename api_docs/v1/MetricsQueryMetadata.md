

# MetricsQueryMetadata

Object containing all metric names returned and their associated metadata.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggr** | **String** | Aggregation type. |  [optional] [readonly]
**displayName** | **String** | Display name of the metric. |  [optional] [readonly]
**end** | **Long** | End of the time window, milliseconds since Unix epoch. |  [optional] [readonly]
**expression** | **String** | Metric expression. |  [optional] [readonly]
**interval** | **Long** | Number of seconds between data samples. |  [optional] [readonly]
**length** | **Long** | Number of data samples. |  [optional] [readonly]
**metric** | **String** | Metric name. |  [optional] [readonly]
**pointlist** | **List&lt;List&lt;Double&gt;&gt;** | List of points of the time series. |  [optional] [readonly]
**scope** | **String** | Metric scope, comma separated list of tags. |  [optional] [readonly]
**start** | **Long** | Start of the time window, milliseconds since Unix epoch. |  [optional] [readonly]
**unit** | [**List&lt;MetricsQueryUnit&gt;**](MetricsQueryUnit.md) | Detailed information about the metric unit. First element describes the \&quot;primary unit\&quot; (for example, &#x60;bytes&#x60; in &#x60;bytes per second&#x60;), second describes the \&quot;per unit\&quot; (for example, &#x60;second&#x60; in &#x60;bytes per second&#x60;). |  [optional] [readonly]



