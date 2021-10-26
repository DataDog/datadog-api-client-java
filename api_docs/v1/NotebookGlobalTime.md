

# NotebookGlobalTime

Notebook global timeframe.

## oneOf schemas
* [NotebookAbsoluteTime](NotebookAbsoluteTime.md)
* [NotebookRelativeTime](NotebookRelativeTime.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.NotebookGlobalTime;
import com.datadog.api.v1.client.model.NotebookAbsoluteTime;
import com.datadog.api.v1.client.model.NotebookRelativeTime;

public class Example {
    public static void main(String[] args) {
        NotebookGlobalTime exampleNotebookGlobalTime = new NotebookGlobalTime();

        // create a new NotebookAbsoluteTime
        NotebookAbsoluteTime exampleNotebookAbsoluteTime = new NotebookAbsoluteTime();
        // set NotebookGlobalTime to NotebookAbsoluteTime
        exampleNotebookGlobalTime.setActualInstance(exampleNotebookAbsoluteTime);
        // to get back the NotebookAbsoluteTime set earlier
        NotebookAbsoluteTime testNotebookAbsoluteTime = (NotebookAbsoluteTime) exampleNotebookGlobalTime.getActualInstance();

        // create a new NotebookRelativeTime
        NotebookRelativeTime exampleNotebookRelativeTime = new NotebookRelativeTime();
        // set NotebookGlobalTime to NotebookRelativeTime
        exampleNotebookGlobalTime.setActualInstance(exampleNotebookRelativeTime);
        // to get back the NotebookRelativeTime set earlier
        NotebookRelativeTime testNotebookRelativeTime = (NotebookRelativeTime) exampleNotebookGlobalTime.getActualInstance();
    }
}
```


