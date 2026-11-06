// Create a monitor with a metrics formula variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricQueryDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Monitor")
            .type(MonitorType.QUERY_ALERT)
            .query("""
formula("query1 / query2").rollup("avg").last("5m") > threshold
""")
            .message("some message Notify: @hipchat-channel")
            .tags(Arrays.asList("test:examplemonitor", "env:ci"))
            .options(
                new MonitorOptions()
                    .thresholds(
                        new MonitorThresholds()
                            .criticalQuery(
                                """
formula("query1 / query2").rollup("p99").last("1w").multiplier(1.5)
"""))
                    .variables(
                        Arrays.asList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionMetricQueryDefinition()
                                    .name("query1")
                                    .dataSource(
                                        MonitorFormulaAndFunctionMetricQueryDataSource.METRICS)
                                    .query("sum:trace.http.request.errors{*}.as_count()")),
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionMetricQueryDefinition()
                                    .name("query2")
                                    .dataSource(
                                        MonitorFormulaAndFunctionMetricQueryDataSource.METRICS)
                                    .query("sum:trace.http.request.hits{*}.as_count()")))));

    try {
      Monitor result = apiInstance.createMonitor(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#createMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
