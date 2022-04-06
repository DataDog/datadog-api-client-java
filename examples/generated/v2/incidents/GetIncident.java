import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String incidentId = "incidentId_example"; // String | The UUID of the incident.
    List<IncidentRelatedObject> include =
        Arrays.asList(); // List<IncidentRelatedObject> | Specifies which types of related objects
    // should be included in the response.
    try {
      IncidentResponse result =
          apiInstance.getIncident(
              incidentId, new IncidentsApi.GetIncidentOptionalParameters().include(include));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
