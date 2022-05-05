// Create a notebook returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.NotebooksApi;
import com.datadog.api.v1.client.model.NotebookCellCreateRequest;
import com.datadog.api.v1.client.model.NotebookCellCreateRequestAttributes;
import com.datadog.api.v1.client.model.NotebookCellResourceType;
import com.datadog.api.v1.client.model.NotebookCreateData;
import com.datadog.api.v1.client.model.NotebookCreateDataAttributes;
import com.datadog.api.v1.client.model.NotebookCreateRequest;
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
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequest;
import com.datadog.api.v1.client.model.WidgetAxis;
import com.datadog.api.v1.client.model.WidgetDisplayType;
import com.datadog.api.v1.client.model.WidgetLineType;
import com.datadog.api.v1.client.model.WidgetLineWidth;
import com.datadog.api.v1.client.model.WidgetLiveSpan;
import com.datadog.api.v1.client.model.WidgetRequestStyle;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    NotebooksApi apiInstance = new NotebooksApi(defaultClient);

    NotebookCreateRequest body =
        new NotebookCreateRequest()
            .data(
                new NotebookCreateData()
                    .attributes(
                        new NotebookCreateDataAttributes()
                            .cells(
                                Arrays.asList(
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
                                        .type(NotebookCellResourceType.NOTEBOOK_CELLS),
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
                                                                            WidgetDisplayType.LINE)
                                                                        .q("avg:system.load.1{*}")
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
                                                                new WidgetAxis().scale("linear")))
                                                    .graphSize(NotebookGraphSize.MEDIUM)
                                                    .splitBy(new NotebookSplitBy())
                                                    .time(null)))
                                        .type(NotebookCellResourceType.NOTEBOOK_CELLS)))
                            .name("Example-Create_a_notebook_returns_OK_response")
                            .status(NotebookStatus.PUBLISHED)
                            .time(
                                new NotebookGlobalTime(
                                    new NotebookRelativeTime()
                                        .liveSpan(WidgetLiveSpan.PAST_ONE_HOUR))))
                    .type(NotebookResourceType.NOTEBOOKS));

    try {
      NotebookResponse result = apiInstance.createNotebook(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#createNotebook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
