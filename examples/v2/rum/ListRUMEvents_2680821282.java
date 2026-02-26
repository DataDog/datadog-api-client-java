// Get a list of RUM events returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.api.RumApi.ListRUMEventsOptionalParameters;
import com.datadog.api.client.v2.model.RUMEventsResponse;
import com.datadog.api.client.v2.model.RUMEvent;
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
    RumApi apiInstance = new RumApi(defaultClient);

    try {
      PaginationIterable<RUMEvent> iterable = apiInstance.listRUMEventsWithPagination(new ListRUMEventsOptionalParameters().pageLimit(2));

      for (RUMEvent item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling RumApi#listRUMEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}