// Delete team connections returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamConnectionsApi;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequest;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequestDataItem;
import com.datadog.api.client.v2.model.TeamConnectionType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteTeamConnections", true);
    TeamConnectionsApi apiInstance = new TeamConnectionsApi(defaultClient);

    TeamConnectionDeleteRequest body =
        new TeamConnectionDeleteRequest()
            .data(
                Collections.singletonList(
                    new TeamConnectionDeleteRequestDataItem()
                        .id("12345678-1234-5678-9abc-123456789012")
                        .type(TeamConnectionType.TEAM_CONNECTION)));

    try {
      apiInstance.deleteTeamConnections(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamConnectionsApi#deleteTeamConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
