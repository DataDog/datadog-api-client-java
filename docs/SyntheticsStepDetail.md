

# SyntheticsStepDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browserErrors** | [**List&lt;SyntheticsBrowserError&gt;**](SyntheticsBrowserError.md) |  |  [optional]
**checkType** | [**SyntheticsCheckType**](SyntheticsCheckType.md) |  |  [optional]
**description** | **String** |  |  [optional]
**duration** | **Double** |  |  [optional]
**error** | **String** |  |  [optional]
**playingTab** | [**PlayingTabEnum**](#PlayingTabEnum) |  |  [optional]
**resources** | [**List&lt;SyntheticsResource&gt;**](SyntheticsResource.md) |  |  [optional]
**screenshotBucketKey** | **Boolean** |  |  [optional]
**skipped** | **Boolean** |  |  [optional]
**snapshotBucketKey** | **Boolean** |  |  [optional]
**stepId** | **Long** |  |  [optional]
**subTestStepDetails** | [**List&lt;SyntheticsStepDetail&gt;**](SyntheticsStepDetail.md) |  |  [optional]
**timeToInteractive** | **Double** |  |  [optional]
**type** | [**SyntheticsStepType**](SyntheticsStepType.md) |  |  [optional]
**url** | **String** |  |  [optional]
**value** | [**Object**](.md) |  |  [optional]
**warnings** | [**List&lt;SyntheticsStepDetailWarnings&gt;**](SyntheticsStepDetailWarnings.md) |  |  [optional]



## Enum: PlayingTabEnum

Name | Value
---- | -----
MAIN_TAB | -1l
NEW_TAB | 0l
TAB_1 | 1l
TAB_2 | 2l
TAB_3 | 3l



