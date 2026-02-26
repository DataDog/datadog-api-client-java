// Create a new dashboard with split graph widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.SplitConfig;
import com.datadog.api.client.v1.model.SplitConfigSortCompute;
import com.datadog.api.client.v1.model.SplitDimension;
import com.datadog.api.client.v1.model.SplitGraphSourceWidgetDefinition;
import com.datadog.api.client.v1.model.SplitGraphVizSize;
import com.datadog.api.client.v1.model.SplitGraphWidgetDefinition;
import com.datadog.api.client.v1.model.SplitGraphWidgetDefinitionType;
import com.datadog.api.client.v1.model.SplitSort;
import com.datadog.api.client.v1.model.SplitVectorEntryItem;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
.title("Example-Dashboard")
.description("")
.widgets(Collections.singletonList(new Widget()
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(12L)
.height(8L))
.definition(new WidgetDefinition(
new SplitGraphWidgetDefinition()
.title("")
.type(SplitGraphWidgetDefinitionType.SPLIT_GROUP)
.sourceWidgetDefinition(new SplitGraphSourceWidgetDefinition(
new TimeseriesWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(TimeseriesWidgetDefinitionType.TIMESERIES)
.requests(Collections.singletonList(new TimeseriesWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.TIMESERIES)
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.name("query1")
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.query("avg:system.cpu.user{*}"))))
.style(new WidgetRequestStyle()
.palette("dog_classic")
.lineType(WidgetLineType.SOLID)
.lineWidth(WidgetLineWidth.NORMAL))
.displayType(WidgetDisplayType.LINE)))))
.splitConfig(new SplitConfig()
.splitDimensions(Collections.singletonList(new SplitDimension()
.oneGraphPer("service")))
.limit(24L)
.sort(new SplitSort()
.compute(new SplitConfigSortCompute()
.aggregation("sum")
.metric("system.cpu.user"))
.order(WidgetSort.DESCENDING))
.staticSplits(Arrays.asList(Arrays.asList(new SplitVectorEntryItem()
.tagKey("service")
.tagValues(Collections.singletonList("cassandra")), new SplitVectorEntryItem()
.tagKey("datacenter")), Collections.singletonList(new SplitVectorEntryItem()
.tagKey("demo")
.tagValues(Collections.singletonList("env"))))))
.size(SplitGraphVizSize.MD)
.hasUniformYAxes(true)))))
.layoutType(DashboardLayoutType.ORDERED);

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