// Create a GitHub App Action Connection

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.GithubApp;
import com.datadog.api.client.v2.model.GithubAppGithubAppId;
import com.datadog.api.client.v2.model.GithubAppGithubInstallationId;
import com.datadog.api.client.v2.model.GithubAppHostname;
import com.datadog.api.client.v2.model.GithubAppPrivateKey;
import com.datadog.api.client.v2.model.GithubAppType;
import com.datadog.api.client.v2.model.GithubCredentials;
import com.datadog.api.client.v2.model.GithubIntegration;
import com.datadog.api.client.v2.model.GithubIntegrationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("GitHub App Connection exampleactionconnection")
                            .integration(
                                new ActionConnectionIntegration(
                                    new GithubIntegration()
                                        .type(GithubIntegrationType.GITHUB)
                                        .credentials(
                                            new GithubCredentials(
                                                new GithubApp()
                                                    .type(GithubAppType.GITHUBAPP)
                                                    .githubAppId(new GithubAppGithubAppId("123456"))
                                                    .githubInstallationId(
                                                        new GithubAppGithubInstallationId("789012"))
                                                    .privateKey(
                                                        new GithubAppPrivateKey(
                                                            "example-private-key"))
                                                    .hostname(
                                                        new GithubAppHostname(
                                                            "github.example.com"))))))));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
