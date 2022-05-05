// Get a list of Audit Logs events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuditApi;
import com.datadog.api.v2.client.model.AuditLogsEventsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AuditApi apiInstance = new AuditApi(defaultClient);

    try {
      AuditLogsEventsResponse result = apiInstance.listAuditLogs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditApi#listAuditLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
