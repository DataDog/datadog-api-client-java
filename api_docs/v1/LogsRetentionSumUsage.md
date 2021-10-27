# LogsRetentionSumUsage

Object containing indexed logs usage grouped by retention period and summed.

## Properties

| Name                                  | Type       | Description                                                                            | Notes      |
| ------------------------------------- | ---------- | -------------------------------------------------------------------------------------- | ---------- |
| **logsIndexedLogsUsageSum**           | **Long**   | Total indexed logs for this retention period.                                          | [optional] |
| **logsLiveIndexedLogsUsageSum**       | **Long**   | Live indexed logs for this retention period.                                           | [optional] |
| **logsRehydratedIndexedLogsUsageSum** | **Long**   | Rehydrated indexed logs for this retention period.                                     | [optional] |
| **retention**                         | **String** | The retention period in days or \&quot;custom\&quot; for all custom retention periods. | [optional] |
