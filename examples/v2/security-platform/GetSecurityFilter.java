// Get a security filter returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityPlatformApi;
import com.datadog.api.v2.client.model.SecurityFilterResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityPlatformApi apiInstance = new SecurityPlatformApi(defaultClient);

    try {
      SecurityFilterResponse result = apiInstance.getSecurityFilter("security_filter_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityPlatformApi#getSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
