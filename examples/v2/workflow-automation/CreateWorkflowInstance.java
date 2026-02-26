// Execute a workflow returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.WorkflowInstanceCreateMeta;
import com.datadog.api.client.v2.model.WorkflowInstanceCreateRequest;
import com.datadog.api.client.v2.model.WorkflowInstanceCreateResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    WorkflowInstanceCreateRequest body =
        new WorkflowInstanceCreateRequest()
            .meta(
                new WorkflowInstanceCreateMeta()
                    .payload(Map.ofEntries(Map.entry("input", "value"))));

    try {
      WorkflowInstanceCreateResponse result =
          apiInstance.createWorkflowInstance("ccf73164-1998-4785-a7a3-8d06c7e5f558", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#createWorkflowInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
