// Update incident attachment returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.IncidentAttachmentType;
import com.datadog.api.client.v2.model.PatchAttachmentRequest;
import com.datadog.api.client.v2.model.PatchAttachmentRequestData;
import com.datadog.api.client.v2.model.PatchAttachmentRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchAttachmentRequestDataAttributesAttachment;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    // there is a valid "incident_attachment" in the system
    String INCIDENT_ATTACHMENT_DATA_ID = System.getenv("INCIDENT_ATTACHMENT_DATA_ID");

    PatchAttachmentRequest body = new PatchAttachmentRequest()
.data(new PatchAttachmentRequestData()
.attributes(new PatchAttachmentRequestDataAttributes()
.attachment(new PatchAttachmentRequestDataAttributesAttachment()
.documentUrl("https://app.datadoghq.com/notebook/124/Example-Incident")
.title("Example-Incident")))
.id(INCIDENT_ATTACHMENT_DATA_ID)
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS));

    try {
      Attachment result = apiInstance.updateIncidentAttachment(INCIDENT_DATA_ID, INCIDENT_ATTACHMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}