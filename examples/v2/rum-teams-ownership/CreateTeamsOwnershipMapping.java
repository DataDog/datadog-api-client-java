// Create a teams ownership mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateData;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateDataAttributes;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateRequest;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingType;
import com.datadog.api.client.v2.model.TeamsOwnershipMatchType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTeamsOwnershipMapping", true);
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    TeamsOwnershipMappingCreateRequest body =
        new TeamsOwnershipMappingCreateRequest()
            .data(
                new TeamsOwnershipMappingCreateData()
                    .attributes(
                        new TeamsOwnershipMappingCreateDataAttributes()
                            .applicationId(UUID.fromString("11111111-2222-3333-4444-555555555555"))
                            .matchType(TeamsOwnershipMatchType.EXACT)
                            .service("web-checkout")
                            .teamHandle("team-rum")
                            .viewName("/checkout"))
                    .type(TeamsOwnershipMappingType.TEAMS_OWNERSHIP_MAPPINGS));

    try {
      TeamsOwnershipMappingResponse result = apiInstance.createTeamsOwnershipMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumTeamsOwnershipApi#createTeamsOwnershipMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
