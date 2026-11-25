// List RUM operation links returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    try {
      PaginationIterable<RUMOperationStrongLinkResponseData> iterable =
          apiInstance.listRUMOperationStrongLinksWithPagination();

      for (RUMOperationStrongLinkResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling RumOperationsApi#listRUMOperationStrongLinksWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
