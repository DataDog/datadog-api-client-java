// Delete an org group policy returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteOrgGroupPolicy", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      apiInstance.deleteOrgGroupPolicy(UUID.fromString("1a2b3c4d-5e6f-7890-abcd-ef0123456789"));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#deleteOrgGroupPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
