

# WebhooksIntegrationCustomVariableResponse

Custom variable for Webhook integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSecret** | **Boolean** | Make custom variable is secret or not. If the custom variable is secret, the value is not returned in the response payload. | 
**name** | **String** | The name of the variable. It corresponds with &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;. It must only contains upper-case characters, integers or underscores. | 
**value** | **String** | Value of the custom variable. It won&#39;t be returned if the variable is secret. |  [optional]



