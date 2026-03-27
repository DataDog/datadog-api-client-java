// Create a pipeline with Decoder Processor returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsPipeline;
import com.datadog.api.client.v1.model.LogsDecoderProcessor;
import com.datadog.api.client.v1.model.LogsDecoderProcessorBinaryToTextEncoding;
import com.datadog.api.client.v1.model.LogsDecoderProcessorInputRepresentation;
import com.datadog.api.client.v1.model.LogsDecoderProcessorType;
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
.name("testDecoderProcessor")
.processors(Collections.singletonList(new LogsProcessor(
new LogsDecoderProcessor()
.type(LogsDecoderProcessorType.DECODER_PROCESSOR)
.isEnabled(true)
.name("test_decoder")
.source("encoded.field")
.target("decoded.field")
.binaryToTextEncoding(LogsDecoderProcessorBinaryToTextEncoding.BASE16)
.inputRepresentation(LogsDecoderProcessorInputRepresentation.UTF_8))));

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