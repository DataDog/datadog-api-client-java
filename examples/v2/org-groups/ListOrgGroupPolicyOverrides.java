// List org group policy overrides returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyOverrideListResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listOrgGroupPolicyOverrides", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      OrgGroupPolicyOverrideListResponse result =
          apiInstance.listOrgGroupPolicyOverrides(
              UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#listOrgGroupPolicyOverrides");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
