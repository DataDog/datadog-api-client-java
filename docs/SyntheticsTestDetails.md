

# SyntheticsTestDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**SyntheticsTestConfig**](SyntheticsTestConfig.md) |  |  [optional]
**createdAt** | **String** |  |  [optional]
**createdBy** | [**SyntheticsTestAuthor**](SyntheticsTestAuthor.md) |  |  [optional]
**locations** | **List&lt;String&gt;** |  |  [optional]
**message** | **String** |  |  [optional]
**modifiedAt** | **String** |  |  [optional]
**modifiedBy** | [**SyntheticsTestAuthor**](SyntheticsTestAuthor.md) |  |  [optional]
**name** | **String** |  |  [optional]
**options** | [**SyntheticsTestOptions**](SyntheticsTestOptions.md) |  |  [optional]
**overallState** | [**SyntheticsTestMonitorStatus**](SyntheticsTestMonitorStatus.md) |  |  [optional]
**publicId** | **String** |  |  [optional]
**status** | [**SyntheticsTestPauseStatus**](SyntheticsTestPauseStatus.md) |  |  [optional]
**stepCount** | **Long** |  |  [optional]
**subtype** | [**SubtypeEnum**](#SubtypeEnum) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]



## Enum: SubtypeEnum

Name | Value
---- | -----
HTTP | &quot;http&quot;
SSL | &quot;ssl&quot;



## Enum: TypeEnum

Name | Value
---- | -----
API | &quot;api&quot;
BROWSER | &quot;browser&quot;



