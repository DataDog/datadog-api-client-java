// Create a Data Quality monitor returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionDataQualityQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
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
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body = new Monitor()
.name("Example-Monitor")
.type(MonitorType.DATA_QUALITY_ALERT)
.query("""
formula("query1").last("5m") > 100
""")
.message("Data quality alert triggered")
.tags(Arrays.asList("test:examplemonitor", "env:ci"))
.priority(3L)
.options(new MonitorOptions()
.thresholds(new MonitorThresholds()
.critical(100.0))
.variables(Collections.singletonList(new MonitorFormulaAndFunctionQueryDefinition(
new MonitorFormulaAndFunctionDataQualityQueryDefinition()
.name("query1")
.dataSource(MonitorFormulaAndFunctionDataQualityDataSource.DATA_QUALITY_METRICS)
.measure("row_count")
.filter("search for column where `database:production AND table:users`")
.groupBy(Collections.singletonList("entity_id"))))));

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