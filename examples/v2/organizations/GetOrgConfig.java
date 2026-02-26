// Get a specific Org Config value returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.OrgConfigGetResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    try {
      OrgConfigGetResponse result = apiInstance.getOrgConfig("custom_roles");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getOrgConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
