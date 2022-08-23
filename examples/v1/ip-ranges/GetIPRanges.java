// List IP Ranges returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.IpRangesApi;
import com.datadog.api.client.v1.model.IPRanges;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
