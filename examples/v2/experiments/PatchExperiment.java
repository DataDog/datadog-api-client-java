// Patch experiment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2Response;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2ResponseDataType;
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

    ExperimentsPatchExperimentV2Request body =
        new ExperimentsPatchExperimentV2Request()
            .data(
                new ExperimentsPatchExperimentV2RequestData()
                    .type(ExperimentsPatchExperimentV2ResponseDataType.EXPERIMENTS)
                    .attributes(
                        new ExperimentsPatchExperimentV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde updated")));

    try {
      ExperimentsPatchExperimentV2Response result =
          apiInstance.patchExperiment(EXPERIMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#patchExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
