// Create a pipeline with Array Processor Append Operation with preserve_source false returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsArrayProcessor;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperation;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperationAppend;
import com.datadog.api.client.v1.model.LogsArrayProcessorOperationAppendType;
import com.datadog.api.client.v1.model.LogsArrayProcessorType;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsProcessor;
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
    LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);

    LogsPipeline body = new LogsPipeline()
.filter(new LogsFilter()
.query("source:python"))
.name("testPipelineArrayAppendNoPreserve")
.processors(Collections.singletonList(new LogsProcessor(
new LogsArrayProcessor()
.type(LogsArrayProcessorType.ARRAY_PROCESSOR)
.isEnabled(true)
.name("append_ip_and_remove_source")
.operation(new LogsArrayProcessorOperation(
new LogsArrayProcessorOperationAppend()
.type(LogsArrayProcessorOperationAppendType.APPEND)
.source("network.client.ip")
.target("sourceIps")
.preserveSource(false))))));

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