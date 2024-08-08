// Submit metrics returns "Payload accepted" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.IntakePayloadAccepted;
import com.datadog.api.client.v2.model.MetricIntakeType;
import com.datadog.api.client.v2.model.MetricPayload;
import com.datadog.api.client.v2.model.MetricPoint;
import com.datadog.api.client.v2.model.MetricResource;
import com.datadog.api.client.v2.model.MetricSeries;
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

    MetricPayload body = new MetricPayload()
.series(Collections.singletonList(new MetricSeries()
.metric("system.load.1")
.type(MetricIntakeType.UNSPECIFIED)
.points(Collections.singletonList(new MetricPoint()
.timestamp(OffsetDateTime.now().toInstant().getEpochSecond())
.value(0.7)))
.resources(Collections.singletonList(new MetricResource()
.name("dummyhost")
.type("host")))));

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