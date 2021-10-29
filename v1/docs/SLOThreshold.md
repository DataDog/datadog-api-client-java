

# SLOThreshold

SLO thresholds (target and optionally warning) for a single time window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | **Double** | The target value for the service level indicator within the corresponding timeframe. | 
**targetDisplay** | **String** | A string representation of the target that indicates its precision. It uses trailing zeros to show significant decimal places (e.g. &#x60;98.00&#x60;).  Always included in service level objective responses. Ignored in create/update requests. |  [optional]
**timeframe** | **SLOTimeframe** |  | 
**warning** | **Double** | The warning value for the service level objective. |  [optional]
**warningDisplay** | **String** | A string representation of the warning target (see the description of the &#x60;target_display&#x60; field for details).  Included in service level objective responses if a warning target exists. Ignored in create/update requests. |  [optional]



