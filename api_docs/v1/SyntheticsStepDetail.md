

# SyntheticsStepDetail

Object describing a step for a Synthetic test.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browserErrors** | [**List&lt;SyntheticsBrowserError&gt;**](SyntheticsBrowserError.md) | Array of errors collected for a browser test. |  [optional]
**checkType** | [**SyntheticsCheckType**](SyntheticsCheckType.md) |  |  [optional]
**description** | **String** | Description of the test. |  [optional]
**duration** | **Double** | Total duration in millisecond of the test. |  [optional]
**error** | **String** | Error returned by the test. |  [optional]
**playingTab** | [**SyntheticsPlayingTab**](SyntheticsPlayingTab.md) |  |  [optional]
**resources** | [**List&lt;SyntheticsResource&gt;**](SyntheticsResource.md) | Array of resources collected by the test. |  [optional]
**screenshotBucketKey** | **Boolean** | Whether or not screenshots where collected by the test. |  [optional]
**skipped** | **Boolean** | Whether or not to skip this step. |  [optional]
**snapshotBucketKey** | **Boolean** | Whether or not snapshots where colelcted by the test. |  [optional]
**stepId** | **Long** | The step ID. |  [optional]
**subTestStepDetails** | [**List&lt;SyntheticsStepDetail&gt;**](SyntheticsStepDetail.md) | If this steps include a sub-test. [Subtests documentation](https://docs.datadoghq.com/synthetics/browser_tests/advanced_options/#subtests). |  [optional]
**timeToInteractive** | **Double** | Time before starting the step. |  [optional]
**type** | [**SyntheticsStepType**](SyntheticsStepType.md) |  |  [optional]
**url** | **String** | URL to perform the step against. |  [optional]
**value** | [**Object**](.md) | Value for the step. |  [optional]
**warnings** | [**List&lt;SyntheticsStepDetailWarnings&gt;**](SyntheticsStepDetailWarnings.md) | Warning collected that didn&#39;t failed the step. |  [optional]



