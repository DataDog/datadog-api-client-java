// List teams ownership mappings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi.ListTeamsOwnershipMappingsOptionalParameters;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    // there is a valid "teams_ownership_mapping" in the system
    String TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME =
        System.getenv("TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME");

    try {
      TeamsOwnershipMappingsResponse result =
          apiInstance.listTeamsOwnershipMappings(
              new ListTeamsOwnershipMappingsOptionalParameters()
                  .filterViewName(TEAMS_OWNERSHIP_MAPPING_DATA_ATTRIBUTES_VIEW_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumTeamsOwnershipApi#listTeamsOwnershipMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
