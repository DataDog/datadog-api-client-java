// Schedule a downtime until date
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DowntimesApi;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import java.time.*;
import java.util.*;

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
                    .untilDate((Instant.now().getEpochSecond() + 21 * 86400))
                    .weekDays(
                        new ArrayList<String>() {
                          {
                            add("Mon");
                            add("Tue");
                            add("Wed");
                            add("Thu");
                            add("Fri");
                          }
                        }))
            .scope(
                new ArrayList<String>() {
                  {
                    add("*");
                  }
                })
            .start(Instant.now().getEpochSecond())
            .end((Instant.now().getEpochSecond() + 1 * 3600))
            .timezone("Etc/UTC");

    try {
      Downtime result = apiInstance.createDowntime(body);
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
