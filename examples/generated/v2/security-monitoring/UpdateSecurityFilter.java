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
        String securityFilterId = "securityFilterId_example"; // String | The ID of the security filter.
        SecurityFilterUpdateRequest body = new SecurityFilterUpdateRequest(); // SecurityFilterUpdateRequest | New definition of the security filter.
        try {
            SecurityFilterResponse result = apiInstance.updateSecurityFilter(securityFilterId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
