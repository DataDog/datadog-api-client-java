// Create a team with V2 fields returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamResponse;
import com.datadog.api.client.v2.model.TeamCreate;
import com.datadog.api.client.v2.model.TeamCreateAttributes;
import com.datadog.api.client.v2.model.TeamCreateRequest;
import com.datadog.api.client.v2.model.TeamType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    TeamCreateRequest body = new TeamCreateRequest()
.data(new TeamCreate()
.attributes(new TeamCreateAttributes()
.handle("test-handle-a0fc0297eb519635")
.name("test-name-a0fc0297eb519635")
.avatar("🥑")
.banner(7L)
.visibleModules(Arrays.asList("m1", "m2"))
.hiddenModules(Collections.singletonList("m3")))
.type(TeamType.TEAM));

    try {
      TeamResponse result = apiInstance.createTeam(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}