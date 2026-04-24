// Bulk update org group memberships returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.GlobalOrgIdentifier;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateAttributes;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateData;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateRelationships;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateRequest;
import com.datadog.api.client.v2.model.OrgGroupMembershipBulkUpdateType;
import com.datadog.api.client.v2.model.OrgGroupMembershipListResponse;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.bulkUpdateOrgGroupMemberships", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupMembershipBulkUpdateRequest body =
        new OrgGroupMembershipBulkUpdateRequest()
            .data(
                new OrgGroupMembershipBulkUpdateData()
                    .attributes(
                        new OrgGroupMembershipBulkUpdateAttributes()
                            .orgs(
                                Collections.singletonList(
                                    new GlobalOrgIdentifier()
                                        .orgSite("us1")
                                        .orgUuid(
                                            UUID.fromString(
                                                "c3d4e5f6-a7b8-9012-cdef-012345678901")))))
                    .relationships(
                        new OrgGroupMembershipBulkUpdateRelationships()
                            .sourceOrgGroup(
                                new OrgGroupRelationshipToOne()
                                    .data(
                                        new OrgGroupRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                                            .type(OrgGroupType.ORG_GROUPS)))
                            .targetOrgGroup(
                                new OrgGroupRelationshipToOne()
                                    .data(
                                        new OrgGroupRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                                            .type(OrgGroupType.ORG_GROUPS))))
                    .type(OrgGroupMembershipBulkUpdateType.ORG_GROUP_MEMBERSHIP_BULK_UPDATES));

    try {
      OrgGroupMembershipListResponse result = apiInstance.bulkUpdateOrgGroupMemberships(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#bulkUpdateOrgGroupMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
