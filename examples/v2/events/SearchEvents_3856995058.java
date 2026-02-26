// Search events returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.api.EventsApi.SearchEventsOptionalParameters;
import com.datadog.api.client.v2.model.EventsListResponse;
import com.datadog.api.client.v2.model.EventResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.model.EventsListRequest;
import com.datadog.api.client.v2.model.EventsQueryFilter;
import com.datadog.api.client.v2.model.EventsQueryOptions;
import com.datadog.api.client.v2.model.EventsRequestPage;
import com.datadog.api.client.v2.model.EventsSort;
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
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventsListRequest body = new EventsListRequest()
.filter(new EventsQueryFilter()
.from("now-15m")
.to("now"))
.options(new EventsQueryOptions()
.timezone("GMT"))
.page(new EventsRequestPage()
.limit(2))
.sort(EventsSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<EventResponse> iterable = apiInstance.searchEventsWithPagination(new SearchEventsOptionalParameters().body(body));

      for (EventResponse item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling EventsApi#searchEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}