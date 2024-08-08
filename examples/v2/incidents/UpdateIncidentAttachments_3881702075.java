// Create an incident attachment returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentAttachmentUpdateResponse;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttachmentType;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttributes;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttributesAttachmentObject;
import com.datadog.api.client.v2.model.IncidentAttachmentType;
import com.datadog.api.client.v2.model.IncidentAttachmentUpdateAttributes;
import com.datadog.api.client.v2.model.IncidentAttachmentUpdateData;
import com.datadog.api.client.v2.model.IncidentAttachmentUpdateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentAttachments", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentAttachmentUpdateRequest body = new IncidentAttachmentUpdateRequest()
.data(Collections.singletonList(new IncidentAttachmentUpdateData()
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS)
.attributes(new IncidentAttachmentUpdateAttributes(
new IncidentAttachmentLinkAttributes()
.attachmentType(IncidentAttachmentLinkAttachmentType.LINK)
.attachment(new IncidentAttachmentLinkAttributesAttachmentObject()
.documentUrl("https://www.example.com/doc")
.title("Example-Incident"))))));

    try {
      IncidentAttachmentUpdateResponse result = apiInstance.updateIncidentAttachments(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentAttachments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}