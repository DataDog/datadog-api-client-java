// Create a RUM formula and functions monitor returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventAggregation;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionEventsDataSource;
import com.datadog.api.v1.client.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorThresholds;
import com.datadog.api.v1.client.model.MonitorType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Create_a_RUM_formula_and_functions_monitor_returns_OK_response")
            .type(MonitorType.RUM_ALERT)
            .query("""
formula("query2 / query1 * 100").last("15m") >= 0.8
""")
            .message("some message Notify: @hipchat-channel")
            .tags(
                Arrays.asList(
                    "test:examplecreatearumformulaandfunctionsmonitorreturnsokresponse", "env:ci"))
            .priority(3L)
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds().critical(0.8))
                    .variables(
                        Arrays.asList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionEventQueryDefinition()
                                    .dataSource(MonitorFormulaAndFunctionEventsDataSource.RUM)
                                    .name("query2")
                                    .search(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionSearch()
                                            .query(""))
                                    .indexes(Collections.singletonList("*"))
                                    .compute(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionCompute()
                                            .aggregation(
                                                MonitorFormulaAndFunctionEventAggregation.COUNT))),
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionEventQueryDefinition()
                                    .dataSource(MonitorFormulaAndFunctionEventsDataSource.RUM)
                                    .name("query1")
                                    .search(
                                        new MonitorFormulaAndFunctionEventQueryDefinitionSearch()
                                            .query("status:error"))
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
