# LogsQueryFilter

The search and filter query settings

## Properties

| Name        | Type                   | Description                                                                                                    | Notes      |
| ----------- | ---------------------- | -------------------------------------------------------------------------------------------------------------- | ---------- |
| **from**    | **String**             | The minimum time for the requested logs, supports date math and regular timestamps                             | [optional] |
| **indexes** | **List&lt;String&gt;** | For customers with multiple indexes, the indexes to search. Defaults to [&#39;*&#39;] which means all indexes. | [optional] |
| **query**   | **String**             | The search query - following the log search syntax.                                                            | [optional] |
| **to**      | **String**             | The maximum time for the requested logs, supports date math and regular timestamps                             | [optional] |
