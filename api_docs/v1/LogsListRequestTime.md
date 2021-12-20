# LogsListRequestTime

Timeframe to retrieve the log from.

## Properties

| Name         | Type               | Description                                                                                                                                    | Notes      |
| ------------ | ------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **from**     | **OffsetDateTime** | Minimum timestamp for requested logs.                                                                                                          |
| **timezone** | **String**         | Timezone can be specified both as an offset (for example \&quot;UTC+03:00\&quot;) or a regional zone (for example \&quot;Europe/Paris\&quot;). | [optional] |
| **to**       | **OffsetDateTime** | Maximum timestamp for requested logs.                                                                                                          |
