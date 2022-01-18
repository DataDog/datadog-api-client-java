# SyntheticsBrowserTest

Object containing details about a Synthetic browser test.

## Properties

| Name          | Type                                                              | Description                                                                                   | Notes                 |
| ------------- | ----------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------- |
| **config**    | [**SyntheticsBrowserTestConfig**](SyntheticsBrowserTestConfig.md) |                                                                                               |
| **locations** | **List&lt;String&gt;**                                            | Array of locations used to run the test.                                                      |
| **message**   | **String**                                                        | Notification message associated with the test. Message can either be text or an empty string. | [optional]            |
| **monitorId** | **Long**                                                          | The associated monitor ID.                                                                    | [optional] [readonly] |
| **name**      | **String**                                                        | Name of the test.                                                                             |
| **options**   | [**SyntheticsTestOptions**](SyntheticsTestOptions.md)             |                                                                                               |
| **publicId**  | **String**                                                        | The public ID of the test.                                                                    | [optional] [readonly] |
| **status**    | **SyntheticsTestPauseStatus**                                     |                                                                                               | [optional]            |
| **steps**     | [**List&lt;SyntheticsStep&gt;**](SyntheticsStep.md)               | The steps of the test.                                                                        | [optional]            |
| **tags**      | **List&lt;String&gt;**                                            | Array of tags attached to the test.                                                           | [optional]            |
| **type**      | **SyntheticsBrowserTestType**                                     |                                                                                               |
