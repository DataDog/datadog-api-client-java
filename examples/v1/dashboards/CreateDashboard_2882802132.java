// Create a new dashboard with hostmap infra widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.HostMapWidgetDefinition;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionRequests;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.HostMapWidgetDimension;
import com.datadog.api.client.v1.model.HostMapWidgetFormula;
import com.datadog.api.client.v1.model.HostMapWidgetGroupBy;
import com.datadog.api.client.v1.model.HostMapWidgetInfrastructureRequestRequestType;
import com.datadog.api.client.v1.model.HostMapWidgetInfrastructureStyle;
import com.datadog.api.client.v1.model.HostMapWidgetNodeType;
import com.datadog.api.client.v1.model.HostMapWidgetScalarRequest;
import com.datadog.api.client.v1.model.HostMapWidgetScalarRequestResponseFormat;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description(null)
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(22L))
                        .definition(
                            new WidgetDefinition(
                                new HostMapWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(HostMapWidgetDefinitionType.HOSTMAP)
                                    .requests(
                                        new HostMapWidgetDefinitionRequests()
                                            .requestType(
                                                HostMapWidgetInfrastructureRequestRequestType
                                                    .INFRASTRUCTURE_HOSTMAP)
                                            .nodeType(HostMapWidgetNodeType.HOST)
                                            .filter("env:prod")
                                            .groupBy(
                                                Collections.singletonList(
                                                    new HostMapWidgetGroupBy()
                                                        .column("tags")
                                                        .key("service")))
                                            .enrichments(
                                                Collections.singletonList(
                                                    new HostMapWidgetScalarRequest()
                                                        .responseFormat(
                                                            HostMapWidgetScalarRequestResponseFormat
                                                                .SCALAR)
                                                        .queries(
                                                            Collections.singletonList(
                                                                new FormulaAndFunctionQueryDefinition(
                                                                    new FormulaAndFunctionMetricQueryDefinition()
                                                                        .dataSource(
                                                                            FormulaAndFunctionMetricDataSource
                                                                                .METRICS)
                                                                        .name("query1")
                                                                        .query(
                                                                            "avg:system.cpu.user{*}"
                                                                                + " by {host}"))))
                                                        .formulas(
                                                            Collections.singletonList(
                                                                new HostMapWidgetFormula()
                                                                    .formula("query1")
                                                                    .dimension(
                                                                        HostMapWidgetDimension
                                                                            .FILL)))))
                                            .style(
                                                new HostMapWidgetInfrastructureStyle()
                                                    .palette("green_to_orange")
                                                    .paletteFlip(false)))))))
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
