// Create a pipeline returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsPipelinesApi;
import com.datadog.api.v1.client.model.LogsFilter;
import com.datadog.api.v1.client.model.LogsGrokParser;
import com.datadog.api.v1.client.model.LogsGrokParserRules;
import com.datadog.api.v1.client.model.LogsGrokParserType;
import com.datadog.api.v1.client.model.LogsPipeline;
import com.datadog.api.v1.client.model.LogsProcessor;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
