# SyntheticsAPITest

Object containing details about a Synthetic API test.

## Properties

| Name          | Type                                                      | Description                                    | Notes                 |
| ------------- | --------------------------------------------------------- | ---------------------------------------------- | --------------------- |
| **config**    | [**SyntheticsAPITestConfig**](SyntheticsAPITestConfig.md) |                                                |
| **locations** | **List&lt;String&gt;**                                    | Array of locations used to run the test.       |
| **message**   | **String**                                                | Notification message associated with the test. | [optional]            |
| **monitorId** | **Long**                                                  | The associated monitor ID.                     | [optional] [readonly] |
| **name**      | **String**                                                | Name of the test.                              |
| **options**   | [**SyntheticsTestOptions**](SyntheticsTestOptions.md)     |                                                |
| **publicId**  | **String**                                                | The public ID for the test.                    | [optional] [readonly] |
| **status**    | **SyntheticsTestPauseStatus**                             |                                                | [optional]            |
| **subtype**   | **SyntheticsTestDetailsSubType**                          |                                                | [optional]            |
| **tags**      | **List&lt;String&gt;**                                    | Array of tags attached to the test.            | [optional]            |
| **type**      | **SyntheticsAPITestType**                                 |                                                |
