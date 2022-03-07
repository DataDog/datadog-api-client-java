# RUMQueryOptions

Global query options that are used during the query. Note: Only supply timezone or time offset, not both. Otherwise, the query fails.

## Properties

| Name           | Type       | Description                                                                            | Notes      |
| -------------- | ---------- | -------------------------------------------------------------------------------------- | ---------- |
| **timeOffset** | **Long**   | The time offset (in seconds) to apply to the query.                                    | [optional] |
| **timezone**   | **String** | The timezone can be specified both as an offset, for example: \&quot;UTC+03:00\&quot;. | [optional] |
