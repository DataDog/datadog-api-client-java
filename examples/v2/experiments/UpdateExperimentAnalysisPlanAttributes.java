// Update experiment analysis plan attributes returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanV2MutationResponse;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanWriteV2Request;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanWriteV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanWriteV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanWriteV2RequestDataType;
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

    ExperimentsAnalysisPlanWriteV2Request body =
        new ExperimentsAnalysisPlanWriteV2Request()
            .data(
                new ExperimentsAnalysisPlanWriteV2RequestData()
                    .type(ExperimentsAnalysisPlanWriteV2RequestDataType.ANALYSIS_PLANS)
                    .id(EXPERIMENT_DATA_ID)
                    .attributes(
                        new ExperimentsAnalysisPlanWriteV2RequestDataAttributes()
                            .confidenceLevel(0.9)));

    try {
      ExperimentsAnalysisPlanV2MutationResponse result =
          apiInstance.updateExperimentAnalysisPlanAttributes(EXPERIMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ExperimentsApi#updateExperimentAnalysisPlanAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
