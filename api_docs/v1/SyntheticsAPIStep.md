# SyntheticsAPIStep

The steps used in a Synthetics multistep API test.

## Properties

| Name                | Type                                                                    | Description                                                                                                                                           | Notes      |
| ------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **allowFailure**    | **Boolean**                                                             | Determines whether or not to continue with test if this step fails.                                                                                   | [optional] |
| **assertions**      | [**List&lt;SyntheticsAssertion&gt;**](SyntheticsAssertion.md)           | Array of assertions used for the test.                                                                                                                |
| **extractedValues** | [**List&lt;SyntheticsParsingOptions&gt;**](SyntheticsParsingOptions.md) | Array of values to parse and save as variables from the response.                                                                                     | [optional] |
| **isCritical**      | **Boolean**                                                             | Determines whether or not to consider the entire test as failed if this step fails. Can be used only if &#x60;allowFailure&#x60; is &#x60;true&#x60;. | [optional] |
| **name**            | **String**                                                              | The name of the step.                                                                                                                                 |
| **request**         | [**SyntheticsTestRequest**](SyntheticsTestRequest.md)                   |                                                                                                                                                       |
| **retry**           | [**SyntheticsTestOptionsRetry**](SyntheticsTestOptionsRetry.md)         |                                                                                                                                                       | [optional] |
| **subtype**         | **SyntheticsAPIStepSubtype**                                            |                                                                                                                                                       |
