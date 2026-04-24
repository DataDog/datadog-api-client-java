// Get an org group policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupPolicyResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getOrgGroupPolicy", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      OrgGroupPolicyResponse result =
          apiInstance.getOrgGroupPolicy(UUID.fromString("1a2b3c4d-5e6f-7890-abcd-ef0123456789"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#getOrgGroupPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
