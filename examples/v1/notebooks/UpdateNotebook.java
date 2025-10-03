// Update a notebook returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.NotebooksApi;
import com.datadog.api.client.v1.model.NotebookCellCreateRequest;
import com.datadog.api.client.v1.model.NotebookCellCreateRequestAttributes;
import com.datadog.api.client.v1.model.NotebookCellResourceType;
import com.datadog.api.client.v1.model.NotebookGlobalTime;
import com.datadog.api.client.v1.model.NotebookGraphSize;
import com.datadog.api.client.v1.model.NotebookMarkdownCellAttributes;
import com.datadog.api.client.v1.model.NotebookMarkdownCellDefinition;
import com.datadog.api.client.v1.model.NotebookMarkdownCellDefinitionType;
import com.datadog.api.client.v1.model.NotebookRelativeTime;
import com.datadog.api.client.v1.model.NotebookResourceType;
import com.datadog.api.client.v1.model.NotebookResponse;
import com.datadog.api.client.v1.model.NotebookSplitBy;
import com.datadog.api.client.v1.model.NotebookStatus;
import com.datadog.api.client.v1.model.NotebookTimeseriesCellAttributes;
import com.datadog.api.client.v1.model.NotebookUpdateCell;
import com.datadog.api.client.v1.model.NotebookUpdateData;
import com.datadog.api.client.v1.model.NotebookUpdateDataAttributes;
import com.datadog.api.client.v1.model.NotebookUpdateRequest;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.WidgetAxis;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetLiveSpan;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    NotebooksApi apiInstance = new NotebooksApi(defaultClient);

    // there is a valid "notebook" in the system
    Long NOTEBOOK_DATA_ID = Long.parseLong(System.getenv("NOTEBOOK_DATA_ID"));

    NotebookUpdateRequest body =
        new NotebookUpdateRequest()
            .data(
                new NotebookUpdateData()
                    .attributes(
                        new NotebookUpdateDataAttributes()
                            .cells(
                                Arrays.asList(
                                    new NotebookUpdateCell(
                                        new NotebookCellCreateRequest()
                                            .attributes(
                                                new NotebookCellCreateRequestAttributes(
                                                    new NotebookMarkdownCellAttributes()
                                                        .definition(
                                                            new NotebookMarkdownCellDefinition()
                                                                .text(
                                                                    """
## Some test markdown

```
var x, y;
x = 5;
y = 6;
```
""")
                                                                .type(
                                                                    NotebookMarkdownCellDefinitionType
                                                                        .MARKDOWN))))
                                            .type(NotebookCellResourceType.NOTEBOOK_CELLS)),
                                    new NotebookUpdateCell(
                                        new NotebookCellCreateRequest()
                                            .attributes(
                                                new NotebookCellCreateRequestAttributes(
                                                    new NotebookTimeseriesCellAttributes()
                                                        .definition(
                                                            new TimeseriesWidgetDefinition()
                                                                .requests(
                                                                    Collections.singletonList(
                                                                        new TimeseriesWidgetRequest()
                                                                            .displayType(
                                                                                WidgetDisplayType
                                                                                    .LINE)
                                                                            .q(
                                                                                "avg:system.load.1{*}")
                                                                            .style(
                                                                                new WidgetRequestStyle()
                                                                                    .lineType(
                                                                                        WidgetLineType
                                                                                            .SOLID)
                                                                                    .lineWidth(
                                                                                        WidgetLineWidth
                                                                                            .NORMAL)
                                                                                    .palette(
                                                                                        "dog_classic"))))
                                                                .showLegend(true)
                                                                .type(
                                                                    TimeseriesWidgetDefinitionType
                                                                        .TIMESERIES)
                                                                .yaxis(
                                                                    new WidgetAxis()
                                                                        .scale("linear")))
                                                        .graphSize(NotebookGraphSize.MEDIUM)
                                                        .splitBy(new NotebookSplitBy())
                                                        .time(null)))
                                            .type(NotebookCellResourceType.NOTEBOOK_CELLS))))
                            .name("Example-Notebook-updated")
                            .status(NotebookStatus.PUBLISHED)
                            .time(
                                new NotebookGlobalTime(
                                    new NotebookRelativeTime()
                                        .liveSpan(WidgetLiveSpan.PAST_ONE_HOUR))))
                    .type(NotebookResourceType.NOTEBOOKS));

    try {
      NotebookResponse result = apiInstance.updateNotebook(NOTEBOOK_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#updateNotebook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
