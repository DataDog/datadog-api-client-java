# RUMAggregateRequest

The object sent with the request to retrieve aggregation buckets of RUM events from your organization.

## Properties

| Name        | Type                                              | Description                                                             | Notes      |
| ----------- | ------------------------------------------------- | ----------------------------------------------------------------------- | ---------- |
| **compute** | [**List&lt;RUMCompute&gt;**](RUMCompute.md)       | The list of metrics or timeseries to compute for the retrieved buckets. | [optional] |
| **filter**  | [**RUMQueryFilter**](RUMQueryFilter.md)           |                                                                         | [optional] |
| **groupBy** | [**List&lt;RUMGroupBy&gt;**](RUMGroupBy.md)       | The rules for the group by.                                             | [optional] |
| **options** | [**RUMQueryOptions**](RUMQueryOptions.md)         |                                                                         | [optional] |
| **page**    | [**RUMQueryPageOptions**](RUMQueryPageOptions.md) |                                                                         | [optional] |
