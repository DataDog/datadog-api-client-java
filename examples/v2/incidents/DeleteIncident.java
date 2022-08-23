// Delete an existing incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    try {
      apiInstance.deleteIncident(INCIDENT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
