// Delete a teams ownership mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumTeamsOwnershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumTeamsOwnershipApi apiInstance = new RumTeamsOwnershipApi(defaultClient);

    // there is a valid "teams_ownership_mapping" in the system
    String TEAMS_OWNERSHIP_MAPPING_DATA_ID = System.getenv("TEAMS_OWNERSHIP_MAPPING_DATA_ID");

    try {
      apiInstance.deleteTeamsOwnershipMapping(TEAMS_OWNERSHIP_MAPPING_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumTeamsOwnershipApi#deleteTeamsOwnershipMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
