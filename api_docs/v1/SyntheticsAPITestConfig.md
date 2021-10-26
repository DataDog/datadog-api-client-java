

# SyntheticsAPITestConfig

Configuration object for a Synthetic API test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assertions** | [**List&lt;SyntheticsAssertion&gt;**](SyntheticsAssertion.md) | Array of assertions used for the test. |  [optional]
**configVariables** | [**List&lt;SyntheticsConfigVariable&gt;**](SyntheticsConfigVariable.md) | Array of variables used for the test. |  [optional]
**request** | [**SyntheticsTestRequest**](SyntheticsTestRequest.md) |  |  [optional]
**steps** | [**List&lt;SyntheticsAPIStep&gt;**](SyntheticsAPIStep.md) | When the test subtype is &#x60;multi&#x60;, the steps of the test. |  [optional]



