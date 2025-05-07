// Get the list of devices returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi;
import com.datadog.api.client.v2.model.DevicesListData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    NetworkDeviceMonitoringApi apiInstance = new NetworkDeviceMonitoringApi(defaultClient);

    try {
      PaginationIterable<DevicesListData> iterable = apiInstance.listDevicesWithPagination();

      for (DevicesListData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling NetworkDeviceMonitoringApi#listDevicesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
