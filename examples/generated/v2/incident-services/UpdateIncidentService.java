import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
        String serviceId = "serviceId_example"; // String | The ID of the incident service.
        IncidentServiceUpdateRequest body = new IncidentServiceUpdateRequest(); // IncidentServiceUpdateRequest | Incident Service Payload.
        try {
            IncidentServiceResponse result = apiInstance.updateIncidentService(serviceId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentServicesApi#updateIncidentService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
