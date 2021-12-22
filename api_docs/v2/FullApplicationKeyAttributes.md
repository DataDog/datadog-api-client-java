# FullApplicationKeyAttributes

Attributes of a full application key.

## Properties

| Name          | Type                   | Description                                                                                                                                               | Notes                 |
| ------------- | ---------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------- |
| **createdAt** | **String**             | Creation date of the application key.                                                                                                                     | [optional] [readonly] |
| **key**       | **String**             | The application key.                                                                                                                                      | [optional] [readonly] |
| **last4**     | **String**             | The last four characters of the application key.                                                                                                          | [optional] [readonly] |
| **name**      | **String**             | Name of the application key.                                                                                                                              | [optional]            |
| **scopes**    | **List&lt;String&gt;** | Array of scopes to grant the application key. This feature is in private beta, please contact Datadog support to enable scopes for your application keys. | [optional]            |
