// Update an org group policy override returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideResponse;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideType;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideUpdateAttributes;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideUpdateData;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgGroupPolicyOverride", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupPolicyOverrideUpdateRequest body =
        new OrgGroupPolicyOverrideUpdateRequest()
            .data(
                new OrgGroupPolicyOverrideUpdateData()
                    .attributes(
                        new OrgGroupPolicyOverrideUpdateAttributes()
                            .orgSite("us1")
                            .orgUuid(UUID.fromString("c3d4e5f6-a7b8-9012-cdef-012345678901")))
                    .id(UUID.fromString("9f8e7d6c-5b4a-3210-fedc-ba0987654321"))
                    .type(OrgGroupPolicyOverrideType.ORG_GROUP_POLICY_OVERRIDES));

    try {
      OrgGroupPolicyOverrideResponse result =
          apiInstance.updateOrgGroupPolicyOverride(
              UUID.fromString("9f8e7d6c-5b4a-3210-fedc-ba0987654321"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#updateOrgGroupPolicyOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
