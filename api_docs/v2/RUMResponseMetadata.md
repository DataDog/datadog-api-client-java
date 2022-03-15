# RUMResponseMetadata

The metadata associated with a request.

## Properties

| Name          | Type                                        | Description                                                                                                            | Notes      |
| ------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------- |
| **elapsed**   | **Long**                                    | The time elapsed in milliseconds.                                                                                      | [optional] |
| **page**      | [**RUMResponsePage**](RUMResponsePage.md)   |                                                                                                                        | [optional] |
| **requestId** | **String**                                  | The identifier of the request.                                                                                         | [optional] |
| **status**    | **RUMResponseStatus**                       |                                                                                                                        | [optional] |
| **warnings**  | [**List&lt;RUMWarning&gt;**](RUMWarning.md) | A list of warnings (non-fatal errors) encountered. Partial results may return if warnings are present in the response. | [optional] |
