import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DowntimesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DowntimesApi apiInstance = new DowntimesApi(defaultClient);
        Long downtimeId = 123456L; // Long | ID of the downtime to cancel.
        try {
            apiInstance.cancelDowntime(downtimeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimesApi#cancelDowntime");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
