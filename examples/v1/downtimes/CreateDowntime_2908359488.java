// Schedule a downtime until date
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.DowntimeRecurrence;
import com.datadog.api.client.v1.model.NotifyEndState;
import com.datadog.api.client.v1.model.NotifyEndType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    Downtime body =
        new Downtime()
            .message("Example-Downtime")
            .recurrence(
                new DowntimeRecurrence()
                    .period(1)
                    .type("weeks")
                    .untilDate(OffsetDateTime.now().plusDays(21).toInstant().getEpochSecond())
                    .weekDays(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri")))
            .scope(Collections.singletonList("*"))
            .start(OffsetDateTime.now().toInstant().getEpochSecond())
            .end(OffsetDateTime.now().plusHours(1).toInstant().getEpochSecond())
            .timezone("Etc/UTC")
            .muteFirstRecoveryNotification(true)
            .monitorTags(Collections.singletonList("tag0"))
            .notifyEndStates(Collections.singletonList(NotifyEndState.ALERT))
            .notifyEndTypes(Collections.singletonList(NotifyEndType.CANCELED));

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
