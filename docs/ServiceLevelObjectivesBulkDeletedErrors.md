

# ServiceLevelObjectivesBulkDeletedErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the service level objective object associated with this error. | 
**message** | **String** | The error message | 
**timeframe** | [**TimeframeEnum**](#TimeframeEnum) | The timeframe of the threshold associated with this error or \&quot;all\&quot; if all thresholds are affected. | 



## Enum: TimeframeEnum

Name | Value
---- | -----
_7D | &quot;7d&quot;
_30D | &quot;30d&quot;
_90D | &quot;90d&quot;
ALL | &quot;all&quot;



