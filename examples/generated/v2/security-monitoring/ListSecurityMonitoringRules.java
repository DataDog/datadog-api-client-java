import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
        Long pageSize = 10L; // Long | Size for a given page.
        Long pageNumber = 0L; // Long | Specific page number to return.
        try {
            SecurityMonitoringListRulesResponse result = apiInstance.listSecurityMonitoringRules(new SecurityMonitoringApi.ListSecurityMonitoringRulesOptionalParameters()
                .pageSize(pageSize)
                .pageNumber(pageNumber));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#listSecurityMonitoringRules");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
