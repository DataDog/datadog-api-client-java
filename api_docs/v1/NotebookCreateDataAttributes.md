# NotebookCreateDataAttributes

The data attributes of a notebook.

## Properties

| Name         | Type                                                                      | Description                               | Notes      |
| ------------ | ------------------------------------------------------------------------- | ----------------------------------------- | ---------- |
| **cells**    | [**List&lt;NotebookCellCreateRequest&gt;**](NotebookCellCreateRequest.md) | List of cells to display in the notebook. |
| **metadata** | [**NotebookMetadata**](NotebookMetadata.md)                               |                                           | [optional] |
| **name**     | **String**                                                                | The name of the notebook.                 |
| **status**   | **NotebookStatus**                                                        |                                           | [optional] |
| **time**     | [**NotebookGlobalTime**](NotebookGlobalTime.md)                           |                                           |
