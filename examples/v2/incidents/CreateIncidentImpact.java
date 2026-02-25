// Create an incident impact returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentImpactResponse;
import com.datadog.api.client.v2.model.IncidentImpactCreateAttributes;
import com.datadog.api.client.v2.model.IncidentImpactCreateData;
import com.datadog.api.client.v2.model.IncidentImpactCreateRequest;
import com.datadog.api.client.v2.model.IncidentImpactType;
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
    defaultClient.setUnstableOperationEnabled("v2.createIncidentImpact", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentImpactCreateRequest body = new IncidentImpactCreateRequest()
.data(new IncidentImpactCreateData()
.type(IncidentImpactType.INCIDENT_IMPACTS)
.attributes(new IncidentImpactCreateAttributes()
.startAt(OffsetDateTime.parse("2025-09-12T13:50:00.000Z"))
.endAt(OffsetDateTime.parse("2025-09-12T14:50:00.000Z"))
.description("Outage in the us-east-1 region")));

    try {
      IncidentImpactResponse result = apiInstance.createIncidentImpact(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentImpact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}