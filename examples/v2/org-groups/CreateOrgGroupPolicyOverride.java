// Create an org group policy override returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideCreateAttributes;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideCreateData;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideCreateRelationships;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideType;
import com.datadog.api.client.v2.model.OrgGroupPolicyRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupPolicyRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupPolicyType;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOrgGroupPolicyOverride", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupPolicyOverrideCreateRequest body =
        new OrgGroupPolicyOverrideCreateRequest()
            .data(
                new OrgGroupPolicyOverrideCreateData()
                    .attributes(
                        new OrgGroupPolicyOverrideCreateAttributes()
                            .orgSite("datadoghq.com")
                            .orgUuid(UUID.fromString("c3d4e5f6-a7b8-9012-cdef-012345678901")))
                    .relationships(
                        new OrgGroupPolicyOverrideCreateRelationships()
                            .orgGroup(
                                new OrgGroupRelationshipToOne()
                                    .data(
                                        new OrgGroupRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                                            .type(OrgGroupType.ORG_GROUPS)))
                            .orgGroupPolicy(
                                new OrgGroupPolicyRelationshipToOne()
                                    .data(
                                        new OrgGroupPolicyRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "1a2b3c4d-5e6f-7890-abcd-ef0123456789"))
                                            .type(OrgGroupPolicyType.ORG_GROUP_POLICIES))))
                    .type(OrgGroupPolicyOverrideType.ORG_GROUP_POLICY_OVERRIDES));

    try {
      OrgGroupPolicyOverrideResponse result = apiInstance.createOrgGroupPolicyOverride(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#createOrgGroupPolicyOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
