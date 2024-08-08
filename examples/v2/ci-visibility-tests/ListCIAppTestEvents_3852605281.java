// Get a list of tests events returns "OK" response with pagination
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi.ListCIAppTestEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppTestEventsResponse;
import com.datadog.api.client.v2.model.CIAppTestEvent;
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
    CiVisibilityTestsApi apiInstance = new CiVisibilityTestsApi(defaultClient);

    try {
      PaginationIterable<CIAppTestEvent> iterable = apiInstance.listCIAppTestEventsWithPagination(new ListCIAppTestEventsOptionalParameters().filterFrom(OffsetDateTime.now().plusSeconds(-30)).filterTo(OffsetDateTime.now()).pageLimit(2));

      for (CIAppTestEvent item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling CiVisibilityTestsApi#listCIAppTestEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}