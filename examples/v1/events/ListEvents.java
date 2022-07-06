// Query the event stream returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.EventsApi;
import com.datadog.api.client.v1.model.EventListResponse;

public class ListEvents {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    try {
      EventListResponse result = apiInstance.listEvents(9223372036854775807L, 9223372036854775807L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
