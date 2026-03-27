// Create a team returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.RelationshipToUsers;
import com.datadog.api.client.v2.model.TeamCreate;
import com.datadog.api.client.v2.model.TeamCreateAttributes;
import com.datadog.api.client.v2.model.TeamCreateRelationships;
import com.datadog.api.client.v2.model.TeamCreateRequest;
import com.datadog.api.client.v2.model.TeamResponse;
import com.datadog.api.client.v2.model.TeamType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    TeamCreateRequest body =
        new TeamCreateRequest()
            .data(
                new TeamCreate()
                    .attributes(
                        new TeamCreateAttributes()
                            .handle("test-handle-a0fc0297eb519635")
                            .name("test-name-a0fc0297eb519635"))
                    .relationships(new TeamCreateRelationships().users(new RelationshipToUsers()))
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
