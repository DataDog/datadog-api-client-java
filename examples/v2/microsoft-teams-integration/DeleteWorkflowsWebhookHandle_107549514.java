// Delete workflow webhook handle returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    // there is a valid "workflows_webhook_handle" in the system
    String WORKFLOWS_WEBHOOK_HANDLE_DATA_ID = System.getenv("WORKFLOWS_WEBHOOK_HANDLE_DATA_ID");

    try {
      apiInstance.deleteWorkflowsWebhookHandle(WORKFLOWS_WEBHOOK_HANDLE_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling MicrosoftTeamsIntegrationApi#deleteWorkflowsWebhookHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
