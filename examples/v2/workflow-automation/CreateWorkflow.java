// Create a Workflow returns "Successfully created a workflow." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WorkflowAutomationApi;
import com.datadog.api.client.v2.model.Connection;
import com.datadog.api.client.v2.model.ConnectionEnv;
import com.datadog.api.client.v2.model.ConnectionEnvEnv;
import com.datadog.api.client.v2.model.CreateWorkflowRequest;
import com.datadog.api.client.v2.model.CreateWorkflowResponse;
import com.datadog.api.client.v2.model.GithubWebhookTrigger;
import com.datadog.api.client.v2.model.GithubWebhookTriggerWrapper;
import com.datadog.api.client.v2.model.InputSchema;
import com.datadog.api.client.v2.model.InputSchemaParameters;
import com.datadog.api.client.v2.model.InputSchemaParametersType;
import com.datadog.api.client.v2.model.MonitorTrigger;
import com.datadog.api.client.v2.model.MonitorTriggerWrapper;
import com.datadog.api.client.v2.model.OutboundEdge;
import com.datadog.api.client.v2.model.OutputSchema;
import com.datadog.api.client.v2.model.OutputSchemaParameters;
import com.datadog.api.client.v2.model.OutputSchemaParametersType;
import com.datadog.api.client.v2.model.Parameter;
import com.datadog.api.client.v2.model.Spec;
import com.datadog.api.client.v2.model.Step;
import com.datadog.api.client.v2.model.Trigger;
import com.datadog.api.client.v2.model.TriggerRateLimit;
import com.datadog.api.client.v2.model.WorkflowData;
import com.datadog.api.client.v2.model.WorkflowDataAttributes;
import com.datadog.api.client.v2.model.WorkflowDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WorkflowAutomationApi apiInstance = new WorkflowAutomationApi(defaultClient);

    CreateWorkflowRequest body =
        new CreateWorkflowRequest()
            .data(
                new WorkflowData()
                    .attributes(
                        new WorkflowDataAttributes()
                            .description("A sample workflow.")
                            .name("Example Workflow")
                            .published(true)
                            .spec(
                                new Spec()
                                    .connectionEnvs(
                                        Collections.singletonList(
                                            new ConnectionEnv()
                                                .connections(
                                                    Collections.singletonList(
                                                        new Connection()
                                                            .connectionId(
                                                                "11111111-1111-1111-1111-111111111111")
                                                            .label("INTEGRATION_DATADOG")))
                                                .env(ConnectionEnvEnv.DEFAULT)))
                                    .inputSchema(
                                        new InputSchema()
                                            .parameters(
                                                Collections.singletonList(
                                                    new InputSchemaParameters()
                                                        .defaultValue("default")
                                                        .name("input")
                                                        .type(InputSchemaParametersType.STRING))))
                                    .outputSchema(
                                        new OutputSchema()
                                            .parameters(
                                                Collections.singletonList(
                                                    new OutputSchemaParameters()
                                                        .name("output")
                                                        .type(
                                                            OutputSchemaParametersType.ARRAY_OBJECT)
                                                        .value("outputValue"))))
                                    .steps(
                                        Arrays.asList(
                                            new Step()
                                                .actionId("com.datadoghq.dd.monitor.listMonitors")
                                                .connectionLabel("INTEGRATION_DATADOG")
                                                .name("Step1")
                                                .outboundEdges(
                                                    Collections.singletonList(
                                                        new OutboundEdge()
                                                            .branchName("main")
                                                            .nextStepName("Step2")))
                                                .parameters(
                                                    Collections.singletonList(
                                                        new Parameter()
                                                            .name("tags")
                                                            .value("service:monitoring"))),
                                            new Step()
                                                .actionId("com.datadoghq.core.noop")
                                                .name("Step2")))
                                    .triggers(
                                        Arrays.asList(
                                            new Trigger(
                                                new MonitorTriggerWrapper()
                                                    .monitorTrigger(
                                                        new MonitorTrigger()
                                                            .rateLimit(
                                                                new TriggerRateLimit()
                                                                    .count(1L)
                                                                    .interval("3600s")))
                                                    .startStepNames(
                                                        Collections.singletonList("Step1"))),
                                            new Trigger(
                                                new GithubWebhookTriggerWrapper()
                                                    .startStepNames(
                                                        Collections.singletonList("Step1"))
                                                    .githubWebhookTrigger(
                                                        new GithubWebhookTrigger())))))
                            .tags(Arrays.asList("team:infra", "service:monitoring", "foo:bar")))
                    .type(WorkflowDataType.WORKFLOWS));

    try {
      CreateWorkflowResponse result = apiInstance.createWorkflow(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowAutomationApi#createWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
