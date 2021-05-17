

# NotebookCellCreateRequestAttributes

The attributes of a notebook cell in create cell request. Valid cell types are `markdown`, `timeseries`, `toplist`, `heatmap`, `distribution`, `log_stream`. [More information on each graph visualization type.](https://docs.datadoghq.com/dashboards/widgets/)

## oneOf schemas
* [NotebookDistributionCellAttributes](NotebookDistributionCellAttributes.md)
* [NotebookHeatMapCellAttributes](NotebookHeatMapCellAttributes.md)
* [NotebookLogStreamCellAttributes](NotebookLogStreamCellAttributes.md)
* [NotebookMarkdownCellAttributes](NotebookMarkdownCellAttributes.md)
* [NotebookTimeseriesCellAttributes](NotebookTimeseriesCellAttributes.md)
* [NotebookToplistCellAttributes](NotebookToplistCellAttributes.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.NotebookCellCreateRequestAttributes;
import com.datadog.api.v1.client.model.NotebookDistributionCellAttributes;
import com.datadog.api.v1.client.model.NotebookHeatMapCellAttributes;
import com.datadog.api.v1.client.model.NotebookLogStreamCellAttributes;
import com.datadog.api.v1.client.model.NotebookMarkdownCellAttributes;
import com.datadog.api.v1.client.model.NotebookTimeseriesCellAttributes;
import com.datadog.api.v1.client.model.NotebookToplistCellAttributes;

public class Example {
    public static void main(String[] args) {
        NotebookCellCreateRequestAttributes exampleNotebookCellCreateRequestAttributes = new NotebookCellCreateRequestAttributes();

        // create a new NotebookDistributionCellAttributes
        NotebookDistributionCellAttributes exampleNotebookDistributionCellAttributes = new NotebookDistributionCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookDistributionCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookDistributionCellAttributes);
        // to get back the NotebookDistributionCellAttributes set earlier
        NotebookDistributionCellAttributes testNotebookDistributionCellAttributes = (NotebookDistributionCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();

        // create a new NotebookHeatMapCellAttributes
        NotebookHeatMapCellAttributes exampleNotebookHeatMapCellAttributes = new NotebookHeatMapCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookHeatMapCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookHeatMapCellAttributes);
        // to get back the NotebookHeatMapCellAttributes set earlier
        NotebookHeatMapCellAttributes testNotebookHeatMapCellAttributes = (NotebookHeatMapCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();

        // create a new NotebookLogStreamCellAttributes
        NotebookLogStreamCellAttributes exampleNotebookLogStreamCellAttributes = new NotebookLogStreamCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookLogStreamCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookLogStreamCellAttributes);
        // to get back the NotebookLogStreamCellAttributes set earlier
        NotebookLogStreamCellAttributes testNotebookLogStreamCellAttributes = (NotebookLogStreamCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();

        // create a new NotebookMarkdownCellAttributes
        NotebookMarkdownCellAttributes exampleNotebookMarkdownCellAttributes = new NotebookMarkdownCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookMarkdownCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookMarkdownCellAttributes);
        // to get back the NotebookMarkdownCellAttributes set earlier
        NotebookMarkdownCellAttributes testNotebookMarkdownCellAttributes = (NotebookMarkdownCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();

        // create a new NotebookTimeseriesCellAttributes
        NotebookTimeseriesCellAttributes exampleNotebookTimeseriesCellAttributes = new NotebookTimeseriesCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookTimeseriesCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookTimeseriesCellAttributes);
        // to get back the NotebookTimeseriesCellAttributes set earlier
        NotebookTimeseriesCellAttributes testNotebookTimeseriesCellAttributes = (NotebookTimeseriesCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();

        // create a new NotebookToplistCellAttributes
        NotebookToplistCellAttributes exampleNotebookToplistCellAttributes = new NotebookToplistCellAttributes();
        // set NotebookCellCreateRequestAttributes to NotebookToplistCellAttributes
        exampleNotebookCellCreateRequestAttributes.setActualInstance(exampleNotebookToplistCellAttributes);
        // to get back the NotebookToplistCellAttributes set earlier
        NotebookToplistCellAttributes testNotebookToplistCellAttributes = (NotebookToplistCellAttributes) exampleNotebookCellCreateRequestAttributes.getActualInstance();
    }
}
```


