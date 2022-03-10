# AuditLogsResponseMetadata

The metadata associated with a request.

## Properties

| Name          | Type                                                    | Description                                                                                                            | Notes      |
| ------------- | ------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------- |
| **elapsed**   | **Long**                                                | Time elapsed in milliseconds.                                                                                          | [optional] |
| **page**      | [**AuditLogsResponsePage**](AuditLogsResponsePage.md)   |                                                                                                                        | [optional] |
| **requestId** | **String**                                              | The identifier of the request.                                                                                         | [optional] |
| **status**    | **AuditLogsResponseStatus**                             |                                                                                                                        | [optional] |
| **warnings**  | [**List&lt;AuditLogsWarning&gt;**](AuditLogsWarning.md) | A list of warnings (non-fatal errors) encountered. Partial results may return if warnings are present in the response. | [optional] |
