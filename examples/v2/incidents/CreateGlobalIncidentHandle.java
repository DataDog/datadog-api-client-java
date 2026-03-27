// Create global incident handle returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentHandleResponse;
import com.datadog.api.client.v2.model.IncidentHandleAttributesFields;
import com.datadog.api.client.v2.model.IncidentHandleAttributesRequest;
import com.datadog.api.client.v2.model.IncidentHandleDataRequest;
import com.datadog.api.client.v2.model.IncidentHandleRelationship;
import com.datadog.api.client.v2.model.IncidentHandleRelationshipData;
import com.datadog.api.client.v2.model.IncidentHandleRelationshipsRequest;
import com.datadog.api.client.v2.model.IncidentHandleRequest;
import com.datadog.api.client.v2.model.IncidentHandleType;
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
    defaultClient.setUnstableOperationEnabled("v2.createGlobalIncidentHandle", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentHandleRequest body = new IncidentHandleRequest()
.data(new IncidentHandleDataRequest()
.attributes(new IncidentHandleAttributesRequest()
.fields(new IncidentHandleAttributesFields()
.severity(Collections.singletonList("SEV-1")))
.name("@incident-sev-1"))
.id("b2494081-cdf0-4205-b366-4e1dd4fdf0bf")
.relationships(new IncidentHandleRelationshipsRequest()
.commanderUser(new IncidentHandleRelationship()
.data(new IncidentHandleRelationshipData()
.id("f7b538b1-ed7c-4e84-82de-fdf84a539d40")
.type("incident_types")))
.incidentType(new IncidentHandleRelationship()
.data(new IncidentHandleRelationshipData()
.id("f7b538b1-ed7c-4e84-82de-fdf84a539d40")
.type("incident_types"))))
.type(IncidentHandleType.INCIDENTS_HANDLES));

    try {
      IncidentHandleResponse result = apiInstance.createGlobalIncidentHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createGlobalIncidentHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}