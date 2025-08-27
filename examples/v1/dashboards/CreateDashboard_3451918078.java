// Create a new timeseries widget with new fixed span time format

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
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetLegendColumn;
import com.datadog.api.client.v1.model.TimeseriesWidgetLegendLayout;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetNewFixedSpan;
import com.datadog.api.client.v1.model.WidgetNewFixedSpanType;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard with new fixed span time")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TimeseriesWidgetDefinition()
                                    .title("")
                                    .showLegend(true)
                                    .legendLayout(TimeseriesWidgetLegendLayout.AUTO)
                                    .legendColumns(
                                        Arrays.asList(
                                            TimeseriesWidgetLegendColumn.AVG,
                                            TimeseriesWidgetLegendColumn.MIN,
                                            TimeseriesWidgetLegendColumn.MAX,
                                            TimeseriesWidgetLegendColumn.VALUE,
                                            TimeseriesWidgetLegendColumn.SUM))
                                    .time(
                                        new WidgetTime(
                                            new WidgetNewFixedSpan()
                                                .type(WidgetNewFixedSpanType.FIXED)
                                                .from(1712080128L)
                                                .to(1712083128L)
                                                .hideIncompleteCostData(true)))
                                    .type(TimeseriesWidgetDefinitionType.TIMESERIES)
                                    .requests(
                                        Collections.singletonList(
                                            new TimeseriesWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula().formula("query1")))
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .CI_PIPELINES)
                                                                .name("query1")
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query("ci_level:job"))
                                                                .indexes(
                                                                    Collections.singletonList("*"))
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .COUNT)
                                                                        .metric(
                                                                            "@ci.queue_time")))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.TIMESERIES)
                                                .style(
                                                    new WidgetRequestStyle()
                                                        .palette("dog_classic")
                                                        .lineType(WidgetLineType.SOLID)
                                                        .lineWidth(WidgetLineWidth.NORMAL))
                                                .displayType(WidgetDisplayType.LINE)))))))
            .layoutType(DashboardLayoutType.ORDERED)
            .reflowType(DashboardReflowType.AUTO);

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
