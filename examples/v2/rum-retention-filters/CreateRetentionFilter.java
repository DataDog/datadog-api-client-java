// Create a RUM retention filter returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumRetentionFilterCreateAttributes;
import com.datadog.api.client.v2.model.RumRetentionFilterCreateData;
import com.datadog.api.client.v2.model.RumRetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RumRetentionFilterEventType;
import com.datadog.api.client.v2.model.RumRetentionFilterMeta;
import com.datadog.api.client.v2.model.RumRetentionFilterResponse;
import com.datadog.api.client.v2.model.RumRetentionFilterSource;
import com.datadog.api.client.v2.model.RumRetentionFilterType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RumRetentionFilterCreateRequest body =
        new RumRetentionFilterCreateRequest()
            .data(
                new RumRetentionFilterCreateData()
                    .type(RumRetentionFilterType.RETENTION_FILTERS)
                    .attributes(
                        new RumRetentionFilterCreateAttributes()
                            .name("Test creating retention filter")
                            .eventType(RumRetentionFilterEventType.SESSION)
                            .query("custom_query")
                            .sampleRate(50L)
                            .enabled(true))
                    .meta(new RumRetentionFilterMeta().source(RumRetentionFilterSource.TERRAFORM)));

    try {
      RumRetentionFilterResponse result =
          apiInstance.createRetentionFilter("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#createRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
