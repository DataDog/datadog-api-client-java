// Create a RUM retention filter returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RUMRetentionFilterCreateAttributes;
import com.datadog.api.client.v2.model.RUMRetentionFilterCreateData;
import com.datadog.api.client.v2.model.RUMRetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RUMRetentionFilterEventType;
import com.datadog.api.client.v2.model.RUMRetentionFilterResponse;
import com.datadog.api.client.v2.model.RUMRetentionFilterType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RUMRetentionFilterCreateRequest body =
        new RUMRetentionFilterCreateRequest()
            .data(
                new RUMRetentionFilterCreateData()
                    .type(RUMRetentionFilterType.RETENTION_FILTERS)
                    .attributes(
                        new RUMRetentionFilterCreateAttributes()
                            .name("Test creating retention filter")
                            .eventType(RUMRetentionFilterEventType.SESSION)
                            .query("custom_query")
                            .sampleRate(50.0)
                            .enabled(true)));

    try {
      RUMRetentionFilterResponse result =
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
