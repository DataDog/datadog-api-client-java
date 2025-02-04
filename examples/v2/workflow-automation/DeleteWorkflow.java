// Delete an existing Workflow returns "Successfully deleted a workflow." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    // there is a valid "workflow" in the system
    String WORKFLOW_DATA_ID = System.getenv("WORKFLOW_DATA_ID");

    try {
      apiInstance.deleteWorkflow(WORKFLOW_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#deleteWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
