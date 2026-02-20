// Create a new dashboard with formula and function distribution widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DistributionWidgetDefinition;
import com.datadog.api.client.v1.model.DistributionWidgetDefinitionType;
import com.datadog.api.client.v1.model.DistributionWidgetRequest;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryGroupBy;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryGroupByConfig;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryGroupBySort;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.QuerySortOrder;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                        .definition(
                            new WidgetDefinition(
                                new DistributionWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .type(DistributionWidgetDefinitionType.DISTRIBUTION)
                                    .requests(
                                        Collections.singletonList(
                                            new DistributionWidgetRequest()
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .LOGS)
                                                                .name("query1")
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query(""))
                                                                .indexes(
                                                                    Collections.singletonList("*"))
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .AVG)
                                                                        .metric("@duration"))
                                                                .groupBy(
                                                                    new FormulaAndFunctionEventQueryGroupByConfig(
                                                                        Collections.singletonList(
                                                                            new FormulaAndFunctionEventQueryGroupBy()
                                                                                .facet("service")
                                                                                .limit(1000L)
                                                                                .sort(
                                                                                    new FormulaAndFunctionEventQueryGroupBySort()
                                                                                        .aggregation(
                                                                                            FormulaAndFunctionEventAggregation
                                                                                                .COUNT)
                                                                                        .order(
                                                                                            QuerySortOrder
                                                                                                .DESC)))))
                                                                .storage("hot"))))))))))
            .layoutType(DashboardLayoutType.FREE);

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
