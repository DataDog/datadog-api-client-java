

# HistoryServiceLevelObjectiveMetrics

A `metric` based SLO history response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**denominator** | [**HistoryServiceLevelObjectiveMetricsSeries**](HistoryServiceLevelObjectiveMetricsSeries.md) |  |  [optional]
**interval** | **Integer** | The aggregated query interval for the series data. It&#39;s implicit based on the query time window. |  [optional]
**message** | **String** | Optional message if there are specific query issues/warnings. |  [optional]
**numerator** | [**HistoryServiceLevelObjectiveMetricsSeries**](HistoryServiceLevelObjectiveMetricsSeries.md) |  |  [optional]
**query** | **String** | The combined numerator &amp;&amp; denominator query CSV. |  [optional]
**resType** | **String** | The series result type. This mimics &#x60;batch_query&#x60; response type |  [optional]
**respVersion** | **Integer** | The series response version type. This mimics &#x60;batch_query&#x60; response type |  [optional]



