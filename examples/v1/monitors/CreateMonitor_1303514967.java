// Create a Cost Monitor returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionCostAggregator;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionCostDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionCostQueryDefinition;
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
.name("Example Monitor")
.type(MonitorType.COST_ALERT)
.query("""
formula("exclude_null(query1)").last("7d").anomaly(direction="above", threshold=10) >= 5
""")
.message("some message Notify: @hipchat-channel")
.tags(Arrays.asList("test:examplemonitor", "env:ci"))
.priority(3L)
.options(new MonitorOptions()
.thresholds(new MonitorThresholds()
.critical(5.0)
.warning(3.0))
.variables(Collections.singletonList(new MonitorFormulaAndFunctionQueryDefinition(
new MonitorFormulaAndFunctionCostQueryDefinition()
.dataSource(MonitorFormulaAndFunctionCostDataSource.CLOUD_COST)
.query("sum:aws.cost.net.amortized.shared.resources.allocated{aws_product IN (amplify ,athena, backup, bedrock ) } by {aws_product}.rollup(sum, 86400)")
.name("query1")
.aggregator(MonitorFormulaAndFunctionCostAggregator.SUM))))
.includeTags(true));

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