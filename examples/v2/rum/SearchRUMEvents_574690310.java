// Search RUM events returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMEvent;
import com.datadog.api.client.v2.model.RUMQueryFilter;
import com.datadog.api.client.v2.model.RUMQueryOptions;
import com.datadog.api.client.v2.model.RUMQueryPageOptions;
import com.datadog.api.client.v2.model.RUMSearchEventsRequest;
import com.datadog.api.client.v2.model.RUMSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    RUMSearchEventsRequest body =
        new RUMSearchEventsRequest()
            .filter(
                new RUMQueryFilter()
                    .from("now-15m")
                    .query("@type:session AND @session.type:user")
                    .to("now"))
            .options(new RUMQueryOptions().timeOffset(0L).timezone("GMT"))
            .page(new RUMQueryPageOptions().limit(2))
            .sort(RUMSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<RUMEvent> iterable = apiInstance.searchRUMEventsWithPagination(body);

      for (RUMEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling RumApi#searchRUMEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
