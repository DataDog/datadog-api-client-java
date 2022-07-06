// Submit metrics returns "Payload accepted" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.MetricsApi;
import com.datadog.api.client.v1.model.IntakePayloadAccepted;
import com.datadog.api.client.v1.model.MetricsPayload;
import com.datadog.api.client.v1.model.Series;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class SubmitMetrics {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricsPayload body =
        new MetricsPayload()
            .series(
                Collections.singletonList(
                    new Series()
                        .metric("system.load.1")
                        .type("gauge")
                        .points(
                            Collections.singletonList(
                                Arrays.asList(
                                    Long.valueOf(OffsetDateTime.now().toInstant().getEpochSecond())
                                        .doubleValue(),
                                    1.1)))
                        .tags(
                            Collections.singletonList(
                                "test:ExampleSubmitmetricsreturnsPayloadacceptedresponse"))));

    try {
      IntakePayloadAccepted result = apiInstance.submitMetrics(body);
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
