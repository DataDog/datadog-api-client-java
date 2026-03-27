// Schedule a downtime once a year
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.DowntimeRecurrence;
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

    Downtime body = new Downtime()
.message("Example-Downtime")
.recurrence(new DowntimeRecurrence()
.period(1)
.type("years"))
.scope(Collections.singletonList("*"))
.start(OffsetDateTime.now().toInstant().getEpochSecond())
.end(OffsetDateTime.now().plusHours(1).toInstant().getEpochSecond())
.timezone("Etc/UTC")
.muteFirstRecoveryNotification(true)
.monitorTags(Collections.singletonList("tag0"))
.notifyEndStates(Arrays.asList(NotifyEndState.ALERT, NotifyEndState.WARN))
.notifyEndTypes(Collections.singletonList(NotifyEndType.EXPIRED));

    try {
      Downtime result = apiInstance.createDowntime(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#createDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}