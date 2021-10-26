# WebhooksIntegrationUpdateRequest

Update request of a Webhooks integration object. _All properties are optional._

## Properties

| Name              | Type                            | Description                                                                                                                                                                                                                 | Notes      |
| ----------------- | ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **customHeaders** | **String**                      | If &#x60;null&#x60;, uses no header. If given a JSON payload, these will be headers attached to your webhook.                                                                                                               | [optional] |
| **encodeAs**      | **WebhooksIntegrationEncoding** |                                                                                                                                                                                                                             | [optional] |
| **name**          | **String**                      | The name of the webhook. It corresponds with &#x60;&lt;WEBHOOK_NAME&gt;&#x60;. Learn more on how to use it in [monitor notifications](https://docs.datadoghq.com/monitors/notify).                                          | [optional] |
| **payload**       | **String**                      | If &#x60;null&#x60;, uses the default payload. If given a JSON payload, the webhook returns the payload specified by the given payload. [Webhooks variable usage](https://docs.datadoghq.com/integrations/webhooks/#usage). | [optional] |
| **url**           | **String**                      | URL of the webhook.                                                                                                                                                                                                         | [optional] |
