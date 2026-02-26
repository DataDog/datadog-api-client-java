// Delete a monitor user template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteMonitorUserTemplate", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    try {
      apiInstance.deleteMonitorUserTemplate("template_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#deleteMonitorUserTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
