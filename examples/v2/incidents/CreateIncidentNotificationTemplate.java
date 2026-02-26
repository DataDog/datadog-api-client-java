// Create incident notification template returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import com.datadog.api.client.v2.model.CreateIncidentNotificationTemplateRequest;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateCreateAttributes;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateCreateData;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateCreateDataRelationships;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateType;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.RelationshipToIncidentType;
import com.datadog.api.client.v2.model.RelationshipToIncidentTypeData;
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
    defaultClient.setUnstableOperationEnabled("v2.createIncidentNotificationTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident_type" in the system
    String INCIDENT_TYPE_DATA_ID = System.getenv("INCIDENT_TYPE_DATA_ID");

    CreateIncidentNotificationTemplateRequest body = new CreateIncidentNotificationTemplateRequest()
.data(new IncidentNotificationTemplateCreateData()
.attributes(new IncidentNotificationTemplateCreateAttributes()
.category("alert")
.content("""
An incident has been declared.

Title: Sample Incident Title
Severity: SEV-2
Affected Services: web-service, database-service
Status: active

Please join the incident channel for updates.
""")
.name("Example-Incident")
.subject("SEV-2 Incident: Sample Incident Title"))
.relationships(new IncidentNotificationTemplateCreateDataRelationships()
.incidentType(new RelationshipToIncidentType()
.data(new RelationshipToIncidentTypeData()
.id(INCIDENT_TYPE_DATA_ID)
.type(IncidentTypeType.INCIDENT_TYPES))))
.type(IncidentNotificationTemplateType.NOTIFICATION_TEMPLATES));

    try {
      IncidentNotificationTemplate result = apiInstance.createIncidentNotificationTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentNotificationTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}