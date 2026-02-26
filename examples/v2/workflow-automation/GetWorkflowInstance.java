// Get a workflow instance returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.WorklflowGetInstanceResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    try {
      WorklflowGetInstanceResponse result =
          apiInstance.getWorkflowInstance(
              "ccf73164-1998-4785-a7a3-8d06c7e5f558", "305a472b-71ab-4ce8-8f8d-75db635627b5");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#getWorkflowInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
