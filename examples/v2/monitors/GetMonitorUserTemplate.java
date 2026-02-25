// Get a monitor user template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorUserTemplateResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getMonitorUserTemplate", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_user_template" in the system
    String MONITOR_USER_TEMPLATE_DATA_ID = System.getenv("MONITOR_USER_TEMPLATE_DATA_ID");

    try {
      MonitorUserTemplateResponse result = apiInstance.getMonitorUserTemplate(MONITOR_USER_TEMPLATE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#getMonitorUserTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}