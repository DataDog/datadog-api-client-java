// Create a monitor with aggregate filtered query variables returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateBaseQuery;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateFilterQuery;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateFilteredDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateFilteredQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateQueryFilter;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricsDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricsQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableColumn;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableQueryDefinition;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Monitor")
            .type(MonitorType.QUERY_ALERT)
            .query("""
formula("query1").rollup("sum").last("5m") > 100
""")
            .message("test message")
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds().critical(100.0))
                    .variables(
                        Collections.singletonList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionAggregateFilteredQueryDefinition()
                                    .dataSource(
                                        MonitorFormulaAndFunctionAggregateFilteredDataSource
                                            .AGGREGATE_FILTERED_QUERY)
                                    .name("query1")
                                    .baseQuery(
                                        new MonitorFormulaAndFunctionAggregateBaseQuery(
                                            new MonitorFormulaAndFunctionMetricsQueryDefinition()
                                                .dataSource(
                                                    MonitorFormulaAndFunctionMetricsDataSource
                                                        .METRICS)
                                                .name("query1")
                                                .query(
                                                    "max:container.cpu.usage{*} by"
                                                        + " {kube_cluster_name}.rollup(max)")))
                                    .filterQuery(
                                        new MonitorFormulaAndFunctionAggregateFilterQuery(
                                            new MonitorFormulaAndFunctionReferenceTableQueryDefinition()
                                                .name("filter_query")
                                                .dataSource(
                                                    MonitorFormulaAndFunctionReferenceTableDataSource
                                                        .REFERENCE_TABLE)
                                                .tableName("test_table")
                                                .columns(
                                                    Collections.singletonList(
                                                        new MonitorFormulaAndFunctionReferenceTableColumn()
                                                            .name("cluster_name")))))
                                    .filters(
                                        Collections.singletonList(
                                            new MonitorFormulaAndFunctionAggregateQueryFilter()
                                                .baseAttribute("kube_cluster_name")
                                                .filterAttribute("cluster_name")))))));

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
