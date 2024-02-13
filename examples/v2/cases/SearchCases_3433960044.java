// Search cases returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.CasesApi;
import com.datadog.api.client.v2.model.Case;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CasesApi apiInstance = new CasesApi(defaultClient);

    try {
      PaginationIterable<Case> iterable = apiInstance.searchCasesWithPagination();

      for (Case item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling CasesApi#searchCasesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
