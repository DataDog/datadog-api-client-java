# SyntheticsBrowserTestResultData

Object containing results for your Synthetic browser test.

## Properties

| Name                    | Type                                                            | Description                                                                         | Notes      |
| ----------------------- | --------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ---------- |
| **browserType**         | **String**                                                      | Type of browser device used for the browser test.                                   | [optional] |
| **browserVersion**      | **String**                                                      | Browser version used for the browser test.                                          | [optional] |
| **device**              | [**SyntheticsDevice**](SyntheticsDevice.md)                     |                                                                                     | [optional] |
| **duration**            | **Double**                                                      | Global duration in second of the browser test.                                      | [optional] |
| **error**               | **String**                                                      | Error returned for the browser test.                                                | [optional] |
| **passed**              | **Boolean**                                                     | Whether or not the browser test was conducted.                                      | [optional] |
| **receivedEmailCount**  | **Long**                                                        | The amount of email received during the browser test.                               | [optional] |
| **startUrl**            | **String**                                                      | Starting URL for the browser test.                                                  | [optional] |
| **stepDetails**         | [**List&lt;SyntheticsStepDetail&gt;**](SyntheticsStepDetail.md) | Array containing the different browser test steps.                                  | [optional] |
| **thumbnailsBucketKey** | **Boolean**                                                     | Whether or not a thumbnail is associated with the browser test.                     | [optional] |
| **timeToInteractive**   | **Double**                                                      | Time in second to wait before the browser test starts after reaching the start URL. | [optional] |
