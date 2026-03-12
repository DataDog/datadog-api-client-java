// Create a monitor with aggregate augmented query variables returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateAugmentQuery;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateAugmentedDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateBaseQuery;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateQueryJoinCondition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionAggregateQueryJoinType;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionEventQueryGroupBy;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricsDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionMetricsQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableColumn;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableDataSource;
import com.datadog.api.client.v1.model.MonitorFormulaAndFunctionReferenceTableQueryDefinition;
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
            .type(MonitorType.QUERY_ALERT)
            .query("""
formula("query1").rollup("sum").last("5m") > 124
""")
            .message("test message")
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds().critical(124.0))
                    .variables(
                        Collections.singletonList(
                            new MonitorFormulaAndFunctionQueryDefinition(
                                new MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition()
                                    .dataSource(
                                        MonitorFormulaAndFunctionAggregateAugmentedDataSource
                                            .AGGREGATE_AUGMENTED_QUERY)
                                    .name("query1")
                                    .groupBy(
                                        Arrays.asList(
                                            new MonitorFormulaAndFunctionEventQueryGroupBy()
                                                .facet("org_id"),
                                            new MonitorFormulaAndFunctionEventQueryGroupBy()
                                                .facet("name")))
                                    .compute(
                                        Collections.singletonList(
                                            new MonitorFormulaAndFunctionEventQueryDefinitionCompute()
                                                .name("compute_result")
                                                .aggregation(
                                                    MonitorFormulaAndFunctionEventAggregation.MAX)))
                                    .augmentQuery(
                                        new MonitorFormulaAndFunctionAggregateAugmentQuery(
                                            new MonitorFormulaAndFunctionReferenceTableQueryDefinition()
                                                .name("filter_query")
                                                .dataSource(
                                                    MonitorFormulaAndFunctionReferenceTableDataSource
                                                        .REFERENCE_TABLE)
                                                .tableName("test_table")
                                                .columns(
                                                    Arrays.asList(
                                                        new MonitorFormulaAndFunctionReferenceTableColumn()
                                                            .name("org_id"),
                                                        new MonitorFormulaAndFunctionReferenceTableColumn()
                                                            .name("name")))))
                                    .baseQuery(
                                        new MonitorFormulaAndFunctionAggregateBaseQuery(
                                            new MonitorFormulaAndFunctionMetricsQueryDefinition()
                                                .dataSource(
                                                    MonitorFormulaAndFunctionMetricsDataSource
                                                        .METRICS)
                                                .name("query1")
                                                .query("avg:dd{*} by {org_id}.as_count()")))
                                    .joinCondition(
                                        new MonitorFormulaAndFunctionAggregateQueryJoinCondition()
                                            .augmentAttribute("org_id")
                                            .baseAttribute("org_id")
                                            .joinType(
                                                MonitorFormulaAndFunctionAggregateQueryJoinType
                                                    .INNER))))));

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
