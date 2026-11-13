// Update an environment to disable full evaluation data returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import com.datadog.api.client.v2.model.UpdateEnvironmentAttributes;
import com.datadog.api.client.v2.model.UpdateEnvironmentData;
import com.datadog.api.client.v2.model.UpdateEnvironmentDataType;
import com.datadog.api.client.v2.model.UpdateEnvironmentRequest;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "environment_with_full_evaluation_data" in the system
    UUID ENVIRONMENT_WITH_FULL_EVALUATION_DATA_DATA_ID = null;
    try {
      ENVIRONMENT_WITH_FULL_EVALUATION_DATA_DATA_ID =
          UUID.fromString(System.getenv("ENVIRONMENT_WITH_FULL_EVALUATION_DATA_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateEnvironmentRequest body =
        new UpdateEnvironmentRequest()
            .data(
                new UpdateEnvironmentData()
                    .type(UpdateEnvironmentDataType.ENVIRONMENTS)
                    .attributes(
                        new UpdateEnvironmentAttributes()
                            .name("Updated Privacy Example-Feature-Flag")
                            .queries(
                                Collections.singletonList("updated-privacy-example-feature-flag"))
                            .observeFullEvaluationData(false)));

    try {
      EnvironmentResponse result =
          apiInstance.updateFeatureFlagsEnvironment(
              ENVIRONMENT_WITH_FULL_EVALUATION_DATA_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateFeatureFlagsEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
