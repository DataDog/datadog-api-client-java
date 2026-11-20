// List Claude Compliance integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ClaudeComplianceIntegrationApi;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listClaudeComplianceIntegrationAccounts", true);
    ClaudeComplianceIntegrationApi apiInstance = new ClaudeComplianceIntegrationApi(defaultClient);

    try {
      ClaudeComplianceIntegrationAccountsResponse result =
          apiInstance.listClaudeComplianceIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ClaudeComplianceIntegrationApi#listClaudeComplianceIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
