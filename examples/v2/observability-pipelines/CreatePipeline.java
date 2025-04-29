// Create a new pipeline returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipeline;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createPipeline", true);
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    ObservabilityPipelineSpec body =
        new ObservabilityPipelineSpec()
            .data(
                new ObservabilityPipelineSpecData()
                    .attributes(
                        new ObservabilityPipelineDataAttributes()
                            .config(
                                new ObservabilityPipelineConfig()
                                    .destinations(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigDestinationItem(
                                                new ObservabilityPipelineDatadogLogsDestination()
                                                    .id("datadog-logs-destination")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "filter-processor"))
                                                    .type(
                                                        ObservabilityPipelineDatadogLogsDestinationType
                                                            .DATADOG_LOGS))))
                                    .processors(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigProcessorItem(
                                                new ObservabilityPipelineFilterProcessor()
                                                    .id("filter-processor")
                                                    .include("service:my-service")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "datadog-agent-source"))
                                                    .type(
                                                        ObservabilityPipelineFilterProcessorType
                                                            .FILTER))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Main Observability Pipeline"))
                    .type("pipelines"));

    try {
      ObservabilityPipeline result = apiInstance.createPipeline(body);
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
