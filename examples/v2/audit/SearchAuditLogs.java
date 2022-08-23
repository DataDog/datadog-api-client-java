// Search Audit Logs events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AuditApi;
import com.datadog.api.client.v2.api.AuditApi.SearchAuditLogsOptionalParameters;
import com.datadog.api.client.v2.model.AuditLogsEventsResponse;
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
