// Create a time-slice SLO object returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.SLODataSourceQueryDefinition;
import com.datadog.api.client.v1.model.SLOFormula;
import com.datadog.api.client.v1.model.SLOListResponse;
import com.datadog.api.client.v1.model.SLOSliSpec;
import com.datadog.api.client.v1.model.SLOThreshold;
import com.datadog.api.client.v1.model.SLOTimeSliceComparator;
import com.datadog.api.client.v1.model.SLOTimeSliceCondition;
import com.datadog.api.client.v1.model.SLOTimeSliceQuery;
import com.datadog.api.client.v1.model.SLOTimeSliceSpec;
import com.datadog.api.client.v1.model.SLOTimeframe;
import com.datadog.api.client.v1.model.SLOType;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    ServiceLevelObjectiveRequest body =
        new ServiceLevelObjectiveRequest()
            .type(SLOType.TIME_SLICE)
            .description("string")
            .name("Example-Service-Level-Objective")
            .sliSpecification(
                new SLOSliSpec(
                    new SLOTimeSliceSpec()
                        .timeSlice(
                            new SLOTimeSliceCondition()
                                .query(
                                    new SLOTimeSliceQuery()
                                        .formulas(
                                            Collections.singletonList(
                                                new SLOFormula().formula("query1")))
                                        .queries(
                                            Collections.singletonList(
                                                new SLODataSourceQueryDefinition(
                                                    new FormulaAndFunctionMetricQueryDefinition()
                                                        .dataSource(
                                                            FormulaAndFunctionMetricDataSource
                                                                .METRICS)
                                                        .name("query1")
                                                        .query(
                                                            "trace.servlet.request{env:prod}")))))
                                .comparator(SLOTimeSliceComparator.GREATER)
                                .threshold(5.0))))
            .tags(Collections.singletonList("env:prod"))
            .thresholds(
                Collections.singletonList(
                    new SLOThreshold()
                        .target(97.0)
                        .targetDisplay("97.0")
                        .timeframe(SLOTimeframe.SEVEN_DAYS)
                        .warning(98.0)
                        .warningDisplay("98.0")))
            .timeframe(SLOTimeframe.SEVEN_DAYS)
            .targetThreshold(97.0)
            .warningThreshold(98.0);

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
