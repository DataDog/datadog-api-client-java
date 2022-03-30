# UsageIngestedSpansHour

Ingested spans usage for a given organization for a given hour.

## Properties

| Name                           | Type               | Description                                                                                                                                                                     | Notes      |
| ------------------------------ | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **hour**                       | **OffsetDateTime** | The hour for the usage.                                                                                                                                                         | [optional] |
| **ingestedEventsBytes**        | **Long**           | Use &#x60;ingested_spans_billable_bytes&#x60; as of 2022-03-01. Contains the total number of bytes ingested during a given hour using an old method of calculating span volume. | [optional] |
| **ingestedSpansBillableBytes** | **Long**           | Contains the total number of bytes ingested during a given hour.                                                                                                                | [optional] |
| **orgName**                    | **String**         | The organization name.                                                                                                                                                          | [optional] |
| **publicId**                   | **String**         | The organization public ID.                                                                                                                                                     | [optional] |
