// Submit distribution points returns "Payload accepted" response
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MetricsApi;
import com.datadog.api.v1.client.model.DistributionPointItem;
import com.datadog.api.v1.client.model.DistributionPointsPayload;
import com.datadog.api.v1.client.model.DistributionPointsSeries;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    DistributionPointsPayload body =
        new DistributionPointsPayload()
            .series(
                Collections.singletonList(
                    new DistributionPointsSeries()
                        .metric("system.load.1.dist")
                        .points(
                            Collections.singletonList(
                                Arrays.asList(
                                    new DistributionPointItem(
                                        Long.valueOf(
                                                OffsetDateTime.now().toInstant().getEpochSecond())
                                            .doubleValue()),
                                    new DistributionPointItem(Arrays.asList(1.0, 2.0)))))));

    try {
      IntakePayloadAccepted result = apiInstance.submitDistributionPoints(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#submitDistributionPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
