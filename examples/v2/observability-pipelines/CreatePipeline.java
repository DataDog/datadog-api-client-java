// Create a new pipeline returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.Pipeline;
import com.datadog.api.client.v2.model.PipelineConfig;
import com.datadog.api.client.v2.model.PipelineConfigDestination;
import com.datadog.api.client.v2.model.PipelineConfigProcessor;
import com.datadog.api.client.v2.model.PipelineConfigSource;
import com.datadog.api.client.v2.model.PipelineCreateRequest;
import com.datadog.api.client.v2.model.PipelineCreateRequestData;
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
    defaultClient.setUnstableOperationEnabled("v2.createPipeline", true);
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    PipelineCreateRequest body =
        new PipelineCreateRequest()
            .data(
                new PipelineCreateRequestData()
                    .attributes(
                        new PipelineDataAttributes()
                            .config(
                                new PipelineConfig()
                                    .destinations(
                                        Collections.singletonList(
                                            new PipelineConfigDestination(
                                                new PipelineDatadogLogsDestination()
                                                    .id("datadog-logs-destination")
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
                            .name("Main Observability Pipeline"))
                    .type("pipelines"));

    try {
      Pipeline result = apiInstance.createPipeline(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservabilityPipelinesApi#createPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
