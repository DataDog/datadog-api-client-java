import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuditApi apiInstance = new AuditApi(defaultClient);
        AuditLogsSearchEventsRequest body = new AuditLogsSearchEventsRequest(); // AuditLogsSearchEventsRequest |
        try {
            AuditLogsEventsResponse result = apiInstance.searchAuditLogs(new AuditApi.SearchAuditLogsOptionalParameters()
                .body(body));
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
