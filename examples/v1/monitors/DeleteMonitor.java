// Delete a monitor returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.DeletedMonitor;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    try {
      DeletedMonitor result = apiInstance.deleteMonitor(MONITOR_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#deleteMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
