// List org group memberships returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupMembershipListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listOrgGroupMemberships", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      OrgGroupMembershipListResponse result = apiInstance.listOrgGroupMemberships();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#listOrgGroupMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
