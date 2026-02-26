// Monitors group search returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.MonitorGroupSearchResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    try {
      MonitorGroupSearchResponse result = apiInstance.searchMonitorGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#searchMonitorGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
