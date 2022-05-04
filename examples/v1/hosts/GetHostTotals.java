// Get the total number of active hosts returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.HostsApi;
import com.datadog.api.v1.client.model.HostTotals;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HostsApi apiInstance = new HostsApi(defaultClient);

    try {
      HostTotals result = apiInstance.getHostTotals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostsApi#getHostTotals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
