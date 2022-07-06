// Unmute a host returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.HostsApi;
import com.datadog.api.client.v1.model.HostMuteResponse;

public class UnmuteHost {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HostsApi apiInstance = new HostsApi(defaultClient);

    try {
      HostMuteResponse result = apiInstance.unmuteHost("host_name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostsApi#unmuteHost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
