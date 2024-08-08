// Get all Container Images returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ContainerImagesApi;
import com.datadog.api.client.v2.api.ContainerImagesApi.ListContainerImagesOptionalParameters;
import com.datadog.api.client.v2.model.ContainerImagesResponse;
import com.datadog.api.client.v2.model.ContainerImageItem;
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
    ContainerImagesApi apiInstance = new ContainerImagesApi(defaultClient);

    try {
      PaginationIterable<ContainerImageItem> iterable = apiInstance.listContainerImagesWithPagination(new ListContainerImagesOptionalParameters().pageSize(2));

      for (ContainerImageItem item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ContainerImagesApi#listContainerImagesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}