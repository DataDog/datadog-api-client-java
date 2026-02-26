// Update a team returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamResponse;
import com.datadog.api.client.v2.model.TeamType;
import com.datadog.api.client.v2.model.TeamUpdate;
import com.datadog.api.client.v2.model.TeamUpdateAttributes;
import com.datadog.api.client.v2.model.TeamUpdateRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ATTRIBUTES_HANDLE = System.getenv("DD_TEAM_DATA_ATTRIBUTES_HANDLE");
    String DD_TEAM_DATA_ATTRIBUTES_NAME = System.getenv("DD_TEAM_DATA_ATTRIBUTES_NAME");
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    TeamUpdateRequest body =
        new TeamUpdateRequest()
            .data(
                new TeamUpdate()
                    .attributes(
                        new TeamUpdateAttributes()
                            .handle(DD_TEAM_DATA_ATTRIBUTES_HANDLE)
                            .name("Example Team updated")
                            .avatar("🥑")
                            .banner(7L)
                            .hiddenModules(Collections.singletonList("m3"))
                            .visibleModules(Arrays.asList("m1", "m2")))
                    .type(TeamType.TEAM));

    try {
      TeamResponse result = apiInstance.updateTeam(DD_TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
