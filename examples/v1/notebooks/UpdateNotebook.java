// Update a notebook returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.NotebooksApi;
import com.datadog.api.v1.client.model.NotebookCellCreateRequest;
import com.datadog.api.v1.client.model.NotebookCellCreateRequestAttributes;
import com.datadog.api.v1.client.model.NotebookCellResourceType;
import com.datadog.api.v1.client.model.NotebookGlobalTime;
import com.datadog.api.v1.client.model.NotebookGraphSize;
import com.datadog.api.v1.client.model.NotebookMarkdownCellAttributes;
import com.datadog.api.v1.client.model.NotebookMarkdownCellDefinition;
import com.datadog.api.v1.client.model.NotebookMarkdownCellDefinitionType;
import com.datadog.api.v1.client.model.NotebookRelativeTime;
import com.datadog.api.v1.client.model.NotebookResourceType;
import com.datadog.api.v1.client.model.NotebookResponse;
import com.datadog.api.v1.client.model.NotebookSplitBy;
import com.datadog.api.v1.client.model.NotebookStatus;
import com.datadog.api.v1.client.model.NotebookTimeseriesCellAttributes;
import com.datadog.api.v1.client.model.NotebookUpdateCell;
import com.datadog.api.v1.client.model.NotebookUpdateData;
import com.datadog.api.v1.client.model.NotebookUpdateDataAttributes;
import com.datadog.api.v1.client.model.NotebookUpdateRequest;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequest;
import com.datadog.api.v1.client.model.WidgetAxis;
import com.datadog.api.v1.client.model.WidgetDisplayType;
import com.datadog.api.v1.client.model.WidgetLineType;
import com.datadog.api.v1.client.model.WidgetLineWidth;
import com.datadog.api.v1.client.model.WidgetLiveSpan;
import com.datadog.api.v1.client.model.WidgetRequestStyle;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
                                new ArrayList<NotebookUpdateCell>() {
                                  {
                                    add(
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

```js
var x, y;
x = 5;
y = 6;
```
""")
                                                                    .type(
                                                                        NotebookMarkdownCellDefinitionType
                                                                            .MARKDOWN))))
                                                .type(NotebookCellResourceType.NOTEBOOK_CELLS)));
                                    add(
                                        new NotebookUpdateCell(
                                            new NotebookCellCreateRequest()
                                                .attributes(
                                                    new NotebookCellCreateRequestAttributes(
                                                        new NotebookTimeseriesCellAttributes()
                                                            .definition(
                                                                new TimeseriesWidgetDefinition()
                                                                    .requests(
                                                                        new ArrayList<
                                                                            TimeseriesWidgetRequest>() {
                                                                          {
                                                                            add(
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
                                                                                                "dog_classic")));
                                                                          }
                                                                        })
                                                                    .showLegend(true)
                                                                    .type(
                                                                        TimeseriesWidgetDefinitionType
                                                                            .TIMESERIES)
                                                                    .yaxis(
                                                                        new WidgetAxis()
                                                                            .scale("linear")))
                                                            .graphSize(NotebookGraphSize.MEDIUM)
                                                            .splitBy(
                                                                new NotebookSplitBy()
                                                                    .keys(
                                                                        new ArrayList<String>() {
                                                                          {
                                                                            ;
                                                                          }
                                                                        })
                                                                    .tags(
                                                                        new ArrayList<String>() {
                                                                          {
                                                                            ;
                                                                          }
                                                                        }))
                                                            .time(null)))
                                                .type(NotebookCellResourceType.NOTEBOOK_CELLS)));
                                  }
                                })
                            .name("Example-Update_a_notebook_returns_OK_response-updated")
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
