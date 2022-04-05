import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.KeyManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        String include = "owned_by"; // String | Resource path for related resources to include in the response. Only `owned_by` is supported.
        try {
            ApplicationKeyResponse result = apiInstance.getApplicationKey(appKeyId, new KeyManagementApi.GetApplicationKeyOptionalParameters()
                .include(include));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#getApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
