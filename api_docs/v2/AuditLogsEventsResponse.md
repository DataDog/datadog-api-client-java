# AuditLogsEventsResponse

Response object with all events matching the request and pagination information.

## Properties

| Name      | Type                                                          | Description                           | Notes      |
| --------- | ------------------------------------------------------------- | ------------------------------------- | ---------- |
| **data**  | [**List&lt;AuditLogsEvent&gt;**](AuditLogsEvent.md)           | Array of events matching the request. | [optional] |
| **links** | [**AuditLogsResponseLinks**](AuditLogsResponseLinks.md)       |                                       | [optional] |
| **meta**  | [**AuditLogsResponseMetadata**](AuditLogsResponseMetadata.md) |                                       | [optional] |
