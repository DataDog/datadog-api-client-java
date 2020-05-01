

# SLOBulkDeleteResponse

The bulk partial delete service level objective object endpoint response.  This endpoint operates on multiple service level objective objects, so it may be partially successful. In such cases, the \"data\" and \"error\" fields in this response indicate which deletions succeeded and failed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**SLOBulkDeleteResponseData**](SLOBulkDeleteResponseData.md) |  |  [optional]
**errors** | [**List&lt;SLOBulkDeleteResponseErrors&gt;**](SLOBulkDeleteResponseErrors.md) | Array of errors object returned. |  [optional]



