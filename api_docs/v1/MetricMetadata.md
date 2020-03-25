

# MetricMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Metric description. |  [optional]
**integration** | **String** | Name of the integration that sent the metric if applicable. |  [optional] [readonly]
**perUnit** | **String** | Per unit of the metric such as &#x60;second&#x60; in &#x60;bytes per second&#x60;. |  [optional]
**shortName** | **String** | A more human-readable and abbreviated version of the metric name. |  [optional]
**statsdInterval** | **Long** | Statsd flush interval of the metric in seconds if applicable. |  [optional]
**type** | **String** | Metric type such as &#x60;gauge&#x60; or &#x60;rate&#x60;. |  [optional]
**unit** | **String** | Primary unit of the metric such as &#x60;byte&#x60; or &#x60;operation&#x60;. |  [optional]



