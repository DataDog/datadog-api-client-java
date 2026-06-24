// Validate an observability pipeline with websocket source bearer auth returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineDecoding;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSourceAuthStrategy;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSourceTls;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSourceTlsEnabled;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSourceTlsEnabledMode;
import com.datadog.api.client.v2.model.ObservabilityPipelineWebsocketSourceType;
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
                                                    Collections.singletonList("websocket-source"))
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
                                                new ObservabilityPipelineWebsocketSource()
                                                    .id("websocket-source")
                                                    .type(
                                                        ObservabilityPipelineWebsocketSourceType
                                                            .WEBSOCKET)
                                                    .decoding(
                                                        ObservabilityPipelineDecoding.DECODE_JSON)
                                                    .authStrategy(
                                                        ObservabilityPipelineWebsocketSourceAuthStrategy
                                                            .BEARER)
                                                    .tokenKey("WS_BEARER_TOKEN")
                                                    .uriKey("WS_URI")
                                                    .tls(
                                                        new ObservabilityPipelineWebsocketSourceTls(
                                                            new ObservabilityPipelineWebsocketSourceTlsEnabled()
                                                                .mode(
                                                                    ObservabilityPipelineWebsocketSourceTlsEnabledMode
                                                                        .ENABLED)))))))
                            .name("Pipeline with WebSocket Source"))
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
