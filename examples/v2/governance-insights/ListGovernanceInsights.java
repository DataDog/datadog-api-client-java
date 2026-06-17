// List governance insights returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceInsightsApi;
import com.datadog.api.client.v2.model.GovernanceInsightsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listGovernanceInsights", true);
    GovernanceInsightsApi apiInstance = new GovernanceInsightsApi(defaultClient);

    try {
      GovernanceInsightsResponse result = apiInstance.listGovernanceInsights();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceInsightsApi#listGovernanceInsights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
