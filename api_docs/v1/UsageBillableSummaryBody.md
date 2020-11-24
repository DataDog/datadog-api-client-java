

# UsageBillableSummaryBody

Response with properties for each aggregated usage type.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBillableUsage** | **Long** | The total account usage. |  [optional]
**elapsedUsageHours** | **Long** | Elapsed usage hours for some billable product. |  [optional]
**firstBillableUsageHour** | **OffsetDateTime** | The first billable hour for the org. |  [optional]
**lastBillableUsageHour** | **OffsetDateTime** | The last billable hour for the org. |  [optional]
**orgBillableUsage** | **Long** | The number of units used within the billable timeframe. |  [optional]
**percentageInAccount** | **Double** | The percentage of account usage the org represents. |  [optional]
**usageUnit** | **String** | Units pertaining to the usage. |  [optional]



