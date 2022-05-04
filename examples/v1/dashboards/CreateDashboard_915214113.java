// Create a new dashboard with geomap widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryGroupBy;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryGroupBySort;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.GeomapWidgetDefinition;
import com.datadog.api.v1.client.model.GeomapWidgetDefinitionStyle;
import com.datadog.api.v1.client.model.GeomapWidgetDefinitionType;
import com.datadog.api.v1.client.model.GeomapWidgetDefinitionView;
import com.datadog.api.v1.client.model.GeomapWidgetRequest;
import com.datadog.api.v1.client.model.QuerySortOrder;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetFormulaLimit;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_geomap_widget")
            .description(null)
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(30L))
                        .definition(
                            new WidgetDefinition(
                                new GeomapWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime())
                                    .type(GeomapWidgetDefinitionType.GEOMAP)
                                    .requests(
                                        Collections.singletonList(
                                            new GeomapWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula()
                                                            .formula("query1")
                                                            .limit(
                                                                new WidgetFormulaLimit()
                                                                    .count(250L)
                                                                    .order(QuerySortOrder.DESC))))
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .name("query1")
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .RUM)
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query(""))
                                                                .indexes(
                                                                    Collections.singletonList("*"))
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .COUNT))
                                                                .groupBy(
                                                                    Collections.singletonList(
                                                                        new FormulaAndFunctionEventQueryGroupBy()
                                                                            .facet(
                                                                                "@geo.country_iso_code")
                                                                            .limit(250L)
                                                                            .sort(
                                                                                new FormulaAndFunctionEventQueryGroupBySort()
                                                                                    .order(
                                                                                        QuerySortOrder
                                                                                            .DESC)
                                                                                    .aggregation(
                                                                                        FormulaAndFunctionEventAggregation
                                                                                            .COUNT)))))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)))
                                    .style(
                                        new GeomapWidgetDefinitionStyle()
                                            .palette("hostmap_blues")
                                            .paletteFlip(false))
                                    .view(new GeomapWidgetDefinitionView().focus("WORLD"))))))
            .layoutType(DashboardLayoutType.FREE)
            .isReadOnly(false);

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
