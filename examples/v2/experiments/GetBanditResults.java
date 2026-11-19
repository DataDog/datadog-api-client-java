// Get bandit results returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsBanditResultsV2DTO;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createBandit", true);
    defaultClient.setUnstableOperationEnabled("v2.getBanditResults", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "bandit" in the system
    UUID BANDIT_DATA_ID = null;
    try {
      BANDIT_DATA_ID = UUID.fromString(System.getenv("BANDIT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      ExperimentsBanditResultsV2DTO result = apiInstance.getBanditResults(BANDIT_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#getBanditResults");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
