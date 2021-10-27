# LogsArchiveCreateRequestAttributes

The attributes associated with the archive.

## Properties

| Name                | Type                                                                              | Description                                                                                                                                                              | Notes      |
| ------------------- | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **destination**     | [**LogsArchiveCreateRequestDestination**](LogsArchiveCreateRequestDestination.md) |                                                                                                                                                                          |
| **includeTags**     | **Boolean**                                                                       | To store the tags in the archive, set the value \&quot;true\&quot;. If it is set to \&quot;false\&quot;, the tags will be deleted when the logs are sent to the archive. | [optional] |
| **name**            | **String**                                                                        | The archive name.                                                                                                                                                        |
| **query**           | **String**                                                                        | The archive query/filter. Logs matching this query are included in the archive.                                                                                          |
| **rehydrationTags** | **List&lt;String&gt;**                                                            | An array of tags to add to rehydrated logs from an archive.                                                                                                              | [optional] |
