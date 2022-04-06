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
    Long monitorId = 666486743L; // Long | The ID of the monitor
    String groupStates =
        "groupStates_example"; // String | When specified, shows additional information about the
    // group states. Choose one or more from `all`, `alert`, `warn`, and
    // `no data`.
    try {
      Monitor result =
          apiInstance.getMonitor(
              monitorId, new MonitorsApi.GetMonitorOptionalParameters().groupStates(groupStates));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#getMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
