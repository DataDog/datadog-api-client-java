// Get a teams ownership mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;
import com.datadog.api.client.v2.model.TeamsOwnershipMappingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    // there is a valid "teams_ownership_mapping" in the system
    String TEAMS_OWNERSHIP_MAPPING_DATA_ID = System.getenv("TEAMS_OWNERSHIP_MAPPING_DATA_ID");

    try {
      TeamsOwnershipMappingResponse result =
          apiInstance.getTeamsOwnershipMapping(TEAMS_OWNERSHIP_MAPPING_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumTeamsOwnershipApi#getTeamsOwnershipMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
