// Create a new dashboard with topology_map custom widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.NumberFormatUnit;
import com.datadog.api.client.v1.model.NumberFormatUnitCanonical;
import com.datadog.api.client.v1.model.NumberFormatUnitScaleType;
import com.datadog.api.client.v1.model.TopologyMapInlineColumnKindScalar;
import com.datadog.api.client.v1.model.TopologyMapInlineColumnKindString;
import com.datadog.api.client.v1.model.TopologyMapInlineData;
import com.datadog.api.client.v1.model.TopologyMapInlineEdgeColumn;
import com.datadog.api.client.v1.model.TopologyMapInlineEdgeColumnId;
import com.datadog.api.client.v1.model.TopologyMapInlineEdgesData;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeColumn;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeIdColumn;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeIdColumnId;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeStringColumn;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeStringColumnId;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeValueColumn;
import com.datadog.api.client.v1.model.TopologyMapInlineNodeValueColumnMeta;
import com.datadog.api.client.v1.model.TopologyMapInlineNodesData;
import com.datadog.api.client.v1.model.TopologyMapLayout;
import com.datadog.api.client.v1.model.TopologyMapLayoutDirection;
import com.datadog.api.client.v1.model.TopologyMapLayoutType;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinition;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinitionCustom;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.TopologyRequestCustom;
import com.datadog.api.client.v1.model.TopologyRequestCustomProjection;
import com.datadog.api.client.v1.model.TopologyRequestCustomProjectionDimension;
import com.datadog.api.client.v1.model.TopologyRequestCustomProjectionType;
import com.datadog.api.client.v1.model.TopologyRequestCustomResponseFormat;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                        .definition(
                            new WidgetDefinition(
                                new TopologyMapWidgetDefinition(
                                    new TopologyMapWidgetDefinitionCustom()
                                        .title("")
                                        .titleSize("16")
                                        .titleAlign(WidgetTextAlign.LEFT)
                                        .type(TopologyMapWidgetDefinitionType.TOPOLOGY_MAP)
                                        .layout(
                                            new TopologyMapLayout()
                                                .type(TopologyMapLayoutType.HIERARCHICAL)
                                                .direction(
                                                    TopologyMapLayoutDirection.LEFT_TO_RIGHT))
                                        .data(
                                            new TopologyMapInlineData()
                                                .nodes(
                                                    new TopologyMapInlineNodesData()
                                                        .columns(
                                                            Arrays.asList(
                                                                new TopologyMapInlineNodeColumn(
                                                                    new TopologyMapInlineNodeIdColumn()
                                                                        .kind(
                                                                            TopologyMapInlineColumnKindString
                                                                                .STRING)
                                                                        .id(
                                                                            TopologyMapInlineNodeIdColumnId
                                                                                .ID)
                                                                        .values(
                                                                            Arrays.asList(
                                                                                "service:web",
                                                                                "service:db"))),
                                                                new TopologyMapInlineNodeColumn(
                                                                    new TopologyMapInlineNodeStringColumn()
                                                                        .kind(
                                                                            TopologyMapInlineColumnKindString
                                                                                .STRING)
                                                                        .id(
                                                                            TopologyMapInlineNodeStringColumnId
                                                                                .SUBTITLE)
                                                                        .values(
                                                                            Arrays.asList(
                                                                                "api-team", null))),
                                                                new TopologyMapInlineNodeColumn(
                                                                    new TopologyMapInlineNodeValueColumn()
                                                                        .kind(
                                                                            TopologyMapInlineColumnKindScalar
                                                                                .SCALAR)
                                                                        .id("values[1]")
                                                                        .values(
                                                                            Arrays.asList(
                                                                                1.5, null))
                                                                        .meta(
                                                                            new TopologyMapInlineNodeValueColumnMeta()
                                                                                .unit(
                                                                                    new NumberFormatUnit(
                                                                                        new NumberFormatUnitCanonical()
                                                                                            .type(
                                                                                                NumberFormatUnitScaleType
                                                                                                    .CANONICAL_UNIT)
                                                                                            .unitName(
                                                                                                "second"))))))))
                                                .edges(
                                                    new TopologyMapInlineEdgesData()
                                                        .columns(
                                                            Arrays.asList(
                                                                new TopologyMapInlineEdgeColumn()
                                                                    .kind(
                                                                        TopologyMapInlineColumnKindString
                                                                            .STRING)
                                                                    .id(
                                                                        TopologyMapInlineEdgeColumnId
                                                                            .SOURCE)
                                                                    .values(
                                                                        Collections.singletonList(
                                                                            "service:web")),
                                                                new TopologyMapInlineEdgeColumn()
                                                                    .kind(
                                                                        TopologyMapInlineColumnKindString
                                                                            .STRING)
                                                                    .id(
                                                                        TopologyMapInlineEdgeColumnId
                                                                            .TARGET)
                                                                    .values(
                                                                        Collections.singletonList(
                                                                            "service:db"))))))
                                        .requests(
                                            Collections.singletonList(
                                                new TopologyRequestCustom()
                                                    .responseFormat(
                                                        TopologyRequestCustomResponseFormat.SCALAR)
                                                    .queries(
                                                        Collections.singletonList(
                                                            new FormulaAndFunctionQueryDefinition(
                                                                new FormulaAndFunctionMetricQueryDefinition()
                                                                    .dataSource(
                                                                        FormulaAndFunctionMetricDataSource
                                                                            .METRICS)
                                                                    .name("a")
                                                                    .query(
                                                                        "avg:system.cpu.user{*} by"
                                                                            + " {service}")
                                                                    .aggregator(
                                                                        FormulaAndFunctionMetricAggregation
                                                                            .AVG))))
                                                    .formulas(
                                                        Collections.singletonList(
                                                            new WidgetFormula().formula("a")))
                                                    .projection(
                                                        new TopologyRequestCustomProjection()
                                                            .type(
                                                                TopologyRequestCustomProjectionType
                                                                    .CUSTOM_TOPOLOGY_MAP_NODE)
                                                            .dimensions(
                                                                Collections.singletonList(
                                                                    new TopologyRequestCustomProjectionDimension()
                                                                        .column("a")
                                                                        .dimension(
                                                                            "values[0]")))))))))))
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
