// Get team sync configurations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamSyncAttributesSource;
import com.datadog.api.client.v2.model.TeamSyncResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      TeamSyncResponse result = apiInstance.getTeamSync(TeamSyncAttributesSource.GITHUB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getTeamSync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
