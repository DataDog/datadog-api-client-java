// Timeseries cross product query with apm_dependency_stats data source returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.ApmDependencyStatName;
import com.datadog.api.client.v2.model.ApmDependencyStatsDataSource;
import com.datadog.api.client.v2.model.ApmDependencyStatsQuery;
import com.datadog.api.client.v2.model.FormulaLimit;
import com.datadog.api.client.v2.model.QueryFormula;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryRequest;
import com.datadog.api.client.v2.model.TimeseriesFormulaQueryResponse;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequest;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequestAttributes;
import com.datadog.api.client.v2.model.TimeseriesFormulaRequestType;
import com.datadog.api.client.v2.model.TimeseriesQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    TimeseriesFormulaQueryRequest body =
        new TimeseriesFormulaQueryRequest()
            .data(
                new TimeseriesFormulaRequest()
                    .attributes(
                        new TimeseriesFormulaRequestAttributes()
                            .formulas(
                                Collections.singletonList(
                                    new QueryFormula()
                                        .formula("a")
                                        .limit(
                                            new FormulaLimit()
                                                .count(10)
                                                .order(QuerySortOrder.DESC))))
                            .from(1636625471000L)
                            .interval(5000L)
                            .queries(
                                Collections.singletonList(
                                    new TimeseriesQuery(
                                        new ApmDependencyStatsQuery()
                                            .dataSource(
                                                ApmDependencyStatsDataSource.APM_DEPENDENCY_STATS)
                                            .name("a")
                                            .env("ci")
                                            .service("cassandra")
                                            .stat(ApmDependencyStatName.AVG_DURATION)
                                            .operationName("cassandra.query")
                                            .resourceName(
                                                "DELETE FROM"
                                                    + " monitor_history.monitor_state_change_history"
                                                    + " WHERE org_id = ? AND monitor_id IN ? AND"
                                                    + " group = ?")
                                            .primaryTagName("datacenter")
                                            .primaryTagValue("edge-eu1.prod.dog"))))
                            .to(1636629071000L))
                    .type(TimeseriesFormulaRequestType.TIMESERIES_REQUEST));

    try {
      TimeseriesFormulaQueryResponse result = apiInstance.queryTimeseriesData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#queryTimeseriesData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
