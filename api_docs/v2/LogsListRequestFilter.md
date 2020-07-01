

# LogsListRequestFilter

Search filters for listing logs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**OffsetDateTime**](OffsetDateTime.md) | Minimum timestamp for requested logs. |  [optional]
**indexes** | **List&lt;String&gt;** | For customers with multiple indexes, the indexes to search. Defaults to &#39;*&#39; which means all indexes. |  [optional]
**query** | **String** | Search query following logs syntax. |  [optional]
**to** | [**OffsetDateTime**](OffsetDateTime.md) | Maximum timestamp for requested logs. |  [optional]



