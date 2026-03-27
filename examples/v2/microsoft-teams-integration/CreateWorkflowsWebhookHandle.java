// Create Workflows webhook handle returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateWorkflowsWebhookHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleRequestAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleRequestData;
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

    MicrosoftTeamsCreateWorkflowsWebhookHandleRequest body = new MicrosoftTeamsCreateWorkflowsWebhookHandleRequest()
.data(new MicrosoftTeamsWorkflowsWebhookHandleRequestData()
.attributes(new MicrosoftTeamsWorkflowsWebhookHandleRequestAttributes()
.name("fake-handle-name")
.url("https://fake.url.com"))
.type(MicrosoftTeamsWorkflowsWebhookHandleType.WORKFLOWS_WEBHOOK_HANDLE));

    try {
      MicrosoftTeamsWorkflowsWebhookHandleResponse result = apiInstance.createWorkflowsWebhookHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#createWorkflowsWebhookHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}