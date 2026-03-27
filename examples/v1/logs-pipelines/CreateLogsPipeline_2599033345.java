// Create a pipeline with nested pipeline processor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsPipelineProcessor;
import com.datadog.api.client.v1.model.LogsPipelineProcessorType;
import com.datadog.api.client.v1.model.LogsProcessor;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    LogsPipeline body =
        new LogsPipeline()
            .filter(new LogsFilter().query("source:python"))
            .name("testPipelineWithNested")
            .processors(
                Collections.singletonList(
                    new LogsProcessor(
                        new LogsPipelineProcessor()
                            .type(LogsPipelineProcessorType.PIPELINE)
                            .isEnabled(true)
                            .name("nested_pipeline_with_metadata")
                            .filter(new LogsFilter().query("env:production"))
                            .tags(Arrays.asList("env:prod", "type:nested"))
                            .description("This is a nested pipeline for production logs"))))
            .tags(Collections.singletonList("team:test"))
            .description("Pipeline containing nested processor with tags and description");

    try {
      LogsPipeline result = apiInstance.createLogsPipeline(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsPipelinesApi#createLogsPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
