// Cancel experiment returns "The experiment was canceled and unlinked from its feature flag
// allocations." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCancelExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsCancelExperimentV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCancelExperimentV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsCancelExperimentV2RequestDataType;
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

    ExperimentsCancelExperimentV2Request body =
        new ExperimentsCancelExperimentV2Request()
            .data(
                new ExperimentsCancelExperimentV2RequestData()
                    .type(ExperimentsCancelExperimentV2RequestDataType.CANCEL_EXPERIMENT_REQUEST)
                    .attributes(
                        new ExperimentsCancelExperimentV2RequestDataAttributes()
                            .reason("Cancel the test experiment")));

    try {
      apiInstance.cancelExperiment(EXPERIMENT_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#cancelExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
