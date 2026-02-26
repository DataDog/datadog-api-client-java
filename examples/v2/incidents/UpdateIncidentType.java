// Update an incident type returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTypeResponse;
import com.datadog.api.client.v2.model.IncidentTypePatchData;
import com.datadog.api.client.v2.model.IncidentTypePatchRequest;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.IncidentTypeUpdateAttributes;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentType", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident_type" in the system
    String INCIDENT_TYPE_DATA_ATTRIBUTES_NAME = System.getenv("INCIDENT_TYPE_DATA_ATTRIBUTES_NAME");
    String INCIDENT_TYPE_DATA_ID = System.getenv("INCIDENT_TYPE_DATA_ID");

    IncidentTypePatchRequest body = new IncidentTypePatchRequest()
.data(new IncidentTypePatchData()
.id(INCIDENT_TYPE_DATA_ID)
.attributes(new IncidentTypeUpdateAttributes()
.name("Security Incident-updated"))
.type(IncidentTypeType.INCIDENT_TYPES));

    try {
      IncidentTypeResponse result = apiInstance.updateIncidentType(INCIDENT_TYPE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}