// Schedule a downtime returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;
import com.datadog.api.client.v1.model.DowntimeRecurrence;
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
            .start(OffsetDateTime.now().toInstant().getEpochSecond())
            .timezone("Etc/UTC")
            .scope(Collections.singletonList("test:exampledowntime"))
            .recurrence(
                new DowntimeRecurrence()
                    .type("weeks")
                    .period(1)
                    .weekDays(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri"))
                    .untilDate(OffsetDateTime.now().plusDays(21).toInstant().getEpochSecond()));

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
