// Execute a workflow from a template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionConfig;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionConnection;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionRequest;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionRequestAttributes;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionRequestData;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionRequestType;
import com.datadog.api.client.v2.model.WorkflowHeadlessExecutionResponse;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.executeWorkflowFromTemplate", true);
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    WorkflowHeadlessExecutionRequest body =
        new WorkflowHeadlessExecutionRequest()
            .data(
                new WorkflowHeadlessExecutionRequestData()
                    .attributes(
                        new WorkflowHeadlessExecutionRequestAttributes()
                            .config(
                                new WorkflowHeadlessExecutionConfig()
                                    .connections(
                                        Collections.singletonList(
                                            new WorkflowHeadlessExecutionConnection()
                                                .connectionId(
                                                    UUID.fromString(
                                                        "11111111-1111-1111-1111-111111111111"))
                                                .label("INTEGRATION_DATADOG")))
                                    .inputs(Map.ofEntries()))
                            .templateId("template-789"))
                    .id("1234")
                    .type(
                        WorkflowHeadlessExecutionRequestType.WORKFLOW_HEADLESS_EXECUTION_REQUEST));

    try {
      WorkflowHeadlessExecutionResponse result =
          apiInstance.executeWorkflowFromTemplate("parent_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WorkflowAutomationApi#executeWorkflowFromTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
