// Update GitHub CI Visibility status returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityGitHubAccountsApi;
import com.datadog.api.client.v2.model.CIAppGitHubAccountResponse;
import com.datadog.api.client.v2.model.CIAppGitHubAccountType;
import com.datadog.api.client.v2.model.CIAppGitHubAccountUpdateRequest;
import com.datadog.api.client.v2.model.CIAppGitHubAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.CIAppGitHubAccountUpdateRequestData;
import com.datadog.api.client.v2.model.CIAppGitHubAccountUpdateRequestRepository;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityGitHubAccountsApi apiInstance = new CiVisibilityGitHubAccountsApi(defaultClient);

    CIAppGitHubAccountUpdateRequest body =
        new CIAppGitHubAccountUpdateRequest()
            .data(
                new CIAppGitHubAccountUpdateRequestData()
                    .attributes(
                        new CIAppGitHubAccountUpdateRequestAttributes()
                            .account("datadog")
                            .enabled(true)
                            .host("github.com")
                            .repository(
                                new CIAppGitHubAccountUpdateRequestRepository()
                                    .enabled(true)
                                    .name("shopist")))
                    .type(CIAppGitHubAccountType.CI_GITHUB_ACCOUNT));

    try {
      CIAppGitHubAccountResponse result = apiInstance.updateCIAppGitHubAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CiVisibilityGitHubAccountsApi#updateCIAppGitHubAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
