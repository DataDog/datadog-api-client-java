# UsageIngestedSpansHour

Ingested spans usage for a given organization for a given hour.

## Properties

| Name                    | Type               | Description                                                                    | Notes      |
| ----------------------- | ------------------ | ------------------------------------------------------------------------------ | ---------- |
| **hour**                | **OffsetDateTime** | The hour for the usage.                                                        | [optional] |
| **ingestedEventsBytes** | **Long**           | Contains the total number of bytes ingested for APM spans during a given hour. | [optional] |
| **orgName**             | **String**         | The organization name.                                                         | [optional] |
| **publicId**            | **String**         | The organization public ID.                                                    | [optional] |
