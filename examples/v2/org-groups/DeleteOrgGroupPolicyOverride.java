// Delete an org group policy override returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteOrgGroupPolicyOverride", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      apiInstance.deleteOrgGroupPolicyOverride(
          UUID.fromString("9f8e7d6c-5b4a-3210-fedc-ba0987654321"));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#deleteOrgGroupPolicyOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
