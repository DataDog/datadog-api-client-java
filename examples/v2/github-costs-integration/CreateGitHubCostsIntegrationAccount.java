// Create a GitHub Costs integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GitHubCostsIntegrationApi;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createGitHubCostsIntegrationAccount", true);
    GitHubCostsIntegrationApi apiInstance = new GitHubCostsIntegrationApi(defaultClient);

    GitHubCostsIntegrationAccountCreateRequest body =
        new GitHubCostsIntegrationAccountCreateRequest()
            .data(
                new GitHubCostsIntegrationAccountCreateData()
                    .attributes(
                        new GitHubCostsIntegrationAccountCreateAttributes()
                            .authentication(
                                new GitHubCostsIntegrationAccountAuthenticationRequest(
                                    new GitHubCostsIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            GitHubCostsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("github-costs-acme")
                            .settings(
                                new GitHubCostsIntegrationAccountSettingsRequest()
                                    .enterpriseName("acme")
                                    .tags("env:prod,team:finops")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      GitHubCostsIntegrationAccountResponse result =
          apiInstance.createGitHubCostsIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GitHubCostsIntegrationApi#createGitHubCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
