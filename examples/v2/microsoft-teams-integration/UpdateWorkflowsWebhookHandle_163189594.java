// Update workflow webhook handle returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateWorkflowsWebhookHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    // there is a valid "workflows_webhook_handle" in the system
    String WORKFLOWS_WEBHOOK_HANDLE_DATA_ATTRIBUTES_NAME =
        System.getenv("WORKFLOWS_WEBHOOK_HANDLE_DATA_ATTRIBUTES_NAME");
    String WORKFLOWS_WEBHOOK_HANDLE_DATA_ID = System.getenv("WORKFLOWS_WEBHOOK_HANDLE_DATA_ID");

    MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body =
        new MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest()
            .data(
                new MicrosoftTeamsUpdateWorkflowsWebhookHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsWorkflowsWebhookHandleAttributes()
                            .name("fake-handle-name--updated"))
                    .type(MicrosoftTeamsWorkflowsWebhookHandleType.WORKFLOWS_WEBHOOK_HANDLE));

    try {
      MicrosoftTeamsWorkflowsWebhookHandleResponse result =
          apiInstance.updateWorkflowsWebhookHandle(WORKFLOWS_WEBHOOK_HANDLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling MicrosoftTeamsIntegrationApi#updateWorkflowsWebhookHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
