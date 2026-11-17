// Get bandit traffic summary returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsBanditTrafficSummaryV2DTO;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getBanditTrafficSummary", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    try {
      ExperimentsBanditTrafficSummaryV2DTO result =
          apiInstance.getBanditTrafficSummary(
              UUID.fromString("4b1f3c2e-8d5a-4f6b-9c7e-1a2b3c4d5e6f"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#getBanditTrafficSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
