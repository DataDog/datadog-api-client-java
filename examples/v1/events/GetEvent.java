// Get an event returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.EventsApi;
import com.datadog.api.v1.client.model.EventResponse;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    try {
      EventResponse result = apiInstance.getEvent(9223372036854775807L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
