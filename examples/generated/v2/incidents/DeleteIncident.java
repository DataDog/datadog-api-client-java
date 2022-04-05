import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentsApi apiInstance = new IncidentsApi(defaultClient);
        String incidentId = "incidentId_example"; // String | The UUID of the incident.
        try {
            apiInstance.deleteIncident(incidentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentsApi#deleteIncident");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
