// Get all monitor user templates returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorUserTemplateListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listMonitorUserTemplates", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    try {
      MonitorUserTemplateListResponse result = apiInstance.listMonitorUserTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#listMonitorUserTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
