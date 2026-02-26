// Delete an incident impact returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIncidentImpact", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // the "incident" has an "incident_impact"
    String INCIDENT_IMPACT_DATA_ID = System.getenv("INCIDENT_IMPACT_DATA_ID");
    String INCIDENT_IMPACT_DATA_RELATIONSHIPS_INCIDENT_DATA_ID = System.getenv("INCIDENT_IMPACT_DATA_RELATIONSHIPS_INCIDENT_DATA_ID");

    try {
      apiInstance.deleteIncidentImpact(INCIDENT_IMPACT_DATA_RELATIONSHIPS_INCIDENT_DATA_ID, INCIDENT_IMPACT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncidentImpact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}