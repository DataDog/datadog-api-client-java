

# NotebookCellTime

Timeframe for the notebook cell. When 'null', the notebook global time is used.

## oneOf schemas
* [NotebookAbsoluteTime](NotebookAbsoluteTime.md)
* [NotebookRelativeTime](NotebookRelativeTime.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.NotebookCellTime;
import com.datadog.api.v1.client.model.NotebookAbsoluteTime;
import com.datadog.api.v1.client.model.NotebookRelativeTime;

public class Example {
    public static void main(String[] args) {
        NotebookCellTime exampleNotebookCellTime = new NotebookCellTime();

        // create a new NotebookAbsoluteTime
        NotebookAbsoluteTime exampleNotebookAbsoluteTime = new NotebookAbsoluteTime();
        // set NotebookCellTime to NotebookAbsoluteTime
        exampleNotebookCellTime.setActualInstance(exampleNotebookAbsoluteTime);
        // to get back the NotebookAbsoluteTime set earlier
        NotebookAbsoluteTime testNotebookAbsoluteTime = (NotebookAbsoluteTime) exampleNotebookCellTime.getActualInstance();

        // create a new NotebookRelativeTime
        NotebookRelativeTime exampleNotebookRelativeTime = new NotebookRelativeTime();
        // set NotebookCellTime to NotebookRelativeTime
        exampleNotebookCellTime.setActualInstance(exampleNotebookRelativeTime);
        // to get back the NotebookRelativeTime set earlier
        NotebookRelativeTime testNotebookRelativeTime = (NotebookRelativeTime) exampleNotebookCellTime.getActualInstance();
    }
}
```


