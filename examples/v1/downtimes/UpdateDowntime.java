// Update a downtime returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.NotifyEndState;
import com.datadog.api.client.v1.model.NotifyEndType;
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
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "downtime" in the system
    Long DOWNTIME_ID = Long.parseLong(System.getenv("DOWNTIME_ID"));

    Downtime body = new Downtime()
.message("Example-Downtime-updated")
.muteFirstRecoveryNotification(true)
.notifyEndStates(Arrays.asList(NotifyEndState.ALERT, NotifyEndState.NO_DATA, NotifyEndState.WARN))
.notifyEndTypes(Arrays.asList(NotifyEndType.CANCELED, NotifyEndType.EXPIRED));

    try {
      Downtime result = apiInstance.updateDowntime(DOWNTIME_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}