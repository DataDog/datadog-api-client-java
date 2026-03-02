// Revoke an event email address returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteEventEmailAddress", true);
    EventsApi apiInstance = new EventsApi(defaultClient);

    try {
      apiInstance.deleteEventEmailAddress(UUID.fromString("00000000-0000-0000-0000-000000000001"));
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#deleteEventEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
