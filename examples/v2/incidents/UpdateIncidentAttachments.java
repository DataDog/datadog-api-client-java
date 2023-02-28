// Create, update, and delete incident attachments returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentAttachmentUpdateResponse;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttachmentType;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttributes;
import com.datadog.api.client.v2.model.IncidentAttachmentLinkAttributesAttachmentObject;
import com.datadog.api.client.v2.model.IncidentAttachmentPostmortemAttachmentType;
import com.datadog.api.client.v2.model.IncidentAttachmentPostmortemAttributes;
import com.datadog.api.client.v2.model.IncidentAttachmentsPostmortemAttributesAttachmentObject;
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

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentAttachments", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentAttachmentUpdateRequest body = new IncidentAttachmentUpdateRequest()
.data(Arrays.asList(new IncidentAttachmentUpdateData()
.attributes(new IncidentAttachmentUpdateAttributes(
new IncidentAttachmentPostmortemAttributes()
.attachment(new IncidentAttachmentsPostmortemAttributesAttachmentObject()
.documentUrl("https://app.datadoghq.com/notebook/123")
.title("Postmortem IR-123"))
.attachmentType(IncidentAttachmentPostmortemAttachmentType.POSTMORTEM)))
.id("00000000-abcd-0002-0000-000000000000")
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS), new IncidentAttachmentUpdateData()
.attributes(new IncidentAttachmentUpdateAttributes(
new IncidentAttachmentLinkAttributes()
.attachment(new IncidentAttachmentLinkAttributesAttachmentObject()
.documentUrl("https://www.example.com/webstore-failure-runbook")
.title("Runbook for webstore service failures"))
.attachmentType(IncidentAttachmentLinkAttachmentType.LINK)))
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS), new IncidentAttachmentUpdateData()
.id("00000000-abcd-0003-0000-000000000000")
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS)));

    try {
      IncidentAttachmentUpdateResponse result = apiInstance.updateIncidentAttachments("incident_id", body);
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