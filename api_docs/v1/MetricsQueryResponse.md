

# MetricsQueryResponse

Response Object that includes your query and the list of metrics retrieved.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **String** | Message indicating the errors if status is not &#x60;ok&#x60;. |  [optional] [readonly]
**fromDate** | **Long** | Start of requested time window, milliseconds since Unix epoch. |  [optional] [readonly]
**groupBy** | **List&lt;String&gt;** | List of tag keys on which to group. |  [optional] [readonly]
**message** | **String** | Message indicating &#x60;success&#x60; if status is &#x60;ok&#x60;. |  [optional] [readonly]
**query** | **String** | Query string |  [optional] [readonly]
**resType** | **String** | Type of response. |  [optional] [readonly]
**series** | [**List&lt;MetricsQueryResponseSeries&gt;**](MetricsQueryResponseSeries.md) | List of timeseries queried. |  [optional] [readonly]
**status** | **String** | Status of the query. |  [optional] [readonly]
**toDate** | **Long** | End of requested time window, milliseconds since Unix epoch. |  [optional] [readonly]



