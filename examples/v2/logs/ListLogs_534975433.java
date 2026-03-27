// Search logs (POST) returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.api.LogsApi.ListLogsOptionalParameters;
import com.datadog.api.client.v2.model.LogsListResponse;
import com.datadog.api.client.v2.model.Log;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.model.LogsListRequest;
import com.datadog.api.client.v2.model.LogsListRequestPage;
import com.datadog.api.client.v2.model.LogsQueryFilter;
import com.datadog.api.client.v2.model.LogsQueryOptions;
import com.datadog.api.client.v2.model.LogsSort;
import com.datadog.api.client.v2.model.LogsStorageTier;
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
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsListRequest body = new LogsListRequest()
.filter(new LogsQueryFilter()
.from("now-15m")
.indexes(Arrays.asList("main", "web"))
.query("service:web* AND @http.status_code:[200 TO 299]")
.storageTier(LogsStorageTier.INDEXES)
.to("now"))
.options(new LogsQueryOptions()
.timezone("GMT"))
.page(new LogsListRequestPage()
.cursor("eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==")
.limit(25))
.sort(LogsSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<Log> iterable = apiInstance.listLogsWithPagination(new ListLogsOptionalParameters().body(body));

      for (Log item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling LogsApi#listLogsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}