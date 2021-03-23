

# LogsListResponse

Response object with all logs matching the request and pagination information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | [**List&lt;Log&gt;**](Log.md) | Array of logs matching the request and the &#x60;nextLogId&#x60; if sent. |  [optional]
**nextLogId** | **String** | Hash identifier of the next log to return in the list. This parameter is used for the pagination feature. |  [optional]
**status** | **String** | Status of the response. |  [optional]



