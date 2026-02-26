// Get IP Allowlist returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IpAllowlistApi;
import com.datadog.api.client.v2.model.IPAllowlistResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IpAllowlistApi apiInstance = new IpAllowlistApi(defaultClient);

    try {
      IPAllowlistResponse result = apiInstance.getIPAllowlist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAllowlistApi#getIPAllowlist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
