// Get overview tiles returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EndUserDeviceMonitoringApi;
import com.datadog.api.client.v2.model.OverviewItemArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EndUserDeviceMonitoringApi apiInstance = new EndUserDeviceMonitoringApi(defaultClient);

    try {
      OverviewItemArray result = apiInstance.getEUDMOverview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndUserDeviceMonitoringApi#getEUDMOverview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
