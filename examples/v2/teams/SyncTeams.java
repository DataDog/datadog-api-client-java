// Link Teams with GitHub Teams returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamSyncAttributes;
import com.datadog.api.client.v2.model.TeamSyncAttributesSource;
import com.datadog.api.client.v2.model.TeamSyncAttributesType;
import com.datadog.api.client.v2.model.TeamSyncBulkType;
import com.datadog.api.client.v2.model.TeamSyncData;
import com.datadog.api.client.v2.model.TeamSyncRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    TeamSyncRequest body =
        new TeamSyncRequest()
            .data(
                new TeamSyncData()
                    .attributes(
                        new TeamSyncAttributes()
                            .source(TeamSyncAttributesSource.GITHUB)
                            .type(TeamSyncAttributesType.LINK))
                    .type(TeamSyncBulkType.TEAM_SYNC_BULK));

    try {
      apiInstance.syncTeams(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#syncTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
