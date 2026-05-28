// Get device counts grouped by attribute returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EndUserDeviceMonitoringApi;
import com.datadog.api.client.v2.model.GraphItemArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EndUserDeviceMonitoringApi apiInstance = new EndUserDeviceMonitoringApi(defaultClient);

    try {
      GraphItemArray result = apiInstance.getEUDMGraph("by");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndUserDeviceMonitoringApi#getEUDMGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
