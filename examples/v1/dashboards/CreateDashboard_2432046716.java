// Create a new dashboard with event_stream list_stream widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.ListStreamColumn;
import com.datadog.api.client.v1.model.ListStreamColumnWidth;
import com.datadog.api.client.v1.model.ListStreamQuery;
import com.datadog.api.client.v1.model.ListStreamResponseFormat;
import com.datadog.api.client.v1.model.ListStreamSource;
import com.datadog.api.client.v1.model.ListStreamWidgetDefinition;
import com.datadog.api.client.v1.model.ListStreamWidgetDefinitionType;
import com.datadog.api.client.v1.model.ListStreamWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetEventSize;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Dashboard with list_stream widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new ListStreamWidgetDefinition()
                                    .type(ListStreamWidgetDefinitionType.LIST_STREAM)
                                    .requests(
                                        Collections.singletonList(
                                            new ListStreamWidgetRequest()
                                                .columns(
                                                    Collections.singletonList(
                                                        new ListStreamColumn()
                                                            .width(ListStreamColumnWidth.AUTO)
                                                            .field("timestamp")))
                                                .query(
                                                    new ListStreamQuery()
                                                        .dataSource(ListStreamSource.EVENT_STREAM)
                                                        .queryString("")
                                                        .eventSize(WidgetEventSize.LARGE)
                                                        .showYear(true))
                                                .responseFormat(
                                                    ListStreamResponseFormat.EVENT_LIST)))))));

    try {
      Dashboard result = apiInstance.createDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
