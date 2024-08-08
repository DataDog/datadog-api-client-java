// Get all processes returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ProcessesApi;
import com.datadog.api.client.v2.api.ProcessesApi.ListProcessesOptionalParameters;
import com.datadog.api.client.v2.model.ProcessSummariesResponse;
import com.datadog.api.client.v2.model.ProcessSummary;
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
    ProcessesApi apiInstance = new ProcessesApi(defaultClient);

    try {
      PaginationIterable<ProcessSummary> iterable = apiInstance.listProcessesWithPagination(new ListProcessesOptionalParameters().pageLimit(2));

      for (ProcessSummary item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ProcessesApi#listProcessesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}