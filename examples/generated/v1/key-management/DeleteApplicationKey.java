import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String key = "key_example"; // String | The specific APP key you are working with.
        try {
            ApplicationKeyResponse result = apiInstance.deleteApplicationKey(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#deleteApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
