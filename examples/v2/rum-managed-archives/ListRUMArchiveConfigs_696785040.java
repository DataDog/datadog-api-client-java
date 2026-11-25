// List archive configurations returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import com.datadog.api.client.v2.model.RumArchiveConfig;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    try {
      PaginationIterable<RumArchiveConfig> iterable =
          apiInstance.listRUMArchiveConfigsWithPagination();

      for (RumArchiveConfig item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling RumManagedArchivesApi#listRUMArchiveConfigsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
