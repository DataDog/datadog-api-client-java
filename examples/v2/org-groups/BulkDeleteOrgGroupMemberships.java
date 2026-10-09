// Bulk delete org group memberships returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkDeleteRequest;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkDeleteRequestData;
import com.datadog.api.client.v2.model.OrgGroupMembershipType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.bulkDeleteOrgGroupMemberships", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupMembershipBulkDeleteRequest body =
        new OrgGroupMembershipBulkDeleteRequest()
            .data(
                Collections.singletonList(
                    new OrgGroupMembershipBulkDeleteRequestData()
                        .id(UUID.fromString("f1e2d3c4-b5a6-7890-1234-567890abcdef"))
                        .type(OrgGroupMembershipType.ORG_GROUP_MEMBERSHIPS)));

    try {
      apiInstance.bulkDeleteOrgGroupMemberships(
          UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#bulkDeleteOrgGroupMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
