// Cancel a downtime returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DowntimesApi;
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

    try {
      apiInstance.cancelDowntime(DOWNTIME_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#cancelDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}