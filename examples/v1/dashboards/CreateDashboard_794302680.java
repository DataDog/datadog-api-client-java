// Create a new dashboard with query_table widget and text formatting

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TableWidgetDefinition;
import com.datadog.api.client.v1.model.TableWidgetDefinitionType;
import com.datadog.api.client.v1.model.TableWidgetHasSearchBar;
import com.datadog.api.client.v1.model.TableWidgetRequest;
import com.datadog.api.client.v1.model.TableWidgetTextFormatMatch;
import com.datadog.api.client.v1.model.TableWidgetTextFormatMatchType;
import com.datadog.api.client.v1.model.TableWidgetTextFormatPalette;
import com.datadog.api.client.v1.model.TableWidgetTextFormatReplace;
import com.datadog.api.client.v1.model.TableWidgetTextFormatReplaceAll;
import com.datadog.api.client.v1.model.TableWidgetTextFormatReplaceAllType;
import com.datadog.api.client.v1.model.TableWidgetTextFormatRule;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TableWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(TableWidgetDefinitionType.QUERY_TABLE)
                                    .requests(
                                        Collections.singletonList(
                                            new TableWidgetRequest()
                                                .queries(
                                                    Arrays.asList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionMetricQueryDefinition()
                                                                .aggregator(
                                                                    FormulaAndFunctionMetricAggregation
                                                                        .AVG)
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query1")
                                                                .query(
                                                                    "avg:aws.stream.globalaccelerator.processed_bytes_in{*}"
                                                                        + " by {aws_account,acceleratoripaddress}")),
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionMetricQueryDefinition()
                                                                .aggregator(
                                                                    FormulaAndFunctionMetricAggregation
                                                                        .AVG)
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query2")
                                                                .query(
                                                                    "avg:aws.stream.globalaccelerator.processed_bytes_out{*}"
                                                                        + " by {aws_account,acceleratoripaddress}"))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .textFormats(
                                                    Arrays.asList(
                                                        Arrays.asList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS)
                                                                        .value("fruit"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .WHITE_ON_RED)
                                                                .replace(
                                                                    new TableWidgetTextFormatReplace(
                                                                        new TableWidgetTextFormatReplaceAll()
                                                                            .type(
                                                                                TableWidgetTextFormatReplaceAllType
                                                                                    .ALL)
                                                                            .with("vegetable"))),
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS)
                                                                        .value("animal"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .CUSTOM_BG)
                                                                .customBgColor("#632ca6"),
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS)
                                                                        .value("robot"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .RED_ON_WHITE),
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS)
                                                                        .value("ai"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .YELLOW_ON_WHITE)),
                                                        Collections.singletonList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS_NOT)
                                                                        .value("xyz"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .WHITE_ON_YELLOW)),
                                                        Collections.singletonList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .CONTAINS)
                                                                        .value("test"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .WHITE_ON_GREEN)
                                                                .replace(
                                                                    new TableWidgetTextFormatReplace(
                                                                        new TableWidgetTextFormatReplaceAll()
                                                                            .type(
                                                                                TableWidgetTextFormatReplaceAllType
                                                                                    .ALL)
                                                                            .with("vegetable")))),
                                                        Collections.singletonList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .DOES_NOT_CONTAIN)
                                                                        .value("blah"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .BLACK_ON_LIGHT_RED)),
                                                        Collections.singletonList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .STARTS_WITH)
                                                                        .value("abc"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .BLACK_ON_LIGHT_YELLOW)),
                                                        Arrays.asList(
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .ENDS_WITH)
                                                                        .value("xyz"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .BLACK_ON_LIGHT_GREEN),
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .ENDS_WITH)
                                                                        .value("zzz"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .GREEN_ON_WHITE),
                                                            new TableWidgetTextFormatRule()
                                                                .match(
                                                                    new TableWidgetTextFormatMatch()
                                                                        .type(
                                                                            TableWidgetTextFormatMatchType
                                                                                .IS)
                                                                        .value("animal"))
                                                                .palette(
                                                                    TableWidgetTextFormatPalette
                                                                        .CUSTOM_TEXT)
                                                                .customFgColor("#632ca6"))))))
                                    .hasSearchBar(TableWidgetHasSearchBar.NEVER)))
                        .layout(new WidgetLayout().x(0L).y(0L).width(4L).height(4L))))
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
