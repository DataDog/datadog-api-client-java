// Update a pipeline returns "Updated pipeline" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.DatadogAgentSource;
import com.datadog.api.client.v2.model.DatadogAgentSourceType;
import com.datadog.api.client.v2.model.DatadogLogsDestination;
import com.datadog.api.client.v2.model.DatadogLogsDestinationType;
import com.datadog.api.client.v2.model.FilterProcessor;
import com.datadog.api.client.v2.model.FilterProcessorType;
import com.datadog.api.client.v2.model.Pipeline;
import com.datadog.api.client.v2.model.PipelineData;
import com.datadog.api.client.v2.model.PipelineDataAttributes;
import com.datadog.api.client.v2.model.PipelineDataAttributesConfig;
import com.datadog.api.client.v2.model.Tls;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    Pipeline body =
        new Pipeline()
            .data(
                new PipelineData()
                    .attributes(
                        new PipelineDataAttributes()
                            .config(
                                new PipelineDataAttributesConfig()
                                    .destinations(
                                        Collections.singletonList(
                                            new DatadogLogsDestination()
                                                .id("")
                                                .inputs(Collections.singletonList(""))
                                                .type(DatadogLogsDestinationType.DATADOG_LOGS)))
                                    .processors(
                                        Collections.singletonList(
                                            new FilterProcessor()
                                                .id("")
                                                .include("")
                                                .inputs(Collections.singletonList(""))
                                                .type(FilterProcessorType.FILTER)))
                                    .sources(
                                        Collections.singletonList(
                                            new DatadogAgentSource()
                                                .id("")
                                                .tls(new Tls().crtFile(""))
                                                .type(DatadogAgentSourceType.DATADOG_AGENT))))
                            .name("Main Observability Pipeline"))
                    .id("pipeline-1")
                    .type("pipeline"));

    try {
      Pipeline result = apiInstance.updatePipeline("pipeline_id", body);
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
