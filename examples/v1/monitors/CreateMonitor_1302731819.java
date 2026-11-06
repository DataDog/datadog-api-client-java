// Create a Data Jobs monitor with the aastra query dialect returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataJobsMonitorOptions;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataJobsQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Monitor")
            .type(MonitorType.DATA_JOBS_ALERT)
            .query(
                """
formula("failed_runs(run_query)").by(name,workspace_name,entity_id).last(1d) > 0
""")
            .message("Data jobs alert triggered")
            .tags(Arrays.asList("test:examplemonitor", "env:ci"))
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds())
                    .variables(
                        Collections.singletonList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionDataJobsQueryDefinition()
                                    .name("run_query")
                                    .jobsQuery("search for databricks_job")
                                    .jobType("databricks.job")
                                    .queryDialect("aastra")
                                    .runFilter("env:prod")
                                    .monitorOptions(
                                        new MonitorFormulaAndFunctionDataJobsMonitorOptions()
                                            .alertOnEveryFailure(true))))));

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
