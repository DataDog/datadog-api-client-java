import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    MonitorsApi apiInstance = new MonitorsApi(defaultClient);
    Long monitorId = 666486743L; // Long | The ID of the monitor.
    String force =
        "false"; // String | Delete the monitor even if it's referenced by other resources (for
                 // example SLO, composite monitor).
    try {
      DeletedMonitor result =
          apiInstance.deleteMonitor(
              monitorId, new MonitorsApi.DeleteMonitorOptionalParameters().force(force));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#deleteMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
