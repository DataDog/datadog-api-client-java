// Get an org group membership returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupMembershipResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getOrgGroupMembership", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      OrgGroupMembershipResponse result =
          apiInstance.getOrgGroupMembership(
              UUID.fromString("f1e2d3c4-b5a6-7890-1234-567890abcdef"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#getOrgGroupMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
