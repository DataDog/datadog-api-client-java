import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.AuthNMappingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
        AuthNMappingCreateRequest body = new AuthNMappingCreateRequest(); // AuthNMappingCreateRequest |
        try {
            AuthNMappingResponse result = apiInstance.createAuthNMapping(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthNMappingsApi#createAuthNMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
