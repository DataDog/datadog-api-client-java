// Update an org group policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyEnforcementTier;
import com.datadog.api.client.v2.model.OrgGroupPolicyResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyType;
import com.datadog.api.client.v2.model.OrgGroupPolicyUpdateAttributes;
import com.datadog.api.client.v2.model.OrgGroupPolicyUpdateData;
import com.datadog.api.client.v2.model.OrgGroupPolicyUpdateRequest;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgGroupPolicy", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupPolicyUpdateRequest body =
        new OrgGroupPolicyUpdateRequest()
            .data(
                new OrgGroupPolicyUpdateData()
                    .attributes(
                        new OrgGroupPolicyUpdateAttributes()
                            .content(Map.ofEntries(Map.entry("value", "UTC")))
                            .enforcementTier(OrgGroupPolicyEnforcementTier.DEFAULT))
                    .id(UUID.fromString("1a2b3c4d-5e6f-7890-abcd-ef0123456789"))
                    .type(OrgGroupPolicyType.ORG_GROUP_POLICIES));

    try {
      OrgGroupPolicyResponse result =
          apiInstance.updateOrgGroupPolicy(
              UUID.fromString("1a2b3c4d-5e6f-7890-abcd-ef0123456789"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#updateOrgGroupPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
