import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.EventsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    EventsApi apiInstance = new EventsApi(defaultClient);
    Long start = 56L; // Long | POSIX timestamp.
    Long end = 56L; // Long | POSIX timestamp.
    EventPriority priority =
        EventPriority.fromValue(
            "normal"); // EventPriority | Priority of your events, either `low` or `normal`.
    String sources = "sources_example"; // String | A comma separated string of sources.
    String tags =
        "host:host0"; // String | A comma separated list indicating what tags, if any, should be
                      // used to filter the list of monitors by scope.
    Boolean unaggregated =
        true; // Boolean | Set unaggregated to `true` to return all events within the specified
              // [`start`,`end`] timeframe. Otherwise if an event is aggregated to a parent event
              // with a timestamp outside of the timeframe, it won't be available in the output.
              // Aggregated events with `is_aggregate=true` in the response will still be returned
              // unless exclude_aggregate is set to `true.`
    Boolean excludeAggregate =
        true; // Boolean | Set `exclude_aggregate` to `true` to only return unaggregated events
              // where `is_aggregate=false` in the response. If the `exclude_aggregate` parameter is
              // set to `true`, then the unaggregated parameter is ignored and will be `true` by
              // default.
    Integer page =
        56; // Integer | By default 1000 results are returned per request. Set page to the number of
            // the page to return with `0` being the first page. The page parameter can only be used
            // when either unaggregated or exclude_aggregate is set to `true.`
    try {
      EventListResponse result =
          apiInstance.listEvents(
              start,
              end,
              new EventsApi.ListEventsOptionalParameters()
                  .priority(priority)
                  .sources(sources)
                  .tags(tags)
                  .unaggregated(unaggregated)
                  .excludeAggregate(excludeAggregate)
                  .page(page));
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
