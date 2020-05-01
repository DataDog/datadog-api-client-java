

# GraphSnapshot

Object representing a graph snapshot.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**graphDef** | **String** | A JSON document defining the graph. &#x60;graph_def&#x60; can be used instead of &#x60;metric_query&#x60;. The JSON document uses the [grammar defined here](https://docs.datadoghq.com/graphing/graphing_json/#grammar) and should be formatted to a single line then URLEncoded. |  [optional]
**metricQuery** | **String** | The metric query. One of &#x60;metric_query&#x60; or &#x60;graph_def&#x60; is required. |  [optional]
**snapshotUrl** | **String** | URL of your [graph snapshot](https://docs.datadoghq.com/metrics/explorer/#snapshot). |  [optional]



