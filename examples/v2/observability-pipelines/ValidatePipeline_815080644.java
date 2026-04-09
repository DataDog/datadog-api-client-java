// Validate an observability pipeline with enrichment table secret field lookup returns "OK"
// response

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
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFieldSecretLookup;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFile;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileEncoding;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileEncodingType;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileKeyItemField;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileKeyItems;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileKeyItemsComparison;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileSchemaItems;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableFileSchemaItemsType;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineEnrichmentTableProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import com.datadog.api.client.v2.model.ValidationResponse;
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
                                                            new ObservabilityPipelineEnrichmentTableProcessor()
                                                                .enabled(true)
                                                                .id("enrichment-processor")
                                                                .include("*")
                                                                .target("enriched")
                                                                .type(
                                                                    ObservabilityPipelineEnrichmentTableProcessorType
                                                                        .ENRICHMENT_TABLE)
                                                                .file(
                                                                    new ObservabilityPipelineEnrichmentTableFile()
                                                                        .encoding(
                                                                            new ObservabilityPipelineEnrichmentTableFileEncoding()
                                                                                .delimiter(",")
                                                                                .type(
                                                                                    ObservabilityPipelineEnrichmentTableFileEncodingType
                                                                                        .CSV)
                                                                                .includesHeaders(
                                                                                    true))
                                                                        .key(
                                                                            Collections
                                                                                .singletonList(
                                                                                    new ObservabilityPipelineEnrichmentTableFileKeyItems()
                                                                                        .column(
                                                                                            "user_id")
                                                                                        .comparison(
                                                                                            ObservabilityPipelineEnrichmentTableFileKeyItemsComparison
                                                                                                .EQUALS)
                                                                                        .field(
                                                                                            new ObservabilityPipelineEnrichmentTableFileKeyItemField(
                                                                                                new ObservabilityPipelineEnrichmentTableFieldSecretLookup()
                                                                                                    .secret(
                                                                                                        "LOOKUP_KEY_SECRET")))))
                                                                        .path(
                                                                            "/etc/enrichment/lookup.csv")
                                                                        .schema(
                                                                            Collections
                                                                                .singletonList(
                                                                                    new ObservabilityPipelineEnrichmentTableFileSchemaItems()
                                                                                        .column(
                                                                                            "user_id")
                                                                                        .type(
                                                                                            ObservabilityPipelineEnrichmentTableFileSchemaItemsType
                                                                                                .STRING)))))))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Pipeline with Enrichment Table Secret Field Lookup"))
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
