// Update incident notification template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateType;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateUpdateAttributes;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateUpdateData;
import com.datadog.api.client.v2.model.PatchIncidentNotificationTemplateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentNotificationTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "notification_template" in the system
    UUID NOTIFICATION_TEMPLATE_DATA_ID = null;
    try {
      NOTIFICATION_TEMPLATE_DATA_ID = UUID.fromString(System.getenv("NOTIFICATION_TEMPLATE_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PatchIncidentNotificationTemplateRequest body = new PatchIncidentNotificationTemplateRequest()
.data(new IncidentNotificationTemplateUpdateData()
.attributes(new IncidentNotificationTemplateUpdateAttributes()
.category("update")
.content("""
Incident Status Update:

Title: Sample Incident Title
New Status: resolved
Severity: SEV-2
Services: web-service, database-service
Commander: John Doe

For more details, visit the incident page.
""")
.name("Example-Incident")
.subject("Incident Update: Sample Incident Title - resolved"))
.id(NOTIFICATION_TEMPLATE_DATA_ID)
.type(IncidentNotificationTemplateType.NOTIFICATION_TEMPLATES));

    try {
      IncidentNotificationTemplate result = apiInstance.updateIncidentNotificationTemplate(NOTIFICATION_TEMPLATE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentNotificationTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}