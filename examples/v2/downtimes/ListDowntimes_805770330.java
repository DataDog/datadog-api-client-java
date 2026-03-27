// Get all downtimes returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DowntimesApi;
import com.datadog.api.client.v2.api.DowntimesApi.ListDowntimesOptionalParameters;
import com.datadog.api.client.v2.model.ListDowntimesResponse;
import com.datadog.api.client.v2.model.DowntimeResponseData;
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
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    try {
      PaginationIterable<DowntimeResponseData> iterable = apiInstance.listDowntimesWithPagination(new ListDowntimesOptionalParameters().pageLimit(2L));

      for (DowntimeResponseData item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling DowntimesApi#listDowntimesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}