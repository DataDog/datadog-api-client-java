

# SLOHistoryMetricsSeries

A representation of `metric` based SLO time series for the provided queries. This is the same response type from `batch_query` endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** | Count of submitted metrics. | 
**metadata** | [**SLOHistoryMetricsSeriesMetadata**](SLOHistoryMetricsSeriesMetadata.md) |  | 
**sum** | **Double** | Total sum of the query. | 
**values** | **List&lt;Double&gt;** | The query values for each metric. | 



