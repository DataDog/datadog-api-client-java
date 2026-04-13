// List org groups returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listOrgGroups", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    try {
      OrgGroupListResponse result = apiInstance.listOrgGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#listOrgGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
