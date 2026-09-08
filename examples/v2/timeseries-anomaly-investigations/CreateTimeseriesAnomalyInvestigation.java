// Investigate a timeseries anomaly returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TimeseriesAnomalyInvestigationsApi;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationDataSource;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationFormula;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationMetricQuery;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationRequest;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationRequestAttributes;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationRequestData;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationResponse;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationTimeseriesRequest;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTimeseriesAnomalyInvestigation", true);
    TimeseriesAnomalyInvestigationsApi apiInstance =
        new TimeseriesAnomalyInvestigationsApi(defaultClient);

    TimeseriesAnomalyInvestigationRequest body =
        new TimeseriesAnomalyInvestigationRequest()
            .data(
                new TimeseriesAnomalyInvestigationRequestData()
                    .attributes(
                        new TimeseriesAnomalyInvestigationRequestAttributes()
                            .requests(
                                Collections.singletonList(
                                    new TimeseriesAnomalyInvestigationTimeseriesRequest()
                                        .formulas(
                                            Collections.singletonList(
                                                new TimeseriesAnomalyInvestigationFormula()
                                                    .formula("anomalies(query1, 'agile', 3)")))
                                        .from(1754406000000L)
                                        .queries(
                                            Collections.singletonList(
                                                new TimeseriesAnomalyInvestigationMetricQuery()
                                                    .dataSource(
                                                        TimeseriesAnomalyInvestigationDataSource
                                                            .METRICS)
                                                    .name("query1")
                                                    .query(
                                                        "avg:system.cpu.user{env:prod} by"
                                                            + " {service}")))
                                        .to(1754423940000L))))
                    .type(TimeseriesAnomalyInvestigationType.TIMESERIES_ANOMALY_INVESTIGATION));

    try {
      TimeseriesAnomalyInvestigationResponse result =
          apiInstance.createTimeseriesAnomalyInvestigation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " TimeseriesAnomalyInvestigationsApi#createTimeseriesAnomalyInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
