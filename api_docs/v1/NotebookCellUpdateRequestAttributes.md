

# NotebookCellUpdateRequestAttributes

The attributes of a notebook cell in update cell request. Valid cell types are `markdown`, `timeseries`, `toplist`, `heatmap`, `distribution`, `log_stream`. [More information on each graph visualization type.](https://docs.datadoghq.com/dashboards/widgets/)

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
import com.datadog.api.v1.client.model.NotebookCellUpdateRequestAttributes;
import com.datadog.api.v1.client.model.NotebookDistributionCellAttributes;
import com.datadog.api.v1.client.model.NotebookHeatMapCellAttributes;
import com.datadog.api.v1.client.model.NotebookLogStreamCellAttributes;
import com.datadog.api.v1.client.model.NotebookMarkdownCellAttributes;
import com.datadog.api.v1.client.model.NotebookTimeseriesCellAttributes;
import com.datadog.api.v1.client.model.NotebookToplistCellAttributes;

public class Example {
    public static void main(String[] args) {
        NotebookCellUpdateRequestAttributes exampleNotebookCellUpdateRequestAttributes = new NotebookCellUpdateRequestAttributes();

        // create a new NotebookDistributionCellAttributes
        NotebookDistributionCellAttributes exampleNotebookDistributionCellAttributes = new NotebookDistributionCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookDistributionCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookDistributionCellAttributes);
        // to get back the NotebookDistributionCellAttributes set earlier
        NotebookDistributionCellAttributes testNotebookDistributionCellAttributes = (NotebookDistributionCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();

        // create a new NotebookHeatMapCellAttributes
        NotebookHeatMapCellAttributes exampleNotebookHeatMapCellAttributes = new NotebookHeatMapCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookHeatMapCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookHeatMapCellAttributes);
        // to get back the NotebookHeatMapCellAttributes set earlier
        NotebookHeatMapCellAttributes testNotebookHeatMapCellAttributes = (NotebookHeatMapCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();

        // create a new NotebookLogStreamCellAttributes
        NotebookLogStreamCellAttributes exampleNotebookLogStreamCellAttributes = new NotebookLogStreamCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookLogStreamCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookLogStreamCellAttributes);
        // to get back the NotebookLogStreamCellAttributes set earlier
        NotebookLogStreamCellAttributes testNotebookLogStreamCellAttributes = (NotebookLogStreamCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();

        // create a new NotebookMarkdownCellAttributes
        NotebookMarkdownCellAttributes exampleNotebookMarkdownCellAttributes = new NotebookMarkdownCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookMarkdownCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookMarkdownCellAttributes);
        // to get back the NotebookMarkdownCellAttributes set earlier
        NotebookMarkdownCellAttributes testNotebookMarkdownCellAttributes = (NotebookMarkdownCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();

        // create a new NotebookTimeseriesCellAttributes
        NotebookTimeseriesCellAttributes exampleNotebookTimeseriesCellAttributes = new NotebookTimeseriesCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookTimeseriesCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookTimeseriesCellAttributes);
        // to get back the NotebookTimeseriesCellAttributes set earlier
        NotebookTimeseriesCellAttributes testNotebookTimeseriesCellAttributes = (NotebookTimeseriesCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();

        // create a new NotebookToplistCellAttributes
        NotebookToplistCellAttributes exampleNotebookToplistCellAttributes = new NotebookToplistCellAttributes();
        // set NotebookCellUpdateRequestAttributes to NotebookToplistCellAttributes
        exampleNotebookCellUpdateRequestAttributes.setActualInstance(exampleNotebookToplistCellAttributes);
        // to get back the NotebookToplistCellAttributes set earlier
        NotebookToplistCellAttributes testNotebookToplistCellAttributes = (NotebookToplistCellAttributes) exampleNotebookCellUpdateRequestAttributes.getActualInstance();
    }
}
```


