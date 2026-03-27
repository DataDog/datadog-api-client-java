// Search tests events returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi.SearchCIAppTestEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppTestEventsResponse;
import com.datadog.api.client.v2.model.CIAppTestEvent;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.model.CIAppQueryPageOptions;
import com.datadog.api.client.v2.model.CIAppSort;
import com.datadog.api.client.v2.model.CIAppTestEventsRequest;
import com.datadog.api.client.v2.model.CIAppTestsQueryFilter;
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

    CIAppTestEventsRequest body = new CIAppTestEventsRequest()
.filter(new CIAppTestsQueryFilter()
.from("now-15m")
.query("@test.status:pass AND -@language:python")
.to("now"))
.page(new CIAppQueryPageOptions()
.limit(2))
.sort(CIAppSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<CIAppTestEvent> iterable = apiInstance.searchCIAppTestEventsWithPagination(new SearchCIAppTestEventsOptionalParameters().body(body));

      for (CIAppTestEvent item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling CiVisibilityTestsApi#searchCIAppTestEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}