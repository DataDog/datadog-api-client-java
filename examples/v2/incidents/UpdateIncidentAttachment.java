// Update incident attachment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.IncidentAttachmentType;
import com.datadog.api.client.v2.model.PatchAttachmentRequest;
import com.datadog.api.client.v2.model.PatchAttachmentRequestData;
import com.datadog.api.client.v2.model.PatchAttachmentRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchAttachmentRequestDataAttributesAttachment;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    PatchAttachmentRequest body =
        new PatchAttachmentRequest()
            .data(
                new PatchAttachmentRequestData()
                    .attributes(
                        new PatchAttachmentRequestDataAttributes()
                            .attachment(
                                new PatchAttachmentRequestDataAttributesAttachment()
                                    .documentUrl(
                                        "https://app.datadoghq.com/notebook/124/Postmortem-IR-124")
                                    .title("Postmortem-IR-124")))
                    .type(IncidentAttachmentType.INCIDENT_ATTACHMENTS));

    try {
      Attachment result =
          apiInstance.updateIncidentAttachment(
              "incident_id", "00000000-0000-0000-0000-000000000002", body);
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
