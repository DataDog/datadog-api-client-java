

# LogsAggregateRequest

The object sent with the request to retrieve a list of logs from your organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compute** | [**List&lt;LogsCompute&gt;**](LogsCompute.md) | The list of metrics or timeseries to compute for the retrieved buckets. |  [optional]
**filter** | [**LogsQueryFilter**](LogsQueryFilter.md) |  |  [optional]
**groupBy** | [**List&lt;LogsGroupBy&gt;**](LogsGroupBy.md) | The rules for the group by |  [optional]
**options** | [**LogsQueryOptions**](LogsQueryOptions.md) |  |  [optional]
**page** | [**LogsAggregateRequestPage**](LogsAggregateRequestPage.md) |  |  [optional]



