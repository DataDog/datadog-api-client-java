// Create a new dashboard with an audit logs query

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Create_a_new_dashboard_with_an_audit_logs_query with Audit Logs Query")
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
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.TIMESERIES)
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query(""))
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .AUDIT)
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .COUNT))
                                                                .name("query1")
                                                                .indexes(
                                                                    Collections.singletonList(
                                                                        "*")))))))))
                        .layout(new WidgetLayout().x(2L).y(0L).width(4L).height(2L))));

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
