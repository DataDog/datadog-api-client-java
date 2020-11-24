

# LogsResponseMetadata

The metadata associated with a request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elapsed** | **Integer** | The time elapsed in milliseconds |  [optional]
**page** | [**LogsResponseMetadataPage**](LogsResponseMetadataPage.md) |  |  [optional]
**requestId** | **String** | The identifier of the request |  [optional]
**status** | **LogsAggregateResponseStatus** |  |  [optional]
**warnings** | [**List&lt;LogsWarning&gt;**](LogsWarning.md) | A list of warnings (non fatal errors) encountered, partial results might be returned if warnings are present in the response. |  [optional]



