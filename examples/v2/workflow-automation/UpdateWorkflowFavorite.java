// Update workflow favorite status returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.WorkflowFavoriteRequest;
import com.datadog.api.client.v2.model.WorkflowFavoriteRequestAttributes;
import com.datadog.api.client.v2.model.WorkflowFavoriteRequestData;
import com.datadog.api.client.v2.model.WorkflowFavoriteRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateWorkflowFavorite", true);
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    WorkflowFavoriteRequest body =
        new WorkflowFavoriteRequest()
            .data(
                new WorkflowFavoriteRequestData()
                    .attributes(new WorkflowFavoriteRequestAttributes().favorite(true))
                    .type(WorkflowFavoriteRequestType.WORKFLOW_FAVORITE_REQUEST));

    try {
      apiInstance.updateWorkflowFavorite("workflow_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#updateWorkflowFavorite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
