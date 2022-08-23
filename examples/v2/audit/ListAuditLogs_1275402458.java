// Get a list of Audit Logs events returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.AuditApi;
import com.datadog.api.client.v2.api.AuditApi.ListAuditLogsOptionalParameters;
import com.datadog.api.client.v2.model.AuditLogsEvent;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AuditApi apiInstance = new AuditApi(defaultClient);

    try {
      PaginationIterable<AuditLogsEvent> iterable =
          apiInstance.listAuditLogsWithPagination(
              new ListAuditLogsOptionalParameters().pageLimit(2));

      for (AuditLogsEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling AuditApi#listAuditLogsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
