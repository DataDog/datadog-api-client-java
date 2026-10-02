// Update metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsMetricV2DTO;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricV2Request;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricV2RequestDataAttributes;
import com.datadog.api.client.v2.model.MetricType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_metric" in the system
    UUID EXPERIMENT_METRIC_DATA_ID = null;
    try {
      EXPERIMENT_METRIC_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_METRIC_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsUpdateMetricV2Request body =
        new ExperimentsUpdateMetricV2Request()
            .data(
                new ExperimentsUpdateMetricV2RequestData()
                    .type(MetricType.METRICS)
                    .id(EXPERIMENT_METRIC_DATA_ID)
                    .attributes(
                        new ExperimentsUpdateMetricV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde updated")));

    try {
      ExperimentsMetricV2DTO result = apiInstance.updateMetric(EXPERIMENT_METRIC_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#updateMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
