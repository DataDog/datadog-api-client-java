

# NotebooksResponseDataAttributes

The attributes of a notebook in get all response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**NotebookAuthor**](NotebookAuthor.md) |  |  [optional]
**cells** | [**List&lt;NotebookCellResponse&gt;**](NotebookCellResponse.md) | List of cells to display in the notebook. |  [optional]
**created** | **OffsetDateTime** | UTC time stamp for when the notebook was created. |  [optional] [readonly]
**modified** | **OffsetDateTime** | UTC time stamp for when the notebook was last modified. |  [optional] [readonly]
**name** | **String** | The name of the notebook. | 
**status** | **NotebookStatus** |  |  [optional]
**time** | [**NotebookGlobalTime**](NotebookGlobalTime.md) |  |  [optional]



