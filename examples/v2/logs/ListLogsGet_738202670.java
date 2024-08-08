// Get a list of logs returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.api.LogsApi.ListLogsGetOptionalParameters;
import com.datadog.api.client.v2.model.LogsListResponse;
import com.datadog.api.client.v2.model.Log;
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
    LogsApi apiInstance = new LogsApi(defaultClient);

    try {
      PaginationIterable<Log> iterable = apiInstance.listLogsGetWithPagination(new ListLogsGetOptionalParameters().pageLimit(2));

      for (Log item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling LogsApi#listLogsGetWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}