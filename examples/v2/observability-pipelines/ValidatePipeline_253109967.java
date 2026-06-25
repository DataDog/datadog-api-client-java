// Validate an observability pipeline with ClickHouse destination with all fields set returns "OK"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipelineBufferOptions;
import com.datadog.api.client.v2.model.ObservabilityPipelineBufferOptionsMemoryType;
import com.datadog.api.client.v2.model.ObservabilityPipelineBufferOptionsWhenFull;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationAuth;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationAuthStrategy;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationBatch;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationBatchEncoding;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationBatchEncodingCodec;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationCompression;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationCompressionAlgorithm;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationCompressionObject;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationFormat;
import com.datadog.api.client.v2.model.ObservabilityPipelineClickhouseDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineMemoryBufferSizeOptions;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import com.datadog.api.client.v2.model.ObservabilityPipelineTls;
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
                                                new ObservabilityPipelineClickhouseDestination()
                                                    .id("clickhouse-destination")
                                                    .inputs(
                                                        Collections.singletonList(
                                                            "my-processor-group"))
                                                    .type(
                                                        ObservabilityPipelineClickhouseDestinationType
                                                            .CLICKHOUSE)
                                                    .endpointUrlKey("CLICKHOUSE_ENDPOINT_URL")
                                                    .database("my_database")
                                                    .table("application_logs")
                                                    .format(
                                                        ObservabilityPipelineClickhouseDestinationFormat
                                                            .ARROW_STREAM)
                                                    .skipUnknownFields(true)
                                                    .dateTimeBestEffort(true)
                                                    .compression(
                                                        new ObservabilityPipelineClickhouseDestinationCompression(
                                                            new ObservabilityPipelineClickhouseDestinationCompressionObject()
                                                                .algorithm(
                                                                    ObservabilityPipelineClickhouseDestinationCompressionAlgorithm
                                                                        .GZIP)
                                                                .level(6L)))
                                                    .auth(
                                                        new ObservabilityPipelineClickhouseDestinationAuth()
                                                            .strategy(
                                                                ObservabilityPipelineClickhouseDestinationAuthStrategy
                                                                    .BASIC)
                                                            .usernameKey("CLICKHOUSE_USERNAME")
                                                            .passwordKey("CLICKHOUSE_PASSWORD"))
                                                    .batch(
                                                        new ObservabilityPipelineClickhouseDestinationBatch()
                                                            .maxEvents(1000L)
                                                            .timeoutSecs(1L))
                                                    .batchEncoding(
                                                        new ObservabilityPipelineClickhouseDestinationBatchEncoding()
                                                            .codec(
                                                                ObservabilityPipelineClickhouseDestinationBatchEncodingCodec
                                                                    .ARROW_STREAM)
                                                            .allowNullableFields(true))
                                                    .tls(
                                                        new ObservabilityPipelineTls()
                                                            .crtFile("/path/to/cert.crt")
                                                            .caFile("/path/to/ca.crt")
                                                            .keyFile("/path/to/key.key")
                                                            .keyPassKey("TLS_KEY_PASSPHRASE"))
                                                    .buffer(
                                                        new ObservabilityPipelineBufferOptions(
                                                            new ObservabilityPipelineMemoryBufferSizeOptions()
                                                                .type(
                                                                    ObservabilityPipelineBufferOptionsMemoryType
                                                                        .MEMORY)
                                                                .maxEvents(500L)
                                                                .whenFull(
                                                                    ObservabilityPipelineBufferOptionsWhenFull
                                                                        .BLOCK))))))
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
                                                            new ObservabilityPipelineFilterProcessor()
                                                                .enabled(true)
                                                                .id("filter-processor")
                                                                .include("status:error")
                                                                .type(
                                                                    ObservabilityPipelineFilterProcessorType
                                                                        .FILTER))))))
                                    .sources(
                                        Collections.singletonList(
                                            new ObservabilityPipelineConfigSourceItem(
                                                new ObservabilityPipelineDatadogAgentSource()
                                                    .id("datadog-agent-source")
                                                    .type(
                                                        ObservabilityPipelineDatadogAgentSourceType
                                                            .DATADOG_AGENT)))))
                            .name("Pipeline with ClickHouse Destination All Fields"))
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
