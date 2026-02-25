// Create incident attachment returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.AttachmentDataAttributesAttachmentType;
import com.datadog.api.client.v2.model.CreateAttachmentRequest;
import com.datadog.api.client.v2.model.CreateAttachmentRequestData;
import com.datadog.api.client.v2.model.CreateAttachmentRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateAttachmentRequestDataAttributesAttachment;
import com.datadog.api.client.v2.model.IncidentAttachmentType;
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
    defaultClient.setUnstableOperationEnabled("v2.createIncidentAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    CreateAttachmentRequest body = new CreateAttachmentRequest()
.data(new CreateAttachmentRequestData()
.attributes(new CreateAttachmentRequestDataAttributes()
.attachment(new CreateAttachmentRequestDataAttributesAttachment()
.documentUrl("https://app.datadoghq.com/notebook/ExampleIncident/Example-Incident")
.title("Example-Incident"))
.attachmentType(AttachmentDataAttributesAttachmentType.POSTMORTEM))
.type(IncidentAttachmentType.INCIDENT_ATTACHMENTS));

    try {
      Attachment result = apiInstance.createIncidentAttachment(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}