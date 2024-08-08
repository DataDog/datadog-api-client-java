// Create a new dashboard returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.LogQueryDefinition;
import com.datadog.api.client.v1.model.LogQueryDefinitionGroupBy;
import com.datadog.api.client.v1.model.LogQueryDefinitionGroupBySort;
import com.datadog.api.client.v1.model.LogQueryDefinitionSearch;
import com.datadog.api.client.v1.model.LogsQueryCompute;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetSort;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body = new Dashboard()
.layoutType(DashboardLayoutType.ORDERED)
.title("Example-Dashboard with Profile Metrics Query")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new TimeseriesWidgetDefinition()
.type(TimeseriesWidgetDefinitionType.TIMESERIES)
.requests(Collections.singletonList(new TimeseriesWidgetRequest()
.profileMetricsQuery(new LogQueryDefinition()
.compute(new LogsQueryCompute()
.aggregation("sum")
.facet("@prof_core_cpu_cores"))
.search(new LogQueryDefinitionSearch()
.query("runtime:jvm"))
.groupBy(Collections.singletonList(new LogQueryDefinitionGroupBy()
.facet("service")
.limit(10L)
.sort(new LogQueryDefinitionGroupBySort()
.aggregation("sum")
.order(WidgetSort.DESCENDING)
.facet("@prof_core_cpu_cores")))))))))));

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