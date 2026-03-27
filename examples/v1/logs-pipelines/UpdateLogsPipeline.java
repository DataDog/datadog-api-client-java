// Update a pipeline returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsPipelinesApi;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsGrokParser;
import com.datadog.api.client.v1.model.LogsGrokParserRules;
import com.datadog.api.client.v1.model.LogsGrokParserType;
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
            .name("")
            .processors(
                Collections.singletonList(
                    new LogsProcessor(
                        new LogsGrokParser()
                            .grok(
                                new LogsGrokParserRules()
                                    .matchRules("""
rule_name_1 foo
rule_name_2 bar
""")
                                    .supportRules("""
rule_name_1 foo
rule_name_2 bar
"""))
                            .isEnabled(false)
                            .source("message")
                            .type(LogsGrokParserType.GROK_PARSER))));

    try {
      LogsPipeline result = apiInstance.updateLogsPipeline("pipeline_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsPipelinesApi#updateLogsPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
