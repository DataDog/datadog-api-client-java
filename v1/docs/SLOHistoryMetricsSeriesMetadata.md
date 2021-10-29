

# SLOHistoryMetricsSeriesMetadata

Query metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggr** | **String** | Query aggregator function. |  [optional]
**expression** | **String** | Query expression. |  [optional]
**metric** | **String** | Query metric used. |  [optional]
**queryIndex** | **Long** | Query index from original combined query. |  [optional]
**scope** | **String** | Query scope. |  [optional]
**unit** | [**List&lt;SLOHistoryMetricsSeriesMetadataUnit&gt;**](SLOHistoryMetricsSeriesMetadataUnit.md) | An array of metric units that contains up to two unit objects. For example, bytes represents one unit object and bytes per second represents two unit objects. If a metric query only has one unit object, the second array element is null. |  [optional]



