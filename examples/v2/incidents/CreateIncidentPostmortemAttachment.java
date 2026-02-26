// Create postmortem attachment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.IncidentAttachmentType;
import com.datadog.api.client.v2.model.PostmortemAttachmentRequest;
import com.datadog.api.client.v2.model.PostmortemAttachmentRequestAttributes;
import com.datadog.api.client.v2.model.PostmortemAttachmentRequestData;
import com.datadog.api.client.v2.model.PostmortemCell;
import com.datadog.api.client.v2.model.PostmortemCellAttributes;
import com.datadog.api.client.v2.model.PostmortemCellDefinition;
import com.datadog.api.client.v2.model.PostmortemCellType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentPostmortemAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    PostmortemAttachmentRequest body =
        new PostmortemAttachmentRequest()
            .data(
                new PostmortemAttachmentRequestData()
                    .attributes(
                        new PostmortemAttachmentRequestAttributes()
                            .cells(
                                Collections.singletonList(
                                    new PostmortemCell()
                                        .attributes(
                                            new PostmortemCellAttributes()
                                                .definition(
                                                    new PostmortemCellDefinition()
                                                        .content(
                                                            """
## Incident Summary
This incident was caused by...
""")))
                                        .id("cell-1")
                                        .type(PostmortemCellType.MARKDOWN)))
                            .content("""
# Incident Report - IR-123
[...]
""")
                            .postmortemTemplateId("93645509-874e-45c4-adfa-623bfeaead89-123")
                            .title("Postmortem-IR-123"))
                    .type(IncidentAttachmentType.INCIDENT_ATTACHMENTS));

    try {
      Attachment result =
          apiInstance.createIncidentPostmortemAttachment(
              "00000000-0000-0000-0000-000000000000", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentPostmortemAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
