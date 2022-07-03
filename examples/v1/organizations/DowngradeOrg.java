// Spin-off Child Organization returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.OrganizationsApi;
import com.datadog.api.v1.client.model.OrgDowngradedResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    try {
      OrgDowngradedResponse result = apiInstance.downgradeOrg("abc123");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#downgradeOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
