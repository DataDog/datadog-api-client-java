

# NotebookCellResponseAttributes

The attributes of a notebook cell response. Valid cell types are `markdown`, `timeseries`, `toplist`, `heatmap`, `distribution`, `log_stream`. [More information on each graph visualization type.](https://docs.datadoghq.com/dashboards/widgets/)

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
import com.datadog.api.v1.client.model.NotebookCellResponseAttributes;
import com.datadog.api.v1.client.model.NotebookDistributionCellAttributes;
import com.datadog.api.v1.client.model.NotebookHeatMapCellAttributes;
import com.datadog.api.v1.client.model.NotebookLogStreamCellAttributes;
import com.datadog.api.v1.client.model.NotebookMarkdownCellAttributes;
import com.datadog.api.v1.client.model.NotebookTimeseriesCellAttributes;
import com.datadog.api.v1.client.model.NotebookToplistCellAttributes;

public class Example {
    public static void main(String[] args) {
        NotebookCellResponseAttributes exampleNotebookCellResponseAttributes = new NotebookCellResponseAttributes();

        // create a new NotebookDistributionCellAttributes
        NotebookDistributionCellAttributes exampleNotebookDistributionCellAttributes = new NotebookDistributionCellAttributes();
        // set NotebookCellResponseAttributes to NotebookDistributionCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookDistributionCellAttributes);
        // to get back the NotebookDistributionCellAttributes set earlier
        NotebookDistributionCellAttributes testNotebookDistributionCellAttributes = (NotebookDistributionCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();

        // create a new NotebookHeatMapCellAttributes
        NotebookHeatMapCellAttributes exampleNotebookHeatMapCellAttributes = new NotebookHeatMapCellAttributes();
        // set NotebookCellResponseAttributes to NotebookHeatMapCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookHeatMapCellAttributes);
        // to get back the NotebookHeatMapCellAttributes set earlier
        NotebookHeatMapCellAttributes testNotebookHeatMapCellAttributes = (NotebookHeatMapCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();

        // create a new NotebookLogStreamCellAttributes
        NotebookLogStreamCellAttributes exampleNotebookLogStreamCellAttributes = new NotebookLogStreamCellAttributes();
        // set NotebookCellResponseAttributes to NotebookLogStreamCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookLogStreamCellAttributes);
        // to get back the NotebookLogStreamCellAttributes set earlier
        NotebookLogStreamCellAttributes testNotebookLogStreamCellAttributes = (NotebookLogStreamCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();

        // create a new NotebookMarkdownCellAttributes
        NotebookMarkdownCellAttributes exampleNotebookMarkdownCellAttributes = new NotebookMarkdownCellAttributes();
        // set NotebookCellResponseAttributes to NotebookMarkdownCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookMarkdownCellAttributes);
        // to get back the NotebookMarkdownCellAttributes set earlier
        NotebookMarkdownCellAttributes testNotebookMarkdownCellAttributes = (NotebookMarkdownCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();

        // create a new NotebookTimeseriesCellAttributes
        NotebookTimeseriesCellAttributes exampleNotebookTimeseriesCellAttributes = new NotebookTimeseriesCellAttributes();
        // set NotebookCellResponseAttributes to NotebookTimeseriesCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookTimeseriesCellAttributes);
        // to get back the NotebookTimeseriesCellAttributes set earlier
        NotebookTimeseriesCellAttributes testNotebookTimeseriesCellAttributes = (NotebookTimeseriesCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();

        // create a new NotebookToplistCellAttributes
        NotebookToplistCellAttributes exampleNotebookToplistCellAttributes = new NotebookToplistCellAttributes();
        // set NotebookCellResponseAttributes to NotebookToplistCellAttributes
        exampleNotebookCellResponseAttributes.setActualInstance(exampleNotebookToplistCellAttributes);
        // to get back the NotebookToplistCellAttributes set earlier
        NotebookToplistCellAttributes testNotebookToplistCellAttributes = (NotebookToplistCellAttributes) exampleNotebookCellResponseAttributes.getActualInstance();
    }
}
```


