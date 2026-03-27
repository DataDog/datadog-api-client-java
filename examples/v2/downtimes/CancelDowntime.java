// Cancel a downtime returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DowntimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "downtime_v2" in the system
    String DOWNTIME_V2_DATA_ID = System.getenv("DOWNTIME_V2_DATA_ID");

    try {
      apiInstance.cancelDowntime(DOWNTIME_V2_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#cancelDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
