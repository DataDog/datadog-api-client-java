// Create a Data Jobs monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
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
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Monitor")
            .type(MonitorType.DATA_JOBS_ALERT)
            .query(
                """
formula("failed_runs(run_query)").by(job_name,workspace_name).last(10d) > 0
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
                                    .jobsQuery("job_name:*")
                                    .jobType("databricks.job")
                                    .queryDialect("metric")))));

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
