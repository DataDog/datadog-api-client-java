// Create a new dashboard returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.LogQueryDefinitionGroupBy;
import com.datadog.api.v1.client.model.LogQueryDefinitionGroupBySort;
import com.datadog.api.v1.client.model.LogQueryDefinitionSearch;
import com.datadog.api.v1.client.model.LogsQueryCompute;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetSort;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Create_a_new_dashboard_returns_OK_response with Profile Metrics Query")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TimeseriesWidgetDefinition()
                                    .type(TimeseriesWidgetDefinitionType.TIMESERIES)
                                    .requests(
                                        Collections.singletonList(
                                            new TimeseriesWidgetRequest()
                                                .profileMetricsQuery(
                                                    new LogQueryDefinition()
                                                        .compute(
                                                            new LogsQueryCompute()
                                                                .aggregation("sum")
                                                                .facet("@prof_core_cpu_cores"))
                                                        .search(
                                                            new LogQueryDefinitionSearch()
                                                                .query("runtime:jvm"))
                                                        .groupBy(
                                                            Collections.singletonList(
                                                                new LogQueryDefinitionGroupBy()
                                                                    .facet("service")
                                                                    .limit(10L)
                                                                    .sort(
                                                                        new LogQueryDefinitionGroupBySort()
                                                                            .aggregation("sum")
                                                                            .order(
                                                                                WidgetSort
                                                                                    .DESCENDING)
                                                                            .facet(
                                                                                "@prof_core_cpu_cores")))))))))));

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
