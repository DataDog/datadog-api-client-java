// Create a pipeline with Array Processor Select Operation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsArrayProcessor;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperation;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperationSelect;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperationSelectType;
import com.datadog.api.client.v1.model.LogsArrayProcessorType;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsProcessor;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    LogsPipeline body =
        new LogsPipeline()
            .filter(new LogsFilter().query("source:python"))
            .name("testPipelineArraySelect")
            .processors(
                Collections.singletonList(
                    new LogsProcessor(
                        new LogsArrayProcessor()
                            .type(LogsArrayProcessorType.ARRAY_PROCESSOR)
                            .isEnabled(true)
                            .name("extract_referrer")
                            .operation(
                                new LogsArrayProcessorOperation(
                                    new LogsArrayProcessorOperationSelect()
                                        .type(LogsArrayProcessorOperationSelectType.SELECT)
                                        .source("httpRequest.headers")
                                        .target("referrer")
                                        .filter("name:Referrer")
                                        .valueToExtract("value"))))));

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
