// Update Workflows webhook handle returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateWorkflowsWebhookHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleType;
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
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body = new MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest()
.data(new MicrosoftTeamsUpdateWorkflowsWebhookHandleRequestData()
.attributes(new MicrosoftTeamsWorkflowsWebhookHandleAttributes()
.name("fake-handle-name")
.url("https://fake.url.com"))
.type(MicrosoftTeamsWorkflowsWebhookHandleType.WORKFLOWS_WEBHOOK_HANDLE));

    try {
      MicrosoftTeamsWorkflowsWebhookHandleResponse result = apiInstance.updateWorkflowsWebhookHandle("handle_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#updateWorkflowsWebhookHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}