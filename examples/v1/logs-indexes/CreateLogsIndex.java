// Create an index returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsIndexesApi;
import com.datadog.api.v1.client.model.LogsExclusion;
import com.datadog.api.v1.client.model.LogsExclusionFilter;
import com.datadog.api.v1.client.model.LogsFilter;
import com.datadog.api.v1.client.model.LogsIndex;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);

    LogsIndex body =
        new LogsIndex()
            .dailyLimit(300000000L)
            .exclusionFilters(
                Collections.singletonList(
                    new LogsExclusion()
                        .filter(new LogsExclusionFilter().query("*").sampleRate(1.0))
                        .name("payment")))
            .filter(new LogsFilter().query("source:python"))
            .name("main")
            .numRetentionDays(15L);

    try {
      LogsIndex result = apiInstance.createLogsIndex(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsIndexesApi#createLogsIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
