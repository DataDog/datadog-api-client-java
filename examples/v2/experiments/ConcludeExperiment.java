// Conclude experiment returns "The experiment was concluded and the winning variant was rolled out
// to its linked feature
// flag allocation." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsConcludeExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsConcludeExperimentV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsConcludeExperimentV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsConcludeExperimentV2RequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsConcludeExperimentV2Request body =
        new ExperimentsConcludeExperimentV2Request()
            .data(
                new ExperimentsConcludeExperimentV2RequestData()
                    .attributes(
                        new ExperimentsConcludeExperimentV2RequestDataAttributes()
                            .decisionVariantKey("treatment"))
                    .type(
                        ExperimentsConcludeExperimentV2RequestDataType
                            .CONCLUDE_EXPERIMENT_REQUEST));

    try {
      apiInstance.concludeExperiment(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#concludeExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
