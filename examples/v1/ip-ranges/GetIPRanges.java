// List IP Ranges returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.IpRangesApi;
import com.datadog.api.v1.client.model.IPRanges;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    IpRangesApi apiInstance = new IpRangesApi(defaultClient);

    try {
      IPRanges result = apiInstance.getIPRanges();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpRangesApi#getIPRanges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
