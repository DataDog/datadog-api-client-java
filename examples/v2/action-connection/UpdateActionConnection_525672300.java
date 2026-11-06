// Update a GitHub personal access token Action Connection without replacing its secret

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributesUpdate;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionDataUpdate;
import com.datadog.api.client.v2.model.ActionConnectionIntegrationUpdate;
import com.datadog.api.client.v2.model.GithubCredentialsUpdate;
import com.datadog.api.client.v2.model.GithubIntegrationType;
import com.datadog.api.client.v2.model.GithubIntegrationUpdate;
import com.datadog.api.client.v2.model.GithubPersonalAccessTokenType;
import com.datadog.api.client.v2.model.GithubPersonalAccessTokenUpdate;
import com.datadog.api.client.v2.model.GithubPersonalAccessTokenUpdateHostname;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "github_pat_action_connection" in the system
    String GITHUB_PAT_ACTION_CONNECTION_DATA_ID =
        System.getenv("GITHUB_PAT_ACTION_CONNECTION_DATA_ID");

    UpdateActionConnectionRequest body =
        new UpdateActionConnectionRequest()
            .data(
                new ActionConnectionDataUpdate()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributesUpdate()
                            .name("GitHub personal access token Updated exampleactionconnection")
                            .integration(
                                new ActionConnectionIntegrationUpdate(
                                    new GithubIntegrationUpdate()
                                        .type(GithubIntegrationType.GITHUB)
                                        .credentials(
                                            new GithubCredentialsUpdate(
                                                new GithubPersonalAccessTokenUpdate()
                                                    .type(
                                                        GithubPersonalAccessTokenType
                                                            .GITHUBPERSONALACCESSTOKEN)
                                                    .hostname(
                                                        new GithubPersonalAccessTokenUpdateHostname(
                                                            "github.updated.example.com"))))))));

    try {
      UpdateActionConnectionResponse result =
          apiInstance.updateActionConnection(GITHUB_PAT_ACTION_CONNECTION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#updateActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
