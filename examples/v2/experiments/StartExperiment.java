// Start experiment returns "The experiment was started." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "configured_experiment" in the system
    UUID CONFIGURED_EXPERIMENT_DATA_ID = null;
    try {
      CONFIGURED_EXPERIMENT_DATA_ID =
          UUID.fromString(System.getenv("CONFIGURED_EXPERIMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.startExperiment(CONFIGURED_EXPERIMENT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#startExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
