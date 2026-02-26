// Update a pipeline returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipeline;
import com.datadog.api.client.v2.model.ObservabilityPipeline;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfig;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigDestinationItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorGroup;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigProcessorItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineConfigSourceItem;
import com.datadog.api.client.v2.model.ObservabilityPipelineData;
import com.datadog.api.client.v2.model.ObservabilityPipelineDataAttributes;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSource;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogAgentSourceType;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestination;
import com.datadog.api.client.v2.model.ObservabilityPipelineDatadogLogsDestinationType;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessor;
import com.datadog.api.client.v2.model.ObservabilityPipelineFilterProcessorType;
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

    // there is a valid "pipeline" in the system
    String PIPELINE_DATA_ID = System.getenv("PIPELINE_DATA_ID");

    ObservabilityPipeline body = new ObservabilityPipeline()
.data(new ObservabilityPipelineData()
.attributes(new ObservabilityPipelineDataAttributes()
.config(new ObservabilityPipelineConfig()
.destinations(Collections.singletonList(new ObservabilityPipelineConfigDestinationItem(
new ObservabilityPipelineDatadogLogsDestination()
.id("updated-datadog-logs-destination-id")
.inputs(Collections.singletonList("my-processor-group"))
.type(ObservabilityPipelineDatadogLogsDestinationType.DATADOG_LOGS))))
.processorGroups(Collections.singletonList(new ObservabilityPipelineConfigProcessorGroup()
.enabled(true)
.id("my-processor-group")
.include("service:my-service")
.inputs(Collections.singletonList("datadog-agent-source"))
.processors(Collections.singletonList(new ObservabilityPipelineConfigProcessorItem(
new ObservabilityPipelineFilterProcessor()
.enabled(true)
.id("filter-processor")
.include("status:error")
.type(ObservabilityPipelineFilterProcessorType.FILTER))))))
.sources(Collections.singletonList(new ObservabilityPipelineConfigSourceItem(
new ObservabilityPipelineDatadogAgentSource()
.id("datadog-agent-source")
.type(ObservabilityPipelineDatadogAgentSourceType.DATADOG_AGENT)))))
.name("Updated Pipeline Name"))
.id(PIPELINE_DATA_ID)
.type("pipelines"));

    try {
      ObservabilityPipeline result = apiInstance.updatePipeline(PIPELINE_DATA_ID, body);
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