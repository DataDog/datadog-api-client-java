// Get a synthetics monitor's details

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "synthetics_api_test" in the system
    Long SYNTHETICS_API_TEST_MONITOR_ID =
        Long.parseLong(System.getenv("SYNTHETICS_API_TEST_MONITOR_ID"));

    try {
      Monitor result = apiInstance.getMonitor(SYNTHETICS_API_TEST_MONITOR_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#getMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
