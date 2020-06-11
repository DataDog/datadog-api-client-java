

# LogsListRequest

Object to send with the request to retrieve a list of logs from your Organization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | For multi-index organizations, the log index in which the request is performed. Default to &#39;*&#39; (all indexes). |  [optional]
**limit** | **Integer** | Number of logs return in the response. |  [optional]
**query** | **String** | The search query - following the log search syntax. | 
**sort** | [**LogsSort**](LogsSort.md) |  |  [optional]
**startAt** | **String** | Hash identifier of the first log to return in the list, available in a log &#x60;id&#x60; attribute. This parameter is used for the pagination feature.  **Note**: This parameter is ignored if the corresponding log is out of the scope of the specified time window. |  [optional]
**time** | [**LogsListRequestTime**](LogsListRequestTime.md) |  | 



