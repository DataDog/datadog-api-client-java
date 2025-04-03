// Submit deflate distribution points returns "Payload accepted" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.MetricsApi;
import com.datadog.api.client.v1.api.MetricsApi.SubmitDistributionPointsOptionalParameters;
import com.datadog.api.client.v1.model.IntakePayloadAccepted;
import com.datadog.api.client.v1.model.DistributionPointItems;
import com.datadog.api.client.v1.model.DistributionPointsContentEncoding;
import com.datadog.api.client.v1.model.DistributionPointsPayload;
import com.datadog.api.client.v1.model.DistributionPointsSeries;
import com.datadog.api.client.v1.model.DistributionPointTimestamp;
import com.datadog.api.client.v1.model.List<DistributionPointItems>;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    DistributionPointsPayload body = new DistributionPointsPayload()
.series(Collections.singletonList(new DistributionPointsSeries()
.metric("system.load.1.dist")
.points(Collections.singletonList(Arrays.asList(new DistributionPointItems(
Long.valueOf(OffsetDateTime.now().toInstant().getEpochSecond()).doubleValue()), new List<DistributionPointItems>(Arrays.asList(1.0, 2.0)))))));

    try {
      IntakePayloadAccepted result = apiInstance.submitDistributionPoints(body,new SubmitDistributionPointsOptionalParameters().contentEncoding(DistributionPointsContentEncoding.DEFLATE));
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