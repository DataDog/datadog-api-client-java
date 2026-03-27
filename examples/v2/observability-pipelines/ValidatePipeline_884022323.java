// Validate a metrics pipeline with opentelemetry source returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ValidationResponse;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigPipelineType;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogMetricsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogMetricsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessorType;
import com.datadog.api.client.v2.model.ObservabilityPipelineOpentelemetrySource;
import com.datadog.api.client.v2.model.ObservabilityPipelineOpentelemetrySourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpec;
import com.datadog.api.client.v2.model.ObservabilityPipelineSpecData;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    ObservabilityPipelineSpec body = new ObservabilityPipelineSpec()
.data(new ObservabilityPipelineSpecData()
.attributes(new ObservabilityPipelineDataAttributes()
.config(new ObservabilityPipelineConfig()
.pipelineType(ObservabilityPipelineConfigPipelineType.METRICS)
.destinations(Collections.singletonList(new ObservabilityPipelineConfigDestinationItem(
new ObservabilityPipelineDatadogMetricsDestination()
.id("datadog-metrics-destination")
.inputs(Collections.singletonList("my-processor-group"))
.type(ObservabilityPipelineDatadogMetricsDestinationType.DATADOG_METRICS))))
.processorGroups(Collections.singletonList(new ObservabilityPipelineConfigProcessorGroup()
.enabled(true)
.id("my-processor-group")
.include("*")
.inputs(Collections.singletonList("opentelemetry-source"))
.processors(Collections.singletonList(new ObservabilityPipelineConfigProcessorItem(
new ObservabilityPipelineFilterProcessor()
.enabled(true)
.id("filter-processor")
.include("env:production")
.type(ObservabilityPipelineFilterProcessorType.FILTER))))))
.sources(Collections.singletonList(new ObservabilityPipelineConfigSourceItem(
new ObservabilityPipelineOpentelemetrySource()
.id("opentelemetry-source")
.type(ObservabilityPipelineOpentelemetrySourceType.OPENTELEMETRY)))))
.name("Metrics OTel Pipeline"))
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