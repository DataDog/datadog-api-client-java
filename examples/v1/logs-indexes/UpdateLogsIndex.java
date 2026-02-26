// Update an index returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.LogsIndexesApi;
import com.datadog.api.client.v1.model.LogsDailyLimitReset;
import com.datadog.api.client.v1.model.LogsExclusion;
import com.datadog.api.client.v1.model.LogsExclusionFilter;
import com.datadog.api.client.v1.model.LogsFilter;
import com.datadog.api.client.v1.model.LogsIndex;
import com.datadog.api.client.v1.model.LogsIndexUpdateRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsIndexesApi apiInstance = new LogsIndexesApi(defaultClient);

    LogsIndexUpdateRequest body =
        new LogsIndexUpdateRequest()
            .dailyLimit(300000000L)
            .dailyLimitReset(new LogsDailyLimitReset().resetTime("14:00").resetUtcOffset("+02:00"))
            .dailyLimitWarningThresholdPercentage(70.0)
            .disableDailyLimit(false)
            .exclusionFilters(
                Collections.singletonList(
                    new LogsExclusion()
                        .filter(new LogsExclusionFilter().query("*").sampleRate(1.0))
                        .name("payment")))
            .filter(new LogsFilter().query("source:python"))
            .numFlexLogsRetentionDays(360L)
            .numRetentionDays(15L)
            .tags(Arrays.asList("team:backend", "env:production"));

    try {
      LogsIndex result = apiInstance.updateLogsIndex("name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsIndexesApi#updateLogsIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
