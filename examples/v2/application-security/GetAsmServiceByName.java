// Get Application Security details for a service returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityServicesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getAsmServiceByName", true);
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    try {
      ApplicationSecurityServicesResponse result = apiInstance.getAsmServiceByName("web-store");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSecurityApi#getAsmServiceByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
