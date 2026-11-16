// Create a Data Jobs duration monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityDetectionType;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityMonitorOptions;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
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
formula("job_duration(run_query)").detection(anomaly).by(name,workspace_name,entity_id) > 0
""")
            .message("Data jobs duration alert triggered")
            .tags(Arrays.asList("test:examplemonitor", "env:ci"))
            .options(
                new MonitorOptions()
                    .variables(
                        Collections.singletonList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionDataQualityQueryDefinition()
                                    .name("run_query")
                                    .dataSource(
                                        MonitorFormulaAndFunctionDataQualityDataSource
                                            .DATA_QUALITY_METRICS)
                                    .schemaVersion("0.0.1")
                                    .measure("duration")
                                    .filter("search for databricks_job")
                                    .runFilter("env:prod")
                                    .groupBy(Arrays.asList("name", "workspace_name", "entity_id"))
                                    .monitorOptions(
                                        new MonitorFormulaAndFunctionDataQualityMonitorOptions()
                                            .detectionType(
                                                MonitorFormulaAndFunctionDataQualityDetectionType
                                                    .ANOMALY)
                                            .consecutiveRuns(2L))))));

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
