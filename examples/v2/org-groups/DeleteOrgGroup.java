// Delete an org group returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteOrgGroup", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      apiInstance.deleteOrgGroup(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"));
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#deleteOrgGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
