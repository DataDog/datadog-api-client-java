

# NotebookResponseDataAttributes

The attributes of a notebook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**NotebookAuthor**](NotebookAuthor.md) |  |  [optional]
**cells** | [**List&lt;NotebookCellResponse&gt;**](NotebookCellResponse.md) | List of cells to display in the notebook. | 
**created** | **OffsetDateTime** | UTC time stamp. |  [optional] [readonly]
**modified** | **OffsetDateTime** | UTC time stamp. |  [optional] [readonly]
**name** | **String** | Notebook name. | 
**status** | **NotebookStatus** |  |  [optional]
**time** | [**NotebookGlobalTime**](NotebookGlobalTime.md) |  | 



