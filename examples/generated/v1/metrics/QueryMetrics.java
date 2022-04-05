import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Long from = 56L; // Long | Start of the queried time period, seconds since the Unix epoch.
        Long to = 56L; // Long | End of the queried time period, seconds since the Unix epoch.
        String query = "query_example"; // String | Query string.
        try {
            MetricsQueryResponse result = apiInstance.queryMetrics(from, to, query);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#queryMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
