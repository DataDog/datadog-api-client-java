# LogsQueryOptions

Global query options that are used during the query. Note: You should only supply timezone or time offset but not both otherwise the query will fail.

## Properties

| Name           | Type       | Description                                                                            | Notes      |
| -------------- | ---------- | -------------------------------------------------------------------------------------- | ---------- |
| **timeOffset** | **Long**   | The time offset (in seconds) to apply to the query.                                    | [optional] |
| **timezone**   | **String** | The timezone can be specified both as an offset, for example: \&quot;UTC+03:00\&quot;. | [optional] |
