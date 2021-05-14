

# SyntheticsTestDetails

Object containing details about your Synthetic test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**SyntheticsTestConfig**](SyntheticsTestConfig.md) |  |  [optional]
**locations** | **List&lt;String&gt;** | Array of locations used to run the test. |  [optional]
**message** | **String** | Notification message associated with the test. |  [optional]
**monitorId** | **Long** | The associated monitor ID. |  [optional] [readonly]
**name** | **String** | Name of the test. |  [optional]
**options** | [**SyntheticsTestOptions**](SyntheticsTestOptions.md) |  |  [optional]
**publicId** | **String** | The test public ID. |  [optional] [readonly]
**status** | **SyntheticsTestPauseStatus** |  |  [optional]
**steps** | [**List&lt;SyntheticsStep&gt;**](SyntheticsStep.md) | For browser test, the steps of the test. |  [optional]
**subtype** | **SyntheticsTestDetailsSubType** |  |  [optional]
**tags** | **List&lt;String&gt;** | Array of tags attached to the test. |  [optional]
**type** | **SyntheticsTestDetailsType** |  |  [optional]



