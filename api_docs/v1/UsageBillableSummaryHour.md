# UsageBillableSummaryHour

Response with monthly summary of data billed by Datadog.

## Properties

| Name             | Type                                                        | Description                                   | Notes      |
| ---------------- | ----------------------------------------------------------- | --------------------------------------------- | ---------- |
| **billingPlan**  | **String**                                                  | The billing plan.                             | [optional] |
| **endDate**      | **OffsetDateTime**                                          | Shows the last date of usage.                 | [optional] |
| **numOrgs**      | **Long**                                                    | The number of organizations.                  | [optional] |
| **orgName**      | **String**                                                  | The organization name.                        | [optional] |
| **publicId**     | **String**                                                  | The organization public ID.                   | [optional] |
| **ratioInMonth** | **Long**                                                    | Shows usage aggregation for a billing period. | [optional] |
| **startDate**    | **OffsetDateTime**                                          | Shows the first date of usage.                | [optional] |
| **usage**        | [**UsageBillableSummaryKeys**](UsageBillableSummaryKeys.md) |                                               | [optional] |
