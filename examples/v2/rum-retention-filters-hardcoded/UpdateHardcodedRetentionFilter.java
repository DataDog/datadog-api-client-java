// Update a hardcoded retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersHardcodedApi;
import com.datadog.api.client.v2.model.RumHardcodedCrossProductSamplingUpdate;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterType;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RumHardcodedRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersHardcodedApi apiInstance =
        new RumRetentionFiltersHardcodedApi(defaultClient);

    RumHardcodedRetentionFilterUpdateRequest body =
        new RumHardcodedRetentionFilterUpdateRequest()
            .data(
                new RumHardcodedRetentionFilterUpdateData()
                    .id("REPLACE.ME")
                    .type(RumHardcodedRetentionFilterType.HARDCODED_RETENTION_FILTERS)
                    .attributes(
                        new RumHardcodedRetentionFilterUpdateAttributes()
                            .crossProductSampling(
                                new RumHardcodedCrossProductSamplingUpdate()
                                    .sessionReplaySampleRate(50.0)
                                    .sessionReplayEnabled(true))));

    try {
      RumHardcodedRetentionFilterResponse result =
          apiInstance.updateHardcodedRetentionFilter(
              "Example-RUM-Retention-Filters-Hardcoded",
              "Example-RUM-Retention-Filters-Hardcoded",
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumRetentionFiltersHardcodedApi#updateHardcodedRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
