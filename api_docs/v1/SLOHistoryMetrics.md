

# SLOHistoryMetrics

A `metric` based SLO history response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**denominator** | [**SLOHistoryMetricsSeries**](SLOHistoryMetricsSeries.md) |  | 
**interval** | **Long** | The aggregated query interval for the series data. It&#39;s implicit based on the query time window. | 
**message** | **String** | Optional message if there are specific query issues/warnings. |  [optional]
**numerator** | [**SLOHistoryMetricsSeries**](SLOHistoryMetricsSeries.md) |  | 
**query** | **String** | The combined numerator and denominator query CSV. | 
**resType** | **String** | The series result type. This mimics &#x60;batch_query&#x60; response type. | 
**respVersion** | **Long** | The series response version type. This mimics &#x60;batch_query&#x60; response type. | 
**times** | **List&lt;Double&gt;** | The query timestamps in epoch milliseconds. | 



