// Submit deflate metrics returns "Payload accepted" response
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MetricsApi;
import com.datadog.api.v1.client.api.MetricsApi.SubmitMetricsOptionalParameters;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.MetricContentEncoding;
import com.datadog.api.v1.client.model.MetricsPayload;
import com.datadog.api.v1.client.model.Series;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricsPayload body =
        new MetricsPayload()
            .series(
                new ArrayList<Series>() {
                  {
                    add(
                        new Series()
                            .metric("system.load.1")
                            .type("gauge")
                            .points(
                                new ArrayList<List<Double>>() {
                                  {
                                    add(
                                        new ArrayList<Double>() {
                                          {
                                            add(
                                                Long.valueOf(
                                                        OffsetDateTime.now()
                                                            .toInstant()
                                                            .getEpochSecond())
                                                    .doubleValue());
                                            add(1.1);
                                          }
                                        });
                                  }
                                })
                            .tags(
                                new ArrayList<String>() {
                                  {
                                    add(
                                        "test:TestExampleSubmitdeflatemetricsreturnsPayloadacceptedresponse");
                                  }
                                }));
                  }
                });

    try {
      IntakePayloadAccepted result =
          apiInstance.submitMetrics(
              body,
              new SubmitMetricsOptionalParameters().contentEncoding(MetricContentEncoding.DEFLATE));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#submitMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
