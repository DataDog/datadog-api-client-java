

# AWSLogsListResponse

A list of all Datadog-AWS logs integrations available in your Datadog organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Your AWS Account ID without dashes. |  [optional]
**lambdas** | [**List&lt;AWSLogsLambda&gt;**](AWSLogsLambda.md) | List of ARNs configured in your Datadog account. |  [optional]
**services** | **List&lt;String&gt;** | Array of services IDs. |  [optional]



