// Get All Containers returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ContainersApi;
import com.datadog.api.client.v2.api.ContainersApi.ListContainersOptionalParameters;
import com.datadog.api.client.v2.model.ContainersResponse;
import com.datadog.api.client.v2.model.ContainerItem;
import com.datadog.api.client.PaginationIterable;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ContainersApi apiInstance = new ContainersApi(defaultClient);

    try {
      PaginationIterable<ContainerItem> iterable = apiInstance.listContainersWithPagination(new ListContainersOptionalParameters().pageSize(2));

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