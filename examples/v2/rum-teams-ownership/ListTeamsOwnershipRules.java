// List teams ownership rules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi.ListTeamsOwnershipRulesOptionalParameters;
import com.datadog.api.client.v2.model.TeamsOwnershipRulesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    // there is a valid "teams_ownership_mapping" in the system
    String TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME =
        System.getenv("TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME");

    try {
      TeamsOwnershipRulesResponse result =
          apiInstance.listTeamsOwnershipRules(
              new ListTeamsOwnershipRulesOptionalParameters()
                  .filterViewName(TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumTeamsOwnershipApi#listTeamsOwnershipRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
