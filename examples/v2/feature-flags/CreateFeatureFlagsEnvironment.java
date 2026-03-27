// Create an environment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateEnvironmentAttributes;
import com.datadog.api.client.v2.model.CreateEnvironmentData;
import com.datadog.api.client.v2.model.CreateEnvironmentDataType;
import com.datadog.api.client.v2.model.CreateEnvironmentRequest;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateEnvironmentRequest body =
        new CreateEnvironmentRequest()
            .data(
                new CreateEnvironmentData()
                    .type(CreateEnvironmentDataType.ENVIRONMENTS)
                    .attributes(
                        new CreateEnvironmentAttributes()
                            .name("Test Environment Example-Feature-Flag")
                            .queries(
                                Arrays.asList(
                                    "test-Example-Feature-Flag", "env-Example-Feature-Flag"))));

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
