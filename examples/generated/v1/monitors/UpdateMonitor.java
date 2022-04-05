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
    MonitorUpdateRequest body =
        new MonitorUpdateRequest(); // MonitorUpdateRequest | Edit a monitor request body.
    try {
      Monitor result = apiInstance.updateMonitor(monitorId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#updateMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
