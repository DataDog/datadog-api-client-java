import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceChecksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceChecksApi apiInstance = new ServiceChecksApi(defaultClient);
        List<ServiceCheck> body = Arrays.asList(); // List<ServiceCheck> | Service Check request body.
        try {
            IntakePayloadAccepted result = apiInstance.submitServiceCheck(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceChecksApi#submitServiceCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
