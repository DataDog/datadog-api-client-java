

# LogsIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dailyLimit** | **Long** | The number of log-events you can send in this index per day before you are rate-limited. |  [optional] [readonly]
**exclusionFilters** | [**List&lt;LogsExclusion&gt;**](LogsExclusion.md) | An array of exclusion objects. The logs are tested against the query of each filter, following the order of the array. Only the first matching active exclusion matters, others (if any) are ignored. |  [optional]
**filter** | [**LogsFilter**](LogsFilter.md) |  | 
**isRateLimited** | **Boolean** | A boolean stating if the index is rate limited, meaning more logs than the daily limit have been sent. Rate limit is reset every-day at 2pm UTC. |  [optional] [readonly]
**name** | **String** | The name of the index. |  [optional] [readonly]
**numRetentionDays** | **Long** | The number of days before logs are deleted from this index |  [optional] [readonly]



