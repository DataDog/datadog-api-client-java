// Create a new metric SLO object using bad events formula returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.SLOCountDefinition;
import com.datadog.api.client.v1.model.SLOCountSpec;
import com.datadog.api.client.v1.model.SLODataSourceQueryDefinition;
import com.datadog.api.client.v1.model.SLOFormula;
import com.datadog.api.client.v1.model.SLOListResponse;
import com.datadog.api.client.v1.model.SLOSliSpec;
import com.datadog.api.client.v1.model.SLOThreshold;
import com.datadog.api.client.v1.model.SLOTimeframe;
import com.datadog.api.client.v1.model.SLOType;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    ServiceLevelObjectiveRequest body =
        new ServiceLevelObjectiveRequest()
            .type(SLOType.METRIC)
            .description("Metric SLO using sli_specification")
            .name("Example-Service-Level-Objective")
            .sliSpecification(
                new SLOSliSpec(
                    new SLOCountSpec()
                        .count(
                            new SLOCountDefinition()
                                .goodEventsFormula(new SLOFormula().formula("query1 - query2"))
                                .badEventsFormula(new SLOFormula().formula("query2"))
                                .queries(
                                    Arrays.asList(
                                        new SLODataSourceQueryDefinition(
                                            new FormulaAndFunctionMetricQueryDefinition()
                                                .dataSource(
                                                    FormulaAndFunctionMetricDataSource.METRICS)
                                                .name("query1")
                                                .query("sum:httpservice.hits{*}.as_count()")),
                                        new SLODataSourceQueryDefinition(
                                            new FormulaAndFunctionMetricQueryDefinition()
                                                .dataSource(
                                                    FormulaAndFunctionMetricDataSource.METRICS)
                                                .name("query2")
                                                .query("sum:httpservice.errors{*}.as_count()")))))))
            .tags(Arrays.asList("env:prod", "type:count"))
            .thresholds(
                Collections.singletonList(
                    new SLOThreshold()
                        .target(99.0)
                        .targetDisplay("99.0")
                        .timeframe(SLOTimeframe.SEVEN_DAYS)
                        .warning(99.5)
                        .warningDisplay("99.5")))
            .timeframe(SLOTimeframe.SEVEN_DAYS)
            .targetThreshold(99.0)
            .warningThreshold(99.5);

    try {
      SLOListResponse result = apiInstance.createSLO(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#createSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
