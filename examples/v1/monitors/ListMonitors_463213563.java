// Get all monitors returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.api.MonitorsApi.ListMonitorsOptionalParameters;
import com.datadog.api.client.v1.model.Monitor;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    try {
      PaginationIterable<Monitor> iterable =
          apiInstance.listMonitorsWithPagination(new ListMonitorsOptionalParameters().pageSize(2));

      for (Monitor item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling MonitorsApi#listMonitorsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
