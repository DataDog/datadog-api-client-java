// Get a GitHub Costs integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GitHubCostsIntegrationApi;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getGitHubCostsIntegrationAccount", true);
    GitHubCostsIntegrationApi apiInstance = new GitHubCostsIntegrationApi(defaultClient);

    try {
      GitHubCostsIntegrationAccountResponse result =
          apiInstance.getGitHubCostsIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GitHubCostsIntegrationApi#getGitHubCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
