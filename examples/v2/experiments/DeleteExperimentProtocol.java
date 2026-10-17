// Delete experiment protocol returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.api.ExperimentsApi.DeleteExperimentProtocolOptionalParameters;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_protocol" in the system
    String EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT =
        System.getenv("EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT");
    UUID EXPERIMENT_PROTOCOL_DATA_ID = null;
    try {
      EXPERIMENT_PROTOCOL_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_PROTOCOL_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteExperimentProtocol(
          EXPERIMENT_PROTOCOL_DATA_ID,
          new DeleteExperimentProtocolOptionalParameters()
              .expectedUpdatedAt(EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT));
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#deleteExperimentProtocol");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
