// List On-Call pages returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.OnCallPageData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    try {
      PaginationIterable<OnCallPageData> iterable = apiInstance.listOnCallPagesWithPagination();

      for (OnCallPageData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling OnCallApi#listOnCallPagesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
