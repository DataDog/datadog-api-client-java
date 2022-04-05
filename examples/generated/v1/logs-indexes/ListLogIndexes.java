import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsIndexesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);
        try {
            LogsIndexListResponse result = apiInstance.listLogIndexes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#listLogIndexes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
