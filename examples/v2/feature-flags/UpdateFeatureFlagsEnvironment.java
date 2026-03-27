// Update an environment returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import com.datadog.api.client.v2.model.UpdateEnvironmentAttributes;
import com.datadog.api.client.v2.model.UpdateEnvironmentData;
import com.datadog.api.client.v2.model.UpdateEnvironmentDataType;
import com.datadog.api.client.v2.model.UpdateEnvironmentRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "environment" in the system
    UUID ENVIRONMENT_DATA_ID = null;
    try {
      ENVIRONMENT_DATA_ID = UUID.fromString(System.getenv("ENVIRONMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateEnvironmentRequest body = new UpdateEnvironmentRequest()
.data(new UpdateEnvironmentData()
.type(UpdateEnvironmentDataType.ENVIRONMENTS)
.attributes(new UpdateEnvironmentAttributes()
.name("Updated Test Environment Example-Feature-Flag")
.queries(Arrays.asList("updated-Example-Feature-Flag", "live-Example-Feature-Flag"))));

    try {
      EnvironmentResponse result = apiInstance.updateFeatureFlagsEnvironment(ENVIRONMENT_DATA_ID, body);
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