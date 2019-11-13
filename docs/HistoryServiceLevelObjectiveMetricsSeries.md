

# HistoryServiceLevelObjectiveMetricsSeries

A representation of `metric` based SLO time series for the provided queries. This is the same response type from `batch_query` endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** | Count of submitted metrics |  [optional]
**metadata** | [**HistoryServiceLevelObjectiveMetricsSeriesMetadata**](HistoryServiceLevelObjectiveMetricsSeriesMetadata.md) |  |  [optional]
**sum** | **Double** | Total Sum of the query |  [optional]
**times** | **List&lt;Long&gt;** | The query timestamps in epoch seconds |  [optional]
**values** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The query values |  [optional]



