// Create incident attachment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.AttachmentDataAttributesAttachmentType;
import com.datadog.api.client.v2.model.CreateAttachmentRequest;
import com.datadog.api.client.v2.model.CreateAttachmentRequestData;
import com.datadog.api.client.v2.model.CreateAttachmentRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateAttachmentRequestDataAttributesAttachment;
import com.datadog.api.client.v2.model.IncidentAttachmentType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    CreateAttachmentRequest body =
        new CreateAttachmentRequest()
            .data(
                new CreateAttachmentRequestData()
                    .attributes(
                        new CreateAttachmentRequestDataAttributes()
                            .attachment(
                                new CreateAttachmentRequestDataAttributesAttachment()
                                    .documentUrl(
                                        "https://app.datadoghq.com/notebook/123/Postmortem-IR-123")
                                    .title("Postmortem-IR-123"))
                            .attachmentType(AttachmentDataAttributesAttachmentType.POSTMORTEM))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(IncidentAttachmentType.INCIDENT_ATTACHMENTS));

    try {
      Attachment result = apiInstance.createIncidentAttachment("incident_id", body);
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
