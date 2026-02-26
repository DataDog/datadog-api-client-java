// Update a dashboard with tags returns "OK" response

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
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Dashboard with list_stream widget")
            .description("Updated description")
            .tags(Arrays.asList("team:foo", "team:bar"))
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
                                                        .dataSource(
                                                            ListStreamSource.APM_ISSUE_STREAM)
                                                        .queryString(""))
                                                .responseFormat(
                                                    ListStreamResponseFormat.EVENT_LIST)))))));

    try {
      Dashboard result = apiInstance.updateDashboard(DASHBOARD_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
