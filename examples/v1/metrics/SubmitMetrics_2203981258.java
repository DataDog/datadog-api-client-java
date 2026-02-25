// Submit deflate metrics returns "Payload accepted" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.MetricsApi;
import com.datadog.api.client.v1.api.MetricsApi.SubmitMetricsOptionalParameters;
import com.datadog.api.client.v1.model.IntakePayloadAccepted;
import com.datadog.api.client.v1.model.MetricContentEncoding;
import com.datadog.api.client.v1.model.MetricsPayload;
import com.datadog.api.client.v1.model.Series;
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

    MetricsPayload body = new MetricsPayload()
.series(Collections.singletonList(new Series()
.metric("system.load.1")
.type("gauge")
.points(Collections.singletonList(Arrays.asList(Long.valueOf(OffsetDateTime.now().toInstant().getEpochSecond()).doubleValue(), 1.1)))
.tags(Collections.singletonList("test:ExampleMetric"))));

    try {
      IntakePayloadAccepted result = apiInstance.submitMetrics(body,new SubmitMetricsOptionalParameters().contentEncoding(MetricContentEncoding.DEFLATE));
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