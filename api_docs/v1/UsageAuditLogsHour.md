# UsageAuditLogsHour

Audit logs usage for a given organization for a given hour.

## Properties

| Name             | Type               | Description                                                       | Notes      |
| ---------------- | ------------------ | ----------------------------------------------------------------- | ---------- |
| **hour**         | **OffsetDateTime** | The hour for the usage.                                           | [optional] |
| **linesIndexed** | **Long**           | The total number of audit logs lines indexed during a given hour. | [optional] |
| **orgName**      | **String**         | The organization name.                                            | [optional] |
| **publicId**     | **String**         | The organization public ID.                                       | [optional] |
