// Delete an org group membership returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteOrgGroupMembership", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      apiInstance.deleteOrgGroupMembership(
          UUID.fromString("f1e2d3c4-b5a6-7890-1234-567890abcdef"),
          UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#deleteOrgGroupMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
