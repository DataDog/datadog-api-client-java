// Create a geomap widget with conditional formats and text formats

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DashboardReflowType;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.FormulaType;
import com.datadog.api.client.v1.model.GeomapWidgetDefinition;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionStyle;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionType;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionView;
import com.datadog.api.client.v1.model.GeomapWidgetRequest;
import com.datadog.api.client.v1.model.GeomapWidgetRequestStyle;
import com.datadog.api.client.v1.model.ListStreamColumn;
import com.datadog.api.client.v1.model.ListStreamColumnWidth;
import com.datadog.api.client.v1.model.ListStreamQuery;
import com.datadog.api.client.v1.model.ListStreamSource;
import com.datadog.api.client.v1.model.TableWidgetTextFormatMatch;
import com.datadog.api.client.v1.model.TableWidgetTextFormatMatchType;
import com.datadog.api.client.v1.model.TableWidgetTextFormatPalette;
import com.datadog.api.client.v1.model.TableWidgetTextFormatRule;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetComparator;
import com.datadog.api.client.v1.model.WidgetConditionalFormat;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetFormulaSort;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetPalette;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetSortBy;
import com.datadog.api.client.v1.model.WidgetSortOrderBy;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description("Example-Dashboard")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new GeomapWidgetDefinition()
                                    .title("Log Count by Service and Source")
                                    .type(GeomapWidgetDefinitionType.GEOMAP)
                                    .requests(
                                        Arrays.asList(
                                            new GeomapWidgetRequest()
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .RUM)
                                                                .name("query1")
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query("@type:session"))
                                                                .indexes(
                                                                    Collections.singletonList("*"))
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .COUNT)))))
                                                .conditionalFormats(
                                                    Collections.singletonList(
                                                        new WidgetConditionalFormat()
                                                            .comparator(
                                                                WidgetComparator.GREATER_THAN)
                                                            .value(1000.0)
                                                            .palette(WidgetPalette.WHITE_ON_GREEN)))
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula().formula("query1")))
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
                                                                                .DESCENDING))))),
                                            new GeomapWidgetRequest()
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.EVENT_LIST)
                                                .query(
                                                    new ListStreamQuery()
                                                        .dataSource(ListStreamSource.LOGS_STREAM)
                                                        .queryString("")
                                                        .storage("hot"))
                                                .columns(
                                                    Arrays.asList(
                                                        new ListStreamColumn()
                                                            .field(
                                                                "@network.client.geoip.location.latitude")
                                                            .width(ListStreamColumnWidth.AUTO),
                                                        new ListStreamColumn()
                                                            .field(
                                                                "@network.client.geoip.location.longitude")
                                                            .width(ListStreamColumnWidth.AUTO),
                                                        new ListStreamColumn()
                                                            .field(
                                                                "@network.client.geoip.country.iso_code")
                                                            .width(ListStreamColumnWidth.AUTO),
                                                        new ListStreamColumn()
                                                            .field(
                                                                "@network.client.geoip.subdivision.name")
                                                            .width(ListStreamColumnWidth.AUTO)))
                                                .style(
                                                    new GeomapWidgetRequestStyle()
                                                        .colorBy("status"))
                                                .textFormats(
                                                    Collections.singletonList(
                                                        new TableWidgetTextFormatRule()
                                                            .match(
                                                                new TableWidgetTextFormatMatch()
                                                                    .type(
                                                                        TableWidgetTextFormatMatchType
                                                                            .IS)
                                                                    .value("error"))
                                                            .palette(
                                                                TableWidgetTextFormatPalette
                                                                    .WHITE_ON_RED)))))
                                    .style(
                                        new GeomapWidgetDefinitionStyle()
                                            .palette("hostmap_blues")
                                            .paletteFlip(false))
                                    .view(new GeomapWidgetDefinitionView().focus("NORTH_AMERICA"))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(12L).height(6L))))
            .layoutType(DashboardLayoutType.ORDERED)
            .reflowType(DashboardReflowType.FIXED);

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
