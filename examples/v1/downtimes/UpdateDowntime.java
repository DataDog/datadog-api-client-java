// Update a downtime returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "downtime" in the system
    Long DOWNTIME_ID = Long.parseLong(System.getenv("DOWNTIME_ID"));

    Downtime body =
        new Downtime()
            .message("Example-Update_a_downtime_returns_OK_response-updated")
            .muteFirstRecoveryNotification(true);

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
