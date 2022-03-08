# RUMEventAttributes

JSON object containing all event attributes and their associated values.

## Properties

| Name           | Type                          | Description                                                                                                                                                            | Notes      |
| -------------- | ----------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **attributes** | **Map&lt;String, Object&gt;** | JSON object of attributes from RUM events.                                                                                                                             | [optional] |
| **service**    | **String**                    | The name of the application or service generating RUM events. It is used to switch from RUM to APM, so make sure you define the same value when you use both products. | [optional] |
| **tags**       | **List&lt;String&gt;**        | Array of tags associated with your event.                                                                                                                              | [optional] |
| **timestamp**  | **OffsetDateTime**            | Timestamp of your event.                                                                                                                                               | [optional] |
