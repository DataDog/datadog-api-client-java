// Create a new dashboard with geomap widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryGroupBy;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryGroupBySort;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.FormulaType;
import com.datadog.api.client.v1.model.GeomapWidgetDefinition;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionStyle;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionType;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionView;
import com.datadog.api.client.v1.model.GeomapWidgetRequest;
import com.datadog.api.client.v1.model.QuerySortOrder;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetFormulaSort;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetSortBy;
import com.datadog.api.client.v1.model.WidgetSortOrderBy;
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
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .type(GeomapWidgetDefinitionType.GEOMAP)
                                    .requests(
                                        Collections.singletonList(
                                            new GeomapWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula().formula("query1")))
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
                                                .sort(
                                                    new WidgetSortBy()
                                                        .count(250L)
                                                        .orderBy(
                                                            Collections.singletonList(
                                                                new WidgetSortOrderBy(
                                                                    new WidgetFormulaSort()
                                                                        .type(FormulaType.FORMULA)
                                                                        .index(0L)
                                                                        .order(
                                                                            WidgetSort
                                                                                .DESCENDING)))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)))
                                    .style(
                                        new GeomapWidgetDefinitionStyle()
                                            .palette("hostmap_blues")
                                            .paletteFlip(false))
                                    .view(new GeomapWidgetDefinitionView().focus("WORLD"))))))
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
