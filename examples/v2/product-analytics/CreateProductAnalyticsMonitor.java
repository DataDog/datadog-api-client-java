// Create a Product Analytics monitor returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorCreateAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorCreateData;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorCreateRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorOptions;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorThresholds;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createProductAnalyticsMonitor", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsMonitorCreateRequest body =
        new ProductAnalyticsMonitorCreateRequest()
            .data(
                new ProductAnalyticsMonitorCreateData()
                    .attributes(
                        new ProductAnalyticsMonitorCreateAttributes()
                            .message(
                                """
Conversion from /a to /b dropped over the last hour

@slack-my-alerts-channel
""")
                            .name("Funnel conversion drop")
                            .options(
                                new ProductAnalyticsMonitorOptions()
                                    .thresholds(
                                        new ProductAnalyticsMonitorThresholds()
                                            .critical(1.0)
                                            .warning(2.0))
                                    .variables(
                                        Collections.singletonList(
                                            Map.ofEntries(
                                                Map.entry(
                                                    "data_source", "product_analytics_journey"),
                                                Map.entry("name", "query"),
                                                Map.entry(
                                                    "search",
                                                    "{'expression': 'node_0->node_1', 'filters':"
                                                        + " {'graph_filters': [{'name':"
                                                        + " '__dd.time_to_convert', 'operator':"
                                                        + " '<=', 'value': 86400000}]},"
                                                        + " 'join_keys': {'primary': '@usr.id'},"
                                                        + " 'node_objects': {'node_0':"
                                                        + " {'data_source': 'product_analytics',"
                                                        + " 'search': {'query': '@type:view"
                                                        + " @view.name:/a'}}, 'node_1':"
                                                        + " {'data_source': 'product_analytics',"
                                                        + " 'search': {'query': '@type:view"
                                                        + " @view.name:/b'}}}}")))))
                            .priority(3)
                            .query("""
formula("query").rollup("sum").last("1h") < 1
""")
                            .tags(
                                Map.ofEntries(
                                    Map.entry("chart_id", "chart-1"),
                                    Map.entry("query_type", "funnel"))))
                    .type(ProductAnalyticsMonitorRequestType.PA_MONITOR_REQUEST));

    try {
      ProductAnalyticsMonitorResponse result = apiInstance.createProductAnalyticsMonitor(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#createProductAnalyticsMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
