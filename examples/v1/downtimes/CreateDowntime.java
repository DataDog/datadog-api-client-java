// Schedule a downtime returns "OK" response
import java.time.*;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DowntimesApi;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    Downtime body = new Downtime()
.message("Example-Schedule_a_downtime_returns_OK_response")
.start(Instant.now().getEpochSecond())
.timezone("Etc/UTC")
.scope(new ArrayList<String>() {{add("test:examplescheduleadowntimereturnsokresponse");}})
.recurrence(new DowntimeRecurrence()
.type("weeks")
.period(1)
.weekDays(new ArrayList<String>() {{add("Mon"); add("Tue"); add("Wed"); add("Thu"); add("Fri");}})
.untilDate((Instant.now().getEpochSecond() + 21*86400)));

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