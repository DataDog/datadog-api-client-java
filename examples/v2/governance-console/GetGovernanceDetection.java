// Get a detection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceConsoleApi;
import com.datadog.api.client.v2.model.GovernanceControlDetectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getGovernanceDetection", true);
    GovernanceConsoleApi apiInstance = new GovernanceConsoleApi(defaultClient);

    try {
      GovernanceControlDetectionResponse result =
          apiInstance.getGovernanceDetection("3f9b2c1a-8d4e-4a6b-9c2f-1e7d5a0b3c4d");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceConsoleApi#getGovernanceDetection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
