// Update an org group membership returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupMembershipResponse;
import com.datadog.api.client.v2.model.OrgGroupMembershipType;
import com.datadog.api.client.v2.model.OrgGroupMembershipUpdateData;
import com.datadog.api.client.v2.model.OrgGroupMembershipUpdateRelationships;
import com.datadog.api.client.v2.model.OrgGroupMembershipUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgGroupMembership", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupMembershipUpdateRequest body =
        new OrgGroupMembershipUpdateRequest()
            .data(
                new OrgGroupMembershipUpdateData()
                    .id(UUID.fromString("f1e2d3c4-b5a6-7890-1234-567890abcdef"))
                    .relationships(
                        new OrgGroupMembershipUpdateRelationships()
                            .orgGroup(
                                new OrgGroupRelationshipToOne()
                                    .data(
                                        new OrgGroupRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                                            .type(OrgGroupType.ORG_GROUPS))))
                    .type(OrgGroupMembershipType.ORG_GROUP_MEMBERSHIPS));

    try {
      OrgGroupMembershipResponse result =
          apiInstance.updateOrgGroupMembership(
              UUID.fromString("f1e2d3c4-b5a6-7890-1234-567890abcdef"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#updateOrgGroupMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
