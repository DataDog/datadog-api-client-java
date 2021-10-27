# LogsByRetention

Object containing logs usage data broken down by retention period.

## Properties

| Name             | Type                                                                    | Description                                                       | Notes      |
| ---------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------- | ---------- |
| **orgs**         | [**LogsByRetentionOrgs**](LogsByRetentionOrgs.md)                       |                                                                   | [optional] |
| **usage**        | [**List&lt;LogsRetentionAggSumUsage&gt;**](LogsRetentionAggSumUsage.md) | Aggregated index logs usage for each retention period with usage. | [optional] |
| **usageByMonth** | [**LogsByRetentionMonthlyUsage**](LogsByRetentionMonthlyUsage.md)       |                                                                   | [optional] |
