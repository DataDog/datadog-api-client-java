// Create an org group policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyCreateAttributes;
import com.datadog.api.client.v2.model.OrgGroupPolicyCreateData;
import com.datadog.api.client.v2.model.OrgGroupPolicyCreateRelationships;
import com.datadog.api.client.v2.model.OrgGroupPolicyCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupPolicyEnforcementTier;
import com.datadog.api.client.v2.model.OrgGroupPolicyPolicyType;
import com.datadog.api.client.v2.model.OrgGroupPolicyResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyType;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOne;
import com.datadog.api.client.v2.model.OrgGroupRelationshipToOneData;
import com.datadog.api.client.v2.model.OrgGroupType;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOrgGroupPolicy", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupPolicyCreateRequest body =
        new OrgGroupPolicyCreateRequest()
            .data(
                new OrgGroupPolicyCreateData()
                    .attributes(
                        new OrgGroupPolicyCreateAttributes()
                            .content(Map.ofEntries(Map.entry("value", "UTC")))
                            .enforcementTier(OrgGroupPolicyEnforcementTier.DEFAULT)
                            .policyName("monitor_timezone")
                            .policyType(OrgGroupPolicyPolicyType.ORG_CONFIG))
                    .relationships(
                        new OrgGroupPolicyCreateRelationships()
                            .orgGroup(
                                new OrgGroupRelationshipToOne()
                                    .data(
                                        new OrgGroupRelationshipToOneData()
                                            .id(
                                                UUID.fromString(
                                                    "a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                                            .type(OrgGroupType.ORG_GROUPS))))
                    .type(OrgGroupPolicyType.ORG_GROUP_POLICIES));

    try {
      OrgGroupPolicyResponse result = apiInstance.createOrgGroupPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#createOrgGroupPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
