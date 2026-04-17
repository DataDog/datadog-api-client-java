// Scalar cross product query with apm_metrics data source and span_kind returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.ApmMetricsDataSource;
import com.datadog.api.client.v2.model.ApmMetricsQuery;
import com.datadog.api.client.v2.model.ApmMetricsSpanKind;
import com.datadog.api.client.v2.model.ApmMetricsStat;
import com.datadog.api.client.v2.model.FormulaLimit;
import com.datadog.api.client.v2.model.QueryFormula;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.ScalarFormulaQueryRequest;
import com.datadog.api.client.v2.model.ScalarFormulaQueryResponse;
import com.datadog.api.client.v2.model.ScalarFormulaRequest;
import com.datadog.api.client.v2.model.ScalarFormulaRequestAttributes;
import com.datadog.api.client.v2.model.ScalarFormulaRequestType;
import com.datadog.api.client.v2.model.ScalarQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    ScalarFormulaQueryRequest body =
        new ScalarFormulaQueryRequest()
            .data(
                new ScalarFormulaRequest()
                    .attributes(
                        new ScalarFormulaRequestAttributes()
                            .formulas(
                                Collections.singletonList(
                                    new QueryFormula()
                                        .formula("a")
                                        .limit(
                                            new FormulaLimit()
                                                .count(10)
                                                .order(QuerySortOrder.DESC))))
                            .from(1636625471000L)
                            .queries(
                                Collections.singletonList(
                                    new ScalarQuery(
                                        new ApmMetricsQuery()
                                            .dataSource(ApmMetricsDataSource.APM_METRICS)
                                            .name("a")
                                            .stat(ApmMetricsStat.HITS)
                                            .service("web-store")
                                            .queryFilter("env:prod")
                                            .spanKind(ApmMetricsSpanKind.SERVER)
                                            .groupBy(Collections.singletonList("resource_name")))))
                            .to(1636629071000L))
                    .type(ScalarFormulaRequestType.SCALAR_REQUEST));

    try {
      ScalarFormulaQueryResponse result = apiInstance.queryScalarData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#queryScalarData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
