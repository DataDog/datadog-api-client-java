// Delete experiment metric group returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment" in the system
    UUID EXPERIMENT_DATA_ID = null;
    try {
      EXPERIMENT_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "experiment_metric_group" in the system
    UUID EXPERIMENT_METRIC_GROUP_DATA_ID = null;
    try {
      EXPERIMENT_METRIC_GROUP_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_METRIC_GROUP_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteExperimentMetricGroup(EXPERIMENT_DATA_ID, EXPERIMENT_METRIC_GROUP_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#deleteExperimentMetricGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
