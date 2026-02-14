// Execute a workflow from a webhook returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.WorkflowWebhookExecutionResponse;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.executeWorkflowFromWebhook", true);
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    Map<String, Object> body = Map.ofEntries(Map.entry("foo", "bar"));

    try {
      WorkflowWebhookExecutionResponse result =
          apiInstance.executeWorkflowFromWebhook(
              "workflow_id",
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              "sha256=abcdef123456...",
              "GitHub-Hookshot/abc123",
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#executeWorkflowFromWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
