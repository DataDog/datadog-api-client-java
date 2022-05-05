// Schedule a downtime until date
import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DowntimesApi;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    Downtime body =
        new Downtime()
            .message("Example-Schedule_a_downtime_until_date")
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
            .muteFirstRecoveryNotification(true);

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
