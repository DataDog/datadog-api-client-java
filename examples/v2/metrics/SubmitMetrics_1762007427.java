// Submit metrics with compression returns "Payload accepted" response
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.api.MetricsApi.SubmitMetricsOptionalParameters;
import com.datadog.api.v2.client.model.IntakePayloadAccepted;
import com.datadog.api.v2.client.model.MetricContentEncoding;
import com.datadog.api.v2.client.model.MetricIntakeType;
import com.datadog.api.v2.client.model.MetricPayload;
import com.datadog.api.v2.client.model.MetricPoint;
import com.datadog.api.v2.client.model.MetricSeries;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricPayload body =
        new MetricPayload()
            .series(
                Collections.singletonList(
                    new MetricSeries()
                        .metric("system.load.1")
                        .type(MetricIntakeType.UNSPECIFIED)
                        .points(
                            Collections.singletonList(
                                new MetricPoint()
                                    .timestamp(OffsetDateTime.now().toInstant().getEpochSecond())
                                    .value(0.7)))));

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
