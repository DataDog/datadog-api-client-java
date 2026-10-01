// Validate a metrics pipeline with enrichment table processor reference table returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigPipelineType;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogMetricsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogMetricsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableLookupSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableMetricNameLookup;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableMetricNameLookupType;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableReferenceKey;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableReferenceTable;
import com.datadog.api.client.v2.model.ObservabilityPipelineMetricEnrichmentTableReferenceTableProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
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
                                    .pipelineType(ObservabilityPipelineConfigPipelineType.METRICS)
                                    .destinations(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigDestinationItem(
                                                new ObservabilityPipelineDatadogMetricsDestination()
                                                    .id("datadog-metrics-destination")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "my-processor-group"))
                                                    .type(
                                                        ObservabilityPipelineDatadogMetricsDestinationType
                                                            .DATADOG_METRICS))))
                                    .processorGroups(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigProcessorGroup()
                                                .enabled(true)
                                                .id("my-processor-group")
                                                .include("*")
                                                .inputs(
                                                    Collections.singletonList(
                                                        "datadog-agent-source"))
                                                .processors(
                                                    Collections.singletonList(
                                                        new ObservabilityPipelineConfigProcessorItem(
                                                            new ObservabilityPipelineMetricEnrichmentTableProcessor(
                                                                new ObservabilityPipelineMetricEnrichmentTableReferenceTableProcessor()
                                                                    .enabled(true)
                                                                    .id(
                                                                        "enrichment-table-processor")
                                                                    .include("*")
                                                                    .type(
                                                                        ObservabilityPipelineEnrichmentTableProcessorType
                                                                            .ENRICHMENT_TABLE)
                                                                    .referenceTable(
                                                                        new ObservabilityPipelineMetricEnrichmentTableReferenceTable()
                                                                            .tableId(
                                                                                "metric-enrichment")
                                                                            .key(
                                                                                new ObservabilityPipelineMetricEnrichmentTableReferenceKey()
                                                                                    .source(
                                                                                        new ObservabilityPipelineMetricEnrichmentTableLookupSource(
                                                                                            new ObservabilityPipelineMetricEnrichmentTableMetricNameLookup()
                                                                                                .type(
                                                                                                    ObservabilityPipelineMetricEnrichmentTableMetricNameLookupType
                                                                                                        .METRIC_NAME))))
                                                                            .columns(
                                                                                Arrays.asList(
                                                                                    "environment",
                                                                                    "team")))))))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Metrics Pipeline with Enrichment Table Reference Table"))
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
