# AuditLogsQueryOptions

Global query options that are used during the query. Note: Specify either timezone or time offset, not both. Otherwise, the query fails.

## Properties

| Name           | Type       | Description                                                                         | Notes      |
| -------------- | ---------- | ----------------------------------------------------------------------------------- | ---------- |
| **timeOffset** | **Long**   | Time offset (in seconds) to apply to the query.                                     | [optional] |
| **timezone**   | **String** | Timezone code. Can be specified as an offset, for example: \&quot;UTC+03:00\&quot;. | [optional] |
