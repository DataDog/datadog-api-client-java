

# SLOThreshold

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | **Double** | The target value for the service level indicator within the corresponding timeframe. | 
**targetDisplay** | **String** | A string representation of the target that indicates its precision (e.g. \&quot;99.9\&quot;). It uses trailing zeros to show significant decimal places (e.g. \&quot;98.00\&quot;). Always included in service level objective responses. Ignored in create/update requests. |  [optional]
**timeframe** | [**SLOTimeframe**](SLOTimeframe.md) |  | 
**warning** | **Double** |  |  [optional]
**warningDisplay** | **String** | A string representation of the warning target (see the description of the \&quot;target_display\&quot; field for details). Included in service level objective responses if a warning target exists. Ignored in create/update requests. |  [optional]



