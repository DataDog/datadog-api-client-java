// Get a list of events returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.api.EventsApi.ListEventsOptionalParameters;
import com.datadog.api.client.v2.model.EventResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    try {
      PaginationIterable<EventResponse> iterable =
          apiInstance.listEventsWithPagination(
              new ListEventsOptionalParameters()
                  .filterFrom("now-15m")
                  .filterTo("now")
                  .pageLimit(2));

      for (EventResponse item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling EventsApi#listEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
