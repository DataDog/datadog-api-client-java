// Get active downtimes for a monitor returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.DowntimesApi;
import com.datadog.api.client.v2.model.MonitorDowntimeMatchResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    try {
      PaginationIterable<MonitorDowntimeMatchResponseData> iterable =
          apiInstance.listMonitorDowntimesWithPagination(9223372036854775807L);

      for (MonitorDowntimeMatchResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling DowntimesApi#listMonitorDowntimesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
