// Get All Containers returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.ContainersApi;
import com.datadog.api.client.v2.api.ContainersApi.ListContainersOptionalParameters;
import com.datadog.api.client.v2.model.ContainerItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ContainersApi apiInstance = new ContainersApi(defaultClient);

    try {
      PaginationIterable<ContainerItem> iterable =
          apiInstance.listContainersWithPagination(
              new ListContainersOptionalParameters().pageSize(2));

      for (ContainerItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ContainersApi#listContainersWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
