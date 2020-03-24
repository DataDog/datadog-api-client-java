

# HistoryServiceLevelObjectiveMetricsSeries

A representation of `metric` based SLO time series for the provided queries. This is the same response type from `batch_query` endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** | Count of submitted metrics. | 
**metadata** | [**HistoryServiceLevelObjectiveMetricsSeriesMetadata**](HistoryServiceLevelObjectiveMetricsSeriesMetadata.md) |  | 
**sum** | **Double** | Total Sum of the query. | 
**values** | **List&lt;Double&gt;** | The query values. | 



