// Search events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EventsApi;
import com.datadog.api.client.v2.api.EventsApi.SearchEventsOptionalParameters;
import com.datadog.api.client.v2.model.EventsListRequest;
import com.datadog.api.client.v2.model.EventsListResponse;
import com.datadog.api.client.v2.model.EventsQueryFilter;
import com.datadog.api.client.v2.model.EventsRequestPage;
import com.datadog.api.client.v2.model.EventsSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    EventsApi apiInstance = new EventsApi(defaultClient);

    EventsListRequest body =
        new EventsListRequest()
            .filter(
                new EventsQueryFilter()
                    .query("datadog-agent")
                    .from("2020-09-17T11:48:36+01:00")
                    .to("2020-09-17T12:48:36+01:00"))
            .sort(EventsSort.TIMESTAMP_ASCENDING)
            .page(new EventsRequestPage().limit(5));

    try {
      EventsListResponse result =
          apiInstance.searchEvents(new SearchEventsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#searchEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
