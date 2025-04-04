// Update a pipeline returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.Pipeline;
import com.datadog.api.client.v2.model.PipelineConfig;
import com.datadog.api.client.v2.model.PipelineConfigDestination;
import com.datadog.api.client.v2.model.PipelineConfigProcessor;
import com.datadog.api.client.v2.model.PipelineConfigSource;
import com.datadog.api.client.v2.model.PipelineData;
import com.datadog.api.client.v2.model.PipelineDataAttributes;
import com.datadog.api.client.v2.model.PipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.PipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.PipelineDatadogLogsDestination;
import com.datadog.api.client.v2.model.PipelineDatadogLogsDestinationType;
import com.datadog.api.client.v2.model.PipelineFilterProcessor;
import com.datadog.api.client.v2.model.PipelineFilterProcessorType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updatePipeline", true);
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    // there is a valid "pipeline" in the system
    String PIPELINE_DATA_ID = System.getenv("PIPELINE_DATA_ID");

    Pipeline body =
        new Pipeline()
            .data(
                new PipelineData()
                    .attributes(
                        new PipelineDataAttributes()
                            .config(
                                new PipelineConfig()
                                    .destinations(
                                        Collections.singletonList(
                                            new PipelineConfigDestination(
                                                new PipelineDatadogLogsDestination()
                                                    .id("updated-datadog-logs-destination-id")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "filter-processor"))
                                                    .type(
                                                        PipelineDatadogLogsDestinationType
                                                            .DATADOG_LOGS))))
                                    .processors(
                                        Collections.singletonList(
                                            new PipelineConfigProcessor(
                                                new PipelineFilterProcessor()
                                                    .id("filter-processor")
                                                    .include("service:my-service")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "datadog-agent-source"))
                                                    .type(PipelineFilterProcessorType.FILTER))))
                                    .sources(
                                        Collections.singletonList(
                                            new PipelineConfigSource(
                                                new PipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        PipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Updated Pipeline Name"))
                    .id(PIPELINE_DATA_ID)
                    .type("pipelines"));

    try {
      Pipeline result = apiInstance.updatePipeline(PIPELINE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservabilityPipelinesApi#updatePipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
