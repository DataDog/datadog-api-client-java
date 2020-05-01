

# SyntheticsResource

Object describing a resource which is the combination of requests (fetch, xhr) and Assets (HTML, CSS, JS, images).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **Double** | Number of time the resource was collected. |  [optional]
**method** | **String** | HTTP methode associated to the resource. |  [optional]
**size** | **Long** | Size of the resource in bytes. |  [optional]
**status** | **Long** | Status Code of the resource. |  [optional]
**timestamp** | **Double** | Timestamp of the resource collection. |  [optional]
**traceId** | **String** | Trace ID associated with the resource if any. |  [optional]
**type** | [**SyntheticsResourceType**](SyntheticsResourceType.md) |  |  [optional]
**url** | **String** | URL of the resource. |  [optional]



