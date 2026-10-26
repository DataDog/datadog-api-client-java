// Update experiment protocol returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentProtocolRequest;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentProtocolRequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentProtocolRequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponse;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponseDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_protocol" in the system
    UUID EXPERIMENT_PROTOCOL_DATA_ID = null;
    try {
      EXPERIMENT_PROTOCOL_DATA_ID = UUID.fromString(System.getenv("EXPERIMENT_PROTOCOL_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsPatchExperimentProtocolRequest body =
        new ExperimentsPatchExperimentProtocolRequest()
            .data(
                new ExperimentsPatchExperimentProtocolRequestData()
                    .type(ExperimentsPublicProtocolResponseDataType.PROTOCOLS)
                    .id(EXPERIMENT_PROTOCOL_DATA_ID)
                    .attributes(
                        new ExperimentsPatchExperimentProtocolRequestDataAttributes()
                            .description("Updated protocol description.")));

    try {
      ExperimentsPublicProtocolResponse result =
          apiInstance.patchExperimentProtocol(EXPERIMENT_PROTOCOL_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#patchExperimentProtocol");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
