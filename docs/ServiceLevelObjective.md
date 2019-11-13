

# ServiceLevelObjective

A service level objective object includes a service level indicator, thresholds for one or more timeframes, and metadata (name, description, tags, etc.).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **Long** | Creation timestamp (unix time in seconds) Always included in service level objective responses. |  [optional]
**creator** | [**Creator**](Creator.md) |  |  [optional]
**description** | **String** | A user-defined description of the service level objective. Always included in service level objective responses (but may be null). Optional in create/update requests. |  [optional]
**groups** | **List&lt;String&gt;** | A list of (up to 20) monitor groups (e.g. [\&quot;env:prod,role:mysql\&quot;]) that narrows the scope of a monitor service level objective. Included in service level objective responses if it is nonempty. Optional in create/update requests for monitor service level objectives, but may only be used when then length of the \&quot;monitor_ids\&quot; field is one. |  [optional]
**id** | **String** | A unique identifier for the service level objective object. Always included in service level objective responses. Required for update requests. |  [optional]
**modifiedAt** | **Long** | Modification timestamp (unix time in seconds) Always included in service level objective responses. |  [optional]
**monitorIds** | **List&lt;Integer&gt;** | A list of monitor ids that defines the scope of a monitor service level objective. Required if type is \&quot;monitor\&quot;. |  [optional]
**monitorTags** | **List&lt;String&gt;** | The union of monitor tags for all monitors referenced by the \&quot;monitor_ids\&quot; field. Always included in service level objective responses for monitor service level objectives (but may be empty). Ignored in create/update requests. Does not affect which monitors are included in the service level objective (that is determined entirely by the monitor_ids field). |  [optional]
**name** | **String** | The name of the service level objective object. | 
**query** | [**ServiceLevelObjectiveQuery**](ServiceLevelObjectiveQuery.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags (e.g. \&quot;env:prod\&quot;) associated with this service level objective. Always included in service level objective responses (but may be empty). Optional in create/update requests. |  [optional]
**thresholds** | [**List&lt;SloThreshold&gt;**](SloThreshold.md) | The thresholds (timeframes and associated targets) for this service level objective object. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the service level objective. | 
**typeId** | [**TypeIdEnum**](#TypeIdEnum) | A numeric representation of the type of the service level objective (0 for monitor, 1 for metric). Always included in service level objective responses. Ignored in create/update requests. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
METRIC | &quot;metric&quot;
MONITOR | &quot;monitor&quot;



## Enum: TypeIdEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



