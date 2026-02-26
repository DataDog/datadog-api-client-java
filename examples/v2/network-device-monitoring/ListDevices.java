// Get the list of devices returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi.ListDevicesOptionalParameters;
import com.datadog.api.client.v2.model.ListDevicesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    NetworkDeviceMonitoringApi apiInstance = new NetworkDeviceMonitoringApi(defaultClient);

    try {
      ListDevicesResponse result =
          apiInstance.listDevices(
              new ListDevicesOptionalParameters()
                  .pageSize(1L)
                  .pageNumber(0L)
                  .filterTag("device_namespace:default"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkDeviceMonitoringApi#listDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
