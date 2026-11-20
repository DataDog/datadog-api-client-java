// Update a RUM retention filter returns "Updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RUMRetentionFilterEventType;
import com.datadog.api.client.v2.model.RUMRetentionFilterResponse;
import com.datadog.api.client.v2.model.RUMRetentionFilterType;
import com.datadog.api.client.v2.model.RUMRetentionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.RUMRetentionFilterUpdateData;
import com.datadog.api.client.v2.model.RUMRetentionFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RUMRetentionFilterUpdateRequest body =
        new RUMRetentionFilterUpdateRequest()
            .data(
                new RUMRetentionFilterUpdateData()
                    .id("4b95d361-f65d-4515-9824-c9aaeba5ac2a")
                    .type(RUMRetentionFilterType.RETENTION_FILTERS)
                    .attributes(
                        new RUMRetentionFilterUpdateAttributes()
                            .name("Test updating retention filter")
                            .eventType(RUMRetentionFilterEventType.VIEW)
                            .query("view_query")
                            .sampleRate(100.0)
                            .enabled(true)));

    try {
      RUMRetentionFilterResponse result =
          apiInstance.updateRetentionFilter(
              "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690", "4b95d361-f65d-4515-9824-c9aaeba5ac2a", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#updateRetentionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
