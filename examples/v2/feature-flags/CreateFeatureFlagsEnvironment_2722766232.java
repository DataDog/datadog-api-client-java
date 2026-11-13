// Create an environment with full evaluation data true returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateEnvironmentAttributes;
import com.datadog.api.client.v2.model.CreateEnvironmentData;
import com.datadog.api.client.v2.model.CreateEnvironmentDataType;
import com.datadog.api.client.v2.model.CreateEnvironmentRequest;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateEnvironmentRequest body =
        new CreateEnvironmentRequest()
            .data(
                new CreateEnvironmentData()
                    .type(CreateEnvironmentDataType.ENVIRONMENTS)
                    .attributes(
                        new CreateEnvironmentAttributes()
                            .name("Evaluation Privacy Example-Feature-Flag")
                            .queries(Collections.singletonList("privacy-example-feature-flag"))
                            .observeFullEvaluationData(true)));

    try {
      EnvironmentResponse result = apiInstance.createFeatureFlagsEnvironment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#createFeatureFlagsEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
