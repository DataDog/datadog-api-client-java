// Create org group memberships returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.GlobalOrgIdentifier;
import com.datadog.api.client.v2.model.OrgGroupMembershipCreateAttributes;
import com.datadog.api.client.v2.model.OrgGroupMembershipCreateData;
import com.datadog.api.client.v2.model.OrgGroupMembershipCreateRelationships;
import com.datadog.api.client.v2.model.OrgGroupMembershipCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupMembershipType;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createOrgGroupMemberships", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupMembershipCreateRequest body =
        new OrgGroupMembershipCreateRequest()
            .data(
                new OrgGroupMembershipCreateData()
                    .attributes(
                        new OrgGroupMembershipCreateAttributes()
                            .orgs(
                                Collections.singletonList(
                                    new GlobalOrgIdentifier()
                                        .orgSite("us1")
                                        .orgUuid(
                                            UUID.fromString(
                                                "c3d4e5f6-a7b8-9012-cdef-012345678901")))))
                    .relationships(
                        new OrgGroupMembershipCreateRelationships()
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
      apiInstance.createOrgGroupMemberships(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#createOrgGroupMemberships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
