// Update a GitHub Costs integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GitHubCostsIntegrationApi;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.GitHubCostsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateGitHubCostsIntegrationAccount", true);
    GitHubCostsIntegrationApi apiInstance = new GitHubCostsIntegrationApi(defaultClient);

    GitHubCostsIntegrationAccountUpdateRequest body =
        new GitHubCostsIntegrationAccountUpdateRequest()
            .data(
                new GitHubCostsIntegrationAccountUpdateData()
                    .attributes(
                        new GitHubCostsIntegrationAccountUpdateAttributes()
                            .authentication(
                                new GitHubCostsIntegrationAccountAuthenticationUpdate(
                                    new GitHubCostsIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            GitHubCostsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("github-costs-acme")
                            .settings(
                                new GitHubCostsIntegrationAccountSettingsUpdate()
                                    .enterpriseName("acme")
                                    .tags("env:prod,team:finops")))
                    .id("4b7c2e1a-6f3d-4e8b-9a52-1d0c8f7e3b64")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      GitHubCostsIntegrationAccountResponse result =
          apiInstance.updateGitHubCostsIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GitHubCostsIntegrationApi#updateGitHubCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
