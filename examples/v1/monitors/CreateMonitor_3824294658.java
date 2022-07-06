// Create a ci-pipelines formula and functions monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Create_a_ci_pipelines_formula_and_functions_monitor_returns_OK_response")
            .type(MonitorType.CI_PIPELINES_ALERT)
            .query("""
formula("query1 / query2 * 100").last("15m") >= 0.8
""")
            .message("some message Notify: @hipchat-channel")
            .tags(
                Arrays.asList(
                    "test:examplecreateacipipelinesformulaandfunctionsmonitorreturnsokresponse",
                    "env:ci"))
            .priority(3L)
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds().critical(0.8))
                    .variables(
                        Arrays.asList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionEventQueryDefinition()
                                    .dataSource(
                                        MonitorFormulaAndFunctionEventsDataSource.CI_PIPELINES)
                                    .name("query1")
                                    .search(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionSearch()
                                            .query("@ci.status:error"))
                                    .indexes(Collections.singletonList("*"))
                                    .compute(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionCompute()
                                            .aggregation(
                                                MonitorFormulaAndFunctionEventAggregation.COUNT))),
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionEventQueryDefinition()
                                    .dataSource(
                                        MonitorFormulaAndFunctionEventsDataSource.CI_PIPELINES)
                                    .name("query2")
                                    .search(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionSearch()
                                            .query(""))
                                    .indexes(Collections.singletonList("*"))
                                    .compute(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionCompute()
                                            .aggregation(
                                                MonitorFormulaAndFunctionEventAggregation
                                                    .COUNT))))));

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
