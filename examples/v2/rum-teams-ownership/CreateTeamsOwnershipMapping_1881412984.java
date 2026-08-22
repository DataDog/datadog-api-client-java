// Create teams ownership mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateData;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateDataAttributes;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingCreateRequest;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingResponse;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingType;
import com.datadog.api.client.v2.model.TeamsOwnershipMatchType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    TeamsOwnershipMappingCreateRequest body =
        new TeamsOwnershipMappingCreateRequest()
            .data(
                new TeamsOwnershipMappingCreateData()
                    .type(TeamsOwnershipMappingType.TEAMS_OWNERSHIP_MAPPINGS)
                    .attributes(
                        new TeamsOwnershipMappingCreateDataAttributes()
                            .teamHandle("team-rum")
                            .viewName("/checkout-examplerumteamsownership")
                            .service("web-checkout-examplerumteamsownership")
                            .matchType(TeamsOwnershipMatchType.EXACT)));

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
