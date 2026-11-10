// List GitHub Costs integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GitHubCostsIntegrationApi;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listGitHubCostsIntegrationAccounts", true);
    GitHubCostsIntegrationApi apiInstance = new GitHubCostsIntegrationApi(defaultClient);

    try {
      GitHubCostsIntegrationAccountsResponse result =
          apiInstance.listGitHubCostsIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GitHubCostsIntegrationApi#listGitHubCostsIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
