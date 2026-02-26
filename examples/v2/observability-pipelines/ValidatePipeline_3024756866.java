// Validate an observability pipeline with OCSF mapper custom mapping returns "OK" response

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
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMapperProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMapperProcessorMapping;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMapperProcessorMappingMapping;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMapperProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMappingCustom;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMappingCustomFieldMapping;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMappingCustomLookup;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMappingCustomLookupTableEntry;
import com.datadog.api.client.v2.model.ObservabilityPipelineOcsfMappingCustomMetadata;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import com.datadog.api.client.v2.model.ValidationResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                                                            new ObservabilityPipelineOcsfMapperProcessor()
                                                                .enabled(true)
                                                                .id("ocsf-mapper-processor")
                                                                .include("service:my-service")
                                                                .mappings(
                                                                    Collections.singletonList(
                                                                        new ObservabilityPipelineOcsfMapperProcessorMapping()
                                                                            .include(
                                                                                "source:custom")
                                                                            .mapping(
                                                                                new ObservabilityPipelineOcsfMapperProcessorMappingMapping(
                                                                                    new ObservabilityPipelineOcsfMappingCustom()
                                                                                        .mapping(
                                                                                            Arrays
                                                                                                .asList(
                                                                                                    new ObservabilityPipelineOcsfMappingCustomFieldMapping()
                                                                                                        ._default(
                                                                                                            "")
                                                                                                        .dest(
                                                                                                            "time")
                                                                                                        .source(
                                                                                                            "timestamp"),
                                                                                                    new ObservabilityPipelineOcsfMappingCustomFieldMapping()
                                                                                                        ._default(
                                                                                                            "")
                                                                                                        .dest(
                                                                                                            "severity")
                                                                                                        .source(
                                                                                                            "level"),
                                                                                                    new ObservabilityPipelineOcsfMappingCustomFieldMapping()
                                                                                                        ._default(
                                                                                                            "")
                                                                                                        .dest(
                                                                                                            "device.type")
                                                                                                        .lookup(
                                                                                                            new ObservabilityPipelineOcsfMappingCustomLookup()
                                                                                                                .table(
                                                                                                                    Collections
                                                                                                                        .singletonList(
                                                                                                                            new ObservabilityPipelineOcsfMappingCustomLookupTableEntry()
                                                                                                                                .contains(
                                                                                                                                    "Desktop")
                                                                                                                                .value(
                                                                                                                                    "desktop"))))
                                                                                                        .source(
                                                                                                            "host.type")))
                                                                                        .metadata(
                                                                                            new ObservabilityPipelineOcsfMappingCustomMetadata()
                                                                                                ._class(
                                                                                                    "Device"
                                                                                                        + " Inventory"
                                                                                                        + " Info")
                                                                                                .profiles(
                                                                                                    Collections
                                                                                                        .singletonList(
                                                                                                            "container"))
                                                                                                .version(
                                                                                                    "1.3.0"))
                                                                                        .version(
                                                                                            1L)))))
                                                                .type(
                                                                    ObservabilityPipelineOcsfMapperProcessorType
                                                                        .OCSF_MAPPER))))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("OCSF Custom Mapper Pipeline"))
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
