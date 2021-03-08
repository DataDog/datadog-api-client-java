

# SyntheticsStepDetail

Object describing a step for a Synthetic test.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browserErrors** | [**List&lt;SyntheticsBrowserError&gt;**](SyntheticsBrowserError.md) | Array of errors collected for a browser test. |  [optional]
**checkType** | **SyntheticsCheckType** |  |  [optional]
**description** | **String** | Description of the test. |  [optional]
**duration** | **Double** | Total duration in millisecond of the test. |  [optional]
**error** | **String** | Error returned by the test. |  [optional]
**playingTab** | **SyntheticsPlayingTab** |  |  [optional]
**screenshotBucketKey** | **Boolean** | Whether or not screenshots where collected by the test. |  [optional]
**skipped** | **Boolean** | Whether or not to skip this step. |  [optional]
**snapshotBucketKey** | **Boolean** | Whether or not snapshots where collected by the test. |  [optional]
**stepId** | **Long** | The step ID. |  [optional]
**subTestStepDetails** | [**List&lt;SyntheticsStepDetail&gt;**](SyntheticsStepDetail.md) | If this steps include a sub-test. [Subtests documentation](https://docs.datadoghq.com/synthetics/browser_tests/advanced_options/#subtests). |  [optional]
**timeToInteractive** | **Double** | Time before starting the step. |  [optional]
**type** | **SyntheticsStepType** |  |  [optional]
**url** | **String** | URL to perform the step against. |  [optional]
**value** | **Object** | Value for the step. |  [optional]
**vitalsMetrics** | [**List&lt;SyntheticsCoreWebVitals&gt;**](SyntheticsCoreWebVitals.md) | Array of Core Web Vitals metrics for the step. |  [optional]
**warnings** | [**List&lt;SyntheticsStepDetailWarning&gt;**](SyntheticsStepDetailWarning.md) | Warning collected that didn&#39;t failed the step. |  [optional]



