

# LogQueryDefinition

List of logs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compute** | [**LogsQueryCompute**](LogsQueryCompute.md) |  |  [optional]
**groupBy** | [**List&lt;LogQueryDefinitionGroupBy&gt;**](LogQueryDefinitionGroupBy.md) | List of tag prefixes to group by in the case of a cluster check. |  [optional]
**index** | **String** | A coma separated-list of index names. Use \&quot;*\&quot; query all indexes at once. [Multiple Indexes](https://docs.datadoghq.com/logs/indexes/#multiple-indexes) |  [optional]
**multiCompute** | [**List&lt;LogsQueryCompute&gt;**](LogsQueryCompute.md) | This field is mutually exclusive with &#x60;compute&#x60;. |  [optional]
**search** | [**LogQueryDefinitionSearch**](LogQueryDefinitionSearch.md) |  |  [optional]



