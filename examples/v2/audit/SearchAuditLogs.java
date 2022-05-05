// Search Audit Logs events returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuditApi;
import com.datadog.api.v2.client.api.AuditApi.SearchAuditLogsOptionalParameters;
import com.datadog.api.v2.client.model.AuditLogsEventsResponse;
import com.datadog.api.v2.client.model.AuditLogsQueryFilter;
import com.datadog.api.v2.client.model.AuditLogsQueryOptions;
import com.datadog.api.v2.client.model.AuditLogsQueryPageOptions;
import com.datadog.api.v2.client.model.AuditLogsSearchEventsRequest;
import com.datadog.api.v2.client.model.AuditLogsSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AuditApi apiInstance = new AuditApi(defaultClient);

    AuditLogsSearchEventsRequest body =
        new AuditLogsSearchEventsRequest()
            .filter(
                new AuditLogsQueryFilter()
                    .from("now-15m")
                    .query("@type:session AND @session.type:user")
                    .to("now"))
            .options(new AuditLogsQueryOptions().timeOffset(0L).timezone("GMT"))
            .page(new AuditLogsQueryPageOptions().limit(25))
            .sort(AuditLogsSort.TIMESTAMP_ASCENDING);

    try {
      AuditLogsEventsResponse result =
          apiInstance.searchAuditLogs(new SearchAuditLogsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditApi#searchAuditLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
