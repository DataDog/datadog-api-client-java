// Get a list of spans returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.SpansApi;
import com.datadog.api.client.v2.api.SpansApi.ListSpansGetOptionalParameters;
import com.datadog.api.client.v2.model.Span;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SpansApi apiInstance = new SpansApi(defaultClient);

    try {
      PaginationIterable<Span> iterable =
          apiInstance.listSpansGetWithPagination(new ListSpansGetOptionalParameters().pageLimit(2));

      for (Span item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling SpansApi#listSpansGetWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
