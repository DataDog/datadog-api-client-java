// List workflows returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.ListWorkflowsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    try {
      ListWorkflowsResponse result = apiInstance.listWorkflows();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#listWorkflows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
