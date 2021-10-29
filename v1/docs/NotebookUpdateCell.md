

# NotebookUpdateCell

Updating a notebook can either insert new cell(s) or update existing cell(s) by including the cell `id`. To delete existing cell(s), simply omit it from the list of cells.

## oneOf schemas
* [NotebookCellCreateRequest](NotebookCellCreateRequest.md)
* [NotebookCellUpdateRequest](NotebookCellUpdateRequest.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.NotebookUpdateCell;
import com.datadog.api.v1.client.model.NotebookCellCreateRequest;
import com.datadog.api.v1.client.model.NotebookCellUpdateRequest;

public class Example {
    public static void main(String[] args) {
        NotebookUpdateCell exampleNotebookUpdateCell = new NotebookUpdateCell();

        // create a new NotebookCellCreateRequest
        NotebookCellCreateRequest exampleNotebookCellCreateRequest = new NotebookCellCreateRequest();
        // set NotebookUpdateCell to NotebookCellCreateRequest
        exampleNotebookUpdateCell.setActualInstance(exampleNotebookCellCreateRequest);
        // to get back the NotebookCellCreateRequest set earlier
        NotebookCellCreateRequest testNotebookCellCreateRequest = (NotebookCellCreateRequest) exampleNotebookUpdateCell.getActualInstance();

        // create a new NotebookCellUpdateRequest
        NotebookCellUpdateRequest exampleNotebookCellUpdateRequest = new NotebookCellUpdateRequest();
        // set NotebookUpdateCell to NotebookCellUpdateRequest
        exampleNotebookUpdateCell.setActualInstance(exampleNotebookCellUpdateRequest);
        // to get back the NotebookCellUpdateRequest set earlier
        NotebookCellUpdateRequest testNotebookCellUpdateRequest = (NotebookCellUpdateRequest) exampleNotebookUpdateCell.getActualInstance();
    }
}
```


