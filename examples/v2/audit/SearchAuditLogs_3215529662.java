// Search Audit Logs events returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.AuditApi;
import com.datadog.api.client.v2.api.AuditApi.SearchAuditLogsOptionalParameters;
import com.datadog.api.client.v2.model.AuditLogsEvent;
import com.datadog.api.client.v2.model.AuditLogsQueryFilter;
import com.datadog.api.client.v2.model.AuditLogsQueryOptions;
import com.datadog.api.client.v2.model.AuditLogsQueryPageOptions;
import com.datadog.api.client.v2.model.AuditLogsSearchEventsRequest;
import com.datadog.api.client.v2.model.AuditLogsSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AuditApi apiInstance = new AuditApi(defaultClient);

    AuditLogsSearchEventsRequest body =
        new AuditLogsSearchEventsRequest()
            .filter(new AuditLogsQueryFilter().from("now-15m").to("now"))
            .options(new AuditLogsQueryOptions().timezone("GMT"))
            .page(new AuditLogsQueryPageOptions().limit(2))
            .sort(AuditLogsSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<AuditLogsEvent> iterable =
          apiInstance.searchAuditLogsWithPagination(
              new SearchAuditLogsOptionalParameters().body(body));

      for (AuditLogsEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling AuditApi#searchAuditLogsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
