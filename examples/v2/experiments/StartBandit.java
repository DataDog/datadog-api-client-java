// Start bandit returns "The bandit is running. Get the bandit to read its status and active
// policy." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.startBandit", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    try {
      apiInstance.startBandit(UUID.fromString("4b1f3c2e-8d5a-4f6b-9c7e-1a2b3c4d5e6f"));
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#startBandit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
