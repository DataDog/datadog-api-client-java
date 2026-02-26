// Search spans returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.SpansApi;
import com.datadog.api.client.v2.model.Span;
import com.datadog.api.client.v2.model.SpansListRequest;
import com.datadog.api.client.v2.model.SpansListRequestAttributes;
import com.datadog.api.client.v2.model.SpansListRequestData;
import com.datadog.api.client.v2.model.SpansListRequestPage;
import com.datadog.api.client.v2.model.SpansListRequestType;
import com.datadog.api.client.v2.model.SpansQueryFilter;
import com.datadog.api.client.v2.model.SpansQueryOptions;
import com.datadog.api.client.v2.model.SpansSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SpansApi apiInstance = new SpansApi(defaultClient);

    SpansListRequest body =
        new SpansListRequest()
            .data(
                new SpansListRequestData()
                    .attributes(
                        new SpansListRequestAttributes()
                            .filter(
                                new SpansQueryFilter()
                                    .from("now-15m")
                                    .query("service:python*")
                                    .to("now"))
                            .options(new SpansQueryOptions().timezone("GMT"))
                            .page(new SpansListRequestPage().limit(2))
                            .sort(SpansSort.TIMESTAMP_ASCENDING))
                    .type(SpansListRequestType.SEARCH_REQUEST));

    try {
      PaginationIterable<Span> iterable = apiInstance.listSpansWithPagination(body);

      for (Span item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling SpansApi#listSpansWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
