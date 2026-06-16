// List workflows returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.api.WorkflowAutomationApi.ListWorkflowsOptionalParameters;
import com.datadog.api.client.v2.model.WorkflowListItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    try {
      PaginationIterable<WorkflowListItem> iterable =
          apiInstance.listWorkflowsWithPagination(
              new ListWorkflowsOptionalParameters()
                  .filterQuery("Example-Workflow-Automation")
                  .limit(2L));

      for (WorkflowListItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling WorkflowAutomationApi#listWorkflowsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
