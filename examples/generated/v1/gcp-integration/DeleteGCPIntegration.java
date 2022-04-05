import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.GcpIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);
        GCPAccount body = new GCPAccount(); // GCPAccount | Delete a given Datadog-GCP integration.
        try {
            Object result = apiInstance.deleteGCPIntegration(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GcpIntegrationApi#deleteGCPIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
