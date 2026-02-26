// Get incident integration metadata details returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getIncidentIntegration", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    // the "incident" has an "incident_integration_metadata"
    String INCIDENT_INTEGRATION_METADATA_DATA_ID =
        System.getenv("INCIDENT_INTEGRATION_METADATA_DATA_ID");

    try {
      IncidentIntegrationMetadataResponse result =
          apiInstance.getIncidentIntegration(
              INCIDENT_DATA_ID, INCIDENT_INTEGRATION_METADATA_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncidentIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
