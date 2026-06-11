// Create a pipeline with Array Map Processor using category sub-processor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsArrayMapProcessor;
import com.datadog.api.client.v1.model.LogsArrayMapProcessorType;
import com.datadog.api.client.v1.model.LogsArrayMapSubProcessor;
import com.datadog.api.client.v1.model.LogsCategoryProcessor;
import com.datadog.api.client.v1.model.LogsCategoryProcessorCategory;
import com.datadog.api.client.v1.model.LogsCategoryProcessorType;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsPipeline;
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
            .name("testPipelineArrayMapCategory")
            .processors(
                Collections.singletonList(
                    new LogsProcessor(
                        new LogsArrayMapProcessor()
                            .type(LogsArrayMapProcessorType.ARRAY_MAP_PROCESSOR)
                            .isEnabled(true)
                            .name("categorize items")
                            .source("items")
                            .target("out")
                            .processors(
                                Collections.singletonList(
                                    new LogsArrayMapSubProcessor(
                                        new LogsCategoryProcessor()
                                            .type(LogsCategoryProcessorType.CATEGORY_PROCESSOR)
                                            .target("$targetElem.level")
                                            .categories(
                                                Arrays.asList(
                                                    new LogsCategoryProcessorCategory()
                                                        .filter(
                                                            new LogsFilter()
                                                                .query("@$sourceElem.status:error"))
                                                        .name("error"),
                                                    new LogsCategoryProcessorCategory()
                                                        .filter(new LogsFilter().query("*"))
                                                        .name("info")))))))));

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
