

# ServiceLevelObjectiveRequest

A service level objective object includes a service level indicator, thresholds for one or more timeframes, and metadata (`name`, `description`, `tags`, etc.).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **Long** | Creation timestamp (UNIX time in seconds)  Always included in service level objective responses. |  [optional] [readonly]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**description** | **String** | A user-defined description of the service level objective.  Always included in service level objective responses (but may be &#x60;null&#x60;). Optional in create/update requests. |  [optional]
**groups** | **List&lt;String&gt;** | A list of (up to 20) monitor groups that narrow the scope of a monitor service level objective.  Included in service level objective responses if it is not empty. Optional in create/update requests for monitor service level objectives, but may only be used when then length of the &#x60;monitor_ids&#x60; field is one. |  [optional]
**id** | **String** | A unique identifier for the service level objective object.  Always included in service level objective responses. |  [optional] [readonly]
**modifiedAt** | **Long** | Modification timestamp (UNIX time in seconds)  Always included in service level objective responses. |  [optional] [readonly]
**monitorIds** | **List&lt;Long&gt;** | A list of monitor ids that defines the scope of a monitor service level objective. **Required if type is &#x60;monitor&#x60;**. |  [optional]
**name** | **String** | The name of the service level objective object. | 
**query** | [**ServiceLevelObjectiveQuery**](ServiceLevelObjectiveQuery.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags associated with this service level objective. Always included in service level objective responses (but may be empty). Optional in create/update requests. |  [optional]
**thresholds** | [**List&lt;SLOThreshold&gt;**](SLOThreshold.md) | The thresholds (timeframes and associated targets) for this service level objective object. | 
**type** | **SLOType** |  | 



