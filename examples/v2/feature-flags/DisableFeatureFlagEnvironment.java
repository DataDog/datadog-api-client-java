// Disable a feature flag in an environment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "feature_flag" in the system
    UUID FEATURE_FLAG_DATA_ID = null;
    try {
      FEATURE_FLAG_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "environment" in the system
    UUID ENVIRONMENT_DATA_ID = null;
    try {
      ENVIRONMENT_DATA_ID = UUID.fromString(System.getenv("ENVIRONMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.disableFeatureFlagEnvironment(FEATURE_FLAG_DATA_ID, ENVIRONMENT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#disableFeatureFlagEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
