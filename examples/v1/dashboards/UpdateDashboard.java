// Update a dashboard returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.ListStreamColumn;
import com.datadog.api.v1.client.model.ListStreamColumnWidth;
import com.datadog.api.v1.client.model.ListStreamQuery;
import com.datadog.api.v1.client.model.ListStreamResponseFormat;
import com.datadog.api.v1.client.model.ListStreamSource;
import com.datadog.api.v1.client.model.ListStreamWidgetDefinition;
import com.datadog.api.v1.client.model.ListStreamWidgetDefinitionType;
import com.datadog.api.v1.client.model.ListStreamWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Update_a_dashboard_returns_OK_response with list_stream widget")
            .description("Updated description")
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
