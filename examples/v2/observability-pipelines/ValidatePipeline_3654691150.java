// Validate an observability pipeline with spike protection processor threshold overrides returns
// "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineFieldValue;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeepType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorSpikeAction;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorThresholdOverride;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpikeProtectionProcessorType;
import com.datadog.api.client.v2.model.ValidationResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
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
                                                            "my-processor-group"))
                                                    .type(
                                                        ObservabilityPipelineDatadogLogsDestinationType
                                                            .DATADOG_LOGS))))
                                    .processorGroups(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigProcessorGroup()
                                                .enabled(true)
                                                .id("my-processor-group")
                                                .include("service:my-service")
                                                .inputs(
                                                    Collections.singletonList(
                                                        "datadog-agent-source"))
                                                .processors(
                                                    Collections.singletonList(
                                                        new ObservabilityPipelineConfigProcessorItem(
                                                            new ObservabilityPipelineSpikeProtectionProcessor()
                                                                .enabled(true)
                                                                .id("spike-protection-processor")
                                                                .include("*")
                                                                .type(
                                                                    ObservabilityPipelineSpikeProtectionProcessorType
                                                                        .SPIKE_PROTECTION)
                                                                .name(
                                                                    "MyPartitionedSpikeProtection")
                                                                .spikeAction(
                                                                    ObservabilityPipelineSpikeProtectionProcessorSpikeAction
                                                                        .NO_ACTION)
                                                                .partitionFields(
                                                                    Collections.singletonList(
                                                                        "service"))
                                                                .actionWhenMissingPartitions(
                                                                    ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
                                                                        .DEFAULT_BUCKET)
                                                                .minimalThresholdOverrides(
                                                                    Arrays.asList(
                                                                        new ObservabilityPipelineSpikeProtectionProcessorThresholdOverride()
                                                                            .fields(
                                                                                Collections
                                                                                    .singletonList(
                                                                                        new ObservabilityPipelineFieldValue()
                                                                                            .name(
                                                                                                "service")
                                                                                            .value(
                                                                                                "checkout")))
                                                                            .minimalThreshold(
                                                                                new ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold(
                                                                                    new ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes()
                                                                                        .type(
                                                                                            ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType
                                                                                                .THRESHOLD)
                                                                                        .bytes(
                                                                                            53687091200L))),
                                                                        new ObservabilityPipelineSpikeProtectionProcessorThresholdOverride()
                                                                            .fields(
                                                                                Collections
                                                                                    .singletonList(
                                                                                        new ObservabilityPipelineFieldValue()
                                                                                            .name(
                                                                                                "service")
                                                                                            .value(
                                                                                                "payments")))
                                                                            .minimalThreshold(
                                                                                new ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold(
                                                                                    new ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep()
                                                                                        .type(
                                                                                            ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeepType
                                                                                                .ALWAYS_KEEP))))))))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Pipeline with Spike Protection Threshold Overrides"))
                    .type("pipelines"));

    try {
      ValidationResponse result = apiInstance.validatePipeline(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservabilityPipelinesApi#validatePipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
