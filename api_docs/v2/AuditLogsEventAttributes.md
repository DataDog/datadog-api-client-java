# AuditLogsEventAttributes

JSON object containing all event attributes and their associated values.

## Properties

| Name           | Type                          | Description                                                                                                                                                                            | Notes      |
| -------------- | ----------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **attributes** | **Map&lt;String, Object&gt;** | JSON object of attributes from Audit Logs events.                                                                                                                                      | [optional] |
| **service**    | **String**                    | Name of the application or service generating Audit Logs events. This name is used to correlate Audit Logs to APM, so make sure you specify the same value when you use both products. | [optional] |
| **tags**       | **List&lt;String&gt;**        | Array of tags associated with your event.                                                                                                                                              | [optional] |
| **timestamp**  | **OffsetDateTime**            | Timestamp of your event.                                                                                                                                                               | [optional] |
